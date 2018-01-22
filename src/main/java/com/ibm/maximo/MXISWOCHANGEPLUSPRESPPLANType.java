
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_PLUSPRESPPLANType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_PLUSPRESPPLANType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTIVE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ADMINISTRATOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPLYJOBPLAN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPLYJPORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPLYJPSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPLYSOLUTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPLYTKTEMPLATE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="APPLYTODATE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="ASSIGNCREW" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNCREWID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNCREWORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNCREWWORKGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNLEAD" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNOWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNPERSONGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNSUPERVISOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSIGNVENDOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="BILLAPPROVEDWORK" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="CALCCALENDAR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALCORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALCSHIFT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALENDAR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALENDARORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CONDITION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CUSTVENDORCONTACT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ESCALATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FIRSTCALC" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="INTPRIORITYEVAL" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="INTPRIORITYVALUE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="OBJECTNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPSERVAGREEID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="RANKING" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="REFPOINTID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="REVIEWDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="SANUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SECONDCALC" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="SERVICETYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHIFT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SLAHOLD" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="SLAID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="SLANUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SLATYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="STOPRPIFJPORTT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="THIRDCALC" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="TICKETORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TICKETSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_PLUSPRESPPLANType", propOrder = {
    "active",
    "administrator",
    "applyjobplan",
    "applyjporgid",
    "applyjpsiteid",
    "applysolution",
    "applytktemplate",
    "applytodate",
    "assigncrew",
    "assigncrewid",
    "assigncreworgid",
    "assigncrewworkgroup",
    "assignlead",
    "assignowner",
    "assignownergroup",
    "assignpersongroup",
    "assignsupervisor",
    "assignvendor",
    "billapprovedwork",
    "calccalendar",
    "calcorgid",
    "calcshift",
    "calendar",
    "calendarorgid",
    "changeby",
    "changedate",
    "classstructureid",
    "condition",
    "createby",
    "createdate",
    "custvendorcontact",
    "description",
    "enddate",
    "escalation",
    "firstcalc",
    "intpriorityeval",
    "intpriorityvalue",
    "objectname",
    "orgid",
    "pluspservagreeid",
    "ranking",
    "refpointid",
    "reviewdate",
    "sanum",
    "secondcalc",
    "servicetype",
    "shift",
    "slahold",
    "slaid",
    "slanum",
    "slatype",
    "startdate",
    "status",
    "statusdate",
    "stoprpifjportt",
    "thirdcalc",
    "ticketorgid",
    "ticketsiteid",
    "vendor"
})
public class MXISWOCHANGEPLUSPRESPPLANType {

