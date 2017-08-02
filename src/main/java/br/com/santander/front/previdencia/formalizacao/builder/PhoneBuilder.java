package br.com.santander.front.previdencia.formalizacao.builder;

import br.com.santander.front.previdencia.formalizacao.entity.Phone;
import br.com.santander.front.previdencia.formalizacao.entity.PhysicalPerson;

public class PhoneBuilder {

	private String phoneId;
	private String areaCode;
	private String phoneNumber;
	private String phoneType;
	private String phoneLocation;
	private Integer extensionNumber;
	private String observation;
	private String acceptsSMS;
	private PhysicalPerson physicalPerson;
	private String defaultInd;

	/**
	 * @param phoneId
	 *            the phoneId to with
	 */
	public PhoneBuilder withPhoneId(String phoneId) {
		this.phoneId = phoneId;
		return this;
	}

	/**
	 * @param areaCode
	 *            the areaCode to with
	 */
	public PhoneBuilder withAreaCode(String areaCode) {
		this.areaCode = areaCode;
		return this;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to with
	 */
	public PhoneBuilder withPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	/**
	 * @param phoneType
	 *            the phoneType to with
	 */
	public PhoneBuilder withPhoneType(String phoneType) {
		this.phoneType = phoneType;
		return this;
	}

	/**
	 * @param phoneLocation
	 *            the phoneLocation to with
	 */
	public PhoneBuilder withPhoneLocation(String phoneLocation) {
		this.phoneLocation = phoneLocation;
		return this;
	}

	/**
	 * @param extensionNumber
	 *            the extensionNumber to with
	 */
	public PhoneBuilder withExtensionNumber(Integer extensionNumber) {
		this.extensionNumber = extensionNumber;
		return this;
	}

	/**
	 * @param observation
	 *            the observation to with
	 */
	public PhoneBuilder withObservation(String observation) {
		this.observation = observation;
		return this;
	}

	/**
	 * @param acceptsSMS
	 *            the acceptsSMS to with
	 */
	public PhoneBuilder withAcceptsSMS(String acceptsSMS) {
		this.acceptsSMS = acceptsSMS;
		return this;
	}

	/**
	 * @param physicalPerson
	 *            the physicalPerson to with
	 */
	public PhoneBuilder withPhysicalPerson(PhysicalPerson physicalPerson) {
		this.physicalPerson = physicalPerson;
		return this;
	}

	/**
	 * @param defaultInd
	 *            the defaultInd to with
	 */
	public PhoneBuilder withDefaultInd(String defaultInd) {
		this.defaultInd = defaultInd;
		return this;
	}

	public Phone createPhone() {
		return new Phone(phoneId, areaCode, phoneNumber, phoneType, phoneLocation, extensionNumber, observation,
				defaultInd, physicalPerson, acceptsSMS);
	}
}
