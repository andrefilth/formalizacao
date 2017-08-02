package br.com.santander.front.previdencia.formalizacao.builder;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.entity.Address;
import br.com.santander.front.previdencia.formalizacao.entity.Certificate;
import br.com.santander.front.previdencia.formalizacao.entity.Document;
import br.com.santander.front.previdencia.formalizacao.entity.Email;
import br.com.santander.front.previdencia.formalizacao.entity.Phone;
import br.com.santander.front.previdencia.formalizacao.entity.PhysicalPerson;
import br.com.santander.front.previdencia.formalizacao.entity.PoliticallyExposedData;
import br.com.santander.front.previdencia.formalizacao.type.SexType;

public class PhysicalPersonBuilder {

	private String physicalPersonId;
	private String externalPhysicalPersonId;
	private String maritalStatus;
	private String mainSegment;
	private String cpf;
	private String professionId;
	private String personName;
	private XMLGregorianCalendar birthDate;
	private SexType sexIndication;
	private String indicatorSheet;
	private String secondarySegment;
	private String mailLanguageId;
	private String badPayerInd;
	private Integer childrenQuantity;
	private Integer dependentQuantity;
	private String residentInd;
	private Integer residenceTime;
	private String nationalityId;
	private String countryId;
	private Double totalMontlyIncome;
	private String workReferencesInd;
	private String creditReferencesInd;
	private String bankReferencesInd;
	private List<Certificate> certificates;
	private List<Address> addresses;
	private List<Phone> phones;
	private List<Email> emails;
	private List<Document> documents;
	private PoliticallyExposedData pep;
	private String residenceCountryId;
	private String professionDescription;
	
	

	/**
	 * @param physicalPersonId the physicalPersonId to with
	 */
	public PhysicalPersonBuilder withPhysicalPersonId(String physicalPersonId) {
		this.physicalPersonId = physicalPersonId;
	return this;}



	/**
	 * @param externalPhysicalPersonId the externalPhysicalPersonId to with
	 */
	public PhysicalPersonBuilder withExternalPhysicalPersonId(String externalPhysicalPersonId) {
		this.externalPhysicalPersonId = externalPhysicalPersonId;
	return this;}



