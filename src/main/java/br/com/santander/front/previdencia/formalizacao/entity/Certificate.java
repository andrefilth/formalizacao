
package br.com.santander.front.previdencia.formalizacao.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certificate", propOrder = {
    "companyId",
    "accountId",
    "username",
    "accountType",
    "sponsorAccount",
    "status",
    "subStatus",
    "openningDate",
    "emissionDate",
    "contractType",
    "contractNumber",
    "expirationDate",
    "policyId",
    "retirementDate",
    "person",
    "product",
    "benefits",
    "balances",
    "statements",
    "invoices",
    "affiliationId",
    "initialPayment",
    "regularPayment",
    "taxOptionType",
    "salesChannel",
    "salesOriginId",
    "salesBrokers",
    "salesAgentId",
    "salesOfficerId",
    "proLaboreOfficerId",
    "insuranceContract",
    "holdingExternalSupplierId",
    "finantialResponsiblePersonId"
})
public class Certificate {

    protected String companyId;
    protected String accountId;
    protected String username;
    protected String accountType;
    protected Certificate sponsorAccount;
    protected String status;
    protected String subStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openningDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emissionDate;
    protected String contractType;
    protected String contractNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected String policyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retirementDate;
    protected Person person;
    protected Product product;
    @XmlElement(nillable = true)
    protected List<Benefit> benefits;
    @XmlElement(nillable = true)
    protected List<Balance> balances;
    @XmlElement(nillable = true)
    protected List<Statement> statements;
    @XmlElement(nillable = true)
    protected List<Invoice> invoices;
    protected BigInteger affiliationId;
    protected Payment initialPayment;
    protected Payment regularPayment;
    protected String taxOptionType;
    protected SalesChannel salesChannel;
    protected String salesOriginId;
    @XmlElement(nillable = true)
    protected List<Broker> salesBrokers;
    protected String salesAgentId;
    protected String salesOfficerId;
    protected String proLaboreOfficerId;
    protected InsuranceContract insuranceContract;
    protected String holdingExternalSupplierId;
    protected String finantialResponsiblePersonId;

    /**
     * Obt�m o valor da propriedade companyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Define o valor da propriedade companyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Obt�m o valor da propriedade accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Define o valor da propriedade accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Obt�m o valor da propriedade username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Define o valor da propriedade username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Obt�m o valor da propriedade accountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Define o valor da propriedade accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Obt�m o valor da propriedade sponsorAccount.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getSponsorAccount() {
        return sponsorAccount;
    }

    /**
     * Define o valor da propriedade sponsorAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setSponsorAccount(Certificate value) {
        this.sponsorAccount = value;
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

    /**
     * Obt�m o valor da propriedade subStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Define o valor da propriedade subStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Obt�m o valor da propriedade openningDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenningDate() {
        return openningDate;
    }

    /**
     * Define o valor da propriedade openningDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenningDate(XMLGregorianCalendar value) {
        this.openningDate = value;
    }

    /**
     * Obt�m o valor da propriedade emissionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmissionDate() {
        return emissionDate;
    }

    /**
     * Define o valor da propriedade emissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmissionDate(XMLGregorianCalendar value) {
        this.emissionDate = value;
    }

    /**
     * Obt�m o valor da propriedade contractType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Define o valor da propriedade contractType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Obt�m o valor da propriedade contractNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Define o valor da propriedade contractNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Obt�m o valor da propriedade expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define o valor da propriedade expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obt�m o valor da propriedade policyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Define o valor da propriedade policyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * Obt�m o valor da propriedade retirementDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetirementDate() {
        return retirementDate;
    }

    /**
     * Define o valor da propriedade retirementDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetirementDate(XMLGregorianCalendar value) {
        this.retirementDate = value;
    }

    /**
     * Obt�m o valor da propriedade person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Define o valor da propriedade person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Obt�m o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the benefits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Benefit }
     * 
     * 
     */
    public List<Benefit> getBenefits() {
        if (benefits == null) {
            benefits = new ArrayList<Benefit>();
        }
        return this.benefits;
    }

    /**
     * Gets the value of the balances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Balance }
     * 
     * 
     */
    public List<Balance> getBalances() {
        if (balances == null) {
            balances = new ArrayList<Balance>();
        }
        return this.balances;
    }

