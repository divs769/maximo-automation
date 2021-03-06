
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for WOCHANGEObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WOCHANGEObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PARENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WORKTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="JPNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FAILDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ESTDUR" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PMNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ACTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="HASCHILDREN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="OUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="OUTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="OUTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="CONTRACT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="TARGCOMPDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="TARGSTARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WOEQ1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ4" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ5" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOEQ6" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WOEQ7" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOEQ8" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ9" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ10" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ11" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ12" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PHONE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PROBLEMCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALENDAR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DOWNTIME" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="SCHEDSTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="SCHEDFINISH" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="REMDUR" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="CREWID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SUPERVISOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOEQ13" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WOEQ14" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOJP1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJP2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJP3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJP4" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOJP5" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WOL1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOL2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOL3" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOL4" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WOLABLNK" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RESPONDBY" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ASSETLOCPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="CALCPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="CHARGESTORE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="FAILURECODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOLO1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOLO2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOLO3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOLO4" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOLO5" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOLO6" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOLO7" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WOLO8" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOLO9" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOLO10" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/>
 *         &lt;element name="ESTSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="DISABLED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRMATCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOSEQUENCE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="HASFOLLOWUPWORK" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="WORTS1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORTS2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORTS3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORTS4" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WORTS5" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="SOURCESYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="OWNERSYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PMEXTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PMNEXTDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="WORKLOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SENDERSYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FINCNTRLID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GENERATEDFORPO" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GENFORPOLINEID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TASKID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="INSPECTOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MEASUREMENTVALUE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="MEASUREDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="OBSERVATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="POINTNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJO1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJO2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJO3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJO4" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="WOJO5" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJO6" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJO7" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOJO8" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ISTASK" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="WOCLASS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="ONBEHALFOF" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ORIGRECORDCLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="JUSTIFYPRIORITY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RISK" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="ENVIRONMENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="BACKOUTPLAN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WOACCEPTSCHARGES" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PARENTCHGSSTATUS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="WHOMISCHANGEFOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="REASONFORCHANGE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="VERIFICATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PERSONGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LEAD" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LANGCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="INTERRUPTIBLE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="WOGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="HASLD" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ROUTE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ROUTESTOPID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="JOBTASKID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="WOISSWAP" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="NEWCHILDCLASS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="SUSPENDFLOW" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="FLOWCONTROLLED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="FLOWACTIONASSIST" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="LAUNCHENTRYNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TARGETDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FLOWACTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FIRSTAPPRSTATUS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALCORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALCCALENDAR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CALCSHIFT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="REPFACSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="REPAIRFACILITY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GENFORPOREVISION" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="STOREROOMMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="DIRISSUEMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="WORKPACKMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="IGNORESRMAVAIL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="IGNOREDIAVAIL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ESTINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTOUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTOUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTOUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ACTOUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPROUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPROUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="AVAILSTATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="LASTCOPYLINKDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="NESTEDJPINPROCESS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCFREQUENCY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PLUSCFREQUNIT" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PLUSCISMOBILE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCJPREVNUM" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PLUSCLOOP" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSCNEXTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PLUSCOVERDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PLUSCPHYLOC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="INCTASKSINSCHED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="SNECONSTRAINT" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="FNLCONSTRAINT" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PLUSPQUOTEDPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PLUSPQUOTETYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPAGREEMENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPLINESTATUS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPORIGQTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPORIGQPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PLUSPRESPONSEPLAN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPPRICESCHED" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPMAXPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PLUSPCUSTPONUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPREVNUM" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PLUSPPOREQ" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSPALLOWQUOTE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PLUSPCALCORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCALCCALNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPCALCSHIFT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PLUSPBILLAPPROVED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCOMTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCOMSTATE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCOMBPELACTNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCOMBPELENABLED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCOMBPELINPROG" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCOMIMPACT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCOMURGENCY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCOMFLOWSEQ" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGPROGRESS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGRELSTATE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PMCHGRELID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGRELSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGRELORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGISIMPTASK" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCHGIMPDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGIATECHSUMCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PMCHGIABUSSUMCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PMCHGIABUSSUMEFF" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PMCHGIATECHSUMEFF" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PMCHGIADEFREL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCHGIATOTALCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PMCHGIATOTALEFF" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="PMCHGEVALSTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PMCHGEVALEND" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PMCHGAPPROVALLEVEL" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGAPPROVALSTATE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGREJECTREASON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGHASCONFLICTS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCHGCONFLICTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="PMCHGTYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PMCHGCAT" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PMCHGCONCERN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGSKDPRG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGTOTALOUTAGES" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGPROBABILITYFAILURE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGFULLYAUTOMATED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCHGOUTAGEIMPACT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGMAXIMUMASSESSEDIMPACT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="PMCHGOUTAGE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PMRELIMPACT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMRELURGENCY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMRELBACKOUTEXETED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMRELSVCINSTID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="RBA_RC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ACTLICCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTATAPPRLICCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ESTLICCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="TLOAMLICENSENUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMCHGWFASSIST" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDBCKOUTDUR" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ITDCHCREATEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCHCREATEDBYGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCHECK" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITDCHGAUTHLEVEL" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ITDCHGBUSIMPCT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITDCHGCUSTREQ" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITDCHGMGR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCHGPRETSTDTL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCLOSURECODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDCREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ITDDOCCOUNTS" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ITDLEADTIMEDAYS" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ITD_OWNERGROUP_S" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITD_OWNER_S" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDEXCEPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="AMCREW" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CREWWORKGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="REQASSTDWNTIME" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="RBA_RETRY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="APPTREQUIRED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="AOS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="AMS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="LOS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="LMS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCHGSKDPRGSCNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDRELMGR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ITDRISKASSESSMENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{http://www.ibm.com/maximo}ProcessingActionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WOCHANGEObjectType", propOrder = {
    "wonum",
    "parent",
    "status",
    "statusdate",
    "worktype",
    "description",
    "assetnum",
    "location",
    "jpnum",
    "faildate",
    "changeby",
    "changedate",
    "estdur",
    "estlabhrs",
    "estmatcost",
    "estlabcost",
    "esttoolcost",
    "pmnum",
    "actlabhrs",
    "actmatcost",
    "actlabcost",
    "acttoolcost",
    "haschildren",
    "outlabcost",
    "outmatcost",
    "outtoolcost",
    "historyflag",
    "contract",
    "wopriority",
    "targcompdate",
    "targstartdate",
    "woeq1",
    "woeq2",
    "woeq3",
    "woeq4",
    "woeq5",
    "woeq6",
    "woeq7",
    "woeq8",
    "woeq9",
    "woeq10",
    "woeq11",
    "woeq12",
    "reportedby",
    "reportdate",
    "phone",
    "problemcode",
    "calendar",
    "downtime",
    "actstart",
    "actfinish",
    "schedstart",
    "schedfinish",
    "remdur",
    "crewid",
    "supervisor",
    "woeq13",
    "woeq14",
    "wojp1",
    "wojp2",
    "wojp3",
    "wojp4",
    "wojp5",
    "wol1",
    "wol2",
    "wol3",
    "wol4",
    "wolablnk",
    "respondby",
    "assetlocpriority",
    "calcpriority",
    "chargestore",
    "failurecode",
    "wolo1",
    "wolo2",
    "wolo3",
    "wolo4",
    "wolo5",
    "wolo6",
    "wolo7",
    "wolo8",
    "wolo9",
    "wolo10",
    "glaccount",
    "estservcost",
    "actservcost",
    "disabled",
    "estatapprlabhrs",
    "estatapprlabcost",
    "estatapprmatcost",
    "estatapprtoolcost",
    "estatapprservcost",
    "wosequence",
    "hasfollowupwork",
    "worts1",
    "worts2",
    "worts3",
    "worts4",
    "worts5",
    "sourcesysid",
    "ownersysid",
    "pmduedate",
    "pmextdate",
    "pmnextduedate",
    "worklocation",
    "externalrefid",
    "sendersysid",
    "fincntrlid",
    "generatedforpo",
    "genforpolineid",
    "orgid",
    "siteid",
    "taskid",
    "inspector",
    "measurementvalue",
    "measuredate",
    "observation",
    "pointnum",
    "wojo1",
    "wojo2",
    "wojo3",
    "wojo4",
    "wojo5",
    "wojo6",
    "wojo7",
    "wojo8",
    "istask",
    "woclass",
    "onbehalfof",
    "vendor",
    "origrecordclass",
    "origrecordid",
    "justifypriority",
    "risk",
    "environment",
    "backoutplan",
    "woacceptscharges",
    "owner",
    "classstructureid",
    "parentchgsstatus",
    "ownergroup",
    "commoditygroup",
    "commodity",
    "workorderid",
    "whomischangefor",
    "reasonforchange",
    "verification",
    "persongroup",
    "lead",
    "langcode",
    "interruptible",
    "wogroup",
    "hasld",
    "route",
    "routestopid",
    "cinum",
    "jobtaskid",
    "woisswap",
    "newchildclass",
    "suspendflow",
    "flowcontrolled",
    "flowactionassist",
    "launchentryname",
    "targetdesc",
    "flowaction",
    "firstapprstatus",
    "calcorgid",
    "calccalendar",
    "calcshift",
    "repfacsiteid",
    "repairfacility",
    "genforporevision",
    "storeroommtlstatus",
    "dirissuemtlstatus",
    "workpackmtlstatus",
    "ignoresrmavail",
    "ignorediavail",
    "estintlabcost",
    "estintlabhrs",
    "estoutlabhrs",
    "estoutlabcost",
    "actintlabcost",
    "actintlabhrs",
    "actoutlabhrs",
    "actoutlabcost",
    "estatapprintlabcost",
    "estatapprintlabhrs",
    "estatapproutlabhrs",
    "estatapproutlabcost",
    "assignedownergroup",
    "availstatusdate",
    "lastcopylinkdate",
    "nestedjpinprocess",
    "pluscfrequency",
    "pluscfrequnit",
    "pluscismobile",
    "pluscjprevnum",
    "pluscloop",
    "pluscnextdate",
    "pluscoverduedate",
    "pluscphyloc",
    "inctasksinsched",
    "sneconstraint",
    "fnlconstraint",
    "pluspquotedprice",
    "pluspquotetype",
    "pluspcustchacct",
    "pluspcostcenter",
    "pluspcustomer",
    "pluspagreement",
    "plusplinestatus",
    "plusporigqtype",
    "plusporigqprice",
    "pluspresponseplan",
    "plusppricesched",
    "pluspmaxprice",
    "pluspcustponum",
    "plusprevnum",
    "pluspporeq",
    "pluspallowquote",
    "pluspcalcorgid",
    "pluspcalccalnum",
    "pluspcalcshift",
    "pluspbillapproved",
    "pmcomtype",
    "pmcomstate",
    "pmcombpelactname",
    "pmcombpelenabled",
    "pmcombpelinprog",
    "pmcomimpact",
    "pmcomurgency",
    "pmcomflowseq",
    "pmchgprogress",
    "pmchgrelstate",
    "pmchgrelid",
    "pmchgrelsiteid",
    "pmchgrelorgid",
    "pmchgisimptask",
    "pmchgimpdesc",
    "pmchgiatechsumcost",
    "pmchgiabussumcost",
    "pmchgiabussumeff",
    "pmchgiatechsumeff",
    "pmchgiadefrel",
    "pmchgiatotalcost",
    "pmchgiatotaleff",
    "pmchgevalstart",
    "pmchgevalend",
    "pmchgapprovallevel",
    "pmchgapprovalstate",
    "pmchgrejectreason",
    "pmchghasconflicts",
    "pmchgconflictdate",
    "pmchgtype",
    "pmchgcat",
    "pmchgconcern",
    "pmchgskdprg",
    "pmchgtotaloutages",
    "pmchgprobabilityfailure",
    "pmchgfullyautomated",
    "pmchgoutageimpact",
    "pmchgmaximumassessedimpact",
    "pmchgoutage",
    "pmrelimpact",
    "pmrelurgency",
    "pmrelbackoutexeted",
    "pmrelsvcinstid",
    "rbarc",
    "actliccost",
    "estatapprliccost",
    "estliccost",
    "tloamlicensenum",
    "pmchgwfassist",
    "classificationid",
    "itdbckoutdur",
    "itdchcreatedby",
    "itdchcreatedbygroup",
    "itdcheck",
    "itdchgauthlevel",
    "itdchgbusimpct",
    "itdchgcustreq",
    "itdchgmgr",
    "itdchgpretstdtl",
    "itdclosurecode",
    "itdcreatedate",
    "itddoccounts",
    "itdleadtimedays",
    "itdownergroups",
    "itdowners",
    "itdexception",
    "amcrew",
    "crewworkgroup",
    "reqasstdwntime",
    "rbaretry",
    "apptrequired",
    "aos",
    "ams",
    "los",
    "lms",
    "pmchgskdprgscname",
    "itdrelmgr",
    "itdriskassessment"
})
public class WOCHANGEObjectType {

