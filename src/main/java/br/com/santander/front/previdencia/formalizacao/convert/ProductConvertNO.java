package br.com.santander.front.previdencia.formalizacao.convert;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.santander.front.previdencia.formalizacao.builder.ProductBuilder;
import br.com.santander.front.previdencia.formalizacao.entity.Product;


/**
 * <p>
 * Classe que recebe um Nó do XML e converte em Objeto Product
 * </p>
 * 
 * @author André Luiz Gonçalves Franco
 * @since 06/2017
 */
@Component
public class ProductConvertNO {
	
	private static Logger logger = Logger.getLogger(ProductConvertNO.class);

	public Product findNoProduct(org.w3c.dom.Document documentoXml, String string) {
		Product product = null;
		final NodeList productNode = documentoXml.getElementsByTagName(string);
		for (int i = 0; i < productNode.getLength(); i++) {
			Node nNode = productNode.item(i);
			logger.info("Elemento: " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nNode;
				String companyId = element.getElementsByTagName("companyId").item(0).getTextContent();
				String productId = element.getElementsByTagName("productId").item(0).getTextContent();
				product = new ProductBuilder().withCompanyId(companyId).withProductId(productId).createProduct();
				logger.info("Elementos do nó: " + product);
			}
		}

		return product;
	}

}
