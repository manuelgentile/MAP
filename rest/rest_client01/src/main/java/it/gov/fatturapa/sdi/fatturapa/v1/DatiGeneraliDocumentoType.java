//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2014.12.19 alle 12:10:35 PM CET 
//


package it.gov.fatturapa.sdi.fatturapa.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DatiGeneraliDocumentoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGeneraliDocumentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocumento" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}TipoDocumentoType"/>
 *         &lt;element name="Divisa" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}DivisaType"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Numero" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}String20Type"/>
 *         &lt;element name="DatiRitenuta" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}DatiRitenutaType" minOccurs="0"/>
 *         &lt;element name="DatiBollo" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}DatiBolloType" minOccurs="0"/>
 *         &lt;element name="DatiCassaPrevidenziale" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}DatiCassaPrevidenzialeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScontoMaggiorazione" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}ScontoMaggiorazioneType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImportoTotaleDocumento" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}Amount2DecimalType" minOccurs="0"/>
 *         &lt;element name="Arrotondamento" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}Amount2DecimalType" minOccurs="0"/>
 *         &lt;element name="Causale" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}String200LatinType" minOccurs="0"/>
 *         &lt;element name="Art73" type="{http://www.fatturapa.gov.it/sdi/fatturapa/v1.0}Art73Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGeneraliDocumentoType", propOrder = {
    "tipoDocumento",
    "divisa",
    "data",
    "numero",
    "datiRitenuta",
    "datiBollo",
    "datiCassaPrevidenziale",
    "scontoMaggiorazione",
    "importoTotaleDocumento",
    "arrotondamento",
    "causale",
    "art73"
})
public class DatiGeneraliDocumentoType {

    @XmlElement(name = "TipoDocumento", required = true)
    @XmlSchemaType(name = "string")
    protected TipoDocumentoType tipoDocumento;
    @XmlElement(name = "Divisa", required = true)
    protected String divisa;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "Numero", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numero;
    @XmlElement(name = "DatiRitenuta")
    protected DatiRitenutaType datiRitenuta;
    @XmlElement(name = "DatiBollo")
    protected DatiBolloType datiBollo;
    @XmlElement(name = "DatiCassaPrevidenziale")
    protected List<DatiCassaPrevidenzialeType> datiCassaPrevidenziale;
    @XmlElement(name = "ScontoMaggiorazione")
    protected List<ScontoMaggiorazioneType> scontoMaggiorazione;
    @XmlElement(name = "ImportoTotaleDocumento")
    protected BigDecimal importoTotaleDocumento;
    @XmlElement(name = "Arrotondamento")
    protected BigDecimal arrotondamento;
    @XmlElement(name = "Causale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String causale;
    @XmlElement(name = "Art73")
    @XmlSchemaType(name = "string")
    protected Art73Type art73;

    /**
     * Recupera il valore della proprietà tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoType }
     *     
     */
    public TipoDocumentoType getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Imposta il valore della proprietà tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoType }
     *     
     */
    public void setTipoDocumento(TipoDocumentoType value) {
        this.tipoDocumento = value;
    }

    /**
     * Recupera il valore della proprietà divisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisa() {
        return divisa;
    }

    /**
     * Imposta il valore della proprietà divisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisa(String value) {
        this.divisa = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della proprietà numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Recupera il valore della proprietà datiRitenuta.
     * 
     * @return
     *     possible object is
     *     {@link DatiRitenutaType }
     *     
     */
    public DatiRitenutaType getDatiRitenuta() {
        return datiRitenuta;
    }

    /**
     * Imposta il valore della proprietà datiRitenuta.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRitenutaType }
     *     
     */
    public void setDatiRitenuta(DatiRitenutaType value) {
        this.datiRitenuta = value;
    }

    /**
     * Recupera il valore della proprietà datiBollo.
     * 
     * @return
     *     possible object is
     *     {@link DatiBolloType }
     *     
     */
    public DatiBolloType getDatiBollo() {
        return datiBollo;
    }

    /**
     * Imposta il valore della proprietà datiBollo.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiBolloType }
     *     
     */
    public void setDatiBollo(DatiBolloType value) {
        this.datiBollo = value;
    }

    /**
     * Gets the value of the datiCassaPrevidenziale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datiCassaPrevidenziale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatiCassaPrevidenziale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatiCassaPrevidenzialeType }
     * 
     * 
     */
    public List<DatiCassaPrevidenzialeType> getDatiCassaPrevidenziale() {
        if (datiCassaPrevidenziale == null) {
            datiCassaPrevidenziale = new ArrayList<DatiCassaPrevidenzialeType>();
        }
        return this.datiCassaPrevidenziale;
    }

    /**
     * Gets the value of the scontoMaggiorazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scontoMaggiorazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScontoMaggiorazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScontoMaggiorazioneType }
     * 
     * 
     */
    public List<ScontoMaggiorazioneType> getScontoMaggiorazione() {
        if (scontoMaggiorazione == null) {
            scontoMaggiorazione = new ArrayList<ScontoMaggiorazioneType>();
        }
        return this.scontoMaggiorazione;
    }

    /**
     * Recupera il valore della proprietà importoTotaleDocumento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    /**
     * Imposta il valore della proprietà importoTotaleDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoTotaleDocumento(BigDecimal value) {
        this.importoTotaleDocumento = value;
    }

    /**
     * Recupera il valore della proprietà arrotondamento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArrotondamento() {
        return arrotondamento;
    }

    /**
     * Imposta il valore della proprietà arrotondamento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArrotondamento(BigDecimal value) {
        this.arrotondamento = value;
    }

    /**
     * Recupera il valore della proprietà causale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausale() {
        return causale;
    }

    /**
     * Imposta il valore della proprietà causale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausale(String value) {
        this.causale = value;
    }

    /**
     * Recupera il valore della proprietà art73.
     * 
     * @return
     *     possible object is
     *     {@link Art73Type }
     *     
     */
    public Art73Type getArt73() {
        return art73;
    }

    /**
     * Imposta il valore della proprietà art73.
     * 
     * @param value
     *     allowed object is
     *     {@link Art73Type }
     *     
     */
    public void setArt73(Art73Type value) {
        this.art73 = value;
    }

}
