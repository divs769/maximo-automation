
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_CIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_CIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTCINUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSETLOCORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSETLOCSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="BUSINESSOWNERPERSONID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CCIDISGUID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CCILINKBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CCILINKDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CCILINKMETHOD" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="CCILINKRULENAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CCIPERSONGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CIID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="CILOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CINAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCIMANAGEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCIOPERATINGENV" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCISUPPORTGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDSERVCONTPLAN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITEMNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITEMSETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PERSONID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCCIIMPACT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGCWNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGCWORG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RFC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SERVICE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SERVICEGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHIFTNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}ObjectStructurePropertyGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXISWOCHANGE_CIType", propOrder = {
    "actcinum",
    "assetlocorgid",
    "assetlocsiteid",
    "assetnum",
    "businessownerpersonid",
    "calnum",
    "ccidisguid",
    "ccilinkby",
    "ccilinkdate",
    "ccilinkmethod",
    "ccilinkrulename",
    "ccipersongroup",
    "changeby",
    "changedate",
    "ciid",
    "cilocation",
    "ciname",
    "cinum",
    "classstructureid",
    "description",
    "externalrefid",
    "itdcimanagedby",
    "itdcioperatingenv",
    "itdcisupportgroup",
    "itdservcontplan",
    "itemnum",
    "itemsetid",
    "location",
    "personid",
    "pluspcustomer",
    "pmcciimpact",
    "pmchgcwnum",
    "pmchgcworg",
    "rfc",
    "service",
    "servicegroup",
    "shiftnum",
    "status",
    "statusdate"
})
public class MXISWOCHANGECIType {

