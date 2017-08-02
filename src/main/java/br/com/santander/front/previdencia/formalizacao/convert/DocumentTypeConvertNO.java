package br.com.santander.front.previdencia.formalizacao.convert;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.DocumentTypeBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.DocumentType;


/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto DocumentType
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class DocumentTypeConvertNO {

	private static final String DOCUMENT_TYPE = "documentType";
	
	private static Logger logger = Logger.getLogger(SalesBrokersConvertNo.class);
	
	public DocumentType findNoDocumentType(org.w3c.dom.Document documentoXml, String string) {
		DocumentType type = null;
		final NodeList documentType = documentoXml.getElementsByTagName(string);
		for (int i = 0; i < documentType.getLength(); i++) {
			Node nNode = documentType.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String documentTypes = element.getElementsByTagName(DOCUMENT_TYPE).item(0).getTextContent();
				type = new DocumentTypeBuilder().withDocumentType(documentTypes.trim()).createDocumentType();
				logger.info("Elementos do nó: " + type);
			}
		}

		return type;
		
	}

}
