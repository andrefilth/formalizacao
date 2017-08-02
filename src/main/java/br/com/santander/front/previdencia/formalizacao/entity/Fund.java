
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fund", propOrder = {
    "fundId",
    "description",
    "distributionPercent",
    "currencyId",
    "currencyDescription",
    "cnpj",
    "fundType",
    "benefit",
    "person",
    "grossValue",
    "netValue",
    "balanceValue",
    "dailyClosing",
    "active",
    "companyId"
})
public class Fund {

    protected String fundId;
    protected String description;
    protected Double distributionPercent;
    protected String currencyId;
    protected String currencyDescription;
    @XmlElement(name = "cNPJ")
    protected String cnpj;
    protected String fundType;
    protected Benefit benefit;
    protected Person person;
    protected Double grossValue;
    protected Double netValue;
    protected Double balanceValue;
    protected String dailyClosing;
    protected String active;
    protected String companyId;
    
    

    /**
	 * 
	 */
	public Fund() {
	}

	/**
	 * @param fundId
	 * @param description
	 * @param distributionPercent
	 * @param currencyId
	 * @param currencyDescription
	 * @param cnpj
	 * @param fundType
	 * @param benefit
	 * @param person
	 * @param grossValue
	 * @param netValue
	 * @param balanceValue
	 * @param dailyClosing
	 * @param active
	 * @param companyId
	 */
	public Fund(String fundId, String description, Double distributionPercent, String currencyId,
			String currencyDescription, String cnpj, String fundType, Benefit benefit, Person person, Double grossValue,
			Double netValue, Double balanceValue, String dailyClosing, String active, String companyId) {
		this.fundId = fundId;
		this.description = description;
		this.distributionPercent = distributionPercent;
		this.currencyId = currencyId;
		this.currencyDescription = currencyDescription;
		this.cnpj = cnpj;
		this.fundType = fundType;
		this.benefit = benefit;
		this.person = person;
		this.grossValue = grossValue;
		this.netValue = netValue;
		this.balanceValue = balanceValue;
		this.dailyClosing = dailyClosing;
		this.active = active;
		this.companyId = companyId;
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
     * Obt�m o valor da propriedade distributionPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistributionPercent() {
        return distributionPercent;
    }

    /**
     * Define o valor da propriedade distributionPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistributionPercent(Double value) {
        this.distributionPercent = value;
    }

    /**
     * Obt�m o valor da propriedade currencyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * Define o valor da propriedade currencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyId(String value) {
        this.currencyId = value;
    }

    /**
     * Obt�m o valor da propriedade currencyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyDescription() {
        return currencyDescription;
    }

    /**
     * Define o valor da propriedade currencyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyDescription(String value) {
        this.currencyDescription = value;
    }

    /**
     * Obt�m o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Obt�m o valor da propriedade fundType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * Define o valor da propriedade fundType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundType(String value) {
        this.fundType = value;
    }

    /**
     * Obt�m o valor da propriedade benefit.
     * 
     * @return
     *     possible object is
     *     {@link Benefit }
     *     
     */
    public Benefit getBenefit() {
        return benefit;
    }

    /**
     * Define o valor da propriedade benefit.
     * 
     * @param value
     *     allowed object is
     *     {@link Benefit }
     *     
     */
    public void setBenefit(Benefit value) {
        this.benefit = value;
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
     * Obt�m o valor da propriedade grossValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossValue() {
        return grossValue;
    }

    /**
     * Define o valor da propriedade grossValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossValue(Double value) {
        this.grossValue = value;
    }

    /**
     * Obt�m o valor da propriedade netValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetValue() {
        return netValue;
    }

    /**
     * Define o valor da propriedade netValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetValue(Double value) {
        this.netValue = value;
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
     * Obt�m o valor da propriedade dailyClosing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyClosing() {
        return dailyClosing;
    }

    /**
     * Define o valor da propriedade dailyClosing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyClosing(String value) {
        this.dailyClosing = value;
    }

    /**
     * Obt�m o valor da propriedade active.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Define o valor da propriedade active.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fund [");
		if (fundId != null) {
			builder.append("fundId=");
			builder.append(fundId);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (distributionPercent != null) {
			builder.append("distributionPercent=");
			builder.append(distributionPercent);
			builder.append(", ");
		}
		if (currencyId != null) {
			builder.append("currencyId=");
			builder.append(currencyId);
			builder.append(", ");
		}
		if (currencyDescription != null) {
			builder.append("currencyDescription=");
			builder.append(currencyDescription);
			builder.append(", ");
		}
		if (cnpj != null) {
			builder.append("cnpj=");
			builder.append(cnpj);
			builder.append(", ");
		}
		if (fundType != null) {
			builder.append("fundType=");
			builder.append(fundType);
			builder.append(", ");
		}
		if (benefit != null) {
			builder.append("benefit=");
			builder.append(benefit);
			builder.append(", ");
		}
		if (person != null) {
			builder.append("person=");
			builder.append(person);
			builder.append(", ");
		}
		if (grossValue != null) {
			builder.append("grossValue=");
			builder.append(grossValue);
			builder.append(", ");
		}
		if (netValue != null) {
			builder.append("netValue=");
			builder.append(netValue);
			builder.append(", ");
		}
		if (balanceValue != null) {
			builder.append("balanceValue=");
			builder.append(balanceValue);
			builder.append(", ");
		}
		if (dailyClosing != null) {
			builder.append("dailyClosing=");
			builder.append(dailyClosing);
			builder.append(", ");
		}
		if (active != null) {
			builder.append("active=");
			builder.append(active);
			builder.append(", ");
		}
		if (companyId != null) {
			builder.append("companyId=");
			builder.append(companyId);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
