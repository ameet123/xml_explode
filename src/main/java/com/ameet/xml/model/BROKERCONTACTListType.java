//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.19 at 11:06:43 AM EDT 
//


package com.ameet.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BROKER_CONTACTListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BROKER_CONTACTListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BROKER_CONTACT" type="{}BROKER_CONTACTType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BROKER_CONTACTListType", propOrder = {
    "brokercontact"
})
public class BROKERCONTACTListType {

    @XmlElement(name = "BROKER_CONTACT", required = true)
    protected BROKERCONTACTType brokercontact;

    /**
     * Gets the value of the brokercontact property.
     * 
     * @return
     *     possible object is
     *     {@link BROKERCONTACTType }
     *     
     */
    public BROKERCONTACTType getBROKERCONTACT() {
        return brokercontact;
    }

    /**
     * Sets the value of the brokercontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BROKERCONTACTType }
     *     
     */
    public void setBROKERCONTACT(BROKERCONTACTType value) {
        this.brokercontact = value;
    }

}
