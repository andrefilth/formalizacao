
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PeriodicityValue", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum PeriodicityValue {

    D,
    S,
    M,
    A;

    public String value() {
        return name();
    }

    public static PeriodicityValue fromValue(String v) {
        return valueOf(v);
    }

}
