
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boxSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="boxSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XSmall"/>
 *     &lt;enumeration value="Small"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Large"/>
 *     &lt;enumeration value="XLarge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "boxSize")
@XmlEnum
public enum BoxSize {

    @XmlEnumValue("XSmall")
    X_SMALL("XSmall"),
    @XmlEnumValue("Small")
    SMALL("Small"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Large")
    LARGE("Large"),
    @XmlEnumValue("XLarge")
    X_LARGE("XLarge");
    private final String value;

    BoxSize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoxSize fromValue(String v) {
        for (BoxSize c: BoxSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
