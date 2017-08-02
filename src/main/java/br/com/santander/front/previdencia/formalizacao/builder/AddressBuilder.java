package br.com.santander.front.previdencia.formalizacao.builder;

import br.com.santander.front.previdencia.formalizacao.entity.Address;
import br.com.santander.front.previdencia.formalizacao.entity.Certificate;
import br.com.santander.front.previdencia.formalizacao.entity.PhysicalPerson;

public class AddressBuilder {

	private String addressId;
	private String cep;
	private String streetName;
	private String streetNumber;
	private String complement;
	private String neighborhood;
	private String cityId;
	private String stateId;
	private String addressType;
	private String countryId;
	private String defaultInd;
	private String observations;
	private String streetType;
	private String addressDescription;
	private PhysicalPerson physicalPerson;
	private String cityName;
	private Certificate certificate;

	/**
	 * @param addressId
	 *            the addressId to with
	 */
	public AddressBuilder withAddressId(String addressId) {
		this.addressId = addressId;
		return this;
	}

	/**
	 * @param cep
	 *            the cep to with
	 */
	public AddressBuilder withCep(String cep) {
		this.cep = cep;
		return this;
	}

	/**
	 * @param streetName
	 *            the streetName to with
	 */
	public AddressBuilder withStreetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	/**
	 * @param streetNumber
	 *            the streetNumber to with
	 */
	public AddressBuilder withStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
		return this;
	}

	/**
	 * @param complement
	 *            the complement to with
	 */
	public AddressBuilder withComplement(String complement) {
		this.complement = complement;
		return this;
	}

	/**
	 * @param neighborhood
	 *            the neighborhood to with
	 */
	public AddressBuilder withNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
		return this;
	}

	/**
	 * @param cityId
	 *            the cityId to with
	 */
	public AddressBuilder withCityId(String cityId) {
		this.cityId = cityId;
		return this;
	}

	/**
	 * @param stateId
	 *            the stateId to with
	 */
	public AddressBuilder withStateId(String stateId) {
		this.stateId = stateId;
		return this;
	}

	/**
	 * @param addressType
	 *            the addressType to with
	 */
	public AddressBuilder withAddressType(String addressType) {
		this.addressType = addressType;
		return this;
	}

	/**
	 * @param countryId
	 *            the countryId to with
	 */
	public AddressBuilder withCountryId(String countryId) {
		this.countryId = countryId;
		return this;
	}

	/**
	 * @param defaultInd
	 *            the defaultInd to with
	 */
	public AddressBuilder withDefaultInd(String defaultInd) {
		this.defaultInd = defaultInd;
		return this;
	}

	/**
	 * @param observations
	 *            the observations to with
	 */
	public AddressBuilder withObservations(String observations) {
		this.observations = observations;
		return this;
	}

	/**
	 * @param streetType
	 *            the streetType to with
	 */
	public AddressBuilder withStreetType(String streetType) {
		this.streetType = streetType;
		return this;
	}

	/**
	 * @param addressDescription
	 *            the addressDescription to with
	 */
	public AddressBuilder withAddressDescription(String addressDescription) {
		this.addressDescription = addressDescription;
		return this;
	}

	/**
	 * @param physicalPerson
	 *            the physicalPerson to with
	 */
	public AddressBuilder withPhysicalPerson(PhysicalPerson physicalPerson) {
		this.physicalPerson = physicalPerson;
		return this;
	}

	/**
	 * @param cityName
	 *            the cityName to with
	 */
	public AddressBuilder withCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	/**
	 * @param certificate
	 *            the certificate to with
	 */
	public AddressBuilder withCertificate(Certificate certificate) {
		this.certificate = certificate;
		return this;
	}

	public Address createAdress() {
		return new Address(addressId, cep, streetName, streetNumber, complement, neighborhood, cityId, cityName, stateId, countryId,
				addressDescription, addressType, defaultInd, observations, streetType, physicalPerson, certificate);
	}

}
