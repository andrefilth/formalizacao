
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "BrokerType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum BrokerType {

    C,
    A,
    G,
    P;

    public String value() {
        return name();
    }

    public static BrokerType fromValue(String v) {
        return valueOf(v);
    }

}
