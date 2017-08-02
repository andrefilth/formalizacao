package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.ReserveBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Fund;
import br.com.santander.front.previdencia.formalizacao.entity.Reserve;


/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto Reserve
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class ReserveConvertNO {


	private static final String FUNDS = "funds";
	private static final String RESERVE_ID = "reserveId";
	

	private List<Reserve> reservesList;
	
	private Reserve reserves;
	
	private List<Fund> fundList;

	@Autowired
	private FundoConvertNO fundNo;

	private static Logger logger = Logger.getLogger(ReserveConvertNO.class);

	public List<Reserve> findNoReserves(Document documentoXml, String reserve) {
		reserves = null;
		reservesList = new ArrayList<>();
		fundList = new ArrayList<>();
		final NodeList reserveNode = documentoXml.getElementsByTagName(reserve);
		for (int i = 0; i < reserveNode.getLength(); i++) {
			Node nNode = reserveNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String reserveId = element.getElementsByTagName(RESERVE_ID).item(0).getTextContent();
				fundList = this.fundNo.findNoFund(documentoXml, FUNDS);
				reserves = new ReserveBuilder().withReserveId(reserveId).withFunds(fundList).createReserve();

				reservesList.add(reserves);
				logger.info("Elementos de Funds:  " + reserves);
			}
		}
		return reservesList;
	}

}
