
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXISWOCHANGE_MULTIASSETLOCCIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_MULTIASSETLOCCIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTOUTAGEEND" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ACTOUTAGESTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="ASSETFEATUREID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="BASEMEASUREUNITID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="COMMENTS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ENDASSETFEATUREID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="ENDBASEMEASURE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ENDMEASURE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ENDMEASUREUNITID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ENDOFFSET" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ENDOFFSETUNITID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ENDYOFFSET" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ENDYOFFSETREF" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ENDZOFFSET" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="ENDZOFFSETREF" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FEATURE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="FEATURELABEL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ISPRIMARY" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="ITDSRVOUTTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MOVETOBIN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MOVETOLOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MOVETOPARENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MOVETOSITE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="MULTIID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="NEWASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="NEWREPLACEASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PERFORMMOVETO" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCHGASSESMENT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="PMCHGOUTAGE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/>
 *         &lt;element name="PROGRESS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="RECORDCLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="RECORDKEY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="REPLACEASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="REPLACEMENTSITE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ROUTE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="ROUTESTOP" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="SEQUENCE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="SERVICEDOWNTIME" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="STARTASSETFEATUREID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="STARTBASEMEASURE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="STARTMEASURE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="STARTMEASUREUNITID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STARTOFFSET" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="STARTOFFSETUNITID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STARTYOFFSET" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="STARTYOFFSETREF" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="STARTZOFFSET" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/>
 *         &lt;element name="STARTZOFFSETREF" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="TARGETDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORKORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WORKSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_MULTIASSETLOCCIType", propOrder = {
    "actoutageend",
    "actoutagestart",
    "assetfeatureid",
    "assetnum",
    "basemeasureunitid",
    "cinum",
    "comments",
    "commodity",
    "commoditygroup",
    "endassetfeatureid",
    "endbasemeasure",
    "endmeasure",
    "endmeasureunitid",
    "endoffset",
    "endoffsetunitid",
    "endyoffset",
    "endyoffsetref",
    "endzoffset",
    "endzoffsetref",
    "feature",
    "featurelabel",
    "isprimary",
    "itdsrvouttype",
    "location",
    "movetobin",
    "movetolocation",
    "movetoparent",
    "movetosite",
    "multiid",
    "newassetnum",
    "newreplaceassetnum",
    "orgid",
    "performmoveto",
    "pmchgassesment",
    "pmchgoutage",
    "progress",
    "recordclass",
    "recordkey",
    "replaceassetnum",
    "replacementsite",
    "route",
    "routestop",
    "sequence",
    "servicedowntime",
    "startassetfeatureid",
    "startbasemeasure",
    "startmeasure",
    "startmeasureunitid",
    "startoffset",
    "startoffsetunitid",
    "startyoffset",
    "startyoffsetref",
    "startzoffset",
    "startzoffsetref",
    "targetdesc",
    "workorgid",
    "worksiteid"
})
public class MXISWOCHANGEMULTIASSETLOCCIType {

