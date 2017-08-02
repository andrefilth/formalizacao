
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAsyncAffiliationProposalResultResponse", namespace = "http://ade.service.kiprev.kiman.com.br/", propOrder = {
    "_return"
})
public class GetAsyncAffiliationProposalResultResponse {

    @XmlElement(name = "return")
    protected Affiliation _return;

    /**
     * Obt�m o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link Affiliation }
     *     
     */
    public Affiliation getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliation }
     *     
     */
    public void setReturn(Affiliation value) {
        this._return = value;
    }

}
