//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.21 at 08:58:39 AM IST 
//


package com.anz.AcctTrnInq.transform.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecCtrlOutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecCtrlOutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchedRec" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SentRec">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Cursor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANZAcctId" type="{}com.anz.ANZAcctId_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecCtrlOutType", propOrder = {
    "matchedRec",
    "sentRec",
    "cursor",
    "anzAcctId"
})
public class RecCtrlOutType {

    @XmlElement(name = "MatchedRec")
    protected Integer matchedRec;
    @XmlElement(name = "SentRec")
    protected int sentRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "ANZAcctId")
    protected ComAnzANZAcctIdType anzAcctId;

    /**
     * Gets the value of the matchedRec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchedRec() {
        return matchedRec;
    }

    /**
     * Sets the value of the matchedRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchedRec(Integer value) {
        this.matchedRec = value;
    }

    /**
     * Gets the value of the sentRec property.
     * 
     */
    public int getSentRec() {
        return sentRec;
    }

    /**
     * Sets the value of the sentRec property.
     * 
     */
    public void setSentRec(int value) {
        this.sentRec = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursor(String value) {
        this.cursor = value;
    }

    /**
     * Gets the value of the anzAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link ComAnzANZAcctIdType }
     *     
     */
    public ComAnzANZAcctIdType getANZAcctId() {
        return anzAcctId;
    }

    /**
     * Sets the value of the anzAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComAnzANZAcctIdType }
     *     
     */
    public void setANZAcctId(ComAnzANZAcctIdType value) {
        this.anzAcctId = value;
    }

}