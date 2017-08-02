
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.type.PaymentMethod;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "recoveryId",
    "recoveryChannelId",
    "paymentMethod",
    "invoiceExpirationDate",
    "invoicePaymentDate",
    "invoiceDescription",
    "invoiceRecoveryValue",
    "invoiceValue",
    "participantTotalValue",
    "participantPaidValue",
    "contributionId",
    "contributionOrigin",
    "inChargeName",
    "paymentMethodDescription",
    "periodicityDescription",
    "suspensionDate",
    "systemSituation",
    "portalSituation",
    "situationTitle",
    "bankAccountId",
    "bankAgencyNumber",
    "bankAccountNumber",
    "certificate",
    "fund",
    "reserve",
    "contributionType",
    "communicabilityInd",
    "communicabilityPaidValue"
})
public class Invoice {

    protected String recoveryId;
    protected Integer recoveryChannelId;
    @XmlSchemaType(name = "string")
    protected PaymentMethod paymentMethod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceExpirationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoicePaymentDate;
    protected String invoiceDescription;
    protected Double invoiceRecoveryValue;
    protected Double invoiceValue;
    protected Double participantTotalValue;
    protected Double participantPaidValue;
    protected String contributionId;
    protected String contributionOrigin;
    protected String inChargeName;
    protected String paymentMethodDescription;
    protected String periodicityDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suspensionDate;
    protected String systemSituation;
    protected String portalSituation;
    protected String situationTitle;
    protected String bankAccountId;
    protected String bankAgencyNumber;
    protected String bankAccountNumber;
    protected Certificate certificate;
    protected Fund fund;
    protected Reserve reserve;
    protected String contributionType;
    protected String communicabilityInd;
    protected Double communicabilityPaidValue;

