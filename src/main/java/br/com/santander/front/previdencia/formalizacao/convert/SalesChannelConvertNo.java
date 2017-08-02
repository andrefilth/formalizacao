package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.SalesChannelBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.SalesChannel;
import br.com.santander.front.previdencia.formalizacao.entity.SalesChannelAgency;

/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto SalesChannel
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class SalesChannelConvertNo {
	
	private static final String AGENCY = "agencies";

	private static Logger logger = Logger.getLogger(SalesChannelConvertNo.class);

	private static final String SALES_CHANNEL_ID = "salesChannelId";
	
	private SalesChannel sales;
	
	private List<SalesChannelAgency> salesList;

	@Autowired
	private SalesChannelAgencyConvertNo agency;
	
	public SalesChannel findNoSalesChannel(org.w3c.dom.Document documentoXml, String salesChannel) {
		sales = null;
		salesList = new ArrayList<>();
		final NodeList salesNode = documentoXml.getElementsByTagName(salesChannel);
		for (int i = 0; i < salesNode.getLength(); i++) {
			Node nNode = salesNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String salesChannelId = element.getElementsByTagName(SALES_CHANNEL_ID).item(0).getTextContent();
				salesList = this.agency.findNoSalesChannelAgency(documentoXml, AGENCY);
				sales = new SalesChannelBuilder()
						.withSalesChannelId(salesChannelId)
						.withAgencies(salesList)
						.createSalesChannel();
				logger.info("Elementos de SalesChannel:  " + sales);
			}
		}
		return sales;
	}

	
}
