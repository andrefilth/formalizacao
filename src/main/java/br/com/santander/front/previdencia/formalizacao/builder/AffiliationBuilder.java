package br.com.santander.front.previdencia.formalizacao.builder;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.entity.Address;
import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.entity.Benefit;
import br.com.santander.front.previdencia.formalizacao.entity.Broker;
import br.com.santander.front.previdencia.formalizacao.entity.ConsignorUnit;
import br.com.santander.front.previdencia.formalizacao.entity.Document;
import br.com.santander.front.previdencia.formalizacao.entity.Email;
import br.com.santander.front.previdencia.formalizacao.entity.Payment;
import br.com.santander.front.previdencia.formalizacao.entity.Phone;
import br.com.santander.front.previdencia.formalizacao.entity.PhysicalPerson;
import br.com.santander.front.previdencia.formalizacao.entity.Product;
import br.com.santander.front.previdencia.formalizacao.entity.QuestionAnswer;
import br.com.santander.front.previdencia.formalizacao.entity.SalesChannel;
import br.com.santander.front.previdencia.formalizacao.entity.ValidationResult;
import br.com.santander.front.previdencia.formalizacao.type.FormType;
import br.com.santander.front.previdencia.formalizacao.type.SexType;

public class AffiliationBuilder {

	private BigInteger affiliationId;
	private String outsourcingOutgoingInd;
	private String sponsorAffiliationInd;
	private XMLGregorianCalendar retirementDate;
	private String linkingType;
	private XMLGregorianCalendar requestDate;
	private String status;
	private String inputInformationType;
	private String incomingPortabilityInd;
	private String employeeRegistrationNumber;
	private XMLGregorianCalendar employeeAdmissionDate;
	private Double monthlyIncome;
	private String salesChannelId;
	private Double totalMonthlyIncome;
	private String economicActivityId;
	private String professionId;
	private String nationalityId;
	private XMLGregorianCalendar birthDate;
	private SexType clientSex;
	private String clientName;
	private String salesAgencyId;
	private String salesOriginId;
	private List<Broker> salesBrokers;
	private String salesAgentId;
	private String salesOfficerId;
	private String proLaboreOfficerId;
	private String taxOptionType;
	private String finantialResponsiblePersonId;
	private PhysicalPerson finantialResponsiblePerson;
	private String maritalStatus;
	private FormType formType;
	private String accountId;
	private Product product;
	private List<Document> documents;
	private List<Address> addresses;
	private Payment regularPayment;
	private Payment initialPayment;
	private List<QuestionAnswer> questionaryAnswers;
	private String stage;
	private List<Benefit> benefits;
	private String fundId;
	private Boolean incomeTaxDeductible;
	private List<Email> emails;
	private List<Phone> phones;
	private ConsignorUnit consignorUnit;
	private List<Broker> brokers;
	private List<ValidationResult> validationResults;
	private SalesChannel salesChannel;
	private String clientId;
	private PhysicalPerson client;
	private BigInteger archiveDocumentNumber;
	private String residenceCountryId;
	private String updateIndex;
	private double incomeFee;
	private String proposalType;
	private Long simulationId;
	private String phoneNumber;
	private String sendSMS;
	private String channelId;
	private String digitalSignature;
	private String formalizationChannel;
	private String dossieId;
	private String salesAgentEmail;
	
	

	/**
	 * @param affiliationId the affiliationId to with
	 */
	public AffiliationBuilder withAffiliationId(BigInteger affiliationId) {
		this.affiliationId = affiliationId;
	return this;}



	/**
	 * @param outsourcingOutgoingInd the outsourcingOutgoingInd to with
	 */
	public AffiliationBuilder withOutsourcingOutgoingInd(String outsourcingOutgoingInd) {
		this.outsourcingOutgoingInd = outsourcingOutgoingInd;
	return this;}



	/**
	 * @param sponsorAffiliationInd the sponsorAffiliationInd to with
	 */
	public AffiliationBuilder withSponsorAffiliationInd(String sponsorAffiliationInd) {
		this.sponsorAffiliationInd = sponsorAffiliationInd;
	return this;}



	/**
	 * @param retirementDate the retirementDate to with
	 */
	public AffiliationBuilder withRetirementDate(XMLGregorianCalendar retirementDate) {
		this.retirementDate = retirementDate;
	return this;}



