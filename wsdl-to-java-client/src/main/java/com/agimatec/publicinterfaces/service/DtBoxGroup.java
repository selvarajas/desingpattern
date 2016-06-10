
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtBoxGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtBoxGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="boxSize" type="{http://service.publicinterfaces.agimatec.com}boxSize" minOccurs="0"/>
 *         &lt;element name="comfortZone" type="{http://service.publicinterfaces.agimatec.com}comfortZone" minOccurs="0"/>
 *         &lt;element name="logisticianIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtBoxGroup", propOrder = {
    "amount",
    "boxSize",
    "comfortZone",
    "logisticianIdentification"
})
public class DtBoxGroup {

    protected Integer amount;
    protected BoxSize boxSize;
    protected ComfortZone comfortZone;
    protected String logisticianIdentification;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

    /**
     * Gets the value of the boxSize property.
     * 
     * @return
     *     possible object is
     *     {@link BoxSize }
     *     
     */
    public BoxSize getBoxSize() {
        return boxSize;
    }

    /**
     * Sets the value of the boxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoxSize }
     *     
     */
    public void setBoxSize(BoxSize value) {
        this.boxSize = value;
    }

    /**
     * Gets the value of the comfortZone property.
     * 
     * @return
     *     possible object is
     *     {@link ComfortZone }
     *     
     */
    public ComfortZone getComfortZone() {
        return comfortZone;
    }

    /**
     * Sets the value of the comfortZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComfortZone }
     *     
     */
    public void setComfortZone(ComfortZone value) {
        this.comfortZone = value;
    }

    /**
     * Gets the value of the logisticianIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticianIdentification() {
        return logisticianIdentification;
    }

    /**
     * Sets the value of the logisticianIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticianIdentification(String value) {
        this.logisticianIdentification = value;
    }

}
