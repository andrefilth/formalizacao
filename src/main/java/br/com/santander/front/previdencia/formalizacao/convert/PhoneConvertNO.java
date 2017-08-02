package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.PhoneBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Phone;


/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto Phone
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class PhoneConvertNO {

	private static final String DEFAULT_IND = "defaultInd";
	private static final String EXTENSION_NUMBER = "extensionNumber";
	private static final String PHONE_LOCATION = "phoneLocation";
	private static final String PHONE_TYPE = "phoneType";
	private static final String PHONE_NUMBER = "phoneNumber";
	private static final String AREA_CODE = "areaCode";
	
	private static Logger logger = Logger.getLogger(PhoneConvertNO.class);

	private Phone phone;
	
	private List<Phone> phoneList;

	public List<Phone> findeNoPhone(org.w3c.dom.Document documentoXml, String phones) {
		phone = null;
		phoneList = new ArrayList<>();
		final NodeList phoneNode = documentoXml.getElementsByTagName(phones);
		for (int i = 0; i < phoneNode.getLength(); i++) {
			Node nNode = phoneNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String areaCode = element.getElementsByTagName(AREA_CODE).item(0).getTextContent();
				String phoneNumber = element.getElementsByTagName(PHONE_NUMBER).item(0).getTextContent();
				String phoneType = element.getElementsByTagName(PHONE_TYPE).item(0).getTextContent();
				String phoneLocation = element.getElementsByTagName(PHONE_LOCATION).item(0).getTextContent();
				String extensionNumber = element.getElementsByTagName(EXTENSION_NUMBER).item(0).getTextContent();
				String defaultInd = element.getElementsByTagName(DEFAULT_IND).item(0).getTextContent();
				phone = new PhoneBuilder().withAreaCode(areaCode).withPhoneNumber(phoneNumber).withPhoneType(phoneType)
						.withPhoneLocation(phoneLocation)
						.withExtensionNumber(Integer.parseInt(extensionNumber))
						.withDefaultInd(defaultInd)
						.createPhone();
				phoneList.add(phone);
				logger.info("Elementos de Phone:  " + phone);
			}
		}
		return phoneList;
	}
}
