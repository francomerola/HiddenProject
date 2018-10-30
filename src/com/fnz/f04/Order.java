//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.10 at 12:29:32 PM CEST 
//


package com.fnz.f04;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductIdentifier" type="{http://www.fnz.com/F04}ProductIdentifier"/>
 *         &lt;element name="ProductCurrency" type="{http://www.fnz.com/F04}Currency" minOccurs="0"/>
 *         &lt;element name="IdentifierType" type="{http://www.fnz.com/F04}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TargetTradeDate" type="{http://www.fnz.com/F04}TargetTradeDate"/>
 *         &lt;element name="OperationDate" type="{http://www.fnz.com/F04}OperationDate" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.fnz.com/F04}Amount" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.fnz.com/F04}Quantity" minOccurs="0"/>
 *         &lt;element name="Strategy" type="{http://www.fnz.com/F04}StrategyEnum"/>
 *         &lt;element name="OrderCurrency" type="{http://www.fnz.com/F04}Currency" minOccurs="0"/>
 *         &lt;element name="ExternalOrderId" type="{http://www.fnz.com/F04}ExternalOrderId" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.fnz.com/F04}Direction" minOccurs="0"/>
 *         &lt;element name="MovementType" type="{http://www.fnz.com/F04}MovementType"/>
 *         &lt;element name="ExpectedConfirmationDate" type="{http://www.fnz.com/F04}ExpectedConfirmationDate" minOccurs="0"/>
 *         &lt;element name="RetrospectiveTargetTradeDate" type="{http://www.fnz.com/F04}RetrospectiveTargetTradeDate" minOccurs="0"/>
 *         &lt;element name="RetrospectiveOperationDate" type="{http://www.fnz.com/F04}RetrospectiveOperationDate" minOccurs="0"/>
 *         &lt;element name="AggregateOrderId" type="{http://www.fnz.com/F04}AggregateOrderId" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.fnz.com/F04}OrderStatus" minOccurs="0"/>
 *         &lt;element name="InstructionDate" type="{http://www.fnz.com/F04}InstructionDate" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.fnz.com/F04}OrderId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "productIdentifier",
    "productCurrency",
    "identifierType",
    "targetTradeDate",
    "operationDate",
    "amount",
    "quantity",
    "strategy",
    "orderCurrency",
    "externalOrderId",
    "direction",
    "movementType",
    "expectedConfirmationDate",
    "retrospectiveTargetTradeDate",
    "retrospectiveOperationDate",
    "aggregateOrderId",
    "orderStatus",
    "instructionDate",
    "orderId"
})
public class Order
    implements Serializable
{

    private final static long serialVersionUID = 145331435L;
    @XmlElement(name = "ProductIdentifier", required = true)
    protected String productIdentifier;
    @XmlElement(name = "ProductCurrency")
    protected String productCurrency;
    @XmlElement(name = "IdentifierType")
    @XmlSchemaType(name = "string")
    protected IdentifierType identifierType;
    @XmlElement(name = "TargetTradeDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar targetTradeDate;
    @XmlElement(name = "OperationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "Strategy", required = true)
    @XmlSchemaType(name = "string")
    protected StrategyEnum strategy;
    @XmlElement(name = "OrderCurrency")
    protected String orderCurrency;
    @XmlElement(name = "ExternalOrderId")
    protected String externalOrderId;
    @XmlElement(name = "Direction")
    @XmlSchemaType(name = "string")
    protected Direction direction;
    @XmlElement(name = "MovementType", required = true)
    @XmlSchemaType(name = "string")
    protected MovementType movementType;
    @XmlElement(name = "ExpectedConfirmationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedConfirmationDate;
    @XmlElement(name = "RetrospectiveTargetTradeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retrospectiveTargetTradeDate;
    @XmlElement(name = "RetrospectiveOperationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retrospectiveOperationDate;
    @XmlElement(name = "AggregateOrderId")
    protected Integer aggregateOrderId;
    @XmlElement(name = "OrderStatus")
    @XmlSchemaType(name = "string")
    protected OrderStatus orderStatus;
    @XmlElement(name = "InstructionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar instructionDate;
    @XmlElement(name = "OrderId")
    protected String orderId;

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifier(String value) {
        this.productIdentifier = value;
    }

    public boolean isSetProductIdentifier() {
        return (this.productIdentifier!= null);
    }

    /**
     * Gets the value of the productCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCurrency() {
        return productCurrency;
    }

    /**
     * Sets the value of the productCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCurrency(String value) {
        this.productCurrency = value;
    }

    public boolean isSetProductCurrency() {
        return (this.productCurrency!= null);
    }

    /**
     * Gets the value of the identifierType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIdentifierType() {
        return identifierType;
    }

    /**
     * Sets the value of the identifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIdentifierType(IdentifierType value) {
        this.identifierType = value;
    }

    public boolean isSetIdentifierType() {
        return (this.identifierType!= null);
    }

    /**
     * Gets the value of the targetTradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetTradeDate() {
        return targetTradeDate;
    }

    /**
     * Sets the value of the targetTradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetTradeDate(XMLGregorianCalendar value) {
        this.targetTradeDate = value;
    }

    public boolean isSetTargetTradeDate() {
        return (this.targetTradeDate!= null);
    }

    /**
     * Gets the value of the operationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Sets the value of the operationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    public boolean isSetOperationDate() {
        return (this.operationDate!= null);
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    public boolean isSetAmount() {
        return (this.amount!= null);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    public boolean isSetQuantity() {
        return (this.quantity!= null);
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyEnum }
     *     
     */
    public StrategyEnum getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyEnum }
     *     
     */
    public void setStrategy(StrategyEnum value) {
        this.strategy = value;
    }

    public boolean isSetStrategy() {
        return (this.strategy!= null);
    }

    /**
     * Gets the value of the orderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCurrency() {
        return orderCurrency;
    }

    /**
     * Sets the value of the orderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCurrency(String value) {
        this.orderCurrency = value;
    }

    public boolean isSetOrderCurrency() {
        return (this.orderCurrency!= null);
    }

    /**
     * Gets the value of the externalOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalOrderId() {
        return externalOrderId;
    }

    /**
     * Sets the value of the externalOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalOrderId(String value) {
        this.externalOrderId = value;
    }

    public boolean isSetExternalOrderId() {
        return (this.externalOrderId!= null);
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDirection(Direction value) {
        this.direction = value;
    }

    public boolean isSetDirection() {
        return (this.direction!= null);
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link MovementType }
     *     
     */
    public MovementType getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementType }
     *     
     */
    public void setMovementType(MovementType value) {
        this.movementType = value;
    }

    public boolean isSetMovementType() {
        return (this.movementType!= null);
    }

    /**
     * Gets the value of the expectedConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedConfirmationDate() {
        return expectedConfirmationDate;
    }

    /**
     * Sets the value of the expectedConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedConfirmationDate(XMLGregorianCalendar value) {
        this.expectedConfirmationDate = value;
    }

    public boolean isSetExpectedConfirmationDate() {
        return (this.expectedConfirmationDate!= null);
    }

    /**
     * Gets the value of the retrospectiveTargetTradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrospectiveTargetTradeDate() {
        return retrospectiveTargetTradeDate;
    }

    /**
     * Sets the value of the retrospectiveTargetTradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrospectiveTargetTradeDate(XMLGregorianCalendar value) {
        this.retrospectiveTargetTradeDate = value;
    }

    public boolean isSetRetrospectiveTargetTradeDate() {
        return (this.retrospectiveTargetTradeDate!= null);
    }

    /**
     * Gets the value of the retrospectiveOperationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrospectiveOperationDate() {
        return retrospectiveOperationDate;
    }

    /**
     * Sets the value of the retrospectiveOperationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrospectiveOperationDate(XMLGregorianCalendar value) {
        this.retrospectiveOperationDate = value;
    }

    public boolean isSetRetrospectiveOperationDate() {
        return (this.retrospectiveOperationDate!= null);
    }

    /**
     * Gets the value of the aggregateOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAggregateOrderId() {
        return aggregateOrderId;
    }

    /**
     * Sets the value of the aggregateOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAggregateOrderId(Integer value) {
        this.aggregateOrderId = value;
    }

    public boolean isSetAggregateOrderId() {
        return (this.aggregateOrderId!= null);
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
        this.orderStatus = value;
    }

    public boolean isSetOrderStatus() {
        return (this.orderStatus!= null);
    }

    /**
     * Gets the value of the instructionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstructionDate() {
        return instructionDate;
    }

    /**
     * Sets the value of the instructionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstructionDate(XMLGregorianCalendar value) {
        this.instructionDate = value;
    }

    public boolean isSetInstructionDate() {
        return (this.instructionDate!= null);
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    public boolean isSetOrderId() {
        return (this.orderId!= null);
    }

}