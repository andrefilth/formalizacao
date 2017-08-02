
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceContract", propOrder = {
    "insuranceContractId",
    "insuranceContractDescription",
    "juridicPerson",
    "recoveryGroupInd",
    "validityStartDate",
    "validityEndDate",
    "paymentDay"
})
public class InsuranceContract {

    protected Long insuranceContractId;
    protected String insuranceContractDescription;
    protected JuridicPerson juridicPerson;
    protected Boolean recoveryGroupInd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityEndDate;
    protected Integer paymentDay;

    /**
     * Obt�m o valor da propriedade insuranceContractId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsuranceContractId() {
        return insuranceContractId;
    }

    /**
     * Define o valor da propriedade insuranceContractId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsuranceContractId(Long value) {
        this.insuranceContractId = value;
    }

    /**
     * Obt�m o valor da propriedade insuranceContractDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceContractDescription() {
        return insuranceContractDescription;
    }

    /**
     * Define o valor da propriedade insuranceContractDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceContractDescription(String value) {
        this.insuranceContractDescription = value;
    }

    /**
     * Obt�m o valor da propriedade juridicPerson.
     * 
     * @return
     *     possible object is
     *     {@link JuridicPerson }
     *     
     */
    public JuridicPerson getJuridicPerson() {
        return juridicPerson;
    }

    /**
     * Define o valor da propriedade juridicPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link JuridicPerson }
     *     
     */
    public void setJuridicPerson(JuridicPerson value) {
        this.juridicPerson = value;
    }

    /**
     * Obt�m o valor da propriedade recoveryGroupInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecoveryGroupInd() {
        return recoveryGroupInd;
    }

    /**
     * Define o valor da propriedade recoveryGroupInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecoveryGroupInd(Boolean value) {
        this.recoveryGroupInd = value;
    }

    /**
     * Obt�m o valor da propriedade validityStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * Define o valor da propriedade validityStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityStartDate(XMLGregorianCalendar value) {
        this.validityStartDate = value;
    }

    /**
     * Obt�m o valor da propriedade validityEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityEndDate() {
        return validityEndDate;
    }

    /**
     * Define o valor da propriedade validityEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityEndDate(XMLGregorianCalendar value) {
        this.validityEndDate = value;
    }

    /**
     * Obt�m o valor da propriedade paymentDay.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentDay() {
        return paymentDay;
    }

    /**
     * Define o valor da propriedade paymentDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentDay(Integer value) {
        this.paymentDay = value;
    }

}
