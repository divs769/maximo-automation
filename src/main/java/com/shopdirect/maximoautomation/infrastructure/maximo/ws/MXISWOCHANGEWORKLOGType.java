//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.10 at 03:05:57 PM GMT 
//


package com.shopdirect.maximoautomation.infrastructure.maximo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MXISWOCHANGE_WORKLOGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_WORKLOGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASSIGNMENTID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CLIENTVIEWABLE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="IPCTIMELINE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ITDCREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RECORDKEY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_WORKLOGType", propOrder = {
    "assignmentid",
    "_class",
    "clientviewable",
    "createby",
    "createdate",
    "description",
    "ipctimeline",
    "itdcreatedate",
    "logtype",
    "modifyby",
    "modifydate",
    "orgid",
    "recordkey",
    "worklogid"
})
public class MXISWOCHANGEWORKLOGType {

    @XmlElementRef(name = "ASSIGNMENTID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class)
    protected JAXBElement<MXLongType> assignmentid;
    @XmlElement(name = "CLASS")
    protected MXStringType _class;
    @XmlElement(name = "CLIENTVIEWABLE")
    protected MXBooleanType clientviewable;
    @XmlElement(name = "CREATEBY")
    protected MXStringType createby;
    @XmlElementRef(name = "CREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class)
    protected JAXBElement<MXDateTimeType> createdate;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElementRef(name = "IPCTIMELINE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class)
    protected JAXBElement<MXDateTimeType> ipctimeline;
    @XmlElementRef(name = "ITDCREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class)
    protected JAXBElement<MXDateTimeType> itdcreatedate;
    @XmlElement(name = "LOGTYPE")
    protected MXDomainType logtype;
    @XmlElement(name = "MODIFYBY")
    protected MXStringType modifyby;
    @XmlElementRef(name = "MODIFYDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class)
    protected JAXBElement<MXDateTimeType> modifydate;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "RECORDKEY")
    protected MXStringType recordkey;
    @XmlElementRef(name = "WORKLOGID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class)
    protected JAXBElement<MXLongType> worklogid;
    @XmlAttribute
    protected ProcessingActionType action;
    @XmlAttribute
    protected String relationship;
    @XmlAttribute
    protected String deleteForInsert;

    /**
     * Gets the value of the assignmentid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getASSIGNMENTID() {
        return assignmentid;
    }

    /**
     * Sets the value of the assignmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setASSIGNMENTID(JAXBElement<MXLongType> value) {
        this.assignmentid = ((JAXBElement<MXLongType> ) value);
    }

    /**
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCLASS(MXStringType value) {
        this._class = value;
    }

    /**
     * Gets the value of the clientviewable property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCLIENTVIEWABLE() {
        return clientviewable;
    }

    /**
     * Sets the value of the clientviewable property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCLIENTVIEWABLE(MXBooleanType value) {
        this.clientviewable = value;
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
        this.createdate = ((JAXBElement<MXDateTimeType> ) value);
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
     * Gets the value of the ipctimeline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getIPCTIMELINE() {
        return ipctimeline;
    }

    /**
     * Sets the value of the ipctimeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setIPCTIMELINE(JAXBElement<MXDateTimeType> value) {
        this.ipctimeline = ((JAXBElement<MXDateTimeType> ) value);
    }

    /**
     * Gets the value of the itdcreatedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getITDCREATEDATE() {
        return itdcreatedate;
    }

    /**
     * Sets the value of the itdcreatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setITDCREATEDATE(JAXBElement<MXDateTimeType> value) {
        this.itdcreatedate = ((JAXBElement<MXDateTimeType> ) value);
    }

    /**
     * Gets the value of the logtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getLOGTYPE() {
        return logtype;
    }

    /**
     * Sets the value of the logtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setLOGTYPE(MXDomainType value) {
        this.logtype = value;
    }

    /**
     * Gets the value of the modifyby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMODIFYBY() {
        return modifyby;
    }

    /**
     * Sets the value of the modifyby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMODIFYBY(MXStringType value) {
        this.modifyby = value;
    }

    /**
     * Gets the value of the modifydate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getMODIFYDATE() {
        return modifydate;
    }

    /**
     * Sets the value of the modifydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setMODIFYDATE(JAXBElement<MXDateTimeType> value) {
        this.modifydate = ((JAXBElement<MXDateTimeType> ) value);
    }

    /**
     * Gets the value of the orgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORGID() {
        return orgid;
    }

    /**
     * Sets the value of the orgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORGID(MXStringType value) {
        this.orgid = value;
    }

    /**
     * Gets the value of the recordkey property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRECORDKEY() {
        return recordkey;
    }

    /**
     * Sets the value of the recordkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRECORDKEY(MXStringType value) {
        this.recordkey = value;
    }

    /**
     * Gets the value of the worklogid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWORKLOGID() {
        return worklogid;
    }

    /**
     * Sets the value of the worklogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWORKLOGID(JAXBElement<MXLongType> value) {
        this.worklogid = ((JAXBElement<MXLongType> ) value);
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
