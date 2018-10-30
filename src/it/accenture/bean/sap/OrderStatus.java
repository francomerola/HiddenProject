//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.10 at 12:29:32 PM CEST 
//


package it.accenture.bean.sap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Authorised"/>
 *     &lt;enumeration value="AuthorisedSwitch"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Placed"/>
 *     &lt;enumeration value="Pooled"/>
 *     &lt;enumeration value="Excluded"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Delayed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus")
@XmlEnum
public enum OrderStatus {

    @XmlEnumValue("Authorised")
    AUTHORISED("Authorised"),
    @XmlEnumValue("AuthorisedSwitch")
    AUTHORISED_SWITCH("AuthorisedSwitch"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Placed")
    PLACED("Placed"),
    @XmlEnumValue("Pooled")
    POOLED("Pooled"),
    @XmlEnumValue("Excluded")
    EXCLUDED("Excluded"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Delayed")
    DELAYED("Delayed");
    private final String value;

    OrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatus fromValue(String v) {
        for (OrderStatus c: OrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
