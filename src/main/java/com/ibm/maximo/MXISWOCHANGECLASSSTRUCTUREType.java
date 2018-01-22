
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_CLASSSTRUCTUREType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_CLASSSTRUCTUREType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASSIFICATIONGROUPID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CLASSSTRUCTUREUID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXLangStringType" minOccurs="0"/>
 *         &lt;element name="DISCLASSIFICATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GENASSETDESC" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="HASCHILDREN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ITDASSETTYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PARENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PERSON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PERSONGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPINSERTCUSTOMER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSPROLLDOWN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSPROLLDOWNATTR" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCOMTOPOIMG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHOWINASSETTOPO" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="SHOWINTOPO" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="TYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="USECLASSINDESC" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_CLASSSTRUCTUREType", propOrder = {
    "classificationgroupid",
    "classificationid",
    "classstructureid",
    "classstructureuid",
    "commodity",
    "commoditygroup",
    "description",
    "disclassification",
    "genassetdesc",
    "haschildren",
    "indicatedpriority",
    "itdassettype",
    "orgid",
    "owner",
    "parent",
    "person",
    "persongroup",
    "pluspinsertcustomer",
    "pluspisglobal",
    "plusprolldown",
    "plusprolldownattr",
    "pmcomtopoimg",
    "showinassettopo",
    "showintopo",
    "type",
    "useclassindesc"
})
public class MXISWOCHANGECLASSSTRUCTUREType {

    @XmlElement(name = "CLASSIFICATIONGROUPID")
    protected MXStringType classificationgroupid;
    @XmlElement(name = "CLASSIFICATIONID")
    protected MXStringType classificationid;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElementRef(name = "CLASSSTRUCTUREUID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> classstructureuid;
    @XmlElement(name = "COMMODITY")
    protected MXStringType commodity;
    @XmlElement(name = "COMMODITYGROUP")
    protected MXStringType commoditygroup;
    @XmlElement(name = "DESCRIPTION")
    protected MXLangStringType description;
    @XmlElement(name = "DISCLASSIFICATION")
    protected MXStringType disclassification;
    @XmlElement(name = "GENASSETDESC")
    protected MXBooleanType genassetdesc;
    @XmlElement(name = "HASCHILDREN")
    protected MXBooleanType haschildren;
    @XmlElementRef(name = "INDICATEDPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> indicatedpriority;
    @XmlElement(name = "ITDASSETTYPE")
    protected MXDomainType itdassettype;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "PARENT")
    protected MXStringType parent;
    @XmlElement(name = "PERSON")
    protected MXStringType person;
    @XmlElement(name = "PERSONGROUP")
    protected MXStringType persongroup;
    @XmlElement(name = "PLUSPINSERTCUSTOMER")
    protected MXStringType pluspinsertcustomer;
    @XmlElement(name = "PLUSPISGLOBAL")
    protected MXBooleanType pluspisglobal;
    @XmlElement(name = "PLUSPROLLDOWN")
    protected MXBooleanType plusprolldown;
    @XmlElement(name = "PLUSPROLLDOWNATTR")
    protected MXBooleanType plusprolldownattr;
    @XmlElement(name = "PMCOMTOPOIMG")
    protected MXStringType pmcomtopoimg;
    @XmlElement(name = "SHOWINASSETTOPO")
    protected MXBooleanType showinassettopo;
    @XmlElement(name = "SHOWINTOPO")
    protected MXBooleanType showintopo;
    @XmlElement(name = "TYPE")
    protected MXStringType type;
    @XmlElement(name = "USECLASSINDESC")
    protected MXBooleanType useclassindesc;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the classificationgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCLASSIFICATIONGROUPID() {
        return classificationgroupid;
    }

    /**
     * Sets the value of the classificationgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCLASSIFICATIONGROUPID(MXStringType value) {
        this.classificationgroupid = value;
    }

    /**
     * Gets the value of the classificationid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCLASSIFICATIONID() {
        return classificationid;
    }

    /**
     * Sets the value of the classificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCLASSIFICATIONID(MXStringType value) {
        this.classificationid = value;
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
     * Gets the value of the classstructureuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getCLASSSTRUCTUREUID() {
        return classstructureuid;
    }

    /**
     * Sets the value of the classstructureuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setCLASSSTRUCTUREUID(JAXBElement<MXLongType> value) {
        this.classstructureuid = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCOMMODITY() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCOMMODITY(MXStringType value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the commoditygroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCOMMODITYGROUP() {
        return commoditygroup;
    }

    /**
     * Sets the value of the commoditygroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCOMMODITYGROUP(MXStringType value) {
        this.commoditygroup = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MXLangStringType }
     *     
     */
    public MXLangStringType getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXLangStringType }
     *     
     */
    public void setDESCRIPTION(MXLangStringType value) {
        this.description = value;
    }

