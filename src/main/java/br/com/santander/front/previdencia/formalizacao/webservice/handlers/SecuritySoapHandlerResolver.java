package br.com.santander.front.previdencia.formalizacao.webservice.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * Handler resolver de seguran�a dos web services
 * 
 * @author Marco Aur�lio Principe Gon�alves
 */

public class SecuritySoapHandlerResolver implements HandlerResolver {

    /**
     * Declara��o das vari�veis membro
     */

    private SecuritySoapUser securitySoapUser;

    /**
     * Construtor alternativo da classe
     * 
     * @param securitySoapUser
     */

    public SecuritySoapHandlerResolver(SecuritySoapUser securitySoapUser) {
        super();
        this.securitySoapUser = securitySoapUser;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.ws.handler.HandlerResolver#getHandlerChain(javax.xml.ws.handler.PortInfo)
     */

    @SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<>();
        SecuritySoapHandler handler = new SecuritySoapHandler(securitySoapUser);
        handlerChain.add(handler);
        return handlerChain;

    }

}
