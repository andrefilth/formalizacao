
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ParameterizedValueType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum ParameterizedValueType {

    VF,
    PC,
    FA,
    FX,
    VI;

    public String value() {
        return name();
    }

    public static ParameterizedValueType fromValue(String v) {
        return valueOf(v);
    }

}
