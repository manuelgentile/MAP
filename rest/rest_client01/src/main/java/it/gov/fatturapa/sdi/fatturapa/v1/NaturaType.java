//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2014.12.19 alle 12:10:35 PM CET 
//


package it.gov.fatturapa.sdi.fatturapa.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NaturaType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N1"/>
 *     &lt;enumeration value="N2"/>
 *     &lt;enumeration value="N3"/>
 *     &lt;enumeration value="N4"/>
 *     &lt;enumeration value="N5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaturaType")
@XmlEnum
public enum NaturaType {


    /**
     * Escluse ex. art. 15
     * 
     */
    @XmlEnumValue("N1")
    N_1("N1"),

    /**
     * Non soggette
     * 
     */
    @XmlEnumValue("N2")
    N_2("N2"),

    /**
     * Non Imponibili
     * 
     */
    @XmlEnumValue("N3")
    N_3("N3"),

    /**
     * Esenti
     * 
     */
    @XmlEnumValue("N4")
    N_4("N4"),

    /**
     * Regime del margine
     * 
     */
    @XmlEnumValue("N5")
    N_5("N5");
    private final String value;

    NaturaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NaturaType fromValue(String v) {
        for (NaturaType c: NaturaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
