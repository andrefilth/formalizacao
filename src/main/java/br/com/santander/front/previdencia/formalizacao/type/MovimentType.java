
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "MovimentType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum MovimentType {

    A,
    D,
    C;

    public String value() {
        return name();
    }

    public static MovimentType fromValue(String v) {
        return valueOf(v);
    }

}
