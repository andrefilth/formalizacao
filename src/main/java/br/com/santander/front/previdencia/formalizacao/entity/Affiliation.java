
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

import br.com.santander.front.previdencia.formalizacao.type.FormType;
import br.com.santander.front.previdencia.formalizacao.type.SexType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Affiliation", propOrder = {
    "affiliationId",
    "outsourcingOutgoingInd",
    "sponsorAffiliationInd",
    "retirementDate",
    "linkingType",
    "requestDate",
    "inputInformationType",
    "status",
    "incomingPortabilityInd",
    "employeeRegistrationNumber",
    "employeeAdmissionDate",
    "monthlyIncome",
    "clientName",
    "clientSex",
    "birthDate",
    "nationalityId",
    "professionId",
    "economicActivityId",
    "totalMonthlyIncome",
    "salesChannelId",
    "salesAgencyId",
    "salesOriginId",
    "salesBrokers",
    "salesAgentId",
    "salesOfficerId",
    "proLaboreOfficerId",
    "taxOptionType",
    "finantialResponsiblePersonId",
    "finantialResponsiblePerson",
    "maritalStatus",
    "formType",
    "accountId",
    "product",
    "documents",
    "addresses",
    "phones",
    "emails",
    "incomeTaxDeductible",
    "fundId",
    "benefits",
    "stage",
    "questionaryAnswers",
    "initialPayment",
    "regularPayment",
    "consignorUnit",
    "brokers",
    "validationResults",
    "salesChannel",
    "clientId",
    "client",
    "archiveDocumentNumber",
    "residenceCountryId",
    "channelId",
    "sendSMS",
    "phoneNumber",
    "simulationId",
    "proposalType",
    "incomeFee",
    "updateIndex",
    "digitalSignature",
    "formalizationChannel",
    "dossieId",
    "salesAgentEmail"
})
public class Affiliation {

    protected BigInteger affiliationId;
    protected String outsourcingOutgoingInd;
    protected String sponsorAffiliationInd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retirementDate;
    protected String linkingType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    protected String inputInformationType;
    protected String status;
    protected String incomingPortabilityInd;
    protected String employeeRegistrationNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar employeeAdmissionDate;
    protected Double monthlyIncome;
    protected String clientName;
    @XmlSchemaType(name = "string")
    protected SexType clientSex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String nationalityId;
    protected String professionId;
    protected String economicActivityId;
    protected Double totalMonthlyIncome;
    protected String salesChannelId;
    protected String salesAgencyId;
    protected String salesOriginId;
    @XmlElement(nillable = true)
    protected List<Broker> salesBrokers;
    protected String salesAgentId;
    protected String salesOfficerId;
    protected String proLaboreOfficerId;
    protected String taxOptionType;
    protected String finantialResponsiblePersonId;
    protected PhysicalPerson finantialResponsiblePerson;
    protected String maritalStatus;
    @XmlSchemaType(name = "string")
    protected FormType formType;
    protected String accountId;
    protected Product product;
    @XmlElement(nillable = true)
    protected List<Document> documents;
    @XmlElement(nillable = true)
    protected List<Address> addresses;
    @XmlElement(nillable = true)
    protected List<Phone> phones;
    @XmlElement(nillable = true)
    protected List<Email> emails;
    protected Boolean incomeTaxDeductible;
    protected String fundId;
    @XmlElement(nillable = true)
    protected List<Benefit> benefits;
    protected String stage;
    @XmlElement(nillable = true)
    protected List<QuestionAnswer> questionaryAnswers;
    protected Payment initialPayment;
    protected Payment regularPayment;
    protected ConsignorUnit consignorUnit;
    @XmlElement(nillable = true)
    protected List<Broker> brokers;
    @XmlElement(nillable = true)
    protected List<ValidationResult> validationResults;
    protected SalesChannel salesChannel;
    protected String clientId;
    protected PhysicalPerson client;
    protected BigInteger archiveDocumentNumber;
    protected String residenceCountryId;
    protected String channelId;
    protected String sendSMS;
    protected String phoneNumber;
    protected Long simulationId;
    protected String proposalType;
    protected double incomeFee;
    protected String updateIndex;
    protected String digitalSignature;
    protected String formalizationChannel;
    protected String dossieId;
    protected String salesAgentEmail;    
    

    
    /**
	 * 
	 */
	public Affiliation() {
	}

	

