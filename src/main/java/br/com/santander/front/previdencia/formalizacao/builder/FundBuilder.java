package br.com.santander.front.previdencia.formalizacao.builder;

import br.com.santander.front.previdencia.formalizacao.entity.Benefit;
import br.com.santander.front.previdencia.formalizacao.entity.Fund;
import br.com.santander.front.previdencia.formalizacao.entity.Person;

public class FundBuilder {

	private String fundId;
	private Double distributionPercent;
	private String description;
	private String currencyId;
	private String currencyDescription;
	private String cnpj;
	private String fundType;
	private Benefit benefit;
	private Person person;
	private Double grossValue;
	private Double netValue;
	private Double balanceValue;
	private String dailyClosing;
	private String active;
	private String companyId;

	

	/**
	 * @param fundId the fundId to with
	 */
	public FundBuilder withFundId(String fundId) {
		this.fundId = fundId;
	return this;}



	/**
	 * @param distributionPercent the distributionPercent to with
	 */
	public FundBuilder withDistributionPercent(Double distributionPercent) {
		this.distributionPercent = distributionPercent;
	return this;}



	/**
	 * @param description the description to with
	 */
	public FundBuilder withDescription(String description) {
		this.description = description;
	return this;}



	/**
	 * @param currencyId the currencyId to with
	 */
	public FundBuilder withCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	return this;}



	/**
	 * @param currencyDescription the currencyDescription to with
	 */
	public FundBuilder withCurrencyDescription(String currencyDescription) {
		this.currencyDescription = currencyDescription;
	return this;}



	/**
	 * @param cnpj the cnpj to with
	 */
	public FundBuilder withCnpj(String cnpj) {
		this.cnpj = cnpj;
	return this;}



	/**
	 * @param fundType the fundType to with
	 */
	public FundBuilder withFundType(String fundType) {
		this.fundType = fundType;
	return this;}



	/**
	 * @param benefit the benefit to with
	 */
	public FundBuilder withBenefit(Benefit benefit) {
		this.benefit = benefit;
	return this;}



	/**
	 * @param person the person to with
	 */
	public FundBuilder withPerson(Person person) {
		this.person = person;
	return this;}



	/**
	 * @param grossValue the grossValue to with
	 */
	public FundBuilder withGrossValue(Double grossValue) {
		this.grossValue = grossValue;
	return this;}



	/**
	 * @param netValue the netValue to with
	 */
	public FundBuilder withNetValue(Double netValue) {
		this.netValue = netValue;
	return this;}



	/**
	 * @param balanceValue the balanceValue to with
	 */
	public FundBuilder withBalanceValue(Double balanceValue) {
		this.balanceValue = balanceValue;
	return this;}



	/**
	 * @param dailyClosing the dailyClosing to with
	 */
	public FundBuilder withDailyClosing(String dailyClosing) {
		this.dailyClosing = dailyClosing;
	return this;}



	/**
	 * @param active the active to with
	 */
	public FundBuilder withActive(String active) {
		this.active = active;
	return this;}



	/**
	 * @param companyId the companyId to with
	 */
	public FundBuilder withCompanyId(String companyId) {
		this.companyId = companyId;
		return this;
	}



	public Fund createFund() {
		return new Fund(fundId, description, distributionPercent, currencyId, currencyDescription, cnpj, fundType,
				benefit, person, grossValue, netValue, balanceValue, dailyClosing, active, companyId);
	}

}
