
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_LOCATIONSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_LOCATIONSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AUTOWOGEN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="BILLTOADDRESSCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="BILLTOLABORCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CONTROLACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="CURVARACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DISABLED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GISPARAM1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GISPARAM2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GISPARAM3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="INTLABREC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="INVCOSTADJACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="INVOICEVARACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="INVOWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ISDEFAULT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ISREPAIRFACILITY" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LOCATIONSID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="OLDCONTROLACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="OLDINVCOSTADJACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="OLDSHRINKAGEACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="OWNERSYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PLUSCLOOP" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCPMEXTDATE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PURCHVARACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="RECEIPTVARACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="SADDRESSCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SENDERSYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SERVICEADDRESSCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHIPTOADDRESSCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHIPTOLABORCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHRINKAGEACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="SOURCESYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="TOOLCONTROLACC" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="TYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="USEINPOPR" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_LOCATIONSType", propOrder = {
    "autowogen",
    "billtoaddresscode",
    "billtolaborcode",
    "changeby",
    "changedate",
    "classstructureid",
    "controlacc",
    "curvaracc",
    "description",
    "disabled",
    "externalrefid",
    "gisparam1",
    "gisparam2",
    "gisparam3",
    "glaccount",
    "intlabrec",
    "invcostadjacc",
    "invoicevaracc",
    "invowner",
    "isdefault",
    "isrepairfacility",
    "location",
    "locationsid",
    "oldcontrolacc",
    "oldinvcostadjacc",
    "oldshrinkageacc",
    "orgid",
    "ownersysid",
    "pluscduedate",
    "pluscloop",
    "pluscpmextdate",
    "pluspcostcenter",
    "pluspcustchacct",
    "pluspcustomer",
    "purchvaracc",
    "receiptvaracc",
    "saddresscode",
    "sendersysid",
    "serviceaddresscode",
    "shiptoaddresscode",
    "shiptolaborcode",
    "shrinkageacc",
    "sourcesysid",
    "status",
    "statusdate",
    "toolcontrolacc",
    "type",
    "useinpopr"
})
public class MXISWOCHANGELOCATIONSType {

