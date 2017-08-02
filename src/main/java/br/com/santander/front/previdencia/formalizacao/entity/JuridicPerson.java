
package br.com.santander.front.previdencia.formalizacao.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JuridicPerson", propOrder = {
    "juridicPersonId",
    "corporateName",
    "comercialName",
    "mailLanguageId",
    "addresses",
    "phones",
    "emails",
    "documents",
    "residentInd",
    "countryId",
    "pep",
    "externalJuridicPersonId",
    "economicActivity",
    "sector",
    "foundationDate"
})
public class JuridicPerson {

    protected String juridicPersonId;
    protected String corporateName;
    protected String comercialName;
    protected String mailLanguageId;
    @XmlElement(nillable = true)
    protected List<Address> addresses;
    @XmlElement(nillable = true)
    protected List<Phone> phones;
    @XmlElement(nillable = true)
    protected List<Email> emails;
    @XmlElement(nillable = true)
    protected List<Document> documents;
    protected String residentInd;
    protected String countryId;
    protected PoliticallyExposedData pep;
    protected String externalJuridicPersonId;
    protected String economicActivity;
    protected String sector;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar foundationDate;

    /**
     * Obt�m o valor da propriedade juridicPersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJuridicPersonId() {
        return juridicPersonId;
    }

    /**
     * Define o valor da propriedade juridicPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJuridicPersonId(String value) {
        this.juridicPersonId = value;
    }

    /**
     * Obt�m o valor da propriedade corporateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Define o valor da propriedade corporateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Obt�m o valor da propriedade comercialName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComercialName() {
        return comercialName;
    }

    /**
     * Define o valor da propriedade comercialName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComercialName(String value) {
        this.comercialName = value;
    }

    /**
     * Obt�m o valor da propriedade mailLanguageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailLanguageId() {
        return mailLanguageId;
    }

    /**
     * Define o valor da propriedade mailLanguageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailLanguageId(String value) {
        this.mailLanguageId = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhones() {
        if (phones == null) {
            phones = new ArrayList<Phone>();
        }
        return this.phones;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmails() {
        if (emails == null) {
            emails = new ArrayList<Email>();
        }
        return this.emails;
    }

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Document>();
        }
        return this.documents;
    }

    /**
     * Obt�m o valor da propriedade residentInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentInd() {
        return residentInd;
    }

    /**
     * Define o valor da propriedade residentInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentInd(String value) {
        this.residentInd = value;
    }

    /**
     * Obt�m o valor da propriedade countryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * Define o valor da propriedade countryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryId(String value) {
        this.countryId = value;
    }

    /**
     * Obt�m o valor da propriedade pep.
     * 
     * @return
     *     possible object is
     *     {@link PoliticallyExposedData }
     *     
     */
    public PoliticallyExposedData getPep() {
        return pep;
    }

    /**
     * Define o valor da propriedade pep.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticallyExposedData }
     *     
     */
    public void setPep(PoliticallyExposedData value) {
        this.pep = value;
    }

    /**
     * Obt�m o valor da propriedade externalJuridicPersonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalJuridicPersonId() {
        return externalJuridicPersonId;
    }

    /**
     * Define o valor da propriedade externalJuridicPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalJuridicPersonId(String value) {
        this.externalJuridicPersonId = value;
    }

    /**
     * Obt�m o valor da propriedade economicActivity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicActivity() {
        return economicActivity;
    }

    /**
     * Define o valor da propriedade economicActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicActivity(String value) {
        this.economicActivity = value;
    }

    /**
     * Obt�m o valor da propriedade sector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Define o valor da propriedade sector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Obt�m o valor da propriedade foundationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFoundationDate() {
        return foundationDate;
    }

    /**
     * Define o valor da propriedade foundationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFoundationDate(XMLGregorianCalendar value) {
        this.foundationDate = value;
    }

}
