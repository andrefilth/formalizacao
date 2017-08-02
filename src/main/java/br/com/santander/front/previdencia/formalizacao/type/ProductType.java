
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ProductType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum ProductType {

    PF,
    PJ,
    PR,
    VL;

    public String value() {
        return name();
    }

    public static ProductType fromValue(String v) {
        return valueOf(v);
    }

}
