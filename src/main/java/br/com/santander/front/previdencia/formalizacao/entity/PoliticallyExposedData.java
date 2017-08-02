
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoliticallyExposedData", propOrder = {
    "pepAgencyId",
    "agencyDescription",
    "pepOccupationId",
    "ocupationDescription",
    "appointmentDate",
    "resignationDate",
    "justification",
    "status"
})
public class PoliticallyExposedData {

    protected Integer pepAgencyId;
    protected String agencyDescription;
    protected Integer pepOccupationId;
    protected String ocupationDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resignationDate;
    protected String justification;
    protected String status;

    /**
     * Obt�m o valor da propriedade pepAgencyId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPepAgencyId() {
        return pepAgencyId;
    }

    /**
     * Define o valor da propriedade pepAgencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPepAgencyId(Integer value) {
        this.pepAgencyId = value;
    }

    /**
     * Obt�m o valor da propriedade agencyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyDescription() {
        return agencyDescription;
    }

    /**
     * Define o valor da propriedade agencyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyDescription(String value) {
        this.agencyDescription = value;
    }

    /**
     * Obt�m o valor da propriedade pepOccupationId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPepOccupationId() {
        return pepOccupationId;
    }

    /**
     * Define o valor da propriedade pepOccupationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPepOccupationId(Integer value) {
        this.pepOccupationId = value;
    }

    /**
     * Obt�m o valor da propriedade ocupationDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcupationDescription() {
        return ocupationDescription;
    }

    /**
     * Define o valor da propriedade ocupationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcupationDescription(String value) {
        this.ocupationDescription = value;
    }

    /**
     * Obt�m o valor da propriedade appointmentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Define o valor da propriedade appointmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDate(XMLGregorianCalendar value) {
        this.appointmentDate = value;
    }

    /**
     * Obt�m o valor da propriedade resignationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResignationDate() {
        return resignationDate;
    }

    /**
     * Define o valor da propriedade resignationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResignationDate(XMLGregorianCalendar value) {
        this.resignationDate = value;
    }

    /**
     * Obt�m o valor da propriedade justification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Define o valor da propriedade justification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustification(String value) {
        this.justification = value;
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

}
