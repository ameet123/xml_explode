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
 * <p>Java class for PRODUCER_PHYSICAL_ADDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCER_PHYSICAL_ADDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{}AddressTypeType"/>
 *         &lt;element name="City" type="{}CityType"/>
 *         &lt;element name="Country" type="{}CountryType"/>
 *         &lt;element name="CountryCode" type="{}CountryCodeType"/>
 *         &lt;element name="County" type="{}CountyType"/>
 *         &lt;element name="CIsProdSelected" type="{}CIsProdSelectedType"/>
 *         &lt;element name="CSkipAddVerify" type="{}CSkipAddVerifyType"/>
 *         &lt;element name="Line1" type="{}Line1Type"/>
 *         &lt;element name="Line2" type="{}Line2Type"/>
 *         &lt;element name="StateCode" type="{}StateCodeType"/>
 *         &lt;element name="SysExposureIsUnits" type="{}SysExposureIsUnitsType"/>
 *         &lt;element name="ZipCode" type="{}ZipCodeType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="EntityReference" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "PRODUCER_PHYSICAL_ADDType", propOrder = {
    "addressType",
    "city",
    "country",
    "countryCode",
    "county",
    "cIsProdSelected",
    "cSkipAddVerify",
    "line1",
    "line2",
    "stateCode",
    "sysExposureIsUnits",
    "zipCode"
})
public class PRODUCERPHYSICALADDType {

    @XmlElement(name = "AddressType", required = true)
    protected AddressTypeType addressType;
    @XmlElement(name = "City", required = true)
    protected CityType city;
    @XmlElement(name = "Country", required = true)
    protected CountryType country;
    @XmlElement(name = "CountryCode", required = true)
    protected CountryCodeType countryCode;
    @XmlElement(name = "County", required = true)
    protected CountyType county;
    @XmlElement(name = "CIsProdSelected", required = true)
    protected CIsProdSelectedType cIsProdSelected;
    @XmlElement(name = "CSkipAddVerify", required = true)
    protected CSkipAddVerifyType cSkipAddVerify;
    @XmlElement(name = "Line1", required = true)
    protected Line1Type line1;
    @XmlElement(name = "Line2", required = true)
    protected Line2Type line2;
    @XmlElement(name = "StateCode", required = true)
    protected StateCodeType stateCode;
    @XmlElement(name = "SysExposureIsUnits", required = true)
    protected SysExposureIsUnitsType sysExposureIsUnits;
    @XmlElement(name = "ZipCode", required = true)
    protected ZipCodeType zipCode;
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
    protected Integer refValue;
    @XmlAttribute(name = "UserCreated")
    protected String userCreated;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeType }
     *     
     */
    public AddressTypeType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeType }
     *     
     */
    public void setAddressType(AddressTypeType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link CountyType }
     *     
     */
    public CountyType getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyType }
     *     
     */
    public void setCounty(CountyType value) {
        this.county = value;
    }

    /**
     * Gets the value of the cIsProdSelected property.
     * 
     * @return
     *     possible object is
     *     {@link CIsProdSelectedType }
     *     
     */
    public CIsProdSelectedType getCIsProdSelected() {
        return cIsProdSelected;
    }

    /**
     * Sets the value of the cIsProdSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIsProdSelectedType }
     *     
     */
    public void setCIsProdSelected(CIsProdSelectedType value) {
        this.cIsProdSelected = value;
    }

    /**
     * Gets the value of the cSkipAddVerify property.
     * 
     * @return
     *     possible object is
     *     {@link CSkipAddVerifyType }
     *     
     */
    public CSkipAddVerifyType getCSkipAddVerify() {
        return cSkipAddVerify;
    }

    /**
     * Sets the value of the cSkipAddVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSkipAddVerifyType }
     *     
     */
    public void setCSkipAddVerify(CSkipAddVerifyType value) {
        this.cSkipAddVerify = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link Line1Type }
     *     
     */
    public Line1Type getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line1Type }
     *     
     */
    public void setLine1(Line1Type value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link Line2Type }
     *     
     */
    public Line2Type getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line2Type }
     *     
     */
    public void setLine2(Line2Type value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setStateCode(StateCodeType value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the sysExposureIsUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SysExposureIsUnitsType }
     *     
     */
    public SysExposureIsUnitsType getSysExposureIsUnits() {
        return sysExposureIsUnits;
    }

    /**
     * Sets the value of the sysExposureIsUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysExposureIsUnitsType }
     *     
     */
    public void setSysExposureIsUnits(SysExposureIsUnitsType value) {
        this.sysExposureIsUnits = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link ZipCodeType }
     *     
     */
    public ZipCodeType getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipCodeType }
     *     
     */
    public void setZipCode(ZipCodeType value) {
        this.zipCode = value;
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