	/**
	 * @param linkingType the linkingType to with
	 */
	public AffiliationBuilder withLinkingType(String linkingType) {
		this.linkingType = linkingType;
	return this;}



	/**
	 * @param requestDate the requestDate to with
	 */
	public AffiliationBuilder withRequestDate(XMLGregorianCalendar requestDate) {
		this.requestDate = requestDate;
	return this;}



	/**
	 * @param status the status to with
	 */
	public AffiliationBuilder withStatus(String status) {
		this.status = status;
	return this;}



	/**
	 * @param inputInformationType the inputInformationType to with
	 */
	public AffiliationBuilder withInputInformationType(String inputInformationType) {
		this.inputInformationType = inputInformationType;
	return this;}



	/**
	 * @param incomingPortabilityInd the incomingPortabilityInd to with
	 */
	public AffiliationBuilder withIncomingPortabilityInd(String incomingPortabilityInd) {
		this.incomingPortabilityInd = incomingPortabilityInd;
	return this;}



	/**
	 * @param employeeRegistrationNumber the employeeRegistrationNumber to with
	 */
	public AffiliationBuilder withEmployeeRegistrationNumber(String employeeRegistrationNumber) {
		this.employeeRegistrationNumber = employeeRegistrationNumber;
	return this;}



	/**
	 * @param employeeAdmissionDate the employeeAdmissionDate to with
	 */
	public AffiliationBuilder withEmployeeAdmissionDate(XMLGregorianCalendar employeeAdmissionDate) {
		this.employeeAdmissionDate = employeeAdmissionDate;
	return this;}



