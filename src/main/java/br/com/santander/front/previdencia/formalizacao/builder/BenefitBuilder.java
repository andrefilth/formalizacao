package br.com.santander.front.previdencia.formalizacao.builder;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.entity.Beneficiary;
import br.com.santander.front.previdencia.formalizacao.entity.Benefit;
import br.com.santander.front.previdencia.formalizacao.entity.Certificate;
import br.com.santander.front.previdencia.formalizacao.entity.Fund;
import br.com.santander.front.previdencia.formalizacao.entity.IncomeType;
import br.com.santander.front.previdencia.formalizacao.entity.ParameterizedValue;
import br.com.santander.front.previdencia.formalizacao.entity.Reserve;
import br.com.santander.front.previdencia.formalizacao.type.BenefitType;
import br.com.santander.front.previdencia.formalizacao.type.SexType;

public class BenefitBuilder {

	private Integer planId;
	private Integer benefitId;
	private String companyId;
	private String description;
	private BenefitType benefitType;
	private String status;
	private String subStatus;
	private Double benefitValue;
	private XMLGregorianCalendar beneficiaryBirthDate;
	private Certificate certificate;
	private String legalIdentifier;
	private Double initialContributionValue;
	private Double expectedContributionValue;
	private SexType beneficiarySex;
	private XMLGregorianCalendar youngestBirthDate;
	private SexType youngestSex;
	private Double reversionPct;
	private Double childrenReversionPct;
	private Integer desiredTerm;
	private Double estimatedBenefitValue;
	private Double incomeFactor;
	private Double premium;
	private String incomeDescription;
	private List<IncomeType> availableIncomeTypes;
	private Integer incomeType;
	private String reversionAllowedInd;
	private String calculationType;
	private XMLGregorianCalendar contractDate;
	private Boolean legalHeir;
	private List<Beneficiary> beneficiaries;
	private List<Fund> funds;
	private List<Reserve> reserves;
	private ParameterizedValue incomeFee;
	private String updateIndex;
	private String reversionType;
	private String coverageType;
	
	

	/**
	 * @param planId the planId to with
	 */
	public BenefitBuilder withPlanId(Integer planId) {
		this.planId = planId;
	return this;}



	/**
	 * @param benefitId the benefitId to with
	 */
	public BenefitBuilder withBenefitId(Integer benefitId) {
		this.benefitId = benefitId;
	return this;}



	/**
	 * @param companyId the companyId to with
	 */
	public BenefitBuilder withCompanyId(String companyId) {
		this.companyId = companyId;
	return this;}



	/**
	 * @param description the description to with
	 */
	public BenefitBuilder withDescription(String description) {
		this.description = description;
	return this;}



	/**
	 * @param benefitType the benefitType to with
	 */
	public BenefitBuilder withBenefitType(BenefitType benefitType) {
		this.benefitType = benefitType;
	return this;}



	/**
	 * @param status the status to with
	 */
	public BenefitBuilder withStatus(String status) {
		this.status = status;
	return this;}



	/**
	 * @param subStatus the subStatus to with
	 */
	public BenefitBuilder withSubStatus(String subStatus) {
		this.subStatus = subStatus;
	return this;}



	/**
	 * @param benefitValue the benefitValue to with
	 */
	public BenefitBuilder withBenefitValue(Double benefitValue) {
		this.benefitValue = benefitValue;
	return this;}



	/**
	 * @param beneficiaryBirthDate the beneficiaryBirthDate to with
	 */
	public BenefitBuilder withBeneficiaryBirthDate(XMLGregorianCalendar beneficiaryBirthDate) {
		this.beneficiaryBirthDate = beneficiaryBirthDate;
	return this;}



	/**
	 * @param certificate the certificate to with
	 */
	public BenefitBuilder withCertificate(Certificate certificate) {
		this.certificate = certificate;
	return this;}



	/**
	 * @param legalIdentifier the legalIdentifier to with
	 */
	public BenefitBuilder withLegalIdentifier(String legalIdentifier) {
		this.legalIdentifier = legalIdentifier;
	return this;}



	/**
	 * @param initialContributionValue the initialContributionValue to with
	 */
	public BenefitBuilder withInitialContributionValue(Double initialContributionValue) {
		this.initialContributionValue = initialContributionValue;
	return this;}



	/**
	 * @param expectedContributionValue the expectedContributionValue to with
	 */
	public BenefitBuilder withExpectedContributionValue(Double expectedContributionValue) {
		this.expectedContributionValue = expectedContributionValue;
	return this;}



	/**
	 * @param beneficiarySex the beneficiarySex to with
	 */
	public BenefitBuilder withBeneficiarySex(SexType beneficiarySex) {
		this.beneficiarySex = beneficiarySex;
	return this;}



	/**
	 * @param youngestBirthDate the youngestBirthDate to with
	 */
	public BenefitBuilder withYoungestBirthDate(XMLGregorianCalendar youngestBirthDate) {
		this.youngestBirthDate = youngestBirthDate;
	return this;}



