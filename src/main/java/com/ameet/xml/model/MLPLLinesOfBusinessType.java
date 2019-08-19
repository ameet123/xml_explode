//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.19 at 11:06:43 AM EDT 
//


package com.ameet.xml.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MLPLLinesOfBusinessType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MLPLLinesOfBusinessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aru" type="{}AruType" minOccurs="0"/>
 *         &lt;element name="AuditIncluded" type="{}AuditIncludedType" minOccurs="0"/>
 *         &lt;element name="CompositeRateIncluded" type="{}CompositeRateIncludedType" minOccurs="0"/>
 *         &lt;element name="CSelectedLobLimit" type="{}CSelectedLobLimitType" minOccurs="0"/>
 *         &lt;element name="CSelectedLobRetention" type="{}CSelectedLobRetentionType" minOccurs="0"/>
 *         &lt;element name="CSelectionLobFlag" type="{}CSelectionLobFlagType" minOccurs="0"/>
 *         &lt;element name="LobCode" type="{}LobCodeType"/>
 *         &lt;element name="LobDescription" type="{}LobDescriptionType"/>
 *         &lt;element name="LobIncluded" type="{}LobIncludedType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{}SortOrderType"/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MLPLLinesOfBusinessType", propOrder = {
        "aru",
        "auditIncluded",
        "compositeRateIncluded",
        "cSelectedLobLimit",
        "cSelectedLobRetention",
        "cSelectionLobFlag",
        "lobCode",
        "lobDescription",
        "lobIncluded",
        "sortOrder"
})
public class MLPLLinesOfBusinessType {

    @XmlElement(name = "Aru")
    protected AruType aru;
    @XmlElement(name = "AuditIncluded")
    protected AuditIncludedType auditIncluded;
    @XmlElement(name = "CompositeRateIncluded")
    protected CompositeRateIncludedType compositeRateIncluded;
    @XmlElement(name = "CSelectedLobLimit")
    protected CSelectedLobLimitType cSelectedLobLimit;
    @XmlElement(name = "CSelectedLobRetention")
    protected CSelectedLobRetentionType cSelectedLobRetention;
    @XmlElement(name = "CSelectionLobFlag")
    protected CSelectionLobFlagType cSelectionLobFlag;
    @XmlElement(name = "LobCode", required = true)
    protected LobCodeType lobCode;
    @XmlElement(name = "LobDescription", required = true)
    protected LobDescriptionType lobDescription;
    @XmlElement(name = "LobIncluded")
    protected LobIncludedType lobIncluded;
    @XmlElement(name = "SortOrder", required = true)
    protected SortOrderType sortOrder;
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
     * Gets the value of the aru property.
     *
     * @return possible object is
     * {@link AruType }
     */
    public AruType getAru() {
        return aru;
    }

    /**
     * Sets the value of the aru property.
     *
     * @param value allowed object is
     *              {@link AruType }
     */
    public void setAru(AruType value) {
        this.aru = value;
    }

    /**
     * Gets the value of the auditIncluded property.
     *
     * @return possible object is
     * {@link AuditIncludedType }
     */
    public AuditIncludedType getAuditIncluded() {
        return auditIncluded;
    }

    /**
     * Sets the value of the auditIncluded property.
     *
     * @param value allowed object is
     *              {@link AuditIncludedType }
     */
    public void setAuditIncluded(AuditIncludedType value) {
        this.auditIncluded = value;
    }

    /**
     * Gets the value of the compositeRateIncluded property.
     *
     * @return possible object is
     * {@link CompositeRateIncludedType }
     */
    public CompositeRateIncludedType getCompositeRateIncluded() {
        return compositeRateIncluded;
    }

    /**
     * Sets the value of the compositeRateIncluded property.
     *
     * @param value allowed object is
     *              {@link CompositeRateIncludedType }
     */
    public void setCompositeRateIncluded(CompositeRateIncludedType value) {
        this.compositeRateIncluded = value;
    }

