package br.com.santander.front.previdencia.formalizacao.builder;

import java.util.List;

import br.com.santander.front.previdencia.formalizacao.entity.SalesChannel;
import br.com.santander.front.previdencia.formalizacao.entity.SalesChannelAgency;

public class SalesChannelBuilder {

	private String salesChannelId;
	private List<SalesChannelAgency> agencies;
	private String salesChannelName;
	

	
	




	/**
	 * @param salesChannelName with salesChannelName to with
	 */
	public SalesChannelBuilder withSalesChannelName(String salesChannelName) {
		this.salesChannelName = salesChannelName;
		return this;
	}



	/**
	 * @param salesChannelId the salesChannelId to with
	 * @return 
	 */
	public SalesChannelBuilder withSalesChannelId(String salesChannelId) {
		this.salesChannelId = salesChannelId;
		return this;
	}



	/**
	 * @param agencies the agencies to with
	 * @return 
	 */
	public SalesChannelBuilder withAgencies(List<SalesChannelAgency> agencies) {
		this.agencies = agencies;
		return this;
	}



	public SalesChannel createSalesChannel() {
		return new SalesChannel(salesChannelId, salesChannelName, agencies);
	}

}
