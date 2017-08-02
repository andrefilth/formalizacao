
package br.com.santander.front.previdencia.formalizacao.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.type.SexType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalPerson", propOrder = {
    "physicalPersonId",
    "externalPhysicalPersonId",
    "maritalStatus",
    "mainSegment",
    "secondarySegment",
    "indicatorSheet",
    "sexIndication",
    "birthDate",
    "personName",
    "professionId",
    "cpf",
    "mailLanguageId",
    "badPayerInd",
    "childrenQuantity",
    "dependentQuantity",
    "residentInd",
    "residenceTime",
    "bankReferencesInd",
    "creditReferencesInd",
    "workReferencesInd",
    "totalMontlyIncome",
    "countryId",
    "nationalityId",
    "certificates",
    "addresses",
    "phones",
    "emails",
    "documents",
    "pep",
    "residenceCountryId",
    "professionDescription"
})
public class PhysicalPerson {

    protected String physicalPersonId;
    protected String externalPhysicalPersonId;
    protected String maritalStatus;
    protected String mainSegment;
    protected String secondarySegment;
    protected String indicatorSheet;
    @XmlSchemaType(name = "string")
    protected SexType sexIndication;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String personName;
    protected String professionId;
    protected String cpf;
    protected String mailLanguageId;
    protected String badPayerInd;
    protected Integer childrenQuantity;
    protected Integer dependentQuantity;
    protected String residentInd;
    protected Integer residenceTime;
    protected String bankReferencesInd;
    protected String creditReferencesInd;
    protected String workReferencesInd;
    protected Double totalMontlyIncome;
    protected String countryId;
    protected String nationalityId;
    @XmlElement(nillable = true)
    protected List<Certificate> certificates;
    @XmlElement(nillable = true)
    protected List<Address> addresses;
    @XmlElement(nillable = true)
    protected List<Phone> phones;
    @XmlElement(nillable = true)
    protected List<Email> emails;
    @XmlElement(nillable = true)
    protected List<Document> documents;
    protected PoliticallyExposedData pep;
    protected String residenceCountryId;
    protected String professionDescription;
    
    

    /**
	 * 
	 */
	public PhysicalPerson() {
	}

	/**
	 * @param physicalPersonId
	 * @param externalPhysicalPersonId
	 * @param maritalStatus
	 * @param mainSegment
	 * @param secondarySegment
	 * @param indicatorSheet
	 * @param sexIndication
	 * @param birthDate
	 * @param personName
	 * @param professionId
	 * @param cpf
	 * @param mailLanguageId
	 * @param badPayerInd
	 * @param childrenQuantity
	 * @param dependentQuantity
	 * @param residentInd
	 * @param residenceTime
	 * @param bankReferencesInd
	 * @param creditReferencesInd
	 * @param workReferencesInd
	 * @param totalMontlyIncome
	 * @param countryId
	 * @param nationalityId
	 * @param certificates
	 * @param addresses
	 * @param phones
	 * @param emails
	 * @param documents
	 * @param pep
	 * @param residenceCountryId
	 * @param professionDescription
	 */
	public PhysicalPerson(String physicalPersonId, String externalPhysicalPersonId, String maritalStatus,
			String mainSegment, String secondarySegment, String indicatorSheet, SexType sexIndication,
			XMLGregorianCalendar birthDate, String personName, String professionId, String cpf, String mailLanguageId,
			String badPayerInd, Integer childrenQuantity, Integer dependentQuantity, String residentInd,
			Integer residenceTime, String bankReferencesInd, String creditReferencesInd, String workReferencesInd,
			Double totalMontlyIncome, String countryId, String nationalityId, List<Certificate> certificates,
			List<Address> addresses, List<Phone> phones, List<Email> emails, List<Document> documents,
			PoliticallyExposedData pep, String residenceCountryId, String professionDescription) {
		this.physicalPersonId = physicalPersonId;
		this.externalPhysicalPersonId = externalPhysicalPersonId;
		this.maritalStatus = maritalStatus;
		this.mainSegment = mainSegment;
		this.secondarySegment = secondarySegment;
		this.indicatorSheet = indicatorSheet;
		this.sexIndication = sexIndication;
		this.birthDate = birthDate;
		this.personName = personName;
		this.professionId = professionId;
		this.cpf = cpf;
		this.mailLanguageId = mailLanguageId;
		this.badPayerInd = badPayerInd;
		this.childrenQuantity = childrenQuantity;
		this.dependentQuantity = dependentQuantity;
		this.residentInd = residentInd;
		this.residenceTime = residenceTime;
		this.bankReferencesInd = bankReferencesInd;
		this.creditReferencesInd = creditReferencesInd;
		this.workReferencesInd = workReferencesInd;
		this.totalMontlyIncome = totalMontlyIncome;
		this.countryId = countryId;
		this.nationalityId = nationalityId;
		this.certificates = certificates;
		this.addresses = addresses;
		this.phones = phones;
		this.emails = emails;
		this.documents = documents;
		this.pep = pep;
		this.residenceCountryId = residenceCountryId;
		this.professionDescription = professionDescription;
	}

