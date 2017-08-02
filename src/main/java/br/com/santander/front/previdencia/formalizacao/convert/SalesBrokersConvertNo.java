package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.BrokerBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Broker;
import br.com.santander.front.previdencia.simulacao.common.utils.BigDecimalUtil;


/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto SalesBrokers
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class SalesBrokersConvertNo {

	private static Logger logger = Logger.getLogger(SalesBrokersConvertNo.class);

	private Broker broker;

	private List<Broker> brokerList;

	public List<Broker> findNoSalesBrokers(org.w3c.dom.Document documentoXml, String sales) {
		broker = null;
		brokerList = new ArrayList<>();
		final NodeList salesBrokers = documentoXml.getElementsByTagName(sales);
		for (int i = 0; i < salesBrokers.getLength(); i++) {
			Node nNode = salesBrokers.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String brokerId = element.getElementsByTagName("brokerId").item(0).getTextContent();
				String participationPercent = element.getElementsByTagName("participationPercent").item(0).getTextContent();
				String mainInd = element.getElementsByTagName("mainInd").item(0).getTextContent();
				broker = new BrokerBuilder().withBrokerId(brokerId)
						.withParticipationPercent(BigDecimalUtil.converterBigDecimalParaDouble(participationPercent)).withMainInd(mainInd)
						.createBroker();
				brokerList.add(broker);
				logger.info("Elementos de SalesBrokers:  " + broker);
			}
		}

		return brokerList;
	}

}
