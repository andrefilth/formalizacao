
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.type.MovimentType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement", propOrder = {
    "operationDate",
    "fundId",
    "fundDescription",
    "planDescription",
    "reserveDescription",
    "movimentValue",
    "movimentType",
    "certificate",
    "transactionDescription",
    "legalIdentifier",
    "quotaValue",
    "movimentQuantityQuote"
})
public class Statement {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDate;
    protected String fundId;
    protected String fundDescription;
    protected String planDescription;
    protected String reserveDescription;
    protected Double movimentValue;
    @XmlSchemaType(name = "string")
    protected MovimentType movimentType;
    protected Certificate certificate;
    protected String transactionDescription;
    protected String legalIdentifier;
    protected Double quotaValue;
    protected Double movimentQuantityQuote;

    /**
     * Obt�m o valor da propriedade operationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Define o valor da propriedade operationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

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
     * Obt�m o valor da propriedade movimentValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMovimentValue() {
        return movimentValue;
    }

    /**
     * Define o valor da propriedade movimentValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMovimentValue(Double value) {
        this.movimentValue = value;
    }

    /**
     * Obt�m o valor da propriedade movimentType.
     * 
     * @return
     *     possible object is
     *     {@link MovimentType }
     *     
     */
    public MovimentType getMovimentType() {
        return movimentType;
    }

    /**
     * Define o valor da propriedade movimentType.
     * 
     * @param value
     *     allowed object is
     *     {@link MovimentType }
     *     
     */
    public void setMovimentType(MovimentType value) {
        this.movimentType = value;
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
     * Obt�m o valor da propriedade transactionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Define o valor da propriedade transactionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Obt�m o valor da propriedade legalIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalIdentifier() {
        return legalIdentifier;
    }

    /**
     * Define o valor da propriedade legalIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalIdentifier(String value) {
        this.legalIdentifier = value;
    }

    /**
     * Obt�m o valor da propriedade quotaValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuotaValue() {
        return quotaValue;
    }

    /**
     * Define o valor da propriedade quotaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuotaValue(Double value) {
        this.quotaValue = value;
    }

    /**
     * Obt�m o valor da propriedade movimentQuantityQuote.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMovimentQuantityQuote() {
        return movimentQuantityQuote;
    }

    /**
     * Define o valor da propriedade movimentQuantityQuote.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMovimentQuantityQuote(Double value) {
        this.movimentQuantityQuote = value;
    }

}
