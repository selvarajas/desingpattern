
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for machineLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="machineLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Indoor"/>
 *     &lt;enumeration value="Outdoor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "machineLocationType")
@XmlEnum
public enum MachineLocationType {

    @XmlEnumValue("Indoor")
    INDOOR("Indoor"),
    @XmlEnumValue("Outdoor")
    OUTDOOR("Outdoor");
    private final String value;

    MachineLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MachineLocationType fromValue(String v) {
        for (MachineLocationType c: MachineLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
