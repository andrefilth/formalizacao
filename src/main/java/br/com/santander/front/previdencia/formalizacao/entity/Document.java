
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "documentNumber",
    "expirationDate",
    "emissionDate",
    "dispatchPlace",
    "dispatcher",
    "documentType",
    "holderPersonId",
    "holderKinshipId",
    "additionalInformation"
})
public class Document {

    protected String documentNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emissionDate;
    protected String dispatchPlace;
    protected String dispatcher;
    protected DocumentType documentType;
    protected String holderPersonId;
    protected Integer holderKinshipId;
    protected String additionalInformation;
    
    

    /**
	 * 
	 */
	public Document() {
	}

	/**
	 * @param documentNumber
	 * @param expirationDate
	 * @param emissionDate
	 * @param dispatchPlace
	 * @param dispatcher
	 * @param documentType
	 * @param holderPersonId
	 * @param holderKinshipId
	 * @param additionalInformation
	 */
	public Document(String documentNumber, XMLGregorianCalendar expirationDate, XMLGregorianCalendar emissionDate,
			String dispatchPlace, String dispatcher, DocumentType documentType, String holderPersonId,
			Integer holderKinshipId, String additionalInformation) {
		this.documentNumber = documentNumber;
		this.expirationDate = expirationDate;
		this.emissionDate = emissionDate;
		this.dispatchPlace = dispatchPlace;
		this.dispatcher = dispatcher;
		this.documentType = documentType;
		this.holderPersonId = holderPersonId;
		this.holderKinshipId = holderKinshipId;
		this.additionalInformation = additionalInformation;
	}

	/**
     * Obt�m o valor da propriedade documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define o valor da propriedade documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obt�m o valor da propriedade expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define o valor da propriedade expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obt�m o valor da propriedade emissionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmissionDate() {
        return emissionDate;
    }

    /**
     * Define o valor da propriedade emissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmissionDate(XMLGregorianCalendar value) {
        this.emissionDate = value;
    }

    /**
     * Obt�m o valor da propriedade dispatchPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchPlace() {
        return dispatchPlace;
    }

    /**
     * Define o valor da propriedade dispatchPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchPlace(String value) {
        this.dispatchPlace = value;
    }

    /**
     * Obt�m o valor da propriedade dispatcher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatcher() {
        return dispatcher;
    }

    /**
     * Define o valor da propriedade dispatcher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatcher(String value) {
        this.dispatcher = value;
    }

    /**
     * Obt�m o valor da propriedade documentType.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Define o valor da propriedade documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Obt�m o valor da propriedade holderPersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderPersonId() {
        return holderPersonId;
    }

    /**
     * Define o valor da propriedade holderPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderPersonId(String value) {
        this.holderPersonId = value;
    }

    /**
     * Obt�m o valor da propriedade holderKinshipId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHolderKinshipId() {
        return holderKinshipId;
    }

    /**
     * Define o valor da propriedade holderKinshipId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHolderKinshipId(Integer value) {
        this.holderKinshipId = value;
    }

    /**
     * Obt�m o valor da propriedade additionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Define o valor da propriedade additionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Document [");
		if (documentNumber != null) {
			builder.append("documentNumber=");
			builder.append(documentNumber);
			builder.append(", ");
		}
		if (expirationDate != null) {
			builder.append("expirationDate=");
			builder.append(expirationDate);
			builder.append(", ");
		}
		if (emissionDate != null) {
			builder.append("emissionDate=");
			builder.append(emissionDate);
			builder.append(", ");
		}
		if (dispatchPlace != null) {
			builder.append("dispatchPlace=");
			builder.append(dispatchPlace);
			builder.append(", ");
		}
		if (dispatcher != null) {
			builder.append("dispatcher=");
			builder.append(dispatcher);
			builder.append(", ");
		}
		if (documentType != null) {
			builder.append("documentType=");
			builder.append(documentType);
			builder.append(", ");
		}
		if (holderPersonId != null) {
			builder.append("holderPersonId=");
			builder.append(holderPersonId);
			builder.append(", ");
		}
		if (holderKinshipId != null) {
			builder.append("holderKinshipId=");
			builder.append(holderKinshipId);
			builder.append(", ");
		}
		if (additionalInformation != null) {
			builder.append("additionalInformation=");
			builder.append(additionalInformation);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
