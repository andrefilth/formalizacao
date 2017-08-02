
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ContributionCategory", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum ContributionCategory {

    RE,
    ES,
    IN,
    IR,
    PR,
    BS,
    JM,
    CO;

    public String value() {
        return name();
    }

    public static ContributionCategory fromValue(String v) {
        return valueOf(v);
    }

}
