package br.com.santander.front.previdencia.formalizacao.core;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * <p>
 * Classe que converte uma String que contém um XML para uma interface do tipo org.w3c.dom.Document 
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2018
 */
@Component
public class ConversorXml {
	
	private static Logger logger = Logger.getLogger(ConversorXml.class);
	/**
	 * 
	 * Método que recebe uma XML em uma String e transforma em um Documento do
	 * tipo DOM
	 * 
	 * @param valorXml
	 * @return org.w3c.dom.Document documentoXml
	 * @throws IOException
	 */

	public Document extrairXmlRequest(String valorXml)  {
		InputStream stream = new ByteArrayInputStream(valorXml.getBytes());

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document documentoXml = null;
		try {
			builder = factory.newDocumentBuilder();
			documentoXml = builder.parse(stream);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			logger.error("Não foi possível converter( parser )o XML em Document " + e);
			throw new RuntimeException ("Não foi possível converter( parser )o XML em Document " + e);
		}
		return documentoXml;
	}
}
