
package com.agimatec.publicinterfaces.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtMachineBoxesOverview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtMachineBoxesOverview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boxGroups" type="{http://service.publicinterfaces.agimatec.com}dtBoxGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="devices" type="{http://service.publicinterfaces.agimatec.com}dtDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtMachineBoxesOverview", propOrder = {
    "boxGroups",
    "devices"
})
public class DtMachineBoxesOverview {

    @XmlElement(nillable = true)
    protected List<DtBoxGroup> boxGroups;
    @XmlElement(nillable = true)
    protected List<DtDevice> devices;

    /**
     * Gets the value of the boxGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtBoxGroup }
     * 
     * 
     */
    public List<DtBoxGroup> getBoxGroups() {
        if (boxGroups == null) {
            boxGroups = new ArrayList<DtBoxGroup>();
        }
        return this.boxGroups;
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

}
