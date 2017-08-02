
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.santander.front.previdencia.formalizacao.type.PersonType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "documentType",
    "description",
    "mask",
    "abbreviation",
    "personType"
})
public class DocumentType {

    protected String documentType;
    protected String description;
    protected String mask;
    protected String abbreviation;
    @XmlSchemaType(name = "string")
    protected PersonType personType;
    
    

    /**
	 * 
	 */
	public DocumentType() {
	}

	/**
	 * @param documentType
	 * @param description
	 * @param mask
	 * @param abbreviation
	 * @param personType
	 */
	public DocumentType(String documentType, String description, String mask, String abbreviation,
			PersonType personType) {
		this.documentType = documentType;
		this.description = description;
		this.mask = mask;
		this.abbreviation = abbreviation;
		this.personType = personType;
	}

	/**
     * Obt�m o valor da propriedade documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define o valor da propriedade documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
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
     * Obt�m o valor da propriedade mask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Define o valor da propriedade mask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Obt�m o valor da propriedade abbreviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Define o valor da propriedade abbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Obt�m o valor da propriedade personType.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPersonType() {
        return personType;
    }

    /**
     * Define o valor da propriedade personType.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPersonType(PersonType value) {
        this.personType = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentType [");
		if (documentType != null) {
			builder.append("documentType=");
			builder.append(documentType);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (mask != null) {
			builder.append("mask=");
			builder.append(mask);
			builder.append(", ");
		}
		if (abbreviation != null) {
			builder.append("abbreviation=");
			builder.append(abbreviation);
			builder.append(", ");
		}
		if (personType != null) {
			builder.append("personType=");
			builder.append(personType);
		}
		builder.append("]");
		return builder.toString();
	}

}
