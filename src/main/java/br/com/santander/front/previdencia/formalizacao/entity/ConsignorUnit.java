
package br.com.santander.front.previdencia.formalizacao.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignorUnit", propOrder = {
    "consignorUnitId",
    "consignorUnitName",
    "personId",
    "consignorUnitBranchs"
})
public class ConsignorUnit {

    protected String consignorUnitId;
    protected String consignorUnitName;
    protected String personId;
    @XmlElement(nillable = true)
    protected List<ConsignorUnitBranch> consignorUnitBranchs;

    public String getConsignorUnitId() {
        return consignorUnitId;
    }

    public void setConsignorUnitId(String value) {
        this.consignorUnitId = value;
    }

    /**
     * Obt�m o valor da propriedade consignorUnitName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorUnitName() {
        return consignorUnitName;
    }

    /**
     * Define o valor da propriedade consignorUnitName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorUnitName(String value) {
        this.consignorUnitName = value;
    }

    /**
     * Obt�m o valor da propriedade personId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Define o valor da propriedade personId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the consignorUnitBranchs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignorUnitBranchs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignorUnitBranchs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignorUnitBranch }
     * 
     * 
     */
    public List<ConsignorUnitBranch> getConsignorUnitBranchs() {
        if (consignorUnitBranchs == null) {
            consignorUnitBranchs = new ArrayList<ConsignorUnitBranch>();
        }
        return this.consignorUnitBranchs;
    }

}