    @XmlElementRef(name = "ACTOUTAGEEND", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actoutageend;
    @XmlElementRef(name = "ACTOUTAGESTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actoutagestart;
    @XmlElementRef(name = "ASSETFEATUREID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> assetfeatureid;
    @XmlElement(name = "ASSETNUM")
    protected MXStringType assetnum;
    @XmlElement(name = "BASEMEASUREUNITID")
    protected MXStringType basemeasureunitid;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElement(name = "COMMENTS")
    protected MXStringType comments;
    @XmlElement(name = "COMMODITY")
    protected MXStringType commodity;
    @XmlElement(name = "COMMODITYGROUP")
    protected MXStringType commoditygroup;
    @XmlElementRef(name = "ENDASSETFEATUREID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> endassetfeatureid;
    @XmlElementRef(name = "ENDBASEMEASURE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> endbasemeasure;
    @XmlElementRef(name = "ENDMEASURE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> endmeasure;
    @XmlElement(name = "ENDMEASUREUNITID")
    protected MXStringType endmeasureunitid;
    @XmlElementRef(name = "ENDOFFSET", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> endoffset;
    @XmlElement(name = "ENDOFFSETUNITID")
    protected MXStringType endoffsetunitid;
    @XmlElementRef(name = "ENDYOFFSET", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> endyoffset;
    @XmlElement(name = "ENDYOFFSETREF")
    protected MXStringType endyoffsetref;
    @XmlElementRef(name = "ENDZOFFSET", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> endzoffset;
    @XmlElement(name = "ENDZOFFSETREF")
    protected MXStringType endzoffsetref;
    @XmlElement(name = "FEATURE")
    protected MXStringType feature;
    @XmlElement(name = "FEATURELABEL")
    protected MXStringType featurelabel;
    @XmlElement(name = "ISPRIMARY")
    protected MXBooleanType isprimary;
    @XmlElement(name = "ITDSRVOUTTYPE")
    protected MXStringType itdsrvouttype;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElement(name = "MOVETOBIN")
    protected MXStringType movetobin;
    @XmlElement(name = "MOVETOLOCATION")
    protected MXStringType movetolocation;
    @XmlElement(name = "MOVETOPARENT")
    protected MXStringType movetoparent;
    @XmlElement(name = "MOVETOSITE")
    protected MXStringType movetosite;
    @XmlElementRef(name = "MULTIID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> multiid;
    @XmlElement(name = "NEWASSETNUM")
    protected MXStringType newassetnum;
    @XmlElement(name = "NEWREPLACEASSETNUM")
    protected MXStringType newreplaceassetnum;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "PERFORMMOVETO")
    protected MXBooleanType performmoveto;
    @XmlElement(name = "PMCHGASSESMENT")
    protected MXBooleanType pmchgassesment;
    @XmlElement(name = "PMCHGOUTAGE")
    protected MXDomainType pmchgoutage;
    @XmlElement(name = "PROGRESS")
    protected MXBooleanType progress;
    @XmlElement(name = "RECORDCLASS")
    protected MXStringType recordclass;
    @XmlElement(name = "RECORDKEY")
    protected MXStringType recordkey;
    @XmlElement(name = "REPLACEASSETNUM")
    protected MXStringType replaceassetnum;
    @XmlElement(name = "REPLACEMENTSITE")
    protected MXStringType replacementsite;
    @XmlElement(name = "ROUTE")
    protected MXStringType route;
    @XmlElementRef(name = "ROUTESTOP", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> routestop;
    @XmlElementRef(name = "SEQUENCE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> sequence;
    @XmlElementRef(name = "SERVICEDOWNTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> servicedowntime;
    @XmlElementRef(name = "STARTASSETFEATUREID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> startassetfeatureid;
    @XmlElementRef(name = "STARTBASEMEASURE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> startbasemeasure;
    @XmlElementRef(name = "STARTMEASURE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> startmeasure;
    @XmlElement(name = "STARTMEASUREUNITID")
    protected MXStringType startmeasureunitid;
    @XmlElementRef(name = "STARTOFFSET", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> startoffset;
    @XmlElement(name = "STARTOFFSETUNITID")
    protected MXStringType startoffsetunitid;
    @XmlElementRef(name = "STARTYOFFSET", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> startyoffset;
    @XmlElement(name = "STARTYOFFSETREF")
    protected MXStringType startyoffsetref;
    @XmlElementRef(name = "STARTZOFFSET", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> startzoffset;
    @XmlElement(name = "STARTZOFFSETREF")
    protected MXStringType startzoffsetref;
    @XmlElement(name = "TARGETDESC")
    protected MXStringType targetdesc;
    @XmlElement(name = "WORKORGID")
    protected MXStringType workorgid;
    @XmlElement(name = "WORKSITEID")
    protected MXStringType worksiteid;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the actoutageend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTOUTAGEEND() {
        return actoutageend;
    }

    /**
     * Sets the value of the actoutageend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTOUTAGEEND(JAXBElement<MXDateTimeType> value) {
        this.actoutageend = value;
    }

    /**
     * Gets the value of the actoutagestart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTOUTAGESTART() {
        return actoutagestart;
    }

    /**
     * Sets the value of the actoutagestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTOUTAGESTART(JAXBElement<MXDateTimeType> value) {
        this.actoutagestart = value;
    }

    /**
     * Gets the value of the assetfeatureid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getASSETFEATUREID() {
        return assetfeatureid;
    }

    /**
     * Sets the value of the assetfeatureid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setASSETFEATUREID(JAXBElement<MXLongType> value) {
        this.assetfeatureid = value;
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
     * Gets the value of the basemeasureunitid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBASEMEASUREUNITID() {
        return basemeasureunitid;
    }

    /**
     * Sets the value of the basemeasureunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBASEMEASUREUNITID(MXStringType value) {
        this.basemeasureunitid = value;
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCOMMENTS() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCOMMENTS(MXStringType value) {
        this.comments = value;
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
     * Gets the value of the endassetfeatureid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getENDASSETFEATUREID() {
        return endassetfeatureid;
    }

    /**
     * Sets the value of the endassetfeatureid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setENDASSETFEATUREID(JAXBElement<MXLongType> value) {
        this.endassetfeatureid = value;
    }

    /**
     * Gets the value of the endbasemeasure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getENDBASEMEASURE() {
        return endbasemeasure;
    }

    /**
     * Sets the value of the endbasemeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setENDBASEMEASURE(JAXBElement<MXDoubleType> value) {
        this.endbasemeasure = value;
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
     * Gets the value of the endmeasureunitid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getENDMEASUREUNITID() {
        return endmeasureunitid;
    }

    /**
     * Sets the value of the endmeasureunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setENDMEASUREUNITID(MXStringType value) {
        this.endmeasureunitid = value;
    }

    /**
     * Gets the value of the endoffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getENDOFFSET() {
        return endoffset;
    }

    /**
     * Sets the value of the endoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setENDOFFSET(JAXBElement<MXDoubleType> value) {
        this.endoffset = value;
    }

    /**
     * Gets the value of the endoffsetunitid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getENDOFFSETUNITID() {
        return endoffsetunitid;
    }

    /**
     * Sets the value of the endoffsetunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setENDOFFSETUNITID(MXStringType value) {
        this.endoffsetunitid = value;
    }

    /**
     * Gets the value of the endyoffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getENDYOFFSET() {
        return endyoffset;
    }

    /**
     * Sets the value of the endyoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setENDYOFFSET(JAXBElement<MXDoubleType> value) {
        this.endyoffset = value;
    }

    /**
     * Gets the value of the endyoffsetref property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getENDYOFFSETREF() {
        return endyoffsetref;
    }

    /**
     * Sets the value of the endyoffsetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setENDYOFFSETREF(MXStringType value) {
        this.endyoffsetref = value;
    }

    /**
     * Gets the value of the endzoffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getENDZOFFSET() {
        return endzoffset;
    }

    /**
     * Sets the value of the endzoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setENDZOFFSET(JAXBElement<MXDoubleType> value) {
        this.endzoffset = value;
    }

    /**
     * Gets the value of the endzoffsetref property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getENDZOFFSETREF() {
        return endzoffsetref;
    }

    /**
     * Sets the value of the endzoffsetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setENDZOFFSETREF(MXStringType value) {
        this.endzoffsetref = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFEATURE() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFEATURE(MXStringType value) {
        this.feature = value;
    }

    /**
     * Gets the value of the featurelabel property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFEATURELABEL() {
        return featurelabel;
    }

    /**
     * Sets the value of the featurelabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFEATURELABEL(MXStringType value) {
        this.featurelabel = value;
    }

    /**
     * Gets the value of the isprimary property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISPRIMARY() {
        return isprimary;
    }

    /**
     * Sets the value of the isprimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISPRIMARY(MXBooleanType value) {
        this.isprimary = value;
    }

    /**
     * Gets the value of the itdsrvouttype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getITDSRVOUTTYPE() {
        return itdsrvouttype;
    }

    /**
     * Sets the value of the itdsrvouttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setITDSRVOUTTYPE(MXStringType value) {
        this.itdsrvouttype = value;
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
     * Gets the value of the movetobin property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMOVETOBIN() {
        return movetobin;
    }

    /**
     * Sets the value of the movetobin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMOVETOBIN(MXStringType value) {
        this.movetobin = value;
    }

    /**
     * Gets the value of the movetolocation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMOVETOLOCATION() {
        return movetolocation;
    }

    /**
     * Sets the value of the movetolocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMOVETOLOCATION(MXStringType value) {
        this.movetolocation = value;
    }

    /**
     * Gets the value of the movetoparent property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMOVETOPARENT() {
        return movetoparent;
    }

    /**
     * Sets the value of the movetoparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMOVETOPARENT(MXStringType value) {
        this.movetoparent = value;
    }

    /**
     * Gets the value of the movetosite property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMOVETOSITE() {
        return movetosite;
    }

    /**
     * Sets the value of the movetosite property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMOVETOSITE(MXStringType value) {
        this.movetosite = value;
    }

    /**
     * Gets the value of the multiid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getMULTIID() {
        return multiid;
    }

    /**
     * Sets the value of the multiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setMULTIID(JAXBElement<MXLongType> value) {
        this.multiid = value;
    }

    /**
     * Gets the value of the newassetnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getNEWASSETNUM() {
        return newassetnum;
    }

    /**
     * Sets the value of the newassetnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setNEWASSETNUM(MXStringType value) {
        this.newassetnum = value;
    }

    /**
     * Gets the value of the newreplaceassetnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getNEWREPLACEASSETNUM() {
        return newreplaceassetnum;
    }

    /**
     * Sets the value of the newreplaceassetnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setNEWREPLACEASSETNUM(MXStringType value) {
        this.newreplaceassetnum = value;
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
     * Gets the value of the performmoveto property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPERFORMMOVETO() {
        return performmoveto;
    }

    /**
     * Sets the value of the performmoveto property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPERFORMMOVETO(MXBooleanType value) {
        this.performmoveto = value;
    }

    /**
     * Gets the value of the pmchgassesment property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCHGASSESMENT() {
        return pmchgassesment;
    }

    /**
     * Sets the value of the pmchgassesment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCHGASSESMENT(MXBooleanType value) {
        this.pmchgassesment = value;
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
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPROGRESS() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPROGRESS(MXBooleanType value) {
        this.progress = value;
    }

    /**
     * Gets the value of the recordclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRECORDCLASS() {
        return recordclass;
    }

    /**
     * Sets the value of the recordclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRECORDCLASS(MXStringType value) {
        this.recordclass = value;
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
     * Gets the value of the replaceassetnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPLACEASSETNUM() {
        return replaceassetnum;
    }

    /**
     * Sets the value of the replaceassetnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPLACEASSETNUM(MXStringType value) {
        this.replaceassetnum = value;
    }

    /**
     * Gets the value of the replacementsite property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPLACEMENTSITE() {
        return replacementsite;
    }

    /**
     * Sets the value of the replacementsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPLACEMENTSITE(MXStringType value) {
        this.replacementsite = value;
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
     * Gets the value of the routestop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getROUTESTOP() {
        return routestop;
    }

    /**
     * Sets the value of the routestop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setROUTESTOP(JAXBElement<MXLongType> value) {
        this.routestop = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getSEQUENCE() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setSEQUENCE(JAXBElement<MXLongType> value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the servicedowntime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getSERVICEDOWNTIME() {
        return servicedowntime;
    }

    /**
     * Sets the value of the servicedowntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setSERVICEDOWNTIME(JAXBElement<MXDoubleType> value) {
        this.servicedowntime = value;
    }

    /**
     * Gets the value of the startassetfeatureid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getSTARTASSETFEATUREID() {
        return startassetfeatureid;
    }

    /**
     * Sets the value of the startassetfeatureid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setSTARTASSETFEATUREID(JAXBElement<MXLongType> value) {
        this.startassetfeatureid = value;
    }

    /**
     * Gets the value of the startbasemeasure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getSTARTBASEMEASURE() {
        return startbasemeasure;
    }

    /**
     * Sets the value of the startbasemeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setSTARTBASEMEASURE(JAXBElement<MXDoubleType> value) {
        this.startbasemeasure = value;
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
     * Gets the value of the startmeasureunitid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTARTMEASUREUNITID() {
        return startmeasureunitid;
    }

    /**
     * Sets the value of the startmeasureunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTARTMEASUREUNITID(MXStringType value) {
        this.startmeasureunitid = value;
    }

    /**
     * Gets the value of the startoffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getSTARTOFFSET() {
        return startoffset;
    }

    /**
     * Sets the value of the startoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setSTARTOFFSET(JAXBElement<MXDoubleType> value) {
        this.startoffset = value;
    }

    /**
     * Gets the value of the startoffsetunitid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTARTOFFSETUNITID() {
        return startoffsetunitid;
    }

    /**
     * Sets the value of the startoffsetunitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTARTOFFSETUNITID(MXStringType value) {
        this.startoffsetunitid = value;
    }

    /**
     * Gets the value of the startyoffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getSTARTYOFFSET() {
        return startyoffset;
    }

    /**
     * Sets the value of the startyoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setSTARTYOFFSET(JAXBElement<MXDoubleType> value) {
        this.startyoffset = value;
    }

    /**
     * Gets the value of the startyoffsetref property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTARTYOFFSETREF() {
        return startyoffsetref;
    }

    /**
     * Sets the value of the startyoffsetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTARTYOFFSETREF(MXStringType value) {
        this.startyoffsetref = value;
    }

    /**
     * Gets the value of the startzoffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getSTARTZOFFSET() {
        return startzoffset;
    }

    /**
     * Sets the value of the startzoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setSTARTZOFFSET(JAXBElement<MXDoubleType> value) {
        this.startzoffset = value;
    }

    /**
     * Gets the value of the startzoffsetref property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTARTZOFFSETREF() {
        return startzoffsetref;
    }

    /**
     * Sets the value of the startzoffsetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTARTZOFFSETREF(MXStringType value) {
        this.startzoffsetref = value;
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
     * Gets the value of the workorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORKORGID() {
        return workorgid;
    }

    /**
     * Sets the value of the workorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORKORGID(MXStringType value) {
        this.workorgid = value;
    }

    /**
     * Gets the value of the worksiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORKSITEID() {
        return worksiteid;
    }

    /**
     * Sets the value of the worksiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORKSITEID(MXStringType value) {
        this.worksiteid = value;
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
