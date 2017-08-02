
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Email", propOrder = {
    "emailId",
    "emailType",
    "email",
    "allowsReceiveEmail",
    "allowsReceiveBeneficiaryEmail",
    "physicalPerson"
})
public class Email {

    protected Integer emailId;
    protected String emailType;
    protected String email;
    protected Boolean allowsReceiveEmail;
    protected Boolean allowsReceiveBeneficiaryEmail;
    protected PhysicalPerson physicalPerson;

  
    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer value) {
        this.emailId = value;
    }

  
    public String getEmailType() {
        return emailType;
    }

    /**
     * Define o valor da propriedade emailType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailType(String value) {
        this.emailType = value;
    }

    /**
     * Obt�m o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obt�m o valor da propriedade allowsReceiveEmail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsReceiveEmail() {
        return allowsReceiveEmail;
    }

    /**
     * Define o valor da propriedade allowsReceiveEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsReceiveEmail(Boolean value) {
        this.allowsReceiveEmail = value;
    }

    /**
     * Obt�m o valor da propriedade allowsReceiveBeneficiaryEmail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsReceiveBeneficiaryEmail() {
        return allowsReceiveBeneficiaryEmail;
    }

    /**
     * Define o valor da propriedade allowsReceiveBeneficiaryEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsReceiveBeneficiaryEmail(Boolean value) {
        this.allowsReceiveBeneficiaryEmail = value;
    }

    /**
     * Obt�m o valor da propriedade physicalPerson.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPerson }
     *     
     */
    public PhysicalPerson getPhysicalPerson() {
        return physicalPerson;
    }

    /**
     * Define o valor da propriedade physicalPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPerson }
     *     
     */
    public void setPhysicalPerson(PhysicalPerson value) {
        this.physicalPerson = value;
    }

}
