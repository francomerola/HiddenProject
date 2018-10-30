//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.10 at 12:29:32 PM CEST 
//


package com.fnz.f04;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLock.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountLock">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FundHardClosure"/>
 *     &lt;enumeration value="FundNoPublishedNav"/>
 *     &lt;enumeration value="GapEvent"/>
 *     &lt;enumeration value="AccountClosure"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountLock")
@XmlEnum
public enum AccountLock {

    @XmlEnumValue("FundHardClosure")
    FUND_HARD_CLOSURE("FundHardClosure"),
    @XmlEnumValue("FundNoPublishedNav")
    FUND_NO_PUBLISHED_NAV("FundNoPublishedNav"),
    @XmlEnumValue("GapEvent")
    GAP_EVENT("GapEvent"),
    @XmlEnumValue("AccountClosure")
    ACCOUNT_CLOSURE("AccountClosure"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AccountLock(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountLock fromValue(String v) {
        for (AccountLock c: AccountLock.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
