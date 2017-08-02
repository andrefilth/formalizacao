package br.com.santander.front.previdencia.formalizacao.webservice.exceptions;


public class AdesaoAsyncValidationException extends BusinessException  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdesaoAsyncValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdesaoAsyncValidationException(String message) {
        super(message);
    }
    
    public AdesaoAsyncValidationException(Throwable cause){
        super("", cause);
    }

}
