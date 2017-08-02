
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beneficiary", propOrder = {
    "beneficiaryType",
    "oldPhysicalPersonId",
    "physicalPerson",
    "distributionPct",
    "status",
    "kinshipId",
    "kinshipDescription",
    "benefit"
})
public class Beneficiary {

    protected String beneficiaryType;
    protected String oldPhysicalPersonId;
    protected PhysicalPerson physicalPerson;
    protected Double distributionPct;
    protected String status;
    protected Integer kinshipId;
    protected String kinshipDescription;
    protected Benefit benefit;

    /**
     * Obt�m o valor da propriedade beneficiaryType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    /**
     * Define o valor da propriedade beneficiaryType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryType(String value) {
        this.beneficiaryType = value;
    }

    /**
     * Obt�m o valor da propriedade oldPhysicalPersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPhysicalPersonId() {
        return oldPhysicalPersonId;
    }

    /**
     * Define o valor da propriedade oldPhysicalPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPhysicalPersonId(String value) {
        this.oldPhysicalPersonId = value;
    }

    /**
     * Obt�m o valor da propriedade physicalPerson.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPerson }
     *     
     */
    public PhysicalPerson getPhysicalPerson() {
        return physicalPerson;
    }

    /**
     * Define o valor da propriedade physicalPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPerson }
     *     
     */
    public void setPhysicalPerson(PhysicalPerson value) {
        this.physicalPerson = value;
    }

    /**
     * Obt�m o valor da propriedade distributionPct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistributionPct() {
        return distributionPct;
    }

    /**
     * Define o valor da propriedade distributionPct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistributionPct(Double value) {
        this.distributionPct = value;
    }

    /**
     * Obt�m o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obt�m o valor da propriedade kinshipId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKinshipId() {
        return kinshipId;
    }

    /**
     * Define o valor da propriedade kinshipId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKinshipId(Integer value) {
        this.kinshipId = value;
    }

    /**
     * Obt�m o valor da propriedade kinshipDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKinshipDescription() {
        return kinshipDescription;
    }

    /**
     * Define o valor da propriedade kinshipDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKinshipDescription(String value) {
        this.kinshipDescription = value;
    }

    /**
     * Obt�m o valor da propriedade benefit.
     * 
     * @return
     *     possible object is
     *     {@link Benefit }
     *     
     */
    public Benefit getBenefit() {
        return benefit;
    }

    /**
     * Define o valor da propriedade benefit.
     * 
     * @param value
     *     allowed object is
     *     {@link Benefit }
     *     
     */
    public void setBenefit(Benefit value) {
        this.benefit = value;
    }

}
