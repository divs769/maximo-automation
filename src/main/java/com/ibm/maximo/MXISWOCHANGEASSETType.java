
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_ASSETType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_ASSETType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANCESTOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSETID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSETTAG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSETTYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="ASSETUID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="AUTOWOGEN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="BINNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="BUDGETCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="CALNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CCIDISGUID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CHILDREN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CONDITIONCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DEFAULTREPFAC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DEFAULTREPFACSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DIRECTION" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="DISABLED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ENDDESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ENDMEASURE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="EQ1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EQ10" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EQ11" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EQ12" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="EQ2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EQ23" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="EQ24" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="EQ3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EQ4" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EQ5" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="EQ6" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="EQ7" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="EQ8" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EQ9" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FAILURECODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="GROUPNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="INSTALLDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="INVCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ISCALIBRATION" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ISLINEAR" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ISRUNNING" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITDALTTAG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDDISPOSALDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ITDDOCCOUNTS" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ITDEXTERNALPONUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDEXTID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDHOSTNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDMACHTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDMANAGEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDMOBILE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITDOWNEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDPURCHASEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ITDSERVCONTPLAN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITDWARRANTYSTARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ITEMNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITEMSETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITEMTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LRM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MAINTHIERCHY" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="MANUFACTURER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MOVED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="OWNERSYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PARENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCASSETDEPT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCCLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PLUSCISCONDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCISCONTAM" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCISINHOUSECAL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCISMTE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCISMTECLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCLOOPNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCLPLOC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCMODELNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCOPRGEEU" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCOPRGEFROM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCOPRGETO" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCPHYLOC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCPMEXTDATE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCSOLUTION" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCSUMDIR" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PLUSCSUMEU" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCSUMREAD" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCSUMSPAN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCSUMURV" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSCVENDOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PURCHASEPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="REPLACECOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="RETURNEDTOVENDOR" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ROTSUSPACCT" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="SADDRESSCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SENDERSYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SERIALNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHIFTNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SOURCESYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STARTDESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STARTMEASURE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="TEMPLATEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TLOAMDISPCHARGE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="TLOAMDISPDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="TLOAMDISPRECIPIENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TLOAMDISPREMARK" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TLOAMDISPREQ" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TLOAMDISPTYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="TLOAMDISPVALUE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="TLOAMHASH" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TLOAMLICENSECOMPLIANCE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TLOAMPARTITION" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="TLOAMREFRESHCYCLE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="TLOAMREFRESHDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="TLOAMREFRESHPLANDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="TLOAMREFRESHREMARKS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TLOAMREFRESHSTATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="TOOLCONTROLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="TOOLRATE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="TOTALCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="TOTDOWNTIME" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="TOTUNCHARGEDCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="UNCHARGEDCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="USAGE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WARRANTYEXPDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="YTDCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_ASSETType", propOrder = {
    "ancestor",
    "assetid",
    "assetnum",
    "assettag",
    "assettype",
    "assetuid",
    "autowogen",
    "binnum",
    "budgetcost",
    "calnum",
    "ccidisguid",
    "changeby",
    "changedate",
    "children",
    "classstructureid",
    "conditioncode",
    "defaultrepfac",
    "defaultrepfacsiteid",
    "description",
    "direction",
    "disabled",
    "enddescription",
    "endmeasure",
    "eq1",
    "eq10",
    "eq11",
    "eq12",
    "eq2",
    "eq23",
    "eq24",
    "eq3",
    "eq4",
    "eq5",
    "eq6",
    "eq7",
    "eq8",
    "eq9",
    "externalrefid",
    "failurecode",
    "glaccount",
    "groupname",
    "installdate",
    "invcost",
    "iscalibration",
    "islinear",
    "isrunning",
    "itdalttag",
    "itddisposaldate",
    "itddoccounts",
    "itdexternalponum",
    "itdextid",
    "itdhostname",
    "itdmachtype",
    "itdmanagedby",
    "itdmobile",
    "itdownedby",
    "itdpurchasedate",
    "itdservcontplan",
    "itdwarrantystartdate",
    "itemnum",
    "itemsetid",
    "itemtype",
    "location",
    "lrm",
    "mainthierchy",
    "manufacturer",
    "moved",
    "orgid",
    "ownersysid",
    "parent",
    "pluscassetdept",
    "pluscclass",
    "pluscduedate",
    "plusciscondesc",
    "plusciscontam",
    "pluscisinhousecal",
    "pluscismte",
    "pluscismteclass",
    "pluscloopnum",
    "plusclploc",
    "pluscmodelnum",
    "pluscoprgeeu",
    "pluscoprgefrom",
    "pluscoprgeto",
    "pluscphyloc",
    "pluscpmextdate",
    "pluscsolution",
    "pluscsumdir",
    "pluscsumeu",
    "pluscsumread",
    "pluscsumspan",
    "pluscsumurv",
    "pluscvendor",
    "pluspcostcenter",
    "pluspcustchacct",
    "pluspcustomer",
    "priority",
    "purchaseprice",
    "replacecost",
    "returnedtovendor",
    "rotsuspacct",
    "saddresscode",
    "sendersysid",
    "serialnum",
    "shiftnum",
    "sourcesysid",
    "startdescription",
    "startmeasure",
    "status",
    "statusdate",
    "templateid",
    "tloamdispcharge",
    "tloamdispdate",
    "tloamdisprecipient",
    "tloamdispremark",
    "tloamdispreq",
    "tloamdisptype",
    "tloamdispvalue",
    "tloamhash",
    "tloamlicensecompliance",
    "tloampartition",
    "tloamrefreshcycle",
    "tloamrefreshdate",
    "tloamrefreshplandate",
    "tloamrefreshremarks",
    "tloamrefreshstatus",
    "toolcontrolaccount",
    "toolrate",
    "totalcost",
    "totdowntime",
    "totunchargedcost",
    "unchargedcost",
    "usage",
    "vendor",
    "warrantyexpdate",
    "ytdcost"
})
public class MXISWOCHANGEASSETType {

