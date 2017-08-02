
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "addressId",
    "cep",
    "streetName",
    "streetNumber",
    "complement",
    "neighborhood",
    "cityId",
    "cityName",
    "stateId",
    "countryId",
    "addressDescription",
    "addressType",
    "defaultInd",
    "observations",
    "streetType",
    "physicalPerson",
    "certificate"
})
public class Address {

    protected String addressId;
    protected String cep;
    protected String streetName;
    protected String streetNumber;
    protected String complement;
    protected String neighborhood;
    protected String cityId;
    protected String cityName;
    protected String stateId;
    protected String countryId;
    protected String addressDescription;
    protected String addressType;
    protected String defaultInd;
    protected String observations;
    protected String streetType;
    protected PhysicalPerson physicalPerson;
    protected Certificate certificate;

    
    
    /**
	 * 
	 */
	public Address() {
	}

	/**
	 * @param addressId
	 * @param cep
	 * @param streetName
	 * @param streetNumber
	 * @param complement
	 * @param neighborhood
	 * @param cityId
	 * @param cityName
	 * @param stateId
	 * @param countryId
	 * @param addressDescription
	 * @param addressType
	 * @param defaultInd
	 * @param observations
	 * @param streetType
	 * @param physicalPerson
	 * @param certificate
	 */
	public Address(String addressId, String cep, String streetName, String streetNumber, String complement, String neighborhood,
			String cityId, String cityName, String stateId, String countryId, String addressDescription, String addressType,
			String defaultInd, String observations, String streetType, PhysicalPerson physicalPerson, Certificate certificate) {
		this.addressId = addressId;
		this.cep = cep;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.cityId = cityId;
		this.cityName = cityName;
		this.stateId = stateId;
		this.countryId = countryId;
		this.addressDescription = addressDescription;
		this.addressType = addressType;
		this.defaultInd = defaultInd;
		this.observations = observations;
		this.streetType = streetType;
		this.physicalPerson = physicalPerson;
		this.certificate = certificate;
	}

	/**
     * Obt�m o valor da propriedade addressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Define o valor da propriedade addressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Obt�m o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obt�m o valor da propriedade streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Define o valor da propriedade streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obt�m o valor da propriedade streetNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Define o valor da propriedade streetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Obt�m o valor da propriedade complement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplement() {
        return complement;
    }

    /**
     * Define o valor da propriedade complement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplement(String value) {
        this.complement = value;
    }

    /**
     * Obt�m o valor da propriedade neighborhood.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Define o valor da propriedade neighborhood.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborhood(String value) {
        this.neighborhood = value;
    }

    /**
     * Obt�m o valor da propriedade cityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * Define o valor da propriedade cityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * Obt�m o valor da propriedade cityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Define o valor da propriedade cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Obt�m o valor da propriedade stateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * Define o valor da propriedade stateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateId(String value) {
        this.stateId = value;
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
     * Obt�m o valor da propriedade addressDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDescription() {
        return addressDescription;
    }

    /**
     * Define o valor da propriedade addressDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDescription(String value) {
        this.addressDescription = value;
    }

    /**
     * Obt�m o valor da propriedade addressType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Define o valor da propriedade addressType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
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
     * Obt�m o valor da propriedade observations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservations() {
        return observations;
    }

    /**
     * Define o valor da propriedade observations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservations(String value) {
        this.observations = value;
    }

    /**
     * Obt�m o valor da propriedade streetType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Define o valor da propriedade streetType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [");
		if (addressId != null) {
			builder.append("addressId=");
			builder.append(addressId);
			builder.append(", ");
		}
		if (cep != null) {
			builder.append("cep=");
			builder.append(cep);
			builder.append(", ");
		}
		if (streetName != null) {
			builder.append("streetName=");
			builder.append(streetName);
			builder.append(", ");
		}
		if (streetNumber != null) {
			builder.append("streetNumber=");
			builder.append(streetNumber);
			builder.append(", ");
		}
		if (complement != null) {
			builder.append("complement=");
			builder.append(complement);
			builder.append(", ");
		}
		if (neighborhood != null) {
			builder.append("neighborhood=");
			builder.append(neighborhood);
			builder.append(", ");
		}
		if (cityId != null) {
			builder.append("cityId=");
			builder.append(cityId);
			builder.append(", ");
		}
		if (cityName != null) {
			builder.append("cityName=");
			builder.append(cityName);
			builder.append(", ");
		}
		if (stateId != null) {
			builder.append("stateId=");
			builder.append(stateId);
			builder.append(", ");
		}
		if (countryId != null) {
			builder.append("countryId=");
			builder.append(countryId);
			builder.append(", ");
		}
		if (addressDescription != null) {
			builder.append("addressDescription=");
			builder.append(addressDescription);
			builder.append(", ");
		}
		if (addressType != null) {
			builder.append("addressType=");
			builder.append(addressType);
			builder.append(", ");
		}
		if (defaultInd != null) {
			builder.append("defaultInd=");
			builder.append(defaultInd);
			builder.append(", ");
		}
		if (observations != null) {
			builder.append("observations=");
			builder.append(observations);
			builder.append(", ");
		}
		if (streetType != null) {
			builder.append("streetType=");
			builder.append(streetType);
			builder.append(", ");
		}
		if (physicalPerson != null) {
			builder.append("physicalPerson=");
			builder.append(physicalPerson);
			builder.append(", ");
		}
		if (certificate != null) {
			builder.append("certificate=");
			builder.append(certificate);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
