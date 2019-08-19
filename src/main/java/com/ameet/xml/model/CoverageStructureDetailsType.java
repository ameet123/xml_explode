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
 * <p>Java class for CoverageStructureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageStructureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAslob" type="{}CAslobType" minOccurs="0"/>
 *         &lt;element name="CCoverage" type="{}CCoverageType"/>
 *         &lt;element name="CCoverageStructureUk" type="{}CCoverageStructureUkType"/>
 *         &lt;element name="CCoverageTypeCode" type="{}CCoverageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="CCoverageTypeName" type="{}CCoverageTypeNameType" minOccurs="0"/>
 *         &lt;element name="CCovCode" type="{}CCovCodeType"/>
 *         &lt;element name="CCovSelectionLimit" type="{}CCovSelectionLimitType" minOccurs="0"/>
 *         &lt;element name="CCovSelectionRet" type="{}CCovSelectionRetType" minOccurs="0"/>
 *         &lt;element name="CLimit" type="{}CLimitType" minOccurs="0"/>
 *         &lt;element name="CLimitModifyFlag" type="{}CLimitModifyFlagType" minOccurs="0"/>
 *         &lt;element name="CLobCode" type="{}CLobCodeType"/>
 *         &lt;element name="CResetDefaultsOnDate" type="{}CResetDefaultsOnDateType"/>
 *         &lt;element name="CRetention" type="{}CRetentionType" minOccurs="0"/>
 *         &lt;element name="CSortOrder" type="{}CSortOrderType"/>
 *         &lt;element name="CSubLineCode" type="{}CSubLineCodeType" minOccurs="0"/>
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
@XmlType(name = "CoverageStructureDetailsType", propOrder = {
    "cAslob",
    "cCoverage",
    "cCoverageStructureUk",
    "cCoverageTypeCode",
    "cCoverageTypeName",
    "cCovCode",
    "cCovSelectionLimit",
    "cCovSelectionRet",
    "cLimit",
    "cLimitModifyFlag",
    "cLobCode",
    "cResetDefaultsOnDate",
    "cRetention",
    "cSortOrder",
    "cSubLineCode"
})
public class CoverageStructureDetailsType {

    @XmlElement(name = "CAslob")
    protected CAslobType cAslob;
    @XmlElement(name = "CCoverage", required = true)
    protected CCoverageType cCoverage;
    @XmlElement(name = "CCoverageStructureUk", required = true)
    protected CCoverageStructureUkType cCoverageStructureUk;
    @XmlElement(name = "CCoverageTypeCode")
    protected CCoverageTypeCodeType cCoverageTypeCode;
    @XmlElement(name = "CCoverageTypeName")
    protected CCoverageTypeNameType cCoverageTypeName;
    @XmlElement(name = "CCovCode", required = true)
    protected CCovCodeType cCovCode;
    @XmlElement(name = "CCovSelectionLimit")
    protected CCovSelectionLimitType cCovSelectionLimit;
    @XmlElement(name = "CCovSelectionRet")
    protected CCovSelectionRetType cCovSelectionRet;
    @XmlElement(name = "CLimit")
    protected CLimitType cLimit;
    @XmlElement(name = "CLimitModifyFlag")
    protected CLimitModifyFlagType cLimitModifyFlag;
    @XmlElement(name = "CLobCode", required = true)
    protected CLobCodeType cLobCode;
    @XmlElement(name = "CResetDefaultsOnDate", required = true)
    protected CResetDefaultsOnDateType cResetDefaultsOnDate;
    @XmlElement(name = "CRetention")
    protected CRetentionType cRetention;
    @XmlElement(name = "CSortOrder", required = true)
    protected CSortOrderType cSortOrder;
    @XmlElement(name = "CSubLineCode")
    protected CSubLineCodeType cSubLineCode;
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
//    protected String oldValue;
//    protected String curValue;
//
//    public String getOldValue() {
//        return oldValue;
//    }
//
//    public void setOldValue(String oldValue) {
//        this.oldValue = oldValue;
//    }
//
//    public String getCurValue() {
//        return curValue;
//    }
//
//    public void setCurValue(String curValue) {
//        this.curValue = curValue;
//    }
    /**
     * Gets the value of the cAslob property.
     * 
     * @return
     *     possible object is
     *     {@link CAslobType }
     *     
     */
    public CAslobType getCAslob() {
        return cAslob;
    }

    /**
     * Sets the value of the cAslob property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAslobType }
     *     
     */
    public void setCAslob(CAslobType value) {
        this.cAslob = value;
    }

    /**
     * Gets the value of the cCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link CCoverageType }
     *     
     */
    public CCoverageType getCCoverage() {
        return cCoverage;
    }

