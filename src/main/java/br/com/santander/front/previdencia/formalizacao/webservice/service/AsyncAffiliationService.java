package br.com.santander.front.previdencia.formalizacao.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.entity.ObjectFactory;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.BusinessWSSException;


/**
 * <p>
 * Classe que contém os métodos da chamada do WEBLOGIC
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2018
 */
@WebService(targetNamespace = "http://ade.service.kiprev.kiman.com.br/", name = "AsyncAffiliationService")
@XmlSeeAlso({ ObjectFactory.class })
public interface AsyncAffiliationService {

	@WebMethod
	@RequestWrapper(localName = "getAsyncAffiliationProposalResult", targetNamespace = "http://ade.service.kiprev.kiman.com.br/", className = "br.com.santander.front.previdencia.formalizacao.entity.GetAsyncAffiliationProposalResult")
	@ResponseWrapper(localName = "getAsyncAffiliationProposalResultResponse", targetNamespace = "http://ade.service.kiprev.kiman.com.br/", className = "br.com.santander.front.previdencia.formalizacao.entity.GetAsyncAffiliationProposalResultResponse")
	@WebResult(name = "return", targetNamespace = "")
	public Affiliation getAsyncAffiliationProposalResult(
			@WebParam(name = "asyncId", targetNamespace = "") String asyncId) throws BusinessWSSException;

	@WebMethod
	@RequestWrapper(localName = "asyncAffiliationProposal", targetNamespace = "http://ade.service.kiprev.kiman.com.br/", className = "br.com.santander.front.previdencia.formalizacao.entity.AsyncAffiliationProposal")
	@ResponseWrapper(localName = "asyncAffiliationProposalResponse", targetNamespace = "http://ade.service.kiprev.kiman.com.br/", className = "br.com.santander.front.previdencia.formalizacao.entity.AsyncAffiliationProposalResponse")
	@WebResult(name = "return", targetNamespace = "")
	public String asyncAffiliationProposal(
			@WebParam(name = "affiliation", targetNamespace = "") Affiliation affiliation) throws BusinessWSSException;
}