	/**
	 * @param monthlyIncome the monthlyIncome to with
	 */
	public AffiliationBuilder withMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	return this;}



	/**
	 * @param salesChannelId the salesChannelId to with
	 */
	public AffiliationBuilder withSalesChannelId(String salesChannelId) {
		this.salesChannelId = salesChannelId;
	return this;}



	/**
	 * @param totalMonthlyIncome the totalMonthlyIncome to with
	 */
	public AffiliationBuilder withTotalMonthlyIncome(Double totalMonthlyIncome) {
		this.totalMonthlyIncome = totalMonthlyIncome;
	return this;}



	/**
	 * @param economicActivityId the economicActivityId to with
	 */
	public AffiliationBuilder withEconomicActivityId(String economicActivityId) {
		this.economicActivityId = economicActivityId;
	return this;}



	/**
	 * @param professionId the professionId to with
	 */
	public AffiliationBuilder withProfessionId(String professionId) {
		this.professionId = professionId;
	return this;}



	/**
	 * @param nationalityId the nationalityId to with
	 */
	public AffiliationBuilder withNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	return this;}



	/**
	 * @param birthDate the birthDate to with
	 */
	public AffiliationBuilder withBirthDate(XMLGregorianCalendar birthDate) {
		this.birthDate = birthDate;
	return this;}



	/**
	 * @param clientSex the clientSex to with
	 */
	public AffiliationBuilder withClientSex(SexType clientSex) {
		this.clientSex = clientSex;
	return this;}



	/**
	 * @param clientName the clientName to with
	 */
	public AffiliationBuilder withClientName(String clientName) {
		this.clientName = clientName;
	return this;}



	/**
	 * @param salesAgencyId the salesAgencyId to with
	 */
	public AffiliationBuilder withSalesAgencyId(String salesAgencyId) {
		this.salesAgencyId = salesAgencyId;
	return this;}



	/**
	 * @param salesOriginId the salesOriginId to with
	 */
	public AffiliationBuilder withSalesOriginId(String salesOriginId) {
		this.salesOriginId = salesOriginId;
	return this;}



	/**
	 * @param salesBrokers the salesBrokers to with
	 */
	public AffiliationBuilder withSalesBrokers(List<Broker> salesBrokers) {
		this.salesBrokers = salesBrokers;
	return this;}



	/**
	 * @param salesAgentId the salesAgentId to with
	 */
	public AffiliationBuilder withSalesAgentId(String salesAgentId) {
		this.salesAgentId = salesAgentId;
	return this;}



	/**
	 * @param salesOfficerId the salesOfficerId to with
	 */
	public AffiliationBuilder withSalesOfficerId(String salesOfficerId) {
		this.salesOfficerId = salesOfficerId;
	return this;}



	/**
	 * @param proLaboreOfficerId the proLaboreOfficerId to with
	 */
	public AffiliationBuilder withProLaboreOfficerId(String proLaboreOfficerId) {
		this.proLaboreOfficerId = proLaboreOfficerId;
	return this;}



	/**
	 * @param taxOptionType the taxOptionType to with
	 */
	public AffiliationBuilder withTaxOptionType(String taxOptionType) {
		this.taxOptionType = taxOptionType;
	return this;}



	/**
	 * @param finantialResponsiblePersonId the finantialResponsiblePersonId to with
	 */
	public AffiliationBuilder withFinantialResponsiblePersonId(String finantialResponsiblePersonId) {
		this.finantialResponsiblePersonId = finantialResponsiblePersonId;
	return this;}



	/**
	 * @param finantialResponsiblePerson the finantialResponsiblePerson to with
	 */
	public AffiliationBuilder withFinantialResponsiblePerson(PhysicalPerson finantialResponsiblePerson) {
		this.finantialResponsiblePerson = finantialResponsiblePerson;
	return this;}



	/**
	 * @param maritalStatus the maritalStatus to with
	 */
	public AffiliationBuilder withMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	return this;}



	/**
	 * @param formType the formType to with
	 */
	public AffiliationBuilder withFormType(FormType formType) {
		this.formType = formType;
	return this;}



	/**
	 * @param accountId the accountId to with
	 */
	public AffiliationBuilder withAccountId(String accountId) {
		this.accountId = accountId;
	return this;}



	/**
	 * @param product the product to with
	 */
	public AffiliationBuilder withProduct(Product product) {
		this.product = product;
	return this;}



	/**
	 * @param documents the documents to with
	 */
	public AffiliationBuilder withDocuments(List<Document> documents) {
		this.documents = documents;
	return this;}



	/**
	 * @param addresses the addresses to with
	 */
	public AffiliationBuilder withAddresses(List<Address> addresses) {
		this.addresses = addresses;
	return this;}



	/**
	 * @param regularPayment the regularPayment to with
	 */
	public AffiliationBuilder withRegularPayment(Payment regularPayment) {
		this.regularPayment = regularPayment;
	return this;}



	/**
	 * @param initialPayment the initialPayment to with
	 */
	public AffiliationBuilder withInitialPayment(Payment initialPayment) {
		this.initialPayment = initialPayment;
	return this;}



	/**
	 * @param questionaryAnswers the questionaryAnswers to with
	 */
	public AffiliationBuilder withQuestionaryAnswers(List<QuestionAnswer> questionaryAnswers) {
		this.questionaryAnswers = questionaryAnswers;
	return this;}



	/**
	 * @param stage the stage to with
	 */
	public AffiliationBuilder withStage(String stage) {
		this.stage = stage;
	return this;}



	/**
	 * @param benefits the benefits to with
	 */
	public AffiliationBuilder withBenefits(List<Benefit> benefits) {
		this.benefits = benefits;
	return this;}



	/**
	 * @param fundId the fundId to with
	 */
	public AffiliationBuilder withFundId(String fundId) {
		this.fundId = fundId;
	return this;}



	/**
	 * @param incomeTaxDeductible the incomeTaxDeductible to with
	 */
	public AffiliationBuilder withIncomeTaxDeductible(Boolean incomeTaxDeductible) {
		this.incomeTaxDeductible = incomeTaxDeductible;
	return this;}



	/**
	 * @param emails the emails to with
	 */
	public AffiliationBuilder withEmails(List<Email> emails) {
		this.emails = emails;
	return this;}



	/**
	 * @param phones the phones to with
	 */
	public AffiliationBuilder withPhones(List<Phone> phones) {
		this.phones = phones;
	return this;}



	/**
	 * @param consignorUnit the consignorUnit to with
	 */
	public AffiliationBuilder withConsignorUnit(ConsignorUnit consignorUnit) {
		this.consignorUnit = consignorUnit;
	return this;}



	/**
	 * @param brokers the brokers to with
	 */
	public AffiliationBuilder withBrokers(List<Broker> brokers) {
		this.brokers = brokers;
	return this;}



	/**
	 * @param validationResults the validationResults to with
	 */
	public AffiliationBuilder withValidationResults(List<ValidationResult> validationResults) {
		this.validationResults = validationResults;
	return this;}



	/**
	 * @param salesChannel the salesChannel to with
	 */
	public AffiliationBuilder withSalesChannel(SalesChannel salesChannel) {
		this.salesChannel = salesChannel;
	return this;}



	/**
	 * @param clientId the clientId to with
	 */
	public AffiliationBuilder withClientId(String clientId) {
		this.clientId = clientId;
	return this;}



	/**
	 * @param client the client to with
	 */
	public AffiliationBuilder withClient(PhysicalPerson client) {
		this.client = client;
	return this;}



	/**
	 * @param archiveDocumentNumber the archiveDocumentNumber to with
	 */
	public AffiliationBuilder withArchiveDocumentNumber(BigInteger archiveDocumentNumber) {
		this.archiveDocumentNumber = archiveDocumentNumber;
	return this;}



	/**
	 * @param residenceCountryId the residenceCountryId to with
	 */
	public AffiliationBuilder withResidenceCountryId(String residenceCountryId) {
		this.residenceCountryId = residenceCountryId;
	return this;}



	/**
	 * @param updateIndex the updateIndex to with
	 */
	public AffiliationBuilder withUpdateIndex(String updateIndex) {
		this.updateIndex = updateIndex;
	return this;}



	/**
	 * @param incomeFee the incomeFee to with
	 */
	public AffiliationBuilder withIncomeFee(double incomeFee) {
		this.incomeFee = incomeFee;
	return this;}



	/**
	 * @param proposalType the proposalType to with
	 */
	public AffiliationBuilder withProposalType(String proposalType) {
		this.proposalType = proposalType;
	return this;}



	/**
	 * @param simulationId the simulationId to with
	 */
	public AffiliationBuilder withSimulationId(Long simulationId) {
		this.simulationId = simulationId;
	return this;}



	/**
	 * @param phoneNumber the phoneNumber to with
	 */
	public AffiliationBuilder withPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	return this;}



	/**
	 * @param sendSMS the sendSMS to with
	 */
	public AffiliationBuilder withSendSMS(String sendSMS) {
		this.sendSMS = sendSMS;
	return this;}



	/**
	 * @param channelId the channelId to with
	 */
	public AffiliationBuilder withChannelId(String channelId) {
		this.channelId = channelId;
	return this;}



	/**
	 * @param digitalSignature the digitalSignature to with
	 */
	public AffiliationBuilder withDigitalSignature(String digitalSignature) {
		this.digitalSignature = digitalSignature;
	return this;}



	/**
	 * @param formalizationChannel the formalizationChannel to with
	 */
	public AffiliationBuilder withFormalizationChannel(String formalizationChannel) {
		this.formalizationChannel = formalizationChannel;
	return this;}



	/**
	 * @param dossieId the dossieId to with
	 */
	public AffiliationBuilder withDossieId(String dossieId) {
		this.dossieId = dossieId;
	return this;}



	/**
	 * @param salesAgentEmail the salesAgentEmail to with
	 */
	public AffiliationBuilder withSalesAgentEmail(String salesAgentEmail) {
		this.salesAgentEmail = salesAgentEmail;
	return this;}



	public Affiliation createAffiliation() {
		return new Affiliation(affiliationId, outsourcingOutgoingInd, sponsorAffiliationInd, retirementDate,
				linkingType, requestDate, inputInformationType, status, incomingPortabilityInd,
				employeeRegistrationNumber, employeeAdmissionDate, monthlyIncome, clientName, clientSex, birthDate,
				nationalityId, professionId, economicActivityId, totalMonthlyIncome, salesChannelId, salesAgencyId,
				salesOriginId, salesBrokers, salesAgentId, salesOfficerId, proLaboreOfficerId, taxOptionType,
				finantialResponsiblePersonId, finantialResponsiblePerson, maritalStatus, formType, accountId, product,
				documents, addresses, phones, emails, incomeTaxDeductible, fundId, benefits, stage, questionaryAnswers,
				initialPayment, regularPayment, consignorUnit, brokers, validationResults, salesChannel, clientId,
				client, archiveDocumentNumber, residenceCountryId, channelId, sendSMS, phoneNumber, simulationId,
				proposalType, incomeFee, updateIndex, digitalSignature, formalizationChannel, dossieId,
				salesAgentEmail);

	}
}
