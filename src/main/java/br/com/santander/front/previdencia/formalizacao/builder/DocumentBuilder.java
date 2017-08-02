package br.com.santander.front.previdencia.formalizacao.builder;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.formalizacao.entity.Document;
import br.com.santander.front.previdencia.formalizacao.entity.DocumentType;

public class DocumentBuilder {

	private String documentNumber;
	private XMLGregorianCalendar expirationDate;
	private XMLGregorianCalendar emissionDate;
	private String dispatchPlace;
	private String dispatcher;
	private DocumentType documentType;
	private String additionalInformation;
	private Integer holderKinshipId;
	private String holderPersonId;

	/**
	 * @param documentNumber
	 *            the documentNumber to with
	 */
	public DocumentBuilder withDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
		return this;
	}

	/**
	 * @param expirationDate
	 *            the expirationDate to with
	 */
	public DocumentBuilder withExpirationDate(XMLGregorianCalendar expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	/**
	 * @param emissionDate
	 *            the emissionDate to with
	 */
	public DocumentBuilder withEmissionDate(XMLGregorianCalendar emissionDate) {
		this.emissionDate = emissionDate;
		return this;
	}

	/**
	 * @param dispatchPlace
	 *            the dispatchPlace to with
	 */
	public DocumentBuilder withDispatchPlace(String dispatchPlace) {
		this.dispatchPlace = dispatchPlace;
		return this;
	}

	/**
	 * @param dispatcher
	 *            the dispatcher to with
	 */
	public DocumentBuilder withDispatcher(String dispatcher) {
		this.dispatcher = dispatcher;
		return this;
	}

	/**
	 * @param documentType
	 *            the documentType to with
	 */
	public DocumentBuilder withDocumentType(DocumentType documentType) {
		this.documentType = documentType;
		return this;
	}

	/**
	 * @param additionalInformation
	 *            the additionalInformation to with
	 */
	public DocumentBuilder withAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	/**
	 * @param holderKinshipId
	 *            the holderKinshipId to with
	 */
	public DocumentBuilder withHolderKinshipId(Integer holderKinshipId) {
		this.holderKinshipId = holderKinshipId;
		return this;
	}

	/**
	 * @param holderPersonId
	 *            the holderPersonId to with
	 */
	public DocumentBuilder withHolderPersonId(String holderPersonId) {
		this.holderPersonId = holderPersonId;
		return this;
	}

	public Document createDocument() {
		return new Document(documentNumber, expirationDate, emissionDate, dispatchPlace, dispatcher, documentType,
				holderPersonId, holderKinshipId, additionalInformation);
	}

}
