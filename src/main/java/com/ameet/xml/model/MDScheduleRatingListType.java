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
 * <p>Java class for MDScheduleRatingListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDScheduleRatingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MDScheduleRating" type="{}MDScheduleRatingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDScheduleRatingListType", propOrder = {
    "mdScheduleRating"
})
public class MDScheduleRatingListType {

    @XmlElement(name = "MDScheduleRating", required = true)
    protected MDScheduleRatingType mdScheduleRating;

    /**
     * Gets the value of the mdScheduleRating property.
     * 
     * @return
     *     possible object is
     *     {@link MDScheduleRatingType }
     *     
     */
    public MDScheduleRatingType getMDScheduleRating() {
        return mdScheduleRating;
    }

    /**
     * Sets the value of the mdScheduleRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScheduleRatingType }
     *     
     */
    public void setMDScheduleRating(MDScheduleRatingType value) {
        this.mdScheduleRating = value;
    }

}
