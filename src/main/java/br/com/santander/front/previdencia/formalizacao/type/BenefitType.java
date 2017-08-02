
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "BenefitType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum BenefitType {

    RI,
    PR;

    public String value() {
        return name();
    }

    public static BenefitType fromValue(String v) {
        return valueOf(v);
    }

}