	/**
     * Obt�m o valor da propriedade physicalPersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalPersonId() {
        return physicalPersonId;
    }

    /**
     * Define o valor da propriedade physicalPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalPersonId(String value) {
        this.physicalPersonId = value;
    }

    /**
     * Obt�m o valor da propriedade externalPhysicalPersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPhysicalPersonId() {
        return externalPhysicalPersonId;
    }

    /**
     * Define o valor da propriedade externalPhysicalPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPhysicalPersonId(String value) {
        this.externalPhysicalPersonId = value;
    }

    /**
     * Obt�m o valor da propriedade maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define o valor da propriedade maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obt�m o valor da propriedade mainSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainSegment() {
        return mainSegment;
    }

    /**
     * Define o valor da propriedade mainSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainSegment(String value) {
        this.mainSegment = value;
    }

    /**
     * Obt�m o valor da propriedade secondarySegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySegment() {
        return secondarySegment;
    }

    /**
     * Define o valor da propriedade secondarySegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySegment(String value) {
        this.secondarySegment = value;
    }

    /**
     * Obt�m o valor da propriedade indicatorSheet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorSheet() {
        return indicatorSheet;
    }

    /**
     * Define o valor da propriedade indicatorSheet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorSheet(String value) {
        this.indicatorSheet = value;
    }

    /**
     * Obt�m o valor da propriedade sexIndication.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSexIndication() {
        return sexIndication;
    }

    /**
     * Define o valor da propriedade sexIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSexIndication(SexType value) {
        this.sexIndication = value;
    }

    /**
     * Obt�m o valor da propriedade birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Define o valor da propriedade birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
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
     * Obt�m o valor da propriedade professionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionId() {
        return professionId;
    }

    /**
     * Define o valor da propriedade professionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionId(String value) {
        this.professionId = value;
    }

    /**
     * Obt�m o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obt�m o valor da propriedade mailLanguageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailLanguageId() {
        return mailLanguageId;
    }

    /**
     * Define o valor da propriedade mailLanguageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailLanguageId(String value) {
        this.mailLanguageId = value;
    }

    /**
     * Obt�m o valor da propriedade badPayerInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadPayerInd() {
        return badPayerInd;
    }

    /**
     * Define o valor da propriedade badPayerInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadPayerInd(String value) {
        this.badPayerInd = value;
    }

    /**
     * Obt�m o valor da propriedade childrenQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenQuantity() {
        return childrenQuantity;
    }

    /**
     * Define o valor da propriedade childrenQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenQuantity(Integer value) {
        this.childrenQuantity = value;
    }

    /**
     * Obt�m o valor da propriedade dependentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDependentQuantity() {
        return dependentQuantity;
    }

    /**
     * Define o valor da propriedade dependentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDependentQuantity(Integer value) {
        this.dependentQuantity = value;
    }

    /**
     * Obt�m o valor da propriedade residentInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentInd() {
        return residentInd;
    }

    /**
     * Define o valor da propriedade residentInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentInd(String value) {
        this.residentInd = value;
    }

    /**
     * Obt�m o valor da propriedade residenceTime.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResidenceTime() {
        return residenceTime;
    }

    /**
     * Define o valor da propriedade residenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResidenceTime(Integer value) {
        this.residenceTime = value;
    }

    /**
     * Obt�m o valor da propriedade bankReferencesInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankReferencesInd() {
        return bankReferencesInd;
    }

    /**
     * Define o valor da propriedade bankReferencesInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankReferencesInd(String value) {
        this.bankReferencesInd = value;
    }

    /**
     * Obt�m o valor da propriedade creditReferencesInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReferencesInd() {
        return creditReferencesInd;
    }

    /**
     * Define o valor da propriedade creditReferencesInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReferencesInd(String value) {
        this.creditReferencesInd = value;
    }

    /**
     * Obt�m o valor da propriedade workReferencesInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkReferencesInd() {
        return workReferencesInd;
    }

    /**
     * Define o valor da propriedade workReferencesInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkReferencesInd(String value) {
        this.workReferencesInd = value;
    }

    /**
     * Obt�m o valor da propriedade totalMontlyIncome.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalMontlyIncome() {
        return totalMontlyIncome;
    }

    /**
     * Define o valor da propriedade totalMontlyIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalMontlyIncome(Double value) {
        this.totalMontlyIncome = value;
    }

    /**
     * Obt�m o valor da propriedade countryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * Define o valor da propriedade countryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryId(String value) {
        this.countryId = value;
    }

    /**
     * Obt�m o valor da propriedade nationalityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityId() {
        return nationalityId;
    }

    /**
     * Define o valor da propriedade nationalityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityId(String value) {
        this.nationalityId = value;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Certificate }
     * 
     * 
     */
    public List<Certificate> getCertificates() {
        if (certificates == null) {
            certificates = new ArrayList<Certificate>();
        }
        return this.certificates;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhones() {
        if (phones == null) {
            phones = new ArrayList<Phone>();
        }
        return this.phones;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmails() {
        if (emails == null) {
            emails = new ArrayList<Email>();
        }
        return this.emails;
    }

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Document>();
        }
        return this.documents;
    }

