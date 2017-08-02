package br.com.santander.front.previdencia.formalizacao.builder;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.entity.Address;
import br.com.santander.front.previdencia.formalizacao.entity.ParameterizedValue;
import br.com.santander.front.previdencia.formalizacao.entity.Payment;
import br.com.santander.front.previdencia.formalizacao.type.PaymentMethod;

public class PaymentBuilder {

	private String paymentTypeId;
	private String paymentDescription;
	private Integer recoveryChannelId;
	private XMLGregorianCalendar paymentDate;
	private Integer paymentDay;
	private PaymentMethod paymentMethod;
	private String bankAccountNumber;
	private String bankBranchNumberDigit;
	private String bankBranchNumber;
	private String bankNumber;
	private String bankAccountType;
	private Address address;
	private String bankAccountNumberDigit;
	private String finantialResponsiblePersonId;
	private Boolean bankRequiredInd;
	private Boolean agencyRequiredInd;
	private ParameterizedValue incomeFee;
	private XMLGregorianCalendar nextPaymentDate;
	private Double paymentValue;
	private Boolean initialPaymentInd;
	private String holderName;
	private Boolean accountRequiredInd;

	
	/**
	 * @param paymentTypeId the paymentTypeId to with
	 */
	public PaymentBuilder withPaymentTypeId(String paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	return this;}


	/**
	 * @param paymentDescription the paymentDescription to with
	 */
	public PaymentBuilder withPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	return this;}


	/**
	 * @param recoveryChannelId the recoveryChannelId to with
	 */
	public PaymentBuilder withRecoveryChannelId(Integer recoveryChannelId) {
		this.recoveryChannelId = recoveryChannelId;
	return this;}


	/**
	 * @param paymentDate the paymentDate to with
	 */
	public PaymentBuilder withPaymentDate(XMLGregorianCalendar paymentDate) {
		this.paymentDate = paymentDate;
	return this;}


	/**
	 * @param paymentDay the paymentDay to with
	 */
	public PaymentBuilder withPaymentDay(Integer paymentDay) {
		this.paymentDay = paymentDay;
	return this;}


	/**
	 * @param paymentMethod the paymentMethod to with
	 */
	public PaymentBuilder withPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	return this;}


	/**
	 * @param bankAccountNumber the bankAccountNumber to with
	 */
	public PaymentBuilder withBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	return this;}


	/**
	 * @param bankBranchNumberDigit the bankBranchNumberDigit to with
	 */
	public PaymentBuilder withBankBranchNumberDigit(String bankBranchNumberDigit) {
		this.bankBranchNumberDigit = bankBranchNumberDigit;
	return this;}


	/**
	 * @param bankBranchNumber the bankBranchNumber to with
	 */
	public PaymentBuilder withBankBranchNumber(String bankBranchNumber) {
		this.bankBranchNumber = bankBranchNumber;
	return this;}


	/**
	 * @param bankNumber the bankNumber to with
	 */
	public PaymentBuilder withBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	return this;}


	/**
	 * @param bankAccountType the bankAccountType to with
	 */
	public PaymentBuilder withBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	return this;}


	/**
	 * @param address the address to with
	 */
	public PaymentBuilder withAddress(Address address) {
		this.address = address;
	return this;}


	/**
	 * @param bankAccountNumberDigit the bankAccountNumberDigit to with
	 */
	public PaymentBuilder withBankAccountNumberDigit(String bankAccountNumberDigit) {
		this.bankAccountNumberDigit = bankAccountNumberDigit;
	return this;}


	/**
	 * @param finantialResponsiblePersonId the finantialResponsiblePersonId to with
	 */
	public PaymentBuilder withFinantialResponsiblePersonId(String finantialResponsiblePersonId) {
		this.finantialResponsiblePersonId = finantialResponsiblePersonId;
	return this;}


	/**
	 * @param bankRequiredInd the bankRequiredInd to with
	 */
	public PaymentBuilder withBankRequiredInd(Boolean bankRequiredInd) {
		this.bankRequiredInd = bankRequiredInd;
	return this;}


	/**
	 * @param agencyRequiredInd the agencyRequiredInd to with
	 */
	public PaymentBuilder withAgencyRequiredInd(Boolean agencyRequiredInd) {
		this.agencyRequiredInd = agencyRequiredInd;
	return this;}


	/**
	 * @param incomeFee the incomeFee to with
	 */
	public PaymentBuilder withIncomeFee(ParameterizedValue incomeFee) {
		this.incomeFee = incomeFee;
	return this;}


	/**
	 * @param nextPaymentDate the nextPaymentDate to with
	 */
	public PaymentBuilder withNextPaymentDate(XMLGregorianCalendar nextPaymentDate) {
		this.nextPaymentDate = nextPaymentDate;
	return this;}


	/**
	 * @param paymentValue the paymentValue to with
	 */
	public PaymentBuilder withPaymentValue(Double paymentValue) {
		this.paymentValue = paymentValue;
	return this;}


	/**
	 * @param initialPaymentInd the initialPaymentInd to with
	 */
	public PaymentBuilder withInitialPaymentInd(Boolean initialPaymentInd) {
		this.initialPaymentInd = initialPaymentInd;
	return this;}


	/**
	 * @param holderName the holderName to with
	 */
	public PaymentBuilder withHolderName(String holderName) {
		this.holderName = holderName;
	return this;}


	/**
	 * @param accountRequiredInd the accountRequiredInd to with
	 */
	public PaymentBuilder withAccountRequiredInd(Boolean accountRequiredInd) {
		this.accountRequiredInd = accountRequiredInd;
		return this;
	}


	public Payment createPayment() {
		return new Payment(paymentTypeId, paymentDescription, recoveryChannelId, paymentDate, paymentDay, paymentMethod,
				address, bankAccountType, bankNumber, bankBranchNumber, bankBranchNumberDigit, bankAccountNumber,
				bankAccountNumberDigit, finantialResponsiblePersonId, bankRequiredInd, agencyRequiredInd,
				accountRequiredInd, holderName, initialPaymentInd, paymentValue, nextPaymentDate, incomeFee);
	}

}