    /**
     * Gets the value of the cSelectedLobLimit property.
     *
     * @return possible object is
     * {@link CSelectedLobLimitType }
     */
    public CSelectedLobLimitType getCSelectedLobLimit() {
        return cSelectedLobLimit;
    }

    /**
     * Sets the value of the cSelectedLobLimit property.
     *
     * @param value allowed object is
     *              {@link CSelectedLobLimitType }
     */
    public void setCSelectedLobLimit(CSelectedLobLimitType value) {
        this.cSelectedLobLimit = value;
    }

    /**
     * Gets the value of the cSelectedLobRetention property.
     *
     * @return possible object is
     * {@link CSelectedLobRetentionType }
     */
    public CSelectedLobRetentionType getCSelectedLobRetention() {
        return cSelectedLobRetention;
    }

    /**
     * Sets the value of the cSelectedLobRetention property.
     *
     * @param value allowed object is
     *              {@link CSelectedLobRetentionType }
     */
    public void setCSelectedLobRetention(CSelectedLobRetentionType value) {
        this.cSelectedLobRetention = value;
    }

    /**
     * Gets the value of the cSelectionLobFlag property.
     *
     * @return possible object is
     * {@link CSelectionLobFlagType }
     */
    public CSelectionLobFlagType getCSelectionLobFlag() {
        return cSelectionLobFlag;
    }

    /**
     * Sets the value of the cSelectionLobFlag property.
     *
     * @param value allowed object is
     *              {@link CSelectionLobFlagType }
     */
    public void setCSelectionLobFlag(CSelectionLobFlagType value) {
        this.cSelectionLobFlag = value;
    }

    /**
     * Gets the value of the lobCode property.
     *
     * @return possible object is
     * {@link LobCodeType }
     */
    public LobCodeType getLobCode() {
        return lobCode;
    }

    /**
     * Sets the value of the lobCode property.
     *
     * @param value allowed object is
     *              {@link LobCodeType }
     */
    public void setLobCode(LobCodeType value) {
        this.lobCode = value;
    }

    /**
     * Gets the value of the lobDescription property.
     *
     * @return possible object is
     * {@link LobDescriptionType }
     */
    public LobDescriptionType getLobDescription() {
        return lobDescription;
    }

    /**
     * Sets the value of the lobDescription property.
     *
     * @param value allowed object is
     *              {@link LobDescriptionType }
     */
    public void setLobDescription(LobDescriptionType value) {
        this.lobDescription = value;
    }

    /**
     * Gets the value of the lobIncluded property.
     *
     * @return possible object is
     * {@link LobIncludedType }
     */
    public LobIncludedType getLobIncluded() {
        return lobIncluded;
    }

    /**
     * Sets the value of the lobIncluded property.
     *
     * @param value allowed object is
     *              {@link LobIncludedType }
     */
    public void setLobIncluded(LobIncludedType value) {
        this.lobIncluded = value;
    }

    /**
     * Gets the value of the sortOrder property.
     *
     * @return possible object is
     * {@link SortOrderType }
     */
    public SortOrderType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     *
     * @param value allowed object is
     *              {@link SortOrderType }
     */
    public void setSortOrder(SortOrderType value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the dateCreated property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the entityReference property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityReference() {
        return entityReference;
    }

    /**
     * Sets the value of the entityReference property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityReference(String value) {
        this.entityReference = value;
    }

    /**
     * Gets the value of the entityStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityStatus(String value) {
        this.entityStatus = value;
    }

    /**
     * Gets the value of the entityType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the gid property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setGid(Integer value) {
        this.gid = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the refName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRefName() {
        return refName;
    }

    /**
     * Sets the value of the refName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRefName(String value) {
        this.refName = value;
    }

    /**
     * Gets the value of the refValue property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRefValue() {
        return refValue;
    }

    /**
     * Sets the value of the refValue property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRefValue(Integer value) {
        this.refValue = value;
    }

    /**
     * Gets the value of the userCreated property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserCreated() {
        return userCreated;
    }

    /**
     * Sets the value of the userCreated property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserCreated(String value) {
        this.userCreated = value;
    }

}
