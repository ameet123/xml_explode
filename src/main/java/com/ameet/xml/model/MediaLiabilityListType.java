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
 * <p>Java class for MediaLiabilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaLiabilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaLiability" type="{}MediaLiabilityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaLiabilityListType", propOrder = {
    "mediaLiability"
})
public class MediaLiabilityListType {

    @XmlElement(name = "MediaLiability", required = true)
    protected MediaLiabilityType mediaLiability;

    /**
     * Gets the value of the mediaLiability property.
     * 
     * @return
     *     possible object is
     *     {@link MediaLiabilityType }
     *     
     */
    public MediaLiabilityType getMediaLiability() {
        return mediaLiability;
    }

    /**
     * Sets the value of the mediaLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaLiabilityType }
     *     
     */
    public void setMediaLiability(MediaLiabilityType value) {
        this.mediaLiability = value;
    }

}
