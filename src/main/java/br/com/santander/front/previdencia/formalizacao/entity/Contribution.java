
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.santander.front.previdencia.formalizacao.type.ContributionCategory;
import br.com.santander.front.previdencia.formalizacao.type.ContributionOrigin;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contribution", propOrder = {
    "contributionType",
    "contributionName",
    "incomeFee",
    "contributionOrigin",
    "contributionCategory",
    "payment",
    "reserve",
    "periodicity",
    "status"
})
public class Contribution {

    protected String contributionType;
    protected String contributionName;
    protected ParameterizedValue incomeFee;
    @XmlSchemaType(name = "string")
    protected ContributionOrigin contributionOrigin;
    @XmlSchemaType(name = "string")
    protected ContributionCategory contributionCategory;
    protected Payment payment;
    protected Reserve reserve;
    protected Periodicity periodicity;
    protected String status;

    /**
     * Obt�m o valor da propriedade contributionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributionType() {
        return contributionType;
    }

    /**
     * Define o valor da propriedade contributionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributionType(String value) {
        this.contributionType = value;
    }

    /**
     * Obt�m o valor da propriedade contributionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributionName() {
        return contributionName;
    }

    /**
     * Define o valor da propriedade contributionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributionName(String value) {
        this.contributionName = value;
    }

    /**
     * Obt�m o valor da propriedade incomeFee.
     * 
     * @return
     *     possible object is
     *     {@link ParameterizedValue }
     *     
     */
    public ParameterizedValue getIncomeFee() {
        return incomeFee;
    }

    /**
     * Define o valor da propriedade incomeFee.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterizedValue }
     *     
     */
    public void setIncomeFee(ParameterizedValue value) {
        this.incomeFee = value;
    }

    /**
     * Obt�m o valor da propriedade contributionOrigin.
     * 
     * @return
     *     possible object is
     *     {@link ContributionOrigin }
     *     
     */
    public ContributionOrigin getContributionOrigin() {
        return contributionOrigin;
    }

    /**
     * Define o valor da propriedade contributionOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionOrigin }
     *     
     */
    public void setContributionOrigin(ContributionOrigin value) {
        this.contributionOrigin = value;
    }

    /**
     * Obt�m o valor da propriedade contributionCategory.
     * 
     * @return
     *     possible object is
     *     {@link ContributionCategory }
     *     
     */
    public ContributionCategory getContributionCategory() {
        return contributionCategory;
    }

    /**
     * Define o valor da propriedade contributionCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionCategory }
     *     
     */
    public void setContributionCategory(ContributionCategory value) {
        this.contributionCategory = value;
    }

    /**
     * Obt�m o valor da propriedade payment.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Define o valor da propriedade payment.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Obt�m o valor da propriedade reserve.
     * 
     * @return
     *     possible object is
     *     {@link Reserve }
     *     
     */
    public Reserve getReserve() {
        return reserve;
    }

    /**
     * Define o valor da propriedade reserve.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserve }
     *     
     */
    public void setReserve(Reserve value) {
        this.reserve = value;
    }

    /**
     * Obt�m o valor da propriedade periodicity.
     * 
     * @return
     *     possible object is
     *     {@link Periodicity }
     *     
     */
    public Periodicity getPeriodicity() {
        return periodicity;
    }

    /**
     * Define o valor da propriedade periodicity.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodicity }
     *     
     */
    public void setPeriodicity(Periodicity value) {
        this.periodicity = value;
    }

    /**
     * Obt�m o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
