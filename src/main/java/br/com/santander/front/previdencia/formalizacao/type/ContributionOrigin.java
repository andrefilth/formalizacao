
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ContributionOrigin", namespace = "http://kiman.com.br/kiprev/type")
@XmlEnum
public enum ContributionOrigin {

    PAT,
    PTE;

    public String value() {
        return name();
    }

    public static ContributionOrigin fromValue(String v) {
        return valueOf(v);
    }

}