	/**
	 * @param affiliationId
	 * @param outsourcingOutgoingInd
	 * @param sponsorAffiliationInd
	 * @param retirementDate
	 * @param linkingType
	 * @param requestDate
	 * @param inputInformationType
	 * @param status
	 * @param incomingPortabilityInd
	 * @param employeeRegistrationNumber
	 * @param employeeAdmissionDate
	 * @param monthlyIncome
	 * @param clientName
	 * @param clientSex
	 * @param birthDate
	 * @param nationalityId
	 * @param professionId
	 * @param economicActivityId
	 * @param totalMonthlyIncome
	 * @param salesChannelId
	 * @param salesAgencyId
	 * @param salesOriginId
	 * @param salesBrokers
	 * @param salesAgentId
	 * @param salesOfficerId
	 * @param proLaboreOfficerId
	 * @param taxOptionType
	 * @param finantialResponsiblePersonId
	 * @param finantialResponsiblePerson
	 * @param maritalStatus
	 * @param formType
	 * @param accountId
	 * @param product
	 * @param documents
	 * @param addresses
	 * @param phones
	 * @param emails
	 * @param incomeTaxDeductible
	 * @param fundId
	 * @param benefits
	 * @param stage
	 * @param questionaryAnswers
	 * @param initialPayment
	 * @param regularPayment
	 * @param consignorUnit
	 * @param brokers
	 * @param validationResults
	 * @param salesChannel
	 * @param clientId
	 * @param client
	 * @param archiveDocumentNumber
	 * @param residenceCountryId
	 * @param channelId
	 * @param sendSMS
	 * @param phoneNumber
	 * @param simulationId
	 * @param proposalType
	 * @param incomeFee
	 * @param updateIndex
	 * @param digitalSignature
	 * @param formalizationChannel
	 * @param dossieId
	 * @param salesAgentEmail
	 */
	public Affiliation(BigInteger affiliationId, String outsourcingOutgoingInd, String sponsorAffiliationInd,
			XMLGregorianCalendar retirementDate, String linkingType, XMLGregorianCalendar requestDate,
			String inputInformationType, String status, String incomingPortabilityInd,
			String employeeRegistrationNumber, XMLGregorianCalendar employeeAdmissionDate, Double monthlyIncome,
			String clientName, SexType clientSex, XMLGregorianCalendar birthDate, String nationalityId,
			String professionId, String economicActivityId, Double totalMonthlyIncome, String salesChannelId,
			String salesAgencyId, String salesOriginId, List<Broker> salesBrokers, String salesAgentId,
			String salesOfficerId, String proLaboreOfficerId, String taxOptionType, String finantialResponsiblePersonId,
			PhysicalPerson finantialResponsiblePerson, String maritalStatus, FormType formType, String accountId,
			Product product, List<Document> documents, List<Address> addresses, List<Phone> phones, List<Email> emails,
			Boolean incomeTaxDeductible, String fundId, List<Benefit> benefits, String stage,
			List<QuestionAnswer> questionaryAnswers, Payment initialPayment, Payment regularPayment,
			ConsignorUnit consignorUnit, List<Broker> brokers, List<ValidationResult> validationResults,
			SalesChannel salesChannel, String clientId, PhysicalPerson client, BigInteger archiveDocumentNumber,
			String residenceCountryId, String channelId, String sendSMS, String phoneNumber, Long simulationId,
			String proposalType, double incomeFee, String updateIndex, String digitalSignature,
			String formalizationChannel, String dossieId, String salesAgentEmail) {
		this.affiliationId = affiliationId;
		this.outsourcingOutgoingInd = outsourcingOutgoingInd;
		this.sponsorAffiliationInd = sponsorAffiliationInd;
		this.retirementDate = retirementDate;
		this.linkingType = linkingType;
		this.requestDate = requestDate;
		this.inputInformationType = inputInformationType;
		this.status = status;
		this.incomingPortabilityInd = incomingPortabilityInd;
		this.employeeRegistrationNumber = employeeRegistrationNumber;
		this.employeeAdmissionDate = employeeAdmissionDate;
		this.monthlyIncome = monthlyIncome;
		this.clientName = clientName;
		this.clientSex = clientSex;
		this.birthDate = birthDate;
		this.nationalityId = nationalityId;
		this.professionId = professionId;
		this.economicActivityId = economicActivityId;
		this.totalMonthlyIncome = totalMonthlyIncome;
		this.salesChannelId = salesChannelId;
		this.salesAgencyId = salesAgencyId;
		this.salesOriginId = salesOriginId;
		this.salesBrokers = salesBrokers;
		this.salesAgentId = salesAgentId;
		this.salesOfficerId = salesOfficerId;
		this.proLaboreOfficerId = proLaboreOfficerId;
		this.taxOptionType = taxOptionType;
		this.finantialResponsiblePersonId = finantialResponsiblePersonId;
		this.finantialResponsiblePerson = finantialResponsiblePerson;
		this.maritalStatus = maritalStatus;
		this.formType = formType;
		this.accountId = accountId;
		this.product = product;
		this.documents = documents;
		this.addresses = addresses;
		this.phones = phones;
		this.emails = emails;
		this.incomeTaxDeductible = incomeTaxDeductible;
		this.fundId = fundId;
		this.benefits = benefits;
		this.stage = stage;
		this.questionaryAnswers = questionaryAnswers;
		this.initialPayment = initialPayment;
		this.regularPayment = regularPayment;
		this.consignorUnit = consignorUnit;
		this.brokers = brokers;
		this.validationResults = validationResults;
		this.salesChannel = salesChannel;
		this.clientId = clientId;
		this.client = client;
		this.archiveDocumentNumber = archiveDocumentNumber;
		this.residenceCountryId = residenceCountryId;
		this.channelId = channelId;
		this.sendSMS = sendSMS;
		this.phoneNumber = phoneNumber;
		this.simulationId = simulationId;
		this.proposalType = proposalType;
		this.incomeFee = incomeFee;
		this.updateIndex = updateIndex;
		this.digitalSignature = digitalSignature;
		this.formalizationChannel = formalizationChannel;
		this.dossieId = dossieId;
		this.salesAgentEmail = salesAgentEmail;
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
     * Obt�m o valor da propriedade outsourcingOutgoingInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsourcingOutgoingInd() {
        return outsourcingOutgoingInd;
    }

    /**
     * Define o valor da propriedade outsourcingOutgoingInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsourcingOutgoingInd(String value) {
        this.outsourcingOutgoingInd = value;
    }

    /**
     * Obt�m o valor da propriedade sponsorAffiliationInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorAffiliationInd() {
        return sponsorAffiliationInd;
    }

    /**
     * Define o valor da propriedade sponsorAffiliationInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorAffiliationInd(String value) {
        this.sponsorAffiliationInd = value;
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
     * Obt�m o valor da propriedade linkingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkingType() {
        return linkingType;
    }

    /**
     * Define o valor da propriedade linkingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkingType(String value) {
        this.linkingType = value;
    }

    /**
     * Obt�m o valor da propriedade requestDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Define o valor da propriedade requestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Obt�m o valor da propriedade inputInformationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputInformationType() {
        return inputInformationType;
    }

    /**
     * Define o valor da propriedade inputInformationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputInformationType(String value) {
        this.inputInformationType = value;
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
     * Obt�m o valor da propriedade incomingPortabilityInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingPortabilityInd() {
        return incomingPortabilityInd;
    }

    /**
     * Define o valor da propriedade incomingPortabilityInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingPortabilityInd(String value) {
        this.incomingPortabilityInd = value;
    }

    /**
     * Obt�m o valor da propriedade employeeRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeRegistrationNumber() {
        return employeeRegistrationNumber;
    }

    /**
     * Define o valor da propriedade employeeRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeRegistrationNumber(String value) {
        this.employeeRegistrationNumber = value;
    }

    /**
     * Obt�m o valor da propriedade employeeAdmissionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmployeeAdmissionDate() {
        return employeeAdmissionDate;
    }

    /**
     * Define o valor da propriedade employeeAdmissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmployeeAdmissionDate(XMLGregorianCalendar value) {
        this.employeeAdmissionDate = value;
    }

    /**
     * Obt�m o valor da propriedade monthlyIncome.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * Define o valor da propriedade monthlyIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonthlyIncome(Double value) {
        this.monthlyIncome = value;
    }

    /**
     * Obt�m o valor da propriedade clientName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Define o valor da propriedade clientName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Obt�m o valor da propriedade clientSex.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getClientSex() {
        return clientSex;
    }

    /**
     * Define o valor da propriedade clientSex.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setClientSex(SexType value) {
        this.clientSex = value;
    }

    /**
     * Obt�m o valor da propriedade birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Define o valor da propriedade birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Obt�m o valor da propriedade nationalityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityId() {
        return nationalityId;
    }

    /**
     * Define o valor da propriedade nationalityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityId(String value) {
        this.nationalityId = value;
    }

    /**
     * Obt�m o valor da propriedade professionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionId() {
        return professionId;
    }

    /**
     * Define o valor da propriedade professionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionId(String value) {
        this.professionId = value;
    }

    /**
     * Obt�m o valor da propriedade economicActivityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicActivityId() {
        return economicActivityId;
    }

    /**
     * Define o valor da propriedade economicActivityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicActivityId(String value) {
        this.economicActivityId = value;
    }

    /**
     * Obt�m o valor da propriedade totalMonthlyIncome.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalMonthlyIncome() {
        return totalMonthlyIncome;
    }

    /**
     * Define o valor da propriedade totalMonthlyIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalMonthlyIncome(Double value) {
        this.totalMonthlyIncome = value;
    }

    /**
     * Obt�m o valor da propriedade salesChannelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelId() {
        return salesChannelId;
    }

    /**
     * Define o valor da propriedade salesChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelId(String value) {
        this.salesChannelId = value;
    }

    /**
     * Obt�m o valor da propriedade salesAgencyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAgencyId() {
        return salesAgencyId;
    }

    /**
     * Define o valor da propriedade salesAgencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAgencyId(String value) {
        this.salesAgencyId = value;
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

    /**
     * Obt�m o valor da propriedade finantialResponsiblePerson.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPerson }
     *     
     */
    public PhysicalPerson getFinantialResponsiblePerson() {
        return finantialResponsiblePerson;
    }

    /**
     * Define o valor da propriedade finantialResponsiblePerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPerson }
     *     
     */
    public void setFinantialResponsiblePerson(PhysicalPerson value) {
        this.finantialResponsiblePerson = value;
    }

    /**
     * Obt�m o valor da propriedade maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define o valor da propriedade maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obt�m o valor da propriedade formType.
     * 
     * @return
     *     possible object is
     *     {@link FormType }
     *     
     */
    public FormType getFormType() {
        return formType;
    }

    /**
     * Define o valor da propriedade formType.
     * 
     * @param value
     *     allowed object is
     *     {@link FormType }
     *     
     */
    public void setFormType(FormType value) {
        this.formType = value;
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
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Document>();
        }
        return this.documents;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhones() {
        if (phones == null) {
            phones = new ArrayList<Phone>();
        }
        return this.phones;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmails() {
        if (emails == null) {
            emails = new ArrayList<Email>();
        }
        return this.emails;
    }

    /**
     * Obt�m o valor da propriedade incomeTaxDeductible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncomeTaxDeductible() {
        return incomeTaxDeductible;
    }

    /**
     * Define o valor da propriedade incomeTaxDeductible.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncomeTaxDeductible(Boolean value) {
        this.incomeTaxDeductible = value;
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
     * Obt�m o valor da propriedade stage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Define o valor da propriedade stage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the questionaryAnswers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionaryAnswers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionaryAnswers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionAnswer }
     * 
     * 
     */
    public List<QuestionAnswer> getQuestionaryAnswers() {
        if (questionaryAnswers == null) {
            questionaryAnswers = new ArrayList<QuestionAnswer>();
        }
        return this.questionaryAnswers;
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
     * Obt�m o valor da propriedade consignorUnit.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorUnit }
     *     
     */
    public ConsignorUnit getConsignorUnit() {
        return consignorUnit;
    }

    /**
     * Define o valor da propriedade consignorUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorUnit }
     *     
     */
    public void setConsignorUnit(ConsignorUnit value) {
        this.consignorUnit = value;
    }

    /**
     * Gets the value of the brokers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Broker }
     * 
     * 
     */
    public List<Broker> getBrokers() {
        if (brokers == null) {
            brokers = new ArrayList<Broker>();
        }
        return this.brokers;
    }

    /**
     * Gets the value of the validationResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResult }
     * 
     * 
     */
    public List<ValidationResult> getValidationResults() {
        if (validationResults == null) {
            validationResults = new ArrayList<ValidationResult>();
        }
        return this.validationResults;
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
     * Obt�m o valor da propriedade clientId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Define o valor da propriedade clientId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Obt�m o valor da propriedade client.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPerson }
     *     
     */
    public PhysicalPerson getClient() {
        return client;
    }

    /**
     * Define o valor da propriedade client.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPerson }
     *     
     */
    public void setClient(PhysicalPerson value) {
        this.client = value;
    }

    /**
     * Obt�m o valor da propriedade archiveDocumentNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArchiveDocumentNumber() {
        return archiveDocumentNumber;
    }

    /**
     * Define o valor da propriedade archiveDocumentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArchiveDocumentNumber(BigInteger value) {
        this.archiveDocumentNumber = value;
    }

    /**
     * Obt�m o valor da propriedade residenceCountryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryId() {
        return residenceCountryId;
    }

    /**
     * Define o valor da propriedade residenceCountryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryId(String value) {
        this.residenceCountryId = value;
    }

    /**
     * Obt�m o valor da propriedade channelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Define o valor da propriedade channelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Obt�m o valor da propriedade sendSMS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendSMS() {
        return sendSMS;
    }

    /**
     * Define o valor da propriedade sendSMS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendSMS(String value) {
        this.sendSMS = value;
    }

    /**
     * Obt�m o valor da propriedade phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define o valor da propriedade phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obt�m o valor da propriedade simulationId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSimulationId() {
        return simulationId;
    }

    /**
     * Define o valor da propriedade simulationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSimulationId(Long value) {
        this.simulationId = value;
    }

    /**
     * Obt�m o valor da propriedade proposalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposalType() {
        return proposalType;
    }

    /**
     * Define o valor da propriedade proposalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposalType(String value) {
        this.proposalType = value;
    }

    /**
     * Obt�m o valor da propriedade incomeFee.
     * 
     */
    public double getIncomeFee() {
        return incomeFee;
    }

    /**
     * Define o valor da propriedade incomeFee.
     * 
     */
    public void setIncomeFee(double value) {
        this.incomeFee = value;
    }

    /**
     * Obt�m o valor da propriedade updateIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateIndex() {
        return updateIndex;
    }

    /**
     * Define o valor da propriedade updateIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateIndex(String value) {
        this.updateIndex = value;
    }
    
    

	/**
	 * @return the digitalSignature
	 */
	public String getDigitalSignature() {
		return digitalSignature;
	}

	/**
	 * @param digitalSignature the digitalSignature to set
	 */
	public void setDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	/**
	 * @return the formalizationChannel
	 */
	public String getFormalizationChannel() {
		return formalizationChannel;
	}

	/**
	 * @param formalizationChannel the formalizationChannel to set
	 */
	public void setFormalizationChannel(String formalizationChannel) {
		this.formalizationChannel = formalizationChannel;
	}

	/**
	 * @return the dossieId
	 */
	public String getDossieId() {
		return dossieId;
	}

	/**
	 * @param dossieId the dossieId to set
	 */
	public void setDossieId(String dossieId) {
		this.dossieId = dossieId;
	}

	/**
	 * @return the salesAgentEmail
	 */
	public String getSalesAgentEmail() {
		return salesAgentEmail;
	}

	/**
	 * @param salesAgentEmail the salesAgentEmail to set
	 */
	public void setSalesAgentEmail(String salesAgentEmail) {
		this.salesAgentEmail = salesAgentEmail;
	}

	/**
	 * @return the incomeTaxDeductible
	 */
	public Boolean getIncomeTaxDeductible() {
		return incomeTaxDeductible;
	}

	/**
	 * @param salesBrokers the salesBrokers to set
	 */
	public void setSalesBrokers(List<Broker> salesBrokers) {
		this.salesBrokers = salesBrokers;
	}

	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	/**
	 * @param emails the emails to set
	 */
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	/**
	 * @param benefits the benefits to set
	 */
	public void setBenefits(List<Benefit> benefits) {
		this.benefits = benefits;
	}

	/**
	 * @param questionaryAnswers the questionaryAnswers to set
	 */
	public void setQuestionaryAnswers(List<QuestionAnswer> questionaryAnswers) {
		this.questionaryAnswers = questionaryAnswers;
	}

	/**
	 * @param brokers the brokers to set
	 */
	public void setBrokers(List<Broker> brokers) {
		this.brokers = brokers;
	}

	/**
	 * @param validationResults the validationResults to set
	 */
	public void setValidationResults(List<ValidationResult> validationResults) {
		this.validationResults = validationResults;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Affiliation [");
		if (affiliationId != null) {
			builder.append("affiliationId=");
			builder.append(affiliationId);
			builder.append(", ");
		}
		if (outsourcingOutgoingInd != null) {
			builder.append("outsourcingOutgoingInd=");
			builder.append(outsourcingOutgoingInd);
			builder.append(", ");
		}
		if (sponsorAffiliationInd != null) {
			builder.append("sponsorAffiliationInd=");
			builder.append(sponsorAffiliationInd);
			builder.append(", ");
		}
		if (retirementDate != null) {
			builder.append("retirementDate=");
			builder.append(retirementDate);
			builder.append(", ");
		}
		if (linkingType != null) {
			builder.append("linkingType=");
			builder.append(linkingType);
			builder.append(", ");
		}
		if (requestDate != null) {
			builder.append("requestDate=");
			builder.append(requestDate);
			builder.append(", ");
		}
		if (inputInformationType != null) {
			builder.append("inputInformationType=");
			builder.append(inputInformationType);
			builder.append(", ");
		}
		if (status != null) {
			builder.append("status=");
			builder.append(status);
			builder.append(", ");
		}
		if (incomingPortabilityInd != null) {
			builder.append("incomingPortabilityInd=");
			builder.append(incomingPortabilityInd);
			builder.append(", ");
		}
		if (employeeRegistrationNumber != null) {
			builder.append("employeeRegistrationNumber=");
			builder.append(employeeRegistrationNumber);
			builder.append(", ");
		}
		if (employeeAdmissionDate != null) {
			builder.append("employeeAdmissionDate=");
			builder.append(employeeAdmissionDate);
			builder.append(", ");
		}
		if (monthlyIncome != null) {
			builder.append("monthlyIncome=");
			builder.append(monthlyIncome);
			builder.append(", ");
		}
		if (clientName != null) {
			builder.append("clientName=");
			builder.append(clientName);
			builder.append(", ");
		}
		if (clientSex != null) {
			builder.append("clientSex=");
			builder.append(clientSex);
			builder.append(", ");
		}
		if (birthDate != null) {
			builder.append("birthDate=");
			builder.append(birthDate);
			builder.append(", ");
		}
		if (nationalityId != null) {
			builder.append("nationalityId=");
			builder.append(nationalityId);
			builder.append(", ");
		}
		if (professionId != null) {
			builder.append("professionId=");
			builder.append(professionId);
			builder.append(", ");
		}
		if (economicActivityId != null) {
			builder.append("economicActivityId=");
			builder.append(economicActivityId);
			builder.append(", ");
		}
		if (totalMonthlyIncome != null) {
			builder.append("totalMonthlyIncome=");
			builder.append(totalMonthlyIncome);
			builder.append(", ");
		}
		if (salesChannelId != null) {
			builder.append("salesChannelId=");
			builder.append(salesChannelId);
			builder.append(", ");
		}
		if (salesAgencyId != null) {
			builder.append("salesAgencyId=");
			builder.append(salesAgencyId);
			builder.append(", ");
		}
		if (salesOriginId != null) {
			builder.append("salesOriginId=");
			builder.append(salesOriginId);
			builder.append(", ");
		}
		if (salesBrokers != null) {
			builder.append("salesBrokers=");
			builder.append(salesBrokers);
			builder.append(", ");
		}
		if (salesAgentId != null) {
			builder.append("salesAgentId=");
			builder.append(salesAgentId);
			builder.append(", ");
		}
		if (salesOfficerId != null) {
			builder.append("salesOfficerId=");
			builder.append(salesOfficerId);
			builder.append(", ");
		}
		if (proLaboreOfficerId != null) {
			builder.append("proLaboreOfficerId=");
			builder.append(proLaboreOfficerId);
			builder.append(", ");
		}
		if (taxOptionType != null) {
			builder.append("taxOptionType=");
			builder.append(taxOptionType);
			builder.append(", ");
		}
		if (finantialResponsiblePersonId != null) {
			builder.append("finantialResponsiblePersonId=");
			builder.append(finantialResponsiblePersonId);
			builder.append(", ");
		}
		if (finantialResponsiblePerson != null) {
			builder.append("finantialResponsiblePerson=");
			builder.append(finantialResponsiblePerson);
			builder.append(", ");
		}
		if (maritalStatus != null) {
			builder.append("maritalStatus=");
			builder.append(maritalStatus);
			builder.append(", ");
		}
		if (formType != null) {
			builder.append("formType=");
			builder.append(formType);
			builder.append(", ");
		}
		if (accountId != null) {
			builder.append("accountId=");
			builder.append(accountId);
			builder.append(", ");
		}
		if (product != null) {
			builder.append("product=");
			builder.append(product);
			builder.append(", ");
		}
		if (documents != null) {
			builder.append("documents=");
			builder.append(documents);
			builder.append(", ");
		}
		if (addresses != null) {
			builder.append("addresses=");
			builder.append(addresses);
			builder.append(", ");
		}
		if (phones != null) {
			builder.append("phones=");
			builder.append(phones);
			builder.append(", ");
		}
		if (emails != null) {
			builder.append("emails=");
			builder.append(emails);
			builder.append(", ");
		}
		if (incomeTaxDeductible != null) {
			builder.append("incomeTaxDeductible=");
			builder.append(incomeTaxDeductible);
			builder.append(", ");
		}
		if (fundId != null) {
			builder.append("fundId=");
			builder.append(fundId);
			builder.append(", ");
		}
		if (benefits != null) {
			builder.append("benefits=");
			builder.append(benefits);
			builder.append(", ");
		}
		if (stage != null) {
			builder.append("stage=");
			builder.append(stage);
			builder.append(", ");
		}
		if (questionaryAnswers != null) {
			builder.append("questionaryAnswers=");
			builder.append(questionaryAnswers);
			builder.append(", ");
		}
		if (initialPayment != null) {
			builder.append("initialPayment=");
			builder.append(initialPayment);
			builder.append(", ");
		}
		if (regularPayment != null) {
			builder.append("regularPayment=");
			builder.append(regularPayment);
			builder.append(", ");
		}
		if (consignorUnit != null) {
			builder.append("consignorUnit=");
			builder.append(consignorUnit);
			builder.append(", ");
		}
		if (brokers != null) {
			builder.append("brokers=");
			builder.append(brokers);
			builder.append(", ");
		}
		if (validationResults != null) {
			builder.append("validationResults=");
			builder.append(validationResults);
			builder.append(", ");
		}
		if (salesChannel != null) {
			builder.append("salesChannel=");
			builder.append(salesChannel);
			builder.append(", ");
		}
		if (clientId != null) {
			builder.append("clientId=");
			builder.append(clientId);
			builder.append(", ");
		}
		if (client != null) {
			builder.append("client=");
			builder.append(client);
			builder.append(", ");
		}
		if (archiveDocumentNumber != null) {
			builder.append("archiveDocumentNumber=");
			builder.append(archiveDocumentNumber);
			builder.append(", ");
		}
		if (residenceCountryId != null) {
			builder.append("residenceCountryId=");
			builder.append(residenceCountryId);
			builder.append(", ");
		}
		if (channelId != null) {
			builder.append("channelId=");
			builder.append(channelId);
			builder.append(", ");
		}
		if (sendSMS != null) {
			builder.append("sendSMS=");
			builder.append(sendSMS);
			builder.append(", ");
		}
		if (phoneNumber != null) {
			builder.append("phoneNumber=");
			builder.append(phoneNumber);
			builder.append(", ");
		}
		if (simulationId != null) {
			builder.append("simulationId=");
			builder.append(simulationId);
			builder.append(", ");
		}
		if (proposalType != null) {
			builder.append("proposalType=");
			builder.append(proposalType);
			builder.append(", ");
		}
		builder.append("incomeFee=");
		builder.append(incomeFee);
		builder.append(", ");
		if (updateIndex != null) {
			builder.append("updateIndex=");
			builder.append(updateIndex);
			builder.append(", ");
		}
		if (digitalSignature != null) {
			builder.append("digitalSignature=");
			builder.append(digitalSignature);
			builder.append(", ");
		}
		if (formalizationChannel != null) {
			builder.append("formalizationChannel=");
			builder.append(formalizationChannel);
			builder.append(", ");
		}
		if (dossieId != null) {
			builder.append("dossieId=");
			builder.append(dossieId);
			builder.append(", ");
		}
		if (salesAgentEmail != null) {
			builder.append("salesAgentEmail=");
			builder.append(salesAgentEmail);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
