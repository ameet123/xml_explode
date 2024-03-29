//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 12:22:48 PM EDT 
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
 * <p>Java class for MDRiskModifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDRiskModifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCharecteristicTypeUk" type="{}CCharecteristicTypeUkType"/>
 *         &lt;element name="CCharMinMaxTwisty" type="{}CCharMinMaxTwistyType"/>
 *         &lt;element name="CDisplayTotal" type="{}CDisplayTotalType"/>
 *         &lt;element name="CHeader" type="{}CHeaderType"/>
 *         &lt;element name="CLobCode" type="{}CLobCodeType"/>
 *         &lt;element name="CLobPaperType" type="{}CLobPaperTypeType"/>
 *         &lt;element name="CRiskCharDateReset" type="{}CRiskCharDateResetType"/>
 *         &lt;element name="CTotal" type="{}CTotalType"/>
 *         &lt;element name="CharactersticsMinMaxDetailsList" type="{}CharactersticsMinMaxDetailsListType"/>
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
@XmlType(name = "MDRiskModifierType", propOrder = {
    "cCharecteristicTypeUk",
    "cCharMinMaxTwisty",
    "cDisplayTotal",
    "cHeader",
    "cLobCode",
    "cLobPaperType",
    "cRiskCharDateReset",
    "cTotal",
    "charactersticsMinMaxDetailsList"
})
public class MDRiskModifierType {

    @XmlElement(name = "CCharecteristicTypeUk", required = true)
    protected CCharecteristicTypeUkType cCharecteristicTypeUk;
    @XmlElement(name = "CCharMinMaxTwisty", required = true)
    protected CCharMinMaxTwistyType cCharMinMaxTwisty;
    @XmlElement(name = "CDisplayTotal", required = true)
    protected CDisplayTotalType cDisplayTotal;
    @XmlElement(name = "CHeader", required = true)
    protected CHeaderType cHeader;
    @XmlElement(name = "CLobCode", required = true)
    protected CLobCodeType cLobCode;
    @XmlElement(name = "CLobPaperType", required = true)
    protected CLobPaperTypeType cLobPaperType;
    @XmlElement(name = "CRiskCharDateReset", required = true)
    protected CRiskCharDateResetType cRiskCharDateReset;
    @XmlElement(name = "CTotal", required = true)
    protected CTotalType cTotal;
    @XmlElement(name = "CharactersticsMinMaxDetailsList", required = true)
    protected CharactersticsMinMaxDetailsListType charactersticsMinMaxDetailsList;
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
     * Gets the value of the cCharecteristicTypeUk property.
     * 
     * @return
     *     possible object is
     *     {@link CCharecteristicTypeUkType }
     *     
     */
    public CCharecteristicTypeUkType getCCharecteristicTypeUk() {
        return cCharecteristicTypeUk;
    }

    /**
     * Sets the value of the cCharecteristicTypeUk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCharecteristicTypeUkType }
     *     
     */
    public void setCCharecteristicTypeUk(CCharecteristicTypeUkType value) {
        this.cCharecteristicTypeUk = value;
    }

    /**
     * Gets the value of the cCharMinMaxTwisty property.
     * 
     * @return
     *     possible object is
     *     {@link CCharMinMaxTwistyType }
     *     
     */
    public CCharMinMaxTwistyType getCCharMinMaxTwisty() {
        return cCharMinMaxTwisty;
    }

    /**
     * Sets the value of the cCharMinMaxTwisty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCharMinMaxTwistyType }
     *     
     */
    public void setCCharMinMaxTwisty(CCharMinMaxTwistyType value) {
        this.cCharMinMaxTwisty = value;
    }

    /**
     * Gets the value of the cDisplayTotal property.
     * 
     * @return
     *     possible object is
     *     {@link CDisplayTotalType }
     *     
     */
    public CDisplayTotalType getCDisplayTotal() {
        return cDisplayTotal;
    }

    /**
     * Sets the value of the cDisplayTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDisplayTotalType }
     *     
     */
    public void setCDisplayTotal(CDisplayTotalType value) {
        this.cDisplayTotal = value;
    }

    /**
     * Gets the value of the cHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CHeaderType }
     *     
     */
    public CHeaderType getCHeader() {
        return cHeader;
    }

    /**
     * Sets the value of the cHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHeaderType }
     *     
     */
    public void setCHeader(CHeaderType value) {
        this.cHeader = value;
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
     * Gets the value of the cLobPaperType property.
     * 
     * @return
     *     possible object is
     *     {@link CLobPaperTypeType }
     *     
     */
    public CLobPaperTypeType getCLobPaperType() {
        return cLobPaperType;
    }

    /**
     * Sets the value of the cLobPaperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLobPaperTypeType }
     *     
     */
    public void setCLobPaperType(CLobPaperTypeType value) {
        this.cLobPaperType = value;
    }

    /**
     * Gets the value of the cRiskCharDateReset property.
     * 
     * @return
     *     possible object is
     *     {@link CRiskCharDateResetType }
     *     
     */
    public CRiskCharDateResetType getCRiskCharDateReset() {
        return cRiskCharDateReset;
    }

    /**
     * Sets the value of the cRiskCharDateReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRiskCharDateResetType }
     *     
     */
    public void setCRiskCharDateReset(CRiskCharDateResetType value) {
        this.cRiskCharDateReset = value;
    }

    /**
     * Gets the value of the cTotal property.
     * 
     * @return
     *     possible object is
     *     {@link CTotalType }
     *     
     */
    public CTotalType getCTotal() {
        return cTotal;
    }

    /**
     * Sets the value of the cTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTotalType }
     *     
     */
    public void setCTotal(CTotalType value) {
        this.cTotal = value;
    }

    /**
     * Gets the value of the charactersticsMinMaxDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link CharactersticsMinMaxDetailsListType }
     *     
     */
    public CharactersticsMinMaxDetailsListType getCharactersticsMinMaxDetailsList() {
        return charactersticsMinMaxDetailsList;
    }

    /**
     * Sets the value of the charactersticsMinMaxDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharactersticsMinMaxDetailsListType }
     *     
     */
    public void setCharactersticsMinMaxDetailsList(CharactersticsMinMaxDetailsListType value) {
        this.charactersticsMinMaxDetailsList = value;
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
