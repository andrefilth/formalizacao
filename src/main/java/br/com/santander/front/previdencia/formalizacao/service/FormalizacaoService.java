package br.com.santander.front.previdencia.formalizacao.service;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Base64;

import br.com.santander.front.previdencia.formalizacao.convert.AffiliationConvertNO;
import br.com.santander.front.previdencia.formalizacao.core.ConversorXml;
import br.com.santander.front.previdencia.formalizacao.core.DadosResponseMobileXml;
import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.resource.GetFormalizaRequest;
import br.com.santander.front.previdencia.formalizacao.resource.GetFormalizaResponse;
import br.com.santander.front.previdencia.formalizacao.webservice.business.WebServiceClient;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.BusinessException;
import br.com.santander.front.previdencia.simulacao.model.entity.Retorno;

/**
 * <p>
 * Classe de serviço que irá receber dados do contrato do WEBLOGIC
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */

@Service
public class FormalizacaoService {

	private static final String RAIZ = "affiliation";

	@Autowired
	private ConversorXml xml;

	@Autowired
	private AffiliationConvertNO aff;

	@Autowired
	private WebServiceClient webLogic;

	@Autowired
	private DadosResponseMobileXml mobile;

	private Affiliation affiliationResult;

	private static Logger logger = Logger.getLogger(FormalizacaoService.class);

	public GetFormalizaResponse findFormalizacao(GetFormalizaRequest request) throws Exception {
		GetFormalizaResponse response = new GetFormalizaResponse();
		//decodificar base 64
		String encoded =  request.getImperativaContratacao();
		String decoded = new String(Base64.getDecoder().decode(encoded),"UTF-8");
						
		org.w3c.dom.Document documentoXml = xml.extrairXmlRequest(decoded);

		final Affiliation affiliation = this.aff.findNoAffiliation(documentoXml, RAIZ);

		final String securitySoap = this.aff.findNoSecuritySoap(documentoXml, RAIZ);

		String proposal = this.webLogic.consultarAsyncAffiliationProposal(affiliation, securitySoap);
//		proposal = "8c66c429-d649-4e5b-945c-10aacf6d46b0";
		if (!proposal.isEmpty()) {
			logger.info("Existe valor em Proposal ? " + !proposal.isEmpty());
			affiliationResult = this.webLogic.verificaResultado(proposal.trim());
		}
		if(affiliationResult == null) {
			Retorno retorno = new Retorno("003", "Foram realizados 30 tentativas de buscar formalização sem sucesso !!!");
			response.setRetorno(retorno);
			throw new BusinessException(retorno);
		}
		response = this.montarResponse(affiliationResult,
				affiliation.getInitialPayment().getPaymentDate(), affiliation.getInitialPayment().getPaymentDay());
		return response;

	}

	private GetFormalizaResponse montarResponse(Affiliation affiliationResult, XMLGregorianCalendar paymentDate, Integer day) {
		GetFormalizaResponse response = new GetFormalizaResponse();

		String campoDadosMobile = this.mobile.concatenaCampoDadosMobile(affiliationResult, paymentDate, day);
		String campoDisclaimer = this.mobile.concatenaCampoDadosDisclaimer();
		String campoDadosProduto = this.mobile.concatenaCampoDadosProduto(affiliationResult,paymentDate);
		String codigoAdesao = String.valueOf(affiliationResult.getAffiliationId());
		String codigoCertificado = affiliationResult.getAccountId();
		
		response.setDadosMobile(campoDadosMobile);
		response.setDisclaimer(campoDisclaimer);
		response.setDadosProduto(campoDadosProduto);
		response.setCodigoAdesao(codigoAdesao);
		response.setCodigoCertificado(codigoCertificado);
		response.setRetorno(new Retorno("001", "Retorno do serviço realizado com sucesso !!!"));

		return response;
		// TODO Auto-generated method stub

	}

}
