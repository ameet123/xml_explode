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
 * <p>Java class for RatingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCurrent" type="{}CCurrentType"/>
 *         &lt;element name="CCurrentFormula" type="{}CCurrentFormulaType"/>
 *         &lt;element name="CDisplayCurrent" type="{}CDisplayCurrentType"/>
 *         &lt;element name="CLobCode" type="{}CLobCodeType"/>
 *         &lt;element name="CRateItem" type="{}CRateItemType"/>
 *         &lt;element name="CRatingDetailsUk" type="{}CRatingDetailsUkType"/>
 *         &lt;element name="CRatingDtlItemCode" type="{}CRatingDtlItemCodeType"/>
 *         &lt;element name="CSortOrder" type="{}CSortOrderType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="EntityReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EntityStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Gid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RefName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RefValue" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UserCreated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingDetailsType", propOrder = {
    "cCurrent",
    "cCurrentFormula",
    "cDisplayCurrent",
    "cLobCode",
    "cRateItem",
    "cRatingDetailsUk",
    "cRatingDtlItemCode",
    "cSortOrder"
})
public class RatingDetailsType {

    @XmlElement(name = "CCurrent", required = true)
    protected CCurrentType cCurrent;
    @XmlElement(name = "CCurrentFormula", required = true)
    protected CCurrentFormulaType cCurrentFormula;
    @XmlElement(name = "CDisplayCurrent", required = true)
    protected CDisplayCurrentType cDisplayCurrent;
    @XmlElement(name = "CLobCode", required = true)
    protected CLobCodeType cLobCode;
    @XmlElement(name = "CRateItem", required = true)
    protected CRateItemType cRateItem;
    @XmlElement(name = "CRatingDetailsUk", required = true)
    protected CRatingDetailsUkType cRatingDetailsUk;
    @XmlElement(name = "CRatingDtlItemCode", required = true)
    protected CRatingDtlItemCodeType cRatingDtlItemCode;
    @XmlElement(name = "CSortOrder", required = true)
    protected CSortOrderType cSortOrder;
    @XmlAttribute(name = "DateCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "EntityReference")
    protected String entityReference;
    @XmlAttribute(name = "EntityStatus")
    protected String entityStatus;
    @XmlAttribute(name = "EntityType")
    protected String entityType;
    @XmlAttribute(name = "Gid")
    protected Integer gid;
    @XmlAttribute(name = "Id")
    protected Integer id;
    @XmlAttribute(name = "RefName")
    protected String refName;
    @XmlAttribute(name = "RefValue")
    protected Integer refValue;
    @XmlAttribute(name = "UserCreated")
    protected String userCreated;
    /**
     * Gets the value of the cCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link CCurrentType }
     *     
     */
    public CCurrentType getCCurrent() {
        return cCurrent;
    }

    /**
     * Sets the value of the cCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCurrentType }
     *     
     */
    public void setCCurrent(CCurrentType value) {
        this.cCurrent = value;
    }

    /**
     * Gets the value of the cCurrentFormula property.
     * 
     * @return
     *     possible object is
     *     {@link CCurrentFormulaType }
     *     
     */
    public CCurrentFormulaType getCCurrentFormula() {
        return cCurrentFormula;
    }

    /**
     * Sets the value of the cCurrentFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCurrentFormulaType }
     *     
     */
    public void setCCurrentFormula(CCurrentFormulaType value) {
        this.cCurrentFormula = value;
    }

    /**
     * Gets the value of the cDisplayCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link CDisplayCurrentType }
     *     
     */
    public CDisplayCurrentType getCDisplayCurrent() {
        return cDisplayCurrent;
    }

    /**
     * Sets the value of the cDisplayCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDisplayCurrentType }
     *     
     */
    public void setCDisplayCurrent(CDisplayCurrentType value) {
        this.cDisplayCurrent = value;
    }

    /**
     * Gets the value of the cLobCode property.
     * 
     * @return
     *     possible object is
     *     {@link CLobCodeType }
     *     
     */
    public CLobCodeType getCLobCode() {
        return cLobCode;
    }

    /**
     * Sets the value of the cLobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLobCodeType }
     *     
     */
    public void setCLobCode(CLobCodeType value) {
        this.cLobCode = value;
    }

    /**
     * Gets the value of the cRateItem property.
     * 
     * @return
     *     possible object is
     *     {@link CRateItemType }
     *     
     */
    public CRateItemType getCRateItem() {
        return cRateItem;
    }

    /**
     * Sets the value of the cRateItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRateItemType }
     *     
     */
    public void setCRateItem(CRateItemType value) {
        this.cRateItem = value;
    }

    /**
     * Gets the value of the cRatingDetailsUk property.
     * 
     * @return
     *     possible object is
     *     {@link CRatingDetailsUkType }
     *     
     */
    public CRatingDetailsUkType getCRatingDetailsUk() {
        return cRatingDetailsUk;
    }

    /**
     * Sets the value of the cRatingDetailsUk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRatingDetailsUkType }
     *     
     */
    public void setCRatingDetailsUk(CRatingDetailsUkType value) {
        this.cRatingDetailsUk = value;
    }

    /**
     * Gets the value of the cRatingDtlItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRatingDtlItemCodeType }
     *     
     */
    public CRatingDtlItemCodeType getCRatingDtlItemCode() {
        return cRatingDtlItemCode;
    }

    /**
     * Sets the value of the cRatingDtlItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRatingDtlItemCodeType }
     *     
     */
    public void setCRatingDtlItemCode(CRatingDtlItemCodeType value) {
        this.cRatingDtlItemCode = value;
    }

    /**
     * Gets the value of the cSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CSortOrderType }
     *     
     */
    public CSortOrderType getCSortOrder() {
        return cSortOrder;
    }

    /**
     * Sets the value of the cSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSortOrderType }
     *     
     */
    public void setCSortOrder(CSortOrderType value) {
        this.cSortOrder = value;
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
     * Gets the value of the entityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityStatus(String value) {
        this.entityStatus = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getRefValue() {
        return refValue;
    }

    /**
     * Sets the value of the refValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefValue(Integer value) {
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