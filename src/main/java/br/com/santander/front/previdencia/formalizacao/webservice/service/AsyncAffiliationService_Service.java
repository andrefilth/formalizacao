//package br.com.santander.front.previdencia.formalizacao.service;
//
//import java.net.URL;
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//
///**
// * This class was generated by the Kiman Wsdl-Importer Ant script
// */
//public class AsyncAffiliationService_Service extends Service {
//	/**
//	 * Construtor alternativo da classe
//	 * 
//	 * @param wsdlLocation
//	 * @param serviceName
//	 */
//	public AsyncAffiliationService_Service(URL wsdlLocation, QName serviceName) {
//		super(wsdlLocation, serviceName);
//	}
//
//	/**
//	 * 
//	 * @return returns AsyncAffiliationService
//	 */
//	public AsyncAffiliationService getPort(QName portName) {
//		return super.getPort(portName, AsyncAffiliationService.class);
//	}
//}

package br.com.santander.front.previdencia.formalizacao.webservice.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "AsyncAffiliationService"
	, wsdlLocation = AsyncAffiliationService_Service.WSDL
	, targetNamespace = "http://kiman.com.br/kiprev/service/ade")
public class AsyncAffiliationService_Service extends Service {

//	private static final String WSDL_PI = "http://portalweblogicpi.sb:7001/kiprev-ws/ade/AsyncAffiliationService?WSDL";
	private static final String WSDL_HML = "http://portalweblogichml.sb:7001/kiprev-ws/ade/AsyncAffiliationService?WSDL";
//	private static final String WSDL_PRD = "http://portalweblogic.sb:7001/kiprev-ws/ade/AsyncAffiliationService?WSDL";
	protected static final String WSDL = WSDL_HML;

	public final static URL WSDL_LOCATION;
	public final static String URL = WSDL;

	public final static QName SERVICE = new QName("http://kiman.com.br/kiprev/service/ade", "AsyncAffiliationService");
	public final static QName AsyncAffiliationImplPort = new QName("http://kiman.com.br/kiprev/service/ade",
			"AsyncAffiliationImplPort");
	static {
		URL url = null;
		try {
			url = new URL(URL);
		} catch (MalformedURLException e) {
			java.util.logging.Logger.getLogger(AsyncAffiliationService_Service.class.getName())
					.log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", URL);
		}
		WSDL_LOCATION = url;
	}

	/**
	 *
	 * @return returns AsyncAffiliationService
	 */
	public AsyncAffiliationService getPort(QName portName) {
		return super.getPort(portName, AsyncAffiliationService.class);
	}

	public AsyncAffiliationService_Service(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public AsyncAffiliationService_Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public AsyncAffiliationService_Service() {
		super(WSDL_LOCATION, SERVICE);
	}

	public AsyncAffiliationService_Service(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	public AsyncAffiliationService_Service(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	public AsyncAffiliationService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return returns AsyncAffiliationService
	 */
	@WebEndpoint(name = "AsyncAffiliationImplPort")
	public AsyncAffiliationService getAsyncAffiliationImplPort() {
		return super.getPort(AsyncAffiliationImplPort, AsyncAffiliationService.class);
	}

	/**
	 *
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns AsyncAffiliationService
	 */
	@WebEndpoint(name = "AsyncAffiliationImplPort")
	public AsyncAffiliationService getAsyncAffiliationImplPort(WebServiceFeature... features) {
		return super.getPort(AsyncAffiliationImplPort, AsyncAffiliationService.class, features);
	}

}
