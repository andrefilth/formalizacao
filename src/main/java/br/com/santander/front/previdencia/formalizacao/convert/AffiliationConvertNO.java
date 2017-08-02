package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.AffiliationBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Address;
import br.com.santander.front.previdencia.formalizacao.entity.Affiliation;
import br.com.santander.front.previdencia.formalizacao.entity.Benefit;
import br.com.santander.front.previdencia.formalizacao.entity.Broker;
import br.com.santander.front.previdencia.formalizacao.entity.Document;
import br.com.santander.front.previdencia.formalizacao.entity.Payment;
import br.com.santander.front.previdencia.formalizacao.entity.Phone;
import br.com.santander.front.previdencia.formalizacao.entity.PhysicalPerson;
import br.com.santander.front.previdencia.formalizacao.entity.Product;
import br.com.santander.front.previdencia.formalizacao.entity.QuestionAnswer;
import br.com.santander.front.previdencia.formalizacao.entity.SalesChannel;
import br.com.santander.front.previdencia.formalizacao.type.FormType;
import br.com.santander.front.previdencia.formalizacao.type.SexType;
import br.com.santander.front.previdencia.formalizacao.utils.DatasUtil;

/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto AffiliationBuilder
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class AffiliationConvertNO {

	private static Logger logger = Logger.getLogger(AffiliationConvertNO.class);

	private static final String SALES_CHANNEL = "salesChannel";

	private static final String REGULAR_PAYMENT = "regularPayment";

	private static final String INITIAL_PAYMENT = "initialPayment";

	private static final String BENEFITS = "benefits";

	private static final String PHONES = "phones";

	private static final String ADDRESSES = "addresses";

	private static final String SALES_BROKERS = "salesBrokers";

	private static final String PERSON = "finantialResponsiblePerson";

	private static final String PRODUCT = "product";

	private static final String DOCUMENTS = "documents";

	@Autowired
	private SalesBrokersConvertNo sales;

	@Autowired
	private PhysicalPersonConvertNO person;

	@Autowired
	private ProductConvertNO product;

	@Autowired
	private DocumentConvertNO document;

	@Autowired
	private AddressConvertNO add;

	@Autowired
	private PhoneConvertNO phones;

	@Autowired
	private BenefitConvertNO benefits;

	@Autowired
	private PaymentConvertNO pay;

	@Autowired
	private SalesChannelConvertNo channel;

	private Affiliation affiliation;

	public Affiliation findNoAffiliation(org.w3c.dom.Document documentoXml, String noRaiz) throws Exception {
		affiliation = null;
		final NodeList affiliationNode = documentoXml.getElementsByTagName(noRaiz);

		for (int i = 0; i < affiliationNode.getLength(); i++) {
			Node nNode = affiliationNode.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String retirementDate = element.getElementsByTagName("retirementDate").item(0).getTextContent();
				String requestDate = element.getElementsByTagName("requestDate").item(0).getTextContent();
				String inputInformationType = element.getElementsByTagName("inputInformationType").item(0)
						.getTextContent();
				String incomingPortabilityInd = element.getElementsByTagName("incomingPortabilityInd").item(0)
						.getTextContent();
				String clientSex = element.getElementsByTagName("clientSex").item(0).getTextContent();
				String birthDate = element.getElementsByTagName("birthDate").item(0).getTextContent();
				String nationalityId = element.getElementsByTagName("nationalityId").item(0).getTextContent();
				String salesOriginId = element.getElementsByTagName("salesOriginId").item(0).getTextContent();

				List<Broker> salesBrokers = this.sales.findNoSalesBrokers(documentoXml, SALES_BROKERS);

				String salesAgentId = element.getElementsByTagName("salesAgentId").item(0).getTextContent();
				String taxOptionType = element.getElementsByTagName("taxOptionType").item(0).getTextContent();

				PhysicalPerson finantialResponsiblePerson = this.person.findNoPhysicalPerson(documentoXml, PERSON);

				String maritalStatus = element.getElementsByTagName("maritalStatus").item(0).getTextContent();
				String formType = element.getElementsByTagName("formType").item(0).getTextContent();

				Product product = this.product.findNoProduct(documentoXml, PRODUCT);
				List<Document> documents = this.document.findNoDocuments(documentoXml, DOCUMENTS);
				List<Address> address = this.add.findNoAddress(documentoXml, ADDRESSES);
				List<Phone> phone = this.phones.findeNoPhone(documentoXml, PHONES);
				List<Benefit> benefit = this.benefits.findNoBenefit(documentoXml, BENEFITS);
				Payment initialPayment = this.pay.findNoPayment(documentoXml, INITIAL_PAYMENT);
				Payment regularPayment = this.pay.findNoPayment(documentoXml, REGULAR_PAYMENT);
				SalesChannel channel = this.channel.findNoSalesChannel(documentoXml, SALES_CHANNEL);
				PhysicalPerson client = finantialResponsiblePerson;
				String clientId = element.getElementsByTagName("clientId").item(0).getTextContent();
				String residenceCountryId = element.getElementsByTagName("residenceCountryId").item(0).getTextContent();

				String digitalSignature = "";
				String formalizationChannel = "";
				String dossieId = "";
				String salesAgentEmail = "";
				List<QuestionAnswer> questionaryAnswers = new ArrayList<>();
				affiliation = new AffiliationBuilder()
						.withRetirementDate(DatasUtil.converteXMLGregorianCalendar(retirementDate))
						.withRequestDate(DatasUtil.converteXMLGregorianCalendar(requestDate))
						.withInputInformationType(inputInformationType)
						.withIncomingPortabilityInd(incomingPortabilityInd).withClientSex(SexType.fromValue(clientSex))
						.withBirthDate(DatasUtil.converteXMLGregorianCalendar(birthDate))
						.withNationalityId(nationalityId).withSalesOriginId(salesOriginId)
						.withSalesBrokers(salesBrokers).withSalesAgentId(salesAgentId).withTaxOptionType(taxOptionType)
						.withFinantialResponsiblePerson(finantialResponsiblePerson).withMaritalStatus(maritalStatus)
						.withFormType(FormType.fromValue(formType)).withProduct(product).withDocuments(documents)
						.withAddresses(address).withPhones(phone).withBenefits(benefit)
						.withInitialPayment(initialPayment).withRegularPayment(regularPayment).withSalesChannel(channel)
						.withClientId(clientId).withClient(client).withResidenceCountryId(residenceCountryId)
						// campos do request mas não tem massa pra eles
						.withDigitalSignature(digitalSignature)
						.withFormalizationChannel(formalizationChannel)
						.withDossieId(dossieId)
						.withSalesAgentEmail(salesAgentEmail)
						.withQuestionaryAnswers(questionaryAnswers )
						.createAffiliation();
				logger.info("Elementos de Affiliation:  " + affiliation);
			}
		}
		return affiliation;
	}

	/**
	 * Método responsável por extrair do nó de affiliation o Usuário e senha do
	 * HEAD do SecuritySOAP
	 * 
	 * @param org.w3c.dom.Document
	 *            documentoXml
	 * @param String
	 *            Raiz
	 */
	public String findNoSecuritySoap(org.w3c.dom.Document documentoXml, String raiz) {
		String username = "";
		final NodeList securitySoapNode = documentoXml.getElementsByTagName(raiz);
		for (int i = 0; i < securitySoapNode.getLength(); i++) {
			Node nNode = securitySoapNode.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				Node item = element.getElementsByTagName("username").item(0);
				if(item != null) {
					username = item.getTextContent();
				}else {
					throw new RuntimeException("Usuário e senha nulos/inválidos, favor verificar os dados enviados !");
				}
			}
		}
		return username;

	}
}