	/**
	 * @param youngestSex the youngestSex to with
	 */
	public BenefitBuilder withYoungestSex(SexType youngestSex) {
		this.youngestSex = youngestSex;
	return this;}



	/**
	 * @param reversionPct the reversionPct to with
	 */
	public BenefitBuilder withReversionPct(Double reversionPct) {
		this.reversionPct = reversionPct;
	return this;}



	/**
	 * @param childrenReversionPct the childrenReversionPct to with
	 */
	public BenefitBuilder withChildrenReversionPct(Double childrenReversionPct) {
		this.childrenReversionPct = childrenReversionPct;
	return this;}



	/**
	 * @param desiredTerm the desiredTerm to with
	 */
	public BenefitBuilder withDesiredTerm(Integer desiredTerm) {
		this.desiredTerm = desiredTerm;
	return this;}



	/**
	 * @param estimatedBenefitValue the estimatedBenefitValue to with
	 */
	public BenefitBuilder withEstimatedBenefitValue(Double estimatedBenefitValue) {
		this.estimatedBenefitValue = estimatedBenefitValue;
	return this;}



	/**
	 * @param incomeFactor the incomeFactor to with
	 */
	public BenefitBuilder withIncomeFactor(Double incomeFactor) {
		this.incomeFactor = incomeFactor;
	return this;}



	/**
	 * @param premium the premium to with
	 */
	public BenefitBuilder withPremium(Double premium) {
		this.premium = premium;
	return this;}



	/**
	 * @param incomeDescription the incomeDescription to with
	 */
	public BenefitBuilder withIncomeDescription(String incomeDescription) {
		this.incomeDescription = incomeDescription;
	return this;}



	/**
	 * @param availableIncomeTypes the availableIncomeTypes to with
	 */
	public BenefitBuilder withAvailableIncomeTypes(List<IncomeType> availableIncomeTypes) {
		this.availableIncomeTypes = availableIncomeTypes;
	return this;}



	/**
	 * @param incomeType the incomeType to with
	 */
	public BenefitBuilder withIncomeType(Integer incomeType) {
		this.incomeType = incomeType;
	return this;}



	/**
	 * @param reversionAllowedInd the reversionAllowedInd to with
	 */
	public BenefitBuilder withReversionAllowedInd(String reversionAllowedInd) {
		this.reversionAllowedInd = reversionAllowedInd;
	return this;}



	/**
	 * @param calculationType the calculationType to with
	 */
	public BenefitBuilder withCalculationType(String calculationType) {
		this.calculationType = calculationType;
	return this;}



	/**
	 * @param contractDate the contractDate to with
	 */
	public BenefitBuilder withContractDate(XMLGregorianCalendar contractDate) {
		this.contractDate = contractDate;
	return this;}



	/**
	 * @param legalHeir the legalHeir to with
	 */
	public BenefitBuilder withLegalHeir(Boolean legalHeir) {
		this.legalHeir = legalHeir;
	return this;}



	/**
	 * @param beneficiaries the beneficiaries to with
	 */
	public BenefitBuilder withBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	return this;}



	/**
	 * @param funds the funds to with
	 */
	public BenefitBuilder withFunds(List<Fund> funds) {
		this.funds = funds;
	return this;}



	/**
	 * @param reserves the reserves to with
	 */
	public BenefitBuilder withReserves(List<Reserve> reserves) {
		this.reserves = reserves;
	return this;}



	/**
	 * @param incomeFee the incomeFee to with
	 */
	public BenefitBuilder withIncomeFee(ParameterizedValue incomeFee) {
		this.incomeFee = incomeFee;
	return this;}



	/**
	 * @param updateIndex the updateIndex to with
	 */
	public BenefitBuilder withUpdateIndex(String updateIndex) {
		this.updateIndex = updateIndex;
	return this;}



	/**
	 * @param reversionType the reversionType to with
	 */
	public BenefitBuilder withReversionType(String reversionType) {
		this.reversionType = reversionType;
	return this;}



	/**
	 * @param coverageType the coverageType to with
	 */
	public BenefitBuilder withCoverageType(String coverageType) {
		this.coverageType = coverageType;
	return this;}



	public Benefit createBenefit() {
		return new Benefit(planId, benefitId, companyId, description, benefitType, status, subStatus, benefitValue,
				expectedContributionValue, initialContributionValue, legalIdentifier, certificate, beneficiaryBirthDate,
				beneficiarySex, youngestBirthDate, youngestSex, reversionPct, childrenReversionPct, desiredTerm,
				incomeType, availableIncomeTypes, incomeDescription, premium, incomeFactor, estimatedBenefitValue,
				reversionAllowedInd, calculationType, contractDate, legalHeir, beneficiaries, funds, reserves,
				coverageType, reversionType, updateIndex, incomeFee);
	}

}
