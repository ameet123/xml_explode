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
 * <p>Java class for MDRiskCharacteristicsNonFinancialListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDRiskCharacteristicsNonFinancialListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MDRiskCharacteristicsNonFinancial" type="{}MDRiskCharacteristicsNonFinancialType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDRiskCharacteristicsNonFinancialListType", propOrder = {
    "mdRiskCharacteristicsNonFinancial"
})
public class MDRiskCharacteristicsNonFinancialListType {

    @XmlElement(name = "MDRiskCharacteristicsNonFinancial", required = true)
    protected MDRiskCharacteristicsNonFinancialType mdRiskCharacteristicsNonFinancial;

    /**
     * Gets the value of the mdRiskCharacteristicsNonFinancial property.
     * 
     * @return
     *     possible object is
     *     {@link MDRiskCharacteristicsNonFinancialType }
     *     
     */
    public MDRiskCharacteristicsNonFinancialType getMDRiskCharacteristicsNonFinancial() {
        return mdRiskCharacteristicsNonFinancial;
    }

    /**
     * Sets the value of the mdRiskCharacteristicsNonFinancial property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRiskCharacteristicsNonFinancialType }
     *     
     */
    public void setMDRiskCharacteristicsNonFinancial(MDRiskCharacteristicsNonFinancialType value) {
        this.mdRiskCharacteristicsNonFinancial = value;
    }

}
