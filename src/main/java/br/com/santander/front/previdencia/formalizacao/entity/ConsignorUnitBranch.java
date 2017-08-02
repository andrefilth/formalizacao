
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignorUnitBranch", propOrder = {
    "consignorUnitBranchId",
    "description",
    "managerId",
    "consignorUnit",
    "expirationDay"
})
public class ConsignorUnitBranch {

    protected String consignorUnitBranchId;
    protected String description;
    protected String managerId;
    protected ConsignorUnit consignorUnit;
    protected Integer expirationDay;

    /**
     * Obt�m o valor da propriedade consignorUnitBranchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignorUnitBranchId() {
        return consignorUnitBranchId;
    }

    /**
     * Define o valor da propriedade consignorUnitBranchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignorUnitBranchId(String value) {
        this.consignorUnitBranchId = value;
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
     * Obt�m o valor da propriedade managerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Define o valor da propriedade managerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * Obt�m o valor da propriedade consignorUnit.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorUnit }
     *     
     */
    public ConsignorUnit getConsignorUnit() {
        return consignorUnit;
    }

    /**
     * Define o valor da propriedade consignorUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorUnit }
     *     
     */
    public void setConsignorUnit(ConsignorUnit value) {
        this.consignorUnit = value;
    }

    /**
     * Obt�m o valor da propriedade expirationDay.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationDay() {
        return expirationDay;
    }

    /**
     * Define o valor da propriedade expirationDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationDay(Integer value) {
        this.expirationDay = value;
    }

}
