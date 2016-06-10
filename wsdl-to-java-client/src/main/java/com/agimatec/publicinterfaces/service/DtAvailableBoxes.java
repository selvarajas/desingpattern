
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtAvailableBoxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtAvailableBoxes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boxSize" type="{http://service.publicinterfaces.agimatec.com}boxSize" minOccurs="0"/>
 *         &lt;element name="comfortZone" type="{http://service.publicinterfaces.agimatec.com}comfortZone" minOccurs="0"/>
 *         &lt;element name="freeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtAvailableBoxes", propOrder = {
    "boxSize",
    "comfortZone",
    "freeCount"
})
public class DtAvailableBoxes {

    protected BoxSize boxSize;
    protected ComfortZone comfortZone;
    protected int freeCount;

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
     * Gets the value of the freeCount property.
     * 
     */
    public int getFreeCount() {
        return freeCount;
    }

    /**
     * Sets the value of the freeCount property.
     * 
     */
    public void setFreeCount(int value) {
        this.freeCount = value;
    }

}
