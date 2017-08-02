package br.com.santander.front.previdencia.formalizacao.core;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.entity.Benefit;
import br.com.santander.front.previdencia.formalizacao.type.BenefitType;

/**
 * <p>
 * Classe que irá converter o retorno do Resquest em dados do produto.
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2018
 */

@Component
public class DadosResponseMobileXml {

	private static final String PLANO_PREVIDENCIA = "Planos de Previdência administrados pela Zurich Santander Brasil Seguros e "
			+ "Previdência S.A., CNPJ nº 87.376.109/0001-06. A aprovação dos planos pela "
			+ "SUSEP não implica, por parte da Autarquia, incentivo ou recomendação "
			+ "à sua comercialização. O participante poderá optar ou não pelo critério "
			+ "de tributação por alíquotas decrescentes. A opção pelo regime de tributação "
			+ "regressiva é irretratável. O simulador não constitui garantia de rentabilidade "
			+ "nem de resultados futuros, pois esses dependerão de performance do fundo que "
			+ "receberá os recursos do plano, ou seja, trata-se de mera simulação. "
			+ "O Santander não assume qualquer responsabilidade por qualquer decisão "
			+ "de investimento baseado no simulador. Consulte previamente o regulamento "
			+ "de cada plano, disponível nas agências ou no site santander.com.br. "
			+ "Para efeito de cálculo da renda vitalícia, foi utilizada a Tábua BR-EMSsb. "
			+ "Central de Atendimento: 4004 3535 (Regiões Metropolitanas), 0800 702 3535 "
			+ "(Demais Localidades) e 0800 723 5007 (Atendimento a clientes deficientes auditivos e fala). "
			+ "SAC: 0800 762 7777. Ouvidoria: 0800 726 0322";

	// private static final String PAGAMENTO = "Data do 1º pagamento ";
	// private static final String MENSAL = "Mensal: R$ ";
	// private static final String ADICIONAL = "Proteção Adicional";
	private static final String VENCIMENTO = "Dia do vencimento: ";
	private static final String DATA_PRIMEIRA = "Data da 1ª aplicação: ";
	private static final String MENSAIS = "Aplicações Mensais: R$ ";
	private static final String DATA = "Data da Aplicação: ";
	private static final String APLICAÇÃO_INICIAL = "Aplicação Inicial: R$ ";
	private static final String BARRA = "|";
	private static final String PROPOSTA = "Número da proposta: ";

	private static final String AVISO = "Aviso: Proposta enviada para análise da Zurich Santander";
	private static final String SUCESSO = "Sucesso: Proposta efetivada com sucesso";
	private static Logger logger = Logger.getLogger(DadosResponseMobileXml.class);

	/**
	 * Método que extrai os dados do REQUEST e monta uma String de Dados de
	 * Pruduto Mobile
	 * 
	 * @param paymentDate
	 * @param day
	 * @throws Exception
	 */
	public String concatenaCampoDadosMobile(Affiliation affiliationResult, XMLGregorianCalendar paymentDate,
			Integer day) {
		StringBuffer sb = new StringBuffer();
		// Double valorAcumulado = 0.0;
		sb.append(PROPOSTA);
		sb.append(affiliationResult.getAffiliationId());
		sb.append(BARRA);
		for (Benefit benefit : affiliationResult.getBenefits()) {
			if (benefit.getBenefitType().equals(BenefitType.PR)) {
				sb.append(APLICAÇÃO_INICIAL);
				sb.append(benefit.getInitialContributionValue());
				sb.append(BARRA);
			}
		}
		sb.append(DATA);
		String date = paymentDate.getDay() + "/" + paymentDate.getMonth() + "/" + paymentDate.getYear();
		sb.append(date);
		sb.append(BARRA);
		for (Benefit benefit : affiliationResult.getBenefits()) {
			if (benefit.getBenefitType().equals(BenefitType.PR)) {
				sb.append(MENSAIS);
				sb.append(benefit.getExpectedContributionValue());
				sb.append(BARRA);
			}
		}
		sb.append(DATA_PRIMEIRA);
		sb.append(date);
		sb.append(BARRA);
		sb.append(VENCIMENTO);
		sb.append(day);
		// sb.append(BARRA);
		// sb.append(BARRA);
		// for (Benefit benefit : affiliationResult.getBenefits()) {
		// if (benefit.getBenefitType().equals(BenefitType.RI)) {
		// if(benefit.getExpectedContributionValue() != null) {
		// valorAcumulado = + benefit.getExpectedContributionValue();
		// }
		// }
		// }
		// if (valorAcumulado > 0) {
		// sb.append(ADICIONAL);
		// sb.append(MENSAL);
		// sb.append(valorAcumulado);
		// sb.append(BARRA);
		// sb.append(PAGAMENTO);
		// sb.append(date);
		// sb.append(BARRA);
		// sb.append(VENCIMENTO);
		// sb.append(day);
		// sb.append(BARRA);
		//
		// }
		logger.info("Dados mobile: " + sb.toString());
		return sb.toString();
	}

	public String concatenaCampoDadosDisclaimer() {
		return PLANO_PREVIDENCIA;
	}

	public String concatenaCampoDadosProduto(Affiliation affiliationResult, XMLGregorianCalendar paymentDate) {
		StringBuffer sb = new StringBuffer();
		for (Benefit benefit : affiliationResult.getBenefits()) {
			if (benefit.getBenefitType().equals(BenefitType.RI)) {
				sb.append(BARRA);
				sb.append(AVISO);
			} else {
				sb.append(BARRA);
				sb.append(SUCESSO);
			}
		}
		sb.append(BARRA);
		String dataHora = paymentDate.getDay() + "/" + paymentDate.getMonth() + "/" + paymentDate.getYear() + " "
				+ paymentDate.getHour() + ":" + paymentDate.getMinute() + ":" + paymentDate.getSecond();
		sb.append(dataHora);
		sb.append(BARRA);
		sb.append(affiliationResult.getAccountId());
		sb.append(BARRA);
		for (Benefit benefit : affiliationResult.getBenefits()) {
			if (benefit.getBenefitType().equals(BenefitType.PR)) {
				sb.append(benefit.getInitialContributionValue());
			}
		}
		return sb.toString();
	}

}
