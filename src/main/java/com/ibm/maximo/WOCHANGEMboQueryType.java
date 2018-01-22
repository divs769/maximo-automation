
package com.ibm.maximo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for WOCHANGEMboQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WOCHANGEMboQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WOCHANGE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PARENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="JPNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FAILDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTDUR" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HASCHILDREN" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OUTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OUTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CONTRACT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TARGCOMPDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TARGSTARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ4" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ5" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ6" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ7" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ8" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ9" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ10" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ11" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ12" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PROBLEMCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CALENDAR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DOWNTIME" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SCHEDSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SCHEDFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="REMDUR" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CREWID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SUPERVISOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ13" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOEQ14" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJP1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJP2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJP3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJP4" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJP5" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOL1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOL2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOL3" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOL4" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLABLNK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RESPONDBY" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ASSETLOCPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CALCPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CHARGESTORE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FAILURECODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO4" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO5" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO6" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO7" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO8" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO9" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOLO10" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DISABLED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOSEQUENCE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HASFOLLOWUPWORK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORTS1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORTS2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORTS3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORTS4" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORTS5" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SOURCESYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OWNERSYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMEXTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMNEXTDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORKLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SENDERSYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FINCNTRLID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GENERATEDFORPO" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GENFORPOLINEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TASKID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="INSPECTOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="MEASUREMENTVALUE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="MEASUREDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OBSERVATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="POINTNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO4" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO5" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO6" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO7" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOJO8" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ISTASK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOCLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ONBEHALFOF" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ORIGRECORDCLASS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="JUSTIFYPRIORITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RISK" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ENVIRONMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="BACKOUTPLAN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOACCEPTSCHARGES" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PARENTCHGSSTATUS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WHOMISCHANGEFOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="REASONFORCHANGE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="VERIFICATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PERSONGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LEAD" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LANGCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="INTERRUPTIBLE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HASLD" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ROUTE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ROUTESTOPID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="JOBTASKID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WOISSWAP" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="NEWCHILDCLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SUSPENDFLOW" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FLOWCONTROLLED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FLOWACTIONASSIST" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LAUNCHENTRYNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TARGETDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FLOWACTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FIRSTAPPRSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CALCCALENDAR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="REPFACSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="REPAIRFACILITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GENFORPOREVISION" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="STOREROOMMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DIRISSUEMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WORKPACKMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="IGNORESRMAVAIL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="IGNOREDIAVAIL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTOUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTOUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTOUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTOUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPROUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPROUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AVAILSTATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LASTCOPYLINKDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="NESTEDJPINPROCESS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCFREQUENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCFREQUNIT" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCISMOBILE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCJPREVNUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCLOOP" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCNEXTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCOVERDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSCPHYLOC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="INCTASKSINSCHED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SNECONSTRAINT" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FNLCONSTRAINT" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPQUOTEDPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPQUOTETYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPAGREEMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPLINESTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPORIGQTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPORIGQPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPRESPONSEPLAN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPPRICESCHED" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPMAXPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPCUSTPONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPREVNUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPPOREQ" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPALLOWQUOTE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPCALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPCALCCALNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPCALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLUSPBILLAPPROVED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMSTATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMBPELACTNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMBPELENABLED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMBPELINPROG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMURGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCOMFLOWSEQ" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGPROGRESS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGRELSTATE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGRELID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGRELSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGRELORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGISIMPTASK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIMPDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIATECHSUMCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIABUSSUMCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIABUSSUMEFF" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIATECHSUMEFF" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIADEFREL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIATOTALCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGIATOTALEFF" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGEVALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGEVALEND" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGAPPROVALLEVEL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGAPPROVALSTATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGREJECTREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGHASCONFLICTS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGCONFLICTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGCAT" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGCONCERN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGSKDPRG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGTOTALOUTAGES" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGPROBABILITYFAILURE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGFULLYAUTOMATED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGOUTAGEIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGMAXIMUMASSESSEDIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGOUTAGE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMRELIMPACT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMRELURGENCY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMRELBACKOUTEXETED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMRELSVCINSTID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RBA_RC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ACTLICCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTATAPPRLICCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ESTLICCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TLOAMLICENSENUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGWFASSIST" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDBCKOUTDUR" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHCREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHCREATEDBYGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHECK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHGAUTHLEVEL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHGBUSIMPCT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHGCUSTREQ" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHGMGR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCHGPRETSTDTL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCLOSURECODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDCREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDDOCCOUNTS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDLEADTIMEDAYS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITD_OWNERGROUP_S" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITD_OWNER_S" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDEXCEPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AMCREW" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CREWWORKGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="REQASSTDWNTIME" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RBA_RETRY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="APPTREQUIRED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AOS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AMS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LOS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="LMS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PMCHGSKDPRGSCNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDRELMGR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITDRISKASSESSMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}QueryClausePropertyGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WOCHANGEMboQueryType", propOrder = {
    "where",
    "wochange"
})
public class WOCHANGEMboQueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "WOCHANGE")
    protected WOCHANGEMboQueryType.WOCHANGE wochange;
    @XmlAttribute(name = "orderby")
    protected String orderby;
    @XmlAttribute(name = "operandMode")
    protected OperandModeType operandMode;

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHERE() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHERE(String value) {
        this.where = value;
    }

    /**
     * Gets the value of the wochange property.
     * 
     * @return
     *     possible object is
     *     {@link WOCHANGEMboQueryType.WOCHANGE }
     *     
     */
    public WOCHANGEMboQueryType.WOCHANGE getWOCHANGE() {
        return wochange;
    }

    /**
     * Sets the value of the wochange property.
     * 
     * @param value
     *     allowed object is
     *     {@link WOCHANGEMboQueryType.WOCHANGE }
     *     
     */
    public void setWOCHANGE(WOCHANGEMboQueryType.WOCHANGE value) {
        this.wochange = value;
    }

    /**
     * Gets the value of the orderby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderby() {
        return orderby;
    }

    /**
     * Sets the value of the orderby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderby(String value) {
        this.orderby = value;
    }

    /**
     * Gets the value of the operandMode property.
     * 
     * @return
     *     possible object is
     *     {@link OperandModeType }
     *     
     */
    public OperandModeType getOperandMode() {
        if (operandMode == null) {
            return OperandModeType.AND;
        } else {
            return operandMode;
        }
    }

    /**
     * Sets the value of the operandMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperandModeType }
     *     
     */
    public void setOperandMode(OperandModeType value) {
        this.operandMode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PARENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="JPNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FAILDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTDUR" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HASCHILDREN" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OUTMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OUTTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CONTRACT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TARGCOMPDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TARGSTARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ4" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ5" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ6" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ7" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ8" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ9" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ10" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ11" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ12" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PROBLEMCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CALENDAR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DOWNTIME" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SCHEDSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SCHEDFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="REMDUR" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CREWID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SUPERVISOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ13" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOEQ14" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJP1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJP2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJP3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJP4" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJP5" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOL1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOL2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOL3" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOL4" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLABLNK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RESPONDBY" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ASSETLOCPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CALCPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CHARGESTORE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FAILURECODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO4" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO5" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO6" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO7" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO8" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO9" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOLO10" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DISABLED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRMATCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRTOOLCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRSERVCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOSEQUENCE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HASFOLLOWUPWORK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORTS1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORTS2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORTS3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORTS4" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORTS5" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SOURCESYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OWNERSYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMEXTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMNEXTDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORKLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SENDERSYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FINCNTRLID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GENERATEDFORPO" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GENFORPOLINEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TASKID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="INSPECTOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="MEASUREMENTVALUE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="MEASUREDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OBSERVATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="POINTNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO4" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO5" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO6" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO7" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOJO8" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ISTASK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOCLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ONBEHALFOF" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ORIGRECORDCLASS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="JUSTIFYPRIORITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RISK" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ENVIRONMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="BACKOUTPLAN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOACCEPTSCHARGES" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PARENTCHGSSTATUS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WHOMISCHANGEFOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="REASONFORCHANGE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="VERIFICATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PERSONGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LEAD" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LANGCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="INTERRUPTIBLE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HASLD" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ROUTE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ROUTESTOPID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="JOBTASKID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WOISSWAP" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="NEWCHILDCLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SUSPENDFLOW" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FLOWCONTROLLED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FLOWACTIONASSIST" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LAUNCHENTRYNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TARGETDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FLOWACTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FIRSTAPPRSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CALCCALENDAR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="REPFACSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="REPAIRFACILITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GENFORPOREVISION" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="STOREROOMMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DIRISSUEMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WORKPACKMTLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="IGNORESRMAVAIL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="IGNOREDIAVAIL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTOUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTOUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTOUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTOUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRINTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRINTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPROUTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPROUTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AVAILSTATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LASTCOPYLINKDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="NESTEDJPINPROCESS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCFREQUENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCFREQUNIT" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCISMOBILE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCJPREVNUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCLOOP" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCNEXTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCOVERDUEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSCPHYLOC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="INCTASKSINSCHED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SNECONSTRAINT" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FNLCONSTRAINT" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPQUOTEDPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPQUOTETYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPAGREEMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPLINESTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPORIGQTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPORIGQPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPRESPONSEPLAN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPPRICESCHED" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPMAXPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPCUSTPONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPREVNUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPPOREQ" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPALLOWQUOTE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPCALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPCALCCALNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPCALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLUSPBILLAPPROVED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMSTATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMBPELACTNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMBPELENABLED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMBPELINPROG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMURGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCOMFLOWSEQ" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGPROGRESS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGRELSTATE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGRELID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGRELSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGRELORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGISIMPTASK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIMPDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIATECHSUMCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIABUSSUMCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIABUSSUMEFF" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIATECHSUMEFF" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIADEFREL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIATOTALCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGIATOTALEFF" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGEVALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGEVALEND" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGAPPROVALLEVEL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGAPPROVALSTATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGREJECTREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGHASCONFLICTS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGCONFLICTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGCAT" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGCONCERN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGSKDPRG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGTOTALOUTAGES" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGPROBABILITYFAILURE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGFULLYAUTOMATED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGOUTAGEIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGMAXIMUMASSESSEDIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGOUTAGE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMRELIMPACT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMRELURGENCY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMRELBACKOUTEXETED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMRELSVCINSTID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RBA_RC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ACTLICCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTATAPPRLICCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ESTLICCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TLOAMLICENSENUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGWFASSIST" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDBCKOUTDUR" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHCREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHCREATEDBYGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHECK" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHGAUTHLEVEL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHGBUSIMPCT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHGCUSTREQ" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHGMGR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCHGPRETSTDTL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCLOSURECODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDCREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDDOCCOUNTS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDLEADTIMEDAYS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITD_OWNERGROUP_S" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITD_OWNER_S" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDEXCEPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AMCREW" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CREWWORKGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="REQASSTDWNTIME" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RBA_RETRY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="APPTREQUIRED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AOS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AMS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LOS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="LMS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PMCHGSKDPRGSCNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDRELMGR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITDRISKASSESSMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
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
    public static class WOCHANGE {

        @XmlElement(name = "WONUM")
        protected List<MXStringQueryType> wonum;
        @XmlElement(name = "PARENT")
        protected List<MXStringQueryType> parent;
        @XmlElement(name = "STATUS")
        protected List<MXDomainQueryType> status;
        @XmlElement(name = "STATUSDATE", nillable = true)
        protected List<MXDateTimeQueryType> statusdate;
        @XmlElement(name = "WORKTYPE")
        protected List<MXStringQueryType> worktype;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "ASSETNUM")
        protected List<MXStringQueryType> assetnum;
        @XmlElement(name = "LOCATION")
        protected List<MXStringQueryType> location;
        @XmlElement(name = "JPNUM")
        protected List<MXStringQueryType> jpnum;
        @XmlElement(name = "FAILDATE", nillable = true)
        protected List<MXDateTimeQueryType> faildate;
        @XmlElement(name = "CHANGEBY")
        protected List<MXStringQueryType> changeby;
        @XmlElement(name = "CHANGEDATE", nillable = true)
        protected List<MXDateTimeQueryType> changedate;
        @XmlElement(name = "ESTDUR", nillable = true)
        protected List<MXDoubleQueryType> estdur;
        @XmlElement(name = "ESTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> estlabhrs;
        @XmlElement(name = "ESTMATCOST", nillable = true)
        protected List<MXDoubleQueryType> estmatcost;
        @XmlElement(name = "ESTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> estlabcost;
        @XmlElement(name = "ESTTOOLCOST", nillable = true)
        protected List<MXDoubleQueryType> esttoolcost;
        @XmlElement(name = "PMNUM")
        protected List<MXStringQueryType> pmnum;
        @XmlElement(name = "ACTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> actlabhrs;
        @XmlElement(name = "ACTMATCOST", nillable = true)
        protected List<MXDoubleQueryType> actmatcost;
        @XmlElement(name = "ACTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> actlabcost;
        @XmlElement(name = "ACTTOOLCOST", nillable = true)
        protected List<MXDoubleQueryType> acttoolcost;
        @XmlElement(name = "HASCHILDREN")
        protected List<MXBooleanQueryType> haschildren;
        @XmlElement(name = "OUTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> outlabcost;
        @XmlElement(name = "OUTMATCOST", nillable = true)
        protected List<MXDoubleQueryType> outmatcost;
        @XmlElement(name = "OUTTOOLCOST", nillable = true)
        protected List<MXDoubleQueryType> outtoolcost;
        @XmlElement(name = "HISTORYFLAG")
        protected List<MXBooleanQueryType> historyflag;
        @XmlElement(name = "CONTRACT")
        protected List<MXStringQueryType> contract;
        @XmlElement(name = "WOPRIORITY", nillable = true)
        protected List<MXLongQueryType> wopriority;
        @XmlElement(name = "TARGCOMPDATE", nillable = true)
        protected List<MXDateTimeQueryType> targcompdate;
        @XmlElement(name = "TARGSTARTDATE", nillable = true)
        protected List<MXDateTimeQueryType> targstartdate;
        @XmlElement(name = "WOEQ1")
        protected List<MXStringQueryType> woeq1;
        @XmlElement(name = "WOEQ2")
        protected List<MXStringQueryType> woeq2;
        @XmlElement(name = "WOEQ3")
        protected List<MXStringQueryType> woeq3;
        @XmlElement(name = "WOEQ4")
        protected List<MXStringQueryType> woeq4;
        @XmlElement(name = "WOEQ5", nillable = true)
        protected List<MXDoubleQueryType> woeq5;
        @XmlElement(name = "WOEQ6", nillable = true)
        protected List<MXDateTimeQueryType> woeq6;
        @XmlElement(name = "WOEQ7", nillable = true)
        protected List<MXDoubleQueryType> woeq7;
        @XmlElement(name = "WOEQ8")
        protected List<MXStringQueryType> woeq8;
        @XmlElement(name = "WOEQ9")
        protected List<MXStringQueryType> woeq9;
        @XmlElement(name = "WOEQ10")
        protected List<MXStringQueryType> woeq10;
        @XmlElement(name = "WOEQ11")
        protected List<MXStringQueryType> woeq11;
        @XmlElement(name = "WOEQ12", nillable = true)
        protected List<MXDoubleQueryType> woeq12;
        @XmlElement(name = "REPORTEDBY")
        protected List<MXStringQueryType> reportedby;
        @XmlElement(name = "REPORTDATE", nillable = true)
        protected List<MXDateTimeQueryType> reportdate;
        @XmlElement(name = "PHONE")
        protected List<MXStringQueryType> phone;
        @XmlElement(name = "PROBLEMCODE")
        protected List<MXStringQueryType> problemcode;
        @XmlElement(name = "CALENDAR")
        protected List<MXStringQueryType> calendar;
        @XmlElement(name = "DOWNTIME")
        protected List<MXBooleanQueryType> downtime;
        @XmlElement(name = "ACTSTART", nillable = true)
        protected List<MXDateTimeQueryType> actstart;
        @XmlElement(name = "ACTFINISH", nillable = true)
        protected List<MXDateTimeQueryType> actfinish;
        @XmlElement(name = "SCHEDSTART", nillable = true)
        protected List<MXDateTimeQueryType> schedstart;
        @XmlElement(name = "SCHEDFINISH", nillable = true)
        protected List<MXDateTimeQueryType> schedfinish;
        @XmlElement(name = "REMDUR", nillable = true)
        protected List<MXDoubleQueryType> remdur;
        @XmlElement(name = "CREWID")
        protected List<MXStringQueryType> crewid;
        @XmlElement(name = "SUPERVISOR")
        protected List<MXStringQueryType> supervisor;
        @XmlElement(name = "WOEQ13", nillable = true)
        protected List<MXDateTimeQueryType> woeq13;
        @XmlElement(name = "WOEQ14", nillable = true)
        protected List<MXDoubleQueryType> woeq14;
        @XmlElement(name = "WOJP1")
        protected List<MXStringQueryType> wojp1;
        @XmlElement(name = "WOJP2")
        protected List<MXStringQueryType> wojp2;
        @XmlElement(name = "WOJP3")
        protected List<MXStringQueryType> wojp3;
        @XmlElement(name = "WOJP4", nillable = true)
        protected List<MXDoubleQueryType> wojp4;
        @XmlElement(name = "WOJP5", nillable = true)
        protected List<MXDateTimeQueryType> wojp5;
        @XmlElement(name = "WOL1")
        protected List<MXStringQueryType> wol1;
        @XmlElement(name = "WOL2")
        protected List<MXStringQueryType> wol2;
        @XmlElement(name = "WOL3", nillable = true)
        protected List<MXDoubleQueryType> wol3;
        @XmlElement(name = "WOL4", nillable = true)
        protected List<MXDateTimeQueryType> wol4;
        @XmlElement(name = "WOLABLNK")
        protected List<MXStringQueryType> wolablnk;
        @XmlElement(name = "RESPONDBY", nillable = true)
        protected List<MXDateTimeQueryType> respondby;
        @XmlElement(name = "ASSETLOCPRIORITY", nillable = true)
        protected List<MXLongQueryType> assetlocpriority;
        @XmlElement(name = "CALCPRIORITY", nillable = true)
        protected List<MXLongQueryType> calcpriority;
        @XmlElement(name = "CHARGESTORE")
        protected List<MXBooleanQueryType> chargestore;
        @XmlElement(name = "FAILURECODE")
        protected List<MXStringQueryType> failurecode;
        @XmlElement(name = "WOLO1")
        protected List<MXStringQueryType> wolo1;
        @XmlElement(name = "WOLO2")
        protected List<MXStringQueryType> wolo2;
        @XmlElement(name = "WOLO3")
        protected List<MXStringQueryType> wolo3;
        @XmlElement(name = "WOLO4")
        protected List<MXStringQueryType> wolo4;
        @XmlElement(name = "WOLO5")
        protected List<MXStringQueryType> wolo5;
        @XmlElement(name = "WOLO6", nillable = true)
        protected List<MXDoubleQueryType> wolo6;
        @XmlElement(name = "WOLO7", nillable = true)
        protected List<MXDateTimeQueryType> wolo7;
        @XmlElement(name = "WOLO8", nillable = true)
        protected List<MXDoubleQueryType> wolo8;
        @XmlElement(name = "WOLO9")
        protected List<MXStringQueryType> wolo9;
        @XmlElement(name = "WOLO10", nillable = true)
        protected List<MXLongQueryType> wolo10;
        @XmlElement(name = "GLACCOUNT")
        protected List<MXGLAccountQueryType> glaccount;
        @XmlElement(name = "ESTSERVCOST", nillable = true)
        protected List<MXDoubleQueryType> estservcost;
        @XmlElement(name = "ACTSERVCOST", nillable = true)
        protected List<MXDoubleQueryType> actservcost;
        @XmlElement(name = "DISABLED")
        protected List<MXBooleanQueryType> disabled;
        @XmlElement(name = "ESTATAPPRLABHRS", nillable = true)
        protected List<MXDoubleQueryType> estatapprlabhrs;
        @XmlElement(name = "ESTATAPPRLABCOST", nillable = true)
        protected List<MXDoubleQueryType> estatapprlabcost;
        @XmlElement(name = "ESTATAPPRMATCOST", nillable = true)
        protected List<MXDoubleQueryType> estatapprmatcost;
        @XmlElement(name = "ESTATAPPRTOOLCOST", nillable = true)
        protected List<MXDoubleQueryType> estatapprtoolcost;
        @XmlElement(name = "ESTATAPPRSERVCOST", nillable = true)
        protected List<MXDoubleQueryType> estatapprservcost;
        @XmlElement(name = "WOSEQUENCE", nillable = true)
        protected List<MXLongQueryType> wosequence;
        @XmlElement(name = "HASFOLLOWUPWORK")
        protected List<MXBooleanQueryType> hasfollowupwork;
        @XmlElement(name = "WORTS1")
        protected List<MXStringQueryType> worts1;
        @XmlElement(name = "WORTS2")
        protected List<MXStringQueryType> worts2;
        @XmlElement(name = "WORTS3")
        protected List<MXStringQueryType> worts3;
        @XmlElement(name = "WORTS4", nillable = true)
        protected List<MXDateTimeQueryType> worts4;
        @XmlElement(name = "WORTS5", nillable = true)
        protected List<MXDoubleQueryType> worts5;
        @XmlElement(name = "SOURCESYSID")
        protected List<MXStringQueryType> sourcesysid;
        @XmlElement(name = "OWNERSYSID")
        protected List<MXStringQueryType> ownersysid;
        @XmlElement(name = "PMDUEDATE", nillable = true)
        protected List<MXDateTimeQueryType> pmduedate;
        @XmlElement(name = "PMEXTDATE", nillable = true)
        protected List<MXDateTimeQueryType> pmextdate;
        @XmlElement(name = "PMNEXTDUEDATE", nillable = true)
        protected List<MXDateTimeQueryType> pmnextduedate;
        @XmlElement(name = "WORKLOCATION")
        protected List<MXStringQueryType> worklocation;
        @XmlElement(name = "EXTERNALREFID")
        protected List<MXStringQueryType> externalrefid;
        @XmlElement(name = "SENDERSYSID")
        protected List<MXStringQueryType> sendersysid;
        @XmlElement(name = "FINCNTRLID")
        protected List<MXStringQueryType> fincntrlid;
        @XmlElement(name = "GENERATEDFORPO")
        protected List<MXStringQueryType> generatedforpo;
        @XmlElement(name = "GENFORPOLINEID", nillable = true)
        protected List<MXLongQueryType> genforpolineid;
        @XmlElement(name = "ORGID")
        protected List<MXStringQueryType> orgid;
        @XmlElement(name = "SITEID")
        protected List<MXStringQueryType> siteid;
        @XmlElement(name = "TASKID", nillable = true)
        protected List<MXLongQueryType> taskid;
        @XmlElement(name = "INSPECTOR")
        protected List<MXStringQueryType> inspector;
        @XmlElement(name = "MEASUREMENTVALUE", nillable = true)
        protected List<MXDoubleQueryType> measurementvalue;
        @XmlElement(name = "MEASUREDATE", nillable = true)
        protected List<MXDateTimeQueryType> measuredate;
        @XmlElement(name = "OBSERVATION")
        protected List<MXStringQueryType> observation;
        @XmlElement(name = "POINTNUM")
        protected List<MXStringQueryType> pointnum;
        @XmlElement(name = "WOJO1")
        protected List<MXStringQueryType> wojo1;
        @XmlElement(name = "WOJO2")
        protected List<MXStringQueryType> wojo2;
        @XmlElement(name = "WOJO3")
        protected List<MXStringQueryType> wojo3;
        @XmlElement(name = "WOJO4", nillable = true)
        protected List<MXDoubleQueryType> wojo4;
        @XmlElement(name = "WOJO5")
        protected List<MXStringQueryType> wojo5;
        @XmlElement(name = "WOJO6")
        protected List<MXStringQueryType> wojo6;
        @XmlElement(name = "WOJO7")
        protected List<MXStringQueryType> wojo7;
        @XmlElement(name = "WOJO8")
        protected List<MXStringQueryType> wojo8;
        @XmlElement(name = "ISTASK")
        protected List<MXBooleanQueryType> istask;
        @XmlElement(name = "WOCLASS")
        protected List<MXDomainQueryType> woclass;
        @XmlElement(name = "ONBEHALFOF")
        protected List<MXStringQueryType> onbehalfof;
        @XmlElement(name = "VENDOR")
        protected List<MXStringQueryType> vendor;
        @XmlElement(name = "ORIGRECORDCLASS")
        protected List<MXStringQueryType> origrecordclass;
        @XmlElement(name = "ORIGRECORDID")
        protected List<MXStringQueryType> origrecordid;
        @XmlElement(name = "JUSTIFYPRIORITY")
        protected List<MXStringQueryType> justifypriority;
        @XmlElement(name = "RISK")
        protected List<MXDomainQueryType> risk;
        @XmlElement(name = "ENVIRONMENT")
        protected List<MXStringQueryType> environment;
        @XmlElement(name = "BACKOUTPLAN")
        protected List<MXStringQueryType> backoutplan;
        @XmlElement(name = "WOACCEPTSCHARGES")
        protected List<MXBooleanQueryType> woacceptscharges;
        @XmlElement(name = "OWNER")
        protected List<MXStringQueryType> owner;
        @XmlElement(name = "CLASSSTRUCTUREID")
        protected List<MXStringQueryType> classstructureid;
        @XmlElement(name = "PARENTCHGSSTATUS")
        protected List<MXBooleanQueryType> parentchgsstatus;
        @XmlElement(name = "OWNERGROUP")
        protected List<MXStringQueryType> ownergroup;
        @XmlElement(name = "COMMODITYGROUP")
        protected List<MXStringQueryType> commoditygroup;
        @XmlElement(name = "COMMODITY")
        protected List<MXStringQueryType> commodity;
        @XmlElement(name = "WORKORDERID", nillable = true)
        protected List<MXLongQueryType> workorderid;
        @XmlElement(name = "WHOMISCHANGEFOR")
        protected List<MXStringQueryType> whomischangefor;
        @XmlElement(name = "REASONFORCHANGE")
        protected List<MXStringQueryType> reasonforchange;
        @XmlElement(name = "VERIFICATION")
        protected List<MXStringQueryType> verification;
        @XmlElement(name = "PERSONGROUP")
        protected List<MXStringQueryType> persongroup;
        @XmlElement(name = "LEAD")
        protected List<MXStringQueryType> lead;
        @XmlElement(name = "LANGCODE")
        protected List<MXStringQueryType> langcode;
        @XmlElement(name = "INTERRUPTIBLE")
        protected List<MXBooleanQueryType> interruptible;
        @XmlElement(name = "WOGROUP")
        protected List<MXStringQueryType> wogroup;
        @XmlElement(name = "HASLD")
        protected List<MXBooleanQueryType> hasld;
        @XmlElement(name = "ROUTE")
        protected List<MXStringQueryType> route;
        @XmlElement(name = "ROUTESTOPID", nillable = true)
        protected List<MXLongQueryType> routestopid;
        @XmlElement(name = "CINUM")
        protected List<MXStringQueryType> cinum;
        @XmlElement(name = "JOBTASKID", nillable = true)
        protected List<MXLongQueryType> jobtaskid;
        @XmlElement(name = "WOISSWAP")
        protected List<MXBooleanQueryType> woisswap;
        @XmlElement(name = "NEWCHILDCLASS")
        protected List<MXDomainQueryType> newchildclass;
        @XmlElement(name = "SUSPENDFLOW")
        protected List<MXBooleanQueryType> suspendflow;
        @XmlElement(name = "FLOWCONTROLLED")
        protected List<MXBooleanQueryType> flowcontrolled;
        @XmlElement(name = "FLOWACTIONASSIST")
        protected List<MXBooleanQueryType> flowactionassist;
        @XmlElement(name = "LAUNCHENTRYNAME")
        protected List<MXStringQueryType> launchentryname;
        @XmlElement(name = "TARGETDESC")
        protected List<MXStringQueryType> targetdesc;
        @XmlElement(name = "FLOWACTION")
        protected List<MXStringQueryType> flowaction;
        @XmlElement(name = "FIRSTAPPRSTATUS")
        protected List<MXStringQueryType> firstapprstatus;
        @XmlElement(name = "CALCORGID")
        protected List<MXStringQueryType> calcorgid;
        @XmlElement(name = "CALCCALENDAR")
        protected List<MXStringQueryType> calccalendar;
        @XmlElement(name = "CALCSHIFT")
        protected List<MXStringQueryType> calcshift;
        @XmlElement(name = "REPFACSITEID")
        protected List<MXStringQueryType> repfacsiteid;
        @XmlElement(name = "REPAIRFACILITY")
        protected List<MXStringQueryType> repairfacility;
        @XmlElement(name = "GENFORPOREVISION", nillable = true)
        protected List<MXLongQueryType> genforporevision;
        @XmlElement(name = "STOREROOMMTLSTATUS")
        protected List<MXDomainQueryType> storeroommtlstatus;
        @XmlElement(name = "DIRISSUEMTLSTATUS")
        protected List<MXDomainQueryType> dirissuemtlstatus;
        @XmlElement(name = "WORKPACKMTLSTATUS")
        protected List<MXDomainQueryType> workpackmtlstatus;
        @XmlElement(name = "IGNORESRMAVAIL")
        protected List<MXBooleanQueryType> ignoresrmavail;
        @XmlElement(name = "IGNOREDIAVAIL")
        protected List<MXBooleanQueryType> ignorediavail;
        @XmlElement(name = "ESTINTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> estintlabcost;
        @XmlElement(name = "ESTINTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> estintlabhrs;
        @XmlElement(name = "ESTOUTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> estoutlabhrs;
        @XmlElement(name = "ESTOUTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> estoutlabcost;
        @XmlElement(name = "ACTINTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> actintlabcost;
        @XmlElement(name = "ACTINTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> actintlabhrs;
        @XmlElement(name = "ACTOUTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> actoutlabhrs;
        @XmlElement(name = "ACTOUTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> actoutlabcost;
        @XmlElement(name = "ESTATAPPRINTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> estatapprintlabcost;
        @XmlElement(name = "ESTATAPPRINTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> estatapprintlabhrs;
        @XmlElement(name = "ESTATAPPROUTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> estatapproutlabhrs;
        @XmlElement(name = "ESTATAPPROUTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> estatapproutlabcost;
        @XmlElement(name = "ASSIGNEDOWNERGROUP")
        protected List<MXStringQueryType> assignedownergroup;
        @XmlElement(name = "AVAILSTATUSDATE", nillable = true)
        protected List<MXDateTimeQueryType> availstatusdate;
        @XmlElement(name = "LASTCOPYLINKDATE", nillable = true)
        protected List<MXDateTimeQueryType> lastcopylinkdate;
        @XmlElement(name = "NESTEDJPINPROCESS")
        protected List<MXBooleanQueryType> nestedjpinprocess;
        @XmlElement(name = "PLUSCFREQUENCY", nillable = true)
        protected List<MXLongQueryType> pluscfrequency;
        @XmlElement(name = "PLUSCFREQUNIT")
        protected List<MXDomainQueryType> pluscfrequnit;
        @XmlElement(name = "PLUSCISMOBILE")
        protected List<MXBooleanQueryType> pluscismobile;
        @XmlElement(name = "PLUSCJPREVNUM", nillable = true)
        protected List<MXLongQueryType> pluscjprevnum;
        @XmlElement(name = "PLUSCLOOP")
        protected List<MXBooleanQueryType> pluscloop;
        @XmlElement(name = "PLUSCNEXTDATE", nillable = true)
        protected List<MXDateTimeQueryType> pluscnextdate;
        @XmlElement(name = "PLUSCOVERDUEDATE", nillable = true)
        protected List<MXDateTimeQueryType> pluscoverduedate;
        @XmlElement(name = "PLUSCPHYLOC")
        protected List<MXStringQueryType> pluscphyloc;
        @XmlElement(name = "INCTASKSINSCHED")
        protected List<MXBooleanQueryType> inctasksinsched;
        @XmlElement(name = "SNECONSTRAINT", nillable = true)
        protected List<MXDateTimeQueryType> sneconstraint;
        @XmlElement(name = "FNLCONSTRAINT", nillable = true)
        protected List<MXDateTimeQueryType> fnlconstraint;
        @XmlElement(name = "PLUSPQUOTEDPRICE", nillable = true)
        protected List<MXDoubleQueryType> pluspquotedprice;
        @XmlElement(name = "PLUSPQUOTETYPE")
        protected List<MXDomainQueryType> pluspquotetype;
        @XmlElement(name = "PLUSPCUSTCHACCT")
        protected List<MXStringQueryType> pluspcustchacct;
        @XmlElement(name = "PLUSPCOSTCENTER")
        protected List<MXStringQueryType> pluspcostcenter;
        @XmlElement(name = "PLUSPCUSTOMER")
        protected List<MXStringQueryType> pluspcustomer;
        @XmlElement(name = "PLUSPAGREEMENT")
        protected List<MXStringQueryType> pluspagreement;
        @XmlElement(name = "PLUSPLINESTATUS")
        protected List<MXStringQueryType> plusplinestatus;
        @XmlElement(name = "PLUSPORIGQTYPE")
        protected List<MXStringQueryType> plusporigqtype;
        @XmlElement(name = "PLUSPORIGQPRICE", nillable = true)
        protected List<MXDoubleQueryType> plusporigqprice;
        @XmlElement(name = "PLUSPRESPONSEPLAN")
        protected List<MXStringQueryType> pluspresponseplan;
        @XmlElement(name = "PLUSPPRICESCHED")
        protected List<MXStringQueryType> plusppricesched;
        @XmlElement(name = "PLUSPMAXPRICE", nillable = true)
        protected List<MXDoubleQueryType> pluspmaxprice;
        @XmlElement(name = "PLUSPCUSTPONUM")
        protected List<MXStringQueryType> pluspcustponum;
        @XmlElement(name = "PLUSPREVNUM", nillable = true)
        protected List<MXLongQueryType> plusprevnum;
        @XmlElement(name = "PLUSPPOREQ")
        protected List<MXBooleanQueryType> pluspporeq;
        @XmlElement(name = "PLUSPALLOWQUOTE")
        protected List<MXBooleanQueryType> pluspallowquote;
        @XmlElement(name = "PLUSPCALCORGID")
        protected List<MXStringQueryType> pluspcalcorgid;
        @XmlElement(name = "PLUSPCALCCALNUM")
        protected List<MXStringQueryType> pluspcalccalnum;
        @XmlElement(name = "PLUSPCALCSHIFT")
        protected List<MXStringQueryType> pluspcalcshift;
        @XmlElement(name = "PLUSPBILLAPPROVED")
        protected List<MXBooleanQueryType> pluspbillapproved;
        @XmlElement(name = "PMCOMTYPE")
        protected List<MXStringQueryType> pmcomtype;
        @XmlElement(name = "PMCOMSTATE")
        protected List<MXStringQueryType> pmcomstate;
        @XmlElement(name = "PMCOMBPELACTNAME")
        protected List<MXStringQueryType> pmcombpelactname;
        @XmlElement(name = "PMCOMBPELENABLED")
        protected List<MXBooleanQueryType> pmcombpelenabled;
        @XmlElement(name = "PMCOMBPELINPROG")
        protected List<MXBooleanQueryType> pmcombpelinprog;
        @XmlElement(name = "PMCOMIMPACT", nillable = true)
        protected List<MXLongQueryType> pmcomimpact;
        @XmlElement(name = "PMCOMURGENCY", nillable = true)
        protected List<MXLongQueryType> pmcomurgency;
        @XmlElement(name = "PMCOMFLOWSEQ")
        protected List<MXStringQueryType> pmcomflowseq;
        @XmlElement(name = "PMCHGPROGRESS")
        protected List<MXStringQueryType> pmchgprogress;
        @XmlElement(name = "PMCHGRELSTATE")
        protected List<MXDomainQueryType> pmchgrelstate;
        @XmlElement(name = "PMCHGRELID")
        protected List<MXStringQueryType> pmchgrelid;
        @XmlElement(name = "PMCHGRELSITEID")
        protected List<MXStringQueryType> pmchgrelsiteid;
        @XmlElement(name = "PMCHGRELORGID")
        protected List<MXStringQueryType> pmchgrelorgid;
        @XmlElement(name = "PMCHGISIMPTASK")
        protected List<MXBooleanQueryType> pmchgisimptask;
        @XmlElement(name = "PMCHGIMPDESC")
        protected List<MXStringQueryType> pmchgimpdesc;
        @XmlElement(name = "PMCHGIATECHSUMCOST", nillable = true)
        protected List<MXDoubleQueryType> pmchgiatechsumcost;
        @XmlElement(name = "PMCHGIABUSSUMCOST", nillable = true)
        protected List<MXDoubleQueryType> pmchgiabussumcost;
        @XmlElement(name = "PMCHGIABUSSUMEFF", nillable = true)
        protected List<MXDoubleQueryType> pmchgiabussumeff;
        @XmlElement(name = "PMCHGIATECHSUMEFF", nillable = true)
        protected List<MXDoubleQueryType> pmchgiatechsumeff;
        @XmlElement(name = "PMCHGIADEFREL")
        protected List<MXBooleanQueryType> pmchgiadefrel;
        @XmlElement(name = "PMCHGIATOTALCOST", nillable = true)
        protected List<MXDoubleQueryType> pmchgiatotalcost;
        @XmlElement(name = "PMCHGIATOTALEFF", nillable = true)
        protected List<MXDoubleQueryType> pmchgiatotaleff;
        @XmlElement(name = "PMCHGEVALSTART", nillable = true)
        protected List<MXDateTimeQueryType> pmchgevalstart;
        @XmlElement(name = "PMCHGEVALEND", nillable = true)
        protected List<MXDateTimeQueryType> pmchgevalend;
        @XmlElement(name = "PMCHGAPPROVALLEVEL", nillable = true)
        protected List<MXLongQueryType> pmchgapprovallevel;
        @XmlElement(name = "PMCHGAPPROVALSTATE")
        protected List<MXStringQueryType> pmchgapprovalstate;
        @XmlElement(name = "PMCHGREJECTREASON")
        protected List<MXStringQueryType> pmchgrejectreason;
        @XmlElement(name = "PMCHGHASCONFLICTS")
        protected List<MXBooleanQueryType> pmchghasconflicts;
        @XmlElement(name = "PMCHGCONFLICTDATE", nillable = true)
        protected List<MXDateTimeQueryType> pmchgconflictdate;
        @XmlElement(name = "PMCHGTYPE")
        protected List<MXDomainQueryType> pmchgtype;
        @XmlElement(name = "PMCHGCAT")
        protected List<MXDomainQueryType> pmchgcat;
        @XmlElement(name = "PMCHGCONCERN")
        protected List<MXStringQueryType> pmchgconcern;
        @XmlElement(name = "PMCHGSKDPRG")
        protected List<MXStringQueryType> pmchgskdprg;
        @XmlElement(name = "PMCHGTOTALOUTAGES", nillable = true)
        protected List<MXLongQueryType> pmchgtotaloutages;
        @XmlElement(name = "PMCHGPROBABILITYFAILURE", nillable = true)
        protected List<MXLongQueryType> pmchgprobabilityfailure;
        @XmlElement(name = "PMCHGFULLYAUTOMATED")
        protected List<MXBooleanQueryType> pmchgfullyautomated;
        @XmlElement(name = "PMCHGOUTAGEIMPACT", nillable = true)
        protected List<MXLongQueryType> pmchgoutageimpact;
        @XmlElement(name = "PMCHGMAXIMUMASSESSEDIMPACT", nillable = true)
        protected List<MXLongQueryType> pmchgmaximumassessedimpact;
        @XmlElement(name = "PMCHGOUTAGE")
        protected List<MXDomainQueryType> pmchgoutage;
        @XmlElement(name = "PMRELIMPACT")
        protected List<MXStringQueryType> pmrelimpact;
        @XmlElement(name = "PMRELURGENCY")
        protected List<MXStringQueryType> pmrelurgency;
        @XmlElement(name = "PMRELBACKOUTEXETED")
        protected List<MXBooleanQueryType> pmrelbackoutexeted;
        @XmlElement(name = "PMRELSVCINSTID", nillable = true)
        protected List<MXLongQueryType> pmrelsvcinstid;
        @XmlElement(name = "RBA_RC")
        protected List<MXStringQueryType> rbarc;
        @XmlElement(name = "ACTLICCOST", nillable = true)
        protected List<MXDoubleQueryType> actliccost;
        @XmlElement(name = "ESTATAPPRLICCOST", nillable = true)
        protected List<MXDoubleQueryType> estatapprliccost;
        @XmlElement(name = "ESTLICCOST", nillable = true)
        protected List<MXDoubleQueryType> estliccost;
        @XmlElement(name = "TLOAMLICENSENUM")
        protected List<MXStringQueryType> tloamlicensenum;
        @XmlElement(name = "PMCHGWFASSIST")
        protected List<MXStringQueryType> pmchgwfassist;
        @XmlElement(name = "CLASSIFICATIONID")
        protected List<MXStringQueryType> classificationid;
        @XmlElement(name = "ITDBCKOUTDUR", nillable = true)
        protected List<MXDoubleQueryType> itdbckoutdur;
        @XmlElement(name = "ITDCHCREATEDBY")
        protected List<MXStringQueryType> itdchcreatedby;
        @XmlElement(name = "ITDCHCREATEDBYGROUP")
        protected List<MXStringQueryType> itdchcreatedbygroup;
        @XmlElement(name = "ITDCHECK")
        protected List<MXBooleanQueryType> itdcheck;
        @XmlElement(name = "ITDCHGAUTHLEVEL", nillable = true)
        protected List<MXLongQueryType> itdchgauthlevel;
        @XmlElement(name = "ITDCHGBUSIMPCT")
        protected List<MXBooleanQueryType> itdchgbusimpct;
        @XmlElement(name = "ITDCHGCUSTREQ")
        protected List<MXBooleanQueryType> itdchgcustreq;
        @XmlElement(name = "ITDCHGMGR")
        protected List<MXStringQueryType> itdchgmgr;
        @XmlElement(name = "ITDCHGPRETSTDTL")
        protected List<MXStringQueryType> itdchgpretstdtl;
        @XmlElement(name = "ITDCLOSURECODE")
        protected List<MXStringQueryType> itdclosurecode;
        @XmlElement(name = "ITDCREATEDATE", nillable = true)
        protected List<MXDateTimeQueryType> itdcreatedate;
        @XmlElement(name = "ITDDOCCOUNTS", nillable = true)
        protected List<MXLongQueryType> itddoccounts;
        @XmlElement(name = "ITDLEADTIMEDAYS", nillable = true)
        protected List<MXLongQueryType> itdleadtimedays;
        @XmlElement(name = "ITD_OWNERGROUP_S")
        protected List<MXStringQueryType> itdownergroups;
        @XmlElement(name = "ITD_OWNER_S")
        protected List<MXStringQueryType> itdowners;
        @XmlElement(name = "ITDEXCEPTION")
        protected List<MXStringQueryType> itdexception;
        @XmlElement(name = "AMCREW")
        protected List<MXStringQueryType> amcrew;
        @XmlElement(name = "CREWWORKGROUP")
        protected List<MXStringQueryType> crewworkgroup;
        @XmlElement(name = "REQASSTDWNTIME")
        protected List<MXBooleanQueryType> reqasstdwntime;
        @XmlElement(name = "RBA_RETRY", nillable = true)
        protected List<MXLongQueryType> rbaretry;
        @XmlElement(name = "APPTREQUIRED")
        protected List<MXBooleanQueryType> apptrequired;
        @XmlElement(name = "AOS")
        protected List<MXBooleanQueryType> aos;
        @XmlElement(name = "AMS")
        protected List<MXBooleanQueryType> ams;
        @XmlElement(name = "LOS")
        protected List<MXBooleanQueryType> los;
        @XmlElement(name = "LMS")
        protected List<MXBooleanQueryType> lms;
        @XmlElement(name = "PMCHGSKDPRGSCNAME")
        protected List<MXStringQueryType> pmchgskdprgscname;
        @XmlElement(name = "ITDRELMGR")
        protected List<MXStringQueryType> itdrelmgr;
        @XmlElement(name = "ITDRISKASSESSMENT")
        protected List<MXStringQueryType> itdriskassessment;

        /**
         * Gets the value of the wonum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wonum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWONUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWONUM() {
            if (wonum == null) {
                wonum = new ArrayList<MXStringQueryType>();
            }
            return this.wonum;
        }

        /**
         * Gets the value of the parent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPARENT() {
            if (parent == null) {
                parent = new ArrayList<MXStringQueryType>();
            }
            return this.parent;
        }

        /**
         * Gets the value of the status property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getSTATUS() {
            if (status == null) {
                status = new ArrayList<MXDomainQueryType>();
            }
            return this.status;
        }

        /**
         * Gets the value of the statusdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTATUSDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getSTATUSDATE() {
            if (statusdate == null) {
                statusdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.statusdate;
        }

        /**
         * Gets the value of the worktype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worktype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORKTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWORKTYPE() {
            if (worktype == null) {
                worktype = new ArrayList<MXStringQueryType>();
            }
            return this.worktype;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDESCRIPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDESCRIPTION() {
            if (description == null) {
                description = new ArrayList<MXStringQueryType>();
            }
            return this.description;
        }

        /**
         * Gets the value of the assetnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSETNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getASSETNUM() {
            if (assetnum == null) {
                assetnum = new ArrayList<MXStringQueryType>();
            }
            return this.assetnum;
        }

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOCATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLOCATION() {
            if (location == null) {
                location = new ArrayList<MXStringQueryType>();
            }
            return this.location;
        }

        /**
         * Gets the value of the jpnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jpnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJPNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getJPNUM() {
            if (jpnum == null) {
                jpnum = new ArrayList<MXStringQueryType>();
            }
            return this.jpnum;
        }

        /**
         * Gets the value of the faildate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the faildate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFAILDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getFAILDATE() {
            if (faildate == null) {
                faildate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.faildate;
        }

        /**
         * Gets the value of the changeby property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the changeby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHANGEBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCHANGEBY() {
            if (changeby == null) {
                changeby = new ArrayList<MXStringQueryType>();
            }
            return this.changeby;
        }

        /**
         * Gets the value of the changedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the changedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHANGEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getCHANGEDATE() {
            if (changedate == null) {
                changedate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.changedate;
        }

        /**
         * Gets the value of the estdur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estdur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTDUR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTDUR() {
            if (estdur == null) {
                estdur = new ArrayList<MXDoubleQueryType>();
            }
            return this.estdur;
        }

        /**
         * Gets the value of the estlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTLABHRS() {
            if (estlabhrs == null) {
                estlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.estlabhrs;
        }

        /**
         * Gets the value of the estmatcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estmatcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTMATCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTMATCOST() {
            if (estmatcost == null) {
                estmatcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estmatcost;
        }

        /**
         * Gets the value of the estlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTLABCOST() {
            if (estlabcost == null) {
                estlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estlabcost;
        }

        /**
         * Gets the value of the esttoolcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the esttoolcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTTOOLCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTTOOLCOST() {
            if (esttoolcost == null) {
                esttoolcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.esttoolcost;
        }

        /**
         * Gets the value of the pmnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMNUM() {
            if (pmnum == null) {
                pmnum = new ArrayList<MXStringQueryType>();
            }
            return this.pmnum;
        }

        /**
         * Gets the value of the actlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTLABHRS() {
            if (actlabhrs == null) {
                actlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.actlabhrs;
        }

        /**
         * Gets the value of the actmatcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actmatcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTMATCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTMATCOST() {
            if (actmatcost == null) {
                actmatcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.actmatcost;
        }

        /**
         * Gets the value of the actlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTLABCOST() {
            if (actlabcost == null) {
                actlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.actlabcost;
        }

        /**
         * Gets the value of the acttoolcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acttoolcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTTOOLCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTTOOLCOST() {
            if (acttoolcost == null) {
                acttoolcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.acttoolcost;
        }

        /**
         * Gets the value of the haschildren property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the haschildren property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHASCHILDREN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHASCHILDREN() {
            if (haschildren == null) {
                haschildren = new ArrayList<MXBooleanQueryType>();
            }
            return this.haschildren;
        }

        /**
         * Gets the value of the outlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOUTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getOUTLABCOST() {
            if (outlabcost == null) {
                outlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.outlabcost;
        }

        /**
         * Gets the value of the outmatcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outmatcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOUTMATCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getOUTMATCOST() {
            if (outmatcost == null) {
                outmatcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.outmatcost;
        }

        /**
         * Gets the value of the outtoolcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outtoolcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOUTTOOLCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getOUTTOOLCOST() {
            if (outtoolcost == null) {
                outtoolcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.outtoolcost;
        }

        /**
         * Gets the value of the historyflag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the historyflag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHISTORYFLAG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHISTORYFLAG() {
            if (historyflag == null) {
                historyflag = new ArrayList<MXBooleanQueryType>();
            }
            return this.historyflag;
        }

        /**
         * Gets the value of the contract property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contract property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTRACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCONTRACT() {
            if (contract == null) {
                contract = new ArrayList<MXStringQueryType>();
            }
            return this.contract;
        }

        /**
         * Gets the value of the wopriority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wopriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getWOPRIORITY() {
            if (wopriority == null) {
                wopriority = new ArrayList<MXLongQueryType>();
            }
            return this.wopriority;
        }

        /**
         * Gets the value of the targcompdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targcompdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGCOMPDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getTARGCOMPDATE() {
            if (targcompdate == null) {
                targcompdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.targcompdate;
        }

        /**
         * Gets the value of the targstartdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targstartdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGSTARTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getTARGSTARTDATE() {
            if (targstartdate == null) {
                targstartdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.targstartdate;
        }

        /**
         * Gets the value of the woeq1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ1() {
            if (woeq1 == null) {
                woeq1 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq1;
        }

        /**
         * Gets the value of the woeq2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ2() {
            if (woeq2 == null) {
                woeq2 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq2;
        }

        /**
         * Gets the value of the woeq3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ3() {
            if (woeq3 == null) {
                woeq3 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq3;
        }

        /**
         * Gets the value of the woeq4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ4() {
            if (woeq4 == null) {
                woeq4 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq4;
        }

        /**
         * Gets the value of the woeq5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOEQ5() {
            if (woeq5 == null) {
                woeq5 = new ArrayList<MXDoubleQueryType>();
            }
            return this.woeq5;
        }

        /**
         * Gets the value of the woeq6 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq6 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ6().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getWOEQ6() {
            if (woeq6 == null) {
                woeq6 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.woeq6;
        }

        /**
         * Gets the value of the woeq7 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq7 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ7().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOEQ7() {
            if (woeq7 == null) {
                woeq7 = new ArrayList<MXDoubleQueryType>();
            }
            return this.woeq7;
        }

        /**
         * Gets the value of the woeq8 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq8 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ8().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ8() {
            if (woeq8 == null) {
                woeq8 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq8;
        }

        /**
         * Gets the value of the woeq9 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq9 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ9().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ9() {
            if (woeq9 == null) {
                woeq9 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq9;
        }

        /**
         * Gets the value of the woeq10 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq10 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ10().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ10() {
            if (woeq10 == null) {
                woeq10 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq10;
        }

        /**
         * Gets the value of the woeq11 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq11 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ11().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOEQ11() {
            if (woeq11 == null) {
                woeq11 = new ArrayList<MXStringQueryType>();
            }
            return this.woeq11;
        }

        /**
         * Gets the value of the woeq12 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq12 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ12().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOEQ12() {
            if (woeq12 == null) {
                woeq12 = new ArrayList<MXDoubleQueryType>();
            }
            return this.woeq12;
        }

        /**
         * Gets the value of the reportedby property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportedby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPORTEDBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREPORTEDBY() {
            if (reportedby == null) {
                reportedby = new ArrayList<MXStringQueryType>();
            }
            return this.reportedby;
        }

        /**
         * Gets the value of the reportdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPORTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getREPORTDATE() {
            if (reportdate == null) {
                reportdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.reportdate;
        }

        /**
         * Gets the value of the phone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPHONE() {
            if (phone == null) {
                phone = new ArrayList<MXStringQueryType>();
            }
            return this.phone;
        }

        /**
         * Gets the value of the problemcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the problemcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPROBLEMCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPROBLEMCODE() {
            if (problemcode == null) {
                problemcode = new ArrayList<MXStringQueryType>();
            }
            return this.problemcode;
        }

        /**
         * Gets the value of the calendar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calendar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALENDAR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCALENDAR() {
            if (calendar == null) {
                calendar = new ArrayList<MXStringQueryType>();
            }
            return this.calendar;
        }

        /**
         * Gets the value of the downtime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the downtime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDOWNTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getDOWNTIME() {
            if (downtime == null) {
                downtime = new ArrayList<MXBooleanQueryType>();
            }
            return this.downtime;
        }

        /**
         * Gets the value of the actstart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actstart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTSTART().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getACTSTART() {
            if (actstart == null) {
                actstart = new ArrayList<MXDateTimeQueryType>();
            }
            return this.actstart;
        }

        /**
         * Gets the value of the actfinish property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actfinish property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTFINISH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getACTFINISH() {
            if (actfinish == null) {
                actfinish = new ArrayList<MXDateTimeQueryType>();
            }
            return this.actfinish;
        }

        /**
         * Gets the value of the schedstart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schedstart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSCHEDSTART().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getSCHEDSTART() {
            if (schedstart == null) {
                schedstart = new ArrayList<MXDateTimeQueryType>();
            }
            return this.schedstart;
        }

        /**
         * Gets the value of the schedfinish property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schedfinish property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSCHEDFINISH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getSCHEDFINISH() {
            if (schedfinish == null) {
                schedfinish = new ArrayList<MXDateTimeQueryType>();
            }
            return this.schedfinish;
        }

        /**
         * Gets the value of the remdur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remdur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREMDUR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getREMDUR() {
            if (remdur == null) {
                remdur = new ArrayList<MXDoubleQueryType>();
            }
            return this.remdur;
        }

        /**
         * Gets the value of the crewid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crewid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCREWID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCREWID() {
            if (crewid == null) {
                crewid = new ArrayList<MXStringQueryType>();
            }
            return this.crewid;
        }

        /**
         * Gets the value of the supervisor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supervisor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUPERVISOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSUPERVISOR() {
            if (supervisor == null) {
                supervisor = new ArrayList<MXStringQueryType>();
            }
            return this.supervisor;
        }

        /**
         * Gets the value of the woeq13 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq13 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ13().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getWOEQ13() {
            if (woeq13 == null) {
                woeq13 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.woeq13;
        }

        /**
         * Gets the value of the woeq14 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woeq14 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOEQ14().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOEQ14() {
            if (woeq14 == null) {
                woeq14 = new ArrayList<MXDoubleQueryType>();
            }
            return this.woeq14;
        }

        /**
         * Gets the value of the wojp1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojp1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJP1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJP1() {
            if (wojp1 == null) {
                wojp1 = new ArrayList<MXStringQueryType>();
            }
            return this.wojp1;
        }

        /**
         * Gets the value of the wojp2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojp2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJP2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJP2() {
            if (wojp2 == null) {
                wojp2 = new ArrayList<MXStringQueryType>();
            }
            return this.wojp2;
        }

        /**
         * Gets the value of the wojp3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojp3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJP3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJP3() {
            if (wojp3 == null) {
                wojp3 = new ArrayList<MXStringQueryType>();
            }
            return this.wojp3;
        }

        /**
         * Gets the value of the wojp4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojp4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJP4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOJP4() {
            if (wojp4 == null) {
                wojp4 = new ArrayList<MXDoubleQueryType>();
            }
            return this.wojp4;
        }

        /**
         * Gets the value of the wojp5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojp5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJP5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getWOJP5() {
            if (wojp5 == null) {
                wojp5 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.wojp5;
        }

        /**
         * Gets the value of the wol1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wol1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOL1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOL1() {
            if (wol1 == null) {
                wol1 = new ArrayList<MXStringQueryType>();
            }
            return this.wol1;
        }

        /**
         * Gets the value of the wol2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wol2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOL2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOL2() {
            if (wol2 == null) {
                wol2 = new ArrayList<MXStringQueryType>();
            }
            return this.wol2;
        }

        /**
         * Gets the value of the wol3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wol3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOL3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOL3() {
            if (wol3 == null) {
                wol3 = new ArrayList<MXDoubleQueryType>();
            }
            return this.wol3;
        }

        /**
         * Gets the value of the wol4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wol4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOL4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getWOL4() {
            if (wol4 == null) {
                wol4 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.wol4;
        }

        /**
         * Gets the value of the wolablnk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolablnk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLABLNK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOLABLNK() {
            if (wolablnk == null) {
                wolablnk = new ArrayList<MXStringQueryType>();
            }
            return this.wolablnk;
        }

        /**
         * Gets the value of the respondby property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the respondby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRESPONDBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getRESPONDBY() {
            if (respondby == null) {
                respondby = new ArrayList<MXDateTimeQueryType>();
            }
            return this.respondby;
        }

        /**
         * Gets the value of the assetlocpriority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetlocpriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSETLOCPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getASSETLOCPRIORITY() {
            if (assetlocpriority == null) {
                assetlocpriority = new ArrayList<MXLongQueryType>();
            }
            return this.assetlocpriority;
        }

        /**
         * Gets the value of the calcpriority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calcpriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALCPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getCALCPRIORITY() {
            if (calcpriority == null) {
                calcpriority = new ArrayList<MXLongQueryType>();
            }
            return this.calcpriority;
        }

        /**
         * Gets the value of the chargestore property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargestore property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHARGESTORE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getCHARGESTORE() {
            if (chargestore == null) {
                chargestore = new ArrayList<MXBooleanQueryType>();
            }
            return this.chargestore;
        }

        /**
         * Gets the value of the failurecode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the failurecode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFAILURECODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFAILURECODE() {
            if (failurecode == null) {
                failurecode = new ArrayList<MXStringQueryType>();
            }
            return this.failurecode;
        }

        /**
         * Gets the value of the wolo1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOLO1() {
            if (wolo1 == null) {
                wolo1 = new ArrayList<MXStringQueryType>();
            }
            return this.wolo1;
        }

        /**
         * Gets the value of the wolo2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOLO2() {
            if (wolo2 == null) {
                wolo2 = new ArrayList<MXStringQueryType>();
            }
            return this.wolo2;
        }

        /**
         * Gets the value of the wolo3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOLO3() {
            if (wolo3 == null) {
                wolo3 = new ArrayList<MXStringQueryType>();
            }
            return this.wolo3;
        }

        /**
         * Gets the value of the wolo4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOLO4() {
            if (wolo4 == null) {
                wolo4 = new ArrayList<MXStringQueryType>();
            }
            return this.wolo4;
        }

        /**
         * Gets the value of the wolo5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOLO5() {
            if (wolo5 == null) {
                wolo5 = new ArrayList<MXStringQueryType>();
            }
            return this.wolo5;
        }

        /**
         * Gets the value of the wolo6 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo6 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO6().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOLO6() {
            if (wolo6 == null) {
                wolo6 = new ArrayList<MXDoubleQueryType>();
            }
            return this.wolo6;
        }

        /**
         * Gets the value of the wolo7 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo7 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO7().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getWOLO7() {
            if (wolo7 == null) {
                wolo7 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.wolo7;
        }

        /**
         * Gets the value of the wolo8 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo8 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO8().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOLO8() {
            if (wolo8 == null) {
                wolo8 = new ArrayList<MXDoubleQueryType>();
            }
            return this.wolo8;
        }

        /**
         * Gets the value of the wolo9 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo9 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO9().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOLO9() {
            if (wolo9 == null) {
                wolo9 = new ArrayList<MXStringQueryType>();
            }
            return this.wolo9;
        }

        /**
         * Gets the value of the wolo10 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wolo10 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOLO10().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getWOLO10() {
            if (wolo10 == null) {
                wolo10 = new ArrayList<MXLongQueryType>();
            }
            return this.wolo10;
        }

        /**
         * Gets the value of the glaccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the glaccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLACCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXGLAccountQueryType }
         * 
         * 
         */
        public List<MXGLAccountQueryType> getGLACCOUNT() {
            if (glaccount == null) {
                glaccount = new ArrayList<MXGLAccountQueryType>();
            }
            return this.glaccount;
        }

        /**
         * Gets the value of the estservcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estservcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTSERVCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTSERVCOST() {
            if (estservcost == null) {
                estservcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estservcost;
        }

        /**
         * Gets the value of the actservcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actservcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTSERVCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTSERVCOST() {
            if (actservcost == null) {
                actservcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.actservcost;
        }

        /**
         * Gets the value of the disabled property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disabled property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDISABLED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getDISABLED() {
            if (disabled == null) {
                disabled = new ArrayList<MXBooleanQueryType>();
            }
            return this.disabled;
        }

        /**
         * Gets the value of the estatapprlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRLABHRS() {
            if (estatapprlabhrs == null) {
                estatapprlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprlabhrs;
        }

        /**
         * Gets the value of the estatapprlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRLABCOST() {
            if (estatapprlabcost == null) {
                estatapprlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprlabcost;
        }

        /**
         * Gets the value of the estatapprmatcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprmatcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRMATCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRMATCOST() {
            if (estatapprmatcost == null) {
                estatapprmatcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprmatcost;
        }

        /**
         * Gets the value of the estatapprtoolcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprtoolcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRTOOLCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRTOOLCOST() {
            if (estatapprtoolcost == null) {
                estatapprtoolcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprtoolcost;
        }

        /**
         * Gets the value of the estatapprservcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprservcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRSERVCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRSERVCOST() {
            if (estatapprservcost == null) {
                estatapprservcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprservcost;
        }

        /**
         * Gets the value of the wosequence property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wosequence property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOSEQUENCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getWOSEQUENCE() {
            if (wosequence == null) {
                wosequence = new ArrayList<MXLongQueryType>();
            }
            return this.wosequence;
        }

        /**
         * Gets the value of the hasfollowupwork property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hasfollowupwork property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHASFOLLOWUPWORK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHASFOLLOWUPWORK() {
            if (hasfollowupwork == null) {
                hasfollowupwork = new ArrayList<MXBooleanQueryType>();
            }
            return this.hasfollowupwork;
        }

        /**
         * Gets the value of the worts1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worts1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORTS1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWORTS1() {
            if (worts1 == null) {
                worts1 = new ArrayList<MXStringQueryType>();
            }
            return this.worts1;
        }

        /**
         * Gets the value of the worts2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worts2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORTS2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWORTS2() {
            if (worts2 == null) {
                worts2 = new ArrayList<MXStringQueryType>();
            }
            return this.worts2;
        }

        /**
         * Gets the value of the worts3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worts3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORTS3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWORTS3() {
            if (worts3 == null) {
                worts3 = new ArrayList<MXStringQueryType>();
            }
            return this.worts3;
        }

        /**
         * Gets the value of the worts4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worts4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORTS4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getWORTS4() {
            if (worts4 == null) {
                worts4 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.worts4;
        }

        /**
         * Gets the value of the worts5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worts5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORTS5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWORTS5() {
            if (worts5 == null) {
                worts5 = new ArrayList<MXDoubleQueryType>();
            }
            return this.worts5;
        }

        /**
         * Gets the value of the sourcesysid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sourcesysid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOURCESYSID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSOURCESYSID() {
            if (sourcesysid == null) {
                sourcesysid = new ArrayList<MXStringQueryType>();
            }
            return this.sourcesysid;
        }

        /**
         * Gets the value of the ownersysid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ownersysid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOWNERSYSID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOWNERSYSID() {
            if (ownersysid == null) {
                ownersysid = new ArrayList<MXStringQueryType>();
            }
            return this.ownersysid;
        }

        /**
         * Gets the value of the pmduedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmduedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMDUEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPMDUEDATE() {
            if (pmduedate == null) {
                pmduedate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pmduedate;
        }

        /**
         * Gets the value of the pmextdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmextdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMEXTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPMEXTDATE() {
            if (pmextdate == null) {
                pmextdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pmextdate;
        }

        /**
         * Gets the value of the pmnextduedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmnextduedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMNEXTDUEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPMNEXTDUEDATE() {
            if (pmnextduedate == null) {
                pmnextduedate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pmnextduedate;
        }

        /**
         * Gets the value of the worklocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worklocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORKLOCATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWORKLOCATION() {
            if (worklocation == null) {
                worklocation = new ArrayList<MXStringQueryType>();
            }
            return this.worklocation;
        }

        /**
         * Gets the value of the externalrefid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalrefid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXTERNALREFID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getEXTERNALREFID() {
            if (externalrefid == null) {
                externalrefid = new ArrayList<MXStringQueryType>();
            }
            return this.externalrefid;
        }

        /**
         * Gets the value of the sendersysid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sendersysid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSENDERSYSID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSENDERSYSID() {
            if (sendersysid == null) {
                sendersysid = new ArrayList<MXStringQueryType>();
            }
            return this.sendersysid;
        }

        /**
         * Gets the value of the fincntrlid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fincntrlid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFINCNTRLID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFINCNTRLID() {
            if (fincntrlid == null) {
                fincntrlid = new ArrayList<MXStringQueryType>();
            }
            return this.fincntrlid;
        }

        /**
         * Gets the value of the generatedforpo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the generatedforpo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGENERATEDFORPO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getGENERATEDFORPO() {
            if (generatedforpo == null) {
                generatedforpo = new ArrayList<MXStringQueryType>();
            }
            return this.generatedforpo;
        }

        /**
         * Gets the value of the genforpolineid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the genforpolineid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGENFORPOLINEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getGENFORPOLINEID() {
            if (genforpolineid == null) {
                genforpolineid = new ArrayList<MXLongQueryType>();
            }
            return this.genforpolineid;
        }

        /**
         * Gets the value of the orgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORGID() {
            if (orgid == null) {
                orgid = new ArrayList<MXStringQueryType>();
            }
            return this.orgid;
        }

        /**
         * Gets the value of the siteid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the siteid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSITEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSITEID() {
            if (siteid == null) {
                siteid = new ArrayList<MXStringQueryType>();
            }
            return this.siteid;
        }

        /**
         * Gets the value of the taskid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taskid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTASKID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getTASKID() {
            if (taskid == null) {
                taskid = new ArrayList<MXLongQueryType>();
            }
            return this.taskid;
        }

        /**
         * Gets the value of the inspector property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inspector property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSPECTOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getINSPECTOR() {
            if (inspector == null) {
                inspector = new ArrayList<MXStringQueryType>();
            }
            return this.inspector;
        }

        /**
         * Gets the value of the measurementvalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measurementvalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEASUREMENTVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getMEASUREMENTVALUE() {
            if (measurementvalue == null) {
                measurementvalue = new ArrayList<MXDoubleQueryType>();
            }
            return this.measurementvalue;
        }

        /**
         * Gets the value of the measuredate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measuredate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEASUREDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getMEASUREDATE() {
            if (measuredate == null) {
                measuredate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.measuredate;
        }

        /**
         * Gets the value of the observation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the observation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOBSERVATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOBSERVATION() {
            if (observation == null) {
                observation = new ArrayList<MXStringQueryType>();
            }
            return this.observation;
        }

        /**
         * Gets the value of the pointnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOINTNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPOINTNUM() {
            if (pointnum == null) {
                pointnum = new ArrayList<MXStringQueryType>();
            }
            return this.pointnum;
        }

        /**
         * Gets the value of the wojo1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJO1() {
            if (wojo1 == null) {
                wojo1 = new ArrayList<MXStringQueryType>();
            }
            return this.wojo1;
        }

        /**
         * Gets the value of the wojo2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJO2() {
            if (wojo2 == null) {
                wojo2 = new ArrayList<MXStringQueryType>();
            }
            return this.wojo2;
        }

        /**
         * Gets the value of the wojo3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJO3() {
            if (wojo3 == null) {
                wojo3 = new ArrayList<MXStringQueryType>();
            }
            return this.wojo3;
        }

        /**
         * Gets the value of the wojo4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getWOJO4() {
            if (wojo4 == null) {
                wojo4 = new ArrayList<MXDoubleQueryType>();
            }
            return this.wojo4;
        }

        /**
         * Gets the value of the wojo5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJO5() {
            if (wojo5 == null) {
                wojo5 = new ArrayList<MXStringQueryType>();
            }
            return this.wojo5;
        }

        /**
         * Gets the value of the wojo6 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo6 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO6().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJO6() {
            if (wojo6 == null) {
                wojo6 = new ArrayList<MXStringQueryType>();
            }
            return this.wojo6;
        }

        /**
         * Gets the value of the wojo7 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo7 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO7().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJO7() {
            if (wojo7 == null) {
                wojo7 = new ArrayList<MXStringQueryType>();
            }
            return this.wojo7;
        }

        /**
         * Gets the value of the wojo8 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wojo8 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOJO8().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOJO8() {
            if (wojo8 == null) {
                wojo8 = new ArrayList<MXStringQueryType>();
            }
            return this.wojo8;
        }

        /**
         * Gets the value of the istask property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the istask property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISTASK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getISTASK() {
            if (istask == null) {
                istask = new ArrayList<MXBooleanQueryType>();
            }
            return this.istask;
        }

        /**
         * Gets the value of the woclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getWOCLASS() {
            if (woclass == null) {
                woclass = new ArrayList<MXDomainQueryType>();
            }
            return this.woclass;
        }

        /**
         * Gets the value of the onbehalfof property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the onbehalfof property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getONBEHALFOF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getONBEHALFOF() {
            if (onbehalfof == null) {
                onbehalfof = new ArrayList<MXStringQueryType>();
            }
            return this.onbehalfof;
        }

        /**
         * Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVENDOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getVENDOR() {
            if (vendor == null) {
                vendor = new ArrayList<MXStringQueryType>();
            }
            return this.vendor;
        }

        /**
         * Gets the value of the origrecordclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the origrecordclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGRECORDCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORIGRECORDCLASS() {
            if (origrecordclass == null) {
                origrecordclass = new ArrayList<MXStringQueryType>();
            }
            return this.origrecordclass;
        }

        /**
         * Gets the value of the origrecordid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the origrecordid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGRECORDID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORIGRECORDID() {
            if (origrecordid == null) {
                origrecordid = new ArrayList<MXStringQueryType>();
            }
            return this.origrecordid;
        }

        /**
         * Gets the value of the justifypriority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the justifypriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJUSTIFYPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getJUSTIFYPRIORITY() {
            if (justifypriority == null) {
                justifypriority = new ArrayList<MXStringQueryType>();
            }
            return this.justifypriority;
        }

        /**
         * Gets the value of the risk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the risk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRISK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getRISK() {
            if (risk == null) {
                risk = new ArrayList<MXDomainQueryType>();
            }
            return this.risk;
        }

        /**
         * Gets the value of the environment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the environment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENVIRONMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getENVIRONMENT() {
            if (environment == null) {
                environment = new ArrayList<MXStringQueryType>();
            }
            return this.environment;
        }

        /**
         * Gets the value of the backoutplan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the backoutplan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBACKOUTPLAN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getBACKOUTPLAN() {
            if (backoutplan == null) {
                backoutplan = new ArrayList<MXStringQueryType>();
            }
            return this.backoutplan;
        }

        /**
         * Gets the value of the woacceptscharges property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woacceptscharges property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOACCEPTSCHARGES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getWOACCEPTSCHARGES() {
            if (woacceptscharges == null) {
                woacceptscharges = new ArrayList<MXBooleanQueryType>();
            }
            return this.woacceptscharges;
        }

        /**
         * Gets the value of the owner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the owner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOWNER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOWNER() {
            if (owner == null) {
                owner = new ArrayList<MXStringQueryType>();
            }
            return this.owner;
        }

        /**
         * Gets the value of the classstructureid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classstructureid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLASSSTRUCTUREID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCLASSSTRUCTUREID() {
            if (classstructureid == null) {
                classstructureid = new ArrayList<MXStringQueryType>();
            }
            return this.classstructureid;
        }

        /**
         * Gets the value of the parentchgsstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parentchgsstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARENTCHGSSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPARENTCHGSSTATUS() {
            if (parentchgsstatus == null) {
                parentchgsstatus = new ArrayList<MXBooleanQueryType>();
            }
            return this.parentchgsstatus;
        }

        /**
         * Gets the value of the ownergroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ownergroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOWNERGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOWNERGROUP() {
            if (ownergroup == null) {
                ownergroup = new ArrayList<MXStringQueryType>();
            }
            return this.ownergroup;
        }

        /**
         * Gets the value of the commoditygroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commoditygroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMMODITYGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCOMMODITYGROUP() {
            if (commoditygroup == null) {
                commoditygroup = new ArrayList<MXStringQueryType>();
            }
            return this.commoditygroup;
        }

        /**
         * Gets the value of the commodity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commodity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMMODITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCOMMODITY() {
            if (commodity == null) {
                commodity = new ArrayList<MXStringQueryType>();
            }
            return this.commodity;
        }

        /**
         * Gets the value of the workorderid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workorderid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORKORDERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getWORKORDERID() {
            if (workorderid == null) {
                workorderid = new ArrayList<MXLongQueryType>();
            }
            return this.workorderid;
        }

        /**
         * Gets the value of the whomischangefor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the whomischangefor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWHOMISCHANGEFOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWHOMISCHANGEFOR() {
            if (whomischangefor == null) {
                whomischangefor = new ArrayList<MXStringQueryType>();
            }
            return this.whomischangefor;
        }

        /**
         * Gets the value of the reasonforchange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reasonforchange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREASONFORCHANGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREASONFORCHANGE() {
            if (reasonforchange == null) {
                reasonforchange = new ArrayList<MXStringQueryType>();
            }
            return this.reasonforchange;
        }

        /**
         * Gets the value of the verification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the verification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVERIFICATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getVERIFICATION() {
            if (verification == null) {
                verification = new ArrayList<MXStringQueryType>();
            }
            return this.verification;
        }

        /**
         * Gets the value of the persongroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the persongroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPERSONGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPERSONGROUP() {
            if (persongroup == null) {
                persongroup = new ArrayList<MXStringQueryType>();
            }
            return this.persongroup;
        }

        /**
         * Gets the value of the lead property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lead property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLEAD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLEAD() {
            if (lead == null) {
                lead = new ArrayList<MXStringQueryType>();
            }
            return this.lead;
        }

        /**
         * Gets the value of the langcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the langcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLANGCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLANGCODE() {
            if (langcode == null) {
                langcode = new ArrayList<MXStringQueryType>();
            }
            return this.langcode;
        }

        /**
         * Gets the value of the interruptible property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interruptible property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTERRUPTIBLE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getINTERRUPTIBLE() {
            if (interruptible == null) {
                interruptible = new ArrayList<MXBooleanQueryType>();
            }
            return this.interruptible;
        }

        /**
         * Gets the value of the wogroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wogroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOGROUP() {
            if (wogroup == null) {
                wogroup = new ArrayList<MXStringQueryType>();
            }
            return this.wogroup;
        }

        /**
         * Gets the value of the hasld property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hasld property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHASLD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHASLD() {
            if (hasld == null) {
                hasld = new ArrayList<MXBooleanQueryType>();
            }
            return this.hasld;
        }

        /**
         * Gets the value of the route property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the route property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getROUTE() {
            if (route == null) {
                route = new ArrayList<MXStringQueryType>();
            }
            return this.route;
        }

        /**
         * Gets the value of the routestopid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routestopid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROUTESTOPID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getROUTESTOPID() {
            if (routestopid == null) {
                routestopid = new ArrayList<MXLongQueryType>();
            }
            return this.routestopid;
        }

        /**
         * Gets the value of the cinum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cinum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCINUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCINUM() {
            if (cinum == null) {
                cinum = new ArrayList<MXStringQueryType>();
            }
            return this.cinum;
        }

        /**
         * Gets the value of the jobtaskid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobtaskid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJOBTASKID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getJOBTASKID() {
            if (jobtaskid == null) {
                jobtaskid = new ArrayList<MXLongQueryType>();
            }
            return this.jobtaskid;
        }

        /**
         * Gets the value of the woisswap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the woisswap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOISSWAP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getWOISSWAP() {
            if (woisswap == null) {
                woisswap = new ArrayList<MXBooleanQueryType>();
            }
            return this.woisswap;
        }

        /**
         * Gets the value of the newchildclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newchildclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNEWCHILDCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getNEWCHILDCLASS() {
            if (newchildclass == null) {
                newchildclass = new ArrayList<MXDomainQueryType>();
            }
            return this.newchildclass;
        }

        /**
         * Gets the value of the suspendflow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suspendflow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUSPENDFLOW().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getSUSPENDFLOW() {
            if (suspendflow == null) {
                suspendflow = new ArrayList<MXBooleanQueryType>();
            }
            return this.suspendflow;
        }

        /**
         * Gets the value of the flowcontrolled property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flowcontrolled property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLOWCONTROLLED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getFLOWCONTROLLED() {
            if (flowcontrolled == null) {
                flowcontrolled = new ArrayList<MXBooleanQueryType>();
            }
            return this.flowcontrolled;
        }

        /**
         * Gets the value of the flowactionassist property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flowactionassist property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLOWACTIONASSIST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getFLOWACTIONASSIST() {
            if (flowactionassist == null) {
                flowactionassist = new ArrayList<MXBooleanQueryType>();
            }
            return this.flowactionassist;
        }

        /**
         * Gets the value of the launchentryname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the launchentryname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLAUNCHENTRYNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLAUNCHENTRYNAME() {
            if (launchentryname == null) {
                launchentryname = new ArrayList<MXStringQueryType>();
            }
            return this.launchentryname;
        }

        /**
         * Gets the value of the targetdesc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetdesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGETDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTARGETDESC() {
            if (targetdesc == null) {
                targetdesc = new ArrayList<MXStringQueryType>();
            }
            return this.targetdesc;
        }

        /**
         * Gets the value of the flowaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flowaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLOWACTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFLOWACTION() {
            if (flowaction == null) {
                flowaction = new ArrayList<MXStringQueryType>();
            }
            return this.flowaction;
        }

        /**
         * Gets the value of the firstapprstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the firstapprstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFIRSTAPPRSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFIRSTAPPRSTATUS() {
            if (firstapprstatus == null) {
                firstapprstatus = new ArrayList<MXStringQueryType>();
            }
            return this.firstapprstatus;
        }

        /**
         * Gets the value of the calcorgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calcorgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALCORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCALCORGID() {
            if (calcorgid == null) {
                calcorgid = new ArrayList<MXStringQueryType>();
            }
            return this.calcorgid;
        }

        /**
         * Gets the value of the calccalendar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calccalendar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALCCALENDAR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCALCCALENDAR() {
            if (calccalendar == null) {
                calccalendar = new ArrayList<MXStringQueryType>();
            }
            return this.calccalendar;
        }

        /**
         * Gets the value of the calcshift property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calcshift property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALCSHIFT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCALCSHIFT() {
            if (calcshift == null) {
                calcshift = new ArrayList<MXStringQueryType>();
            }
            return this.calcshift;
        }

        /**
         * Gets the value of the repfacsiteid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the repfacsiteid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPFACSITEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREPFACSITEID() {
            if (repfacsiteid == null) {
                repfacsiteid = new ArrayList<MXStringQueryType>();
            }
            return this.repfacsiteid;
        }

        /**
         * Gets the value of the repairfacility property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the repairfacility property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPAIRFACILITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREPAIRFACILITY() {
            if (repairfacility == null) {
                repairfacility = new ArrayList<MXStringQueryType>();
            }
            return this.repairfacility;
        }

        /**
         * Gets the value of the genforporevision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the genforporevision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGENFORPOREVISION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getGENFORPOREVISION() {
            if (genforporevision == null) {
                genforporevision = new ArrayList<MXLongQueryType>();
            }
            return this.genforporevision;
        }

        /**
         * Gets the value of the storeroommtlstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the storeroommtlstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTOREROOMMTLSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getSTOREROOMMTLSTATUS() {
            if (storeroommtlstatus == null) {
                storeroommtlstatus = new ArrayList<MXDomainQueryType>();
            }
            return this.storeroommtlstatus;
        }

        /**
         * Gets the value of the dirissuemtlstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dirissuemtlstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIRISSUEMTLSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getDIRISSUEMTLSTATUS() {
            if (dirissuemtlstatus == null) {
                dirissuemtlstatus = new ArrayList<MXDomainQueryType>();
            }
            return this.dirissuemtlstatus;
        }

        /**
         * Gets the value of the workpackmtlstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workpackmtlstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORKPACKMTLSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getWORKPACKMTLSTATUS() {
            if (workpackmtlstatus == null) {
                workpackmtlstatus = new ArrayList<MXDomainQueryType>();
            }
            return this.workpackmtlstatus;
        }

        /**
         * Gets the value of the ignoresrmavail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ignoresrmavail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIGNORESRMAVAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getIGNORESRMAVAIL() {
            if (ignoresrmavail == null) {
                ignoresrmavail = new ArrayList<MXBooleanQueryType>();
            }
            return this.ignoresrmavail;
        }

        /**
         * Gets the value of the ignorediavail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ignorediavail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIGNOREDIAVAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getIGNOREDIAVAIL() {
            if (ignorediavail == null) {
                ignorediavail = new ArrayList<MXBooleanQueryType>();
            }
            return this.ignorediavail;
        }

        /**
         * Gets the value of the estintlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estintlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTINTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTINTLABCOST() {
            if (estintlabcost == null) {
                estintlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estintlabcost;
        }

        /**
         * Gets the value of the estintlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estintlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTINTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTINTLABHRS() {
            if (estintlabhrs == null) {
                estintlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.estintlabhrs;
        }

        /**
         * Gets the value of the estoutlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estoutlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTOUTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTOUTLABHRS() {
            if (estoutlabhrs == null) {
                estoutlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.estoutlabhrs;
        }

        /**
         * Gets the value of the estoutlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estoutlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTOUTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTOUTLABCOST() {
            if (estoutlabcost == null) {
                estoutlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estoutlabcost;
        }

        /**
         * Gets the value of the actintlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actintlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTINTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTINTLABCOST() {
            if (actintlabcost == null) {
                actintlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.actintlabcost;
        }

        /**
         * Gets the value of the actintlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actintlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTINTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTINTLABHRS() {
            if (actintlabhrs == null) {
                actintlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.actintlabhrs;
        }

        /**
         * Gets the value of the actoutlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actoutlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTOUTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTOUTLABHRS() {
            if (actoutlabhrs == null) {
                actoutlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.actoutlabhrs;
        }

        /**
         * Gets the value of the actoutlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actoutlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTOUTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTOUTLABCOST() {
            if (actoutlabcost == null) {
                actoutlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.actoutlabcost;
        }

        /**
         * Gets the value of the estatapprintlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprintlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRINTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRINTLABCOST() {
            if (estatapprintlabcost == null) {
                estatapprintlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprintlabcost;
        }

        /**
         * Gets the value of the estatapprintlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprintlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRINTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRINTLABHRS() {
            if (estatapprintlabhrs == null) {
                estatapprintlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprintlabhrs;
        }

        /**
         * Gets the value of the estatapproutlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapproutlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPROUTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPROUTLABHRS() {
            if (estatapproutlabhrs == null) {
                estatapproutlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapproutlabhrs;
        }

        /**
         * Gets the value of the estatapproutlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapproutlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPROUTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPROUTLABCOST() {
            if (estatapproutlabcost == null) {
                estatapproutlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapproutlabcost;
        }

        /**
         * Gets the value of the assignedownergroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedownergroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSIGNEDOWNERGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getASSIGNEDOWNERGROUP() {
            if (assignedownergroup == null) {
                assignedownergroup = new ArrayList<MXStringQueryType>();
            }
            return this.assignedownergroup;
        }

        /**
         * Gets the value of the availstatusdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availstatusdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAVAILSTATUSDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getAVAILSTATUSDATE() {
            if (availstatusdate == null) {
                availstatusdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.availstatusdate;
        }

        /**
         * Gets the value of the lastcopylinkdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lastcopylinkdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLASTCOPYLINKDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getLASTCOPYLINKDATE() {
            if (lastcopylinkdate == null) {
                lastcopylinkdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.lastcopylinkdate;
        }

        /**
         * Gets the value of the nestedjpinprocess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nestedjpinprocess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNESTEDJPINPROCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getNESTEDJPINPROCESS() {
            if (nestedjpinprocess == null) {
                nestedjpinprocess = new ArrayList<MXBooleanQueryType>();
            }
            return this.nestedjpinprocess;
        }

        /**
         * Gets the value of the pluscfrequency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscfrequency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCFREQUENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPLUSCFREQUENCY() {
            if (pluscfrequency == null) {
                pluscfrequency = new ArrayList<MXLongQueryType>();
            }
            return this.pluscfrequency;
        }

        /**
         * Gets the value of the pluscfrequnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscfrequnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCFREQUNIT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPLUSCFREQUNIT() {
            if (pluscfrequnit == null) {
                pluscfrequnit = new ArrayList<MXDomainQueryType>();
            }
            return this.pluscfrequnit;
        }

        /**
         * Gets the value of the pluscismobile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscismobile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCISMOBILE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPLUSCISMOBILE() {
            if (pluscismobile == null) {
                pluscismobile = new ArrayList<MXBooleanQueryType>();
            }
            return this.pluscismobile;
        }

        /**
         * Gets the value of the pluscjprevnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscjprevnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCJPREVNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPLUSCJPREVNUM() {
            if (pluscjprevnum == null) {
                pluscjprevnum = new ArrayList<MXLongQueryType>();
            }
            return this.pluscjprevnum;
        }

        /**
         * Gets the value of the pluscloop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscloop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCLOOP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPLUSCLOOP() {
            if (pluscloop == null) {
                pluscloop = new ArrayList<MXBooleanQueryType>();
            }
            return this.pluscloop;
        }

        /**
         * Gets the value of the pluscnextdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscnextdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCNEXTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPLUSCNEXTDATE() {
            if (pluscnextdate == null) {
                pluscnextdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pluscnextdate;
        }

        /**
         * Gets the value of the pluscoverduedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscoverduedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCOVERDUEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPLUSCOVERDUEDATE() {
            if (pluscoverduedate == null) {
                pluscoverduedate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pluscoverduedate;
        }

        /**
         * Gets the value of the pluscphyloc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluscphyloc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSCPHYLOC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSCPHYLOC() {
            if (pluscphyloc == null) {
                pluscphyloc = new ArrayList<MXStringQueryType>();
            }
            return this.pluscphyloc;
        }

        /**
         * Gets the value of the inctasksinsched property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inctasksinsched property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCTASKSINSCHED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getINCTASKSINSCHED() {
            if (inctasksinsched == null) {
                inctasksinsched = new ArrayList<MXBooleanQueryType>();
            }
            return this.inctasksinsched;
        }

        /**
         * Gets the value of the sneconstraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sneconstraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSNECONSTRAINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getSNECONSTRAINT() {
            if (sneconstraint == null) {
                sneconstraint = new ArrayList<MXDateTimeQueryType>();
            }
            return this.sneconstraint;
        }

        /**
         * Gets the value of the fnlconstraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fnlconstraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFNLCONSTRAINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getFNLCONSTRAINT() {
            if (fnlconstraint == null) {
                fnlconstraint = new ArrayList<MXDateTimeQueryType>();
            }
            return this.fnlconstraint;
        }

        /**
         * Gets the value of the pluspquotedprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspquotedprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPQUOTEDPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPLUSPQUOTEDPRICE() {
            if (pluspquotedprice == null) {
                pluspquotedprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pluspquotedprice;
        }

        /**
         * Gets the value of the pluspquotetype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspquotetype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPQUOTETYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPLUSPQUOTETYPE() {
            if (pluspquotetype == null) {
                pluspquotetype = new ArrayList<MXDomainQueryType>();
            }
            return this.pluspquotetype;
        }

        /**
         * Gets the value of the pluspcustchacct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcustchacct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCUSTCHACCT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCUSTCHACCT() {
            if (pluspcustchacct == null) {
                pluspcustchacct = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcustchacct;
        }

        /**
         * Gets the value of the pluspcostcenter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcostcenter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCOSTCENTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCOSTCENTER() {
            if (pluspcostcenter == null) {
                pluspcostcenter = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcostcenter;
        }

        /**
         * Gets the value of the pluspcustomer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcustomer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCUSTOMER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCUSTOMER() {
            if (pluspcustomer == null) {
                pluspcustomer = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcustomer;
        }

        /**
         * Gets the value of the pluspagreement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspagreement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPAGREEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPAGREEMENT() {
            if (pluspagreement == null) {
                pluspagreement = new ArrayList<MXStringQueryType>();
            }
            return this.pluspagreement;
        }

        /**
         * Gets the value of the plusplinestatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusplinestatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPLINESTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPLINESTATUS() {
            if (plusplinestatus == null) {
                plusplinestatus = new ArrayList<MXStringQueryType>();
            }
            return this.plusplinestatus;
        }

        /**
         * Gets the value of the plusporigqtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusporigqtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPORIGQTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPORIGQTYPE() {
            if (plusporigqtype == null) {
                plusporigqtype = new ArrayList<MXStringQueryType>();
            }
            return this.plusporigqtype;
        }

        /**
         * Gets the value of the plusporigqprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusporigqprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPORIGQPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPLUSPORIGQPRICE() {
            if (plusporigqprice == null) {
                plusporigqprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.plusporigqprice;
        }

        /**
         * Gets the value of the pluspresponseplan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspresponseplan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPRESPONSEPLAN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPRESPONSEPLAN() {
            if (pluspresponseplan == null) {
                pluspresponseplan = new ArrayList<MXStringQueryType>();
            }
            return this.pluspresponseplan;
        }

        /**
         * Gets the value of the plusppricesched property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusppricesched property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPRICESCHED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPPRICESCHED() {
            if (plusppricesched == null) {
                plusppricesched = new ArrayList<MXStringQueryType>();
            }
            return this.plusppricesched;
        }

        /**
         * Gets the value of the pluspmaxprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspmaxprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPMAXPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPLUSPMAXPRICE() {
            if (pluspmaxprice == null) {
                pluspmaxprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pluspmaxprice;
        }

        /**
         * Gets the value of the pluspcustponum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcustponum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCUSTPONUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCUSTPONUM() {
            if (pluspcustponum == null) {
                pluspcustponum = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcustponum;
        }

        /**
         * Gets the value of the plusprevnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusprevnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPREVNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPLUSPREVNUM() {
            if (plusprevnum == null) {
                plusprevnum = new ArrayList<MXLongQueryType>();
            }
            return this.plusprevnum;
        }

        /**
         * Gets the value of the pluspporeq property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspporeq property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPOREQ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPLUSPPOREQ() {
            if (pluspporeq == null) {
                pluspporeq = new ArrayList<MXBooleanQueryType>();
            }
            return this.pluspporeq;
        }

        /**
         * Gets the value of the pluspallowquote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspallowquote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPALLOWQUOTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPLUSPALLOWQUOTE() {
            if (pluspallowquote == null) {
                pluspallowquote = new ArrayList<MXBooleanQueryType>();
            }
            return this.pluspallowquote;
        }

        /**
         * Gets the value of the pluspcalcorgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcalcorgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCALCORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCALCORGID() {
            if (pluspcalcorgid == null) {
                pluspcalcorgid = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcalcorgid;
        }

        /**
         * Gets the value of the pluspcalccalnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcalccalnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCALCCALNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCALCCALNUM() {
            if (pluspcalccalnum == null) {
                pluspcalccalnum = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcalccalnum;
        }

        /**
         * Gets the value of the pluspcalcshift property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcalcshift property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCALCSHIFT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCALCSHIFT() {
            if (pluspcalcshift == null) {
                pluspcalcshift = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcalcshift;
        }

        /**
         * Gets the value of the pluspbillapproved property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspbillapproved property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPBILLAPPROVED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPLUSPBILLAPPROVED() {
            if (pluspbillapproved == null) {
                pluspbillapproved = new ArrayList<MXBooleanQueryType>();
            }
            return this.pluspbillapproved;
        }

        /**
         * Gets the value of the pmcomtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOMTYPE() {
            if (pmcomtype == null) {
                pmcomtype = new ArrayList<MXStringQueryType>();
            }
            return this.pmcomtype;
        }

        /**
         * Gets the value of the pmcomstate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomstate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMSTATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOMSTATE() {
            if (pmcomstate == null) {
                pmcomstate = new ArrayList<MXStringQueryType>();
            }
            return this.pmcomstate;
        }

        /**
         * Gets the value of the pmcombpelactname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcombpelactname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMBPELACTNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOMBPELACTNAME() {
            if (pmcombpelactname == null) {
                pmcombpelactname = new ArrayList<MXStringQueryType>();
            }
            return this.pmcombpelactname;
        }

        /**
         * Gets the value of the pmcombpelenabled property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcombpelenabled property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMBPELENABLED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMCOMBPELENABLED() {
            if (pmcombpelenabled == null) {
                pmcombpelenabled = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmcombpelenabled;
        }

        /**
         * Gets the value of the pmcombpelinprog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcombpelinprog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMBPELINPROG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMCOMBPELINPROG() {
            if (pmcombpelinprog == null) {
                pmcombpelinprog = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmcombpelinprog;
        }

        /**
         * Gets the value of the pmcomimpact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomimpact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMIMPACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCOMIMPACT() {
            if (pmcomimpact == null) {
                pmcomimpact = new ArrayList<MXLongQueryType>();
            }
            return this.pmcomimpact;
        }

        /**
         * Gets the value of the pmcomurgency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomurgency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMURGENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCOMURGENCY() {
            if (pmcomurgency == null) {
                pmcomurgency = new ArrayList<MXLongQueryType>();
            }
            return this.pmcomurgency;
        }

        /**
         * Gets the value of the pmcomflowseq property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomflowseq property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMFLOWSEQ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOMFLOWSEQ() {
            if (pmcomflowseq == null) {
                pmcomflowseq = new ArrayList<MXStringQueryType>();
            }
            return this.pmcomflowseq;
        }

        /**
         * Gets the value of the pmchgprogress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgprogress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGPROGRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGPROGRESS() {
            if (pmchgprogress == null) {
                pmchgprogress = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgprogress;
        }

        /**
         * Gets the value of the pmchgrelstate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgrelstate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGRELSTATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPMCHGRELSTATE() {
            if (pmchgrelstate == null) {
                pmchgrelstate = new ArrayList<MXDomainQueryType>();
            }
            return this.pmchgrelstate;
        }

        /**
         * Gets the value of the pmchgrelid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgrelid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGRELID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGRELID() {
            if (pmchgrelid == null) {
                pmchgrelid = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgrelid;
        }

        /**
         * Gets the value of the pmchgrelsiteid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgrelsiteid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGRELSITEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGRELSITEID() {
            if (pmchgrelsiteid == null) {
                pmchgrelsiteid = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgrelsiteid;
        }

        /**
         * Gets the value of the pmchgrelorgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgrelorgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGRELORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGRELORGID() {
            if (pmchgrelorgid == null) {
                pmchgrelorgid = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgrelorgid;
        }

        /**
         * Gets the value of the pmchgisimptask property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgisimptask property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGISIMPTASK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMCHGISIMPTASK() {
            if (pmchgisimptask == null) {
                pmchgisimptask = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmchgisimptask;
        }

        /**
         * Gets the value of the pmchgimpdesc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgimpdesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIMPDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGIMPDESC() {
            if (pmchgimpdesc == null) {
                pmchgimpdesc = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgimpdesc;
        }

        /**
         * Gets the value of the pmchgiatechsumcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgiatechsumcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIATECHSUMCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMCHGIATECHSUMCOST() {
            if (pmchgiatechsumcost == null) {
                pmchgiatechsumcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmchgiatechsumcost;
        }

        /**
         * Gets the value of the pmchgiabussumcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgiabussumcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIABUSSUMCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMCHGIABUSSUMCOST() {
            if (pmchgiabussumcost == null) {
                pmchgiabussumcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmchgiabussumcost;
        }

        /**
         * Gets the value of the pmchgiabussumeff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgiabussumeff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIABUSSUMEFF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMCHGIABUSSUMEFF() {
            if (pmchgiabussumeff == null) {
                pmchgiabussumeff = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmchgiabussumeff;
        }

        /**
         * Gets the value of the pmchgiatechsumeff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgiatechsumeff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIATECHSUMEFF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMCHGIATECHSUMEFF() {
            if (pmchgiatechsumeff == null) {
                pmchgiatechsumeff = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmchgiatechsumeff;
        }

        /**
         * Gets the value of the pmchgiadefrel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgiadefrel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIADEFREL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMCHGIADEFREL() {
            if (pmchgiadefrel == null) {
                pmchgiadefrel = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmchgiadefrel;
        }

        /**
         * Gets the value of the pmchgiatotalcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgiatotalcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIATOTALCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMCHGIATOTALCOST() {
            if (pmchgiatotalcost == null) {
                pmchgiatotalcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmchgiatotalcost;
        }

        /**
         * Gets the value of the pmchgiatotaleff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgiatotaleff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGIATOTALEFF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMCHGIATOTALEFF() {
            if (pmchgiatotaleff == null) {
                pmchgiatotaleff = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmchgiatotaleff;
        }

        /**
         * Gets the value of the pmchgevalstart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgevalstart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGEVALSTART().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPMCHGEVALSTART() {
            if (pmchgevalstart == null) {
                pmchgevalstart = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pmchgevalstart;
        }

        /**
         * Gets the value of the pmchgevalend property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgevalend property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGEVALEND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPMCHGEVALEND() {
            if (pmchgevalend == null) {
                pmchgevalend = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pmchgevalend;
        }

        /**
         * Gets the value of the pmchgapprovallevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgapprovallevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGAPPROVALLEVEL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCHGAPPROVALLEVEL() {
            if (pmchgapprovallevel == null) {
                pmchgapprovallevel = new ArrayList<MXLongQueryType>();
            }
            return this.pmchgapprovallevel;
        }

        /**
         * Gets the value of the pmchgapprovalstate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgapprovalstate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGAPPROVALSTATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGAPPROVALSTATE() {
            if (pmchgapprovalstate == null) {
                pmchgapprovalstate = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgapprovalstate;
        }

        /**
         * Gets the value of the pmchgrejectreason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgrejectreason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGREJECTREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGREJECTREASON() {
            if (pmchgrejectreason == null) {
                pmchgrejectreason = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgrejectreason;
        }

        /**
         * Gets the value of the pmchghasconflicts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchghasconflicts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGHASCONFLICTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMCHGHASCONFLICTS() {
            if (pmchghasconflicts == null) {
                pmchghasconflicts = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmchghasconflicts;
        }

        /**
         * Gets the value of the pmchgconflictdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgconflictdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGCONFLICTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPMCHGCONFLICTDATE() {
            if (pmchgconflictdate == null) {
                pmchgconflictdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pmchgconflictdate;
        }

        /**
         * Gets the value of the pmchgtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPMCHGTYPE() {
            if (pmchgtype == null) {
                pmchgtype = new ArrayList<MXDomainQueryType>();
            }
            return this.pmchgtype;
        }

        /**
         * Gets the value of the pmchgcat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgcat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGCAT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPMCHGCAT() {
            if (pmchgcat == null) {
                pmchgcat = new ArrayList<MXDomainQueryType>();
            }
            return this.pmchgcat;
        }

        /**
         * Gets the value of the pmchgconcern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgconcern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGCONCERN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGCONCERN() {
            if (pmchgconcern == null) {
                pmchgconcern = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgconcern;
        }

        /**
         * Gets the value of the pmchgskdprg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgskdprg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGSKDPRG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGSKDPRG() {
            if (pmchgskdprg == null) {
                pmchgskdprg = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgskdprg;
        }

        /**
         * Gets the value of the pmchgtotaloutages property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgtotaloutages property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGTOTALOUTAGES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCHGTOTALOUTAGES() {
            if (pmchgtotaloutages == null) {
                pmchgtotaloutages = new ArrayList<MXLongQueryType>();
            }
            return this.pmchgtotaloutages;
        }

        /**
         * Gets the value of the pmchgprobabilityfailure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgprobabilityfailure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGPROBABILITYFAILURE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCHGPROBABILITYFAILURE() {
            if (pmchgprobabilityfailure == null) {
                pmchgprobabilityfailure = new ArrayList<MXLongQueryType>();
            }
            return this.pmchgprobabilityfailure;
        }

        /**
         * Gets the value of the pmchgfullyautomated property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgfullyautomated property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGFULLYAUTOMATED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMCHGFULLYAUTOMATED() {
            if (pmchgfullyautomated == null) {
                pmchgfullyautomated = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmchgfullyautomated;
        }

        /**
         * Gets the value of the pmchgoutageimpact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgoutageimpact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGOUTAGEIMPACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCHGOUTAGEIMPACT() {
            if (pmchgoutageimpact == null) {
                pmchgoutageimpact = new ArrayList<MXLongQueryType>();
            }
            return this.pmchgoutageimpact;
        }

        /**
         * Gets the value of the pmchgmaximumassessedimpact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgmaximumassessedimpact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGMAXIMUMASSESSEDIMPACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCHGMAXIMUMASSESSEDIMPACT() {
            if (pmchgmaximumassessedimpact == null) {
                pmchgmaximumassessedimpact = new ArrayList<MXLongQueryType>();
            }
            return this.pmchgmaximumassessedimpact;
        }

        /**
         * Gets the value of the pmchgoutage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgoutage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGOUTAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPMCHGOUTAGE() {
            if (pmchgoutage == null) {
                pmchgoutage = new ArrayList<MXDomainQueryType>();
            }
            return this.pmchgoutage;
        }

        /**
         * Gets the value of the pmrelimpact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmrelimpact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMRELIMPACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMRELIMPACT() {
            if (pmrelimpact == null) {
                pmrelimpact = new ArrayList<MXStringQueryType>();
            }
            return this.pmrelimpact;
        }

        /**
         * Gets the value of the pmrelurgency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmrelurgency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMRELURGENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMRELURGENCY() {
            if (pmrelurgency == null) {
                pmrelurgency = new ArrayList<MXStringQueryType>();
            }
            return this.pmrelurgency;
        }

        /**
         * Gets the value of the pmrelbackoutexeted property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmrelbackoutexeted property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMRELBACKOUTEXETED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMRELBACKOUTEXETED() {
            if (pmrelbackoutexeted == null) {
                pmrelbackoutexeted = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmrelbackoutexeted;
        }

        /**
         * Gets the value of the pmrelsvcinstid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmrelsvcinstid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMRELSVCINSTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMRELSVCINSTID() {
            if (pmrelsvcinstid == null) {
                pmrelsvcinstid = new ArrayList<MXLongQueryType>();
            }
            return this.pmrelsvcinstid;
        }

        /**
         * Gets the value of the rbarc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rbarc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRBARC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getRBARC() {
            if (rbarc == null) {
                rbarc = new ArrayList<MXStringQueryType>();
            }
            return this.rbarc;
        }

        /**
         * Gets the value of the actliccost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actliccost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTLICCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTLICCOST() {
            if (actliccost == null) {
                actliccost = new ArrayList<MXDoubleQueryType>();
            }
            return this.actliccost;
        }

        /**
         * Gets the value of the estatapprliccost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estatapprliccost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTATAPPRLICCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTATAPPRLICCOST() {
            if (estatapprliccost == null) {
                estatapprliccost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estatapprliccost;
        }

        /**
         * Gets the value of the estliccost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estliccost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getESTLICCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getESTLICCOST() {
            if (estliccost == null) {
                estliccost = new ArrayList<MXDoubleQueryType>();
            }
            return this.estliccost;
        }

        /**
         * Gets the value of the tloamlicensenum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tloamlicensenum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTLOAMLICENSENUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTLOAMLICENSENUM() {
            if (tloamlicensenum == null) {
                tloamlicensenum = new ArrayList<MXStringQueryType>();
            }
            return this.tloamlicensenum;
        }

        /**
         * Gets the value of the pmchgwfassist property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgwfassist property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGWFASSIST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGWFASSIST() {
            if (pmchgwfassist == null) {
                pmchgwfassist = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgwfassist;
        }

        /**
         * Gets the value of the classificationid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classificationid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLASSIFICATIONID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCLASSIFICATIONID() {
            if (classificationid == null) {
                classificationid = new ArrayList<MXStringQueryType>();
            }
            return this.classificationid;
        }

        /**
         * Gets the value of the itdbckoutdur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdbckoutdur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDBCKOUTDUR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getITDBCKOUTDUR() {
            if (itdbckoutdur == null) {
                itdbckoutdur = new ArrayList<MXDoubleQueryType>();
            }
            return this.itdbckoutdur;
        }

        /**
         * Gets the value of the itdchcreatedby property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdchcreatedby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHCREATEDBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDCHCREATEDBY() {
            if (itdchcreatedby == null) {
                itdchcreatedby = new ArrayList<MXStringQueryType>();
            }
            return this.itdchcreatedby;
        }

        /**
         * Gets the value of the itdchcreatedbygroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdchcreatedbygroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHCREATEDBYGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDCHCREATEDBYGROUP() {
            if (itdchcreatedbygroup == null) {
                itdchcreatedbygroup = new ArrayList<MXStringQueryType>();
            }
            return this.itdchcreatedbygroup;
        }

        /**
         * Gets the value of the itdcheck property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdcheck property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHECK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getITDCHECK() {
            if (itdcheck == null) {
                itdcheck = new ArrayList<MXBooleanQueryType>();
            }
            return this.itdcheck;
        }

        /**
         * Gets the value of the itdchgauthlevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdchgauthlevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHGAUTHLEVEL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getITDCHGAUTHLEVEL() {
            if (itdchgauthlevel == null) {
                itdchgauthlevel = new ArrayList<MXLongQueryType>();
            }
            return this.itdchgauthlevel;
        }

        /**
         * Gets the value of the itdchgbusimpct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdchgbusimpct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHGBUSIMPCT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getITDCHGBUSIMPCT() {
            if (itdchgbusimpct == null) {
                itdchgbusimpct = new ArrayList<MXBooleanQueryType>();
            }
            return this.itdchgbusimpct;
        }

        /**
         * Gets the value of the itdchgcustreq property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdchgcustreq property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHGCUSTREQ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getITDCHGCUSTREQ() {
            if (itdchgcustreq == null) {
                itdchgcustreq = new ArrayList<MXBooleanQueryType>();
            }
            return this.itdchgcustreq;
        }

        /**
         * Gets the value of the itdchgmgr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdchgmgr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHGMGR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDCHGMGR() {
            if (itdchgmgr == null) {
                itdchgmgr = new ArrayList<MXStringQueryType>();
            }
            return this.itdchgmgr;
        }

        /**
         * Gets the value of the itdchgpretstdtl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdchgpretstdtl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCHGPRETSTDTL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDCHGPRETSTDTL() {
            if (itdchgpretstdtl == null) {
                itdchgpretstdtl = new ArrayList<MXStringQueryType>();
            }
            return this.itdchgpretstdtl;
        }

        /**
         * Gets the value of the itdclosurecode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdclosurecode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCLOSURECODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDCLOSURECODE() {
            if (itdclosurecode == null) {
                itdclosurecode = new ArrayList<MXStringQueryType>();
            }
            return this.itdclosurecode;
        }

        /**
         * Gets the value of the itdcreatedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdcreatedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDCREATEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getITDCREATEDATE() {
            if (itdcreatedate == null) {
                itdcreatedate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.itdcreatedate;
        }

        /**
         * Gets the value of the itddoccounts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itddoccounts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDDOCCOUNTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getITDDOCCOUNTS() {
            if (itddoccounts == null) {
                itddoccounts = new ArrayList<MXLongQueryType>();
            }
            return this.itddoccounts;
        }

        /**
         * Gets the value of the itdleadtimedays property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdleadtimedays property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDLEADTIMEDAYS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getITDLEADTIMEDAYS() {
            if (itdleadtimedays == null) {
                itdleadtimedays = new ArrayList<MXLongQueryType>();
            }
            return this.itdleadtimedays;
        }

        /**
         * Gets the value of the itdownergroups property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdownergroups property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDOWNERGROUPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDOWNERGROUPS() {
            if (itdownergroups == null) {
                itdownergroups = new ArrayList<MXStringQueryType>();
            }
            return this.itdownergroups;
        }

        /**
         * Gets the value of the itdowners property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdowners property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDOWNERS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDOWNERS() {
            if (itdowners == null) {
                itdowners = new ArrayList<MXStringQueryType>();
            }
            return this.itdowners;
        }

        /**
         * Gets the value of the itdexception property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdexception property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDEXCEPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDEXCEPTION() {
            if (itdexception == null) {
                itdexception = new ArrayList<MXStringQueryType>();
            }
            return this.itdexception;
        }

        /**
         * Gets the value of the amcrew property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amcrew property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAMCREW().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getAMCREW() {
            if (amcrew == null) {
                amcrew = new ArrayList<MXStringQueryType>();
            }
            return this.amcrew;
        }

        /**
         * Gets the value of the crewworkgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crewworkgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCREWWORKGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCREWWORKGROUP() {
            if (crewworkgroup == null) {
                crewworkgroup = new ArrayList<MXStringQueryType>();
            }
            return this.crewworkgroup;
        }

        /**
         * Gets the value of the reqasstdwntime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reqasstdwntime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREQASSTDWNTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getREQASSTDWNTIME() {
            if (reqasstdwntime == null) {
                reqasstdwntime = new ArrayList<MXBooleanQueryType>();
            }
            return this.reqasstdwntime;
        }

        /**
         * Gets the value of the rbaretry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rbaretry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRBARETRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getRBARETRY() {
            if (rbaretry == null) {
                rbaretry = new ArrayList<MXLongQueryType>();
            }
            return this.rbaretry;
        }

        /**
         * Gets the value of the apptrequired property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the apptrequired property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAPPTREQUIRED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getAPPTREQUIRED() {
            if (apptrequired == null) {
                apptrequired = new ArrayList<MXBooleanQueryType>();
            }
            return this.apptrequired;
        }

        /**
         * Gets the value of the aos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAOS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getAOS() {
            if (aos == null) {
                aos = new ArrayList<MXBooleanQueryType>();
            }
            return this.aos;
        }

        /**
         * Gets the value of the ams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAMS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getAMS() {
            if (ams == null) {
                ams = new ArrayList<MXBooleanQueryType>();
            }
            return this.ams;
        }

        /**
         * Gets the value of the los property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the los property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getLOS() {
            if (los == null) {
                los = new ArrayList<MXBooleanQueryType>();
            }
            return this.los;
        }

        /**
         * Gets the value of the lms property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lms property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLMS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getLMS() {
            if (lms == null) {
                lms = new ArrayList<MXBooleanQueryType>();
            }
            return this.lms;
        }

        /**
         * Gets the value of the pmchgskdprgscname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmchgskdprgscname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCHGSKDPRGSCNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCHGSKDPRGSCNAME() {
            if (pmchgskdprgscname == null) {
                pmchgskdprgscname = new ArrayList<MXStringQueryType>();
            }
            return this.pmchgskdprgscname;
        }

        /**
         * Gets the value of the itdrelmgr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdrelmgr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDRELMGR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDRELMGR() {
            if (itdrelmgr == null) {
                itdrelmgr = new ArrayList<MXStringQueryType>();
            }
            return this.itdrelmgr;
        }

        /**
         * Gets the value of the itdriskassessment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itdriskassessment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITDRISKASSESSMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getITDRISKASSESSMENT() {
            if (itdriskassessment == null) {
                itdriskassessment = new ArrayList<MXStringQueryType>();
            }
            return this.itdriskassessment;
        }

    }

}
