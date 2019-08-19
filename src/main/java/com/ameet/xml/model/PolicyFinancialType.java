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
 * <p>Java class for PolicyFinancialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyFinancialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyReference" type="{}PolicyReferenceType"/>
 *         &lt;element name="StateCode" type="{}StateCodeType"/>
 *         &lt;element name="BillType" type="{}BillTypeType"/>
 *         &lt;element name="ValidPayOptionId" type="{}ValidPayOptionIdType"/>
 *         &lt;element name="BillCollectionMethodId" type="{}BillCollectionMethodIdType"/>
 *         &lt;element name="CCollectorMethodCode" type="{}CCollectorMethodCodeType"/>
 *         &lt;element name="ChangedPremium" type="{}ChangedPremiumType"/>
 *         &lt;element name="ChangedCommPremium" type="{}ChangedCommPremiumType"/>
 *         &lt;element name="FullTermPremium" type="{}FullTermPremiumType"/>
 *         &lt;element name="PayorType" type="{}PayorTypeType"/>
 *         &lt;element name="PayorId" type="{}PayorIdType"/>
 *         &lt;element name="PayorName" type="{}PayorNameType"/>
 *         &lt;element name="PayorAddress1" type="{}PayorAddress1Type"/>
 *         &lt;element name="PayorAddress2" type="{}PayorAddress2Type"/>
 *         &lt;element name="PayorCity" type="{}PayorCityType"/>
 *         &lt;element name="PayorState" type="{}PayorStateType"/>
 *         &lt;element name="PayorZip" type="{}PayorZipType"/>
 *         &lt;element name="PayorPhone" type="{}PayorPhoneType"/>
 *         &lt;element name="DateCreated" type="{}DateCreatedType"/>
 *         &lt;element name="UserCreated" type="{}UserCreatedType"/>
 *         &lt;element name="DateModified" type="{}DateModifiedType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyFinancialType", propOrder = {
    "policyReference",
    "stateCode",
    "billType",
    "validPayOptionId",
    "billCollectionMethodId",
    "cCollectorMethodCode",
    "changedPremium",
    "changedCommPremium",
    "fullTermPremium",
    "payorType",
    "payorId",
    "payorName",
    "payorAddress1",
    "payorAddress2",
    "payorCity",
    "payorState",
    "payorZip",
    "payorPhone",
    "dateCreated",
    "userCreated",
    "dateModified"
})
public class PolicyFinancialType {

    @XmlElement(name = "PolicyReference", required = true)
    protected PolicyReferenceType policyReference;
    @XmlElement(name = "StateCode", required = true)
    protected StateCodeType stateCode;
    @XmlElement(name = "BillType", required = true)
    protected BillTypeType billType;
    @XmlElement(name = "ValidPayOptionId", required = true)
    protected ValidPayOptionIdType validPayOptionId;
    @XmlElement(name = "BillCollectionMethodId", required = true)
    protected BillCollectionMethodIdType billCollectionMethodId;
    @XmlElement(name = "CCollectorMethodCode", required = true)
    protected CCollectorMethodCodeType cCollectorMethodCode;
    @XmlElement(name = "ChangedPremium", required = true)
    protected ChangedPremiumType changedPremium;
    @XmlElement(name = "ChangedCommPremium", required = true)
    protected ChangedCommPremiumType changedCommPremium;
    @XmlElement(name = "FullTermPremium", required = true)
    protected FullTermPremiumType fullTermPremium;
    @XmlElement(name = "PayorType", required = true)
    protected PayorTypeType payorType;
    @XmlElement(name = "PayorId", required = true)
    protected PayorIdType payorId;
    @XmlElement(name = "PayorName", required = true)
    protected PayorNameType payorName;
    @XmlElement(name = "PayorAddress1", required = true)
    protected PayorAddress1Type payorAddress1;
    @XmlElement(name = "PayorAddress2", required = true)
    protected PayorAddress2Type payorAddress2;
    @XmlElement(name = "PayorCity", required = true)
    protected PayorCityType payorCity;
    @XmlElement(name = "PayorState", required = true)
    protected PayorStateType payorState;
    @XmlElement(name = "PayorZip", required = true)
    protected PayorZipType payorZip;
    @XmlElement(name = "PayorPhone", required = true)
    protected PayorPhoneType payorPhone;
    @XmlElement(name = "DateCreated", required = true)
    protected DateCreatedType dateCreated;
    @XmlElement(name = "UserCreated", required = true)
    protected UserCreatedType userCreated;
    @XmlElement(name = "DateModified", required = true)
    protected DateModifiedType dateModified;

    /**
     * Gets the value of the policyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyReferenceType }
     *     
     */
    public PolicyReferenceType getPolicyReference() {
        return policyReference;
    }

