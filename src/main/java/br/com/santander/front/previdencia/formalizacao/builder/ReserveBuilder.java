package br.com.santander.front.previdencia.formalizacao.builder;

import java.util.List;

import br.com.santander.front.previdencia.formalizacao.entity.Contribution;
import br.com.santander.front.previdencia.formalizacao.entity.Fund;
import br.com.santander.front.previdencia.formalizacao.entity.Objective;
import br.com.santander.front.previdencia.formalizacao.entity.Reserve;

public class ReserveBuilder {

	private String reserveId;
	private String reserveDescription;
	private Objective objective;
	private List<Contribution> contributions;
	private List<Fund> funds;
	
	

	/**
	 * @param reserveId the reserveId to with
	 */
	public ReserveBuilder withReserveId(String reserveId) {
		this.reserveId = reserveId;
	return this;}



	/**
	 * @param reserveDescription the reserveDescription to with
	 */
	public ReserveBuilder withReserveDescription(String reserveDescription) {
		this.reserveDescription = reserveDescription;
	return this;}



	/**
	 * @param objective the objective to with
	 */
	public ReserveBuilder withObjective(Objective objective) {
		this.objective = objective;
	return this;}



	/**
	 * @param contributions the contributions to with
	 */
	public ReserveBuilder withContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	return this;}



	/**
	 * @param funds the funds to with
	 */
	public ReserveBuilder withFunds(List<Fund> funds) {
		this.funds = funds;
		return this;
	}



	public Reserve createReserve() {
		return new Reserve(reserveId, reserveDescription, objective, contributions, funds);
	}

}
