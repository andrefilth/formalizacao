
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.type.ProductBeneficiaryType;
import br.com.santander.front.previdencia.formalizacao.type.ProductType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "companyId",
    "productId",
    "description",
    "productCategoryId",
    "validSince",
    "validThru",
    "subProductCategoryId",
    "productType",
    "balanceValue",
    "productBeneficiaryType",
    "employeeType",
    "isSimulationAllowedOnWeb"
})
public class Product {

    protected String companyId;
    protected String productId;
    protected String description;
    protected String productCategoryId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validSince;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validThru;
    protected String subProductCategoryId;
    @XmlSchemaType(name = "string")
    protected ProductType productType;
    protected Double balanceValue;
    @XmlSchemaType(name = "string")
    protected ProductBeneficiaryType productBeneficiaryType;
    protected Boolean employeeType;
    protected Boolean isSimulationAllowedOnWeb;
    
    

    /**
	 * 
	 */
	public Product() {
	}

	/**
	 * @param companyId
	 * @param productId
	 * @param description
	 * @param productCategoryId
	 * @param validSince
	 * @param validThru
	 * @param subProductCategoryId
	 * @param productType
	 * @param balanceValue
	 * @param productBeneficiaryType
	 * @param employeeType
	 * @param isSimulationAllowedOnWeb
	 */
	public Product(String companyId, String productId, String description, String productCategoryId,
			XMLGregorianCalendar validSince, XMLGregorianCalendar validThru, String subProductCategoryId,
			ProductType productType, Double balanceValue, ProductBeneficiaryType productBeneficiaryType,
			Boolean employeeType, Boolean isSimulationAllowedOnWeb) {
		this.companyId = companyId;
		this.productId = productId;
		this.description = description;
		this.productCategoryId = productCategoryId;
		this.validSince = validSince;
		this.validThru = validThru;
		this.subProductCategoryId = subProductCategoryId;
		this.productType = productType;
		this.balanceValue = balanceValue;
		this.productBeneficiaryType = productBeneficiaryType;
		this.employeeType = employeeType;
		this.isSimulationAllowedOnWeb = isSimulationAllowedOnWeb;
	}

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
     * Obt�m o valor da propriedade productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define o valor da propriedade productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obt�m o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obt�m o valor da propriedade productCategoryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * Define o valor da propriedade productCategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategoryId(String value) {
        this.productCategoryId = value;
    }

    /**
     * Obt�m o valor da propriedade validSince.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidSince() {
        return validSince;
    }

    /**
     * Define o valor da propriedade validSince.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidSince(XMLGregorianCalendar value) {
        this.validSince = value;
    }

    /**
     * Obt�m o valor da propriedade validThru.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidThru() {
        return validThru;
    }

    /**
     * Define o valor da propriedade validThru.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidThru(XMLGregorianCalendar value) {
        this.validThru = value;
    }

    /**
     * Obt�m o valor da propriedade subProductCategoryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProductCategoryId() {
        return subProductCategoryId;
    }

    /**
     * Define o valor da propriedade subProductCategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProductCategoryId(String value) {
        this.subProductCategoryId = value;
    }

    /**
     * Obt�m o valor da propriedade productType.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Define o valor da propriedade productType.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Obt�m o valor da propriedade balanceValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceValue() {
        return balanceValue;
    }

    /**
     * Define o valor da propriedade balanceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceValue(Double value) {
        this.balanceValue = value;
    }

    /**
     * Obt�m o valor da propriedade productBeneficiaryType.
     * 
     * @return
     *     possible object is
     *     {@link ProductBeneficiaryType }
     *     
     */
    public ProductBeneficiaryType getProductBeneficiaryType() {
        return productBeneficiaryType;
    }

    /**
     * Define o valor da propriedade productBeneficiaryType.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBeneficiaryType }
     *     
     */
    public void setProductBeneficiaryType(ProductBeneficiaryType value) {
        this.productBeneficiaryType = value;
    }

    /**
     * Obt�m o valor da propriedade employeeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployeeType() {
        return employeeType;
    }

    /**
     * Define o valor da propriedade employeeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployeeType(Boolean value) {
        this.employeeType = value;
    }

    /**
     * Obt�m o valor da propriedade isSimulationAllowedOnWeb.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSimulationAllowedOnWeb() {
        return isSimulationAllowedOnWeb;
    }

    /**
     * Define o valor da propriedade isSimulationAllowedOnWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSimulationAllowedOnWeb(Boolean value) {
        this.isSimulationAllowedOnWeb = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [");
		if (companyId != null) {
			builder.append("companyId=");
			builder.append(companyId);
			builder.append(", ");
		}
		if (productId != null) {
			builder.append("productId=");
			builder.append(productId);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (productCategoryId != null) {
			builder.append("productCategoryId=");
			builder.append(productCategoryId);
			builder.append(", ");
		}
		if (validSince != null) {
			builder.append("validSince=");
			builder.append(validSince);
			builder.append(", ");
		}
		if (validThru != null) {
			builder.append("validThru=");
			builder.append(validThru);
			builder.append(", ");
		}
		if (subProductCategoryId != null) {
			builder.append("subProductCategoryId=");
			builder.append(subProductCategoryId);
			builder.append(", ");
		}
		if (productType != null) {
			builder.append("productType=");
			builder.append(productType);
			builder.append(", ");
		}
		if (balanceValue != null) {
			builder.append("balanceValue=");
			builder.append(balanceValue);
			builder.append(", ");
		}
		if (productBeneficiaryType != null) {
			builder.append("productBeneficiaryType=");
			builder.append(productBeneficiaryType);
			builder.append(", ");
		}
		if (employeeType != null) {
			builder.append("employeeType=");
			builder.append(employeeType);
			builder.append(", ");
		}
		if (isSimulationAllowedOnWeb != null) {
			builder.append("isSimulationAllowedOnWeb=");
			builder.append(isSimulationAllowedOnWeb);
		}
		builder.append("]");
		return builder.toString();
	}

    
}
