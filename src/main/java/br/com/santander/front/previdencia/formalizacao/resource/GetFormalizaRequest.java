package br.com.santander.front.previdencia.formalizacao.resource;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.santander.front.previdencia.simulacao.model.entity.AcessoUsuario;
import br.com.santander.front.previdencia.simulacao.model.entity.Canal;


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
 *         &lt;element name="acessoUsuario" type="{http://santander/frontUnico/previdencia}AcessoUsuario"/>
 *         &lt;element name="codigoProposta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataCriacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataAutenticacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="hashId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canal" type="{http://santander/frontUnico/previdencia}Canal"/>
 *         &lt;element name="codigoAutenticacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imperativaContratacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "acessoUsuario",
    "codigoProposta",
    "dataCriacao",
    "dataAutenticacao",
    "hashId",
    "canal",
    "codigoAutenticacao",
    "imperativaContratacao"
})
@XmlRootElement(name = "getFormalizaRequest")
public class GetFormalizaRequest {

    @XmlElement(required = true)
    protected AcessoUsuario acessoUsuario;
    @XmlElement(required = true)
    protected String codigoProposta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAutenticacao;
    @XmlElement(required = true)
    protected String hashId;
    @XmlElement(required = true)
    protected Canal canal;
    @XmlElement(required = true)
    protected String codigoAutenticacao;
    @XmlElement(required = true)
    protected String imperativaContratacao;

    /**
     * Obtém o valor da propriedade acessoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link AcessoUsuario }
     *     
     */
    public AcessoUsuario getAcessoUsuario() {
        return acessoUsuario;
    }

    /**
     * Define o valor da propriedade acessoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link AcessoUsuario }
     *     
     */
    public void setAcessoUsuario(AcessoUsuario value) {
        this.acessoUsuario = value;
    }

    /**
     * Obtém o valor da propriedade codigoProposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProposta() {
        return codigoProposta;
    }

    /**
     * Define o valor da propriedade codigoProposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProposta(String value) {
        this.codigoProposta = value;
    }

    /**
     * Obtém o valor da propriedade dataCriacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Define o valor da propriedade dataCriacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacao(XMLGregorianCalendar value) {
        this.dataCriacao = value;
    }

    /**
     * Obtém o valor da propriedade dataAutenticacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAutenticacao() {
        return dataAutenticacao;
    }

    /**
     * Define o valor da propriedade dataAutenticacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAutenticacao(XMLGregorianCalendar value) {
        this.dataAutenticacao = value;
    }

    /**
     * Obtém o valor da propriedade hashId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashId() {
        return hashId;
    }

    /**
     * Define o valor da propriedade hashId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashId(String value) {
        this.hashId = value;
    }

    /**
     * Obtém o valor da propriedade canal.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanal() {
        return canal;
    }

    /**
     * Define o valor da propriedade canal.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanal(Canal value) {
        this.canal = value;
    }

    /**
     * Obtém o valor da propriedade codigoAutenticacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAutenticacao() {
        return codigoAutenticacao;
    }

    /**
     * Define o valor da propriedade codigoAutenticacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAutenticacao(String value) {
        this.codigoAutenticacao = value;
    }

    /**
     * Obtém o valor da propriedade imperativaContratacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImperativaContratacao() {
        return imperativaContratacao;
    }

    /**
     * Define o valor da propriedade imperativaContratacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImperativaContratacao(String value) {
        this.imperativaContratacao = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GetFormalizaRequest [");
		if (acessoUsuario != null) {
			builder.append("\nacessoUsuario=");
			builder.append(acessoUsuario);
			builder.append(", ");
		}
		if (codigoProposta != null) {
			builder.append("\ncodigoProposta=");
			builder.append(codigoProposta);
			builder.append(", ");
		}
		if (dataCriacao != null) {
			builder.append("\ndataCriacao=");
			builder.append(dataCriacao);
			builder.append(", ");
		}
		if (dataAutenticacao != null) {
			builder.append("\ndataAutenticacao=");
			builder.append(dataAutenticacao);
			builder.append(", ");
		}
		if (hashId != null) {
			builder.append("\nhashId=");
			builder.append(hashId);
			builder.append(", ");
		}
		if (canal != null) {
			builder.append("\ncanal=");
			builder.append(canal);
			builder.append(", ");
		}
		if (codigoAutenticacao != null) {
			builder.append("\ncodigoAutenticacao=");
			builder.append(codigoAutenticacao);
			builder.append(", ");
		}
		if (imperativaContratacao != null) {
			builder.append("\nimperativaContratacao=");
			builder.append(imperativaContratacao);
		}
		builder.append("]");
		return builder.toString();
	}

    
}
