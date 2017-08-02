
package br.com.santander.front.previdencia.formalizacao.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.type.BenefitType;
import br.com.santander.front.previdencia.formalizacao.type.SexType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Benefit", propOrder = {
    "planId",
    "benefitId",
    "companyId",
    "description",
    "benefitType",
    "status",
    "subStatus",
    "benefitValue",
    "expectedContributionValue",
    "initialContributionValue",
    "legalIdentifier",
    "certificate",
    "beneficiaryBirthDate",
    "beneficiarySex",
    "youngestBirthDate",
    "youngestSex",
    "reversionPct",
    "childrenReversionPct",
    "desiredTerm",
    "incomeType",
    "availableIncomeTypes",
    "incomeDescription",
    "premium",
    "incomeFactor",
    "estimatedBenefitValue",
    "reversionAllowedInd",
    "calculationType",
    "contractDate",
    "legalHeir",
    "beneficiaries",
    "funds",
    "reserves",
    "coverageType",
    "reversionType",
    "updateIndex",
    "incomeFee"
})
public class Benefit {

    protected Integer planId;
    protected Integer benefitId;
    protected String companyId;
    protected String description;
    @XmlSchemaType(name = "string")
    protected BenefitType benefitType;
    protected String status;
    protected String subStatus;
    protected Double benefitValue;
    protected Double expectedContributionValue;
    protected Double initialContributionValue;
    protected String legalIdentifier;
    protected Certificate certificate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beneficiaryBirthDate;
    @XmlSchemaType(name = "string")
    protected SexType beneficiarySex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar youngestBirthDate;
    @XmlSchemaType(name = "string")
    protected SexType youngestSex;
    protected Double reversionPct;
    protected Double childrenReversionPct;
    protected Integer desiredTerm;
    protected Integer incomeType;
    @XmlElement(nillable = true)
    protected List<IncomeType> availableIncomeTypes;
    protected String incomeDescription;
    protected Double premium;
    protected Double incomeFactor;
    protected Double estimatedBenefitValue;
    protected String reversionAllowedInd;
    protected String calculationType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDate;
    protected Boolean legalHeir;
    @XmlElement(nillable = true)
    protected List<Beneficiary> beneficiaries;
    @XmlElement(nillable = true)
    protected List<Fund> funds;
    @XmlElement(nillable = true)
    protected List<Reserve> reserves;
    protected String coverageType;
    protected String reversionType;
    protected String updateIndex;
    protected ParameterizedValue incomeFee;
    
    

    /**
	 * 
	 */
	public Benefit() {
	}

	/**
	 * @param planId
	 * @param benefitId
	 * @param companyId
	 * @param description
	 * @param benefitType
	 * @param status
	 * @param subStatus
	 * @param benefitValue
	 * @param expectedContributionValue
	 * @param initialContributionValue
	 * @param legalIdentifier
	 * @param certificate
	 * @param beneficiaryBirthDate
	 * @param beneficiarySex
	 * @param youngestBirthDate
	 * @param youngestSex
	 * @param reversionPct
	 * @param childrenReversionPct
	 * @param desiredTerm
	 * @param incomeType
	 * @param availableIncomeTypes
	 * @param incomeDescription
	 * @param premium
	 * @param incomeFactor
	 * @param estimatedBenefitValue
	 * @param reversionAllowedInd
	 * @param calculationType
	 * @param contractDate
	 * @param legalHeir
	 * @param beneficiaries
	 * @param funds
	 * @param reserves
	 * @param coverageType
	 * @param reversionType
	 * @param updateIndex
	 * @param incomeFee
	 */
	public Benefit(Integer planId, Integer benefitId, String companyId, String description, BenefitType benefitType, String status,
			String subStatus, Double benefitValue, Double expectedContributionValue, Double initialContributionValue,
			String legalIdentifier, Certificate certificate, XMLGregorianCalendar beneficiaryBirthDate, SexType beneficiarySex,
			XMLGregorianCalendar youngestBirthDate, SexType youngestSex, Double reversionPct, Double childrenReversionPct,
			Integer desiredTerm, Integer incomeType, List<IncomeType> availableIncomeTypes, String incomeDescription, Double premium,
			Double incomeFactor, Double estimatedBenefitValue, String reversionAllowedInd, String calculationType,
			XMLGregorianCalendar contractDate, Boolean legalHeir, List<Beneficiary> beneficiaries, List<Fund> funds, List<Reserve> reserves,
			String coverageType, String reversionType, String updateIndex, ParameterizedValue incomeFee) {
		this.planId = planId;
		this.benefitId = benefitId;
		this.companyId = companyId;
		this.description = description;
		this.benefitType = benefitType;
		this.status = status;
		this.subStatus = subStatus;
		this.benefitValue = benefitValue;
		this.expectedContributionValue = expectedContributionValue;
		this.initialContributionValue = initialContributionValue;
		this.legalIdentifier = legalIdentifier;
		this.certificate = certificate;
		this.beneficiaryBirthDate = beneficiaryBirthDate;
		this.beneficiarySex = beneficiarySex;
		this.youngestBirthDate = youngestBirthDate;
		this.youngestSex = youngestSex;
		this.reversionPct = reversionPct;
		this.childrenReversionPct = childrenReversionPct;
		this.desiredTerm = desiredTerm;
		this.incomeType = incomeType;
		this.availableIncomeTypes = availableIncomeTypes;
		this.incomeDescription = incomeDescription;
		this.premium = premium;
		this.incomeFactor = incomeFactor;
		this.estimatedBenefitValue = estimatedBenefitValue;
		this.reversionAllowedInd = reversionAllowedInd;
		this.calculationType = calculationType;
		this.contractDate = contractDate;
		this.legalHeir = legalHeir;
		this.beneficiaries = beneficiaries;
		this.funds = funds;
		this.reserves = reserves;
		this.coverageType = coverageType;
		this.reversionType = reversionType;
		this.updateIndex = updateIndex;
		this.incomeFee = incomeFee;
	}

