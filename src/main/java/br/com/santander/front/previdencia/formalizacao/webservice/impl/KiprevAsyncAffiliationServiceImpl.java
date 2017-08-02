package br.com.santander.front.previdencia.formalizacao.webservice.impl;

import java.net.MalformedURLException;

import org.springframework.stereotype.Component;

import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.AdesaoAsyncStillProcessingException;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.AdesaoAsyncValidationException;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.BusinessException;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.BusinessWSSException;
import br.com.santander.front.previdencia.formalizacao.webservice.handlers.SecuritySoapHandlerResolver;
import br.com.santander.front.previdencia.formalizacao.webservice.handlers.SecuritySoapUser;
import br.com.santander.front.previdencia.formalizacao.webservice.service.AsyncAffiliationService;
import br.com.santander.front.previdencia.formalizacao.webservice.service.AsyncAffiliationService_Service;
import br.com.santander.front.previdencia.formalizacao.webservice.service.KiprevAsyncAffiliationService;

/**
 * Classe que implenta a interface KiprevAffiliationService
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class KiprevAsyncAffiliationServiceImpl implements KiprevAsyncAffiliationService {

	// private static final String VALIDATION_ERROR_ERRCODE = "E03";
	private static final String STILL_PROCESSING_ERRORCODE = "E05";
	// /**
	// * Declara��o das vai�veis membro
	// */
	//
	// private String wsdlLocation;
	// private String namespace;
	// private String serviceName;
	// private String portName;

	private SecuritySoapUser securitySoapUser;
	// private static final Logger logger =
	// LoggerFactory.getLogger(KiprevAsyncAffiliationServiceImpl.class);

	/**
	 * Construtor default da classe
	 */

	public KiprevAsyncAffiliationServiceImpl() {

	}

	// /**
	// * @param wsdlLocation
	// * the wsdlLocation to set
	// */
	//
	// public void setWsdlLocation(String wsdlLocation) {
	// this.wsdlLocation = wsdlLocation;
	// }
	//
	// /**
	// * @param namespace
	// * the namespace to set
	// */
	//
	// public void setNamespace(String namespace) {
	// this.namespace = namespace;
	// }
	//
	// /**
	// * @param serviceName
	// * the serviceName to set
	// */
	//
	// public void setServiceName(String serviceName) {
	// this.serviceName = serviceName;
	// }
	//
	// /**
	// * @param portName
	// * the portName to set
	// */
	//
	// public void setPortName(String portName) {
	// this.portName = portName;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.altec.bsbr.app.ox.service.KiprevAffiliationService#
	 * setSecuritySoapUser(com.altec.bsbr
	 * .app.ox.webclient.handlers.SecuritySoapUser)
	 */

	public void setSecuritySoapUser(SecuritySoapUser securitySoapUser) {
		this.securitySoapUser = securitySoapUser;
	}

	/**
	 * Obtem o port para o servi�o
	 * 
	 * @throws MalformedURLException
	 * 
	 * @throws BusinessException
	 */

	private AsyncAffiliationService getServicePort() {
		AsyncAffiliationService_Service service;
		AsyncAffiliationService servicePort;
		service = new AsyncAffiliationService_Service();
		service.setHandlerResolver(new SecuritySoapHandlerResolver(securitySoapUser));
		servicePort = service.getAsyncAffiliationImplPort();
		return servicePort;
	}

	/**
	 * Método irá acesssar o serviço no WEBLOGIC.
	 */
	public String asyncAffiliationProposal(Affiliation affiliation) {
		String namespace = "";
		try {
			namespace = getServicePort().asyncAffiliationProposal(affiliation);
		} catch (BusinessWSSException e) {

		}
		return namespace;
	}

	public Affiliation getAsyncAffiliationProposalResult(String asyncId)
			throws AdesaoAsyncStillProcessingException, AdesaoAsyncValidationException {
		Affiliation asyn;
		try {
			asyn = getServicePort().getAsyncAffiliationProposalResult(asyncId);
		} catch (BusinessWSSException e) {
			String errcode = e.getFaultInfo().getErrorCode();
			if (STILL_PROCESSING_ERRORCODE.equals(errcode)) {
				throw new AdesaoAsyncStillProcessingException("Ainda processando...", e);
			} else {
				throw new AdesaoAsyncValidationException(
						e.getFaultInfo().getAdditionalInfos().get(0).getErrorDescription(), e);
			}
		}
		return asyn;
	}
}