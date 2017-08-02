
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ProductBeneficiaryType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum ProductBeneficiaryType {

    BENEFIT,
    CERTIFICATE;

    public String value() {
        return name();
    }

    public static ProductBeneficiaryType fromValue(String v) {
        return valueOf(v);
    }

}
