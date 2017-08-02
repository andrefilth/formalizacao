package br.com.santander.front.previdencia.formalizacao.builder;

import br.com.santander.front.previdencia.formalizacao.entity.SalesChannelAgency;

public class SalesChannelAgencyBuilder {

	private String salesChannelId;
	private String salesAgencyId;
	private String description;

	/**
	 * @param salesChannelId
	 *            the salesChannelId to with
	 */
	public SalesChannelAgencyBuilder withSalesChannelId(String salesChannelId) {
		this.salesChannelId = salesChannelId;
		return this;
	}

	/**
	 * @param salesAgencyId
	 *            the salesAgencyId to with
	 */
	public SalesChannelAgencyBuilder withSalesAgencyId(String salesAgencyId) {
		this.salesAgencyId = salesAgencyId;
		return this;
	}

	/**
	 * @param description
	 *            the description to with
	 */
	public SalesChannelAgencyBuilder withDescription(String description) {
		this.description = description;
		return this;
	}

	public SalesChannelAgency createSalesChannelAgency() {
		return new SalesChannelAgency(salesChannelId, salesAgencyId, description);
	}
}
