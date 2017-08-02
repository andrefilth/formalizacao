
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Balance", propOrder = {
    "fundId",
    "fundDescription",
    "planDescription",
    "reserveDescription",
    "disclosureName",
    "ammountBalanceQuota",
    "fundType",
    "paymentType",
    "valueBalanceValue",
    "valueInitialBalance",
    "valueFinalBalance",
    "certificate",
    "productDescription",
    "benefitDescription",
    "incomeTypeDescription",
    "initialQuotaValue",
    "finalQuotaValue"
})
public class Balance {

    protected String fundId;
    protected String fundDescription;
    protected String planDescription;
    protected String reserveDescription;
    protected String disclosureName;
    protected Double ammountBalanceQuota;
    protected String fundType;
    protected Integer paymentType;
    protected Double valueBalanceValue;
    protected Double valueInitialBalance;
    protected Double valueFinalBalance;
    protected Certificate certificate;
    protected String productDescription;
    protected String benefitDescription;
    protected String incomeTypeDescription;
    protected Double initialQuotaValue;
    protected Double finalQuotaValue;

    /**
     * Obt�m o valor da propriedade fundId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * Define o valor da propriedade fundId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundId(String value) {
        this.fundId = value;
    }

    /**
     * Obt�m o valor da propriedade fundDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundDescription() {
        return fundDescription;
    }

    /**
     * Define o valor da propriedade fundDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundDescription(String value) {
        this.fundDescription = value;
    }

    /**
     * Obt�m o valor da propriedade planDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Define o valor da propriedade planDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDescription(String value) {
        this.planDescription = value;
    }

    /**
     * Obt�m o valor da propriedade reserveDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveDescription() {
        return reserveDescription;
    }

    /**
     * Define o valor da propriedade reserveDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveDescription(String value) {
        this.reserveDescription = value;
    }

    /**
     * Obt�m o valor da propriedade disclosureName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureName() {
        return disclosureName;
    }

    /**
     * Define o valor da propriedade disclosureName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureName(String value) {
        this.disclosureName = value;
    }

    /**
     * Obt�m o valor da propriedade ammountBalanceQuota.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmmountBalanceQuota() {
        return ammountBalanceQuota;
    }

    /**
     * Define o valor da propriedade ammountBalanceQuota.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmmountBalanceQuota(Double value) {
        this.ammountBalanceQuota = value;
    }

    /**
     * Obt�m o valor da propriedade fundType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * Define o valor da propriedade fundType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundType(String value) {
        this.fundType = value;
    }

    /**
     * Obt�m o valor da propriedade paymentType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * Define o valor da propriedade paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentType(Integer value) {
        this.paymentType = value;
    }

    /**
     * Obt�m o valor da propriedade valueBalanceValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueBalanceValue() {
        return valueBalanceValue;
    }

    /**
     * Define o valor da propriedade valueBalanceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueBalanceValue(Double value) {
        this.valueBalanceValue = value;
    }

    /**
     * Obt�m o valor da propriedade valueInitialBalance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueInitialBalance() {
        return valueInitialBalance;
    }

    /**
     * Define o valor da propriedade valueInitialBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueInitialBalance(Double value) {
        this.valueInitialBalance = value;
    }

    /**
     * Obt�m o valor da propriedade valueFinalBalance.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValueFinalBalance() {
        return valueFinalBalance;
    }

    /**
     * Define o valor da propriedade valueFinalBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueFinalBalance(Double value) {
        this.valueFinalBalance = value;
    }

    /**
     * Obt�m o valor da propriedade certificate.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * Define o valor da propriedade certificate.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setCertificate(Certificate value) {
        this.certificate = value;
    }

    /**
     * Obt�m o valor da propriedade productDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Define o valor da propriedade productDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Obt�m o valor da propriedade benefitDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitDescription() {
        return benefitDescription;
    }

    /**
     * Define o valor da propriedade benefitDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitDescription(String value) {
        this.benefitDescription = value;
    }

    /**
     * Obt�m o valor da propriedade incomeTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeTypeDescription() {
        return incomeTypeDescription;
    }

    /**
     * Define o valor da propriedade incomeTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeTypeDescription(String value) {
        this.incomeTypeDescription = value;
    }

    /**
     * Obt�m o valor da propriedade initialQuotaValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialQuotaValue() {
        return initialQuotaValue;
    }

    /**
     * Define o valor da propriedade initialQuotaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialQuotaValue(Double value) {
        this.initialQuotaValue = value;
    }

    /**
     * Obt�m o valor da propriedade finalQuotaValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFinalQuotaValue() {
        return finalQuotaValue;
    }

    /**
     * Define o valor da propriedade finalQuotaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinalQuotaValue(Double value) {
        this.finalQuotaValue = value;
    }

}
