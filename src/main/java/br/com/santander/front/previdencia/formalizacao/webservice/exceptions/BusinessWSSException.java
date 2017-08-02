
package br.com.santander.front.previdencia.formalizacao.webservice.exceptions;

import javax.xml.ws.WebFault;

import br.com.santander.front.previdencia.formalizacao.entity.FaultInfo;



@WebFault(name = "BusinesWSException", targetNamespace = "http://kiman.com.br/kiprev/service/exception")
public class BusinessWSSException
    extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public BusinessWSSException(String message, FaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BusinessWSSException(String message, FaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.altec.bsbr.app.kpv.webclient.canonical.FaultInfo
     */
    public FaultInfo getFaultInfo() {
        return faultInfo;
    }

}
