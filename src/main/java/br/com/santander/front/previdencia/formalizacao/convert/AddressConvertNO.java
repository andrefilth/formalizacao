package br.com.santander.front.previdencia.formalizacao.convert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.AddressBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Address;

/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto Address
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class AddressConvertNO {

	private static Logger logger = Logger.getLogger(AddressConvertNO.class);

	private static final String STREET_TYPE = "streetType";
	private static final String OBSERVATIONS = "observations";
	private static final String DEFAULT_IND = "defaultInd";
	private static final String ADDRESS_TYPE = "addressType";
	private static final String COUNTRY_ID = "countryId";
	private static final String STATE_ID = "stateId";
	private static final String CITY_ID = "cityId";
	private static final String NEIGHBORHOOD2 = "neighborhood";
	private static final String STREET_NUMBER = "streetNumber";
	private static final String STREET_NAME = "streetName";
	private static final String CEP = "cep";

	private Address address;
	private List<Address> addressList;
	
	public List<Address> findNoAddress(org.w3c.dom.Document documentoXml, String string) {
		address =  null;
		addressList = new ArrayList<>();
		final NodeList addresses = documentoXml.getElementsByTagName(string);
		for (int i = 0; i < addresses.getLength(); i++) {
			Node nNode = addresses.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String cep = element.getElementsByTagName(CEP).item(0).getTextContent();
				String streetName = element.getElementsByTagName(STREET_NAME).item(0).getTextContent();
				String streetNumber = element.getElementsByTagName(STREET_NUMBER).item(0).getTextContent();
				String neighborhood = element.getElementsByTagName(NEIGHBORHOOD2).item(0).getTextContent();
				String cityId = element.getElementsByTagName(CITY_ID).item(0).getTextContent();
				String stateId = element.getElementsByTagName(STATE_ID).item(0).getTextContent();
				String countryId = element.getElementsByTagName(COUNTRY_ID).item(0).getTextContent();
				String addressType = element.getElementsByTagName(ADDRESS_TYPE).item(0).getTextContent();
				String defaultInd = element.getElementsByTagName(DEFAULT_IND).item(0).getTextContent();
				String observations = element.getElementsByTagName(OBSERVATIONS).item(0).getTextContent();
				String streetType = element.getElementsByTagName(STREET_TYPE).item(0).getTextContent();
				address = new AddressBuilder().withCep(cep).withStreetName(streetName)
											.withStreetNumber(streetNumber).withNeighborhood(neighborhood)
											.withCityId(cityId).withStateId(stateId).withCountryId(countryId)
											.withAddressType(addressType).withDefaultInd(defaultInd)
											.withObservations(observations).withStreetType(streetType)
											.createAdress();
				addressList.add(address);
				logger.info("Elementos de Address:  " + address);
			}
		}

		return addressList;
	}

}
