
package br.com.santander.front.previdencia.formalizacao.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reserve", propOrder = {
    "reserveId",
    "reserveDescription",
    "objective",
    "contributions",
    "funds"
})
public class Reserve {

    protected String reserveId;
    protected String reserveDescription;
    protected Objective objective;
    @XmlElement(nillable = true)
    protected List<Contribution> contributions;
    @XmlElement(nillable = true)
    protected List<Fund> funds;
    
    

    /**
	 * 
	 */
	public Reserve() {
	}

	/**
	 * @param reserveId
	 * @param reserveDescription
	 * @param objective
	 * @param contributions
	 * @param funds
	 */
	public Reserve(String reserveId, String reserveDescription, Objective objective, List<Contribution> contributions,
			List<Fund> funds) {
		this.reserveId = reserveId;
		this.reserveDescription = reserveDescription;
		this.objective = objective;
		this.contributions = contributions;
		this.funds = funds;
	}

	/**
     * Obt�m o valor da propriedade reserveId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveId() {
        return reserveId;
    }

    /**
     * Define o valor da propriedade reserveId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveId(String value) {
        this.reserveId = value;
    }

    /**
     * Obt�m o valor da propriedade reserveDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveDescription() {
        return reserveDescription;
    }

    /**
     * Define o valor da propriedade reserveDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveDescription(String value) {
        this.reserveDescription = value;
    }

    /**
     * Obt�m o valor da propriedade objective.
     * 
     * @return
     *     possible object is
     *     {@link Objective }
     *     
     */
    public Objective getObjective() {
        return objective;
    }

    /**
     * Define o valor da propriedade objective.
     * 
     * @param value
     *     allowed object is
     *     {@link Objective }
     *     
     */
    public void setObjective(Objective value) {
        this.objective = value;
    }

    /**
     * Gets the value of the contributions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contribution }
     * 
     * 
     */
    public List<Contribution> getContributions() {
        if (contributions == null) {
            contributions = new ArrayList<Contribution>();
        }
        return this.contributions;
    }

    /**
     * Gets the value of the funds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fund }
     * 
     * 
     */
    public List<Fund> getFunds() {
        if (funds == null) {
            funds = new ArrayList<Fund>();
        }
        return this.funds;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserve [");
		if (reserveId != null) {
			builder.append("reserveId=");
			builder.append(reserveId);
			builder.append(", ");
		}
		if (reserveDescription != null) {
			builder.append("reserveDescription=");
			builder.append(reserveDescription);
			builder.append(", ");
		}
		if (objective != null) {
			builder.append("objective=");
			builder.append(objective);
			builder.append(", ");
		}
		if (contributions != null) {
			builder.append("contributions=");
			builder.append(contributions);
			builder.append(", ");
		}
		if (funds != null) {
			builder.append("funds=");
			builder.append(funds);
		}
		builder.append("]");
		return builder.toString();
	}

}
