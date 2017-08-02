package br.com.santander.front.previdencia.formalizacao.resource;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.santander.front.previdencia.simulacao.model.entity.Retorno;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retorno" type="{http://santander/frontUnico/previdencia}Retorno"/>
 *         &lt;element name="codigoAdesao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="códigoUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dadosProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dadosMobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disclaimer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retorno",
    "codigoAdesao",
    "codigoCertificado",
    "codigoUsuario",
    "dadosProduto",
    "dadosMobile",
    "disclaimer"
})
@XmlRootElement(name = "getFormalizaResponse")
public class GetFormalizaResponse {

    @XmlElement(required = true)
    protected Retorno retorno;
    @XmlElement(required = true)
    protected String codigoAdesao;
    @XmlElement(required = true)
    protected String codigoCertificado;
    @XmlElement(required = true)
    protected String codigoUsuario;
    @XmlElement(required = true)
    protected String dadosProduto;
    @XmlElement(required = true)
    protected String dadosMobile;
    @XmlElement(required = true)
    protected String disclaimer;

    /**
     * Obtém o valor da propriedade retorno.
     * 
     * @return
     *     possible object is
     *     {@link Retorno }
     *     
     */
    public Retorno getRetorno() {
        return retorno;
    }

    /**
     * Define o valor da propriedade retorno.
     * 
     * @param value
     *     allowed object is
     *     {@link Retorno }
     *     
     */
    public void setRetorno(Retorno value) {
        this.retorno = value;
    }

    /**
     * Obtém o valor da propriedade codigoAdesao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAdesao() {
        return codigoAdesao;
    }

    /**
     * Define o valor da propriedade codigoAdesao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAdesao(String value) {
        this.codigoAdesao = value;
    }

    /**
     * Obtém o valor da propriedade codigoCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCertificado() {
        return codigoCertificado;
    }

    /**
     * Define o valor da propriedade codigoCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCertificado(String value) {
        this.codigoCertificado = value;
    }

    /**
     * Obtém o valor da propriedade códigoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Define o valor da propriedade códigoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUsuario(String value) {
        this.codigoUsuario = value;
    }

    /**
     * Obtém o valor da propriedade dadosProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosProduto() {
        return dadosProduto;
    }

    /**
     * Define o valor da propriedade dadosProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosProduto(String value) {
        this.dadosProduto = value;
    }

    /**
     * Obtém o valor da propriedade dadosMobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosMobile() {
        return dadosMobile;
    }

    /**
     * Define o valor da propriedade dadosMobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosMobile(String value) {
        this.dadosMobile = value;
    }

    /**
     * Obtém o valor da propriedade disclaimer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Define o valor da propriedade disclaimer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

}
