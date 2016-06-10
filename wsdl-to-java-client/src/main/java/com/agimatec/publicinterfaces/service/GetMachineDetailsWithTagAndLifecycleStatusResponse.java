
package com.agimatec.publicinterfaces.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMachineDetailsWithTagAndLifecycleStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMachineDetailsWithTagAndLifecycleStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="machines" type="{http://service.publicinterfaces.agimatec.com}dtDeliveryMachine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMachineDetailsWithTagAndLifecycleStatusResponse", propOrder = {
    "machines"
})
public class GetMachineDetailsWithTagAndLifecycleStatusResponse {

    protected List<DtDeliveryMachine> machines;

    /**
     * Gets the value of the machines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the machines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMachines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtDeliveryMachine }
     * 
     * 
     */
    public List<DtDeliveryMachine> getMachines() {
        if (machines == null) {
            machines = new ArrayList<DtDeliveryMachine>();
        }
        return this.machines;
    }

}
