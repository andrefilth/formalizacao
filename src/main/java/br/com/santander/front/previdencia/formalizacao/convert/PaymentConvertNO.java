package br.com.santander.front.previdencia.formalizacao.convert;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.AddressBuilder;
import br.com.santander.front.previdencia.formalizacao.builder.PaymentBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Address;
import br.com.santander.front.previdencia.formalizacao.entity.Payment;
import br.com.santander.front.previdencia.formalizacao.type.PaymentMethod;
import br.com.santander.front.previdencia.formalizacao.utils.DatasUtil;


/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto Payment
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class PaymentConvertNO {

	private static final String PAYMENT_METHOD = "paymentMethod";
	private static final String FINANTIAL_ID = "finantialResponsiblePersonId";
	private static final String ADDRESS = "address";
	private static final String PAYMENT_DAY = "paymentDay";
	private static final String PAYMENT_DATE = "paymentDate";
	private static final String PAYMENT_TYPE_ID = "paymentTypeId";
	private static Logger logger = Logger.getLogger(PaymentConvertNO.class);

	public Payment findNoPayment(org.w3c.dom.Document documentoXml, String payments) throws NumberFormatException, Exception {
		Address address = null;
		Payment payment = null;
		String paymentTypeId = "0";
		String paymentDate="";
		String paymentDay = "";
		String paymentMethod = "";
		String addressId = "";
		String finantialResponsiblePersonId = "";
		final NodeList documentNode = documentoXml.getElementsByTagName(payments);
		for (int i = 0; i < documentNode.getLength(); i++) {
			Node nNode = documentNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				Node paymentTypeIdNode = element.getElementsByTagName(PAYMENT_TYPE_ID).item(0);
				Node paymentDateNode =  element.getElementsByTagName(PAYMENT_DATE).item(0);
				Node paymentDayNode =  element.getElementsByTagName(PAYMENT_DAY).item(0);
				Node paymentMethodNode = element.getElementsByTagName(PAYMENT_METHOD).item(0); 
				Node addressIdNode = element.getElementsByTagName(ADDRESS).item(0);
				Node finantialResponsiblePersonIdNode = element.getElementsByTagName(FINANTIAL_ID).item(0);
				if(paymentTypeIdNode != null) {
					paymentTypeId = paymentTypeIdNode.getTextContent();
				}
				if(paymentDateNode != null) {
					paymentDate = paymentDateNode.getTextContent();
				}
				if(paymentDayNode != null) {
					paymentDay = paymentDayNode.getTextContent();
				}
				if(addressIdNode != null) {
					addressId = addressIdNode.getTextContent();
					address = new AddressBuilder().withAddressId(addressId.trim()).createAdress();
				}
				// Pegar o elemento documentType
				if(finantialResponsiblePersonIdNode != null) {
					
					finantialResponsiblePersonId = finantialResponsiblePersonIdNode.getTextContent();
				}
				
				if(paymentMethodNode != null) {
					paymentMethod = paymentMethodNode.getTextContent();
				}
				payment = new PaymentBuilder()
						.withPaymentTypeId(paymentTypeId)
						.withPaymentDate(DatasUtil.converteXMLGregorianCalendar(paymentDate))
						.withPaymentDay(Integer.parseInt(paymentDay.replace("", "0")))
						.withAddress(address)
						.withFinantialResponsiblePersonId(finantialResponsiblePersonId)
						.withPaymentMethod(PaymentMethod.fromValue(paymentMethod))
						.createPayment();
				logger.info("Elementos do nó: " + payment);
			}
		}

		return payment;
	}

}
