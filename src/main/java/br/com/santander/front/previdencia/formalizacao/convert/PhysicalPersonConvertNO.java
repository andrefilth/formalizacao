package br.com.santander.front.previdencia.formalizacao.convert;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.PhysicalPersonBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.PhysicalPerson;

/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto PhysicalPerson
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class PhysicalPersonConvertNO {
	private static final String PERSON_ID = "physicalPersonId";
	private static Logger logger = Logger.getLogger(SalesBrokersConvertNo.class);

	public PhysicalPerson findNoPhysicalPerson(org.w3c.dom.Document documentoXml, String string) {
		PhysicalPerson physical = null;
		final NodeList physicalPerson = documentoXml.getElementsByTagName(string);
		for (int i = 0; i < physicalPerson.getLength(); i++) {
			Node nNode = physicalPerson.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String physicalPersonId = element.getElementsByTagName(PERSON_ID).item(0).getTextContent();
				physical = new PhysicalPersonBuilder().withPhysicalPersonId(physicalPersonId).createPhysicalPerson();
				logger.info("Elementos do nó: " + physical);
			}
		}

		return physical;
	}

}
