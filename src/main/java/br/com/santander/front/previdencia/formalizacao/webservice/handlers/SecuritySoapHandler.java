package br.com.santander.front.previdencia.formalizacao.webservice.handlers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handler de seguran�a SOAP
 * 
 * @author Marco Aur�lio Principe Gon�alves
 */

public class SecuritySoapHandler implements SOAPHandler<SOAPMessageContext> {

    /**
     * Declara��o do logger
     */

    private static final Logger logger = LoggerFactory.getLogger(SecuritySoapHandler.class);

    /**
     * Declara��o das vari�veis membro
     */

    private SecuritySoapUser securitySoapUser;

    /**
     * Construtor alternativo da classe
     * 
     * @param securitySoapUser
     */

    public SecuritySoapHandler(SecuritySoapUser securitySoapUser) {

        super();

        this.securitySoapUser = securitySoapUser;

    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.ws.handler.soap.SOAPHandler#getHeaders()
     */

    public Set<QName> getHeaders() {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.ws.handler.Handler#close(javax.xml.ws.handler.MessageContext)
     */

    public void close(MessageContext context) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.ws.handler.Handler#handleFault(javax.xml.ws.handler.MessageContext)
     */

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.ws.handler.Handler#handleMessage(javax.xml.ws.handler.MessageContext)
     */

    public boolean handleMessage(SOAPMessageContext context) {

        SOAPMessage message = null;
        SOAPEnvelope envelope = null;
        SOAPHeader header = null;

        try {

            Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

            message = context.getMessage();
            envelope = message.getSOAPPart().getEnvelope();
            header = message.getSOAPHeader();
            if (isRequest) {
                if (header == null) {
                    header = envelope.addHeader();
                }

                SOAPElement security = header.addChildElement("Security", "wsse",
                    "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                SOAPElement userNameToken = security.addChildElement("UsernameToken", "wsse");
                SOAPElement userName = userNameToken.addChildElement("Username", "wsse");
                userName.addTextNode(securitySoapUser.getUserName());
                SOAPElement password = userNameToken.addChildElement("Password", "wsse");
                password.addTextNode(securitySoapUser.getPassword());

                message.saveChanges();

               //if (logger.isDebugEnabled()) {
                    logMessage("REQUEST : ", message);
               // }
             }
            else {

                //if (logger.isDebugEnabled()) {
                    logMessage("RESPONSE : ", message);
                //}

            }

        }
        catch (SOAPException ex) {

            logger.error("Falha ao adicionar o header da mensagem SOAP", ex);

        }

        return true;

    }

    /**
     * M�todo para logar as mensagens SOAP enviadas e recebidas
     * 
     * @param type
     * 
     * @param message
     */

    private void logMessage(String type, SOAPMessage message) {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {

            message.writeTo(bos);

            logger.error(type + " ==>> " + bos.toString());

        }
        catch (SOAPException ex) {

            logger.error("Falha ao logar da mensagem SOAP.", ex);

        }
        catch (IOException ex) {

            logger.error("Falha ao logar da mensagem SOAP.", ex);

        }
        finally {

            try {

                bos.close();

            }
            catch (IOException ex) {
            }

        }

    }

}
