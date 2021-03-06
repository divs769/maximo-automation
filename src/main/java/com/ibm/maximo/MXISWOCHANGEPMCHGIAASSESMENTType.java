
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_PMCHGIAASSESMENTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_PMCHGIAASSESMENTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASSESCLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSESSNUM" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="BUSINESSTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="COST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="DATECREATED" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="IMPACTSCORE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="LASTMODIFIED" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGIAASSESMENTID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGJPIAASSESSMENTID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="RESULTS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="USERID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORKEFFORT" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_PMCHGIAASSESMENTType", propOrder = {
    "assesclass",
    "assessnum",
    "businesstype",
    "cost",
    "datecreated",
    "description",
    "impact",
    "impactscore",
    "lastmodified",
    "orgid",
    "owner",
    "ownergroup",
    "pmchgiaassesmentid",
    "pmchgjpiaassessmentid",
    "results",
    "type",
    "userid",
    "workeffort"
})
public class MXISWOCHANGEPMCHGIAASSESMENTType {

    @XmlElement(name = "ASSESCLASS")
    protected MXStringType assesclass;
    @XmlElementRef(name = "ASSESSNUM", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> assessnum;
    @XmlElement(name = "BUSINESSTYPE")
    protected MXStringType businesstype;
    @XmlElementRef(name = "COST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> cost;
    @XmlElementRef(name = "DATECREATED", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> datecreated;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "IMPACT")
    protected MXStringType impact;
    @XmlElementRef(name = "IMPACTSCORE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> impactscore;
    @XmlElementRef(name = "LASTMODIFIED", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> lastmodified;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "OWNERGROUP")
    protected MXStringType ownergroup;
    @XmlElementRef(name = "PMCHGIAASSESMENTID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgiaassesmentid;
    @XmlElementRef(name = "PMCHGJPIAASSESSMENTID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgjpiaassessmentid;
    @XmlElement(name = "RESULTS")
    protected MXStringType results;
    @XmlElement(name = "TYPE")
    protected MXStringType type;
    @XmlElement(name = "USERID")
    protected MXStringType userid;
    @XmlElementRef(name = "WORKEFFORT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> workeffort;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the assesclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSESCLASS() {
        return assesclass;
    }

    /**
     * Sets the value of the assesclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSESCLASS(MXStringType value) {
        this.assesclass = value;
    }

    /**
     * Gets the value of the assessnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getASSESSNUM() {
        return assessnum;
    }

    /**
     * Sets the value of the assessnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setASSESSNUM(JAXBElement<MXLongType> value) {
        this.assessnum = value;
    }

    /**
     * Gets the value of the businesstype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBUSINESSTYPE() {
        return businesstype;
    }

    /**
     * Sets the value of the businesstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBUSINESSTYPE(MXStringType value) {
        this.businesstype = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getCOST() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setCOST(JAXBElement<MXDoubleType> value) {
        this.cost = value;
    }

    /**
     * Gets the value of the datecreated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getDATECREATED() {
        return datecreated;
    }

    /**
     * Sets the value of the datecreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setDATECREATED(JAXBElement<MXDateTimeType> value) {
        this.datecreated = value;
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
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getIMPACT() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setIMPACT(MXStringType value) {
        this.impact = value;
    }

    /**
     * Gets the value of the impactscore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getIMPACTSCORE() {
        return impactscore;
    }

    /**
     * Sets the value of the impactscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setIMPACTSCORE(JAXBElement<MXLongType> value) {
        this.impactscore = value;
    }

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getLASTMODIFIED() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setLASTMODIFIED(JAXBElement<MXDateTimeType> value) {
        this.lastmodified = value;
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
     * Gets the value of the ownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNERGROUP() {
        return ownergroup;
    }

    /**
     * Sets the value of the ownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNERGROUP(MXStringType value) {
        this.ownergroup = value;
    }

    /**
     * Gets the value of the pmchgiaassesmentid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGIAASSESMENTID() {
        return pmchgiaassesmentid;
    }

    /**
     * Sets the value of the pmchgiaassesmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGIAASSESMENTID(JAXBElement<MXLongType> value) {
        this.pmchgiaassesmentid = value;
    }

    /**
     * Gets the value of the pmchgjpiaassessmentid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGJPIAASSESSMENTID() {
        return pmchgjpiaassessmentid;
    }

    /**
     * Sets the value of the pmchgjpiaassessmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGJPIAASSESSMENTID(JAXBElement<MXLongType> value) {
        this.pmchgjpiaassessmentid = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRESULTS() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRESULTS(MXStringType value) {
        this.results = value;
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
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setUSERID(MXStringType value) {
        this.userid = value;
    }

    /**
     * Gets the value of the workeffort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWORKEFFORT() {
        return workeffort;
    }

    /**
     * Sets the value of the workeffort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWORKEFFORT(JAXBElement<MXDoubleType> value) {
        this.workeffort = value;
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