    /**
     * Gets the value of the statements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statement }
     * 
     * 
     */
    public List<Statement> getStatements() {
        if (statements == null) {
            statements = new ArrayList<Statement>();
        }
        return this.statements;
    }

    /**
     * Gets the value of the invoices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Invoice }
     * 
     * 
     */
    public List<Invoice> getInvoices() {
        if (invoices == null) {
            invoices = new ArrayList<Invoice>();
        }
        return this.invoices;
    }

    /**
     * Obt�m o valor da propriedade affiliationId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffiliationId() {
        return affiliationId;
    }

    /**
     * Define o valor da propriedade affiliationId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffiliationId(BigInteger value) {
        this.affiliationId = value;
    }

    /**
     * Obt�m o valor da propriedade initialPayment.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getInitialPayment() {
        return initialPayment;
    }

    /**
     * Define o valor da propriedade initialPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setInitialPayment(Payment value) {
        this.initialPayment = value;
    }

    /**
     * Obt�m o valor da propriedade regularPayment.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getRegularPayment() {
        return regularPayment;
    }

    /**
     * Define o valor da propriedade regularPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setRegularPayment(Payment value) {
        this.regularPayment = value;
    }

    /**
     * Obt�m o valor da propriedade taxOptionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOptionType() {
        return taxOptionType;
    }

    /**
     * Define o valor da propriedade taxOptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOptionType(String value) {
        this.taxOptionType = value;
    }

    /**
     * Obt�m o valor da propriedade salesChannel.
     * 
     * @return
     *     possible object is
     *     {@link SalesChannel }
     *     
     */
    public SalesChannel getSalesChannel() {
        return salesChannel;
    }

    /**
     * Define o valor da propriedade salesChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesChannel }
     *     
     */
    public void setSalesChannel(SalesChannel value) {
        this.salesChannel = value;
    }

    /**
     * Obt�m o valor da propriedade salesOriginId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOriginId() {
        return salesOriginId;
    }

    /**
     * Define o valor da propriedade salesOriginId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOriginId(String value) {
        this.salesOriginId = value;
    }

    /**
     * Gets the value of the salesBrokers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesBrokers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesBrokers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Broker }
     * 
     * 
     */
    public List<Broker> getSalesBrokers() {
        if (salesBrokers == null) {
            salesBrokers = new ArrayList<Broker>();
        }
        return this.salesBrokers;
    }

    /**
     * Obt�m o valor da propriedade salesAgentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAgentId() {
        return salesAgentId;
    }

    /**
     * Define o valor da propriedade salesAgentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAgentId(String value) {
        this.salesAgentId = value;
    }

    /**
     * Obt�m o valor da propriedade salesOfficerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOfficerId() {
        return salesOfficerId;
    }

    /**
     * Define o valor da propriedade salesOfficerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOfficerId(String value) {
        this.salesOfficerId = value;
    }

    /**
     * Obt�m o valor da propriedade proLaboreOfficerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProLaboreOfficerId() {
        return proLaboreOfficerId;
    }

    /**
     * Define o valor da propriedade proLaboreOfficerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProLaboreOfficerId(String value) {
        this.proLaboreOfficerId = value;
    }

    /**
     * Obt�m o valor da propriedade insuranceContract.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceContract }
     *     
     */
    public InsuranceContract getInsuranceContract() {
        return insuranceContract;
    }

    /**
     * Define o valor da propriedade insuranceContract.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceContract }
     *     
     */
    public void setInsuranceContract(InsuranceContract value) {
        this.insuranceContract = value;
    }

    /**
     * Obt�m o valor da propriedade holdingExternalSupplierId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldingExternalSupplierId() {
        return holdingExternalSupplierId;
    }

    /**
     * Define o valor da propriedade holdingExternalSupplierId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldingExternalSupplierId(String value) {
        this.holdingExternalSupplierId = value;
    }

    /**
     * Obt�m o valor da propriedade finantialResponsiblePersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinantialResponsiblePersonId() {
        return finantialResponsiblePersonId;
    }

    /**
     * Define o valor da propriedade finantialResponsiblePersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinantialResponsiblePersonId(String value) {
        this.finantialResponsiblePersonId = value;
    }

}
