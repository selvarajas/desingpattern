
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for machineConstructionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="machineConstructionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="FS"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="LS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "machineConstructionType")
@XmlEnum
public enum MachineConstructionType {

    UNKNOWN,
    FS,
    RS,
    LS;

    public String value() {
        return name();
    }

    public static MachineConstructionType fromValue(String v) {
        return valueOf(v);
    }

}
