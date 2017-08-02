package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.FundBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Fund;


/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto public class Fund
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class FundoConvertNO {

	private static final String DISTRIBUTION_PERCENT = "distributionPercent";

	private static final String FUND_ID = "fundId";

	private static Logger logger = Logger.getLogger(FundoConvertNO.class);

	private List<Fund> fundList;

	private Fund fund;

	public List<Fund> findNoFund(Document documentoXml, String funds) {
		fundList = new ArrayList<>();

		final NodeList fundsNode = documentoXml.getElementsByTagName(funds);
		for (int i = 0; i < fundsNode.getLength(); i++) {
			Node nNode = fundsNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String fundId = element.getElementsByTagName(FUND_ID).item(0).getTextContent();
				String distributionPercent = element.getElementsByTagName(DISTRIBUTION_PERCENT).item(0).getTextContent();
				fund = new FundBuilder().withFundId(fundId).withDistributionPercent(Double.parseDouble(distributionPercent)).createFund();
				fundList.add(fund);
				logger.info("Elementos de Fund:  " + fund);
			}
		}
		return fundList;
	}
}
