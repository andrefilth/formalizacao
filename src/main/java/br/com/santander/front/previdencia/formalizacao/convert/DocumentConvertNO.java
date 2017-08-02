package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.DocumentBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Document;
import br.com.santander.front.previdencia.formalizacao.entity.DocumentType;
import br.com.santander.front.previdencia.formalizacao.utils.DatasUtil;

/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto Document
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class DocumentConvertNO {

	private static final String DOCUMENT_TYPE = "documentType";

	private static final String HOLDER_PERSON_ID = "holderPersonId";

	private static final String DISPATCHER = "dispatcher";

	private static final String EMISSION_DATE = "emissionDate";

	private static final String DOCUMENT_NUMBER = "documentNumber";

	private static Logger logger = Logger.getLogger(DocumentConvertNO.class);

	private List<Document> documents;

	private Document document;

	@Autowired
	private DocumentTypeConvertNO type;
	
	private DocumentType documentType;

	public List<Document> findNoDocuments(org.w3c.dom.Document documentoXml, String string) throws Exception {
		String documentNumber = "";
		String emissionDate="";
		String dispatchers = "";
		String holderPersonId = "";
		documentType = null;
		document = null;
		documents = new ArrayList<>();
		final NodeList documentNode = documentoXml.getElementsByTagName(string);
		for (int i = 0; i < documentNode.getLength(); i++) {
			Node nNode = documentNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				Node nodeDocumentNumber = element.getElementsByTagName(DOCUMENT_NUMBER).item(0);
				Node nodeEmissionDate =  element.getElementsByTagName(EMISSION_DATE).item(0);
				Node nodeDispatchers =  element.getElementsByTagName(DISPATCHER).item(0);
				Node nodeHolderPersonId = element.getElementsByTagName(HOLDER_PERSON_ID).item(0);
				Node nodeDocumentType = element.getElementsByTagName(DOCUMENT_TYPE).item(0);
				if(nodeDocumentNumber != null) {
					documentNumber = nodeDocumentNumber.getTextContent();
				}
				if(nodeEmissionDate != null) {
					emissionDate = nodeEmissionDate.getTextContent();
				}
				if(nodeDispatchers != null) {
					dispatchers = nodeDispatchers.getTextContent();
				}
				if(nodeHolderPersonId != null) {
					holderPersonId = nodeHolderPersonId.getTextContent();
				}
				// Pegar o elemento documentType
				if(nodeDocumentType != null) {
					
					documentType = this.type.findNoDocumentType(documentoXml, string);
				}
				document = new DocumentBuilder().withDocumentNumber(documentNumber)
												.withDocumentType(documentType)
												.withEmissionDate(DatasUtil.converteXMLGregorianCalendar(emissionDate))
												.withDispatcher(dispatchers)
												.withHolderPersonId(holderPersonId)
												.createDocument();
				logger.info("Elementos do nó: " + document);
				documents.add(document);
			}
		}

		return documents;
	}

}
