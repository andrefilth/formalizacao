
package br.com.santander.front.previdencia.formalizacao.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import br.com.santander.front.previdencia.formalizacao.type.ParameterizedValueType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterizedValue", propOrder = {
    "valueDescription",
    "valueType",
    "calculationBase",
    "rangeTableName",
    "percentualValue",
    "formula",
    "value"
})
public class ParameterizedValue {

    protected String valueDescription;
    @XmlSchemaType(name = "string")
    protected ParameterizedValueType valueType;
    protected String calculationBase;
    protected String rangeTableName;
    protected Double percentualValue;
    protected String formula;
    protected Double value;

    /**
     * Obt�m o valor da propriedade valueDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDescription() {
        return valueDescription;
    }

    /**
     * Define o valor da propriedade valueDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDescription(String value) {
        this.valueDescription = value;
    }

    /**
     * Obt�m o valor da propriedade valueType.
     * 
     * @return
     *     possible object is
     *     {@link ParameterizedValueType }
     *     
     */
    public ParameterizedValueType getValueType() {
        return valueType;
    }

    /**
     * Define o valor da propriedade valueType.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterizedValueType }
     *     
     */
    public void setValueType(ParameterizedValueType value) {
        this.valueType = value;
    }

    /**
     * Obt�m o valor da propriedade calculationBase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationBase() {
        return calculationBase;
    }

    /**
     * Define o valor da propriedade calculationBase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationBase(String value) {
        this.calculationBase = value;
    }

    /**
     * Obt�m o valor da propriedade rangeTableName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeTableName() {
        return rangeTableName;
    }

    /**
     * Define o valor da propriedade rangeTableName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeTableName(String value) {
        this.rangeTableName = value;
    }

    /**
     * Obt�m o valor da propriedade percentualValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentualValue() {
        return percentualValue;
    }

    /**
     * Define o valor da propriedade percentualValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentualValue(Double value) {
        this.percentualValue = value;
    }

    /**
     * Obt�m o valor da propriedade formula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Define o valor da propriedade formula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Obt�m o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParameterizedValue [");
		if (valueDescription != null) {
			builder.append("valueDescription=");
			builder.append(valueDescription);
			builder.append(", ");
		}
		if (valueType != null) {
			builder.append("valueType=");
			builder.append(valueType);
			builder.append(", ");
		}
		if (calculationBase != null) {
			builder.append("calculationBase=");
			builder.append(calculationBase);
			builder.append(", ");
		}
		if (rangeTableName != null) {
			builder.append("rangeTableName=");
			builder.append(rangeTableName);
			builder.append(", ");
		}
		if (percentualValue != null) {
			builder.append("percentualValue=");
			builder.append(percentualValue);
			builder.append(", ");
		}
		if (formula != null) {
			builder.append("formula=");
			builder.append(formula);
			builder.append(", ");
		}
		if (value != null) {
			builder.append("value=");
			builder.append(value);
		}
		builder.append("]");
		return builder.toString();
	}
    
    

}
