
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_RELATEDRECORDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_RELATEDRECORDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RECORDKEY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RELATEDRECCLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RELATEDRECKEY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RELATEDRECORDID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="RELATEDRECORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RELATEDRECSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RELATETYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_RELATEDRECORDType", propOrder = {
    "_class",
    "orgid",
    "recordkey",
    "relatedrecclass",
    "relatedreckey",
    "relatedrecordid",
    "relatedrecorgid",
    "relatedrecsiteid",
    "relatetype"
})
public class MXISWOCHANGERELATEDRECORDType {

    @XmlElement(name = "CLASS")
    protected MXStringType _class;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "RECORDKEY")
    protected MXStringType recordkey;
    @XmlElement(name = "RELATEDRECCLASS")
    protected MXStringType relatedrecclass;
    @XmlElement(name = "RELATEDRECKEY")
    protected MXStringType relatedreckey;
    @XmlElementRef(name = "RELATEDRECORDID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> relatedrecordid;
    @XmlElement(name = "RELATEDRECORGID")
    protected MXStringType relatedrecorgid;
    @XmlElement(name = "RELATEDRECSITEID")
    protected MXStringType relatedrecsiteid;
    @XmlElement(name = "RELATETYPE")
    protected MXStringType relatetype;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

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
     * Gets the value of the relatedrecclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRELATEDRECCLASS() {
        return relatedrecclass;
    }

    /**
     * Sets the value of the relatedrecclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRELATEDRECCLASS(MXStringType value) {
        this.relatedrecclass = value;
    }

    /**
     * Gets the value of the relatedreckey property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRELATEDRECKEY() {
        return relatedreckey;
    }

    /**
     * Sets the value of the relatedreckey property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRELATEDRECKEY(MXStringType value) {
        this.relatedreckey = value;
    }

    /**
     * Gets the value of the relatedrecordid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getRELATEDRECORDID() {
        return relatedrecordid;
    }

    /**
     * Sets the value of the relatedrecordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setRELATEDRECORDID(JAXBElement<MXLongType> value) {
        this.relatedrecordid = value;
    }

    /**
     * Gets the value of the relatedrecorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRELATEDRECORGID() {
        return relatedrecorgid;
    }

    /**
     * Sets the value of the relatedrecorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRELATEDRECORGID(MXStringType value) {
        this.relatedrecorgid = value;
    }

    /**
     * Gets the value of the relatedrecsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRELATEDRECSITEID() {
        return relatedrecsiteid;
    }

    /**
     * Sets the value of the relatedrecsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRELATEDRECSITEID(MXStringType value) {
        this.relatedrecsiteid = value;
    }

    /**
     * Gets the value of the relatetype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRELATETYPE() {
        return relatetype;
    }

    /**
     * Sets the value of the relatetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRELATETYPE(MXStringType value) {
        this.relatetype = value;
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
