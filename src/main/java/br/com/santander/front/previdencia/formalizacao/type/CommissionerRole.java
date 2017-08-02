
package br.com.santander.front.previdencia.formalizacao.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "commissionerRole", namespace = "http://ade.service.kiprev.kiman.com.br/")
@XmlEnum
public enum CommissionerRole {

    BROKER,
    SALES_OFFICER,
    PROLABORE,
    SALES_AGENT;

    public String value() {
        return name();
    }

    public static CommissionerRole fromValue(String v) {
        return valueOf(v);
    }

}
