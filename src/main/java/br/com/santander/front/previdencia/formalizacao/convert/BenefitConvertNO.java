package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.BenefitBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Benefit;
import br.com.santander.front.previdencia.formalizacao.entity.Reserve;
import br.com.santander.front.previdencia.formalizacao.type.BenefitType;

/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto Benefit
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class BenefitConvertNO {

	private static Logger logger = Logger.getLogger(BenefitConvertNO.class);

	@Autowired
	private ReserveConvertNO reservesNo;

	private static final String RESERVE = "reserves";
	private static final String LEGAL_HEIR = "legalHeir";
	private static final String INCOME_TYPE = "incomeType";
	private static final String DESIRED_TERM = "desiredTerm";
	private static final String REVERSION_PCT = "reversionPct";
	private static final String INITIAL_CONTRIBUTION = "initialContributionValue";
	private static final String EXPECTED_CONTRIBUTION = "expectedContributionValue";
	private static final String BENEFIT_TYPE = "benefitType";
	private static final String BENEFIT_ID = "benefitId";
	private static final String PLAN_ID = "planId";
	
	private List<Reserve> reserves;

	private List<Benefit> benefitList;

	private Benefit benefit;

	public List<Benefit> findNoBenefit(org.w3c.dom.Document documentoXml, String benefits) {
		reserves = new ArrayList<>();
		benefitList = new ArrayList<>();
		benefit = null;
		final NodeList benefitsNode = documentoXml.getElementsByTagName(benefits);
		for (int i = 0; i < benefitsNode.getLength(); i++) {
			Node nNode = benefitsNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String planId = element.getElementsByTagName(PLAN_ID).item(0).getTextContent();
				String benefitId = element.getElementsByTagName(BENEFIT_ID).item(0).getTextContent();
				String expectedContributionValue = element.getElementsByTagName(EXPECTED_CONTRIBUTION).item(0).getTextContent();
				String initialContributionValue = element.getElementsByTagName(INITIAL_CONTRIBUTION).item(0).getTextContent();
				String reversionPct = element.getElementsByTagName(REVERSION_PCT).item(0).getTextContent();
				String desiredTerm = element.getElementsByTagName(DESIRED_TERM).item(0).getTextContent();
				String incomeType = element.getElementsByTagName(INCOME_TYPE).item(0).getTextContent();
				String legalHeir = element.getElementsByTagName(LEGAL_HEIR).item(0).getTextContent();
				String benefitType = element.getElementsByTagName(BENEFIT_TYPE).item(0).getTextContent();
				
				reserves = this.reservesNo.findNoReserves(documentoXml, RESERVE);
				benefit = new BenefitBuilder().withPlanId(Integer.parseInt(planId))
												.withBenefitId(Integer.parseInt(benefitId))
												.withExpectedContributionValue(Double.parseDouble(expectedContributionValue))
												.withInitialContributionValue(Double.parseDouble(initialContributionValue))
												.withReversionPct(Double.parseDouble(reversionPct))
												.withDesiredTerm(Integer.parseInt(desiredTerm))
												.withIncomeType(Integer.parseInt(incomeType))
												.withLegalHeir(Boolean.parseBoolean(legalHeir))
												.withBenefitType(BenefitType.fromValue(benefitType))
												.withReserves(reserves)
												.createBenefit();
				benefitList.add(benefit);
				logger.info("Elementos de Benefit:  " + benefit);
			}
		}
		return benefitList;
	}
}
