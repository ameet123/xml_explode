//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.19 at 11:06:43 AM EDT 
//


package com.ameet.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MDCoverageStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDCoverageStructureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCovStructTwisty" type="{}CCovStructTwistyType"/>
 *         &lt;element name="CCovStrDateReset" type="{}CCovStrDateResetType"/>
 *         &lt;element name="CoverageStructureDetailsList" type="{}CoverageStructureDetailsListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="EntityReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Gid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RefName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RefValue" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="UserCreated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDCoverageStructureType", propOrder = {
    "cCovStructTwisty",
    "cCovStrDateReset",
    "coverageStructureDetailsList"
})
public class MDCoverageStructureType {

    @XmlElement(name = "CCovStructTwisty", required = true)
    protected CCovStructTwistyType cCovStructTwisty;
    @XmlElement(name = "CCovStrDateReset", required = true)
    protected CCovStrDateResetType cCovStrDateReset;
    @XmlElement(name = "CoverageStructureDetailsList", required = true)
    protected CoverageStructureDetailsListType coverageStructureDetailsList;
    @XmlAttribute(name = "DateCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "EntityReference")
    protected String entityReference;
    @XmlAttribute(name = "EntityType")
    protected String entityType;
    @XmlAttribute(name = "Gid")
    protected Integer gid;
    @XmlAttribute(name = "Id")
    protected Integer id;
    @XmlAttribute(name = "RefName")
    protected String refName;
    @XmlAttribute(name = "RefValue")
    protected Short refValue;
    @XmlAttribute(name = "UserCreated")
    protected String userCreated;

    /**
     * Gets the value of the cCovStructTwisty property.
     * 
     * @return
     *     possible object is
     *     {@link CCovStructTwistyType }
     *     
     */
    public CCovStructTwistyType getCCovStructTwisty() {
        return cCovStructTwisty;
    }

    /**
     * Sets the value of the cCovStructTwisty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCovStructTwistyType }
     *     
     */
    public void setCCovStructTwisty(CCovStructTwistyType value) {
        this.cCovStructTwisty = value;
    }

    /**
     * Gets the value of the cCovStrDateReset property.
     * 
     * @return
     *     possible object is
     *     {@link CCovStrDateResetType }
     *     
     */
    public CCovStrDateResetType getCCovStrDateReset() {
        return cCovStrDateReset;
    }

    /**
     * Sets the value of the cCovStrDateReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCovStrDateResetType }
     *     
     */
    public void setCCovStrDateReset(CCovStrDateResetType value) {
        this.cCovStrDateReset = value;
    }

    /**
     * Gets the value of the coverageStructureDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageStructureDetailsListType }
     *     
     */
    public CoverageStructureDetailsListType getCoverageStructureDetailsList() {
        return coverageStructureDetailsList;
    }

    /**
     * Sets the value of the coverageStructureDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageStructureDetailsListType }
     *     
     */
    public void setCoverageStructureDetailsList(CoverageStructureDetailsListType value) {
        this.coverageStructureDetailsList = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the entityReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityReference() {
        return entityReference;
    }

    /**
     * Sets the value of the entityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityReference(String value) {
        this.entityReference = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGid(Integer value) {
        this.gid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the refName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefName() {
        return refName;
    }

    /**
     * Sets the value of the refName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefName(String value) {
        this.refName = value;
    }

    /**
     * Gets the value of the refValue property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRefValue() {
        return refValue;
    }

    /**
     * Sets the value of the refValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRefValue(Short value) {
        this.refValue = value;
    }

    /**
     * Gets the value of the userCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCreated() {
        return userCreated;
    }

    /**
     * Sets the value of the userCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCreated(String value) {
        this.userCreated = value;
    }

}
