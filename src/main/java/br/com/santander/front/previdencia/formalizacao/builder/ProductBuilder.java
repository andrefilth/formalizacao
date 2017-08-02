package br.com.santander.front.previdencia.formalizacao.builder;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.entity.Product;
import br.com.santander.front.previdencia.formalizacao.type.ProductBeneficiaryType;
import br.com.santander.front.previdencia.formalizacao.type.ProductType;

public class ProductBuilder {

	private String companyId;
	private String productId;
	private String description;
	private String productCategoryId;
	private XMLGregorianCalendar validSince;
	private XMLGregorianCalendar validThru;
	private Boolean employeeType;
	private ProductBeneficiaryType productBeneficiaryType;
	private Double balanceValue;
	private ProductType productType;
	private String subProductCategoryId;
	private Boolean isSimulationAllowedOnWeb;

	
	
	/**
	 * @param companyId the companyId to with
	 */
	public ProductBuilder withCompanyId(String companyId) {
		this.companyId = companyId;
	return this;}



	/**
	 * @param productId the productId to with
	 */
	public ProductBuilder withProductId(String productId) {
		this.productId = productId;
	return this;}



	/**
	 * @param description the description to with
	 */
	public ProductBuilder withDescription(String description) {
		this.description = description;
	return this;}



	/**
	 * @param productCategoryId the productCategoryId to with
	 */
	public ProductBuilder withProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	return this;}



	/**
	 * @param validSince the validSince to with
	 */
	public ProductBuilder withValidSince(XMLGregorianCalendar validSince) {
		this.validSince = validSince;
	return this;}



	/**
	 * @param validThru the validThru to with
	 */
	public ProductBuilder withValidThru(XMLGregorianCalendar validThru) {
		this.validThru = validThru;
	return this;}



	/**
	 * @param employeeType the employeeType to with
	 */
	public ProductBuilder withEmployeeType(Boolean employeeType) {
		this.employeeType = employeeType;
	return this;}



	/**
	 * @param productBeneficiaryType the productBeneficiaryType to with
	 */
	public ProductBuilder withProductBeneficiaryType(ProductBeneficiaryType productBeneficiaryType) {
		this.productBeneficiaryType = productBeneficiaryType;
	return this;}



	/**
	 * @param balanceValue the balanceValue to with
	 */
	public ProductBuilder withBalanceValue(Double balanceValue) {
		this.balanceValue = balanceValue;
	return this;}



	/**
	 * @param productType the productType to with
	 */
	public ProductBuilder withProductType(ProductType productType) {
		this.productType = productType;
	return this;}



	/**
	 * @param subProductCategoryId the subProductCategoryId to with
	 */
	public ProductBuilder withSubProductCategoryId(String subProductCategoryId) {
		this.subProductCategoryId = subProductCategoryId;
	return this;}



	/**
	 * @param isSimulationAllowedOnWeb the isSimulationAllowedOnWeb to with
	 */
	public ProductBuilder withIsSimulationAllowedOnWeb(Boolean isSimulationAllowedOnWeb) {
		this.isSimulationAllowedOnWeb = isSimulationAllowedOnWeb;
		return this;
	}



	public Product createProduct() {
		return new Product(companyId, productId, description, productCategoryId, validSince, validThru,
				subProductCategoryId, productType, balanceValue, productBeneficiaryType, employeeType,
				isSimulationAllowedOnWeb);
	}

}