	/**
	 * @param maritalStatus the maritalStatus to with
	 */
	public PhysicalPersonBuilder withMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	return this;}



	/**
	 * @param mainSegment the mainSegment to with
	 */
	public PhysicalPersonBuilder withMainSegment(String mainSegment) {
		this.mainSegment = mainSegment;
	return this;}



	/**
	 * @param cpf the cpf to with
	 */
	public PhysicalPersonBuilder withCpf(String cpf) {
		this.cpf = cpf;
	return this;}



	/**
	 * @param professionId the professionId to with
	 */
	public PhysicalPersonBuilder withProfessionId(String professionId) {
		this.professionId = professionId;
	return this;}



	/**
	 * @param personName the personName to with
	 */
	public PhysicalPersonBuilder withPersonName(String personName) {
		this.personName = personName;
	return this;}



	/**
	 * @param birthDate the birthDate to with
	 */
	public PhysicalPersonBuilder withBirthDate(XMLGregorianCalendar birthDate) {
		this.birthDate = birthDate;
	return this;}



	/**
	 * @param sexIndication the sexIndication to with
	 */
	public PhysicalPersonBuilder withSexIndication(SexType sexIndication) {
		this.sexIndication = sexIndication;
	return this;}



	/**
	 * @param indicatorSheet the indicatorSheet to with
	 */
	public PhysicalPersonBuilder withIndicatorSheet(String indicatorSheet) {
		this.indicatorSheet = indicatorSheet;
	return this;}



	/**
	 * @param secondarySegment the secondarySegment to with
	 */
	public PhysicalPersonBuilder withSecondarySegment(String secondarySegment) {
		this.secondarySegment = secondarySegment;
	return this;}



	/**
	 * @param mailLanguageId the mailLanguageId to with
	 */
	public PhysicalPersonBuilder withMailLanguageId(String mailLanguageId) {
		this.mailLanguageId = mailLanguageId;
	return this;}



	/**
	 * @param badPayerInd the badPayerInd to with
	 */
	public PhysicalPersonBuilder withBadPayerInd(String badPayerInd) {
		this.badPayerInd = badPayerInd;
	return this;}



	/**
	 * @param childrenQuantity the childrenQuantity to with
	 */
	public PhysicalPersonBuilder withChildrenQuantity(Integer childrenQuantity) {
		this.childrenQuantity = childrenQuantity;
	return this;}



	/**
	 * @param dependentQuantity the dependentQuantity to with
	 */
	public PhysicalPersonBuilder withDependentQuantity(Integer dependentQuantity) {
		this.dependentQuantity = dependentQuantity;
	return this;}



	/**
	 * @param residentInd the residentInd to with
	 */
	public PhysicalPersonBuilder withResidentInd(String residentInd) {
		this.residentInd = residentInd;
	return this;}



	/**
	 * @param residenceTime the residenceTime to with
	 */
	public PhysicalPersonBuilder withResidenceTime(Integer residenceTime) {
		this.residenceTime = residenceTime;
	return this;}



	/**
	 * @param nationalityId the nationalityId to with
	 */
	public PhysicalPersonBuilder withNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	return this;}



	/**
	 * @param countryId the countryId to with
	 */
	public PhysicalPersonBuilder withCountryId(String countryId) {
		this.countryId = countryId;
	return this;}



	/**
	 * @param totalMontlyIncome the totalMontlyIncome to with
	 */
	public PhysicalPersonBuilder withTotalMontlyIncome(Double totalMontlyIncome) {
		this.totalMontlyIncome = totalMontlyIncome;
	return this;}



	/**
	 * @param workReferencesInd the workReferencesInd to with
	 */
	public PhysicalPersonBuilder withWorkReferencesInd(String workReferencesInd) {
		this.workReferencesInd = workReferencesInd;
	return this;}



	/**
	 * @param creditReferencesInd the creditReferencesInd to with
	 */
	public PhysicalPersonBuilder withCreditReferencesInd(String creditReferencesInd) {
		this.creditReferencesInd = creditReferencesInd;
	return this;}



	/**
	 * @param bankReferencesInd the bankReferencesInd to with
	 */
	public PhysicalPersonBuilder withBankReferencesInd(String bankReferencesInd) {
		this.bankReferencesInd = bankReferencesInd;
	return this;}



	/**
	 * @param certificates the certificates to with
	 */
	public PhysicalPersonBuilder withCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	return this;}



	/**
	 * @param addresses the addresses to with
	 */
	public PhysicalPersonBuilder withAddresses(List<Address> addresses) {
		this.addresses = addresses;
	return this;}



	/**
	 * @param phones the phones to with
	 */
	public PhysicalPersonBuilder withPhones(List<Phone> phones) {
		this.phones = phones;
	return this;}



	/**
	 * @param emails the emails to with
	 */
	public PhysicalPersonBuilder withEmails(List<Email> emails) {
		this.emails = emails;
	return this;}



	/**
	 * @param documents the documents to with
	 */
	public PhysicalPersonBuilder withDocuments(List<Document> documents) {
		this.documents = documents;
	return this;}



	/**
	 * @param pep the pep to with
	 */
	public PhysicalPersonBuilder withPep(PoliticallyExposedData pep) {
		this.pep = pep;
	return this;}



	/**
	 * @param residenceCountryId the residenceCountryId to with
	 */
	public PhysicalPersonBuilder withResidenceCountryId(String residenceCountryId) {
		this.residenceCountryId = residenceCountryId;
	return this;}



	/**
	 * @param professionDescription the professionDescription to with
	 */
	public PhysicalPersonBuilder withProfessionDescription(String professionDescription) {
		this.professionDescription = professionDescription;
		return this;
	}



	public PhysicalPerson createPhysicalPerson() {
		return new PhysicalPerson(physicalPersonId, externalPhysicalPersonId, maritalStatus, mainSegment,
				secondarySegment, indicatorSheet, sexIndication, birthDate, personName, professionId, cpf,
				mailLanguageId, badPayerInd, childrenQuantity, dependentQuantity, residentInd, residenceTime,
				bankReferencesInd, creditReferencesInd, workReferencesInd, totalMontlyIncome, countryId, nationalityId,
				certificates, addresses, phones, emails, documents, pep, residenceCountryId, professionDescription);
	}

}
