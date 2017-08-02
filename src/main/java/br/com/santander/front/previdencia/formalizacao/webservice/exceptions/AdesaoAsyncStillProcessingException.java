package br.com.santander.front.previdencia.formalizacao.webservice.exceptions;


public class AdesaoAsyncStillProcessingException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public AdesaoAsyncStillProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdesaoAsyncStillProcessingException(String message) {
        super(message);
    }

}
