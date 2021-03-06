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
 * <p>Classe Java per FormatoTrasmissioneType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FormatoTrasmissioneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="5"/>
 *     &lt;enumeration value="SDI10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormatoTrasmissioneType")
@XmlEnum
public enum FormatoTrasmissioneType {


    /**
     * 
     * 						Formato di Trasmissione SDI Versione 1.0
     * 					
     * 
     */
    @XmlEnumValue("SDI10")
    SDI_10("SDI10");
    private final String value;

    FormatoTrasmissioneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormatoTrasmissioneType fromValue(String v) {
        for (FormatoTrasmissioneType c: FormatoTrasmissioneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