    @XmlElement(name = "ANCESTOR")
    protected MXStringType ancestor;
    @XmlElementRef(name = "ASSETID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> assetid;
    @XmlElement(name = "ASSETNUM")
    protected MXStringType assetnum;
    @XmlElement(name = "ASSETTAG")
    protected MXStringType assettag;
    @XmlElement(name = "ASSETTYPE")
    protected MXDomainType assettype;
    @XmlElementRef(name = "ASSETUID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> assetuid;
    @XmlElement(name = "AUTOWOGEN")
    protected MXBooleanType autowogen;
    @XmlElement(name = "BINNUM")
    protected MXStringType binnum;
    @XmlElementRef(name = "BUDGETCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> budgetcost;
    @XmlElement(name = "CALNUM")
    protected MXStringType calnum;
    @XmlElement(name = "CCIDISGUID")
    protected MXStringType ccidisguid;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "CHILDREN")
    protected MXBooleanType children;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "CONDITIONCODE")
    protected MXStringType conditioncode;
    @XmlElement(name = "DEFAULTREPFAC")
    protected MXStringType defaultrepfac;
    @XmlElement(name = "DEFAULTREPFACSITEID")
    protected MXStringType defaultrepfacsiteid;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DIRECTION")
    protected MXDomainType direction;
    @XmlElement(name = "DISABLED")
    protected MXBooleanType disabled;
    @XmlElement(name = "ENDDESCRIPTION")
    protected MXStringType enddescription;
    @XmlElementRef(name = "ENDMEASURE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> endmeasure;
    @XmlElement(name = "EQ1")
    protected MXStringType eq1;
    @XmlElement(name = "EQ10")
    protected MXStringType eq10;
    @XmlElement(name = "EQ11")
    protected MXStringType eq11;
    @XmlElementRef(name = "EQ12", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> eq12;
    @XmlElement(name = "EQ2")
    protected MXStringType eq2;
    @XmlElementRef(name = "EQ23", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> eq23;
    @XmlElementRef(name = "EQ24", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> eq24;
    @XmlElement(name = "EQ3")
    protected MXStringType eq3;
    @XmlElement(name = "EQ4")
    protected MXStringType eq4;
    @XmlElementRef(name = "EQ5", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> eq5;
    @XmlElementRef(name = "EQ6", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> eq6;
    @XmlElementRef(name = "EQ7", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> eq7;
    @XmlElement(name = "EQ8")
    protected MXStringType eq8;
    @XmlElement(name = "EQ9")
    protected MXStringType eq9;
    @XmlElement(name = "EXTERNALREFID")
    protected MXStringType externalrefid;
    @XmlElement(name = "FAILURECODE")
    protected MXStringType failurecode;
    @XmlElement(name = "GLACCOUNT")
    protected MXGLAccountType glaccount;
    @XmlElement(name = "GROUPNAME")
    protected MXStringType groupname;
    @XmlElementRef(name = "INSTALLDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> installdate;
    @XmlElementRef(name = "INVCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> invcost;
    @XmlElement(name = "ISCALIBRATION")
    protected MXBooleanType iscalibration;
    @XmlElement(name = "ISLINEAR")
    protected MXBooleanType islinear;
    @XmlElement(name = "ISRUNNING")
    protected MXBooleanType isrunning;
    @XmlElement(name = "ITDALTTAG")
    protected MXStringType itdalttag;
    @XmlElementRef(name = "ITDDISPOSALDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> itddisposaldate;
    @XmlElementRef(name = "ITDDOCCOUNTS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> itddoccounts;
    @XmlElement(name = "ITDEXTERNALPONUM")
    protected MXStringType itdexternalponum;
    @XmlElement(name = "ITDEXTID")
    protected MXStringType itdextid;
    @XmlElement(name = "ITDHOSTNAME")
    protected MXStringType itdhostname;
    @XmlElement(name = "ITDMACHTYPE")
    protected MXStringType itdmachtype;
    @XmlElement(name = "ITDMANAGEDBY")
    protected MXStringType itdmanagedby;
    @XmlElement(name = "ITDMOBILE")
    protected MXBooleanType itdmobile;
    @XmlElement(name = "ITDOWNEDBY")
    protected MXStringType itdownedby;
    @XmlElementRef(name = "ITDPURCHASEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> itdpurchasedate;
    @XmlElement(name = "ITDSERVCONTPLAN")
    protected MXBooleanType itdservcontplan;
    @XmlElementRef(name = "ITDWARRANTYSTARTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> itdwarrantystartdate;
    @XmlElement(name = "ITEMNUM")
    protected MXStringType itemnum;
    @XmlElement(name = "ITEMSETID")
    protected MXStringType itemsetid;
    @XmlElement(name = "ITEMTYPE")
    protected MXStringType itemtype;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElement(name = "LRM")
    protected MXStringType lrm;
    @XmlElement(name = "MAINTHIERCHY")
    protected MXBooleanType mainthierchy;
    @XmlElement(name = "MANUFACTURER")
    protected MXStringType manufacturer;
    @XmlElement(name = "MOVED")
    protected MXBooleanType moved;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "OWNERSYSID")
    protected MXStringType ownersysid;
    @XmlElement(name = "PARENT")
    protected MXStringType parent;
    @XmlElement(name = "PLUSCASSETDEPT")
    protected MXStringType pluscassetdept;
    @XmlElement(name = "PLUSCCLASS")
    protected MXStringType pluscclass;
    @XmlElementRef(name = "PLUSCDUEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pluscduedate;
    @XmlElement(name = "PLUSCISCONDESC")
    protected MXStringType plusciscondesc;
    @XmlElement(name = "PLUSCISCONTAM")
    protected MXBooleanType plusciscontam;
    @XmlElement(name = "PLUSCISINHOUSECAL")
    protected MXBooleanType pluscisinhousecal;
    @XmlElement(name = "PLUSCISMTE")
    protected MXBooleanType pluscismte;
    @XmlElement(name = "PLUSCISMTECLASS")
    protected MXStringType pluscismteclass;
    @XmlElement(name = "PLUSCLOOPNUM")
    protected MXStringType pluscloopnum;
    @XmlElement(name = "PLUSCLPLOC")
    protected MXStringType plusclploc;
    @XmlElement(name = "PLUSCMODELNUM")
    protected MXStringType pluscmodelnum;
    @XmlElement(name = "PLUSCOPRGEEU")
    protected MXStringType pluscoprgeeu;
    @XmlElement(name = "PLUSCOPRGEFROM")
    protected MXStringType pluscoprgefrom;
    @XmlElement(name = "PLUSCOPRGETO")
    protected MXStringType pluscoprgeto;
    @XmlElement(name = "PLUSCPHYLOC")
    protected MXStringType pluscphyloc;
    @XmlElement(name = "PLUSCPMEXTDATE")
    protected MXBooleanType pluscpmextdate;
    @XmlElement(name = "PLUSCSOLUTION")
    protected MXBooleanType pluscsolution;
    @XmlElement(name = "PLUSCSUMDIR")
    protected MXDomainType pluscsumdir;
    @XmlElement(name = "PLUSCSUMEU")
    protected MXStringType pluscsumeu;
    @XmlElement(name = "PLUSCSUMREAD")
    protected MXStringType pluscsumread;
    @XmlElement(name = "PLUSCSUMSPAN")
    protected MXStringType pluscsumspan;
    @XmlElement(name = "PLUSCSUMURV")
    protected MXStringType pluscsumurv;
    @XmlElement(name = "PLUSCVENDOR")
    protected MXStringType pluscvendor;
    @XmlElement(name = "PLUSPCOSTCENTER")
    protected MXStringType pluspcostcenter;
    @XmlElement(name = "PLUSPCUSTCHACCT")
    protected MXStringType pluspcustchacct;
    @XmlElement(name = "PLUSPCUSTOMER")
    protected MXStringType pluspcustomer;
    @XmlElementRef(name = "PRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> priority;
    @XmlElementRef(name = "PURCHASEPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> purchaseprice;
    @XmlElementRef(name = "REPLACECOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> replacecost;
    @XmlElement(name = "RETURNEDTOVENDOR")
    protected MXBooleanType returnedtovendor;
    @XmlElement(name = "ROTSUSPACCT")
    protected MXGLAccountType rotsuspacct;
    @XmlElement(name = "SADDRESSCODE")
    protected MXStringType saddresscode;
    @XmlElement(name = "SENDERSYSID")
    protected MXStringType sendersysid;
    @XmlElement(name = "SERIALNUM")
    protected MXStringType serialnum;
    @XmlElement(name = "SHIFTNUM")
    protected MXStringType shiftnum;
    @XmlElement(name = "SOURCESYSID")
    protected MXStringType sourcesysid;
    @XmlElement(name = "STARTDESCRIPTION")
    protected MXStringType startdescription;
    @XmlElementRef(name = "STARTMEASURE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> startmeasure;
    @XmlElement(name = "STATUS")
    protected MXDomainType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "TEMPLATEID")
    protected MXStringType templateid;
    @XmlElementRef(name = "TLOAMDISPCHARGE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> tloamdispcharge;
    @XmlElementRef(name = "TLOAMDISPDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> tloamdispdate;
    @XmlElement(name = "TLOAMDISPRECIPIENT")
    protected MXStringType tloamdisprecipient;
    @XmlElement(name = "TLOAMDISPREMARK")
    protected MXStringType tloamdispremark;
    @XmlElement(name = "TLOAMDISPREQ")
    protected MXStringType tloamdispreq;
    @XmlElement(name = "TLOAMDISPTYPE")
    protected MXDomainType tloamdisptype;
    @XmlElementRef(name = "TLOAMDISPVALUE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> tloamdispvalue;
    @XmlElement(name = "TLOAMHASH")
    protected MXStringType tloamhash;
    @XmlElement(name = "TLOAMLICENSECOMPLIANCE")
    protected MXStringType tloamlicensecompliance;
    @XmlElement(name = "TLOAMPARTITION")
    protected MXBooleanType tloampartition;
    @XmlElementRef(name = "TLOAMREFRESHCYCLE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> tloamrefreshcycle;
    @XmlElementRef(name = "TLOAMREFRESHDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> tloamrefreshdate;
    @XmlElementRef(name = "TLOAMREFRESHPLANDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> tloamrefreshplandate;
    @XmlElement(name = "TLOAMREFRESHREMARKS")
    protected MXStringType tloamrefreshremarks;
    @XmlElement(name = "TLOAMREFRESHSTATUS")
    protected MXDomainType tloamrefreshstatus;
    @XmlElement(name = "TOOLCONTROLACCOUNT")
    protected MXGLAccountType toolcontrolaccount;
    @XmlElementRef(name = "TOOLRATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> toolrate;
    @XmlElementRef(name = "TOTALCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> totalcost;
    @XmlElementRef(name = "TOTDOWNTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> totdowntime;
    @XmlElementRef(name = "TOTUNCHARGEDCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> totunchargedcost;
    @XmlElementRef(name = "UNCHARGEDCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> unchargedcost;
    @XmlElement(name = "USAGE")
    protected MXStringType usage;
    @XmlElement(name = "VENDOR")
    protected MXStringType vendor;
    @XmlElementRef(name = "WARRANTYEXPDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> warrantyexpdate;
    @XmlElementRef(name = "YTDCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> ytdcost;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the ancestor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getANCESTOR() {
        return ancestor;
    }

    /**
     * Sets the value of the ancestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setANCESTOR(MXStringType value) {
        this.ancestor = value;
    }

    /**
     * Gets the value of the assetid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getASSETID() {
        return assetid;
    }

    /**
     * Sets the value of the assetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setASSETID(JAXBElement<MXLongType> value) {
        this.assetid = value;
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
     * Gets the value of the assettag property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSETTAG() {
        return assettag;
    }

    /**
     * Sets the value of the assettag property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSETTAG(MXStringType value) {
        this.assettag = value;
    }

    /**
     * Gets the value of the assettype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getASSETTYPE() {
        return assettype;
    }

    /**
     * Sets the value of the assettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setASSETTYPE(MXDomainType value) {
        this.assettype = value;
    }

    /**
     * Gets the value of the assetuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getASSETUID() {
        return assetuid;
    }

    /**
     * Sets the value of the assetuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setASSETUID(JAXBElement<MXLongType> value) {
        this.assetuid = value;
    }

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
     * Gets the value of the binnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBINNUM() {
        return binnum;
    }

    /**
     * Sets the value of the binnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBINNUM(MXStringType value) {
        this.binnum = value;
    }

    /**
     * Gets the value of the budgetcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getBUDGETCOST() {
        return budgetcost;
    }

    /**
     * Sets the value of the budgetcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setBUDGETCOST(JAXBElement<MXDoubleType> value) {
        this.budgetcost = value;
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
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCHILDREN() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCHILDREN(MXBooleanType value) {
        this.children = value;
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
     * Gets the value of the conditioncode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONDITIONCODE() {
        return conditioncode;
    }

    /**
     * Sets the value of the conditioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONDITIONCODE(MXStringType value) {
        this.conditioncode = value;
    }

    /**
     * Gets the value of the defaultrepfac property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDEFAULTREPFAC() {
        return defaultrepfac;
    }

    /**
     * Sets the value of the defaultrepfac property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDEFAULTREPFAC(MXStringType value) {
        this.defaultrepfac = value;
    }

    /**
     * Gets the value of the defaultrepfacsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDEFAULTREPFACSITEID() {
        return defaultrepfacsiteid;
    }

    /**
     * Sets the value of the defaultrepfacsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDEFAULTREPFACSITEID(MXStringType value) {
        this.defaultrepfacsiteid = value;
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
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getDIRECTION() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setDIRECTION(MXDomainType value) {
        this.direction = value;
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
     * Gets the value of the enddescription property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getENDDESCRIPTION() {
        return enddescription;
    }

    /**
     * Sets the value of the enddescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setENDDESCRIPTION(MXStringType value) {
        this.enddescription = value;
    }

    /**
     * Gets the value of the endmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getENDMEASURE() {
        return endmeasure;
    }

    /**
     * Sets the value of the endmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setENDMEASURE(JAXBElement<MXDoubleType> value) {
        this.endmeasure = value;
    }

    /**
     * Gets the value of the eq1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ1() {
        return eq1;
    }

    /**
     * Sets the value of the eq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ1(MXStringType value) {
        this.eq1 = value;
    }

    /**
     * Gets the value of the eq10 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ10() {
        return eq10;
    }

    /**
     * Sets the value of the eq10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ10(MXStringType value) {
        this.eq10 = value;
    }

    /**
     * Gets the value of the eq11 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ11() {
        return eq11;
    }

    /**
     * Sets the value of the eq11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ11(MXStringType value) {
        this.eq11 = value;
    }

    /**
     * Gets the value of the eq12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getEQ12() {
        return eq12;
    }

    /**
     * Sets the value of the eq12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setEQ12(JAXBElement<MXDoubleType> value) {
        this.eq12 = value;
    }

    /**
     * Gets the value of the eq2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ2() {
        return eq2;
    }

    /**
     * Sets the value of the eq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ2(MXStringType value) {
        this.eq2 = value;
    }

    /**
     * Gets the value of the eq23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getEQ23() {
        return eq23;
    }

    /**
     * Sets the value of the eq23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setEQ23(JAXBElement<MXDateTimeType> value) {
        this.eq23 = value;
    }

    /**
     * Gets the value of the eq24 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getEQ24() {
        return eq24;
    }

    /**
     * Sets the value of the eq24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setEQ24(JAXBElement<MXDoubleType> value) {
        this.eq24 = value;
    }

    /**
     * Gets the value of the eq3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ3() {
        return eq3;
    }

    /**
     * Sets the value of the eq3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ3(MXStringType value) {
        this.eq3 = value;
    }

    /**
     * Gets the value of the eq4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ4() {
        return eq4;
    }

    /**
     * Sets the value of the eq4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ4(MXStringType value) {
        this.eq4 = value;
    }

    /**
     * Gets the value of the eq5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getEQ5() {
        return eq5;
    }

    /**
     * Sets the value of the eq5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setEQ5(JAXBElement<MXDoubleType> value) {
        this.eq5 = value;
    }

    /**
     * Gets the value of the eq6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getEQ6() {
        return eq6;
    }

    /**
     * Sets the value of the eq6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setEQ6(JAXBElement<MXDateTimeType> value) {
        this.eq6 = value;
    }

    /**
     * Gets the value of the eq7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getEQ7() {
        return eq7;
    }

    /**
     * Sets the value of the eq7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setEQ7(JAXBElement<MXDoubleType> value) {
        this.eq7 = value;
    }

    /**
     * Gets the value of the eq8 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ8() {
        return eq8;
    }

    /**
     * Sets the value of the eq8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ8(MXStringType value) {
        this.eq8 = value;
    }

    /**
     * Gets the value of the eq9 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQ9() {
        return eq9;
    }

    /**
     * Sets the value of the eq9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQ9(MXStringType value) {
        this.eq9 = value;
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
     * Gets the value of the failurecode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFAILURECODE() {
        return failurecode;
    }

    /**
     * Sets the value of the failurecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFAILURECODE(MXStringType value) {
        this.failurecode = value;
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
     * Gets the value of the groupname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGROUPNAME() {
        return groupname;
    }

    /**
     * Sets the value of the groupname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGROUPNAME(MXStringType value) {
        this.groupname = value;
    }

    /**
     * Gets the value of the installdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getINSTALLDATE() {
        return installdate;
    }

    /**
     * Sets the value of the installdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setINSTALLDATE(JAXBElement<MXDateTimeType> value) {
        this.installdate = value;
    }

    /**
     * Gets the value of the invcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getINVCOST() {
        return invcost;
    }

    /**
     * Sets the value of the invcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setINVCOST(JAXBElement<MXDoubleType> value) {
        this.invcost = value;
    }

    /**
     * Gets the value of the iscalibration property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISCALIBRATION() {
        return iscalibration;
    }

    /**
     * Sets the value of the iscalibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISCALIBRATION(MXBooleanType value) {
        this.iscalibration = value;
    }

    /**
     * Gets the value of the islinear property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISLINEAR() {
        return islinear;
    }

    /**
     * Sets the value of the islinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISLINEAR(MXBooleanType value) {
        this.islinear = value;
    }

    /**
     * Gets the value of the isrunning property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISRUNNING() {
        return isrunning;
    }

    /**
     * Sets the value of the isrunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISRUNNING(MXBooleanType value) {
        this.isrunning = value;
    }

    /**
     * Gets the value of the itdalttag property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDALTTAG() {
        return itdalttag;
    }

    /**
     * Sets the value of the itdalttag property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDALTTAG(MXStringType value) {
        this.itdalttag = value;
    }

    /**
     * Gets the value of the itddisposaldate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getITDDISPOSALDATE() {
        return itddisposaldate;
    }

    /**
     * Sets the value of the itddisposaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setITDDISPOSALDATE(JAXBElement<MXDateTimeType> value) {
        this.itddisposaldate = value;
    }

    /**
     * Gets the value of the itddoccounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getITDDOCCOUNTS() {
        return itddoccounts;
    }

    /**
     * Sets the value of the itddoccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setITDDOCCOUNTS(JAXBElement<MXLongType> value) {
        this.itddoccounts = value;
    }

    /**
     * Gets the value of the itdexternalponum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDEXTERNALPONUM() {
        return itdexternalponum;
    }

    /**
     * Sets the value of the itdexternalponum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDEXTERNALPONUM(MXStringType value) {
        this.itdexternalponum = value;
    }

    /**
     * Gets the value of the itdextid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDEXTID() {
        return itdextid;
    }

    /**
     * Sets the value of the itdextid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDEXTID(MXStringType value) {
        this.itdextid = value;
    }

    /**
     * Gets the value of the itdhostname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDHOSTNAME() {
        return itdhostname;
    }

    /**
     * Sets the value of the itdhostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDHOSTNAME(MXStringType value) {
        this.itdhostname = value;
    }

    /**
     * Gets the value of the itdmachtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDMACHTYPE() {
        return itdmachtype;
    }

    /**
     * Sets the value of the itdmachtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDMACHTYPE(MXStringType value) {
        this.itdmachtype = value;
    }

    /**
     * Gets the value of the itdmanagedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDMANAGEDBY() {
        return itdmanagedby;
    }

    /**
     * Sets the value of the itdmanagedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDMANAGEDBY(MXStringType value) {
        this.itdmanagedby = value;
    }

    /**
     * Gets the value of the itdmobile property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getITDMOBILE() {
        return itdmobile;
    }

    /**
     * Sets the value of the itdmobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setITDMOBILE(MXBooleanType value) {
        this.itdmobile = value;
    }

    /**
     * Gets the value of the itdownedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDOWNEDBY() {
        return itdownedby;
    }

    /**
     * Sets the value of the itdownedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDOWNEDBY(MXStringType value) {
        this.itdownedby = value;
    }

    /**
     * Gets the value of the itdpurchasedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getITDPURCHASEDATE() {
        return itdpurchasedate;
    }

    /**
     * Sets the value of the itdpurchasedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setITDPURCHASEDATE(JAXBElement<MXDateTimeType> value) {
        this.itdpurchasedate = value;
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
     * Gets the value of the itdwarrantystartdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getITDWARRANTYSTARTDATE() {
        return itdwarrantystartdate;
    }

    /**
     * Sets the value of the itdwarrantystartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setITDWARRANTYSTARTDATE(JAXBElement<MXDateTimeType> value) {
        this.itdwarrantystartdate = value;
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
     * Gets the value of the itemtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITEMTYPE() {
        return itemtype;
    }

    /**
     * Sets the value of the itemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITEMTYPE(MXStringType value) {
        this.itemtype = value;
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
     * Gets the value of the lrm property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLRM() {
        return lrm;
    }

    /**
     * Sets the value of the lrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLRM(MXStringType value) {
        this.lrm = value;
    }

    /**
     * Gets the value of the mainthierchy property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getMAINTHIERCHY() {
        return mainthierchy;
    }

    /**
     * Sets the value of the mainthierchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setMAINTHIERCHY(MXBooleanType value) {
        this.mainthierchy = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMANUFACTURER() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMANUFACTURER(MXStringType value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the moved property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getMOVED() {
        return moved;
    }

    /**
     * Sets the value of the moved property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setMOVED(MXBooleanType value) {
        this.moved = value;
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
     * Gets the value of the pluscassetdept property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCASSETDEPT() {
        return pluscassetdept;
    }

    /**
     * Sets the value of the pluscassetdept property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCASSETDEPT(MXStringType value) {
        this.pluscassetdept = value;
    }

    /**
     * Gets the value of the pluscclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCCLASS() {
        return pluscclass;
    }

    /**
     * Sets the value of the pluscclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCCLASS(MXStringType value) {
        this.pluscclass = value;
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
     * Gets the value of the plusciscondesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCISCONDESC() {
        return plusciscondesc;
    }

    /**
     * Sets the value of the plusciscondesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCISCONDESC(MXStringType value) {
        this.plusciscondesc = value;
    }

    /**
     * Gets the value of the plusciscontam property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSCISCONTAM() {
        return plusciscontam;
    }

    /**
     * Sets the value of the plusciscontam property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSCISCONTAM(MXBooleanType value) {
        this.plusciscontam = value;
    }

    /**
     * Gets the value of the pluscisinhousecal property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSCISINHOUSECAL() {
        return pluscisinhousecal;
    }

    /**
     * Sets the value of the pluscisinhousecal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSCISINHOUSECAL(MXBooleanType value) {
        this.pluscisinhousecal = value;
    }

    /**
     * Gets the value of the pluscismte property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSCISMTE() {
        return pluscismte;
    }

    /**
     * Sets the value of the pluscismte property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSCISMTE(MXBooleanType value) {
        this.pluscismte = value;
    }

    /**
     * Gets the value of the pluscismteclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCISMTECLASS() {
        return pluscismteclass;
    }

    /**
     * Sets the value of the pluscismteclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCISMTECLASS(MXStringType value) {
        this.pluscismteclass = value;
    }

    /**
     * Gets the value of the pluscloopnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCLOOPNUM() {
        return pluscloopnum;
    }

    /**
     * Sets the value of the pluscloopnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCLOOPNUM(MXStringType value) {
        this.pluscloopnum = value;
    }

    /**
     * Gets the value of the plusclploc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCLPLOC() {
        return plusclploc;
    }

    /**
     * Sets the value of the plusclploc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCLPLOC(MXStringType value) {
        this.plusclploc = value;
    }

    /**
     * Gets the value of the pluscmodelnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCMODELNUM() {
        return pluscmodelnum;
    }

    /**
     * Sets the value of the pluscmodelnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCMODELNUM(MXStringType value) {
        this.pluscmodelnum = value;
    }

    /**
     * Gets the value of the pluscoprgeeu property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCOPRGEEU() {
        return pluscoprgeeu;
    }

    /**
     * Sets the value of the pluscoprgeeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCOPRGEEU(MXStringType value) {
        this.pluscoprgeeu = value;
    }

    /**
     * Gets the value of the pluscoprgefrom property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCOPRGEFROM() {
        return pluscoprgefrom;
    }

    /**
     * Sets the value of the pluscoprgefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCOPRGEFROM(MXStringType value) {
        this.pluscoprgefrom = value;
    }

    /**
     * Gets the value of the pluscoprgeto property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCOPRGETO() {
        return pluscoprgeto;
    }

    /**
     * Sets the value of the pluscoprgeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCOPRGETO(MXStringType value) {
        this.pluscoprgeto = value;
    }

    /**
     * Gets the value of the pluscphyloc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCPHYLOC() {
        return pluscphyloc;
    }

    /**
     * Sets the value of the pluscphyloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCPHYLOC(MXStringType value) {
        this.pluscphyloc = value;
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
     * Gets the value of the pluscsolution property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSCSOLUTION() {
        return pluscsolution;
    }

    /**
     * Sets the value of the pluscsolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSCSOLUTION(MXBooleanType value) {
        this.pluscsolution = value;
    }

    /**
     * Gets the value of the pluscsumdir property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPLUSCSUMDIR() {
        return pluscsumdir;
    }

    /**
     * Sets the value of the pluscsumdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPLUSCSUMDIR(MXDomainType value) {
        this.pluscsumdir = value;
    }

    /**
     * Gets the value of the pluscsumeu property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCSUMEU() {
        return pluscsumeu;
    }

    /**
     * Sets the value of the pluscsumeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCSUMEU(MXStringType value) {
        this.pluscsumeu = value;
    }

    /**
     * Gets the value of the pluscsumread property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCSUMREAD() {
        return pluscsumread;
    }

    /**
     * Sets the value of the pluscsumread property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCSUMREAD(MXStringType value) {
        this.pluscsumread = value;
    }

    /**
     * Gets the value of the pluscsumspan property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCSUMSPAN() {
        return pluscsumspan;
    }

    /**
     * Sets the value of the pluscsumspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCSUMSPAN(MXStringType value) {
        this.pluscsumspan = value;
    }

    /**
     * Gets the value of the pluscsumurv property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCSUMURV() {
        return pluscsumurv;
    }

    /**
     * Sets the value of the pluscsumurv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCSUMURV(MXStringType value) {
        this.pluscsumurv = value;
    }

    /**
     * Gets the value of the pluscvendor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSCVENDOR() {
        return pluscvendor;
    }

    /**
     * Sets the value of the pluscvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSCVENDOR(MXStringType value) {
        this.pluscvendor = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPRIORITY(JAXBElement<MXLongType> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the purchaseprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPURCHASEPRICE() {
        return purchaseprice;
    }

    /**
     * Sets the value of the purchaseprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPURCHASEPRICE(JAXBElement<MXDoubleType> value) {
        this.purchaseprice = value;
    }

    /**
     * Gets the value of the replacecost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getREPLACECOST() {
        return replacecost;
    }

    /**
     * Sets the value of the replacecost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setREPLACECOST(JAXBElement<MXDoubleType> value) {
        this.replacecost = value;
    }

    /**
     * Gets the value of the returnedtovendor property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getRETURNEDTOVENDOR() {
        return returnedtovendor;
    }

    /**
     * Sets the value of the returnedtovendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setRETURNEDTOVENDOR(MXBooleanType value) {
        this.returnedtovendor = value;
    }

    /**
     * Gets the value of the rotsuspacct property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getROTSUSPACCT() {
        return rotsuspacct;
    }

    /**
     * Sets the value of the rotsuspacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setROTSUSPACCT(MXGLAccountType value) {
        this.rotsuspacct = value;
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
     * Gets the value of the serialnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERIALNUM() {
        return serialnum;
    }

    /**
     * Sets the value of the serialnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERIALNUM(MXStringType value) {
        this.serialnum = value;
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
     * Gets the value of the startdescription property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTARTDESCRIPTION() {
        return startdescription;
    }

    /**
     * Sets the value of the startdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTARTDESCRIPTION(MXStringType value) {
        this.startdescription = value;
    }

    /**
     * Gets the value of the startmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getSTARTMEASURE() {
        return startmeasure;
    }

    /**
     * Sets the value of the startmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setSTARTMEASURE(JAXBElement<MXDoubleType> value) {
        this.startmeasure = value;
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
     * Gets the value of the templateid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTEMPLATEID() {
        return templateid;
    }

    /**
     * Sets the value of the templateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTEMPLATEID(MXStringType value) {
        this.templateid = value;
    }

    /**
     * Gets the value of the tloamdispcharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getTLOAMDISPCHARGE() {
        return tloamdispcharge;
    }

    /**
     * Sets the value of the tloamdispcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setTLOAMDISPCHARGE(JAXBElement<MXDoubleType> value) {
        this.tloamdispcharge = value;
    }

    /**
     * Gets the value of the tloamdispdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTLOAMDISPDATE() {
        return tloamdispdate;
    }

    /**
     * Sets the value of the tloamdispdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTLOAMDISPDATE(JAXBElement<MXDateTimeType> value) {
        this.tloamdispdate = value;
    }

    /**
     * Gets the value of the tloamdisprecipient property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTLOAMDISPRECIPIENT() {
        return tloamdisprecipient;
    }

    /**
     * Sets the value of the tloamdisprecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTLOAMDISPRECIPIENT(MXStringType value) {
        this.tloamdisprecipient = value;
    }

    /**
     * Gets the value of the tloamdispremark property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTLOAMDISPREMARK() {
        return tloamdispremark;
    }

    /**
     * Sets the value of the tloamdispremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTLOAMDISPREMARK(MXStringType value) {
        this.tloamdispremark = value;
    }

    /**
     * Gets the value of the tloamdispreq property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTLOAMDISPREQ() {
        return tloamdispreq;
    }

    /**
     * Sets the value of the tloamdispreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTLOAMDISPREQ(MXStringType value) {
        this.tloamdispreq = value;
    }

    /**
     * Gets the value of the tloamdisptype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getTLOAMDISPTYPE() {
        return tloamdisptype;
    }

    /**
     * Sets the value of the tloamdisptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setTLOAMDISPTYPE(MXDomainType value) {
        this.tloamdisptype = value;
    }

    /**
     * Gets the value of the tloamdispvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getTLOAMDISPVALUE() {
        return tloamdispvalue;
    }

    /**
     * Sets the value of the tloamdispvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setTLOAMDISPVALUE(JAXBElement<MXDoubleType> value) {
        this.tloamdispvalue = value;
    }

    /**
     * Gets the value of the tloamhash property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTLOAMHASH() {
        return tloamhash;
    }

    /**
     * Sets the value of the tloamhash property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTLOAMHASH(MXStringType value) {
        this.tloamhash = value;
    }

    /**
     * Gets the value of the tloamlicensecompliance property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTLOAMLICENSECOMPLIANCE() {
        return tloamlicensecompliance;
    }

    /**
     * Sets the value of the tloamlicensecompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTLOAMLICENSECOMPLIANCE(MXStringType value) {
        this.tloamlicensecompliance = value;
    }

    /**
     * Gets the value of the tloampartition property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getTLOAMPARTITION() {
        return tloampartition;
    }

    /**
     * Sets the value of the tloampartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setTLOAMPARTITION(MXBooleanType value) {
        this.tloampartition = value;
    }

    /**
     * Gets the value of the tloamrefreshcycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getTLOAMREFRESHCYCLE() {
        return tloamrefreshcycle;
    }

    /**
     * Sets the value of the tloamrefreshcycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setTLOAMREFRESHCYCLE(JAXBElement<MXLongType> value) {
        this.tloamrefreshcycle = value;
    }

    /**
     * Gets the value of the tloamrefreshdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTLOAMREFRESHDATE() {
        return tloamrefreshdate;
    }

    /**
     * Sets the value of the tloamrefreshdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTLOAMREFRESHDATE(JAXBElement<MXDateTimeType> value) {
        this.tloamrefreshdate = value;
    }

    /**
     * Gets the value of the tloamrefreshplandate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTLOAMREFRESHPLANDATE() {
        return tloamrefreshplandate;
    }

    /**
     * Sets the value of the tloamrefreshplandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTLOAMREFRESHPLANDATE(JAXBElement<MXDateTimeType> value) {
        this.tloamrefreshplandate = value;
    }

    /**
     * Gets the value of the tloamrefreshremarks property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTLOAMREFRESHREMARKS() {
        return tloamrefreshremarks;
    }

    /**
     * Sets the value of the tloamrefreshremarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTLOAMREFRESHREMARKS(MXStringType value) {
        this.tloamrefreshremarks = value;
    }

    /**
     * Gets the value of the tloamrefreshstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getTLOAMREFRESHSTATUS() {
        return tloamrefreshstatus;
    }

    /**
     * Sets the value of the tloamrefreshstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setTLOAMREFRESHSTATUS(MXDomainType value) {
        this.tloamrefreshstatus = value;
    }

    /**
     * Gets the value of the toolcontrolaccount property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getTOOLCONTROLACCOUNT() {
        return toolcontrolaccount;
    }

    /**
     * Sets the value of the toolcontrolaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setTOOLCONTROLACCOUNT(MXGLAccountType value) {
        this.toolcontrolaccount = value;
    }

    /**
     * Gets the value of the toolrate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getTOOLRATE() {
        return toolrate;
    }

    /**
     * Sets the value of the toolrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setTOOLRATE(JAXBElement<MXDoubleType> value) {
        this.toolrate = value;
    }

    /**
     * Gets the value of the totalcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getTOTALCOST() {
        return totalcost;
    }

    /**
     * Sets the value of the totalcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setTOTALCOST(JAXBElement<MXDoubleType> value) {
        this.totalcost = value;
    }

    /**
     * Gets the value of the totdowntime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getTOTDOWNTIME() {
        return totdowntime;
    }

    /**
     * Sets the value of the totdowntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setTOTDOWNTIME(JAXBElement<MXDoubleType> value) {
        this.totdowntime = value;
    }

    /**
     * Gets the value of the totunchargedcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getTOTUNCHARGEDCOST() {
        return totunchargedcost;
    }

    /**
     * Sets the value of the totunchargedcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setTOTUNCHARGEDCOST(JAXBElement<MXDoubleType> value) {
        this.totunchargedcost = value;
    }

    /**
     * Gets the value of the unchargedcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getUNCHARGEDCOST() {
        return unchargedcost;
    }

    /**
     * Sets the value of the unchargedcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setUNCHARGEDCOST(JAXBElement<MXDoubleType> value) {
        this.unchargedcost = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getUSAGE() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setUSAGE(MXStringType value) {
        this.usage = value;
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
     * Gets the value of the warrantyexpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWARRANTYEXPDATE() {
        return warrantyexpdate;
    }

    /**
     * Sets the value of the warrantyexpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWARRANTYEXPDATE(JAXBElement<MXDateTimeType> value) {
        this.warrantyexpdate = value;
    }

    /**
     * Gets the value of the ytdcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getYTDCOST() {
        return ytdcost;
    }

    /**
     * Sets the value of the ytdcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setYTDCOST(JAXBElement<MXDoubleType> value) {
        this.ytdcost = value;
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
