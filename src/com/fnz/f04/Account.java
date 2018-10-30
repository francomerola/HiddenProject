//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.10 at 12:29:32 PM CEST 
//


package com.fnz.f04;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalProductId" type="{http://www.fnz.com/F04}ExternalProductId" minOccurs="0"/>
 *         &lt;element name="ExternalAccountId" type="{http://www.fnz.com/F04}ExternalAccountId"/>
 *         &lt;element name="ExternalCustomerId" type="{http://www.fnz.com/F04}ExternalCustomerId" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.fnz.com/F04}AccountId" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.fnz.com/F04}AccountType"/>
 *         &lt;element name="HedgeProviderId" type="{http://www.fnz.com/F04}HedgeProviderId" minOccurs="0"/>
 *         &lt;element name="CloseAccount" type="{http://www.fnz.com/F04}CloseAccount" minOccurs="0"/>
 *         &lt;element name="Orders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Order" type="{http://www.fnz.com/F04}Order" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "externalProductId",
    "externalAccountId",
    "externalCustomerId",
    "accountId",
    "accountType",
    "hedgeProviderId",
    "closeAccount",
    "orders"
})
public class Account
    implements Serializable
{

    private final static long serialVersionUID = 145331435L;
    @XmlElement(name = "ExternalProductId")
    protected String externalProductId;
    @XmlElement(name = "ExternalAccountId", required = true)
    protected String externalAccountId;
    @XmlElement(name = "ExternalCustomerId")
    protected String externalCustomerId;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountType", required = true)
    @XmlSchemaType(name = "string")
    protected AccountType accountType;
    @XmlElement(name = "HedgeProviderId")
    protected String hedgeProviderId;
    @XmlElement(name = "CloseAccount")
    protected CloseAccount closeAccount;
    @XmlElement(name = "Orders")
    protected Orders orders;

    /**
     * Gets the value of the externalProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalProductId() {
        return externalProductId;
    }

    /**
     * Sets the value of the externalProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalProductId(String value) {
        this.externalProductId = value;
    }

    public boolean isSetExternalProductId() {
        return (this.externalProductId!= null);
    }

    /**
     * Gets the value of the externalAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAccountId() {
        return externalAccountId;
    }

    /**
     * Sets the value of the externalAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAccountId(String value) {
        this.externalAccountId = value;
    }

    public boolean isSetExternalAccountId() {
        return (this.externalAccountId!= null);
    }

    /**
     * Gets the value of the externalCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCustomerId() {
        return externalCustomerId;
    }

    /**
     * Sets the value of the externalCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCustomerId(String value) {
        this.externalCustomerId = value;
    }

    public boolean isSetExternalCustomerId() {
        return (this.externalCustomerId!= null);
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    public boolean isSetAccountId() {
        return (this.accountId!= null);
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    public boolean isSetAccountType() {
        return (this.accountType!= null);
    }

    /**
     * Gets the value of the hedgeProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHedgeProviderId() {
        return hedgeProviderId;
    }

    /**
     * Sets the value of the hedgeProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHedgeProviderId(String value) {
        this.hedgeProviderId = value;
    }

    public boolean isSetHedgeProviderId() {
        return (this.hedgeProviderId!= null);
    }

    /**
     * Gets the value of the closeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CloseAccount }
     *     
     */
    public CloseAccount getCloseAccount() {
        return closeAccount;
    }

    /**
     * Sets the value of the closeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseAccount }
     *     
     */
    public void setCloseAccount(CloseAccount value) {
        this.closeAccount = value;
    }

    public boolean isSetCloseAccount() {
        return (this.closeAccount!= null);
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link Orders }
     *     
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orders }
     *     
     */
    public void setOrders(Orders value) {
        this.orders = value;
    }

    public boolean isSetOrders() {
        return (this.orders!= null);
    }

}
