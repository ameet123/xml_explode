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
 * <p>Java class for MDExposureInformationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDExposureInformationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MDExposureInformation" type="{}MDExposureInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDExposureInformationListType", propOrder = {
    "mdExposureInformation"
})
public class MDExposureInformationListType {

    @XmlElement(name = "MDExposureInformation", required = true)
    protected MDExposureInformationType mdExposureInformation;

    /**
     * Gets the value of the mdExposureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MDExposureInformationType }
     *     
     */
    public MDExposureInformationType getMDExposureInformation() {
        return mdExposureInformation;
    }

    /**
     * Sets the value of the mdExposureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDExposureInformationType }
     *     
     */
    public void setMDExposureInformation(MDExposureInformationType value) {
        this.mdExposureInformation = value;
    }

}
