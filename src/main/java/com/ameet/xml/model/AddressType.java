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
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{}AddressTypeType"/>
 *         &lt;element name="City" type="{}CityType"/>
 *         &lt;element name="Country" type="{}CountryType"/>
 *         &lt;element name="CountryCode" type="{}CountryCodeType"/>
 *         &lt;element name="County" type="{}CountyType"/>
 *         &lt;element name="CAddressStatus" type="{}CAddressStatusType" minOccurs="0"/>
 *         &lt;element name="CInvalidAdrRsn" type="{}CInvalidAdrRsnType" minOccurs="0"/>
 *         &lt;element name="CSkipAddVerify" type="{}CSkipAddVerifyType"/>
 *         &lt;element name="CStdCity" type="{}CStdCityType" minOccurs="0"/>
 *         &lt;element name="CStdCountry" type="{}CStdCountryType" minOccurs="0"/>
 *         &lt;element name="CStdLine1" type="{}CStdLine1Type" minOccurs="0"/>
 *         &lt;element name="CStdLine2" type="{}CStdLine2Type" minOccurs="0"/>
 *         &lt;element name="CStdStateCode" type="{}CStdStateCodeType" minOccurs="0"/>
 *         &lt;element name="CStdZipCode" type="{}CStdZipCodeType" minOccurs="0"/>
 *         &lt;element name="Line1" type="{}Line1Type"/>
 *         &lt;element name="Line2" type="{}Line2Type"/>
 *         &lt;element name="MasterRecordGid" type="{}MasterRecordGidType" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{}StateCodeType"/>
 *         &lt;element name="StateDesc" type="{}StateDescType"/>
 *         &lt;element name="SysExposureIsUnits" type="{}SysExposureIsUnitsType"/>
 *         &lt;element name="ZipCode" type="{}ZipCodeType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="DateModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="EntityReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Gid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RefName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RefValue" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UserCreated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserModified" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressType",
    "city",
    "country",
    "countryCode",
    "county",
    "cAddressStatus",
    "cInvalidAdrRsn",
    "cSkipAddVerify",
    "cStdCity",
    "cStdCountry",
    "cStdLine1",
    "cStdLine2",
    "cStdStateCode",
    "cStdZipCode",
    "line1",
    "line2",
    "masterRecordGid",
    "stateCode",
    "stateDesc",
    "sysExposureIsUnits",
    "zipCode"
})
public class AddressType {

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
    @XmlElement(name = "CAddressStatus")
    protected CAddressStatusType cAddressStatus;
    @XmlElement(name = "CInvalidAdrRsn")
    protected CInvalidAdrRsnType cInvalidAdrRsn;
    @XmlElement(name = "CSkipAddVerify", required = true)
    protected CSkipAddVerifyType cSkipAddVerify;
    @XmlElement(name = "CStdCity")
    protected CStdCityType cStdCity;
    @XmlElement(name = "CStdCountry")
    protected CStdCountryType cStdCountry;
    @XmlElement(name = "CStdLine1")
    protected CStdLine1Type cStdLine1;
    @XmlElement(name = "CStdLine2")
    protected CStdLine2Type cStdLine2;
    @XmlElement(name = "CStdStateCode")
    protected CStdStateCodeType cStdStateCode;
    @XmlElement(name = "CStdZipCode")
    protected CStdZipCodeType cStdZipCode;
    @XmlElement(name = "Line1", required = true)
    protected Line1Type line1;
    @XmlElement(name = "Line2", required = true)
    protected Line2Type line2;
    @XmlElement(name = "MasterRecordGid")
    protected MasterRecordGidType masterRecordGid;
    @XmlElement(name = "StateCode", required = true)
    protected StateCodeType stateCode;
    @XmlElement(name = "StateDesc", required = true)
    protected StateDescType stateDesc;
    @XmlElement(name = "SysExposureIsUnits", required = true)
    protected SysExposureIsUnitsType sysExposureIsUnits;
    @XmlElement(name = "ZipCode", required = true)
    protected ZipCodeType zipCode;
    @XmlAttribute(name = "DateCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "DateModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateModified;
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
    @XmlAttribute(name = "UserModified")
    protected String userModified;

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
     * Gets the value of the cAddressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CAddressStatusType }
     *     
     */
    public CAddressStatusType getCAddressStatus() {
        return cAddressStatus;
    }

