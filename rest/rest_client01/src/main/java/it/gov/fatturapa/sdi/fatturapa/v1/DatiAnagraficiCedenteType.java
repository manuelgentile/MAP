//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2014.12.19 alle 12:10:35 PM CET 
//


package it.gov.fatturapa.sdi.fatturapa.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DatiAnagraficiCedenteType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiAnagraficiCedenteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdFiscaleIVA" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}IdFiscaleType"/>
 *         &lt;element name="CodiceFiscale" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}CodiceFiscaleType" minOccurs="0"/>
 *         &lt;element name="Anagrafica" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}AnagraficaType"/>
 *         &lt;element name="AlboProfessionale" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}String60LatinType" minOccurs="0"/>
 *         &lt;element name="ProvinciaAlbo" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}ProvinciaType" minOccurs="0"/>
 *         &lt;element name="NumeroIscrizioneAlbo" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}String60Type" minOccurs="0"/>
 *         &lt;element name="DataIscrizioneAlbo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RegimeFiscale" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}RegimeFiscaleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiAnagraficiCedenteType", propOrder = {
    "idFiscaleIVA",
    "codiceFiscale",
    "anagrafica",
    "alboProfessionale",
    "provinciaAlbo",
    "numeroIscrizioneAlbo",
    "dataIscrizioneAlbo",
    "regimeFiscale"
})
public class DatiAnagraficiCedenteType {

    @XmlElement(name = "IdFiscaleIVA", required = true)
    protected IdFiscaleType idFiscaleIVA;
    @XmlElement(name = "CodiceFiscale")
    protected String codiceFiscale;
    @XmlElement(name = "Anagrafica", required = true)
    protected AnagraficaType anagrafica;
    @XmlElement(name = "AlboProfessionale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String alboProfessionale;
    @XmlElement(name = "ProvinciaAlbo")
    protected String provinciaAlbo;
    @XmlElement(name = "NumeroIscrizioneAlbo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numeroIscrizioneAlbo;
    @XmlElement(name = "DataIscrizioneAlbo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataIscrizioneAlbo;
    @XmlElement(name = "RegimeFiscale", required = true)
    @XmlSchemaType(name = "string")
    protected RegimeFiscaleType regimeFiscale;

    /**
     * Recupera il valore della proprietà idFiscaleIVA.
     * 
     * @return
     *     possible object is
     *     {@link IdFiscaleType }
     *     
     */
    public IdFiscaleType getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * Imposta il valore della proprietà idFiscaleIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFiscaleType }
     *     
     */
    public void setIdFiscaleIVA(IdFiscaleType value) {
        this.idFiscaleIVA = value;
    }

    /**
     * Recupera il valore della proprietà codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietà codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietà anagrafica.
     * 
     * @return
     *     possible object is
     *     {@link AnagraficaType }
     *     
     */
    public AnagraficaType getAnagrafica() {
        return anagrafica;
    }

    /**
     * Imposta il valore della proprietà anagrafica.
     * 
     * @param value
     *     allowed object is
     *     {@link AnagraficaType }
     *     
     */
    public void setAnagrafica(AnagraficaType value) {
        this.anagrafica = value;
    }

    /**
     * Recupera il valore della proprietà alboProfessionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlboProfessionale() {
        return alboProfessionale;
    }

    /**
     * Imposta il valore della proprietà alboProfessionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlboProfessionale(String value) {
        this.alboProfessionale = value;
    }

    /**
     * Recupera il valore della proprietà provinciaAlbo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaAlbo() {
        return provinciaAlbo;
    }

    /**
     * Imposta il valore della proprietà provinciaAlbo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaAlbo(String value) {
        this.provinciaAlbo = value;
    }

    /**
     * Recupera il valore della proprietà numeroIscrizioneAlbo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIscrizioneAlbo() {
        return numeroIscrizioneAlbo;
    }

    /**
     * Imposta il valore della proprietà numeroIscrizioneAlbo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIscrizioneAlbo(String value) {
        this.numeroIscrizioneAlbo = value;
    }

    /**
     * Recupera il valore della proprietà dataIscrizioneAlbo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataIscrizioneAlbo() {
        return dataIscrizioneAlbo;
    }

    /**
     * Imposta il valore della proprietà dataIscrizioneAlbo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataIscrizioneAlbo(XMLGregorianCalendar value) {
        this.dataIscrizioneAlbo = value;
    }

    /**
     * Recupera il valore della proprietà regimeFiscale.
     * 
     * @return
     *     possible object is
     *     {@link RegimeFiscaleType }
     *     
     */
    public RegimeFiscaleType getRegimeFiscale() {
        return regimeFiscale;
    }

    /**
     * Imposta il valore della proprietà regimeFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimeFiscaleType }
     *     
     */
    public void setRegimeFiscale(RegimeFiscaleType value) {
        this.regimeFiscale = value;
    }

}
