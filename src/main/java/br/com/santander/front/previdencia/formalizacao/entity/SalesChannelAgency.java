
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesChannelAgency", propOrder = {
    "salesChannelId",
    "salesAgencyId",
    "description"
})
public class SalesChannelAgency {

    protected String salesChannelId;
    protected String salesAgencyId;
    protected String description;

    
    /**
	 * 
	 */
	public SalesChannelAgency() {
	}

	/**
	 * @param salesChannelId
	 * @param salesAgencyId
	 * @param description
	 */
	public SalesChannelAgency(String salesChannelId, String salesAgencyId, String description) {
		this.salesChannelId = salesChannelId;
		this.salesAgencyId = salesAgencyId;
		this.description = description;
	}

	/**
     * Obt�m o valor da propriedade salesChannelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelId() {
        return salesChannelId;
    }

    /**
     * Define o valor da propriedade salesChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelId(String value) {
        this.salesChannelId = value;
    }

    /**
     * Obt�m o valor da propriedade salesAgencyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAgencyId() {
        return salesAgencyId;
    }

    /**
     * Define o valor da propriedade salesAgencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAgencyId(String value) {
        this.salesAgencyId = value;
    }

    /**
     * Obt�m o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalesChannelAgency [");
		if (salesChannelId != null) {
			builder.append("salesChannelId=");
			builder.append(salesChannelId);
			builder.append(", ");
		}
		if (salesAgencyId != null) {
			builder.append("salesAgencyId=");
			builder.append(salesAgencyId);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