    @XmlElement(name = "ACTCINUM")
    protected MXStringType actcinum;
    @XmlElement(name = "ASSETLOCORGID")
    protected MXStringType assetlocorgid;
    @XmlElement(name = "ASSETLOCSITEID")
    protected MXStringType assetlocsiteid;
    @XmlElement(name = "ASSETNUM")
    protected MXStringType assetnum;
    @XmlElement(name = "BUSINESSOWNERPERSONID")
    protected MXStringType businessownerpersonid;
    @XmlElement(name = "CALNUM")
    protected MXStringType calnum;
    @XmlElement(name = "CCIDISGUID")
    protected MXStringType ccidisguid;
    @XmlElement(name = "CCILINKBY")
    protected MXStringType ccilinkby;
    @XmlElementRef(name = "CCILINKDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> ccilinkdate;
    @XmlElement(name = "CCILINKMETHOD")
    protected MXDomainType ccilinkmethod;
    @XmlElement(name = "CCILINKRULENAME")
    protected MXStringType ccilinkrulename;
    @XmlElement(name = "CCIPERSONGROUP")
    protected MXStringType ccipersongroup;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElementRef(name = "CIID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> ciid;
    @XmlElement(name = "CILOCATION")
    protected MXStringType cilocation;
    @XmlElement(name = "CINAME")
    protected MXStringType ciname;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "EXTERNALREFID")
    protected MXStringType externalrefid;
    @XmlElement(name = "ITDCIMANAGEDBY")
    protected MXStringType itdcimanagedby;
    @XmlElement(name = "ITDCIOPERATINGENV")
    protected MXStringType itdcioperatingenv;
    @XmlElement(name = "ITDCISUPPORTGROUP")
    protected MXStringType itdcisupportgroup;
    @XmlElement(name = "ITDSERVCONTPLAN")
    protected MXBooleanType itdservcontplan;
    @XmlElement(name = "ITEMNUM")
    protected MXStringType itemnum;
    @XmlElement(name = "ITEMSETID")
    protected MXStringType itemsetid;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElement(name = "PERSONID")
    protected MXStringType personid;
    @XmlElement(name = "PLUSPCUSTOMER")
    protected MXStringType pluspcustomer;
    @XmlElementRef(name = "PMCCIIMPACT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcciimpact;
    @XmlElement(name = "PMCHGCWNUM")
    protected MXStringType pmchgcwnum;
    @XmlElement(name = "PMCHGCWORG")
    protected MXStringType pmchgcworg;
    @XmlElement(name = "RFC")
    protected MXStringType rfc;
    @XmlElement(name = "SERVICE")
    protected MXStringType service;
    @XmlElement(name = "SERVICEGROUP")
    protected MXStringType servicegroup;
    @XmlElement(name = "SHIFTNUM")
    protected MXStringType shiftnum;
    @XmlElement(name = "STATUS")
    protected MXDomainType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the actcinum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getACTCINUM() {
        return actcinum;
    }

    /**
     * Sets the value of the actcinum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setACTCINUM(MXStringType value) {
        this.actcinum = value;
    }

    /**
     * Gets the value of the assetlocorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSETLOCORGID() {
        return assetlocorgid;
    }

    /**
     * Sets the value of the assetlocorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSETLOCORGID(MXStringType value) {
        this.assetlocorgid = value;
    }

    /**
     * Gets the value of the assetlocsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSETLOCSITEID() {
        return assetlocsiteid;
    }

    /**
     * Sets the value of the assetlocsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSETLOCSITEID(MXStringType value) {
        this.assetlocsiteid = value;
    }

    /**
     * Gets the value of the assetnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSETNUM() {
        return assetnum;
    }

    /**
     * Sets the value of the assetnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSETNUM(MXStringType value) {
        this.assetnum = value;
    }

    /**
     * Gets the value of the businessownerpersonid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBUSINESSOWNERPERSONID() {
        return businessownerpersonid;
    }

    /**
     * Sets the value of the businessownerpersonid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBUSINESSOWNERPERSONID(MXStringType value) {
        this.businessownerpersonid = value;
    }

    /**
     * Gets the value of the calnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALNUM() {
        return calnum;
    }

    /**
     * Sets the value of the calnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALNUM(MXStringType value) {
        this.calnum = value;
    }

    /**
     * Gets the value of the ccidisguid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCCIDISGUID() {
        return ccidisguid;
    }

    /**
     * Sets the value of the ccidisguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCCIDISGUID(MXStringType value) {
        this.ccidisguid = value;
    }

    /**
     * Gets the value of the ccilinkby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCCILINKBY() {
        return ccilinkby;
    }

    /**
     * Sets the value of the ccilinkby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCCILINKBY(MXStringType value) {
        this.ccilinkby = value;
    }

    /**
     * Gets the value of the ccilinkdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getCCILINKDATE() {
        return ccilinkdate;
    }

    /**
     * Sets the value of the ccilinkdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setCCILINKDATE(JAXBElement<MXDateTimeType> value) {
        this.ccilinkdate = value;
    }

    /**
     * Gets the value of the ccilinkmethod property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getCCILINKMETHOD() {
        return ccilinkmethod;
    }

    /**
     * Sets the value of the ccilinkmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setCCILINKMETHOD(MXDomainType value) {
        this.ccilinkmethod = value;
    }

    /**
     * Gets the value of the ccilinkrulename property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCCILINKRULENAME() {
        return ccilinkrulename;
    }

    /**
     * Sets the value of the ccilinkrulename property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCCILINKRULENAME(MXStringType value) {
        this.ccilinkrulename = value;
    }

    /**
     * Gets the value of the ccipersongroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCCIPERSONGROUP() {
        return ccipersongroup;
    }

    /**
     * Sets the value of the ccipersongroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCCIPERSONGROUP(MXStringType value) {
        this.ccipersongroup = value;
    }

    /**
     * Gets the value of the changeby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCHANGEBY() {
        return changeby;
    }

    /**
     * Sets the value of the changeby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCHANGEBY(MXStringType value) {
        this.changeby = value;
    }

    /**
     * Gets the value of the changedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getCHANGEDATE() {
        return changedate;
    }

    /**
     * Sets the value of the changedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setCHANGEDATE(JAXBElement<MXDateTimeType> value) {
        this.changedate = value;
    }

    /**
     * Gets the value of the ciid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getCIID() {
        return ciid;
    }

    /**
     * Sets the value of the ciid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setCIID(JAXBElement<MXLongType> value) {
        this.ciid = value;
    }

    /**
     * Gets the value of the cilocation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCILOCATION() {
        return cilocation;
    }

    /**
     * Sets the value of the cilocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCILOCATION(MXStringType value) {
        this.cilocation = value;
    }

    /**
     * Gets the value of the ciname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCINAME() {
        return ciname;
    }

    /**
     * Sets the value of the ciname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCINAME(MXStringType value) {
        this.ciname = value;
    }

    /**
     * Gets the value of the cinum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCINUM() {
        return cinum;
    }

    /**
     * Sets the value of the cinum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCINUM(MXStringType value) {
        this.cinum = value;
    }

    /**
     * Gets the value of the classstructureid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCLASSSTRUCTUREID() {
        return classstructureid;
    }

    /**
     * Sets the value of the classstructureid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCLASSSTRUCTUREID(MXStringType value) {
        this.classstructureid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDESCRIPTION(MXStringType value) {
        this.description = value;
    }

    /**
     * Gets the value of the externalrefid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEXTERNALREFID() {
        return externalrefid;
    }

    /**
     * Sets the value of the externalrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEXTERNALREFID(MXStringType value) {
        this.externalrefid = value;
    }

    /**
     * Gets the value of the itdcimanagedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCIMANAGEDBY() {
        return itdcimanagedby;
    }

    /**
     * Sets the value of the itdcimanagedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCIMANAGEDBY(MXStringType value) {
        this.itdcimanagedby = value;
    }

    /**
     * Gets the value of the itdcioperatingenv property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCIOPERATINGENV() {
        return itdcioperatingenv;
    }

    /**
     * Sets the value of the itdcioperatingenv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCIOPERATINGENV(MXStringType value) {
        this.itdcioperatingenv = value;
    }

    /**
     * Gets the value of the itdcisupportgroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCISUPPORTGROUP() {
        return itdcisupportgroup;
    }

    /**
     * Sets the value of the itdcisupportgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCISUPPORTGROUP(MXStringType value) {
        this.itdcisupportgroup = value;
    }

    /**
     * Gets the value of the itdservcontplan property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getITDSERVCONTPLAN() {
        return itdservcontplan;
    }

    /**
     * Sets the value of the itdservcontplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setITDSERVCONTPLAN(MXBooleanType value) {
        this.itdservcontplan = value;
    }

    /**
     * Gets the value of the itemnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITEMNUM() {
        return itemnum;
    }

    /**
     * Sets the value of the itemnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITEMNUM(MXStringType value) {
        this.itemnum = value;
    }

    /**
     * Gets the value of the itemsetid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITEMSETID() {
        return itemsetid;
    }

    /**
     * Sets the value of the itemsetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITEMSETID(MXStringType value) {
        this.itemsetid = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLOCATION(MXStringType value) {
        this.location = value;
    }

    /**
     * Gets the value of the personid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPERSONID() {
        return personid;
    }

    /**
     * Sets the value of the personid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPERSONID(MXStringType value) {
        this.personid = value;
    }

    /**
     * Gets the value of the pluspcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCUSTOMER() {
        return pluspcustomer;
    }

    /**
     * Sets the value of the pluspcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCUSTOMER(MXStringType value) {
        this.pluspcustomer = value;
    }

    /**
     * Gets the value of the pmcciimpact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCCIIMPACT() {
        return pmcciimpact;
    }

    /**
     * Sets the value of the pmcciimpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCCIIMPACT(JAXBElement<MXLongType> value) {
        this.pmcciimpact = value;
    }

    /**
     * Gets the value of the pmchgcwnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGCWNUM() {
        return pmchgcwnum;
    }

    /**
     * Sets the value of the pmchgcwnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGCWNUM(MXStringType value) {
        this.pmchgcwnum = value;
    }

    /**
     * Gets the value of the pmchgcworg property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGCWORG() {
        return pmchgcworg;
    }

    /**
     * Sets the value of the pmchgcworg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGCWORG(MXStringType value) {
        this.pmchgcworg = value;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRFC(MXStringType value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERVICE() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERVICE(MXStringType value) {
        this.service = value;
    }

    /**
     * Gets the value of the servicegroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERVICEGROUP() {
        return servicegroup;
    }

    /**
     * Sets the value of the servicegroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERVICEGROUP(MXStringType value) {
        this.servicegroup = value;
    }

    /**
     * Gets the value of the shiftnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSHIFTNUM() {
        return shiftnum;
    }

    /**
     * Sets the value of the shiftnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSHIFTNUM(MXStringType value) {
        this.shiftnum = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setSTATUS(MXDomainType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSTATUSDATE() {
        return statusdate;
    }

    /**
     * Sets the value of the statusdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSTATUSDATE(JAXBElement<MXDateTimeType> value) {
        this.statusdate = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingActionType }
     *     
     */
    public ProcessingActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingActionType }
     *     
     */
    public void setAction(ProcessingActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the deleteForInsert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteForInsert() {
        return deleteForInsert;
    }

    /**
     * Sets the value of the deleteForInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteForInsert(String value) {
        this.deleteForInsert = value;
    }

}
