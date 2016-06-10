
package com.agimatec.publicinterfaces.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtDeliveryMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtDeliveryMachine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://service.publicinterfaces.agimatec.com}dtMachineAddress" minOccurs="0"/>
 *         &lt;element name="contacting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="devices" type="{http://service.publicinterfaces.agimatec.com}dtDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifecycleStatus" type="{http://service.publicinterfaces.agimatec.com}machineLifecycleStatus" minOccurs="0"/>
 *         &lt;element name="locationType" type="{http://service.publicinterfaces.agimatec.com}machineLocationType" minOccurs="0"/>
 *         &lt;element name="longDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="machineConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="machineProperties" type="{http://service.publicinterfaces.agimatec.com}dtMachineProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tags" type="{http://service.publicinterfaces.agimatec.com}dtTag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://service.publicinterfaces.agimatec.com}machineConstructionType" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtDeliveryMachine", propOrder = {
    "address",
    "contacting",
    "devices",
    "identification",
    "lifecycleStatus",
    "locationType",
    "longDescription",
    "machineConfiguration",
    "machineProperties",
    "model",
    "protocol",
    "serialNumber",
    "shortDescription",
    "tags",
    "timeZone",
    "timeZoneOffset",
    "type",
    "vendor"
})
public class DtDeliveryMachine {

    protected DtMachineAddress address;
    protected boolean contacting;
    @XmlElement(nillable = true)
    protected List<DtDevice> devices;
    protected String identification;
    protected MachineLifecycleStatus lifecycleStatus;
    protected MachineLocationType locationType;
    protected String longDescription;
    protected String machineConfiguration;
    @XmlElement(nillable = true)
    protected List<DtMachineProperty> machineProperties;
    protected String model;
    protected String protocol;
    protected String serialNumber;
    protected String shortDescription;
    @XmlElement(nillable = true)
    protected List<DtTag> tags;
    protected String timeZone;
    protected Integer timeZoneOffset;
    protected MachineConstructionType type;
    protected String vendor;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link DtMachineAddress }
     *     
     */
    public DtMachineAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtMachineAddress }
     *     
     */
    public void setAddress(DtMachineAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the contacting property.
     * 
     */
    public boolean isContacting() {
        return contacting;
    }

    /**
     * Sets the value of the contacting property.
     * 
     */
    public void setContacting(boolean value) {
        this.contacting = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtDevice }
     * 
     * 
     */
    public List<DtDevice> getDevices() {
        if (devices == null) {
            devices = new ArrayList<DtDevice>();
        }
        return this.devices;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the lifecycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MachineLifecycleStatus }
     *     
     */
    public MachineLifecycleStatus getLifecycleStatus() {
        return lifecycleStatus;
    }

    /**
     * Sets the value of the lifecycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineLifecycleStatus }
     *     
     */
    public void setLifecycleStatus(MachineLifecycleStatus value) {
        this.lifecycleStatus = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link MachineLocationType }
     *     
     */
    public MachineLocationType getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineLocationType }
     *     
     */
    public void setLocationType(MachineLocationType value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the machineConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineConfiguration() {
        return machineConfiguration;
    }

    /**
     * Sets the value of the machineConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineConfiguration(String value) {
        this.machineConfiguration = value;
    }

    /**
     * Gets the value of the machineProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the machineProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMachineProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtMachineProperty }
     * 
     * 
     */
    public List<DtMachineProperty> getMachineProperties() {
        if (machineProperties == null) {
            machineProperties = new ArrayList<DtMachineProperty>();
        }
        return this.machineProperties;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtTag }
     * 
     * 
     */
    public List<DtTag> getTags() {
        if (tags == null) {
            tags = new ArrayList<DtTag>();
        }
        return this.tags;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeZoneOffset(Integer value) {
        this.timeZoneOffset = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MachineConstructionType }
     *     
     */
    public MachineConstructionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineConstructionType }
     *     
     */
    public void setType(MachineConstructionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

}
