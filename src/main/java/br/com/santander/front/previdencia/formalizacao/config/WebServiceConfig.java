package br.com.santander.front.previdencia.formalizacao.config;

import org.apache.log4j.Logger;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * @author Izaura Silva
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

	private static Logger logger = Logger.getLogger(WebServiceConfig.class);

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "formalizacao")
	public DefaultWsdl11Definition formalizacao(XsdSchema formalizacaoSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("formalizaPort");
		definition.setLocationUri("/ws/formaliza");
		definition.setTargetNamespace("http://santander/frontUnico/previdencia");
		definition.setSchema(formalizacaoSchema);
		logger.info("Mapeamento do método formalizacao concluído com sucesso ");
		return definition;
	} 

	@Bean
	public XsdSchema formalizacaoSchema() {
		return new SimpleXsdSchema(new ClassPathResource("schemas\\formalizacao.xsd"));
	}

}