//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 12:22:48 PM EDT 
//


package com.ameet.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCER_PHYSICAL_ADDListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCER_PHYSICAL_ADDListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRODUCER_PHYSICAL_ADD" type="{}PRODUCER_PHYSICAL_ADDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRODUCER_PHYSICAL_ADDListType", propOrder = {
    "producerphysicaladd"
})
public class PRODUCERPHYSICALADDListType {

    @XmlElement(name = "PRODUCER_PHYSICAL_ADD", required = true)
    protected PRODUCERPHYSICALADDType producerphysicaladd;

    /**
     * Gets the value of the producerphysicaladd property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCERPHYSICALADDType }
     *     
     */
    public PRODUCERPHYSICALADDType getPRODUCERPHYSICALADD() {
        return producerphysicaladd;
    }

    /**
     * Sets the value of the producerphysicaladd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCERPHYSICALADDType }
     *     
     */
    public void setPRODUCERPHYSICALADD(PRODUCERPHYSICALADDType value) {
        this.producerphysicaladd = value;
    }

}
