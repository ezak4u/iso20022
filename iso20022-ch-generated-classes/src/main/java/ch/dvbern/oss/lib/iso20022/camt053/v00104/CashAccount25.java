
package ch.dvbern.oss.lib.iso20022.camt053.v00104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccount25 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashAccount25">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}AccountIdentification4Choice"/>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}CashAccountType2Choice" minOccurs="0"/>
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}Max70Text" minOccurs="0"/>
 *         &lt;element name="Ownr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}PartyIdentification43" minOccurs="0"/>
 *         &lt;element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}BranchAndFinancialInstitutionIdentification5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount25", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.04", propOrder = {
    "id",
    "tp",
    "ccy",
    "nm",
    "ownr",
    "svcr"
})
public class CashAccount25 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.04", required = true)
    protected AccountIdentification4Choice id;
    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.04")
    protected CashAccountType2Choice tp;
    @XmlElement(name = "Ccy", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.04")
    protected String ccy;
    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.04")
    protected String nm;
    @XmlElement(name = "Ownr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.04")
    protected PartyIdentification43 ownr;
    @XmlElement(name = "Svcr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.04")
    protected BranchAndFinancialInstitutionIdentification5 svcr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setId(AccountIdentification4Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public void setTp(CashAccountType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOwnr() {
        return ownr;
    }

    /**
     * Sets the value of the ownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setOwnr(PartyIdentification43 value) {
        this.ownr = value;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.svcr = value;
    }

}
