
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.type.PaymentMethod;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "paymentTypeId",
    "paymentDescription",
    "recoveryChannelId",
    "paymentDate",
    "paymentDay",
    "paymentMethod",
    "address",
    "bankAccountType",
    "bankNumber",
    "bankBranchNumber",
    "bankBranchNumberDigit",
    "bankAccountNumber",
    "bankAccountNumberDigit",
    "finantialResponsiblePersonId",
    "bankRequiredInd",
    "agencyRequiredInd",
    "accountRequiredInd",
    "holderName",
    "initialPaymentInd",
    "paymentValue",
    "nextPaymentDate",
    "incomeFee"
})
public class Payment {

    protected String paymentTypeId;
    protected String paymentDescription;
    protected Integer recoveryChannelId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    protected Integer paymentDay;
    @XmlSchemaType(name = "string")
    protected PaymentMethod paymentMethod;
    protected Address address;
    protected String bankAccountType;
    protected String bankNumber;
    protected String bankBranchNumber;
    protected String bankBranchNumberDigit;
    protected String bankAccountNumber;
    protected String bankAccountNumberDigit;
    protected String finantialResponsiblePersonId;
    protected Boolean bankRequiredInd;
    protected Boolean agencyRequiredInd;
    protected Boolean accountRequiredInd;
    protected String holderName;
    protected Boolean initialPaymentInd;
    protected Double paymentValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPaymentDate;
    protected ParameterizedValue incomeFee;

    
    /**
	 * 
	 */
	public Payment() {
	}

	/**
	 * @param paymentTypeId
	 * @param paymentDescription
	 * @param recoveryChannelId
	 * @param paymentDate
	 * @param paymentDay
	 * @param paymentMethod
	 * @param address
	 * @param bankAccountType
	 * @param bankNumber
	 * @param bankBranchNumber
	 * @param bankBranchNumberDigit
	 * @param bankAccountNumber
	 * @param bankAccountNumberDigit
	 * @param finantialResponsiblePersonId
	 * @param bankRequiredInd
	 * @param agencyRequiredInd
	 * @param accountRequiredInd
	 * @param holderName
	 * @param initialPaymentInd
	 * @param paymentValue
	 * @param nextPaymentDate
	 * @param incomeFee
	 */
	public Payment(String paymentTypeId, String paymentDescription, Integer recoveryChannelId,
			XMLGregorianCalendar paymentDate, Integer paymentDay, PaymentMethod paymentMethod, Address address,
			String bankAccountType, String bankNumber, String bankBranchNumber, String bankBranchNumberDigit,
			String bankAccountNumber, String bankAccountNumberDigit, String finantialResponsiblePersonId,
			Boolean bankRequiredInd, Boolean agencyRequiredInd, Boolean accountRequiredInd, String holderName,
			Boolean initialPaymentInd, Double paymentValue, XMLGregorianCalendar nextPaymentDate,
			ParameterizedValue incomeFee) {
		this.paymentTypeId = paymentTypeId;
		this.paymentDescription = paymentDescription;
		this.recoveryChannelId = recoveryChannelId;
		this.paymentDate = paymentDate;
		this.paymentDay = paymentDay;
		this.paymentMethod = paymentMethod;
		this.address = address;
		this.bankAccountType = bankAccountType;
		this.bankNumber = bankNumber;
		this.bankBranchNumber = bankBranchNumber;
		this.bankBranchNumberDigit = bankBranchNumberDigit;
		this.bankAccountNumber = bankAccountNumber;
		this.bankAccountNumberDigit = bankAccountNumberDigit;
		this.finantialResponsiblePersonId = finantialResponsiblePersonId;
		this.bankRequiredInd = bankRequiredInd;
		this.agencyRequiredInd = agencyRequiredInd;
		this.accountRequiredInd = accountRequiredInd;
		this.holderName = holderName;
		this.initialPaymentInd = initialPaymentInd;
		this.paymentValue = paymentValue;
		this.nextPaymentDate = nextPaymentDate;
		this.incomeFee = incomeFee;
	}

