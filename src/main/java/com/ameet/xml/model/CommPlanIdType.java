//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 12:22:48 PM EDT 
//


package com.ameet.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CommPlanIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommPlanIdType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="oldValue" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="curValue" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPlanIdType", propOrder = {
    "value"
})
public class CommPlanIdType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "oldValue")
    protected Byte oldValue;
    @XmlAttribute(name = "curValue")
    protected Byte curValue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setOldValue(Byte value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the curValue property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getCurValue() {
        return curValue;
    }

    /**
     * Sets the value of the curValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setCurValue(Byte value) {
        this.curValue = value;
    }

}
