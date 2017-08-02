
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAsyncAffiliationProposalResult", namespace = "http://ade.service.kiprev.kiman.com.br/", propOrder = {
    "asyncId"
})
public class GetAsyncAffiliationProposalResult {

    protected String asyncId;

    /**
     * Obt�m o valor da propriedade asyncId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncId() {
        return asyncId;
    }

    /**
     * Define o valor da propriedade asyncId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncId(String value) {
        this.asyncId = value;
    }

}