    /**
     * Sets the value of the policyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyReferenceType }
     *     
     */
    public void setPolicyReference(PolicyReferenceType value) {
        this.policyReference = value;
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
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link BillTypeType }
     *     
     */
    public BillTypeType getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillTypeType }
     *     
     */
    public void setBillType(BillTypeType value) {
        this.billType = value;
    }

    /**
     * Gets the value of the validPayOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link ValidPayOptionIdType }
     *     
     */
    public ValidPayOptionIdType getValidPayOptionId() {
        return validPayOptionId;
    }

    /**
     * Sets the value of the validPayOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidPayOptionIdType }
     *     
     */
    public void setValidPayOptionId(ValidPayOptionIdType value) {
        this.validPayOptionId = value;
    }

    /**
     * Gets the value of the billCollectionMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link BillCollectionMethodIdType }
     *     
     */
    public BillCollectionMethodIdType getBillCollectionMethodId() {
        return billCollectionMethodId;
    }

    /**
     * Sets the value of the billCollectionMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillCollectionMethodIdType }
     *     
     */
    public void setBillCollectionMethodId(BillCollectionMethodIdType value) {
        this.billCollectionMethodId = value;
    }

    /**
     * Gets the value of the cCollectorMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CCollectorMethodCodeType }
     *     
     */
    public CCollectorMethodCodeType getCCollectorMethodCode() {
        return cCollectorMethodCode;
    }

    /**
     * Sets the value of the cCollectorMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCollectorMethodCodeType }
     *     
     */
    public void setCCollectorMethodCode(CCollectorMethodCodeType value) {
        this.cCollectorMethodCode = value;
    }

    /**
     * Gets the value of the changedPremium property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedPremiumType }
     *     
     */
    public ChangedPremiumType getChangedPremium() {
        return changedPremium;
    }

    /**
     * Sets the value of the changedPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedPremiumType }
     *     
     */
    public void setChangedPremium(ChangedPremiumType value) {
        this.changedPremium = value;
    }

    /**
     * Gets the value of the changedCommPremium property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedCommPremiumType }
     *     
     */
    public ChangedCommPremiumType getChangedCommPremium() {
        return changedCommPremium;
    }

    /**
     * Sets the value of the changedCommPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedCommPremiumType }
     *     
     */
    public void setChangedCommPremium(ChangedCommPremiumType value) {
        this.changedCommPremium = value;
    }

    /**
     * Gets the value of the fullTermPremium property.
     * 
     * @return
     *     possible object is
     *     {@link FullTermPremiumType }
     *     
     */
    public FullTermPremiumType getFullTermPremium() {
        return fullTermPremium;
    }

    /**
     * Sets the value of the fullTermPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTermPremiumType }
     *     
     */
    public void setFullTermPremium(FullTermPremiumType value) {
        this.fullTermPremium = value;
    }

    /**
     * Gets the value of the payorType property.
     * 
     * @return
     *     possible object is
     *     {@link PayorTypeType }
     *     
     */
    public PayorTypeType getPayorType() {
        return payorType;
    }

    /**
     * Sets the value of the payorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorTypeType }
     *     
     */
    public void setPayorType(PayorTypeType value) {
        this.payorType = value;
    }

    /**
     * Gets the value of the payorId property.
     * 
     * @return
     *     possible object is
     *     {@link PayorIdType }
     *     
     */
    public PayorIdType getPayorId() {
        return payorId;
    }

    /**
     * Sets the value of the payorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorIdType }
     *     
     */
    public void setPayorId(PayorIdType value) {
        this.payorId = value;
    }

    /**
     * Gets the value of the payorName property.
     * 
     * @return
     *     possible object is
     *     {@link PayorNameType }
     *     
     */
    public PayorNameType getPayorName() {
        return payorName;
    }

    /**
     * Sets the value of the payorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorNameType }
     *     
     */
    public void setPayorName(PayorNameType value) {
        this.payorName = value;
    }

    /**
     * Gets the value of the payorAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link PayorAddress1Type }
     *     
     */
    public PayorAddress1Type getPayorAddress1() {
        return payorAddress1;
    }

    /**
     * Sets the value of the payorAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorAddress1Type }
     *     
     */
    public void setPayorAddress1(PayorAddress1Type value) {
        this.payorAddress1 = value;
    }

    /**
     * Gets the value of the payorAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link PayorAddress2Type }
     *     
     */
    public PayorAddress2Type getPayorAddress2() {
        return payorAddress2;
    }

    /**
     * Sets the value of the payorAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorAddress2Type }
     *     
     */
    public void setPayorAddress2(PayorAddress2Type value) {
        this.payorAddress2 = value;
    }

    /**
     * Gets the value of the payorCity property.
     * 
     * @return
     *     possible object is
     *     {@link PayorCityType }
     *     
     */
    public PayorCityType getPayorCity() {
        return payorCity;
    }

    /**
     * Sets the value of the payorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorCityType }
     *     
     */
    public void setPayorCity(PayorCityType value) {
        this.payorCity = value;
    }

    /**
     * Gets the value of the payorState property.
     * 
     * @return
     *     possible object is
     *     {@link PayorStateType }
     *     
     */
    public PayorStateType getPayorState() {
        return payorState;
    }

    /**
     * Sets the value of the payorState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorStateType }
     *     
     */
    public void setPayorState(PayorStateType value) {
        this.payorState = value;
    }

    /**
     * Gets the value of the payorZip property.
     * 
     * @return
     *     possible object is
     *     {@link PayorZipType }
     *     
     */
    public PayorZipType getPayorZip() {
        return payorZip;
    }

    /**
     * Sets the value of the payorZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorZipType }
     *     
     */
    public void setPayorZip(PayorZipType value) {
        this.payorZip = value;
    }

    /**
     * Gets the value of the payorPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PayorPhoneType }
     *     
     */
    public PayorPhoneType getPayorPhone() {
        return payorPhone;
    }

    /**
     * Sets the value of the payorPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayorPhoneType }
     *     
     */
    public void setPayorPhone(PayorPhoneType value) {
        this.payorPhone = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link DateCreatedType }
     *     
     */
    public DateCreatedType getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCreatedType }
     *     
     */
    public void setDateCreated(DateCreatedType value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the userCreated property.
     * 
     * @return
     *     possible object is
     *     {@link UserCreatedType }
     *     
     */
    public UserCreatedType getUserCreated() {
        return userCreated;
    }

    /**
     * Sets the value of the userCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCreatedType }
     *     
     */
    public void setUserCreated(UserCreatedType value) {
        this.userCreated = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link DateModifiedType }
     *     
     */
    public DateModifiedType getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateModifiedType }
     *     
     */
    public void setDateModified(DateModifiedType value) {
        this.dateModified = value;
    }

}