	/**
     * Obt�m o valor da propriedade paymentTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    /**
     * Define o valor da propriedade paymentTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeId(String value) {
        this.paymentTypeId = value;
    }

    /**
     * Obt�m o valor da propriedade paymentDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Define o valor da propriedade paymentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Obt�m o valor da propriedade recoveryChannelId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecoveryChannelId() {
        return recoveryChannelId;
    }

    /**
     * Define o valor da propriedade recoveryChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecoveryChannelId(Integer value) {
        this.recoveryChannelId = value;
    }

    /**
     * Obt�m o valor da propriedade paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define o valor da propriedade paymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Obt�m o valor da propriedade paymentDay.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentDay() {
        return paymentDay;
    }

    /**
     * Define o valor da propriedade paymentDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentDay(Integer value) {
        this.paymentDay = value;
    }

    /**
     * Obt�m o valor da propriedade paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define o valor da propriedade paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Obt�m o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Obt�m o valor da propriedade bankAccountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Define o valor da propriedade bankAccountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountType(String value) {
        this.bankAccountType = value;
    }

    /**
     * Obt�m o valor da propriedade bankNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * Define o valor da propriedade bankNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNumber(String value) {
        this.bankNumber = value;
    }

    /**
     * Obt�m o valor da propriedade bankBranchNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchNumber() {
        return bankBranchNumber;
    }

    /**
     * Define o valor da propriedade bankBranchNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchNumber(String value) {
        this.bankBranchNumber = value;
    }

    /**
     * Obt�m o valor da propriedade bankBranchNumberDigit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchNumberDigit() {
        return bankBranchNumberDigit;
    }

    /**
     * Define o valor da propriedade bankBranchNumberDigit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchNumberDigit(String value) {
        this.bankBranchNumberDigit = value;
    }

    /**
     * Obt�m o valor da propriedade bankAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Define o valor da propriedade bankAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Obt�m o valor da propriedade bankAccountNumberDigit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumberDigit() {
        return bankAccountNumberDigit;
    }

    /**
     * Define o valor da propriedade bankAccountNumberDigit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumberDigit(String value) {
        this.bankAccountNumberDigit = value;
    }

    /**
     * Obt�m o valor da propriedade finantialResponsiblePersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinantialResponsiblePersonId() {
        return finantialResponsiblePersonId;
    }

    /**
     * Define o valor da propriedade finantialResponsiblePersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinantialResponsiblePersonId(String value) {
        this.finantialResponsiblePersonId = value;
    }

    /**
     * Obt�m o valor da propriedade bankRequiredInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankRequiredInd() {
        return bankRequiredInd;
    }

    /**
     * Define o valor da propriedade bankRequiredInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankRequiredInd(Boolean value) {
        this.bankRequiredInd = value;
    }

    /**
     * Obt�m o valor da propriedade agencyRequiredInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgencyRequiredInd() {
        return agencyRequiredInd;
    }

    /**
     * Define o valor da propriedade agencyRequiredInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgencyRequiredInd(Boolean value) {
        this.agencyRequiredInd = value;
    }

    /**
     * Obt�m o valor da propriedade accountRequiredInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountRequiredInd() {
        return accountRequiredInd;
    }

    /**
     * Define o valor da propriedade accountRequiredInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountRequiredInd(Boolean value) {
        this.accountRequiredInd = value;
    }

    /**
     * Obt�m o valor da propriedade holderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * Define o valor da propriedade holderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderName(String value) {
        this.holderName = value;
    }

    /**
     * Obt�m o valor da propriedade initialPaymentInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInitialPaymentInd() {
        return initialPaymentInd;
    }

    /**
     * Define o valor da propriedade initialPaymentInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitialPaymentInd(Boolean value) {
        this.initialPaymentInd = value;
    }

    /**
     * Obt�m o valor da propriedade paymentValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaymentValue() {
        return paymentValue;
    }

    /**
     * Define o valor da propriedade paymentValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaymentValue(Double value) {
        this.paymentValue = value;
    }

    /**
     * Obt�m o valor da propriedade nextPaymentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * Define o valor da propriedade nextPaymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPaymentDate(XMLGregorianCalendar value) {
        this.nextPaymentDate = value;
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
		builder.append("Payment [");
		if (paymentTypeId != null) {
			builder.append("paymentTypeId=");
			builder.append(paymentTypeId);
			builder.append(", ");
		}
		if (paymentDescription != null) {
			builder.append("paymentDescription=");
			builder.append(paymentDescription);
			builder.append(", ");
		}
		if (recoveryChannelId != null) {
			builder.append("recoveryChannelId=");
			builder.append(recoveryChannelId);
			builder.append(", ");
		}
		if (paymentDate != null) {
			builder.append("paymentDate=");
			builder.append(paymentDate);
			builder.append(", ");
		}
		if (paymentDay != null) {
			builder.append("paymentDay=");
			builder.append(paymentDay);
			builder.append(", ");
		}
		if (paymentMethod != null) {
			builder.append("paymentMethod=");
			builder.append(paymentMethod);
			builder.append(", ");
		}
		if (address != null) {
			builder.append("address=");
			builder.append(address);
			builder.append(", ");
		}
		if (bankAccountType != null) {
			builder.append("bankAccountType=");
			builder.append(bankAccountType);
			builder.append(", ");
		}
		if (bankNumber != null) {
			builder.append("bankNumber=");
			builder.append(bankNumber);
			builder.append(", ");
		}
		if (bankBranchNumber != null) {
			builder.append("bankBranchNumber=");
			builder.append(bankBranchNumber);
			builder.append(", ");
		}
		if (bankBranchNumberDigit != null) {
			builder.append("bankBranchNumberDigit=");
			builder.append(bankBranchNumberDigit);
			builder.append(", ");
		}
		if (bankAccountNumber != null) {
			builder.append("bankAccountNumber=");
			builder.append(bankAccountNumber);
			builder.append(", ");
		}
		if (bankAccountNumberDigit != null) {
			builder.append("bankAccountNumberDigit=");
			builder.append(bankAccountNumberDigit);
			builder.append(", ");
		}
		if (finantialResponsiblePersonId != null) {
			builder.append("finantialResponsiblePersonId=");
			builder.append(finantialResponsiblePersonId);
			builder.append(", ");
		}
		if (bankRequiredInd != null) {
			builder.append("bankRequiredInd=");
			builder.append(bankRequiredInd);
			builder.append(", ");
		}
		if (agencyRequiredInd != null) {
			builder.append("agencyRequiredInd=");
			builder.append(agencyRequiredInd);
			builder.append(", ");
		}
		if (accountRequiredInd != null) {
			builder.append("accountRequiredInd=");
			builder.append(accountRequiredInd);
			builder.append(", ");
		}
		if (holderName != null) {
			builder.append("holderName=");
			builder.append(holderName);
			builder.append(", ");
		}
		if (initialPaymentInd != null) {
			builder.append("initialPaymentInd=");
			builder.append(initialPaymentInd);
			builder.append(", ");
		}
		if (paymentValue != null) {
			builder.append("paymentValue=");
			builder.append(paymentValue);
			builder.append(", ");
		}
		if (nextPaymentDate != null) {
			builder.append("nextPaymentDate=");
			builder.append(nextPaymentDate);
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
