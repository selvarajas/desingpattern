
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMachineDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMachineDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="machine" type="{http://service.publicinterfaces.agimatec.com}dtDeliveryMachine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMachineDetailsResponse", propOrder = {
    "machine"
})
public class GetMachineDetailsResponse {

    protected DtDeliveryMachine machine;

    /**
     * Gets the value of the machine property.
     * 
     * @return
     *     possible object is
     *     {@link DtDeliveryMachine }
     *     
     */
    public DtDeliveryMachine getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtDeliveryMachine }
     *     
     */
    public void setMachine(DtDeliveryMachine value) {
        this.machine = value;
    }

}
