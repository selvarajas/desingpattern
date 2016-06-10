
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMachineDetailsWithTagAndLifecycleStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMachineDetailsWithTagAndLifecycleStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifecycleStatus" type="{http://service.publicinterfaces.agimatec.com}machineLifecycleStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMachineDetailsWithTagAndLifecycleStatus", propOrder = {
    "tag",
    "lifecycleStatus"
})
public class GetMachineDetailsWithTagAndLifecycleStatus {

    protected String tag;
    protected MachineLifecycleStatus lifecycleStatus;

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
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

}
