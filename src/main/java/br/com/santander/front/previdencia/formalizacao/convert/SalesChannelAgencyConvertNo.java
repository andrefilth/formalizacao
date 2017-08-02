/**
 * 
 */
package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.SalesChannelAgencyBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.SalesChannelAgency;

/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto SalesChannelAgency
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class SalesChannelAgencyConvertNo {

	private static final String AGENCY_ID = "salesAgencyId";

	private static Logger logger = Logger.getLogger(SalesChannelAgencyConvertNo.class);

	private SalesChannelAgency agency;
	
	private List<SalesChannelAgency> agencyList;

	public List<SalesChannelAgency> findNoSalesChannelAgency(Document documentoXml, String agencyId) {
		agency = null;
		agencyList = new ArrayList<>();
		final NodeList salesNode = documentoXml.getElementsByTagName(agencyId);
		for (int i = 0; i < salesNode.getLength(); i++) {
			Node nNode = salesNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String salesAgencyId = element.getElementsByTagName(AGENCY_ID).item(0).getTextContent();
				agency = new SalesChannelAgencyBuilder().withSalesAgencyId(salesAgencyId)
						.createSalesChannelAgency();
				agencyList.add(agency);
				logger.info("Elementos de SalesChannelAgency:  " + agency);
			}
		}
		return agencyList;
	}

}
