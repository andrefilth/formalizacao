
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone", propOrder = {
    "phoneId",
    "areaCode",
    "phoneNumber",
    "phoneType",
    "phoneLocation",
    "extensionNumber",
    "observation",
    "defaultInd",
    "physicalPerson",
    "acceptsSMS"
})
public class Phone {

    protected String phoneId;
    protected String areaCode;
    protected String phoneNumber;
    protected String phoneType;
    protected String phoneLocation;
    protected Integer extensionNumber;
    protected String observation;
    protected String defaultInd;
    protected PhysicalPerson physicalPerson;
    protected String acceptsSMS;

    
    /**
	 * 
	 */
	public Phone() {
	}

	/**
	 * @param phoneId
	 * @param areaCode
	 * @param phoneNumber
	 * @param phoneType
	 * @param phoneLocation
	 * @param extensionNumber
	 * @param observation
	 * @param defaultInd
	 * @param physicalPerson
	 * @param acceptsSMS
	 */
	public Phone(String phoneId, String areaCode, String phoneNumber, String phoneType, String phoneLocation,
			Integer extensionNumber, String observation, String defaultInd, PhysicalPerson physicalPerson,
			String acceptsSMS) {
		this.phoneId = phoneId;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.phoneLocation = phoneLocation;
		this.extensionNumber = extensionNumber;
		this.observation = observation;
		this.defaultInd = defaultInd;
		this.physicalPerson = physicalPerson;
		this.acceptsSMS = acceptsSMS;
	}

	/**
     * Obt�m o valor da propriedade phoneId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * Define o valor da propriedade phoneId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneId(String value) {
        this.phoneId = value;
    }

    /**
     * Obt�m o valor da propriedade areaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Define o valor da propriedade areaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Obt�m o valor da propriedade phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define o valor da propriedade phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obt�m o valor da propriedade phoneType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Define o valor da propriedade phoneType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Obt�m o valor da propriedade phoneLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLocation() {
        return phoneLocation;
    }

    /**
     * Define o valor da propriedade phoneLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLocation(String value) {
        this.phoneLocation = value;
    }

    /**
     * Obt�m o valor da propriedade extensionNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Define o valor da propriedade extensionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtensionNumber(Integer value) {
        this.extensionNumber = value;
    }

    /**
     * Obt�m o valor da propriedade observation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Define o valor da propriedade observation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservation(String value) {
        this.observation = value;
    }

    /**
     * Obt�m o valor da propriedade defaultInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultInd() {
        return defaultInd;
    }

    /**
     * Define o valor da propriedade defaultInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultInd(String value) {
        this.defaultInd = value;
    }

    /**
     * Obt�m o valor da propriedade physicalPerson.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPerson }
     *     
     */
    public PhysicalPerson getPhysicalPerson() {
        return physicalPerson;
    }

    /**
     * Define o valor da propriedade physicalPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPerson }
     *     
     */
    public void setPhysicalPerson(PhysicalPerson value) {
        this.physicalPerson = value;
    }

    /**
     * Obt�m o valor da propriedade acceptsSMS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptsSMS() {
        return acceptsSMS;
    }

    /**
     * Define o valor da propriedade acceptsSMS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptsSMS(String value) {
        this.acceptsSMS = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [");
		if (phoneId != null) {
			builder.append("phoneId=");
			builder.append(phoneId);
			builder.append(", ");
		}
		if (areaCode != null) {
			builder.append("areaCode=");
			builder.append(areaCode);
			builder.append(", ");
		}
		if (phoneNumber != null) {
			builder.append("phoneNumber=");
			builder.append(phoneNumber);
			builder.append(", ");
		}
		if (phoneType != null) {
			builder.append("phoneType=");
			builder.append(phoneType);
			builder.append(", ");
		}
		if (phoneLocation != null) {
			builder.append("phoneLocation=");
			builder.append(phoneLocation);
			builder.append(", ");
		}
		if (extensionNumber != null) {
			builder.append("extensionNumber=");
			builder.append(extensionNumber);
			builder.append(", ");
		}
		if (observation != null) {
			builder.append("observation=");
			builder.append(observation);
			builder.append(", ");
		}
		if (defaultInd != null) {
			builder.append("defaultInd=");
			builder.append(defaultInd);
			builder.append(", ");
		}
		if (physicalPerson != null) {
			builder.append("physicalPerson=");
			builder.append(physicalPerson);
			builder.append(", ");
		}
		if (acceptsSMS != null) {
			builder.append("acceptsSMS=");
			builder.append(acceptsSMS);
		}
		builder.append("]");
		return builder.toString();
	}

}