    /**
     * Obt�m o valor da propriedade pep.
     * 
     * @return
     *     possible object is
     *     {@link PoliticallyExposedData }
     *     
     */
    public PoliticallyExposedData getPep() {
        return pep;
    }

    /**
     * Define o valor da propriedade pep.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticallyExposedData }
     *     
     */
    public void setPep(PoliticallyExposedData value) {
        this.pep = value;
    }

    /**
     * Obt�m o valor da propriedade residenceCountryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryId() {
        return residenceCountryId;
    }

    /**
     * Define o valor da propriedade residenceCountryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryId(String value) {
        this.residenceCountryId = value;
    }

    /**
     * Obt�m o valor da propriedade professionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionDescription() {
        return professionDescription;
    }

    /**
     * Define o valor da propriedade professionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionDescription(String value) {
        this.professionDescription = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhysicalPerson [");
		if (physicalPersonId != null) {
			builder.append("physicalPersonId=");
			builder.append(physicalPersonId);
			builder.append(", ");
		}
		if (externalPhysicalPersonId != null) {
			builder.append("externalPhysicalPersonId=");
			builder.append(externalPhysicalPersonId);
			builder.append(", ");
		}
		if (maritalStatus != null) {
			builder.append("maritalStatus=");
			builder.append(maritalStatus);
			builder.append(", ");
		}
		if (mainSegment != null) {
			builder.append("mainSegment=");
			builder.append(mainSegment);
			builder.append(", ");
		}
		if (secondarySegment != null) {
			builder.append("secondarySegment=");
			builder.append(secondarySegment);
			builder.append(", ");
		}
		if (indicatorSheet != null) {
			builder.append("indicatorSheet=");
			builder.append(indicatorSheet);
			builder.append(", ");
		}
		if (sexIndication != null) {
			builder.append("sexIndication=");
			builder.append(sexIndication);
			builder.append(", ");
		}
		if (birthDate != null) {
			builder.append("birthDate=");
			builder.append(birthDate);
			builder.append(", ");
		}
		if (personName != null) {
			builder.append("personName=");
			builder.append(personName);
			builder.append(", ");
		}
		if (professionId != null) {
			builder.append("professionId=");
			builder.append(professionId);
			builder.append(", ");
		}
		if (cpf != null) {
			builder.append("cpf=");
			builder.append(cpf);
			builder.append(", ");
		}
		if (mailLanguageId != null) {
			builder.append("mailLanguageId=");
			builder.append(mailLanguageId);
			builder.append(", ");
		}
		if (badPayerInd != null) {
			builder.append("badPayerInd=");
			builder.append(badPayerInd);
			builder.append(", ");
		}
		if (childrenQuantity != null) {
			builder.append("childrenQuantity=");
			builder.append(childrenQuantity);
			builder.append(", ");
		}
		if (dependentQuantity != null) {
			builder.append("dependentQuantity=");
			builder.append(dependentQuantity);
			builder.append(", ");
		}
		if (residentInd != null) {
			builder.append("residentInd=");
			builder.append(residentInd);
			builder.append(", ");
		}
		if (residenceTime != null) {
			builder.append("residenceTime=");
			builder.append(residenceTime);
			builder.append(", ");
		}
		if (bankReferencesInd != null) {
			builder.append("bankReferencesInd=");
			builder.append(bankReferencesInd);
			builder.append(", ");
		}
		if (creditReferencesInd != null) {
			builder.append("creditReferencesInd=");
			builder.append(creditReferencesInd);
			builder.append(", ");
		}
		if (workReferencesInd != null) {
			builder.append("workReferencesInd=");
			builder.append(workReferencesInd);
			builder.append(", ");
		}
		if (totalMontlyIncome != null) {
			builder.append("totalMontlyIncome=");
			builder.append(totalMontlyIncome);
			builder.append(", ");
		}
		if (countryId != null) {
			builder.append("countryId=");
			builder.append(countryId);
			builder.append(", ");
		}
		if (nationalityId != null) {
			builder.append("nationalityId=");
			builder.append(nationalityId);
			builder.append(", ");
		}
		if (certificates != null) {
			builder.append("certificates=");
			builder.append(certificates);
			builder.append(", ");
		}
		if (addresses != null) {
			builder.append("addresses=");
			builder.append(addresses);
			builder.append(", ");
		}
		if (phones != null) {
			builder.append("phones=");
			builder.append(phones);
			builder.append(", ");
		}
		if (emails != null) {
			builder.append("emails=");
			builder.append(emails);
			builder.append(", ");
		}
		if (documents != null) {
			builder.append("documents=");
			builder.append(documents);
			builder.append(", ");
		}
		if (pep != null) {
			builder.append("pep=");
			builder.append(pep);
			builder.append(", ");
		}
		if (residenceCountryId != null) {
			builder.append("residenceCountryId=");
			builder.append(residenceCountryId);
			builder.append(", ");
		}
		if (professionDescription != null) {
			builder.append("professionDescription=");
			builder.append(professionDescription);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
