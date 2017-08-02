
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PersonType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum PersonType {

    PF,
    PJ;

    public String value() {
        return name();
    }

    public static PersonType fromValue(String v) {
        return valueOf(v);
    }

}
