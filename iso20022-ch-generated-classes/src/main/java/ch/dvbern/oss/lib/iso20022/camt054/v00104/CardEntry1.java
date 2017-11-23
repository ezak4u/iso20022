
package ch.dvbern.oss.lib.iso20022.camt054.v00104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardEntry1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardEntry1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}PaymentCard4" minOccurs="0"/>
 *         &lt;element name="POI" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}PointOfInteraction1" minOccurs="0"/>
 *         &lt;element name="AggtdNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CardAggregated1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardEntry1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.04", propOrder = {
    "card",
    "poi",
    "aggtdNtry"
})
public class CardEntry1 {

    @XmlElement(name = "Card", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.04")
    protected PaymentCard4 card;
    @XmlElement(name = "POI", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.04")
    protected PointOfInteraction1 poi;
    @XmlElement(name = "AggtdNtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.04")
    protected CardAggregated1 aggtdNtry;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard4 }
     *     
     */
    public PaymentCard4 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard4 }
     *     
     */
    public void setCard(PaymentCard4 value) {
        this.card = value;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public PointOfInteraction1 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public void setPOI(PointOfInteraction1 value) {
        this.poi = value;
    }

    /**
     * Gets the value of the aggtdNtry property.
     * 
     * @return
     *     possible object is
     *     {@link CardAggregated1 }
     *     
     */
    public CardAggregated1 getAggtdNtry() {
        return aggtdNtry;
    }

    /**
     * Sets the value of the aggtdNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAggregated1 }
     *     
     */
    public void setAggtdNtry(CardAggregated1 value) {
        this.aggtdNtry = value;
    }

}
