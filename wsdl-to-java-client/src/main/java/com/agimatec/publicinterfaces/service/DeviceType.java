
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LABEL_PRINTER"/>
 *     &lt;enumeration value="RECEIPT_PRINTER"/>
 *     &lt;enumeration value="PAYMENT_TERMINAL"/>
 *     &lt;enumeration value="CASH_UNIT"/>
 *     &lt;enumeration value="CARD_READER"/>
 *     &lt;enumeration value="BARCODE_SCANNER"/>
 *     &lt;enumeration value="RFID_READER"/>
 *     &lt;enumeration value="TRACKBALL"/>
 *     &lt;enumeration value="KEYBOARD"/>
 *     &lt;enumeration value="ROUTER"/>
 *     &lt;enumeration value="TOUCH"/>
 *     &lt;enumeration value="CAMERA"/>
 *     &lt;enumeration value="CAMERA_BAR"/>
 *     &lt;enumeration value="VOIP"/>
 *     &lt;enumeration value="COOLING_UNIT"/>
 *     &lt;enumeration value="UPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deviceType")
@XmlEnum
public enum DeviceType {

    LABEL_PRINTER,
    RECEIPT_PRINTER,
    PAYMENT_TERMINAL,
    CASH_UNIT,
    CARD_READER,
    BARCODE_SCANNER,
    RFID_READER,
    TRACKBALL,
    KEYBOARD,
    ROUTER,
    TOUCH,
    CAMERA,
    CAMERA_BAR,
    VOIP,
    COOLING_UNIT,
    UPS;

    public String value() {
        return name();
    }

    public static DeviceType fromValue(String v) {
        return valueOf(v);
    }

}
