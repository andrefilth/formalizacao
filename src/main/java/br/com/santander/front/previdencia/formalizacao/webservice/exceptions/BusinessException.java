package br.com.santander.front.previdencia.formalizacao.webservice.exceptions;

import br.com.santander.front.previdencia.simulacao.model.entity.Retorno;

public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -778512675961050123L;


	public BusinessException(String message) {
		super(Utils.removeAcento(message));
	}


	public BusinessException(String message, Throwable cause) {
		super(message, cause);

	}


	public BusinessException(Retorno retorno) {
		// TODO Auto-generated constructor stub
	}

}