    @XmlElement(name = "AUTOWOGEN")
    protected MXBooleanType autowogen;
    @XmlElement(name = "BILLTOADDRESSCODE")
    protected MXStringType billtoaddresscode;
    @XmlElement(name = "BILLTOLABORCODE")
    protected MXStringType billtolaborcode;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "CONTROLACC")
    protected MXGLAccountType controlacc;
    @XmlElement(name = "CURVARACC")
    protected MXGLAccountType curvaracc;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DISABLED")
    protected MXBooleanType disabled;
    @XmlElement(name = "EXTERNALREFID")
    protected MXStringType externalrefid;
    @XmlElement(name = "GISPARAM1")
    protected MXStringType gisparam1;
    @XmlElement(name = "GISPARAM2")
    protected MXStringType gisparam2;
    @XmlElement(name = "GISPARAM3")
    protected MXStringType gisparam3;
    @XmlElement(name = "GLACCOUNT")
    protected MXGLAccountType glaccount;
    @XmlElement(name = "INTLABREC")
    protected MXGLAccountType intlabrec;
    @XmlElement(name = "INVCOSTADJACC")
    protected MXGLAccountType invcostadjacc;
    @XmlElement(name = "INVOICEVARACC")
    protected MXGLAccountType invoicevaracc;
    @XmlElement(name = "INVOWNER")
    protected MXStringType invowner;
    @XmlElement(name = "ISDEFAULT")
    protected MXBooleanType isdefault;
    @XmlElement(name = "ISREPAIRFACILITY")
    protected MXBooleanType isrepairfacility;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElementRef(name = "LOCATIONSID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> locationsid;
    @XmlElement(name = "OLDCONTROLACC")
    protected MXGLAccountType oldcontrolacc;
    @XmlElement(name = "OLDINVCOSTADJACC")
    protected MXGLAccountType oldinvcostadjacc;
    @XmlElement(name = "OLDSHRINKAGEACC")
    protected MXGLAccountType oldshrinkageacc;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "OWNERSYSID")
    protected MXStringType ownersysid;
    @XmlElementRef(name = "PLUSCDUEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pluscduedate;
    @XmlElement(name = "PLUSCLOOP")
    protected MXBooleanType pluscloop;
    @XmlElement(name = "PLUSCPMEXTDATE")
    protected MXBooleanType pluscpmextdate;
    @XmlElement(name = "PLUSPCOSTCENTER")
    protected MXStringType pluspcostcenter;
    @XmlElement(name = "PLUSPCUSTCHACCT")
    protected MXStringType pluspcustchacct;
    @XmlElement(name = "PLUSPCUSTOMER")
    protected MXStringType pluspcustomer;
    @XmlElement(name = "PURCHVARACC")
    protected MXGLAccountType purchvaracc;
    @XmlElement(name = "RECEIPTVARACC")
    protected MXGLAccountType receiptvaracc;
    @XmlElement(name = "SADDRESSCODE")
    protected MXStringType saddresscode;
    @XmlElement(name = "SENDERSYSID")
    protected MXStringType sendersysid;
    @XmlElement(name = "SERVICEADDRESSCODE")
    protected MXStringType serviceaddresscode;
    @XmlElement(name = "SHIPTOADDRESSCODE")
    protected MXStringType shiptoaddresscode;
    @XmlElement(name = "SHIPTOLABORCODE")
    protected MXStringType shiptolaborcode;
    @XmlElement(name = "SHRINKAGEACC")
    protected MXGLAccountType shrinkageacc;
    @XmlElement(name = "SOURCESYSID")
    protected MXStringType sourcesysid;
    @XmlElement(name = "STATUS")
    protected MXDomainType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "TOOLCONTROLACC")
    protected MXGLAccountType toolcontrolacc;
    @XmlElement(name = "TYPE")
    protected MXStringType type;
    @XmlElement(name = "USEINPOPR")
    protected MXBooleanType useinpopr;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the autowogen property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getAUTOWOGEN() {
        return autowogen;
    }

    /**
     * Sets the value of the autowogen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setAUTOWOGEN(MXBooleanType value) {
        this.autowogen = value;
    }

    /**
     * Gets the value of the billtoaddresscode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBILLTOADDRESSCODE() {
        return billtoaddresscode;
    }

    /**
     * Sets the value of the billtoaddresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBILLTOADDRESSCODE(MXStringType value) {
        this.billtoaddresscode = value;
    }

    /**
     * Gets the value of the billtolaborcode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBILLTOLABORCODE() {
        return billtolaborcode;
    }

    /**
     * Sets the value of the billtolaborcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBILLTOLABORCODE(MXStringType value) {
        this.billtolaborcode = value;
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
     * Gets the value of the controlacc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getCONTROLACC() {
        return controlacc;
    }

    /**
     * Sets the value of the controlacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setCONTROLACC(MXGLAccountType value) {
        this.controlacc = value;
    }

    /**
     * Gets the value of the curvaracc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getCURVARACC() {
        return curvaracc;
    }

    /**
     * Sets the value of the curvaracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setCURVARACC(MXGLAccountType value) {
        this.curvaracc = value;
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
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getDISABLED() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setDISABLED(MXBooleanType value) {
        this.disabled = value;
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
     * Gets the value of the gisparam1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGISPARAM1() {
        return gisparam1;
    }

    /**
     * Sets the value of the gisparam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGISPARAM1(MXStringType value) {
        this.gisparam1 = value;
    }

    /**
     * Gets the value of the gisparam2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGISPARAM2() {
        return gisparam2;
    }

    /**
     * Sets the value of the gisparam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGISPARAM2(MXStringType value) {
        this.gisparam2 = value;
    }

    /**
     * Gets the value of the gisparam3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGISPARAM3() {
        return gisparam3;
    }

    /**
     * Sets the value of the gisparam3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGISPARAM3(MXStringType value) {
        this.gisparam3 = value;
    }

    /**
     * Gets the value of the glaccount property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getGLACCOUNT() {
        return glaccount;
    }

    /**
     * Sets the value of the glaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setGLACCOUNT(MXGLAccountType value) {
        this.glaccount = value;
    }

    /**
     * Gets the value of the intlabrec property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getINTLABREC() {
        return intlabrec;
    }

    /**
     * Sets the value of the intlabrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setINTLABREC(MXGLAccountType value) {
        this.intlabrec = value;
    }

    /**
     * Gets the value of the invcostadjacc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getINVCOSTADJACC() {
        return invcostadjacc;
    }

    /**
     * Sets the value of the invcostadjacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setINVCOSTADJACC(MXGLAccountType value) {
        this.invcostadjacc = value;
    }

    /**
     * Gets the value of the invoicevaracc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getINVOICEVARACC() {
        return invoicevaracc;
    }

    /**
     * Sets the value of the invoicevaracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setINVOICEVARACC(MXGLAccountType value) {
        this.invoicevaracc = value;
    }

    /**
     * Gets the value of the invowner property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getINVOWNER() {
        return invowner;
    }

    /**
     * Sets the value of the invowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setINVOWNER(MXStringType value) {
        this.invowner = value;
    }

    /**
     * Gets the value of the isdefault property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISDEFAULT() {
        return isdefault;
    }

    /**
     * Sets the value of the isdefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISDEFAULT(MXBooleanType value) {
        this.isdefault = value;
    }

    /**
     * Gets the value of the isrepairfacility property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISREPAIRFACILITY() {
        return isrepairfacility;
    }

    /**
     * Sets the value of the isrepairfacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISREPAIRFACILITY(MXBooleanType value) {
        this.isrepairfacility = value;
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
     * Gets the value of the locationsid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getLOCATIONSID() {
        return locationsid;
    }

    /**
     * Sets the value of the locationsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setLOCATIONSID(JAXBElement<MXLongType> value) {
        this.locationsid = value;
    }

    /**
     * Gets the value of the oldcontrolacc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getOLDCONTROLACC() {
        return oldcontrolacc;
    }

    /**
     * Sets the value of the oldcontrolacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setOLDCONTROLACC(MXGLAccountType value) {
        this.oldcontrolacc = value;
    }

    /**
     * Gets the value of the oldinvcostadjacc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getOLDINVCOSTADJACC() {
        return oldinvcostadjacc;
    }

    /**
     * Sets the value of the oldinvcostadjacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setOLDINVCOSTADJACC(MXGLAccountType value) {
        this.oldinvcostadjacc = value;
    }

    /**
     * Gets the value of the oldshrinkageacc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getOLDSHRINKAGEACC() {
        return oldshrinkageacc;
    }

    /**
     * Sets the value of the oldshrinkageacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setOLDSHRINKAGEACC(MXGLAccountType value) {
        this.oldshrinkageacc = value;
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
     * Gets the value of the ownersysid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNERSYSID() {
        return ownersysid;
    }

    /**
     * Sets the value of the ownersysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNERSYSID(MXStringType value) {
        this.ownersysid = value;
    }

    /**
     * Gets the value of the pluscduedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPLUSCDUEDATE() {
        return pluscduedate;
    }

    /**
     * Sets the value of the pluscduedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPLUSCDUEDATE(JAXBElement<MXDateTimeType> value) {
        this.pluscduedate = value;
    }

    /**
     * Gets the value of the pluscloop property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSCLOOP() {
        return pluscloop;
    }

    /**
     * Sets the value of the pluscloop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSCLOOP(MXBooleanType value) {
        this.pluscloop = value;
    }

    /**
     * Gets the value of the pluscpmextdate property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSCPMEXTDATE() {
        return pluscpmextdate;
    }

    /**
     * Sets the value of the pluscpmextdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSCPMEXTDATE(MXBooleanType value) {
        this.pluscpmextdate = value;
    }

    /**
     * Gets the value of the pluspcostcenter property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCOSTCENTER() {
        return pluspcostcenter;
    }

    /**
     * Sets the value of the pluspcostcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCOSTCENTER(MXStringType value) {
        this.pluspcostcenter = value;
    }

    /**
     * Gets the value of the pluspcustchacct property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCUSTCHACCT() {
        return pluspcustchacct;
    }

    /**
     * Sets the value of the pluspcustchacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCUSTCHACCT(MXStringType value) {
        this.pluspcustchacct = value;
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
     * Gets the value of the purchvaracc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getPURCHVARACC() {
        return purchvaracc;
    }

    /**
     * Sets the value of the purchvaracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setPURCHVARACC(MXGLAccountType value) {
        this.purchvaracc = value;
    }

    /**
     * Gets the value of the receiptvaracc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getRECEIPTVARACC() {
        return receiptvaracc;
    }

    /**
     * Sets the value of the receiptvaracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setRECEIPTVARACC(MXGLAccountType value) {
        this.receiptvaracc = value;
    }

    /**
     * Gets the value of the saddresscode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSADDRESSCODE() {
        return saddresscode;
    }

    /**
     * Sets the value of the saddresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSADDRESSCODE(MXStringType value) {
        this.saddresscode = value;
    }

    /**
     * Gets the value of the sendersysid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSENDERSYSID() {
        return sendersysid;
    }

    /**
     * Sets the value of the sendersysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSENDERSYSID(MXStringType value) {
        this.sendersysid = value;
    }

    /**
     * Gets the value of the serviceaddresscode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERVICEADDRESSCODE() {
        return serviceaddresscode;
    }

    /**
     * Sets the value of the serviceaddresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERVICEADDRESSCODE(MXStringType value) {
        this.serviceaddresscode = value;
    }

    /**
     * Gets the value of the shiptoaddresscode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSHIPTOADDRESSCODE() {
        return shiptoaddresscode;
    }

    /**
     * Sets the value of the shiptoaddresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSHIPTOADDRESSCODE(MXStringType value) {
        this.shiptoaddresscode = value;
    }

    /**
     * Gets the value of the shiptolaborcode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSHIPTOLABORCODE() {
        return shiptolaborcode;
    }

    /**
     * Sets the value of the shiptolaborcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSHIPTOLABORCODE(MXStringType value) {
        this.shiptolaborcode = value;
    }

    /**
     * Gets the value of the shrinkageacc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getSHRINKAGEACC() {
        return shrinkageacc;
    }

    /**
     * Sets the value of the shrinkageacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setSHRINKAGEACC(MXGLAccountType value) {
        this.shrinkageacc = value;
    }

    /**
     * Gets the value of the sourcesysid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSOURCESYSID() {
        return sourcesysid;
    }

    /**
     * Sets the value of the sourcesysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSOURCESYSID(MXStringType value) {
        this.sourcesysid = value;
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
     * Gets the value of the toolcontrolacc property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getTOOLCONTROLACC() {
        return toolcontrolacc;
    }

    /**
     * Sets the value of the toolcontrolacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setTOOLCONTROLACC(MXGLAccountType value) {
        this.toolcontrolacc = value;
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
     * Gets the value of the useinpopr property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getUSEINPOPR() {
        return useinpopr;
    }

    /**
     * Sets the value of the useinpopr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setUSEINPOPR(MXBooleanType value) {
        this.useinpopr = value;
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
