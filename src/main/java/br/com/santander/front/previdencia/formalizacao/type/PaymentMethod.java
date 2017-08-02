
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentMethod", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum PaymentMethod {

    CR,
    CT,
    CQ,
    CN,
    CB,
    DF,
    DC,
    EN,
    FC,
    RC,
    TD;

    public String value() {
        return name();
    }

    public static PaymentMethod fromValue(String v) {
        return valueOf(v);
    }

}
