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
 * <p>Java class for MDFinancialAnalysisListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDFinancialAnalysisListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MDFinancialAnalysis" type="{}MDFinancialAnalysisType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDFinancialAnalysisListType", propOrder = {
    "mdFinancialAnalysis"
})
public class MDFinancialAnalysisListType {

    @XmlElement(name = "MDFinancialAnalysis", required = true)
    protected MDFinancialAnalysisType mdFinancialAnalysis;

    /**
     * Gets the value of the mdFinancialAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link MDFinancialAnalysisType }
     *     
     */
    public MDFinancialAnalysisType getMDFinancialAnalysis() {
        return mdFinancialAnalysis;
    }

    /**
     * Sets the value of the mdFinancialAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDFinancialAnalysisType }
     *     
     */
    public void setMDFinancialAnalysis(MDFinancialAnalysisType value) {
        this.mdFinancialAnalysis = value;
    }

}
