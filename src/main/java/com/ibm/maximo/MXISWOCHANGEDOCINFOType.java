
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_DOCINFOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_DOCINFOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPLICATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CONTENTUID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DMSNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DOCLOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DOCUMENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PRINTTHRULINKDFLT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="REVISION" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="SHOW" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="URLNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM4" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM5" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="USEDEFAULTFILEPATH" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_DOCINFOType", propOrder = {
    "application",
    "changeby",
    "changedate",
    "contentuid",
    "createby",
    "createdate",
    "description",
    "dmsname",
    "doclocation",
    "document",
    "printthrulinkdflt",
    "revision",
    "show",
    "status",
    "statusdate",
    "urlname",
    "urlparam1",
    "urlparam2",
    "urlparam3",
    "urlparam4",
    "urlparam5",
    "urltype",
    "usedefaultfilepath"
})
public class MXISWOCHANGEDOCINFOType {

    @XmlElement(name = "APPLICATION")
    protected MXStringType application;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "CONTENTUID")
    protected MXStringType contentuid;
    @XmlElement(name = "CREATEBY")
    protected MXStringType createby;
    @XmlElementRef(name = "CREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> createdate;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DMSNAME")
    protected MXStringType dmsname;
    @XmlElement(name = "DOCLOCATION")
    protected MXStringType doclocation;
    @XmlElement(name = "DOCUMENT")
    protected MXStringType document;
    @XmlElement(name = "PRINTTHRULINKDFLT")
    protected MXBooleanType printthrulinkdflt;
    @XmlElementRef(name = "REVISION", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> revision;
    @XmlElement(name = "SHOW")
    protected MXBooleanType show;
    @XmlElement(name = "STATUS")
    protected MXStringType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "URLNAME")
    protected MXStringType urlname;
    @XmlElement(name = "URLPARAM1")
    protected MXStringType urlparam1;
    @XmlElement(name = "URLPARAM2")
    protected MXStringType urlparam2;
    @XmlElement(name = "URLPARAM3")
    protected MXStringType urlparam3;
    @XmlElement(name = "URLPARAM4")
    protected MXStringType urlparam4;
    @XmlElement(name = "URLPARAM5")
    protected MXStringType urlparam5;
    @XmlElement(name = "URLTYPE")
    protected MXStringType urltype;
    @XmlElement(name = "USEDEFAULTFILEPATH")
    protected MXBooleanType usedefaultfilepath;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPLICATION() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPLICATION(MXStringType value) {
        this.application = value;
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
     * Gets the value of the contentuid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONTENTUID() {
        return contentuid;
    }

    /**
     * Sets the value of the contentuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONTENTUID(MXStringType value) {
        this.contentuid = value;
    }

    /**
     * Gets the value of the createby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCREATEBY() {
        return createby;
    }

    /**
     * Sets the value of the createby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCREATEBY(MXStringType value) {
        this.createby = value;
    }

    /**
     * Gets the value of the createdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getCREATEDATE() {
        return createdate;
    }

    /**
     * Sets the value of the createdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setCREATEDATE(JAXBElement<MXDateTimeType> value) {
        this.createdate = value;
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
     * Gets the value of the dmsname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDMSNAME() {
        return dmsname;
    }

    /**
     * Sets the value of the dmsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDMSNAME(MXStringType value) {
        this.dmsname = value;
    }

    /**
     * Gets the value of the doclocation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDOCLOCATION() {
        return doclocation;
    }

    /**
     * Sets the value of the doclocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDOCLOCATION(MXStringType value) {
        this.doclocation = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDOCUMENT() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDOCUMENT(MXStringType value) {
        this.document = value;
    }

    /**
     * Gets the value of the printthrulinkdflt property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPRINTTHRULINKDFLT() {
        return printthrulinkdflt;
    }

    /**
     * Sets the value of the printthrulinkdflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPRINTTHRULINKDFLT(MXBooleanType value) {
        this.printthrulinkdflt = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getREVISION() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setREVISION(JAXBElement<MXLongType> value) {
        this.revision = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSHOW() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSHOW(MXBooleanType value) {
        this.show = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTATUS(MXStringType value) {
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
     * Gets the value of the urlname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLNAME() {
        return urlname;
    }

    /**
     * Sets the value of the urlname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLNAME(MXStringType value) {
        this.urlname = value;
    }

    /**
     * Gets the value of the urlparam1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM1() {
        return urlparam1;
    }

    /**
     * Sets the value of the urlparam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM1(MXStringType value) {
        this.urlparam1 = value;
    }

    /**
     * Gets the value of the urlparam2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM2() {
        return urlparam2;
    }

    /**
     * Sets the value of the urlparam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM2(MXStringType value) {
        this.urlparam2 = value;
    }

    /**
     * Gets the value of the urlparam3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM3() {
        return urlparam3;
    }

    /**
     * Sets the value of the urlparam3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM3(MXStringType value) {
        this.urlparam3 = value;
    }

    /**
     * Gets the value of the urlparam4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM4() {
        return urlparam4;
    }

    /**
     * Sets the value of the urlparam4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM4(MXStringType value) {
        this.urlparam4 = value;
    }

    /**
     * Gets the value of the urlparam5 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM5() {
        return urlparam5;
    }

    /**
     * Sets the value of the urlparam5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM5(MXStringType value) {
        this.urlparam5 = value;
    }

    /**
     * Gets the value of the urltype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLTYPE() {
        return urltype;
    }

    /**
     * Sets the value of the urltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLTYPE(MXStringType value) {
        this.urltype = value;
    }

    /**
     * Gets the value of the usedefaultfilepath property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getUSEDEFAULTFILEPATH() {
        return usedefaultfilepath;
    }

    /**
     * Sets the value of the usedefaultfilepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setUSEDEFAULTFILEPATH(MXBooleanType value) {
        this.usedefaultfilepath = value;
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