    /**
     * Obt�m o valor da propriedade recoveryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoveryId() {
        return recoveryId;
    }

    /**
     * Define o valor da propriedade recoveryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoveryId(String value) {
        this.recoveryId = value;
    }

    /**
     * Obt�m o valor da propriedade recoveryChannelId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoveryChannelId() {
        return recoveryChannelId;
    }

    /**
     * Define o valor da propriedade recoveryChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoveryChannelId(Integer value) {
        this.recoveryChannelId = value;
    }

    /**
     * Obt�m o valor da propriedade paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define o valor da propriedade paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Obt�m o valor da propriedade invoiceExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceExpirationDate() {
        return invoiceExpirationDate;
    }

    /**
     * Define o valor da propriedade invoiceExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceExpirationDate(XMLGregorianCalendar value) {
        this.invoiceExpirationDate = value;
    }

    /**
     * Obt�m o valor da propriedade invoicePaymentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoicePaymentDate() {
        return invoicePaymentDate;
    }

    /**
     * Define o valor da propriedade invoicePaymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoicePaymentDate(XMLGregorianCalendar value) {
        this.invoicePaymentDate = value;
    }

    /**
     * Obt�m o valor da propriedade invoiceDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    /**
     * Define o valor da propriedade invoiceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDescription(String value) {
        this.invoiceDescription = value;
    }

    /**
     * Obt�m o valor da propriedade invoiceRecoveryValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInvoiceRecoveryValue() {
        return invoiceRecoveryValue;
    }

    /**
     * Define o valor da propriedade invoiceRecoveryValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvoiceRecoveryValue(Double value) {
        this.invoiceRecoveryValue = value;
    }

    /**
     * Obt�m o valor da propriedade invoiceValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInvoiceValue() {
        return invoiceValue;
    }

    /**
     * Define o valor da propriedade invoiceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvoiceValue(Double value) {
        this.invoiceValue = value;
    }

    /**
     * Obt�m o valor da propriedade participantTotalValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParticipantTotalValue() {
        return participantTotalValue;
    }

    /**
     * Define o valor da propriedade participantTotalValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParticipantTotalValue(Double value) {
        this.participantTotalValue = value;
    }

    /**
     * Obt�m o valor da propriedade participantPaidValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParticipantPaidValue() {
        return participantPaidValue;
    }

    /**
     * Define o valor da propriedade participantPaidValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParticipantPaidValue(Double value) {
        this.participantPaidValue = value;
    }

    /**
     * Obt�m o valor da propriedade contributionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributionId() {
        return contributionId;
    }

    /**
     * Define o valor da propriedade contributionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributionId(String value) {
        this.contributionId = value;
    }

    /**
     * Obt�m o valor da propriedade contributionOrigin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributionOrigin() {
        return contributionOrigin;
    }

    /**
     * Define o valor da propriedade contributionOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributionOrigin(String value) {
        this.contributionOrigin = value;
    }

    /**
     * Obt�m o valor da propriedade inChargeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChargeName() {
        return inChargeName;
    }

    /**
     * Define o valor da propriedade inChargeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChargeName(String value) {
        this.inChargeName = value;
    }

    /**
     * Obt�m o valor da propriedade paymentMethodDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    /**
     * Define o valor da propriedade paymentMethodDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodDescription(String value) {
        this.paymentMethodDescription = value;
    }

    /**
     * Obt�m o valor da propriedade periodicityDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicityDescription() {
        return periodicityDescription;
    }

    /**
     * Define o valor da propriedade periodicityDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicityDescription(String value) {
        this.periodicityDescription = value;
    }

    /**
     * Obt�m o valor da propriedade suspensionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspensionDate() {
        return suspensionDate;
    }

    /**
     * Define o valor da propriedade suspensionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspensionDate(XMLGregorianCalendar value) {
        this.suspensionDate = value;
    }

    /**
     * Obt�m o valor da propriedade systemSituation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemSituation() {
        return systemSituation;
    }

    /**
     * Define o valor da propriedade systemSituation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemSituation(String value) {
        this.systemSituation = value;
    }

    /**
     * Obt�m o valor da propriedade portalSituation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalSituation() {
        return portalSituation;
    }

    /**
     * Define o valor da propriedade portalSituation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalSituation(String value) {
        this.portalSituation = value;
    }

    /**
     * Obt�m o valor da propriedade situationTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationTitle() {
        return situationTitle;
    }

    /**
     * Define o valor da propriedade situationTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationTitle(String value) {
        this.situationTitle = value;
    }

    /**
     * Obt�m o valor da propriedade bankAccountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Define o valor da propriedade bankAccountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountId(String value) {
        this.bankAccountId = value;
    }

    /**
     * Obt�m o valor da propriedade bankAgencyNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAgencyNumber() {
        return bankAgencyNumber;
    }

    /**
     * Define o valor da propriedade bankAgencyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAgencyNumber(String value) {
        this.bankAgencyNumber = value;
    }

    /**
     * Obt�m o valor da propriedade bankAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Define o valor da propriedade bankAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
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
     * Obt�m o valor da propriedade fund.
     * 
     * @return
     *     possible object is
     *     {@link Fund }
     *     
     */
    public Fund getFund() {
        return fund;
    }

    /**
     * Define o valor da propriedade fund.
     * 
     * @param value
     *     allowed object is
     *     {@link Fund }
     *     
     */
    public void setFund(Fund value) {
        this.fund = value;
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
     * Obt�m o valor da propriedade communicabilityInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicabilityInd() {
        return communicabilityInd;
    }

    /**
     * Define o valor da propriedade communicabilityInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicabilityInd(String value) {
        this.communicabilityInd = value;
    }

    /**
     * Obt�m o valor da propriedade communicabilityPaidValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommunicabilityPaidValue() {
        return communicabilityPaidValue;
    }

    /**
     * Define o valor da propriedade communicabilityPaidValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommunicabilityPaidValue(Double value) {
        this.communicabilityPaidValue = value;
    }

}
