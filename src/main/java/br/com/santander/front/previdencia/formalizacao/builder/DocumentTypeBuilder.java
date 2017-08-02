package br.com.santander.front.previdencia.formalizacao.builder;

import br.com.santander.front.previdencia.formalizacao.entity.DocumentType;
import br.com.santander.front.previdencia.formalizacao.type.PersonType;

public class DocumentTypeBuilder {
	
	private String documentType;
    private String description;
    private String mask;
    private String abbreviation;
    private PersonType personType;
	/**
	 * @param documentType the documentType to with
	 * @return 
	 */
	public DocumentTypeBuilder withDocumentType(String documentType) {
		this.documentType = documentType;
		return this;
	}
	/**
	 * @param description the description to with
	 * @return 
	 */
	public DocumentTypeBuilder withDescription(String description) {
		this.description = description;
		return this;
	}
	/**
	 * @param mask the mask to with
	 * @return 
	 */
	public DocumentTypeBuilder withMask(String mask) {
		this.mask = mask;
		return this;
	}
	/**
	 * @param abbreviation the abbreviation to with
	 * @return 
	 */
	public DocumentTypeBuilder withAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
		return this;
	}
	/**
	 * @param personType the personType to with
	 * @return 
	 */
	public DocumentTypeBuilder withPersonType(PersonType personType) {
		this.personType = personType;
		return this;
	}

	public DocumentType createDocumentType() {
		return new DocumentType(documentType, description, mask, abbreviation, personType);
	}

}