    /**
     * Gets the value of the disclassification property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDISCLASSIFICATION() {
        return disclassification;
    }

    /**
     * Sets the value of the disclassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDISCLASSIFICATION(MXStringType value) {
        this.disclassification = value;
    }

    /**
     * Gets the value of the genassetdesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getGENASSETDESC() {
        return genassetdesc;
    }

    /**
     * Sets the value of the genassetdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setGENASSETDESC(MXBooleanType value) {
        this.genassetdesc = value;
    }

    /**
     * Gets the value of the haschildren property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASCHILDREN() {
        return haschildren;
    }

    /**
     * Sets the value of the haschildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASCHILDREN(MXBooleanType value) {
        this.haschildren = value;
    }

    /**
     * Gets the value of the indicatedpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINDICATEDPRIORITY() {
        return indicatedpriority;
    }

    /**
     * Sets the value of the indicatedpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINDICATEDPRIORITY(JAXBElement<MXLongType> value) {
        this.indicatedpriority = value;
    }

    /**
     * Gets the value of the itdassettype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getITDASSETTYPE() {
        return itdassettype;
    }

    /**
     * Sets the value of the itdassettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setITDASSETTYPE(MXDomainType value) {
        this.itdassettype = value;
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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNER() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNER(MXStringType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPARENT() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPARENT(MXStringType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPERSON() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPERSON(MXStringType value) {
        this.person = value;
    }

    /**
     * Gets the value of the persongroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPERSONGROUP() {
        return persongroup;
    }

    /**
     * Sets the value of the persongroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPERSONGROUP(MXStringType value) {
        this.persongroup = value;
    }

    /**
     * Gets the value of the pluspinsertcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPINSERTCUSTOMER() {
        return pluspinsertcustomer;
    }

    /**
     * Sets the value of the pluspinsertcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPINSERTCUSTOMER(MXStringType value) {
        this.pluspinsertcustomer = value;
    }

    /**
     * Gets the value of the pluspisglobal property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPISGLOBAL() {
        return pluspisglobal;
    }

    /**
     * Sets the value of the pluspisglobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPISGLOBAL(MXBooleanType value) {
        this.pluspisglobal = value;
    }

    /**
     * Gets the value of the plusprolldown property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPROLLDOWN() {
        return plusprolldown;
    }

    /**
     * Sets the value of the plusprolldown property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPROLLDOWN(MXBooleanType value) {
        this.plusprolldown = value;
    }

    /**
     * Gets the value of the plusprolldownattr property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPROLLDOWNATTR() {
        return plusprolldownattr;
    }

    /**
     * Sets the value of the plusprolldownattr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPROLLDOWNATTR(MXBooleanType value) {
        this.plusprolldownattr = value;
    }

    /**
     * Gets the value of the pmcomtopoimg property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMTOPOIMG() {
        return pmcomtopoimg;
    }

    /**
     * Sets the value of the pmcomtopoimg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMTOPOIMG(MXStringType value) {
        this.pmcomtopoimg = value;
    }

    /**
     * Gets the value of the showinassettopo property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSHOWINASSETTOPO() {
        return showinassettopo;
    }

    /**
     * Sets the value of the showinassettopo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSHOWINASSETTOPO(MXBooleanType value) {
        this.showinassettopo = value;
    }

    /**
     * Gets the value of the showintopo property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSHOWINTOPO() {
        return showintopo;
    }

    /**
     * Sets the value of the showintopo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSHOWINTOPO(MXBooleanType value) {
        this.showintopo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTYPE(MXStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the useclassindesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getUSECLASSINDESC() {
        return useclassindesc;
    }

    /**
     * Sets the value of the useclassindesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setUSECLASSINDESC(MXBooleanType value) {
        this.useclassindesc = value;
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
