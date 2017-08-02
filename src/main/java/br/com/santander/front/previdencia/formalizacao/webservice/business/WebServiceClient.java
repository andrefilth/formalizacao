package br.com.santander.front.previdencia.formalizacao.webservice.business;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.utils.DatasUtil;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.BusinessException;
import br.com.santander.front.previdencia.formalizacao.webservice.handlers.SecuritySoapUser;
import br.com.santander.front.previdencia.formalizacao.webservice.service.KiprevAsyncAffiliationService;

/**
 * Interface de comunicação entre o Spring boot e o Serviço do WebLogic
 * 
 * @author André Franco
 * @since 06/2017
 */
@Component
public class WebServiceClient {

	private static Logger logger = Logger.getLogger(WebServiceClient.class);

	@Autowired
	private KiprevAsyncAffiliationService asyncAffiliationService;

	/**
	 * Acessa o WebLogic para pegar o código da proposta
	 * 
	 * @param Affiliation
	 *            affiliation
	 * @param String
	 *            securitySoap
	 * @return String proposal
	 */
	public String consultarAsyncAffiliationProposal(Affiliation affiliation, String securitySoap) {
		String proposal = "";
		this.registraUsuarioSOAP(securitySoap);

		try {
			proposal = this.asyncAffiliationService.asyncAffiliationProposal(affiliation);
		} catch (BusinessException e) {
			String msg = "Não foi possível consultar servidor do WebLogic";
			logger.info(msg + e);
			// throw new BusinessException(msg, e);
		} catch (IllegalStateException e) {
			logger.error("Error: " + e);
			throw new RuntimeException("Falha");
		}

		logger.info("proposal: " + proposal);
		return proposal;
	}

	/**
	 * Método que adiciona no contexto do HEAD do SOAP do Weblogic o usuário e
	 * senha de acesso.
	 * 
	 * @param securitySoap
	 */
	private void registraUsuarioSOAP(String securitySoap) {
		SecuritySoapUser securitySoapUser = new SecuritySoapUser();

		securitySoapUser.setUserName(securitySoap);
		securitySoapUser.setPassword(securitySoap);
		if (asyncAffiliationService != null) {
			this.asyncAffiliationService.setSecuritySoapUser(securitySoapUser);
		}
	}

	/**
	 * Método que chama o o serviço do WEBLOGIC, a cada 0,5 segundos, por 90
	 * vezes até que o resultado seja obtido.
	 * 
	 * @throws InterruptedException
	 */
	public Affiliation verificaResultado(String proposal) throws InterruptedException {
		Affiliation result;
		int contador = 1;
		do {
			Thread.sleep(500);
			try {
				result = this.asyncAffiliationService.getAsyncAffiliationProposalResult(proposal);
				if (result instanceof Affiliation) {
					return result;
				}
				contador++;
				logger.info("Método buscando dados de formalização: ");
				logger.info("Tentativa: " + contador);
				logger.info("Tempo: " + DatasUtil.getDataAtual());
			} catch (Exception e) {
				String message = e.getMessage();
				throw new RuntimeException("Falha no serviço:  " + message);
			}

		} while (contador <= 90);
		return result;

	}

}
