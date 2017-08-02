
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.santander.front.previdencia.formalizacao.type.BrokerType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Broker", propOrder = {
    "brokerId",
    "personName",
    "participationPercent",
    "mainInd",
    "brokerType",
    "brokerCategory",
    "legalIdentifier",
    "person",
    "status",
    "superiorBrokerId",
    "platformBrokerId",
    "automaticMovimentApproverInd",
    "inheritCategoryVariationsInd",
    "isBroker",
    "isProLaboreOfficer",
    "isSalesOfficer",
    "isSalesAgent",
    "isSupervisor",
    "isPlatform",
    "isExternal"
})
public class Broker {

    protected String brokerId;
    protected String personName;
    protected Double participationPercent;
    protected String mainInd;
    @XmlSchemaType(name = "string")
    protected BrokerType brokerType;
    protected BrokerCategory brokerCategory;
    protected String legalIdentifier;
    protected Person person;
    protected String status;
    protected String superiorBrokerId;
    protected String platformBrokerId;
    protected Boolean automaticMovimentApproverInd;
    protected Boolean inheritCategoryVariationsInd;
    protected Boolean isBroker;
    protected Boolean isProLaboreOfficer;
    protected Boolean isSalesOfficer;
    protected Boolean isSalesAgent;
    protected Boolean isSupervisor;
    protected Boolean isPlatform;
    protected Boolean isExternal;

    
    /**
	 * 
	 */
	public Broker() {
	}

	/**
	 * @param brokerId
	 * @param personName
	 * @param participationPercent
	 * @param mainInd
	 * @param brokerType
	 * @param brokerCategory
	 * @param legalIdentifier
	 * @param person
	 * @param status
	 * @param superiorBrokerId
	 * @param platformBrokerId
	 * @param automaticMovimentApproverInd
	 * @param inheritCategoryVariationsInd
	 * @param isBroker
	 * @param isProLaboreOfficer
	 * @param isSalesOfficer
	 * @param isSalesAgent
	 * @param isSupervisor
	 * @param isPlatform
	 * @param isExternal
	 */
	public Broker(String brokerId, String personName, Double participationPercent, String mainInd,
			BrokerType brokerType, BrokerCategory brokerCategory, String legalIdentifier, Person person, String status,
			String superiorBrokerId, String platformBrokerId, Boolean automaticMovimentApproverInd,
			Boolean inheritCategoryVariationsInd, Boolean isBroker, Boolean isProLaboreOfficer, Boolean isSalesOfficer,
			Boolean isSalesAgent, Boolean isSupervisor, Boolean isPlatform, Boolean isExternal) {
		this.brokerId = brokerId;
		this.personName = personName;
		this.participationPercent = participationPercent;
		this.mainInd = mainInd;
		this.brokerType = brokerType;
		this.brokerCategory = brokerCategory;
		this.legalIdentifier = legalIdentifier;
		this.person = person;
		this.status = status;
		this.superiorBrokerId = superiorBrokerId;
		this.platformBrokerId = platformBrokerId;
		this.automaticMovimentApproverInd = automaticMovimentApproverInd;
		this.inheritCategoryVariationsInd = inheritCategoryVariationsInd;
		this.isBroker = isBroker;
		this.isProLaboreOfficer = isProLaboreOfficer;
		this.isSalesOfficer = isSalesOfficer;
		this.isSalesAgent = isSalesAgent;
		this.isSupervisor = isSupervisor;
		this.isPlatform = isPlatform;
		this.isExternal = isExternal;
	}

	/**
     * Obt�m o valor da propriedade brokerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerId() {
        return brokerId;
    }

    /**
     * Define o valor da propriedade brokerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerId(String value) {
        this.brokerId = value;
    }

    /**
     * Obt�m o valor da propriedade personName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Define o valor da propriedade personName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Obt�m o valor da propriedade participationPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParticipationPercent() {
        return participationPercent;
    }

    /**
     * Define o valor da propriedade participationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParticipationPercent(Double value) {
        this.participationPercent = value;
    }

    /**
     * Obt�m o valor da propriedade mainInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainInd() {
        return mainInd;
    }

    /**
     * Define o valor da propriedade mainInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainInd(String value) {
        this.mainInd = value;
    }

    /**
     * Obt�m o valor da propriedade brokerType.
     * 
     * @return
     *     possible object is
     *     {@link BrokerType }
     *     
     */
    public BrokerType getBrokerType() {
        return brokerType;
    }

    /**
     * Define o valor da propriedade brokerType.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerType }
     *     
     */
    public void setBrokerType(BrokerType value) {
        this.brokerType = value;
    }

    /**
     * Obt�m o valor da propriedade brokerCategory.
     * 
     * @return
     *     possible object is
     *     {@link BrokerCategory }
     *     
     */
    public BrokerCategory getBrokerCategory() {
        return brokerCategory;
    }

