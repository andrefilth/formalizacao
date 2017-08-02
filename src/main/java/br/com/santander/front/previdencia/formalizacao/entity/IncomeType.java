
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeType", propOrder = {
    "incomeType",
    "description",
    "desiredTermRequired",
    "reversionPctRequired",
    "beneficiaryBirthDateRequired",
    "beneficiarySexRequired",
    "youngestBirthDateRequired",
    "youngestSexRequired",
    "minimumDesiredTerm",
    "maximumDesiredTerm",
    "minimumReversionPct",
    "maximumReversionPct",
    "isDefault",
    "isVisibleInAffiliation",
    "isVisibleInAffiliationSimulation"
})
public class IncomeType {

    protected Integer incomeType;
    protected String description;
    protected Boolean desiredTermRequired;
    protected Boolean reversionPctRequired;
    protected Boolean beneficiaryBirthDateRequired;
    protected Boolean beneficiarySexRequired;
    protected Boolean youngestBirthDateRequired;
    protected Boolean youngestSexRequired;
    protected Integer minimumDesiredTerm;
    protected Integer maximumDesiredTerm;
    protected Double minimumReversionPct;
    protected Double maximumReversionPct;
    protected Boolean isDefault;
    protected Boolean isVisibleInAffiliation;
    protected Boolean isVisibleInAffiliationSimulation;

    /**
     * Obt�m o valor da propriedade incomeType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncomeType() {
        return incomeType;
    }

    /**
     * Define o valor da propriedade incomeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncomeType(Integer value) {
        this.incomeType = value;
    }

    /**
     * Obt�m o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obt�m o valor da propriedade desiredTermRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDesiredTermRequired() {
        return desiredTermRequired;
    }

    /**
     * Define o valor da propriedade desiredTermRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesiredTermRequired(Boolean value) {
        this.desiredTermRequired = value;
    }

    /**
     * Obt�m o valor da propriedade reversionPctRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversionPctRequired() {
        return reversionPctRequired;
    }

    /**
     * Define o valor da propriedade reversionPctRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversionPctRequired(Boolean value) {
        this.reversionPctRequired = value;
    }

    /**
     * Obt�m o valor da propriedade beneficiaryBirthDateRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeneficiaryBirthDateRequired() {
        return beneficiaryBirthDateRequired;
    }

    /**
     * Define o valor da propriedade beneficiaryBirthDateRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeneficiaryBirthDateRequired(Boolean value) {
        this.beneficiaryBirthDateRequired = value;
    }

    /**
     * Obt�m o valor da propriedade beneficiarySexRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeneficiarySexRequired() {
        return beneficiarySexRequired;
    }

    /**
     * Define o valor da propriedade beneficiarySexRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeneficiarySexRequired(Boolean value) {
        this.beneficiarySexRequired = value;
    }

    /**
     * Obt�m o valor da propriedade youngestBirthDateRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYoungestBirthDateRequired() {
        return youngestBirthDateRequired;
    }

    /**
     * Define o valor da propriedade youngestBirthDateRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYoungestBirthDateRequired(Boolean value) {
        this.youngestBirthDateRequired = value;
    }

    /**
     * Obt�m o valor da propriedade youngestSexRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYoungestSexRequired() {
        return youngestSexRequired;
    }

    /**
     * Define o valor da propriedade youngestSexRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYoungestSexRequired(Boolean value) {
        this.youngestSexRequired = value;
    }

    /**
     * Obt�m o valor da propriedade minimumDesiredTerm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumDesiredTerm() {
        return minimumDesiredTerm;
    }

    /**
     * Define o valor da propriedade minimumDesiredTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumDesiredTerm(Integer value) {
        this.minimumDesiredTerm = value;
    }

    /**
     * Obt�m o valor da propriedade maximumDesiredTerm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumDesiredTerm() {
        return maximumDesiredTerm;
    }

    /**
     * Define o valor da propriedade maximumDesiredTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumDesiredTerm(Integer value) {
        this.maximumDesiredTerm = value;
    }

    /**
     * Obt�m o valor da propriedade minimumReversionPct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumReversionPct() {
        return minimumReversionPct;
    }

    /**
     * Define o valor da propriedade minimumReversionPct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumReversionPct(Double value) {
        this.minimumReversionPct = value;
    }

    /**
     * Obt�m o valor da propriedade maximumReversionPct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumReversionPct() {
        return maximumReversionPct;
    }

    /**
     * Define o valor da propriedade maximumReversionPct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumReversionPct(Double value) {
        this.maximumReversionPct = value;
    }

    /**
     * Obt�m o valor da propriedade isDefault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Define o valor da propriedade isDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Obt�m o valor da propriedade isVisibleInAffiliation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVisibleInAffiliation() {
        return isVisibleInAffiliation;
    }

    /**
     * Define o valor da propriedade isVisibleInAffiliation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisibleInAffiliation(Boolean value) {
        this.isVisibleInAffiliation = value;
    }

    /**
     * Obt�m o valor da propriedade isVisibleInAffiliationSimulation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVisibleInAffiliationSimulation() {
        return isVisibleInAffiliationSimulation;
    }

    /**
     * Define o valor da propriedade isVisibleInAffiliationSimulation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisibleInAffiliationSimulation(Boolean value) {
        this.isVisibleInAffiliationSimulation = value;
    }

}
