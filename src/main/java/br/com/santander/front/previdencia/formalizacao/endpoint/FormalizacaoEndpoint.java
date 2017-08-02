package br.com.santander.front.previdencia.formalizacao.endpoint;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.santander.front.previdencia.formalizacao.resource.GetFormalizaRequest;
import br.com.santander.front.previdencia.formalizacao.resource.GetFormalizaResponse;
import br.com.santander.front.previdencia.formalizacao.service.FormalizacaoService;

@Endpoint
public class FormalizacaoEndpoint {

	private static final String NAMESPACE_URI = "http://santander/frontUnico/previdencia";
	

	private static Logger logger = Logger.getLogger(FormalizacaoEndpoint.class);

	@Autowired
	private FormalizacaoService service;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFormalizaRequest")
	@ResponsePayload
	public GetFormalizaResponse getFormalizacao(@RequestPayload GetFormalizaRequest request) throws Exception {
		this.logEntrada(request);
		GetFormalizaResponse findUrl = this.service.findFormalizacao(request);
		return findUrl;
	}

	private void logEntrada(GetFormalizaRequest request) {
		logger.info("Dados de entrada do objeto GetFormalizaRequest");
		logger.info(request.toString());
	}
}