    /**
     * Define o valor da propriedade brokerCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerCategory }
     *     
     */
    public void setBrokerCategory(BrokerCategory value) {
        this.brokerCategory = value;
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
     * Obt�m o valor da propriedade superiorBrokerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperiorBrokerId() {
        return superiorBrokerId;
    }

    /**
     * Define o valor da propriedade superiorBrokerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperiorBrokerId(String value) {
        this.superiorBrokerId = value;
    }

    /**
     * Obt�m o valor da propriedade platformBrokerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformBrokerId() {
        return platformBrokerId;
    }

    /**
     * Define o valor da propriedade platformBrokerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformBrokerId(String value) {
        this.platformBrokerId = value;
    }

    /**
     * Obt�m o valor da propriedade automaticMovimentApproverInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticMovimentApproverInd() {
        return automaticMovimentApproverInd;
    }

    /**
     * Define o valor da propriedade automaticMovimentApproverInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticMovimentApproverInd(Boolean value) {
        this.automaticMovimentApproverInd = value;
    }

    /**
     * Obt�m o valor da propriedade inheritCategoryVariationsInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritCategoryVariationsInd() {
        return inheritCategoryVariationsInd;
    }

    /**
     * Define o valor da propriedade inheritCategoryVariationsInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritCategoryVariationsInd(Boolean value) {
        this.inheritCategoryVariationsInd = value;
    }

    /**
     * Obt�m o valor da propriedade isBroker.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBroker() {
        return isBroker;
    }

    /**
     * Define o valor da propriedade isBroker.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBroker(Boolean value) {
        this.isBroker = value;
    }

    /**
     * Obt�m o valor da propriedade isProLaboreOfficer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProLaboreOfficer() {
        return isProLaboreOfficer;
    }

    /**
     * Define o valor da propriedade isProLaboreOfficer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProLaboreOfficer(Boolean value) {
        this.isProLaboreOfficer = value;
    }

    /**
     * Obt�m o valor da propriedade isSalesOfficer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesOfficer() {
        return isSalesOfficer;
    }

    /**
     * Define o valor da propriedade isSalesOfficer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesOfficer(Boolean value) {
        this.isSalesOfficer = value;
    }

    /**
     * Obt�m o valor da propriedade isSalesAgent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesAgent() {
        return isSalesAgent;
    }

    /**
     * Define o valor da propriedade isSalesAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesAgent(Boolean value) {
        this.isSalesAgent = value;
    }

    /**
     * Obt�m o valor da propriedade isSupervisor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupervisor() {
        return isSupervisor;
    }

    /**
     * Define o valor da propriedade isSupervisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupervisor(Boolean value) {
        this.isSupervisor = value;
    }

    /**
     * Obt�m o valor da propriedade isPlatform.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlatform() {
        return isPlatform;
    }

    /**
     * Define o valor da propriedade isPlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlatform(Boolean value) {
        this.isPlatform = value;
    }

    /**
     * Obt�m o valor da propriedade isExternal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternal() {
        return isExternal;
    }

    /**
     * Define o valor da propriedade isExternal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Broker [");
		if (brokerId != null) {
			builder.append("brokerId=");
			builder.append(brokerId);
			builder.append(", ");
		}
		if (personName != null) {
			builder.append("personName=");
			builder.append(personName);
			builder.append(", ");
		}
		if (participationPercent != null) {
			builder.append("participationPercent=");
			builder.append(participationPercent);
			builder.append(", ");
		}
		if (mainInd != null) {
			builder.append("mainInd=");
			builder.append(mainInd);
			builder.append(", ");
		}
		if (brokerType != null) {
			builder.append("brokerType=");
			builder.append(brokerType);
			builder.append(", ");
		}
		if (brokerCategory != null) {
			builder.append("brokerCategory=");
			builder.append(brokerCategory);
			builder.append(", ");
		}
		if (legalIdentifier != null) {
			builder.append("legalIdentifier=");
			builder.append(legalIdentifier);
			builder.append(", ");
		}
		if (person != null) {
			builder.append("person=");
			builder.append(person);
			builder.append(", ");
		}
		if (status != null) {
			builder.append("status=");
			builder.append(status);
			builder.append(", ");
		}
		if (superiorBrokerId != null) {
			builder.append("superiorBrokerId=");
			builder.append(superiorBrokerId);
			builder.append(", ");
		}
		if (platformBrokerId != null) {
			builder.append("platformBrokerId=");
			builder.append(platformBrokerId);
			builder.append(", ");
		}
		if (automaticMovimentApproverInd != null) {
			builder.append("automaticMovimentApproverInd=");
			builder.append(automaticMovimentApproverInd);
			builder.append(", ");
		}
		if (inheritCategoryVariationsInd != null) {
			builder.append("inheritCategoryVariationsInd=");
			builder.append(inheritCategoryVariationsInd);
			builder.append(", ");
		}
		if (isBroker != null) {
			builder.append("isBroker=");
			builder.append(isBroker);
			builder.append(", ");
		}
		if (isProLaboreOfficer != null) {
			builder.append("isProLaboreOfficer=");
			builder.append(isProLaboreOfficer);
			builder.append(", ");
		}
		if (isSalesOfficer != null) {
			builder.append("isSalesOfficer=");
			builder.append(isSalesOfficer);
			builder.append(", ");
		}
		if (isSalesAgent != null) {
			builder.append("isSalesAgent=");
			builder.append(isSalesAgent);
			builder.append(", ");
		}
		if (isSupervisor != null) {
			builder.append("isSupervisor=");
			builder.append(isSupervisor);
			builder.append(", ");
		}
		if (isPlatform != null) {
			builder.append("isPlatform=");
			builder.append(isPlatform);
			builder.append(", ");
		}
		if (isExternal != null) {
			builder.append("isExternal=");
			builder.append(isExternal);
		}
		builder.append("]");
		return builder.toString();
	}

    
}
