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
 * <p>Java class for MDCoverageStructureListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDCoverageStructureListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MDCoverageStructure" type="{}MDCoverageStructureType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDCoverageStructureListType", propOrder = {
    "mdCoverageStructure"
})
public class MDCoverageStructureListType {

    @XmlElement(name = "MDCoverageStructure", required = true)
    protected MDCoverageStructureType mdCoverageStructure;

    /**
     * Gets the value of the mdCoverageStructure property.
     * 
     * @return
     *     possible object is
     *     {@link MDCoverageStructureType }
     *     
     */
    public MDCoverageStructureType getMDCoverageStructure() {
        return mdCoverageStructure;
    }

    /**
     * Sets the value of the mdCoverageStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCoverageStructureType }
     *     
     */
    public void setMDCoverageStructure(MDCoverageStructureType value) {
        this.mdCoverageStructure = value;
    }

}