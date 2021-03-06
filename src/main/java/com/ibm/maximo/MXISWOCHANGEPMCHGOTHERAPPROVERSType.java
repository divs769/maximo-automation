
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_PMCHGOTHERAPPROVERSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_PMCHGOTHERAPPROVERSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPROVALLEVEL" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="APPROVER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPROVERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPROVERNUM" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGJPOTHERAPPROVERSID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGOTHERAPPROVERSID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_PMCHGOTHERAPPROVERSType", propOrder = {
    "approvallevel",
    "approver",
    "approvergroup",
    "approvernum",
    "description",
    "orgid",
    "pmchgjpotherapproversid",
    "pmchgotherapproversid"
})
public class MXISWOCHANGEPMCHGOTHERAPPROVERSType {

    @XmlElementRef(name = "APPROVALLEVEL", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> approvallevel;
    @XmlElement(name = "APPROVER")
    protected MXStringType approver;
    @XmlElement(name = "APPROVERGROUP")
    protected MXStringType approvergroup;
    @XmlElementRef(name = "APPROVERNUM", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> approvernum;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElementRef(name = "PMCHGJPOTHERAPPROVERSID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgjpotherapproversid;
    @XmlElementRef(name = "PMCHGOTHERAPPROVERSID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgotherapproversid;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the approvallevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getAPPROVALLEVEL() {
        return approvallevel;
    }

    /**
     * Sets the value of the approvallevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setAPPROVALLEVEL(JAXBElement<MXLongType> value) {
        this.approvallevel = value;
    }

    /**
     * Gets the value of the approver property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPROVER() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPROVER(MXStringType value) {
        this.approver = value;
    }

    /**
     * Gets the value of the approvergroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPROVERGROUP() {
        return approvergroup;
    }

    /**
     * Sets the value of the approvergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPROVERGROUP(MXStringType value) {
        this.approvergroup = value;
    }

    /**
     * Gets the value of the approvernum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getAPPROVERNUM() {
        return approvernum;
    }

    /**
     * Sets the value of the approvernum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setAPPROVERNUM(JAXBElement<MXLongType> value) {
        this.approvernum = value;
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
     * Gets the value of the pmchgjpotherapproversid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGJPOTHERAPPROVERSID() {
        return pmchgjpotherapproversid;
    }

    /**
     * Sets the value of the pmchgjpotherapproversid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGJPOTHERAPPROVERSID(JAXBElement<MXLongType> value) {
        this.pmchgjpotherapproversid = value;
    }

    /**
     * Gets the value of the pmchgotherapproversid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGOTHERAPPROVERSID() {
        return pmchgotherapproversid;
    }

    /**
     * Sets the value of the pmchgotherapproversid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGOTHERAPPROVERSID(JAXBElement<MXLongType> value) {
        this.pmchgotherapproversid = value;
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
