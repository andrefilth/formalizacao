package br.com.santander.front.previdencia.formalizacao.builder;

import br.com.santander.front.previdencia.formalizacao.entity.Broker;
import br.com.santander.front.previdencia.formalizacao.entity.BrokerCategory;
import br.com.santander.front.previdencia.formalizacao.entity.Person;
import br.com.santander.front.previdencia.formalizacao.type.BrokerType;

/**
 * <p>
 * Classe de Builder da classe Broker
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
public class BrokerBuilder {

	private String brokerId;
	private String personName;
	private Double participationPercent;
	private String mainInd;
	private BrokerType brokerType;
	private BrokerCategory brokerCategory;
	private Boolean automaticMovimentApproverInd;
	private String platformBrokerId;
	private String superiorBrokerId;
	private String status;
	private Person person;
	private String legalIdentifier;
	private Boolean inheritCategoryVariationsInd;
	private Boolean isBroker;
	private Boolean isProLaboreOfficer;
	private Boolean isSalesOfficer;
	private Boolean isSalesAgent;
	private Boolean isSupervisor;
	private Boolean isExternal;
	private Boolean isPlatform;

	/**
	 * @param brokerId
	 *            the brokerId to with
	 */
	public BrokerBuilder withBrokerId(String brokerId) {
		this.brokerId = brokerId;
		return this;
	}

	/**
	 * @param personName
	 *            the personName to with
	 */
	public BrokerBuilder withPersonName(String personName) {
		this.personName = personName;
		return this;
	}

	/**
	 * @param participationPercent
	 *            the participationPercent to with
	 */
	public BrokerBuilder withParticipationPercent(Double participationPercent) {
		this.participationPercent = participationPercent;
		return this;
	}

	/**
	 * @param mainInd
	 *            the mainInd to with
	 */
	public BrokerBuilder withMainInd(String mainInd) {
		this.mainInd = mainInd;
		return this;
	}

	/**
	 * @param brokerType
	 *            the brokerType to with
	 */
	public BrokerBuilder withBrokerType(BrokerType brokerType) {
		this.brokerType = brokerType;
		return this;
	}

	/**
	 * @param brokerCategory
	 *            the brokerCategory to with
	 */
	public BrokerBuilder withBrokerCategory(BrokerCategory brokerCategory) {
		this.brokerCategory = brokerCategory;
		return this;
	}

	/**
	 * @param automaticMovimentApproverInd
	 *            the automaticMovimentApproverInd to with
	 */
	public BrokerBuilder withAutomaticMovimentApproverInd(Boolean automaticMovimentApproverInd) {
		this.automaticMovimentApproverInd = automaticMovimentApproverInd;
		return this;
	}

	/**
	 * @param platformBrokerId
	 *            the platformBrokerId to with
	 */
	public BrokerBuilder withPlatformBrokerId(String platformBrokerId) {
		this.platformBrokerId = platformBrokerId;
		return this;
	}

	/**
	 * @param superiorBrokerId
	 *            the superiorBrokerId to with
	 */
	public BrokerBuilder withSuperiorBrokerId(String superiorBrokerId) {
		this.superiorBrokerId = superiorBrokerId;
		return this;
	}

	/**
	 * @param status
	 *            the status to with
	 */
	public BrokerBuilder withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * @param person
	 *            the person to with
	 */
	public BrokerBuilder withPerson(Person person) {
		this.person = person;
		return this;
	}

	/**
	 * @param legalIdentifier
	 *            the legalIdentifier to with
	 */
	public BrokerBuilder withLegalIdentifier(String legalIdentifier) {
		this.legalIdentifier = legalIdentifier;
		return this;
	}

	/**
	 * @param inheritCategoryVariationsInd
	 *            the inheritCategoryVariationsInd to with
	 */
	public BrokerBuilder withInheritCategoryVariationsInd(Boolean inheritCategoryVariationsInd) {
		this.inheritCategoryVariationsInd = inheritCategoryVariationsInd;
		return this;
	}

	/**
	 * @param isBroker
	 *            the isBroker to with
	 */
	public BrokerBuilder withIsBroker(Boolean isBroker) {
		this.isBroker = isBroker;
		return this;
	}

	/**
	 * @param isProLaboreOfficer
	 *            the isProLaboreOfficer to with
	 */
	public BrokerBuilder withIsProLaboreOfficer(Boolean isProLaboreOfficer) {
		this.isProLaboreOfficer = isProLaboreOfficer;
		return this;
	}

	/**
	 * @param isSalesOfficer
	 *            the isSalesOfficer to with
	 */
	public BrokerBuilder withIsSalesOfficer(Boolean isSalesOfficer) {
		this.isSalesOfficer = isSalesOfficer;
		return this;
	}

	/**
	 * @param isSalesAgent
	 *            the isSalesAgent to with
	 */
	public BrokerBuilder withIsSalesAgent(Boolean isSalesAgent) {
		this.isSalesAgent = isSalesAgent;
		return this;
	}

	/**
	 * @param isSupervisor
	 *            the isSupervisor to with
	 */
	public BrokerBuilder withIsSupervisor(Boolean isSupervisor) {
		this.isSupervisor = isSupervisor;
		return this;
	}

	/**
	 * @param isExternal
	 *            the isExternal to with
	 */
	public BrokerBuilder withIsExternal(Boolean isExternal) {
		this.isExternal = isExternal;
		return this;
	}

	/**
	 * @param isPlatform
	 *            the isPlatform to with
	 */
	public BrokerBuilder withIsPlatform(Boolean isPlatform) {
		this.isPlatform = isPlatform;
		return this;
	}

	/**
	 * Método que cria uma instância de Broker
	 */
	public Broker createBroker() {
		return new Broker(brokerId, personName, participationPercent, mainInd, brokerType, brokerCategory,
				legalIdentifier, person, status, superiorBrokerId, platformBrokerId, automaticMovimentApproverInd,
				inheritCategoryVariationsInd, isBroker, isProLaboreOfficer, isSalesOfficer, isSalesAgent, isSupervisor,
				isPlatform, isExternal);
	}

}