    /**
     * Sets the value of the cAddressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAddressStatusType }
     *     
     */
    public void setCAddressStatus(CAddressStatusType value) {
        this.cAddressStatus = value;
    }

    /**
     * Gets the value of the cInvalidAdrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CInvalidAdrRsnType }
     *     
     */
    public CInvalidAdrRsnType getCInvalidAdrRsn() {
        return cInvalidAdrRsn;
    }

    /**
     * Sets the value of the cInvalidAdrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInvalidAdrRsnType }
     *     
     */
    public void setCInvalidAdrRsn(CInvalidAdrRsnType value) {
        this.cInvalidAdrRsn = value;
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
     * Gets the value of the cStdCity property.
     * 
     * @return
     *     possible object is
     *     {@link CStdCityType }
     *     
     */
    public CStdCityType getCStdCity() {
        return cStdCity;
    }

    /**
     * Sets the value of the cStdCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CStdCityType }
     *     
     */
    public void setCStdCity(CStdCityType value) {
        this.cStdCity = value;
    }

    /**
     * Gets the value of the cStdCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CStdCountryType }
     *     
     */
    public CStdCountryType getCStdCountry() {
        return cStdCountry;
    }

    /**
     * Sets the value of the cStdCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CStdCountryType }
     *     
     */
    public void setCStdCountry(CStdCountryType value) {
        this.cStdCountry = value;
    }

    /**
     * Gets the value of the cStdLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link CStdLine1Type }
     *     
     */
    public CStdLine1Type getCStdLine1() {
        return cStdLine1;
    }

    /**
     * Sets the value of the cStdLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CStdLine1Type }
     *     
     */
    public void setCStdLine1(CStdLine1Type value) {
        this.cStdLine1 = value;
    }

    /**
     * Gets the value of the cStdLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link CStdLine2Type }
     *     
     */
    public CStdLine2Type getCStdLine2() {
        return cStdLine2;
    }

    /**
     * Sets the value of the cStdLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CStdLine2Type }
     *     
     */
    public void setCStdLine2(CStdLine2Type value) {
        this.cStdLine2 = value;
    }

    /**
     * Gets the value of the cStdStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link CStdStateCodeType }
     *     
     */
    public CStdStateCodeType getCStdStateCode() {
        return cStdStateCode;
    }

    /**
     * Sets the value of the cStdStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CStdStateCodeType }
     *     
     */
    public void setCStdStateCode(CStdStateCodeType value) {
        this.cStdStateCode = value;
    }

    /**
     * Gets the value of the cStdZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link CStdZipCodeType }
     *     
     */
    public CStdZipCodeType getCStdZipCode() {
        return cStdZipCode;
    }

    /**
     * Sets the value of the cStdZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CStdZipCodeType }
     *     
     */
    public void setCStdZipCode(CStdZipCodeType value) {
        this.cStdZipCode = value;
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
     * Gets the value of the masterRecordGid property.
     * 
     * @return
     *     possible object is
     *     {@link MasterRecordGidType }
     *     
     */
    public MasterRecordGidType getMasterRecordGid() {
        return masterRecordGid;
    }

    /**
     * Sets the value of the masterRecordGid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterRecordGidType }
     *     
     */
    public void setMasterRecordGid(MasterRecordGidType value) {
        this.masterRecordGid = value;
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
     * Gets the value of the stateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StateDescType }
     *     
     */
    public StateDescType getStateDesc() {
        return stateDesc;
    }

    /**
     * Sets the value of the stateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateDescType }
     *     
     */
    public void setStateDesc(StateDescType value) {
        this.stateDesc = value;
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
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateModified(XMLGregorianCalendar value) {
        this.dateModified = value;
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

    /**
     * Gets the value of the userModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserModified() {
        return userModified;
    }

    /**
     * Sets the value of the userModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserModified(String value) {
        this.userModified = value;
    }

}