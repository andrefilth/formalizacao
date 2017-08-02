
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FormType", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum FormType {

    P,
    I,
    C;

    public String value() {
        return name();
    }

    public static FormType fromValue(String v) {
        return valueOf(v);
    }

}
