
package br.com.santander.front.previdencia.formalizacao.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;


/**
 * <p>Classe Java de asyncAffiliationProposal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="asyncAffiliationProposal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="affiliation" type="{http://kiman.com.br/kiprev/canonical}Affiliation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asyncAffiliationProposal", namespace = "http://ade.service.kiprev.kiman.com.br/", propOrder = {
    "affiliation"
})
public class AsyncAffiliationProposal {

    protected Affiliation affiliation;

    /**
     * Obt�m o valor da propriedade affiliation.
     * 
     * @return
     *     possible object is
     *     {@link Affiliation }
     *     
     */
    public Affiliation getAffiliation() {
        return affiliation;
    }

    /**
     * Define o valor da propriedade affiliation.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliation }
     *     
     */
    public void setAffiliation(Affiliation value) {
        this.affiliation = value;
    }

}
