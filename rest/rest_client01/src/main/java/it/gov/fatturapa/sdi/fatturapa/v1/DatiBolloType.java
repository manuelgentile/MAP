//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2014.12.19 alle 12:10:35 PM CET 
//


package it.gov.fatturapa.sdi.fatturapa.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per DatiBolloType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiBolloType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroBollo" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}NumeroBolloType"/>
 *         &lt;element name="ImportoBollo" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}Amount2DecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiBolloType", propOrder = {
    "numeroBollo",
    "importoBollo"
})
public class DatiBolloType {

    @XmlElement(name = "NumeroBollo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numeroBollo;
    @XmlElement(name = "ImportoBollo", required = true)
    protected BigDecimal importoBollo;

    /**
     * Recupera il valore della proprietà numeroBollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBollo() {
        return numeroBollo;
    }

    /**
     * Imposta il valore della proprietà numeroBollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBollo(String value) {
        this.numeroBollo = value;
    }

    /**
     * Recupera il valore della proprietà importoBollo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoBollo() {
        return importoBollo;
    }

    /**
     * Imposta il valore della proprietà importoBollo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoBollo(BigDecimal value) {
        this.importoBollo = value;
    }

}
