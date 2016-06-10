
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dtReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boxSize" type="{http://service.publicinterfaces.agimatec.com}boxSize" minOccurs="0"/>
 *         &lt;element name="comfortZone" type="{http://service.publicinterfaces.agimatec.com}comfortZone" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="machineIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="userIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtReservation", propOrder = {
    "boxSize",
    "comfortZone",
    "endTime",
    "machineIdentification",
    "productCode",
    "startTime",
    "userIdentification"
})
public class DtReservation {

    protected BoxSize boxSize;
    protected ComfortZone comfortZone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected String machineIdentification;
    protected String productCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected String userIdentification;

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
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the machineIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineIdentification() {
        return machineIdentification;
    }

    /**
     * Sets the value of the machineIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineIdentification(String value) {
        this.machineIdentification = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the userIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentification() {
        return userIdentification;
    }

    /**
     * Sets the value of the userIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentification(String value) {
        this.userIdentification = value;
    }

}
