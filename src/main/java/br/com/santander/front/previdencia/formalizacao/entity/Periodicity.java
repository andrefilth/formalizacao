
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.santander.front.previdencia.formalizacao.type.PeriodicityValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periodicity", propOrder = {
    "periodicityType",
    "quantity"
})
public class Periodicity {

    @XmlSchemaType(name = "string")
    protected PeriodicityValue periodicityType;
    protected Integer quantity;

    /**
     * Obt�m o valor da propriedade periodicityType.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicityValue }
     *     
     */
    public PeriodicityValue getPeriodicityType() {
        return periodicityType;
    }

    /**
     * Define o valor da propriedade periodicityType.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicityValue }
     *     
     */
    public void setPeriodicityType(PeriodicityValue value) {
        this.periodicityType = value;
    }

    /**
     * Obt�m o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

}