	/**
     * Obt�m o valor da propriedade planId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanId() {
        return planId;
    }

    /**
     * Define o valor da propriedade planId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanId(Integer value) {
        this.planId = value;
    }

    /**
     * Obt�m o valor da propriedade benefitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBenefitId() {
        return benefitId;
    }

    /**
     * Define o valor da propriedade benefitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBenefitId(Integer value) {
        this.benefitId = value;
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
     * Obt�m o valor da propriedade benefitType.
     * 
     * @return
     *     possible object is
     *     {@link BenefitType }
     *     
     */
    public BenefitType getBenefitType() {
        return benefitType;
    }

    /**
     * Define o valor da propriedade benefitType.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitType }
     *     
     */
    public void setBenefitType(BenefitType value) {
        this.benefitType = value;
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
     * Obt�m o valor da propriedade benefitValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBenefitValue() {
        return benefitValue;
    }

    /**
     * Define o valor da propriedade benefitValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBenefitValue(Double value) {
        this.benefitValue = value;
    }

    /**
     * Obt�m o valor da propriedade expectedContributionValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedContributionValue() {
        return expectedContributionValue;
    }

    /**
     * Define o valor da propriedade expectedContributionValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedContributionValue(Double value) {
        this.expectedContributionValue = value;
    }

    /**
     * Obt�m o valor da propriedade initialContributionValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialContributionValue() {
        return initialContributionValue;
    }

    /**
     * Define o valor da propriedade initialContributionValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialContributionValue(Double value) {
        this.initialContributionValue = value;
    }

    /**
     * Obt�m o valor da propriedade legalIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalIdentifier() {
        return legalIdentifier;
    }

    /**
     * Define o valor da propriedade legalIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalIdentifier(String value) {
        this.legalIdentifier = value;
    }

    /**
     * Obt�m o valor da propriedade certificate.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * Define o valor da propriedade certificate.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setCertificate(Certificate value) {
        this.certificate = value;
    }

    /**
     * Obt�m o valor da propriedade beneficiaryBirthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeneficiaryBirthDate() {
        return beneficiaryBirthDate;
    }

    /**
     * Define o valor da propriedade beneficiaryBirthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeneficiaryBirthDate(XMLGregorianCalendar value) {
        this.beneficiaryBirthDate = value;
    }

    /**
     * Obt�m o valor da propriedade beneficiarySex.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getBeneficiarySex() {
        return beneficiarySex;
    }

    /**
     * Define o valor da propriedade beneficiarySex.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setBeneficiarySex(SexType value) {
        this.beneficiarySex = value;
    }

    /**
     * Obt�m o valor da propriedade youngestBirthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYoungestBirthDate() {
        return youngestBirthDate;
    }

    /**
     * Define o valor da propriedade youngestBirthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYoungestBirthDate(XMLGregorianCalendar value) {
        this.youngestBirthDate = value;
    }

    /**
     * Obt�m o valor da propriedade youngestSex.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getYoungestSex() {
        return youngestSex;
    }

    /**
     * Define o valor da propriedade youngestSex.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setYoungestSex(SexType value) {
        this.youngestSex = value;
    }

    /**
     * Obt�m o valor da propriedade reversionPct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReversionPct() {
        return reversionPct;
    }

    /**
     * Define o valor da propriedade reversionPct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReversionPct(Double value) {
        this.reversionPct = value;
    }

    /**
     * Obt�m o valor da propriedade childrenReversionPct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChildrenReversionPct() {
        return childrenReversionPct;
    }

    /**
     * Define o valor da propriedade childrenReversionPct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChildrenReversionPct(Double value) {
        this.childrenReversionPct = value;
    }

    /**
     * Obt�m o valor da propriedade desiredTerm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDesiredTerm() {
        return desiredTerm;
    }

    /**
     * Define o valor da propriedade desiredTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDesiredTerm(Integer value) {
        this.desiredTerm = value;
    }

    /**
     * Obt�m o valor da propriedade incomeType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncomeType() {
        return incomeType;
    }

    /**
     * Define o valor da propriedade incomeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncomeType(Integer value) {
        this.incomeType = value;
    }

    /**
     * Gets the value of the availableIncomeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableIncomeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableIncomeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomeType }
     * 
     * 
     */
    public List<IncomeType> getAvailableIncomeTypes() {
        if (availableIncomeTypes == null) {
            availableIncomeTypes = new ArrayList<IncomeType>();
        }
        return this.availableIncomeTypes;
    }

    /**
     * Obt�m o valor da propriedade incomeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeDescription() {
        return incomeDescription;
    }

    /**
     * Define o valor da propriedade incomeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeDescription(String value) {
        this.incomeDescription = value;
    }

    /**
     * Obt�m o valor da propriedade premium.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremium() {
        return premium;
    }

    /**
     * Define o valor da propriedade premium.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremium(Double value) {
        this.premium = value;
    }

    /**
     * Obt�m o valor da propriedade incomeFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIncomeFactor() {
        return incomeFactor;
    }

    /**
     * Define o valor da propriedade incomeFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIncomeFactor(Double value) {
        this.incomeFactor = value;
    }

    /**
     * Obt�m o valor da propriedade estimatedBenefitValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedBenefitValue() {
        return estimatedBenefitValue;
    }

    /**
     * Define o valor da propriedade estimatedBenefitValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedBenefitValue(Double value) {
        this.estimatedBenefitValue = value;
    }

    /**
     * Obt�m o valor da propriedade reversionAllowedInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversionAllowedInd() {
        return reversionAllowedInd;
    }

    /**
     * Define o valor da propriedade reversionAllowedInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversionAllowedInd(String value) {
        this.reversionAllowedInd = value;
    }

    /**
     * Obt�m o valor da propriedade calculationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationType() {
        return calculationType;
    }

    /**
     * Define o valor da propriedade calculationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationType(String value) {
        this.calculationType = value;
    }

    /**
     * Obt�m o valor da propriedade contractDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Define o valor da propriedade contractDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Obt�m o valor da propriedade legalHeir.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalHeir() {
        return legalHeir;
    }

    /**
     * Define o valor da propriedade legalHeir.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalHeir(Boolean value) {
        this.legalHeir = value;
    }

    /**
     * Gets the value of the beneficiaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Beneficiary }
     * 
     * 
     */
    public List<Beneficiary> getBeneficiaries() {
        if (beneficiaries == null) {
            beneficiaries = new ArrayList<Beneficiary>();
        }
        return this.beneficiaries;
    }

    /**
     * Gets the value of the funds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fund }
     * 
     * 
     */
    public List<Fund> getFunds() {
        if (funds == null) {
            funds = new ArrayList<Fund>();
        }
        return this.funds;
    }

    /**
     * Gets the value of the reserves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reserves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReserves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reserve }
     * 
     * 
     */
    public List<Reserve> getReserves() {
        if (reserves == null) {
            reserves = new ArrayList<Reserve>();
        }
        return this.reserves;
    }

    /**
     * Obt�m o valor da propriedade coverageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageType() {
        return coverageType;
    }

    /**
     * Define o valor da propriedade coverageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageType(String value) {
        this.coverageType = value;
    }

    /**
     * Obt�m o valor da propriedade reversionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversionType() {
        return reversionType;
    }

    /**
     * Define o valor da propriedade reversionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversionType(String value) {
        this.reversionType = value;
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
     * Obt�m o valor da propriedade incomeFee.
     * 
     * @return
     *     possible object is
     *     {@link ParameterizedValue }
     *     
     */
    public ParameterizedValue getIncomeFee() {
        return incomeFee;
    }

    /**
     * Define o valor da propriedade incomeFee.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterizedValue }
     *     
     */
    public void setIncomeFee(ParameterizedValue value) {
        this.incomeFee = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Benefit [");
		if (planId != null) {
			builder.append("planId=");
			builder.append(planId);
			builder.append(", ");
		}
		if (benefitId != null) {
			builder.append("benefitId=");
			builder.append(benefitId);
			builder.append(", ");
		}
		if (companyId != null) {
			builder.append("companyId=");
			builder.append(companyId);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (benefitType != null) {
			builder.append("benefitType=");
			builder.append(benefitType);
			builder.append(", ");
		}
		if (status != null) {
			builder.append("status=");
			builder.append(status);
			builder.append(", ");
		}
		if (subStatus != null) {
			builder.append("subStatus=");
			builder.append(subStatus);
			builder.append(", ");
		}
		if (benefitValue != null) {
			builder.append("benefitValue=");
			builder.append(benefitValue);
			builder.append(", ");
		}
		if (expectedContributionValue != null) {
			builder.append("expectedContributionValue=");
			builder.append(expectedContributionValue);
			builder.append(", ");
		}
		if (initialContributionValue != null) {
			builder.append("initialContributionValue=");
			builder.append(initialContributionValue);
			builder.append(", ");
		}
		if (legalIdentifier != null) {
			builder.append("legalIdentifier=");
			builder.append(legalIdentifier);
			builder.append(", ");
		}
		if (certificate != null) {
			builder.append("certificate=");
			builder.append(certificate);
			builder.append(", ");
		}
		if (beneficiaryBirthDate != null) {
			builder.append("beneficiaryBirthDate=");
			builder.append(beneficiaryBirthDate);
			builder.append(", ");
		}
		if (beneficiarySex != null) {
			builder.append("beneficiarySex=");
			builder.append(beneficiarySex);
			builder.append(", ");
		}
		if (youngestBirthDate != null) {
			builder.append("youngestBirthDate=");
			builder.append(youngestBirthDate);
			builder.append(", ");
		}
		if (youngestSex != null) {
			builder.append("youngestSex=");
			builder.append(youngestSex);
			builder.append(", ");
		}
		if (reversionPct != null) {
			builder.append("reversionPct=");
			builder.append(reversionPct);
			builder.append(", ");
		}
		if (childrenReversionPct != null) {
			builder.append("childrenReversionPct=");
			builder.append(childrenReversionPct);
			builder.append(", ");
		}
		if (desiredTerm != null) {
			builder.append("desiredTerm=");
			builder.append(desiredTerm);
			builder.append(", ");
		}
		if (incomeType != null) {
			builder.append("incomeType=");
			builder.append(incomeType);
			builder.append(", ");
		}
		if (availableIncomeTypes != null) {
			builder.append("availableIncomeTypes=");
			builder.append(availableIncomeTypes);
			builder.append(", ");
		}
		if (incomeDescription != null) {
			builder.append("incomeDescription=");
			builder.append(incomeDescription);
			builder.append(", ");
		}
		if (premium != null) {
			builder.append("premium=");
			builder.append(premium);
			builder.append(", ");
		}
		if (incomeFactor != null) {
			builder.append("incomeFactor=");
			builder.append(incomeFactor);
			builder.append(", ");
		}
		if (estimatedBenefitValue != null) {
			builder.append("estimatedBenefitValue=");
			builder.append(estimatedBenefitValue);
			builder.append(", ");
		}
		if (reversionAllowedInd != null) {
			builder.append("reversionAllowedInd=");
			builder.append(reversionAllowedInd);
			builder.append(", ");
		}
		if (calculationType != null) {
			builder.append("calculationType=");
			builder.append(calculationType);
			builder.append(", ");
		}
		if (contractDate != null) {
			builder.append("contractDate=");
			builder.append(contractDate);
			builder.append(", ");
		}
		if (legalHeir != null) {
			builder.append("legalHeir=");
			builder.append(legalHeir);
			builder.append(", ");
		}
		if (beneficiaries != null) {
			builder.append("beneficiaries=");
			builder.append(beneficiaries);
			builder.append(", ");
		}
		if (funds != null) {
			builder.append("funds=");
			builder.append(funds);
			builder.append(", ");
		}
		if (reserves != null) {
			builder.append("reserves=");
			builder.append(reserves);
			builder.append(", ");
		}
		if (coverageType != null) {
			builder.append("coverageType=");
			builder.append(coverageType);
			builder.append(", ");
		}
		if (reversionType != null) {
			builder.append("reversionType=");
			builder.append(reversionType);
			builder.append(", ");
		}
		if (updateIndex != null) {
			builder.append("updateIndex=");
			builder.append(updateIndex);
			builder.append(", ");
		}
		if (incomeFee != null) {
			builder.append("incomeFee=");
			builder.append(incomeFee);
		}
		builder.append("]");
		return builder.toString();
	}

    
}
