
package com.agimatec.publicinterfaces.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boxNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="boxSize" type="{http://service.publicinterfaces.agimatec.com}boxSize" minOccurs="0"/>
 *         &lt;element name="comfortZone" type="{http://service.publicinterfaces.agimatec.com}comfortZone" minOccurs="0"/>
 *         &lt;element name="defect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="logisticianIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="soiled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtBox", propOrder = {
    "boxNumber",
    "boxSize",
    "comfortZone",
    "defect",
    "logisticianIdentification",
    "parcels",
    "secured",
    "soiled"
})
public class DtBox {

    protected long boxNumber;
    protected BoxSize boxSize;
    protected ComfortZone comfortZone;
    protected boolean defect;
    protected String logisticianIdentification;
    @XmlElement(nillable = true)
    protected List<String> parcels;
    protected boolean secured;
    protected boolean soiled;

    /**
     * Gets the value of the boxNumber property.
     * 
     */
    public long getBoxNumber() {
        return boxNumber;
    }

    /**
     * Sets the value of the boxNumber property.
     * 
     */
    public void setBoxNumber(long value) {
        this.boxNumber = value;
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
     * Gets the value of the defect property.
     * 
     */
    public boolean isDefect() {
        return defect;
    }

    /**
     * Sets the value of the defect property.
     * 
     */
    public void setDefect(boolean value) {
        this.defect = value;
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

    /**
     * Gets the value of the parcels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParcels() {
        if (parcels == null) {
            parcels = new ArrayList<String>();
        }
        return this.parcels;
    }

    /**
     * Gets the value of the secured property.
     * 
     */
    public boolean isSecured() {
        return secured;
    }

    /**
     * Sets the value of the secured property.
     * 
     */
    public void setSecured(boolean value) {
        this.secured = value;
    }

    /**
     * Gets the value of the soiled property.
     * 
     */
    public boolean isSoiled() {
        return soiled;
    }

    /**
     * Sets the value of the soiled property.
     * 
     */
    public void setSoiled(boolean value) {
        this.soiled = value;
    }

}
