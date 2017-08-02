
package br.com.santander.front.previdencia.formalizacao.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesChannel", propOrder = {
    "salesChannelId",
    "salesChannelName",
    "agencies"
})
public class SalesChannel {

    protected String salesChannelId;
    protected String salesChannelName;
    protected List<SalesChannelAgency> agencies;
    
    

    /**
	 * 
	 */
	public SalesChannel() {
	}

	/**
	 * @param salesChannelId
	 * @param salesChannelName
	 * @param agencies
	 */
	public SalesChannel(String salesChannelId, String salesChannelName, List<SalesChannelAgency> agencies) {
		this.salesChannelId = salesChannelId;
		this.salesChannelName = salesChannelName;
		this.agencies = agencies;
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
     * Obt�m o valor da propriedade salesChannelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelName() {
        return salesChannelName;
    }

    /**
     * Define o valor da propriedade salesChannelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelName(String value) {
        this.salesChannelName = value;
    }

    /**
     * Gets the value of the agencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesChannelAgency }
     * 
     * 
     */
    public List<SalesChannelAgency> getAgencies() {
        if (agencies == null) {
            agencies = new ArrayList<SalesChannelAgency>();
        }
        return this.agencies;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalesChannel [");
		if (salesChannelId != null) {
			builder.append("salesChannelId=");
			builder.append(salesChannelId);
			builder.append(", ");
		}
		if (salesChannelName != null) {
			builder.append("salesChannelName=");
			builder.append(salesChannelName);
			builder.append(", ");
		}
		if (agencies != null) {
			builder.append("agencies=");
			builder.append(agencies);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
