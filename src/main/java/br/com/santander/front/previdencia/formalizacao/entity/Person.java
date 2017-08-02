
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "personId",
    "personName",
    "physicalPersonInd",
    "physicalPerson",
    "juridicPerson",
    "pep"
})
public class Person {

    protected String personId;
    protected String personName;
    protected Boolean physicalPersonInd;
    protected PhysicalPerson physicalPerson;
    protected JuridicPerson juridicPerson;
    protected PoliticallyExposedData pep;

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
     * Obt�m o valor da propriedade personName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Define o valor da propriedade personName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Obt�m o valor da propriedade physicalPersonInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysicalPersonInd() {
        return physicalPersonInd;
    }

    /**
     * Define o valor da propriedade physicalPersonInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysicalPersonInd(Boolean value) {
        this.physicalPersonInd = value;
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
     * Obt�m o valor da propriedade juridicPerson.
     * 
     * @return
     *     possible object is
     *     {@link JuridicPerson }
     *     
     */
    public JuridicPerson getJuridicPerson() {
        return juridicPerson;
    }

    /**
     * Define o valor da propriedade juridicPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link JuridicPerson }
     *     
     */
    public void setJuridicPerson(JuridicPerson value) {
        this.juridicPerson = value;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [");
		if (personId != null) {
			builder.append("personId=");
			builder.append(personId);
			builder.append(", ");
		}
		if (personName != null) {
			builder.append("personName=");
			builder.append(personName);
			builder.append(", ");
		}
		if (physicalPersonInd != null) {
			builder.append("physicalPersonInd=");
			builder.append(physicalPersonInd);
			builder.append(", ");
		}
		if (physicalPerson != null) {
			builder.append("physicalPerson=");
			builder.append(physicalPerson);
			builder.append(", ");
		}
		if (juridicPerson != null) {
			builder.append("juridicPerson=");
			builder.append(juridicPerson);
			builder.append(", ");
		}
		if (pep != null) {
			builder.append("pep=");
			builder.append(pep);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