    /**
     * Sets the value of the cCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCoverageType }
     *     
     */
    public void setCCoverage(CCoverageType value) {
        this.cCoverage = value;
    }

    /**
     * Gets the value of the cCoverageStructureUk property.
     * 
     * @return
     *     possible object is
     *     {@link CCoverageStructureUkType }
     *     
     */
    public CCoverageStructureUkType getCCoverageStructureUk() {
        return cCoverageStructureUk;
    }

    /**
     * Sets the value of the cCoverageStructureUk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCoverageStructureUkType }
     *     
     */
    public void setCCoverageStructureUk(CCoverageStructureUkType value) {
        this.cCoverageStructureUk = value;
    }

    /**
     * Gets the value of the cCoverageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CCoverageTypeCodeType }
     *     
     */
    public CCoverageTypeCodeType getCCoverageTypeCode() {
        return cCoverageTypeCode;
    }

    /**
     * Sets the value of the cCoverageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCoverageTypeCodeType }
     *     
     */
    public void setCCoverageTypeCode(CCoverageTypeCodeType value) {
        this.cCoverageTypeCode = value;
    }

    /**
     * Gets the value of the cCoverageTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link CCoverageTypeNameType }
     *     
     */
    public CCoverageTypeNameType getCCoverageTypeName() {
        return cCoverageTypeName;
    }

    /**
     * Sets the value of the cCoverageTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCoverageTypeNameType }
     *     
     */
    public void setCCoverageTypeName(CCoverageTypeNameType value) {
        this.cCoverageTypeName = value;
    }

    /**
     * Gets the value of the cCovCode property.
     * 
     * @return
     *     possible object is
     *     {@link CCovCodeType }
     *     
     */
    public CCovCodeType getCCovCode() {
        return cCovCode;
    }

    /**
     * Sets the value of the cCovCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCovCodeType }
     *     
     */
    public void setCCovCode(CCovCodeType value) {
        this.cCovCode = value;
    }

    /**
     * Gets the value of the cCovSelectionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CCovSelectionLimitType }
     *     
     */
    public CCovSelectionLimitType getCCovSelectionLimit() {
        return cCovSelectionLimit;
    }

    /**
     * Sets the value of the cCovSelectionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCovSelectionLimitType }
     *     
     */
    public void setCCovSelectionLimit(CCovSelectionLimitType value) {
        this.cCovSelectionLimit = value;
    }

    /**
     * Gets the value of the cCovSelectionRet property.
     * 
     * @return
     *     possible object is
     *     {@link CCovSelectionRetType }
     *     
     */
    public CCovSelectionRetType getCCovSelectionRet() {
        return cCovSelectionRet;
    }

    /**
     * Sets the value of the cCovSelectionRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCovSelectionRetType }
     *     
     */
    public void setCCovSelectionRet(CCovSelectionRetType value) {
        this.cCovSelectionRet = value;
    }

    /**
     * Gets the value of the cLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CLimitType }
     *     
     */
    public CLimitType getCLimit() {
        return cLimit;
    }

    /**
     * Sets the value of the cLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLimitType }
     *     
     */
    public void setCLimit(CLimitType value) {
        this.cLimit = value;
    }

    /**
     * Gets the value of the cLimitModifyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link CLimitModifyFlagType }
     *     
     */
    public CLimitModifyFlagType getCLimitModifyFlag() {
        return cLimitModifyFlag;
    }

    /**
     * Sets the value of the cLimitModifyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLimitModifyFlagType }
     *     
     */
    public void setCLimitModifyFlag(CLimitModifyFlagType value) {
        this.cLimitModifyFlag = value;
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
     * Gets the value of the cResetDefaultsOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link CResetDefaultsOnDateType }
     *     
     */
    public CResetDefaultsOnDateType getCResetDefaultsOnDate() {
        return cResetDefaultsOnDate;
    }

    /**
     * Sets the value of the cResetDefaultsOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CResetDefaultsOnDateType }
     *     
     */
    public void setCResetDefaultsOnDate(CResetDefaultsOnDateType value) {
        this.cResetDefaultsOnDate = value;
    }

    /**
     * Gets the value of the cRetention property.
     * 
     * @return
     *     possible object is
     *     {@link CRetentionType }
     *     
     */
    public CRetentionType getCRetention() {
        return cRetention;
    }

    /**
     * Sets the value of the cRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRetentionType }
     *     
     */
    public void setCRetention(CRetentionType value) {
        this.cRetention = value;
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
     * Gets the value of the cSubLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link CSubLineCodeType }
     *     
     */
    public CSubLineCodeType getCSubLineCode() {
        return cSubLineCode;
    }

    /**
     * Sets the value of the cSubLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSubLineCodeType }
     *     
     */
    public void setCSubLineCode(CSubLineCodeType value) {
        this.cSubLineCode = value;
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