    @XmlElement(name = "ACTIVE")
    protected MXBooleanType active;
    @XmlElement(name = "ADMINISTRATOR")
    protected MXStringType administrator;
    @XmlElement(name = "APPLYJOBPLAN")
    protected MXStringType applyjobplan;
    @XmlElement(name = "APPLYJPORGID")
    protected MXStringType applyjporgid;
    @XmlElement(name = "APPLYJPSITEID")
    protected MXStringType applyjpsiteid;
    @XmlElement(name = "APPLYSOLUTION")
    protected MXStringType applysolution;
    @XmlElement(name = "APPLYTKTEMPLATE")
    protected MXStringType applytktemplate;
    @XmlElement(name = "APPLYTODATE")
    protected MXDomainType applytodate;
    @XmlElement(name = "ASSIGNCREW")
    protected MXStringType assigncrew;
    @XmlElement(name = "ASSIGNCREWID")
    protected MXStringType assigncrewid;
    @XmlElement(name = "ASSIGNCREWORGID")
    protected MXStringType assigncreworgid;
    @XmlElement(name = "ASSIGNCREWWORKGROUP")
    protected MXStringType assigncrewworkgroup;
    @XmlElement(name = "ASSIGNLEAD")
    protected MXStringType assignlead;
    @XmlElement(name = "ASSIGNOWNER")
    protected MXStringType assignowner;
    @XmlElement(name = "ASSIGNOWNERGROUP")
    protected MXStringType assignownergroup;
    @XmlElement(name = "ASSIGNPERSONGROUP")
    protected MXStringType assignpersongroup;
    @XmlElement(name = "ASSIGNSUPERVISOR")
    protected MXStringType assignsupervisor;
    @XmlElement(name = "ASSIGNVENDOR")
    protected MXStringType assignvendor;
    @XmlElement(name = "BILLAPPROVEDWORK")
    protected MXBooleanType billapprovedwork;
    @XmlElement(name = "CALCCALENDAR")
    protected MXStringType calccalendar;
    @XmlElement(name = "CALCORGID")
    protected MXStringType calcorgid;
    @XmlElement(name = "CALCSHIFT")
    protected MXStringType calcshift;
    @XmlElement(name = "CALENDAR")
    protected MXStringType calendar;
    @XmlElement(name = "CALENDARORGID")
    protected MXStringType calendarorgid;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "CONDITION")
    protected MXStringType condition;
    @XmlElement(name = "CREATEBY")
    protected MXStringType createby;
    @XmlElementRef(name = "CREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> createdate;
    @XmlElement(name = "CUSTVENDORCONTACT")
    protected MXStringType custvendorcontact;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElementRef(name = "ENDDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> enddate;
    @XmlElement(name = "ESCALATION")
    protected MXStringType escalation;
    @XmlElement(name = "FIRSTCALC")
    protected MXDomainType firstcalc;
    @XmlElement(name = "INTPRIORITYEVAL")
    protected MXDomainType intpriorityeval;
    @XmlElementRef(name = "INTPRIORITYVALUE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> intpriorityvalue;
    @XmlElement(name = "OBJECTNAME")
    protected MXStringType objectname;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElementRef(name = "PLUSPSERVAGREEID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pluspservagreeid;
    @XmlElementRef(name = "RANKING", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> ranking;
    @XmlElementRef(name = "REFPOINTID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> refpointid;
    @XmlElementRef(name = "REVIEWDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> reviewdate;
    @XmlElement(name = "SANUM")
    protected MXStringType sanum;
    @XmlElement(name = "SECONDCALC")
    protected MXDomainType secondcalc;
    @XmlElement(name = "SERVICETYPE")
    protected MXStringType servicetype;
    @XmlElement(name = "SHIFT")
    protected MXStringType shift;
    @XmlElement(name = "SLAHOLD")
    protected MXBooleanType slahold;
    @XmlElementRef(name = "SLAID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> slaid;
    @XmlElement(name = "SLANUM")
    protected MXStringType slanum;
    @XmlElement(name = "SLATYPE")
    protected MXDomainType slatype;
    @XmlElementRef(name = "STARTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> startdate;
    @XmlElement(name = "STATUS")
    protected MXStringType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "STOPRPIFJPORTT")
    protected MXBooleanType stoprpifjportt;
    @XmlElement(name = "THIRDCALC")
    protected MXDomainType thirdcalc;
    @XmlElement(name = "TICKETORGID")
    protected MXStringType ticketorgid;
    @XmlElement(name = "TICKETSITEID")
    protected MXStringType ticketsiteid;
    @XmlElement(name = "VENDOR")
    protected MXStringType vendor;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getACTIVE() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setACTIVE(MXBooleanType value) {
        this.active = value;
    }

    /**
     * Gets the value of the administrator property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getADMINISTRATOR() {
        return administrator;
    }

    /**
     * Sets the value of the administrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setADMINISTRATOR(MXStringType value) {
        this.administrator = value;
    }

    /**
     * Gets the value of the applyjobplan property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPLYJOBPLAN() {
        return applyjobplan;
    }

    /**
     * Sets the value of the applyjobplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPLYJOBPLAN(MXStringType value) {
        this.applyjobplan = value;
    }

    /**
     * Gets the value of the applyjporgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPLYJPORGID() {
        return applyjporgid;
    }

    /**
     * Sets the value of the applyjporgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPLYJPORGID(MXStringType value) {
        this.applyjporgid = value;
    }

    /**
     * Gets the value of the applyjpsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPLYJPSITEID() {
        return applyjpsiteid;
    }

    /**
     * Sets the value of the applyjpsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPLYJPSITEID(MXStringType value) {
        this.applyjpsiteid = value;
    }

    /**
     * Gets the value of the applysolution property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPLYSOLUTION() {
        return applysolution;
    }

    /**
     * Sets the value of the applysolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPLYSOLUTION(MXStringType value) {
        this.applysolution = value;
    }

    /**
     * Gets the value of the applytktemplate property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPPLYTKTEMPLATE() {
        return applytktemplate;
    }

    /**
     * Sets the value of the applytktemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPPLYTKTEMPLATE(MXStringType value) {
        this.applytktemplate = value;
    }

    /**
     * Gets the value of the applytodate property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getAPPLYTODATE() {
        return applytodate;
    }

    /**
     * Sets the value of the applytodate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setAPPLYTODATE(MXDomainType value) {
        this.applytodate = value;
    }

    /**
     * Gets the value of the assigncrew property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNCREW() {
        return assigncrew;
    }

    /**
     * Sets the value of the assigncrew property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNCREW(MXStringType value) {
        this.assigncrew = value;
    }

    /**
     * Gets the value of the assigncrewid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNCREWID() {
        return assigncrewid;
    }

    /**
     * Sets the value of the assigncrewid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNCREWID(MXStringType value) {
        this.assigncrewid = value;
    }

    /**
     * Gets the value of the assigncreworgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNCREWORGID() {
        return assigncreworgid;
    }

    /**
     * Sets the value of the assigncreworgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNCREWORGID(MXStringType value) {
        this.assigncreworgid = value;
    }

    /**
     * Gets the value of the assigncrewworkgroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNCREWWORKGROUP() {
        return assigncrewworkgroup;
    }

    /**
     * Sets the value of the assigncrewworkgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNCREWWORKGROUP(MXStringType value) {
        this.assigncrewworkgroup = value;
    }

    /**
     * Gets the value of the assignlead property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNLEAD() {
        return assignlead;
    }

    /**
     * Sets the value of the assignlead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNLEAD(MXStringType value) {
        this.assignlead = value;
    }

    /**
     * Gets the value of the assignowner property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNOWNER() {
        return assignowner;
    }

    /**
     * Sets the value of the assignowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNOWNER(MXStringType value) {
        this.assignowner = value;
    }

    /**
     * Gets the value of the assignownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNOWNERGROUP() {
        return assignownergroup;
    }

    /**
     * Sets the value of the assignownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNOWNERGROUP(MXStringType value) {
        this.assignownergroup = value;
    }

    /**
     * Gets the value of the assignpersongroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNPERSONGROUP() {
        return assignpersongroup;
    }

    /**
     * Sets the value of the assignpersongroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNPERSONGROUP(MXStringType value) {
        this.assignpersongroup = value;
    }

    /**
     * Gets the value of the assignsupervisor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNSUPERVISOR() {
        return assignsupervisor;
    }

    /**
     * Sets the value of the assignsupervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNSUPERVISOR(MXStringType value) {
        this.assignsupervisor = value;
    }

    /**
     * Gets the value of the assignvendor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNVENDOR() {
        return assignvendor;
    }

    /**
     * Sets the value of the assignvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNVENDOR(MXStringType value) {
        this.assignvendor = value;
    }

    /**
     * Gets the value of the billapprovedwork property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getBILLAPPROVEDWORK() {
        return billapprovedwork;
    }

    /**
     * Sets the value of the billapprovedwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setBILLAPPROVEDWORK(MXBooleanType value) {
        this.billapprovedwork = value;
    }

    /**
     * Gets the value of the calccalendar property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALCCALENDAR() {
        return calccalendar;
    }

    /**
     * Sets the value of the calccalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALCCALENDAR(MXStringType value) {
        this.calccalendar = value;
    }

    /**
     * Gets the value of the calcorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALCORGID() {
        return calcorgid;
    }

    /**
     * Sets the value of the calcorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALCORGID(MXStringType value) {
        this.calcorgid = value;
    }

    /**
     * Gets the value of the calcshift property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALCSHIFT() {
        return calcshift;
    }

    /**
     * Sets the value of the calcshift property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALCSHIFT(MXStringType value) {
        this.calcshift = value;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALENDAR() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALENDAR(MXStringType value) {
        this.calendar = value;
    }

    /**
     * Gets the value of the calendarorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALENDARORGID() {
        return calendarorgid;
    }

    /**
     * Sets the value of the calendarorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALENDARORGID(MXStringType value) {
        this.calendarorgid = value;
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
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONDITION() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONDITION(MXStringType value) {
        this.condition = value;
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
     * Gets the value of the custvendorcontact property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCUSTVENDORCONTACT() {
        return custvendorcontact;
    }

    /**
     * Sets the value of the custvendorcontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCUSTVENDORCONTACT(MXStringType value) {
        this.custvendorcontact = value;
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
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setENDDATE(JAXBElement<MXDateTimeType> value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the escalation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getESCALATION() {
        return escalation;
    }

    /**
     * Sets the value of the escalation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setESCALATION(MXStringType value) {
        this.escalation = value;
    }

    /**
     * Gets the value of the firstcalc property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getFIRSTCALC() {
        return firstcalc;
    }

    /**
     * Sets the value of the firstcalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setFIRSTCALC(MXDomainType value) {
        this.firstcalc = value;
    }

    /**
     * Gets the value of the intpriorityeval property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getINTPRIORITYEVAL() {
        return intpriorityeval;
    }

    /**
     * Sets the value of the intpriorityeval property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setINTPRIORITYEVAL(MXDomainType value) {
        this.intpriorityeval = value;
    }

    /**
     * Gets the value of the intpriorityvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINTPRIORITYVALUE() {
        return intpriorityvalue;
    }

    /**
     * Sets the value of the intpriorityvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINTPRIORITYVALUE(JAXBElement<MXLongType> value) {
        this.intpriorityvalue = value;
    }

    /**
     * Gets the value of the objectname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOBJECTNAME() {
        return objectname;
    }

    /**
     * Sets the value of the objectname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOBJECTNAME(MXStringType value) {
        this.objectname = value;
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
     * Gets the value of the pluspservagreeid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPLUSPSERVAGREEID() {
        return pluspservagreeid;
    }

    /**
     * Sets the value of the pluspservagreeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPLUSPSERVAGREEID(JAXBElement<MXLongType> value) {
        this.pluspservagreeid = value;
    }

    /**
     * Gets the value of the ranking property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getRANKING() {
        return ranking;
    }

    /**
     * Sets the value of the ranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setRANKING(JAXBElement<MXLongType> value) {
        this.ranking = value;
    }

    /**
     * Gets the value of the refpointid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getREFPOINTID() {
        return refpointid;
    }

    /**
     * Sets the value of the refpointid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setREFPOINTID(JAXBElement<MXLongType> value) {
        this.refpointid = value;
    }

    /**
     * Gets the value of the reviewdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getREVIEWDATE() {
        return reviewdate;
    }

    /**
     * Sets the value of the reviewdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setREVIEWDATE(JAXBElement<MXDateTimeType> value) {
        this.reviewdate = value;
    }

    /**
     * Gets the value of the sanum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSANUM() {
        return sanum;
    }

    /**
     * Sets the value of the sanum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSANUM(MXStringType value) {
        this.sanum = value;
    }

    /**
     * Gets the value of the secondcalc property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getSECONDCALC() {
        return secondcalc;
    }

    /**
     * Sets the value of the secondcalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setSECONDCALC(MXDomainType value) {
        this.secondcalc = value;
    }

    /**
     * Gets the value of the servicetype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERVICETYPE() {
        return servicetype;
    }

    /**
     * Sets the value of the servicetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERVICETYPE(MXStringType value) {
        this.servicetype = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSHIFT() {
        return shift;
    }

    /**
     * Sets the value of the shift property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSHIFT(MXStringType value) {
        this.shift = value;
    }

    /**
     * Gets the value of the slahold property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSLAHOLD() {
        return slahold;
    }

    /**
     * Sets the value of the slahold property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSLAHOLD(MXBooleanType value) {
        this.slahold = value;
    }

    /**
     * Gets the value of the slaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getSLAID() {
        return slaid;
    }

    /**
     * Sets the value of the slaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setSLAID(JAXBElement<MXLongType> value) {
        this.slaid = value;
    }

    /**
     * Gets the value of the slanum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSLANUM() {
        return slanum;
    }

    /**
     * Sets the value of the slanum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSLANUM(MXStringType value) {
        this.slanum = value;
    }

    /**
     * Gets the value of the slatype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getSLATYPE() {
        return slatype;
    }

    /**
     * Sets the value of the slatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setSLATYPE(MXDomainType value) {
        this.slatype = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSTARTDATE(JAXBElement<MXDateTimeType> value) {
        this.startdate = value;
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
     * Gets the value of the stoprpifjportt property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSTOPRPIFJPORTT() {
        return stoprpifjportt;
    }

    /**
     * Sets the value of the stoprpifjportt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSTOPRPIFJPORTT(MXBooleanType value) {
        this.stoprpifjportt = value;
    }

    /**
     * Gets the value of the thirdcalc property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getTHIRDCALC() {
        return thirdcalc;
    }

    /**
     * Sets the value of the thirdcalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setTHIRDCALC(MXDomainType value) {
        this.thirdcalc = value;
    }

    /**
     * Gets the value of the ticketorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTICKETORGID() {
        return ticketorgid;
    }

    /**
     * Sets the value of the ticketorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTICKETORGID(MXStringType value) {
        this.ticketorgid = value;
    }

    /**
     * Gets the value of the ticketsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTICKETSITEID() {
        return ticketsiteid;
    }

    /**
     * Sets the value of the ticketsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTICKETSITEID(MXStringType value) {
        this.ticketsiteid = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getVENDOR() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setVENDOR(MXStringType value) {
        this.vendor = value;
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
