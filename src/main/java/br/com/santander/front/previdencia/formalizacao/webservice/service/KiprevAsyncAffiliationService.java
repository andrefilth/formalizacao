package br.com.santander.front.previdencia.formalizacao.webservice.service;

import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.webservice.exceptions.BusinessException;
import br.com.santander.front.previdencia.formalizacao.webservice.handlers.SecuritySoapUser;

/**
 * Interface para implementa��o dos servi�os de ades�o da KiPrev
 * 
 * @author Cesar.Pereira
 */


public interface KiprevAsyncAffiliationService {

    /**
     * Define o usu�rio e senha de seguran�a Kiprev
     * 
     * @param securitySoapUser
     */

    public void setSecuritySoapUser(SecuritySoapUser securitySoapUser);

    /**
     * M�todo para efetivar a ades�o de uma proposta no sistema Kiprev
     * 
     * @param affiliation
     * 
     * @return
     * 
     * @throws BusinessException
     */

    public String asyncAffiliationProposal(Affiliation affiliation) throws BusinessException;

    public Affiliation getAsyncAffiliationProposalResult(String asyncId) throws BusinessException;

}
