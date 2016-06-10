
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tagType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="MACHINE"/>
 *     &lt;enumeration value="TICKET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tagType")
@XmlEnum
public enum TagType {

    USER,
    MACHINE,
    TICKET;

    public String value() {
        return name();
    }

    public static TagType fromValue(String v) {
        return valueOf(v);
    }

}