    @XmlElement(name = "WONUM")
    protected MXStringType wonum;
    @XmlElement(name = "PARENT")
    protected MXStringType parent;
    @XmlElement(name = "STATUS")
    protected MXDomainType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "WORKTYPE")
    protected MXStringType worktype;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "ASSETNUM")
    protected MXStringType assetnum;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElement(name = "JPNUM")
    protected MXStringType jpnum;
    @XmlElementRef(name = "FAILDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> faildate;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElementRef(name = "ESTDUR", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estdur;
    @XmlElementRef(name = "ESTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estlabhrs;
    @XmlElementRef(name = "ESTMATCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estmatcost;
    @XmlElementRef(name = "ESTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estlabcost;
    @XmlElementRef(name = "ESTTOOLCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> esttoolcost;
    @XmlElement(name = "PMNUM")
    protected MXStringType pmnum;
    @XmlElementRef(name = "ACTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actlabhrs;
    @XmlElementRef(name = "ACTMATCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actmatcost;
    @XmlElementRef(name = "ACTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actlabcost;
    @XmlElementRef(name = "ACTTOOLCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> acttoolcost;
    @XmlElement(name = "HASCHILDREN")
    protected MXBooleanType haschildren;
    @XmlElementRef(name = "OUTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outlabcost;
    @XmlElementRef(name = "OUTMATCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outmatcost;
    @XmlElementRef(name = "OUTTOOLCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outtoolcost;
    @XmlElement(name = "HISTORYFLAG")
    protected MXBooleanType historyflag;
    @XmlElement(name = "CONTRACT")
    protected MXStringType contract;
    @XmlElementRef(name = "WOPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wopriority;
    @XmlElementRef(name = "TARGCOMPDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targcompdate;
    @XmlElementRef(name = "TARGSTARTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targstartdate;
    @XmlElement(name = "WOEQ1")
    protected MXStringType woeq1;
    @XmlElement(name = "WOEQ2")
    protected MXStringType woeq2;
    @XmlElement(name = "WOEQ3")
    protected MXStringType woeq3;
    @XmlElement(name = "WOEQ4")
    protected MXStringType woeq4;
    @XmlElementRef(name = "WOEQ5", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq5;
    @XmlElementRef(name = "WOEQ6", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> woeq6;
    @XmlElementRef(name = "WOEQ7", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq7;
    @XmlElement(name = "WOEQ8")
    protected MXStringType woeq8;
    @XmlElement(name = "WOEQ9")
    protected MXStringType woeq9;
    @XmlElement(name = "WOEQ10")
    protected MXStringType woeq10;
    @XmlElement(name = "WOEQ11")
    protected MXStringType woeq11;
    @XmlElementRef(name = "WOEQ12", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq12;
    @XmlElement(name = "REPORTEDBY")
    protected MXStringType reportedby;
    @XmlElementRef(name = "REPORTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> reportdate;
    @XmlElement(name = "PHONE")
    protected MXStringType phone;
    @XmlElement(name = "PROBLEMCODE")
    protected MXStringType problemcode;
    @XmlElement(name = "CALENDAR")
    protected MXStringType calendar;
    @XmlElement(name = "DOWNTIME")
    protected MXBooleanType downtime;
    @XmlElementRef(name = "ACTSTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actstart;
    @XmlElementRef(name = "ACTFINISH", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actfinish;
    @XmlElementRef(name = "SCHEDSTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> schedstart;
    @XmlElementRef(name = "SCHEDFINISH", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> schedfinish;
    @XmlElementRef(name = "REMDUR", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> remdur;
    @XmlElement(name = "CREWID")
    protected MXStringType crewid;
    @XmlElement(name = "SUPERVISOR")
    protected MXStringType supervisor;
    @XmlElementRef(name = "WOEQ13", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> woeq13;
    @XmlElementRef(name = "WOEQ14", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq14;
    @XmlElement(name = "WOJP1")
    protected MXStringType wojp1;
    @XmlElement(name = "WOJP2")
    protected MXStringType wojp2;
    @XmlElement(name = "WOJP3")
    protected MXStringType wojp3;
    @XmlElementRef(name = "WOJP4", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wojp4;
    @XmlElementRef(name = "WOJP5", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> wojp5;
    @XmlElement(name = "WOL1")
    protected MXStringType wol1;
    @XmlElement(name = "WOL2")
    protected MXStringType wol2;
    @XmlElementRef(name = "WOL3", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wol3;
    @XmlElementRef(name = "WOL4", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> wol4;
    @XmlElement(name = "WOLABLNK")
    protected MXStringType wolablnk;
    @XmlElementRef(name = "RESPONDBY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> respondby;
    @XmlElementRef(name = "ASSETLOCPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> assetlocpriority;
    @XmlElementRef(name = "CALCPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> calcpriority;
    @XmlElement(name = "CHARGESTORE")
    protected MXBooleanType chargestore;
    @XmlElement(name = "FAILURECODE")
    protected MXStringType failurecode;
    @XmlElement(name = "WOLO1")
    protected MXStringType wolo1;
    @XmlElement(name = "WOLO2")
    protected MXStringType wolo2;
    @XmlElement(name = "WOLO3")
    protected MXStringType wolo3;
    @XmlElement(name = "WOLO4")
    protected MXStringType wolo4;
    @XmlElement(name = "WOLO5")
    protected MXStringType wolo5;
    @XmlElementRef(name = "WOLO6", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wolo6;
    @XmlElementRef(name = "WOLO7", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> wolo7;
    @XmlElementRef(name = "WOLO8", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wolo8;
    @XmlElement(name = "WOLO9")
    protected MXStringType wolo9;
    @XmlElementRef(name = "WOLO10", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wolo10;
    @XmlElement(name = "GLACCOUNT")
    protected MXGLAccountType glaccount;
    @XmlElementRef(name = "ESTSERVCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estservcost;
    @XmlElementRef(name = "ACTSERVCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actservcost;
    @XmlElement(name = "DISABLED")
    protected MXBooleanType disabled;
    @XmlElementRef(name = "ESTATAPPRLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprlabhrs;
    @XmlElementRef(name = "ESTATAPPRLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprlabcost;
    @XmlElementRef(name = "ESTATAPPRMATCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprmatcost;
    @XmlElementRef(name = "ESTATAPPRTOOLCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprtoolcost;
    @XmlElementRef(name = "ESTATAPPRSERVCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprservcost;
    @XmlElementRef(name = "WOSEQUENCE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wosequence;
    @XmlElement(name = "HASFOLLOWUPWORK")
    protected MXBooleanType hasfollowupwork;
    @XmlElement(name = "WORTS1")
    protected MXStringType worts1;
    @XmlElement(name = "WORTS2")
    protected MXStringType worts2;
    @XmlElement(name = "WORTS3")
    protected MXStringType worts3;
    @XmlElementRef(name = "WORTS4", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> worts4;
    @XmlElementRef(name = "WORTS5", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> worts5;
    @XmlElement(name = "SOURCESYSID")
    protected MXStringType sourcesysid;
    @XmlElement(name = "OWNERSYSID")
    protected MXStringType ownersysid;
    @XmlElementRef(name = "PMDUEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmduedate;
    @XmlElementRef(name = "PMEXTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmextdate;
    @XmlElementRef(name = "PMNEXTDUEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmnextduedate;
    @XmlElement(name = "WORKLOCATION")
    protected MXStringType worklocation;
    @XmlElement(name = "EXTERNALREFID")
    protected MXStringType externalrefid;
    @XmlElement(name = "SENDERSYSID")
    protected MXStringType sendersysid;
    @XmlElement(name = "FINCNTRLID")
    protected MXStringType fincntrlid;
    @XmlElement(name = "GENERATEDFORPO")
    protected MXStringType generatedforpo;
    @XmlElementRef(name = "GENFORPOLINEID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> genforpolineid;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "SITEID")
    protected MXStringType siteid;
    @XmlElementRef(name = "TASKID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> taskid;
    @XmlElement(name = "INSPECTOR")
    protected MXStringType inspector;
    @XmlElementRef(name = "MEASUREMENTVALUE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> measurementvalue;
    @XmlElementRef(name = "MEASUREDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> measuredate;
    @XmlElement(name = "OBSERVATION")
    protected MXStringType observation;
    @XmlElement(name = "POINTNUM")
    protected MXStringType pointnum;
    @XmlElement(name = "WOJO1")
    protected MXStringType wojo1;
    @XmlElement(name = "WOJO2")
    protected MXStringType wojo2;
    @XmlElement(name = "WOJO3")
    protected MXStringType wojo3;
    @XmlElementRef(name = "WOJO4", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wojo4;
    @XmlElement(name = "WOJO5")
    protected MXStringType wojo5;
    @XmlElement(name = "WOJO6")
    protected MXStringType wojo6;
    @XmlElement(name = "WOJO7")
    protected MXStringType wojo7;
    @XmlElement(name = "WOJO8")
    protected MXStringType wojo8;
    @XmlElement(name = "ISTASK")
    protected MXBooleanType istask;
    @XmlElement(name = "WOCLASS")
    protected MXDomainType woclass;
    @XmlElement(name = "ONBEHALFOF")
    protected MXStringType onbehalfof;
    @XmlElement(name = "VENDOR")
    protected MXStringType vendor;
    @XmlElement(name = "ORIGRECORDCLASS")
    protected MXStringType origrecordclass;
    @XmlElement(name = "ORIGRECORDID")
    protected MXStringType origrecordid;
    @XmlElement(name = "JUSTIFYPRIORITY")
    protected MXStringType justifypriority;
    @XmlElement(name = "RISK")
    protected MXDomainType risk;
    @XmlElement(name = "ENVIRONMENT")
    protected MXStringType environment;
    @XmlElement(name = "BACKOUTPLAN")
    protected MXStringType backoutplan;
    @XmlElement(name = "WOACCEPTSCHARGES")
    protected MXBooleanType woacceptscharges;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "PARENTCHGSSTATUS")
    protected MXBooleanType parentchgsstatus;
    @XmlElement(name = "OWNERGROUP")
    protected MXStringType ownergroup;
    @XmlElement(name = "COMMODITYGROUP")
    protected MXStringType commoditygroup;
    @XmlElement(name = "COMMODITY")
    protected MXStringType commodity;
    @XmlElementRef(name = "WORKORDERID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> workorderid;
    @XmlElement(name = "WHOMISCHANGEFOR")
    protected MXStringType whomischangefor;
    @XmlElement(name = "REASONFORCHANGE")
    protected MXStringType reasonforchange;
    @XmlElement(name = "VERIFICATION")
    protected MXStringType verification;
    @XmlElement(name = "PERSONGROUP")
    protected MXStringType persongroup;
    @XmlElement(name = "LEAD")
    protected MXStringType lead;
    @XmlElement(name = "LANGCODE")
    protected MXStringType langcode;
    @XmlElement(name = "INTERRUPTIBLE")
    protected MXBooleanType interruptible;
    @XmlElement(name = "WOGROUP")
    protected MXStringType wogroup;
    @XmlElement(name = "HASLD")
    protected MXBooleanType hasld;
    @XmlElement(name = "ROUTE")
    protected MXStringType route;
    @XmlElementRef(name = "ROUTESTOPID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> routestopid;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElementRef(name = "JOBTASKID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> jobtaskid;
    @XmlElement(name = "WOISSWAP")
    protected MXBooleanType woisswap;
    @XmlElement(name = "NEWCHILDCLASS")
    protected MXDomainType newchildclass;
    @XmlElement(name = "SUSPENDFLOW")
    protected MXBooleanType suspendflow;
    @XmlElement(name = "FLOWCONTROLLED")
    protected MXBooleanType flowcontrolled;
    @XmlElement(name = "FLOWACTIONASSIST")
    protected MXBooleanType flowactionassist;
    @XmlElement(name = "LAUNCHENTRYNAME")
    protected MXStringType launchentryname;
    @XmlElement(name = "TARGETDESC")
    protected MXStringType targetdesc;
    @XmlElement(name = "FLOWACTION")
    protected MXStringType flowaction;
    @XmlElement(name = "FIRSTAPPRSTATUS")
    protected MXStringType firstapprstatus;
    @XmlElement(name = "CALCORGID")
    protected MXStringType calcorgid;
    @XmlElement(name = "CALCCALENDAR")
    protected MXStringType calccalendar;
    @XmlElement(name = "CALCSHIFT")
    protected MXStringType calcshift;
    @XmlElement(name = "REPFACSITEID")
    protected MXStringType repfacsiteid;
    @XmlElement(name = "REPAIRFACILITY")
    protected MXStringType repairfacility;
    @XmlElementRef(name = "GENFORPOREVISION", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> genforporevision;
    @XmlElement(name = "STOREROOMMTLSTATUS")
    protected MXDomainType storeroommtlstatus;
    @XmlElement(name = "DIRISSUEMTLSTATUS")
    protected MXDomainType dirissuemtlstatus;
    @XmlElement(name = "WORKPACKMTLSTATUS")
    protected MXDomainType workpackmtlstatus;
    @XmlElement(name = "IGNORESRMAVAIL")
    protected MXBooleanType ignoresrmavail;
    @XmlElement(name = "IGNOREDIAVAIL")
    protected MXBooleanType ignorediavail;
    @XmlElementRef(name = "ESTINTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estintlabcost;
    @XmlElementRef(name = "ESTINTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estintlabhrs;
    @XmlElementRef(name = "ESTOUTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estoutlabhrs;
    @XmlElementRef(name = "ESTOUTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estoutlabcost;
    @XmlElementRef(name = "ACTINTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actintlabcost;
    @XmlElementRef(name = "ACTINTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actintlabhrs;
    @XmlElementRef(name = "ACTOUTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actoutlabhrs;
    @XmlElementRef(name = "ACTOUTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actoutlabcost;
    @XmlElementRef(name = "ESTATAPPRINTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprintlabcost;
    @XmlElementRef(name = "ESTATAPPRINTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprintlabhrs;
    @XmlElementRef(name = "ESTATAPPROUTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapproutlabhrs;
    @XmlElementRef(name = "ESTATAPPROUTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapproutlabcost;
    @XmlElement(name = "ASSIGNEDOWNERGROUP")
    protected MXStringType assignedownergroup;
    @XmlElementRef(name = "AVAILSTATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> availstatusdate;
    @XmlElementRef(name = "LASTCOPYLINKDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> lastcopylinkdate;
    @XmlElement(name = "NESTEDJPINPROCESS")
    protected MXBooleanType nestedjpinprocess;
    @XmlElementRef(name = "PLUSCFREQUENCY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pluscfrequency;
    @XmlElement(name = "PLUSCFREQUNIT")
    protected MXDomainType pluscfrequnit;
    @XmlElement(name = "PLUSCISMOBILE")
    protected MXBooleanType pluscismobile;
    @XmlElementRef(name = "PLUSCJPREVNUM", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pluscjprevnum;
    @XmlElement(name = "PLUSCLOOP")
    protected MXBooleanType pluscloop;
    @XmlElementRef(name = "PLUSCNEXTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pluscnextdate;
    @XmlElementRef(name = "PLUSCOVERDUEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pluscoverduedate;
    @XmlElement(name = "PLUSCPHYLOC")
    protected MXStringType pluscphyloc;
    @XmlElement(name = "INCTASKSINSCHED")
    protected MXBooleanType inctasksinsched;
    @XmlElementRef(name = "SNECONSTRAINT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> sneconstraint;
    @XmlElementRef(name = "FNLCONSTRAINT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> fnlconstraint;
    @XmlElementRef(name = "PLUSPQUOTEDPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pluspquotedprice;
    @XmlElement(name = "PLUSPQUOTETYPE")
    protected MXDomainType pluspquotetype;
    @XmlElement(name = "PLUSPCUSTCHACCT")
    protected MXStringType pluspcustchacct;
    @XmlElement(name = "PLUSPCOSTCENTER")
    protected MXStringType pluspcostcenter;
    @XmlElement(name = "PLUSPCUSTOMER")
    protected MXStringType pluspcustomer;
    @XmlElement(name = "PLUSPAGREEMENT")
    protected MXStringType pluspagreement;
    @XmlElement(name = "PLUSPLINESTATUS")
    protected MXStringType plusplinestatus;
    @XmlElement(name = "PLUSPORIGQTYPE")
    protected MXStringType plusporigqtype;
    @XmlElementRef(name = "PLUSPORIGQPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> plusporigqprice;
    @XmlElement(name = "PLUSPRESPONSEPLAN")
    protected MXStringType pluspresponseplan;
    @XmlElement(name = "PLUSPPRICESCHED")
    protected MXStringType plusppricesched;
    @XmlElementRef(name = "PLUSPMAXPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pluspmaxprice;
    @XmlElement(name = "PLUSPCUSTPONUM")
    protected MXStringType pluspcustponum;
    @XmlElementRef(name = "PLUSPREVNUM", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> plusprevnum;
    @XmlElement(name = "PLUSPPOREQ")
    protected MXBooleanType pluspporeq;
    @XmlElement(name = "PLUSPALLOWQUOTE")
    protected MXBooleanType pluspallowquote;
    @XmlElement(name = "PLUSPCALCORGID")
    protected MXStringType pluspcalcorgid;
    @XmlElement(name = "PLUSPCALCCALNUM")
    protected MXStringType pluspcalccalnum;
    @XmlElement(name = "PLUSPCALCSHIFT")
    protected MXStringType pluspcalcshift;
    @XmlElement(name = "PLUSPBILLAPPROVED")
    protected MXBooleanType pluspbillapproved;
    @XmlElement(name = "PMCOMTYPE")
    protected MXStringType pmcomtype;
    @XmlElement(name = "PMCOMSTATE")
    protected MXStringType pmcomstate;
    @XmlElement(name = "PMCOMBPELACTNAME")
    protected MXStringType pmcombpelactname;
    @XmlElement(name = "PMCOMBPELENABLED")
    protected MXBooleanType pmcombpelenabled;
    @XmlElement(name = "PMCOMBPELINPROG")
    protected MXBooleanType pmcombpelinprog;
    @XmlElementRef(name = "PMCOMIMPACT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomimpact;
    @XmlElementRef(name = "PMCOMURGENCY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomurgency;
    @XmlElement(name = "PMCOMFLOWSEQ")
    protected MXStringType pmcomflowseq;
    @XmlElement(name = "PMCHGPROGRESS")
    protected MXStringType pmchgprogress;
    @XmlElement(name = "PMCHGRELSTATE")
    protected MXDomainType pmchgrelstate;
    @XmlElement(name = "PMCHGRELID")
    protected MXStringType pmchgrelid;
    @XmlElement(name = "PMCHGRELSITEID")
    protected MXStringType pmchgrelsiteid;
    @XmlElement(name = "PMCHGRELORGID")
    protected MXStringType pmchgrelorgid;
    @XmlElement(name = "PMCHGISIMPTASK")
    protected MXBooleanType pmchgisimptask;
    @XmlElement(name = "PMCHGIMPDESC")
    protected MXStringType pmchgimpdesc;
    @XmlElementRef(name = "PMCHGIATECHSUMCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmchgiatechsumcost;
    @XmlElementRef(name = "PMCHGIABUSSUMCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmchgiabussumcost;
    @XmlElementRef(name = "PMCHGIABUSSUMEFF", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmchgiabussumeff;
    @XmlElementRef(name = "PMCHGIATECHSUMEFF", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmchgiatechsumeff;
    @XmlElement(name = "PMCHGIADEFREL")
    protected MXBooleanType pmchgiadefrel;
    @XmlElementRef(name = "PMCHGIATOTALCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmchgiatotalcost;
    @XmlElementRef(name = "PMCHGIATOTALEFF", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmchgiatotaleff;
    @XmlElementRef(name = "PMCHGEVALSTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmchgevalstart;
    @XmlElementRef(name = "PMCHGEVALEND", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmchgevalend;
    @XmlElementRef(name = "PMCHGAPPROVALLEVEL", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgapprovallevel;
    @XmlElement(name = "PMCHGAPPROVALSTATE")
    protected MXStringType pmchgapprovalstate;
    @XmlElement(name = "PMCHGREJECTREASON")
    protected MXStringType pmchgrejectreason;
    @XmlElement(name = "PMCHGHASCONFLICTS")
    protected MXBooleanType pmchghasconflicts;
    @XmlElementRef(name = "PMCHGCONFLICTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmchgconflictdate;
    @XmlElement(name = "PMCHGTYPE")
    protected MXDomainType pmchgtype;
    @XmlElement(name = "PMCHGCAT")
    protected MXDomainType pmchgcat;
    @XmlElement(name = "PMCHGCONCERN")
    protected MXStringType pmchgconcern;
    @XmlElement(name = "PMCHGSKDPRG")
    protected MXStringType pmchgskdprg;
    @XmlElementRef(name = "PMCHGTOTALOUTAGES", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgtotaloutages;
    @XmlElementRef(name = "PMCHGPROBABILITYFAILURE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgprobabilityfailure;
    @XmlElement(name = "PMCHGFULLYAUTOMATED")
    protected MXBooleanType pmchgfullyautomated;
    @XmlElementRef(name = "PMCHGOUTAGEIMPACT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgoutageimpact;
    @XmlElementRef(name = "PMCHGMAXIMUMASSESSEDIMPACT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmchgmaximumassessedimpact;
    @XmlElement(name = "PMCHGOUTAGE")
    protected MXDomainType pmchgoutage;
    @XmlElement(name = "PMRELIMPACT")
    protected MXStringType pmrelimpact;
    @XmlElement(name = "PMRELURGENCY")
    protected MXStringType pmrelurgency;
    @XmlElement(name = "PMRELBACKOUTEXETED")
    protected MXBooleanType pmrelbackoutexeted;
    @XmlElementRef(name = "PMRELSVCINSTID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmrelsvcinstid;
    @XmlElement(name = "RBA_RC")
    protected MXStringType rbarc;
    @XmlElementRef(name = "ACTLICCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actliccost;
    @XmlElementRef(name = "ESTATAPPRLICCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprliccost;
    @XmlElementRef(name = "ESTLICCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estliccost;
    @XmlElement(name = "TLOAMLICENSENUM")
    protected MXStringType tloamlicensenum;
    @XmlElement(name = "PMCHGWFASSIST")
    protected MXStringType pmchgwfassist;
    @XmlElement(name = "CLASSIFICATIONID")
    protected MXStringType classificationid;
    @XmlElementRef(name = "ITDBCKOUTDUR", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> itdbckoutdur;
    @XmlElement(name = "ITDCHCREATEDBY")
    protected MXStringType itdchcreatedby;
    @XmlElement(name = "ITDCHCREATEDBYGROUP")
    protected MXStringType itdchcreatedbygroup;
    @XmlElement(name = "ITDCHECK")
    protected MXBooleanType itdcheck;
    @XmlElementRef(name = "ITDCHGAUTHLEVEL", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> itdchgauthlevel;
    @XmlElement(name = "ITDCHGBUSIMPCT")
    protected MXBooleanType itdchgbusimpct;
    @XmlElement(name = "ITDCHGCUSTREQ")
    protected MXBooleanType itdchgcustreq;
    @XmlElement(name = "ITDCHGMGR")
    protected MXStringType itdchgmgr;
    @XmlElement(name = "ITDCHGPRETSTDTL")
    protected MXStringType itdchgpretstdtl;
    @XmlElement(name = "ITDCLOSURECODE")
    protected MXStringType itdclosurecode;
    @XmlElementRef(name = "ITDCREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> itdcreatedate;
    @XmlElementRef(name = "ITDDOCCOUNTS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> itddoccounts;
    @XmlElementRef(name = "ITDLEADTIMEDAYS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> itdleadtimedays;
    @XmlElement(name = "ITD_OWNERGROUP_S")
    protected MXStringType itdownergroups;
    @XmlElement(name = "ITD_OWNER_S")
    protected MXStringType itdowners;
    @XmlElement(name = "ITDEXCEPTION")
    protected MXStringType itdexception;
    @XmlElement(name = "AMCREW")
    protected MXStringType amcrew;
    @XmlElement(name = "CREWWORKGROUP")
    protected MXStringType crewworkgroup;
    @XmlElement(name = "REQASSTDWNTIME")
    protected MXBooleanType reqasstdwntime;
    @XmlElementRef(name = "RBA_RETRY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> rbaretry;
    @XmlElement(name = "APPTREQUIRED")
    protected MXBooleanType apptrequired;
    @XmlElement(name = "AOS")
    protected MXBooleanType aos;
    @XmlElement(name = "AMS")
    protected MXBooleanType ams;
    @XmlElement(name = "LOS")
    protected MXBooleanType los;
    @XmlElement(name = "LMS")
    protected MXBooleanType lms;
    @XmlElement(name = "PMCHGSKDPRGSCNAME")
    protected MXStringType pmchgskdprgscname;
    @XmlElement(name = "ITDRELMGR")
    protected MXStringType itdrelmgr;
    @XmlElement(name = "ITDRISKASSESSMENT")
    protected MXStringType itdriskassessment;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;

    /**
     * Gets the value of the wonum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWONUM() {
        return wonum;
    }

    /**
     * Sets the value of the wonum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWONUM(MXStringType value) {
        this.wonum = value;
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
     * Gets the value of the worktype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORKTYPE() {
        return worktype;
    }

    /**
     * Sets the value of the worktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORKTYPE(MXStringType value) {
        this.worktype = value;
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
     * Gets the value of the jpnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getJPNUM() {
        return jpnum;
    }

    /**
     * Sets the value of the jpnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setJPNUM(MXStringType value) {
        this.jpnum = value;
    }

    /**
     * Gets the value of the faildate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getFAILDATE() {
        return faildate;
    }

    /**
     * Sets the value of the faildate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setFAILDATE(JAXBElement<MXDateTimeType> value) {
        this.faildate = value;
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
     * Gets the value of the estdur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTDUR() {
        return estdur;
    }

    /**
     * Sets the value of the estdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTDUR(JAXBElement<MXDoubleType> value) {
        this.estdur = value;
    }

    /**
     * Gets the value of the estlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTLABHRS() {
        return estlabhrs;
    }

    /**
     * Sets the value of the estlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTLABHRS(JAXBElement<MXDoubleType> value) {
        this.estlabhrs = value;
    }

    /**
     * Gets the value of the estmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTMATCOST() {
        return estmatcost;
    }

    /**
     * Sets the value of the estmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTMATCOST(JAXBElement<MXDoubleType> value) {
        this.estmatcost = value;
    }

    /**
     * Gets the value of the estlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTLABCOST() {
        return estlabcost;
    }

    /**
     * Sets the value of the estlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTLABCOST(JAXBElement<MXDoubleType> value) {
        this.estlabcost = value;
    }

    /**
     * Gets the value of the esttoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTTOOLCOST() {
        return esttoolcost;
    }

    /**
     * Sets the value of the esttoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.esttoolcost = value;
    }

    /**
     * Gets the value of the pmnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMNUM() {
        return pmnum;
    }

    /**
     * Sets the value of the pmnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMNUM(MXStringType value) {
        this.pmnum = value;
    }

    /**
     * Gets the value of the actlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTLABHRS() {
        return actlabhrs;
    }

    /**
     * Sets the value of the actlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTLABHRS(JAXBElement<MXDoubleType> value) {
        this.actlabhrs = value;
    }

    /**
     * Gets the value of the actmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTMATCOST() {
        return actmatcost;
    }

    /**
     * Sets the value of the actmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTMATCOST(JAXBElement<MXDoubleType> value) {
        this.actmatcost = value;
    }

    /**
     * Gets the value of the actlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTLABCOST() {
        return actlabcost;
    }

    /**
     * Sets the value of the actlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTLABCOST(JAXBElement<MXDoubleType> value) {
        this.actlabcost = value;
    }

    /**
     * Gets the value of the acttoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTTOOLCOST() {
        return acttoolcost;
    }

    /**
     * Sets the value of the acttoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.acttoolcost = value;
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
     * Gets the value of the outlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getOUTLABCOST() {
        return outlabcost;
    }

    /**
     * Sets the value of the outlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setOUTLABCOST(JAXBElement<MXDoubleType> value) {
        this.outlabcost = value;
    }

    /**
     * Gets the value of the outmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getOUTMATCOST() {
        return outmatcost;
    }

    /**
     * Sets the value of the outmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setOUTMATCOST(JAXBElement<MXDoubleType> value) {
        this.outmatcost = value;
    }

    /**
     * Gets the value of the outtoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getOUTTOOLCOST() {
        return outtoolcost;
    }

    /**
     * Sets the value of the outtoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setOUTTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.outtoolcost = value;
    }

    /**
     * Gets the value of the historyflag property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHISTORYFLAG() {
        return historyflag;
    }

    /**
     * Sets the value of the historyflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHISTORYFLAG(MXBooleanType value) {
        this.historyflag = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONTRACT() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONTRACT(MXStringType value) {
        this.contract = value;
    }

    /**
     * Gets the value of the wopriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWOPRIORITY() {
        return wopriority;
    }

    /**
     * Sets the value of the wopriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWOPRIORITY(JAXBElement<MXLongType> value) {
        this.wopriority = value;
    }

    /**
     * Gets the value of the targcompdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTARGCOMPDATE() {
        return targcompdate;
    }

    /**
     * Sets the value of the targcompdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTARGCOMPDATE(JAXBElement<MXDateTimeType> value) {
        this.targcompdate = value;
    }

    /**
     * Gets the value of the targstartdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTARGSTARTDATE() {
        return targstartdate;
    }

    /**
     * Sets the value of the targstartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTARGSTARTDATE(JAXBElement<MXDateTimeType> value) {
        this.targstartdate = value;
    }

    /**
     * Gets the value of the woeq1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ1() {
        return woeq1;
    }

    /**
     * Sets the value of the woeq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ1(MXStringType value) {
        this.woeq1 = value;
    }

    /**
     * Gets the value of the woeq2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ2() {
        return woeq2;
    }

    /**
     * Sets the value of the woeq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ2(MXStringType value) {
        this.woeq2 = value;
    }

    /**
     * Gets the value of the woeq3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ3() {
        return woeq3;
    }

    /**
     * Sets the value of the woeq3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ3(MXStringType value) {
        this.woeq3 = value;
    }

    /**
     * Gets the value of the woeq4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ4() {
        return woeq4;
    }

    /**
     * Sets the value of the woeq4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ4(MXStringType value) {
        this.woeq4 = value;
    }

    /**
     * Gets the value of the woeq5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ5() {
        return woeq5;
    }

    /**
     * Sets the value of the woeq5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ5(JAXBElement<MXDoubleType> value) {
        this.woeq5 = value;
    }

    /**
     * Gets the value of the woeq6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOEQ6() {
        return woeq6;
    }

    /**
     * Sets the value of the woeq6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOEQ6(JAXBElement<MXDateTimeType> value) {
        this.woeq6 = value;
    }

    /**
     * Gets the value of the woeq7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ7() {
        return woeq7;
    }

    /**
     * Sets the value of the woeq7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ7(JAXBElement<MXDoubleType> value) {
        this.woeq7 = value;
    }

    /**
     * Gets the value of the woeq8 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ8() {
        return woeq8;
    }

    /**
     * Sets the value of the woeq8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ8(MXStringType value) {
        this.woeq8 = value;
    }

    /**
     * Gets the value of the woeq9 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ9() {
        return woeq9;
    }

    /**
     * Sets the value of the woeq9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ9(MXStringType value) {
        this.woeq9 = value;
    }

    /**
     * Gets the value of the woeq10 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ10() {
        return woeq10;
    }

    /**
     * Sets the value of the woeq10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ10(MXStringType value) {
        this.woeq10 = value;
    }

    /**
     * Gets the value of the woeq11 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ11() {
        return woeq11;
    }

    /**
     * Sets the value of the woeq11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ11(MXStringType value) {
        this.woeq11 = value;
    }

    /**
     * Gets the value of the woeq12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ12() {
        return woeq12;
    }

    /**
     * Sets the value of the woeq12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ12(JAXBElement<MXDoubleType> value) {
        this.woeq12 = value;
    }

    /**
     * Gets the value of the reportedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPORTEDBY() {
        return reportedby;
    }

    /**
     * Sets the value of the reportedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPORTEDBY(MXStringType value) {
        this.reportedby = value;
    }

    /**
     * Gets the value of the reportdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getREPORTDATE() {
        return reportdate;
    }

    /**
     * Sets the value of the reportdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setREPORTDATE(JAXBElement<MXDateTimeType> value) {
        this.reportdate = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPHONE(MXStringType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the problemcode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPROBLEMCODE() {
        return problemcode;
    }

    /**
     * Sets the value of the problemcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPROBLEMCODE(MXStringType value) {
        this.problemcode = value;
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
     * Gets the value of the downtime property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getDOWNTIME() {
        return downtime;
    }

    /**
     * Sets the value of the downtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setDOWNTIME(MXBooleanType value) {
        this.downtime = value;
    }

    /**
     * Gets the value of the actstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTSTART() {
        return actstart;
    }

    /**
     * Sets the value of the actstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTSTART(JAXBElement<MXDateTimeType> value) {
        this.actstart = value;
    }

    /**
     * Gets the value of the actfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTFINISH() {
        return actfinish;
    }

    /**
     * Sets the value of the actfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTFINISH(JAXBElement<MXDateTimeType> value) {
        this.actfinish = value;
    }

    /**
     * Gets the value of the schedstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSCHEDSTART() {
        return schedstart;
    }

    /**
     * Sets the value of the schedstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSCHEDSTART(JAXBElement<MXDateTimeType> value) {
        this.schedstart = value;
    }

    /**
     * Gets the value of the schedfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSCHEDFINISH() {
        return schedfinish;
    }

    /**
     * Sets the value of the schedfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSCHEDFINISH(JAXBElement<MXDateTimeType> value) {
        this.schedfinish = value;
    }

    /**
     * Gets the value of the remdur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getREMDUR() {
        return remdur;
    }

    /**
     * Sets the value of the remdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setREMDUR(JAXBElement<MXDoubleType> value) {
        this.remdur = value;
    }

    /**
     * Gets the value of the crewid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCREWID() {
        return crewid;
    }

    /**
     * Sets the value of the crewid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCREWID(MXStringType value) {
        this.crewid = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSUPERVISOR() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSUPERVISOR(MXStringType value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the woeq13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOEQ13() {
        return woeq13;
    }

    /**
     * Sets the value of the woeq13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOEQ13(JAXBElement<MXDateTimeType> value) {
        this.woeq13 = value;
    }

    /**
     * Gets the value of the woeq14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ14() {
        return woeq14;
    }

    /**
     * Sets the value of the woeq14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ14(JAXBElement<MXDoubleType> value) {
        this.woeq14 = value;
    }

    /**
     * Gets the value of the wojp1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJP1() {
        return wojp1;
    }

    /**
     * Sets the value of the wojp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJP1(MXStringType value) {
        this.wojp1 = value;
    }

    /**
     * Gets the value of the wojp2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJP2() {
        return wojp2;
    }

    /**
     * Sets the value of the wojp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJP2(MXStringType value) {
        this.wojp2 = value;
    }

    /**
     * Gets the value of the wojp3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJP3() {
        return wojp3;
    }

    /**
     * Sets the value of the wojp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJP3(MXStringType value) {
        this.wojp3 = value;
    }

    /**
     * Gets the value of the wojp4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOJP4() {
        return wojp4;
    }

    /**
     * Sets the value of the wojp4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOJP4(JAXBElement<MXDoubleType> value) {
        this.wojp4 = value;
    }

    /**
     * Gets the value of the wojp5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOJP5() {
        return wojp5;
    }

    /**
     * Sets the value of the wojp5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOJP5(JAXBElement<MXDateTimeType> value) {
        this.wojp5 = value;
    }

    /**
     * Gets the value of the wol1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOL1() {
        return wol1;
    }

    /**
     * Sets the value of the wol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOL1(MXStringType value) {
        this.wol1 = value;
    }

    /**
     * Gets the value of the wol2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOL2() {
        return wol2;
    }

    /**
     * Sets the value of the wol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOL2(MXStringType value) {
        this.wol2 = value;
    }

    /**
     * Gets the value of the wol3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOL3() {
        return wol3;
    }

    /**
     * Sets the value of the wol3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOL3(JAXBElement<MXDoubleType> value) {
        this.wol3 = value;
    }

    /**
     * Gets the value of the wol4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOL4() {
        return wol4;
    }

    /**
     * Sets the value of the wol4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOL4(JAXBElement<MXDateTimeType> value) {
        this.wol4 = value;
    }

    /**
     * Gets the value of the wolablnk property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLABLNK() {
        return wolablnk;
    }

    /**
     * Sets the value of the wolablnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLABLNK(MXStringType value) {
        this.wolablnk = value;
    }

    /**
     * Gets the value of the respondby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getRESPONDBY() {
        return respondby;
    }

    /**
     * Sets the value of the respondby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setRESPONDBY(JAXBElement<MXDateTimeType> value) {
        this.respondby = value;
    }

    /**
     * Gets the value of the assetlocpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getASSETLOCPRIORITY() {
        return assetlocpriority;
    }

    /**
     * Sets the value of the assetlocpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setASSETLOCPRIORITY(JAXBElement<MXLongType> value) {
        this.assetlocpriority = value;
    }

    /**
     * Gets the value of the calcpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getCALCPRIORITY() {
        return calcpriority;
    }

    /**
     * Sets the value of the calcpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setCALCPRIORITY(JAXBElement<MXLongType> value) {
        this.calcpriority = value;
    }

    /**
     * Gets the value of the chargestore property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCHARGESTORE() {
        return chargestore;
    }

    /**
     * Sets the value of the chargestore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCHARGESTORE(MXBooleanType value) {
        this.chargestore = value;
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
     * Gets the value of the wolo1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO1() {
        return wolo1;
    }

    /**
     * Sets the value of the wolo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO1(MXStringType value) {
        this.wolo1 = value;
    }

    /**
     * Gets the value of the wolo2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO2() {
        return wolo2;
    }

    /**
     * Sets the value of the wolo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO2(MXStringType value) {
        this.wolo2 = value;
    }

    /**
     * Gets the value of the wolo3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO3() {
        return wolo3;
    }

    /**
     * Sets the value of the wolo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO3(MXStringType value) {
        this.wolo3 = value;
    }

    /**
     * Gets the value of the wolo4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO4() {
        return wolo4;
    }

    /**
     * Sets the value of the wolo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO4(MXStringType value) {
        this.wolo4 = value;
    }

    /**
     * Gets the value of the wolo5 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO5() {
        return wolo5;
    }

    /**
     * Sets the value of the wolo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO5(MXStringType value) {
        this.wolo5 = value;
    }

    /**
     * Gets the value of the wolo6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOLO6() {
        return wolo6;
    }

    /**
     * Sets the value of the wolo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOLO6(JAXBElement<MXDoubleType> value) {
        this.wolo6 = value;
    }

    /**
     * Gets the value of the wolo7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOLO7() {
        return wolo7;
    }

    /**
     * Sets the value of the wolo7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOLO7(JAXBElement<MXDateTimeType> value) {
        this.wolo7 = value;
    }

    /**
     * Gets the value of the wolo8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOLO8() {
        return wolo8;
    }

    /**
     * Sets the value of the wolo8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOLO8(JAXBElement<MXDoubleType> value) {
        this.wolo8 = value;
    }

    /**
     * Gets the value of the wolo9 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO9() {
        return wolo9;
    }

    /**
     * Sets the value of the wolo9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO9(MXStringType value) {
        this.wolo9 = value;
    }

    /**
     * Gets the value of the wolo10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWOLO10() {
        return wolo10;
    }

    /**
     * Sets the value of the wolo10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWOLO10(JAXBElement<MXLongType> value) {
        this.wolo10 = value;
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
     * Gets the value of the estservcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTSERVCOST() {
        return estservcost;
    }

    /**
     * Sets the value of the estservcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTSERVCOST(JAXBElement<MXDoubleType> value) {
        this.estservcost = value;
    }

    /**
     * Gets the value of the actservcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTSERVCOST() {
        return actservcost;
    }

    /**
     * Sets the value of the actservcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTSERVCOST(JAXBElement<MXDoubleType> value) {
        this.actservcost = value;
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
     * Gets the value of the estatapprlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRLABHRS() {
        return estatapprlabhrs;
    }

    /**
     * Sets the value of the estatapprlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRLABHRS(JAXBElement<MXDoubleType> value) {
        this.estatapprlabhrs = value;
    }

    /**
     * Gets the value of the estatapprlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRLABCOST() {
        return estatapprlabcost;
    }

    /**
     * Sets the value of the estatapprlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRLABCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprlabcost = value;
    }

    /**
     * Gets the value of the estatapprmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRMATCOST() {
        return estatapprmatcost;
    }

    /**
     * Sets the value of the estatapprmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRMATCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprmatcost = value;
    }

    /**
     * Gets the value of the estatapprtoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRTOOLCOST() {
        return estatapprtoolcost;
    }

    /**
     * Sets the value of the estatapprtoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprtoolcost = value;
    }

    /**
     * Gets the value of the estatapprservcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRSERVCOST() {
        return estatapprservcost;
    }

    /**
     * Sets the value of the estatapprservcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRSERVCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprservcost = value;
    }

    /**
     * Gets the value of the wosequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWOSEQUENCE() {
        return wosequence;
    }

    /**
     * Sets the value of the wosequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWOSEQUENCE(JAXBElement<MXLongType> value) {
        this.wosequence = value;
    }

    /**
     * Gets the value of the hasfollowupwork property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASFOLLOWUPWORK() {
        return hasfollowupwork;
    }

    /**
     * Sets the value of the hasfollowupwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASFOLLOWUPWORK(MXBooleanType value) {
        this.hasfollowupwork = value;
    }

    /**
     * Gets the value of the worts1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORTS1() {
        return worts1;
    }

    /**
     * Sets the value of the worts1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORTS1(MXStringType value) {
        this.worts1 = value;
    }

    /**
     * Gets the value of the worts2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORTS2() {
        return worts2;
    }

    /**
     * Sets the value of the worts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORTS2(MXStringType value) {
        this.worts2 = value;
    }

    /**
     * Gets the value of the worts3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORTS3() {
        return worts3;
    }

    /**
     * Sets the value of the worts3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORTS3(MXStringType value) {
        this.worts3 = value;
    }

    /**
     * Gets the value of the worts4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWORTS4() {
        return worts4;
    }

    /**
     * Sets the value of the worts4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWORTS4(JAXBElement<MXDateTimeType> value) {
        this.worts4 = value;
    }

    /**
     * Gets the value of the worts5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWORTS5() {
        return worts5;
    }

    /**
     * Sets the value of the worts5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWORTS5(JAXBElement<MXDoubleType> value) {
        this.worts5 = value;
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
     * Gets the value of the pmduedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMDUEDATE() {
        return pmduedate;
    }

    /**
     * Sets the value of the pmduedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMDUEDATE(JAXBElement<MXDateTimeType> value) {
        this.pmduedate = value;
    }

    /**
     * Gets the value of the pmextdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMEXTDATE() {
        return pmextdate;
    }

    /**
     * Sets the value of the pmextdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMEXTDATE(JAXBElement<MXDateTimeType> value) {
        this.pmextdate = value;
    }

    /**
     * Gets the value of the pmnextduedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMNEXTDUEDATE() {
        return pmnextduedate;
    }

    /**
     * Sets the value of the pmnextduedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMNEXTDUEDATE(JAXBElement<MXDateTimeType> value) {
        this.pmnextduedate = value;
    }

    /**
     * Gets the value of the worklocation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORKLOCATION() {
        return worklocation;
    }

    /**
     * Sets the value of the worklocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORKLOCATION(MXStringType value) {
        this.worklocation = value;
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
     * Gets the value of the fincntrlid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFINCNTRLID() {
        return fincntrlid;
    }

    /**
     * Sets the value of the fincntrlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFINCNTRLID(MXStringType value) {
        this.fincntrlid = value;
    }

    /**
     * Gets the value of the generatedforpo property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGENERATEDFORPO() {
        return generatedforpo;
    }

    /**
     * Sets the value of the generatedforpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGENERATEDFORPO(MXStringType value) {
        this.generatedforpo = value;
    }

    /**
     * Gets the value of the genforpolineid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getGENFORPOLINEID() {
        return genforpolineid;
    }

    /**
     * Sets the value of the genforpolineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setGENFORPOLINEID(JAXBElement<MXLongType> value) {
        this.genforpolineid = value;
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
     * Gets the value of the siteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSITEID() {
        return siteid;
    }

    /**
     * Sets the value of the siteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSITEID(MXStringType value) {
        this.siteid = value;
    }

    /**
     * Gets the value of the taskid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getTASKID() {
        return taskid;
    }

    /**
     * Sets the value of the taskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setTASKID(JAXBElement<MXLongType> value) {
        this.taskid = value;
    }

    /**
     * Gets the value of the inspector property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getINSPECTOR() {
        return inspector;
    }

    /**
     * Sets the value of the inspector property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setINSPECTOR(MXStringType value) {
        this.inspector = value;
    }

    /**
     * Gets the value of the measurementvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getMEASUREMENTVALUE() {
        return measurementvalue;
    }

    /**
     * Sets the value of the measurementvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setMEASUREMENTVALUE(JAXBElement<MXDoubleType> value) {
        this.measurementvalue = value;
    }

    /**
     * Gets the value of the measuredate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getMEASUREDATE() {
        return measuredate;
    }

    /**
     * Sets the value of the measuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setMEASUREDATE(JAXBElement<MXDateTimeType> value) {
        this.measuredate = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOBSERVATION() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOBSERVATION(MXStringType value) {
        this.observation = value;
    }

    /**
     * Gets the value of the pointnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPOINTNUM() {
        return pointnum;
    }

    /**
     * Sets the value of the pointnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPOINTNUM(MXStringType value) {
        this.pointnum = value;
    }

    /**
     * Gets the value of the wojo1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO1() {
        return wojo1;
    }

    /**
     * Sets the value of the wojo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO1(MXStringType value) {
        this.wojo1 = value;
    }

    /**
     * Gets the value of the wojo2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO2() {
        return wojo2;
    }

    /**
     * Sets the value of the wojo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO2(MXStringType value) {
        this.wojo2 = value;
    }

    /**
     * Gets the value of the wojo3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO3() {
        return wojo3;
    }

    /**
     * Sets the value of the wojo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO3(MXStringType value) {
        this.wojo3 = value;
    }

    /**
     * Gets the value of the wojo4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOJO4() {
        return wojo4;
    }

    /**
     * Sets the value of the wojo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOJO4(JAXBElement<MXDoubleType> value) {
        this.wojo4 = value;
    }

    /**
     * Gets the value of the wojo5 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO5() {
        return wojo5;
    }

    /**
     * Sets the value of the wojo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO5(MXStringType value) {
        this.wojo5 = value;
    }

    /**
     * Gets the value of the wojo6 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO6() {
        return wojo6;
    }

    /**
     * Sets the value of the wojo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO6(MXStringType value) {
        this.wojo6 = value;
    }

    /**
     * Gets the value of the wojo7 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO7() {
        return wojo7;
    }

    /**
     * Sets the value of the wojo7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO7(MXStringType value) {
        this.wojo7 = value;
    }

    /**
     * Gets the value of the wojo8 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO8() {
        return wojo8;
    }

    /**
     * Sets the value of the wojo8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO8(MXStringType value) {
        this.wojo8 = value;
    }

    /**
     * Gets the value of the istask property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISTASK() {
        return istask;
    }

    /**
     * Sets the value of the istask property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISTASK(MXBooleanType value) {
        this.istask = value;
    }

    /**
     * Gets the value of the woclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getWOCLASS() {
        return woclass;
    }

    /**
     * Sets the value of the woclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setWOCLASS(MXDomainType value) {
        this.woclass = value;
    }

    /**
     * Gets the value of the onbehalfof property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getONBEHALFOF() {
        return onbehalfof;
    }

    /**
     * Sets the value of the onbehalfof property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setONBEHALFOF(MXStringType value) {
        this.onbehalfof = value;
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
     * Gets the value of the origrecordclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGRECORDCLASS() {
        return origrecordclass;
    }

    /**
     * Sets the value of the origrecordclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGRECORDCLASS(MXStringType value) {
        this.origrecordclass = value;
    }

    /**
     * Gets the value of the origrecordid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGRECORDID() {
        return origrecordid;
    }

    /**
     * Sets the value of the origrecordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGRECORDID(MXStringType value) {
        this.origrecordid = value;
    }

    /**
     * Gets the value of the justifypriority property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getJUSTIFYPRIORITY() {
        return justifypriority;
    }

    /**
     * Sets the value of the justifypriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setJUSTIFYPRIORITY(MXStringType value) {
        this.justifypriority = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getRISK() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setRISK(MXDomainType value) {
        this.risk = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getENVIRONMENT() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setENVIRONMENT(MXStringType value) {
        this.environment = value;
    }

    /**
     * Gets the value of the backoutplan property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBACKOUTPLAN() {
        return backoutplan;
    }

    /**
     * Sets the value of the backoutplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBACKOUTPLAN(MXStringType value) {
        this.backoutplan = value;
    }

    /**
     * Gets the value of the woacceptscharges property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getWOACCEPTSCHARGES() {
        return woacceptscharges;
    }

    /**
     * Sets the value of the woacceptscharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setWOACCEPTSCHARGES(MXBooleanType value) {
        this.woacceptscharges = value;
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
     * Gets the value of the parentchgsstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPARENTCHGSSTATUS() {
        return parentchgsstatus;
    }

    /**
     * Sets the value of the parentchgsstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPARENTCHGSSTATUS(MXBooleanType value) {
        this.parentchgsstatus = value;
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
     * Gets the value of the workorderid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWORKORDERID() {
        return workorderid;
    }

    /**
     * Sets the value of the workorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWORKORDERID(JAXBElement<MXLongType> value) {
        this.workorderid = value;
    }

    /**
     * Gets the value of the whomischangefor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWHOMISCHANGEFOR() {
        return whomischangefor;
    }

    /**
     * Sets the value of the whomischangefor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWHOMISCHANGEFOR(MXStringType value) {
        this.whomischangefor = value;
    }

    /**
     * Gets the value of the reasonforchange property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREASONFORCHANGE() {
        return reasonforchange;
    }

    /**
     * Sets the value of the reasonforchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREASONFORCHANGE(MXStringType value) {
        this.reasonforchange = value;
    }

    /**
     * Gets the value of the verification property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getVERIFICATION() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setVERIFICATION(MXStringType value) {
        this.verification = value;
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
     * Gets the value of the lead property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLEAD() {
        return lead;
    }

    /**
     * Sets the value of the lead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLEAD(MXStringType value) {
        this.lead = value;
    }

    /**
     * Gets the value of the langcode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLANGCODE() {
        return langcode;
    }

    /**
     * Sets the value of the langcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLANGCODE(MXStringType value) {
        this.langcode = value;
    }

    /**
     * Gets the value of the interruptible property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getINTERRUPTIBLE() {
        return interruptible;
    }

    /**
     * Sets the value of the interruptible property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setINTERRUPTIBLE(MXBooleanType value) {
        this.interruptible = value;
    }

    /**
     * Gets the value of the wogroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOGROUP() {
        return wogroup;
    }

    /**
     * Sets the value of the wogroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOGROUP(MXStringType value) {
        this.wogroup = value;
    }

    /**
     * Gets the value of the hasld property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASLD() {
        return hasld;
    }

    /**
     * Sets the value of the hasld property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASLD(MXBooleanType value) {
        this.hasld = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getROUTE() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setROUTE(MXStringType value) {
        this.route = value;
    }

    /**
     * Gets the value of the routestopid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getROUTESTOPID() {
        return routestopid;
    }

    /**
     * Sets the value of the routestopid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setROUTESTOPID(JAXBElement<MXLongType> value) {
        this.routestopid = value;
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
     * Gets the value of the jobtaskid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getJOBTASKID() {
        return jobtaskid;
    }

    /**
     * Sets the value of the jobtaskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setJOBTASKID(JAXBElement<MXLongType> value) {
        this.jobtaskid = value;
    }

    /**
     * Gets the value of the woisswap property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getWOISSWAP() {
        return woisswap;
    }

    /**
     * Sets the value of the woisswap property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setWOISSWAP(MXBooleanType value) {
        this.woisswap = value;
    }

    /**
     * Gets the value of the newchildclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getNEWCHILDCLASS() {
        return newchildclass;
    }

    /**
     * Sets the value of the newchildclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setNEWCHILDCLASS(MXDomainType value) {
        this.newchildclass = value;
    }

    /**
     * Gets the value of the suspendflow property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSUSPENDFLOW() {
        return suspendflow;
    }

    /**
     * Sets the value of the suspendflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSUSPENDFLOW(MXBooleanType value) {
        this.suspendflow = value;
    }

    /**
     * Gets the value of the flowcontrolled property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getFLOWCONTROLLED() {
        return flowcontrolled;
    }

    /**
     * Sets the value of the flowcontrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setFLOWCONTROLLED(MXBooleanType value) {
        this.flowcontrolled = value;
    }

    /**
     * Gets the value of the flowactionassist property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getFLOWACTIONASSIST() {
        return flowactionassist;
    }

    /**
     * Sets the value of the flowactionassist property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setFLOWACTIONASSIST(MXBooleanType value) {
        this.flowactionassist = value;
    }

    /**
     * Gets the value of the launchentryname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLAUNCHENTRYNAME() {
        return launchentryname;
    }

    /**
     * Sets the value of the launchentryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLAUNCHENTRYNAME(MXStringType value) {
        this.launchentryname = value;
    }

    /**
     * Gets the value of the targetdesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTARGETDESC() {
        return targetdesc;
    }

    /**
     * Sets the value of the targetdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTARGETDESC(MXStringType value) {
        this.targetdesc = value;
    }

    /**
     * Gets the value of the flowaction property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFLOWACTION() {
        return flowaction;
    }

    /**
     * Sets the value of the flowaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFLOWACTION(MXStringType value) {
        this.flowaction = value;
    }

    /**
     * Gets the value of the firstapprstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFIRSTAPPRSTATUS() {
        return firstapprstatus;
    }

    /**
     * Sets the value of the firstapprstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFIRSTAPPRSTATUS(MXStringType value) {
        this.firstapprstatus = value;
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
     * Gets the value of the repfacsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPFACSITEID() {
        return repfacsiteid;
    }

    /**
     * Sets the value of the repfacsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPFACSITEID(MXStringType value) {
        this.repfacsiteid = value;
    }

    /**
     * Gets the value of the repairfacility property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPAIRFACILITY() {
        return repairfacility;
    }

    /**
     * Sets the value of the repairfacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPAIRFACILITY(MXStringType value) {
        this.repairfacility = value;
    }

    /**
     * Gets the value of the genforporevision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getGENFORPOREVISION() {
        return genforporevision;
    }

    /**
     * Sets the value of the genforporevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setGENFORPOREVISION(JAXBElement<MXLongType> value) {
        this.genforporevision = value;
    }

    /**
     * Gets the value of the storeroommtlstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getSTOREROOMMTLSTATUS() {
        return storeroommtlstatus;
    }

    /**
     * Sets the value of the storeroommtlstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setSTOREROOMMTLSTATUS(MXDomainType value) {
        this.storeroommtlstatus = value;
    }

    /**
     * Gets the value of the dirissuemtlstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getDIRISSUEMTLSTATUS() {
        return dirissuemtlstatus;
    }

    /**
     * Sets the value of the dirissuemtlstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setDIRISSUEMTLSTATUS(MXDomainType value) {
        this.dirissuemtlstatus = value;
    }

    /**
     * Gets the value of the workpackmtlstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getWORKPACKMTLSTATUS() {
        return workpackmtlstatus;
    }

    /**
     * Sets the value of the workpackmtlstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setWORKPACKMTLSTATUS(MXDomainType value) {
        this.workpackmtlstatus = value;
    }

    /**
     * Gets the value of the ignoresrmavail property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getIGNORESRMAVAIL() {
        return ignoresrmavail;
    }

    /**
     * Sets the value of the ignoresrmavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setIGNORESRMAVAIL(MXBooleanType value) {
        this.ignoresrmavail = value;
    }

    /**
     * Gets the value of the ignorediavail property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getIGNOREDIAVAIL() {
        return ignorediavail;
    }

    /**
     * Sets the value of the ignorediavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setIGNOREDIAVAIL(MXBooleanType value) {
        this.ignorediavail = value;
    }

    /**
     * Gets the value of the estintlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTINTLABCOST() {
        return estintlabcost;
    }

    /**
     * Sets the value of the estintlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTINTLABCOST(JAXBElement<MXDoubleType> value) {
        this.estintlabcost = value;
    }

    /**
     * Gets the value of the estintlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTINTLABHRS() {
        return estintlabhrs;
    }

    /**
     * Sets the value of the estintlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTINTLABHRS(JAXBElement<MXDoubleType> value) {
        this.estintlabhrs = value;
    }

    /**
     * Gets the value of the estoutlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTOUTLABHRS() {
        return estoutlabhrs;
    }

    /**
     * Sets the value of the estoutlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTOUTLABHRS(JAXBElement<MXDoubleType> value) {
        this.estoutlabhrs = value;
    }

    /**
     * Gets the value of the estoutlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTOUTLABCOST() {
        return estoutlabcost;
    }

    /**
     * Sets the value of the estoutlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTOUTLABCOST(JAXBElement<MXDoubleType> value) {
        this.estoutlabcost = value;
    }

    /**
     * Gets the value of the actintlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTINTLABCOST() {
        return actintlabcost;
    }

    /**
     * Sets the value of the actintlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTINTLABCOST(JAXBElement<MXDoubleType> value) {
        this.actintlabcost = value;
    }

    /**
     * Gets the value of the actintlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTINTLABHRS() {
        return actintlabhrs;
    }

    /**
     * Sets the value of the actintlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTINTLABHRS(JAXBElement<MXDoubleType> value) {
        this.actintlabhrs = value;
    }

    /**
     * Gets the value of the actoutlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTOUTLABHRS() {
        return actoutlabhrs;
    }

    /**
     * Sets the value of the actoutlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTOUTLABHRS(JAXBElement<MXDoubleType> value) {
        this.actoutlabhrs = value;
    }

    /**
     * Gets the value of the actoutlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTOUTLABCOST() {
        return actoutlabcost;
    }

    /**
     * Sets the value of the actoutlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTOUTLABCOST(JAXBElement<MXDoubleType> value) {
        this.actoutlabcost = value;
    }

    /**
     * Gets the value of the estatapprintlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRINTLABCOST() {
        return estatapprintlabcost;
    }

    /**
     * Sets the value of the estatapprintlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRINTLABCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprintlabcost = value;
    }

    /**
     * Gets the value of the estatapprintlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRINTLABHRS() {
        return estatapprintlabhrs;
    }

    /**
     * Sets the value of the estatapprintlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRINTLABHRS(JAXBElement<MXDoubleType> value) {
        this.estatapprintlabhrs = value;
    }

    /**
     * Gets the value of the estatapproutlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPROUTLABHRS() {
        return estatapproutlabhrs;
    }

    /**
     * Sets the value of the estatapproutlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPROUTLABHRS(JAXBElement<MXDoubleType> value) {
        this.estatapproutlabhrs = value;
    }

    /**
     * Gets the value of the estatapproutlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPROUTLABCOST() {
        return estatapproutlabcost;
    }

    /**
     * Sets the value of the estatapproutlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPROUTLABCOST(JAXBElement<MXDoubleType> value) {
        this.estatapproutlabcost = value;
    }

    /**
     * Gets the value of the assignedownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNEDOWNERGROUP() {
        return assignedownergroup;
    }

    /**
     * Sets the value of the assignedownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNEDOWNERGROUP(MXStringType value) {
        this.assignedownergroup = value;
    }

    /**
     * Gets the value of the availstatusdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getAVAILSTATUSDATE() {
        return availstatusdate;
    }

    /**
     * Sets the value of the availstatusdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setAVAILSTATUSDATE(JAXBElement<MXDateTimeType> value) {
        this.availstatusdate = value;
    }

    /**
     * Gets the value of the lastcopylinkdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getLASTCOPYLINKDATE() {
        return lastcopylinkdate;
    }

    /**
     * Sets the value of the lastcopylinkdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setLASTCOPYLINKDATE(JAXBElement<MXDateTimeType> value) {
        this.lastcopylinkdate = value;
    }

    /**
     * Gets the value of the nestedjpinprocess property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getNESTEDJPINPROCESS() {
        return nestedjpinprocess;
    }

    /**
     * Sets the value of the nestedjpinprocess property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setNESTEDJPINPROCESS(MXBooleanType value) {
        this.nestedjpinprocess = value;
    }

    /**
     * Gets the value of the pluscfrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPLUSCFREQUENCY() {
        return pluscfrequency;
    }

    /**
     * Sets the value of the pluscfrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPLUSCFREQUENCY(JAXBElement<MXLongType> value) {
        this.pluscfrequency = value;
    }

    /**
     * Gets the value of the pluscfrequnit property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPLUSCFREQUNIT() {
        return pluscfrequnit;
    }

    /**
     * Sets the value of the pluscfrequnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPLUSCFREQUNIT(MXDomainType value) {
        this.pluscfrequnit = value;
    }

    /**
     * Gets the value of the pluscismobile property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSCISMOBILE() {
        return pluscismobile;
    }

    /**
     * Sets the value of the pluscismobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSCISMOBILE(MXBooleanType value) {
        this.pluscismobile = value;
    }

    /**
     * Gets the value of the pluscjprevnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPLUSCJPREVNUM() {
        return pluscjprevnum;
    }

    /**
     * Sets the value of the pluscjprevnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPLUSCJPREVNUM(JAXBElement<MXLongType> value) {
        this.pluscjprevnum = value;
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
     * Gets the value of the pluscnextdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPLUSCNEXTDATE() {
        return pluscnextdate;
    }

    /**
     * Sets the value of the pluscnextdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPLUSCNEXTDATE(JAXBElement<MXDateTimeType> value) {
        this.pluscnextdate = value;
    }

    /**
     * Gets the value of the pluscoverduedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPLUSCOVERDUEDATE() {
        return pluscoverduedate;
    }

    /**
     * Sets the value of the pluscoverduedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPLUSCOVERDUEDATE(JAXBElement<MXDateTimeType> value) {
        this.pluscoverduedate = value;
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
     * Gets the value of the inctasksinsched property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getINCTASKSINSCHED() {
        return inctasksinsched;
    }

    /**
     * Sets the value of the inctasksinsched property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setINCTASKSINSCHED(MXBooleanType value) {
        this.inctasksinsched = value;
    }

    /**
     * Gets the value of the sneconstraint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSNECONSTRAINT() {
        return sneconstraint;
    }

    /**
     * Sets the value of the sneconstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSNECONSTRAINT(JAXBElement<MXDateTimeType> value) {
        this.sneconstraint = value;
    }

    /**
     * Gets the value of the fnlconstraint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getFNLCONSTRAINT() {
        return fnlconstraint;
    }

    /**
     * Sets the value of the fnlconstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setFNLCONSTRAINT(JAXBElement<MXDateTimeType> value) {
        this.fnlconstraint = value;
    }

    /**
     * Gets the value of the pluspquotedprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPQUOTEDPRICE() {
        return pluspquotedprice;
    }

    /**
     * Sets the value of the pluspquotedprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPQUOTEDPRICE(JAXBElement<MXDoubleType> value) {
        this.pluspquotedprice = value;
    }

    /**
     * Gets the value of the pluspquotetype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPLUSPQUOTETYPE() {
        return pluspquotetype;
    }

    /**
     * Sets the value of the pluspquotetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPLUSPQUOTETYPE(MXDomainType value) {
        this.pluspquotetype = value;
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
     * Gets the value of the pluspagreement property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPAGREEMENT() {
        return pluspagreement;
    }

    /**
     * Sets the value of the pluspagreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPAGREEMENT(MXStringType value) {
        this.pluspagreement = value;
    }

    /**
     * Gets the value of the plusplinestatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPLINESTATUS() {
        return plusplinestatus;
    }

    /**
     * Sets the value of the plusplinestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPLINESTATUS(MXStringType value) {
        this.plusplinestatus = value;
    }

    /**
     * Gets the value of the plusporigqtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPORIGQTYPE() {
        return plusporigqtype;
    }

    /**
     * Sets the value of the plusporigqtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPORIGQTYPE(MXStringType value) {
        this.plusporigqtype = value;
    }

    /**
     * Gets the value of the plusporigqprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPORIGQPRICE() {
        return plusporigqprice;
    }

    /**
     * Sets the value of the plusporigqprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPORIGQPRICE(JAXBElement<MXDoubleType> value) {
        this.plusporigqprice = value;
    }

    /**
     * Gets the value of the pluspresponseplan property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPRESPONSEPLAN() {
        return pluspresponseplan;
    }

    /**
     * Sets the value of the pluspresponseplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPRESPONSEPLAN(MXStringType value) {
        this.pluspresponseplan = value;
    }

    /**
     * Gets the value of the plusppricesched property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPPRICESCHED() {
        return plusppricesched;
    }

    /**
     * Sets the value of the plusppricesched property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPPRICESCHED(MXStringType value) {
        this.plusppricesched = value;
    }

    /**
     * Gets the value of the pluspmaxprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPMAXPRICE() {
        return pluspmaxprice;
    }

    /**
     * Sets the value of the pluspmaxprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPMAXPRICE(JAXBElement<MXDoubleType> value) {
        this.pluspmaxprice = value;
    }

    /**
     * Gets the value of the pluspcustponum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCUSTPONUM() {
        return pluspcustponum;
    }

    /**
     * Sets the value of the pluspcustponum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCUSTPONUM(MXStringType value) {
        this.pluspcustponum = value;
    }

    /**
     * Gets the value of the plusprevnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPLUSPREVNUM() {
        return plusprevnum;
    }

    /**
     * Sets the value of the plusprevnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPLUSPREVNUM(JAXBElement<MXLongType> value) {
        this.plusprevnum = value;
    }

    /**
     * Gets the value of the pluspporeq property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPPOREQ() {
        return pluspporeq;
    }

    /**
     * Sets the value of the pluspporeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPPOREQ(MXBooleanType value) {
        this.pluspporeq = value;
    }

    /**
     * Gets the value of the pluspallowquote property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPALLOWQUOTE() {
        return pluspallowquote;
    }

    /**
     * Sets the value of the pluspallowquote property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPALLOWQUOTE(MXBooleanType value) {
        this.pluspallowquote = value;
    }

    /**
     * Gets the value of the pluspcalcorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCALCORGID() {
        return pluspcalcorgid;
    }

    /**
     * Sets the value of the pluspcalcorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCALCORGID(MXStringType value) {
        this.pluspcalcorgid = value;
    }

    /**
     * Gets the value of the pluspcalccalnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCALCCALNUM() {
        return pluspcalccalnum;
    }

    /**
     * Sets the value of the pluspcalccalnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCALCCALNUM(MXStringType value) {
        this.pluspcalccalnum = value;
    }

    /**
     * Gets the value of the pluspcalcshift property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCALCSHIFT() {
        return pluspcalcshift;
    }

    /**
     * Sets the value of the pluspcalcshift property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCALCSHIFT(MXStringType value) {
        this.pluspcalcshift = value;
    }

    /**
     * Gets the value of the pluspbillapproved property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPBILLAPPROVED() {
        return pluspbillapproved;
    }

    /**
     * Sets the value of the pluspbillapproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPBILLAPPROVED(MXBooleanType value) {
        this.pluspbillapproved = value;
    }

    /**
     * Gets the value of the pmcomtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMTYPE() {
        return pmcomtype;
    }

    /**
     * Sets the value of the pmcomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMTYPE(MXStringType value) {
        this.pmcomtype = value;
    }

    /**
     * Gets the value of the pmcomstate property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMSTATE() {
        return pmcomstate;
    }

    /**
     * Sets the value of the pmcomstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMSTATE(MXStringType value) {
        this.pmcomstate = value;
    }

    /**
     * Gets the value of the pmcombpelactname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMBPELACTNAME() {
        return pmcombpelactname;
    }

    /**
     * Sets the value of the pmcombpelactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMBPELACTNAME(MXStringType value) {
        this.pmcombpelactname = value;
    }

    /**
     * Gets the value of the pmcombpelenabled property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCOMBPELENABLED() {
        return pmcombpelenabled;
    }

    /**
     * Sets the value of the pmcombpelenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCOMBPELENABLED(MXBooleanType value) {
        this.pmcombpelenabled = value;
    }

    /**
     * Gets the value of the pmcombpelinprog property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCOMBPELINPROG() {
        return pmcombpelinprog;
    }

    /**
     * Sets the value of the pmcombpelinprog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCOMBPELINPROG(MXBooleanType value) {
        this.pmcombpelinprog = value;
    }

    /**
     * Gets the value of the pmcomimpact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCOMIMPACT() {
        return pmcomimpact;
    }

    /**
     * Sets the value of the pmcomimpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCOMIMPACT(JAXBElement<MXLongType> value) {
        this.pmcomimpact = value;
    }

    /**
     * Gets the value of the pmcomurgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCOMURGENCY() {
        return pmcomurgency;
    }

    /**
     * Sets the value of the pmcomurgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCOMURGENCY(JAXBElement<MXLongType> value) {
        this.pmcomurgency = value;
    }

    /**
     * Gets the value of the pmcomflowseq property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMFLOWSEQ() {
        return pmcomflowseq;
    }

    /**
     * Sets the value of the pmcomflowseq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMFLOWSEQ(MXStringType value) {
        this.pmcomflowseq = value;
    }

    /**
     * Gets the value of the pmchgprogress property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGPROGRESS() {
        return pmchgprogress;
    }

    /**
     * Sets the value of the pmchgprogress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGPROGRESS(MXStringType value) {
        this.pmchgprogress = value;
    }

    /**
     * Gets the value of the pmchgrelstate property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPMCHGRELSTATE() {
        return pmchgrelstate;
    }

    /**
     * Sets the value of the pmchgrelstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPMCHGRELSTATE(MXDomainType value) {
        this.pmchgrelstate = value;
    }

    /**
     * Gets the value of the pmchgrelid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGRELID() {
        return pmchgrelid;
    }

    /**
     * Sets the value of the pmchgrelid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGRELID(MXStringType value) {
        this.pmchgrelid = value;
    }

    /**
     * Gets the value of the pmchgrelsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGRELSITEID() {
        return pmchgrelsiteid;
    }

    /**
     * Sets the value of the pmchgrelsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGRELSITEID(MXStringType value) {
        this.pmchgrelsiteid = value;
    }

    /**
     * Gets the value of the pmchgrelorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGRELORGID() {
        return pmchgrelorgid;
    }

    /**
     * Sets the value of the pmchgrelorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGRELORGID(MXStringType value) {
        this.pmchgrelorgid = value;
    }

    /**
     * Gets the value of the pmchgisimptask property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCHGISIMPTASK() {
        return pmchgisimptask;
    }

    /**
     * Sets the value of the pmchgisimptask property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCHGISIMPTASK(MXBooleanType value) {
        this.pmchgisimptask = value;
    }

    /**
     * Gets the value of the pmchgimpdesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGIMPDESC() {
        return pmchgimpdesc;
    }

    /**
     * Sets the value of the pmchgimpdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGIMPDESC(MXStringType value) {
        this.pmchgimpdesc = value;
    }

    /**
     * Gets the value of the pmchgiatechsumcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMCHGIATECHSUMCOST() {
        return pmchgiatechsumcost;
    }

    /**
     * Sets the value of the pmchgiatechsumcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMCHGIATECHSUMCOST(JAXBElement<MXDoubleType> value) {
        this.pmchgiatechsumcost = value;
    }

    /**
     * Gets the value of the pmchgiabussumcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMCHGIABUSSUMCOST() {
        return pmchgiabussumcost;
    }

    /**
     * Sets the value of the pmchgiabussumcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMCHGIABUSSUMCOST(JAXBElement<MXDoubleType> value) {
        this.pmchgiabussumcost = value;
    }

    /**
     * Gets the value of the pmchgiabussumeff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMCHGIABUSSUMEFF() {
        return pmchgiabussumeff;
    }

    /**
     * Sets the value of the pmchgiabussumeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMCHGIABUSSUMEFF(JAXBElement<MXDoubleType> value) {
        this.pmchgiabussumeff = value;
    }

    /**
     * Gets the value of the pmchgiatechsumeff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMCHGIATECHSUMEFF() {
        return pmchgiatechsumeff;
    }

    /**
     * Sets the value of the pmchgiatechsumeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMCHGIATECHSUMEFF(JAXBElement<MXDoubleType> value) {
        this.pmchgiatechsumeff = value;
    }

    /**
     * Gets the value of the pmchgiadefrel property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCHGIADEFREL() {
        return pmchgiadefrel;
    }

    /**
     * Sets the value of the pmchgiadefrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCHGIADEFREL(MXBooleanType value) {
        this.pmchgiadefrel = value;
    }

    /**
     * Gets the value of the pmchgiatotalcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMCHGIATOTALCOST() {
        return pmchgiatotalcost;
    }

    /**
     * Sets the value of the pmchgiatotalcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMCHGIATOTALCOST(JAXBElement<MXDoubleType> value) {
        this.pmchgiatotalcost = value;
    }

    /**
     * Gets the value of the pmchgiatotaleff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMCHGIATOTALEFF() {
        return pmchgiatotaleff;
    }

    /**
     * Sets the value of the pmchgiatotaleff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMCHGIATOTALEFF(JAXBElement<MXDoubleType> value) {
        this.pmchgiatotaleff = value;
    }

    /**
     * Gets the value of the pmchgevalstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMCHGEVALSTART() {
        return pmchgevalstart;
    }

    /**
     * Sets the value of the pmchgevalstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMCHGEVALSTART(JAXBElement<MXDateTimeType> value) {
        this.pmchgevalstart = value;
    }

    /**
     * Gets the value of the pmchgevalend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMCHGEVALEND() {
        return pmchgevalend;
    }

    /**
     * Sets the value of the pmchgevalend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMCHGEVALEND(JAXBElement<MXDateTimeType> value) {
        this.pmchgevalend = value;
    }

    /**
     * Gets the value of the pmchgapprovallevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGAPPROVALLEVEL() {
        return pmchgapprovallevel;
    }

    /**
     * Sets the value of the pmchgapprovallevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGAPPROVALLEVEL(JAXBElement<MXLongType> value) {
        this.pmchgapprovallevel = value;
    }

    /**
     * Gets the value of the pmchgapprovalstate property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGAPPROVALSTATE() {
        return pmchgapprovalstate;
    }

    /**
     * Sets the value of the pmchgapprovalstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGAPPROVALSTATE(MXStringType value) {
        this.pmchgapprovalstate = value;
    }

    /**
     * Gets the value of the pmchgrejectreason property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGREJECTREASON() {
        return pmchgrejectreason;
    }

    /**
     * Sets the value of the pmchgrejectreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGREJECTREASON(MXStringType value) {
        this.pmchgrejectreason = value;
    }

    /**
     * Gets the value of the pmchghasconflicts property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCHGHASCONFLICTS() {
        return pmchghasconflicts;
    }

    /**
     * Sets the value of the pmchghasconflicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCHGHASCONFLICTS(MXBooleanType value) {
        this.pmchghasconflicts = value;
    }

    /**
     * Gets the value of the pmchgconflictdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMCHGCONFLICTDATE() {
        return pmchgconflictdate;
    }

    /**
     * Sets the value of the pmchgconflictdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMCHGCONFLICTDATE(JAXBElement<MXDateTimeType> value) {
        this.pmchgconflictdate = value;
    }

    /**
     * Gets the value of the pmchgtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPMCHGTYPE() {
        return pmchgtype;
    }

    /**
     * Sets the value of the pmchgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPMCHGTYPE(MXDomainType value) {
        this.pmchgtype = value;
    }

    /**
     * Gets the value of the pmchgcat property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPMCHGCAT() {
        return pmchgcat;
    }

    /**
     * Sets the value of the pmchgcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPMCHGCAT(MXDomainType value) {
        this.pmchgcat = value;
    }

    /**
     * Gets the value of the pmchgconcern property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGCONCERN() {
        return pmchgconcern;
    }

    /**
     * Sets the value of the pmchgconcern property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGCONCERN(MXStringType value) {
        this.pmchgconcern = value;
    }

    /**
     * Gets the value of the pmchgskdprg property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGSKDPRG() {
        return pmchgskdprg;
    }

    /**
     * Sets the value of the pmchgskdprg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGSKDPRG(MXStringType value) {
        this.pmchgskdprg = value;
    }

    /**
     * Gets the value of the pmchgtotaloutages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGTOTALOUTAGES() {
        return pmchgtotaloutages;
    }

    /**
     * Sets the value of the pmchgtotaloutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGTOTALOUTAGES(JAXBElement<MXLongType> value) {
        this.pmchgtotaloutages = value;
    }

    /**
     * Gets the value of the pmchgprobabilityfailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGPROBABILITYFAILURE() {
        return pmchgprobabilityfailure;
    }

    /**
     * Sets the value of the pmchgprobabilityfailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGPROBABILITYFAILURE(JAXBElement<MXLongType> value) {
        this.pmchgprobabilityfailure = value;
    }

    /**
     * Gets the value of the pmchgfullyautomated property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCHGFULLYAUTOMATED() {
        return pmchgfullyautomated;
    }

    /**
     * Sets the value of the pmchgfullyautomated property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCHGFULLYAUTOMATED(MXBooleanType value) {
        this.pmchgfullyautomated = value;
    }

    /**
     * Gets the value of the pmchgoutageimpact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGOUTAGEIMPACT() {
        return pmchgoutageimpact;
    }

    /**
     * Sets the value of the pmchgoutageimpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGOUTAGEIMPACT(JAXBElement<MXLongType> value) {
        this.pmchgoutageimpact = value;
    }

    /**
     * Gets the value of the pmchgmaximumassessedimpact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCHGMAXIMUMASSESSEDIMPACT() {
        return pmchgmaximumassessedimpact;
    }

    /**
     * Sets the value of the pmchgmaximumassessedimpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCHGMAXIMUMASSESSEDIMPACT(JAXBElement<MXLongType> value) {
        this.pmchgmaximumassessedimpact = value;
    }

    /**
     * Gets the value of the pmchgoutage property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPMCHGOUTAGE() {
        return pmchgoutage;
    }

    /**
     * Sets the value of the pmchgoutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPMCHGOUTAGE(MXDomainType value) {
        this.pmchgoutage = value;
    }

    /**
     * Gets the value of the pmrelimpact property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMRELIMPACT() {
        return pmrelimpact;
    }

    /**
     * Sets the value of the pmrelimpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMRELIMPACT(MXStringType value) {
        this.pmrelimpact = value;
    }

    /**
     * Gets the value of the pmrelurgency property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMRELURGENCY() {
        return pmrelurgency;
    }

    /**
     * Sets the value of the pmrelurgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMRELURGENCY(MXStringType value) {
        this.pmrelurgency = value;
    }

    /**
     * Gets the value of the pmrelbackoutexeted property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMRELBACKOUTEXETED() {
        return pmrelbackoutexeted;
    }

    /**
     * Sets the value of the pmrelbackoutexeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMRELBACKOUTEXETED(MXBooleanType value) {
        this.pmrelbackoutexeted = value;
    }

    /**
     * Gets the value of the pmrelsvcinstid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMRELSVCINSTID() {
        return pmrelsvcinstid;
    }

    /**
     * Sets the value of the pmrelsvcinstid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMRELSVCINSTID(JAXBElement<MXLongType> value) {
        this.pmrelsvcinstid = value;
    }

    /**
     * Gets the value of the rbarc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRBARC() {
        return rbarc;
    }

    /**
     * Sets the value of the rbarc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRBARC(MXStringType value) {
        this.rbarc = value;
    }

    /**
     * Gets the value of the actliccost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTLICCOST() {
        return actliccost;
    }

    /**
     * Sets the value of the actliccost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTLICCOST(JAXBElement<MXDoubleType> value) {
        this.actliccost = value;
    }

    /**
     * Gets the value of the estatapprliccost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRLICCOST() {
        return estatapprliccost;
    }

    /**
     * Sets the value of the estatapprliccost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRLICCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprliccost = value;
    }

    /**
     * Gets the value of the estliccost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTLICCOST() {
        return estliccost;
    }

    /**
     * Sets the value of the estliccost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTLICCOST(JAXBElement<MXDoubleType> value) {
        this.estliccost = value;
    }

    /**
     * Gets the value of the tloamlicensenum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTLOAMLICENSENUM() {
        return tloamlicensenum;
    }

    /**
     * Sets the value of the tloamlicensenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTLOAMLICENSENUM(MXStringType value) {
        this.tloamlicensenum = value;
    }

    /**
     * Gets the value of the pmchgwfassist property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGWFASSIST() {
        return pmchgwfassist;
    }

    /**
     * Sets the value of the pmchgwfassist property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGWFASSIST(MXStringType value) {
        this.pmchgwfassist = value;
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
     * Gets the value of the itdbckoutdur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getITDBCKOUTDUR() {
        return itdbckoutdur;
    }

    /**
     * Sets the value of the itdbckoutdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setITDBCKOUTDUR(JAXBElement<MXDoubleType> value) {
        this.itdbckoutdur = value;
    }

    /**
     * Gets the value of the itdchcreatedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCHCREATEDBY() {
        return itdchcreatedby;
    }

    /**
     * Sets the value of the itdchcreatedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCHCREATEDBY(MXStringType value) {
        this.itdchcreatedby = value;
    }

    /**
     * Gets the value of the itdchcreatedbygroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCHCREATEDBYGROUP() {
        return itdchcreatedbygroup;
    }

    /**
     * Sets the value of the itdchcreatedbygroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCHCREATEDBYGROUP(MXStringType value) {
        this.itdchcreatedbygroup = value;
    }

    /**
     * Gets the value of the itdcheck property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getITDCHECK() {
        return itdcheck;
    }

    /**
     * Sets the value of the itdcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setITDCHECK(MXBooleanType value) {
        this.itdcheck = value;
    }

    /**
     * Gets the value of the itdchgauthlevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getITDCHGAUTHLEVEL() {
        return itdchgauthlevel;
    }

    /**
     * Sets the value of the itdchgauthlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setITDCHGAUTHLEVEL(JAXBElement<MXLongType> value) {
        this.itdchgauthlevel = value;
    }

    /**
     * Gets the value of the itdchgbusimpct property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getITDCHGBUSIMPCT() {
        return itdchgbusimpct;
    }

    /**
     * Sets the value of the itdchgbusimpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setITDCHGBUSIMPCT(MXBooleanType value) {
        this.itdchgbusimpct = value;
    }

    /**
     * Gets the value of the itdchgcustreq property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getITDCHGCUSTREQ() {
        return itdchgcustreq;
    }

    /**
     * Sets the value of the itdchgcustreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setITDCHGCUSTREQ(MXBooleanType value) {
        this.itdchgcustreq = value;
    }

    /**
     * Gets the value of the itdchgmgr property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCHGMGR() {
        return itdchgmgr;
    }

    /**
     * Sets the value of the itdchgmgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCHGMGR(MXStringType value) {
        this.itdchgmgr = value;
    }

    /**
     * Gets the value of the itdchgpretstdtl property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCHGPRETSTDTL() {
        return itdchgpretstdtl;
    }

    /**
     * Sets the value of the itdchgpretstdtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCHGPRETSTDTL(MXStringType value) {
        this.itdchgpretstdtl = value;
    }

    /**
     * Gets the value of the itdclosurecode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDCLOSURECODE() {
        return itdclosurecode;
    }

    /**
     * Sets the value of the itdclosurecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDCLOSURECODE(MXStringType value) {
        this.itdclosurecode = value;
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
        this.itdcreatedate = value;
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
     * Gets the value of the itdleadtimedays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getITDLEADTIMEDAYS() {
        return itdleadtimedays;
    }

    /**
     * Sets the value of the itdleadtimedays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setITDLEADTIMEDAYS(JAXBElement<MXLongType> value) {
        this.itdleadtimedays = value;
    }

    /**
     * Gets the value of the itdownergroups property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDOWNERGROUPS() {
        return itdownergroups;
    }

    /**
     * Sets the value of the itdownergroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDOWNERGROUPS(MXStringType value) {
        this.itdownergroups = value;
    }

    /**
     * Gets the value of the itdowners property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDOWNERS() {
        return itdowners;
    }

    /**
     * Sets the value of the itdowners property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDOWNERS(MXStringType value) {
        this.itdowners = value;
    }

    /**
     * Gets the value of the itdexception property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDEXCEPTION() {
        return itdexception;
    }

    /**
     * Sets the value of the itdexception property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDEXCEPTION(MXStringType value) {
        this.itdexception = value;
    }

    /**
     * Gets the value of the amcrew property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAMCREW() {
        return amcrew;
    }

    /**
     * Sets the value of the amcrew property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAMCREW(MXStringType value) {
        this.amcrew = value;
    }

    /**
     * Gets the value of the crewworkgroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCREWWORKGROUP() {
        return crewworkgroup;
    }

    /**
     * Sets the value of the crewworkgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCREWWORKGROUP(MXStringType value) {
        this.crewworkgroup = value;
    }

    /**
     * Gets the value of the reqasstdwntime property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getREQASSTDWNTIME() {
        return reqasstdwntime;
    }

    /**
     * Sets the value of the reqasstdwntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setREQASSTDWNTIME(MXBooleanType value) {
        this.reqasstdwntime = value;
    }

    /**
     * Gets the value of the rbaretry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getRBARETRY() {
        return rbaretry;
    }

    /**
     * Sets the value of the rbaretry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setRBARETRY(JAXBElement<MXLongType> value) {
        this.rbaretry = value;
    }

    /**
     * Gets the value of the apptrequired property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getAPPTREQUIRED() {
        return apptrequired;
    }

    /**
     * Sets the value of the apptrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setAPPTREQUIRED(MXBooleanType value) {
        this.apptrequired = value;
    }

    /**
     * Gets the value of the aos property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getAOS() {
        return aos;
    }

    /**
     * Sets the value of the aos property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setAOS(MXBooleanType value) {
        this.aos = value;
    }

    /**
     * Gets the value of the ams property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getAMS() {
        return ams;
    }

    /**
     * Sets the value of the ams property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setAMS(MXBooleanType value) {
        this.ams = value;
    }

    /**
     * Gets the value of the los property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getLOS() {
        return los;
    }

    /**
     * Sets the value of the los property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setLOS(MXBooleanType value) {
        this.los = value;
    }

    /**
     * Gets the value of the lms property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getLMS() {
        return lms;
    }

    /**
     * Sets the value of the lms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setLMS(MXBooleanType value) {
        this.lms = value;
    }

    /**
     * Gets the value of the pmchgskdprgscname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCHGSKDPRGSCNAME() {
        return pmchgskdprgscname;
    }

    /**
     * Sets the value of the pmchgskdprgscname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCHGSKDPRGSCNAME(MXStringType value) {
        this.pmchgskdprgscname = value;
    }

    /**
     * Gets the value of the itdrelmgr property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDRELMGR() {
        return itdrelmgr;
    }

    /**
     * Sets the value of the itdrelmgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDRELMGR(MXStringType value) {
        this.itdrelmgr = value;
    }

    /**
     * Gets the value of the itdriskassessment property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDRISKASSESSMENT() {
        return itdriskassessment;
    }

    /**
     * Sets the value of the itdriskassessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDRISKASSESSMENT(MXStringType value) {
        this.itdriskassessment = value;
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

}
