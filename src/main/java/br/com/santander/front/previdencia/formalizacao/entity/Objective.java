
package br.com.santander.front.previdencia.formalizacao.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Objective", propOrder = {
    "objectiveId",
    "objectiveType",
    "description",
    "funds"
})
public class Objective {

    protected Integer objectiveId;
    protected String objectiveType;
    protected String description;
    @XmlElement(nillable = true)
    protected List<Fund> funds;

    /**
     * Obt�m o valor da propriedade objectiveId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectiveId() {
        return objectiveId;
    }

    /**
     * Define o valor da propriedade objectiveId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectiveId(Integer value) {
        this.objectiveId = value;
    }

    /**
     * Obt�m o valor da propriedade objectiveType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectiveType() {
        return objectiveType;
    }

    /**
     * Define o valor da propriedade objectiveType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectiveType(String value) {
        this.objectiveType = value;
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

}
