
package com.ibm.maximo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MXISWOCHANGE_DOCLINKSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGE_DOCLINKSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDINFO" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="APP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="COPYLINKTOWO" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DMSNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DOCINFOID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="DOCLINKSID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="DOCTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DOCUMENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DOCUMENTDATA" type="{http://www.ibm.com/maximo}MXBinaryType" minOccurs="0"/>
 *         &lt;element name="DOCVERSION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="GETLATESTVERSION" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="KEYCOLUMN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="NEWURLNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="OWNERID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/>
 *         &lt;element name="OWNERTABLE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PMSCOFFERING" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="PRINTTHRULINK" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="REFERENCE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="SHOW" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="UPLOAD" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/>
 *         &lt;element name="URLNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM4" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLPARAM5" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="URLTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="WEBURL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/>
 *         &lt;element name="DOCINFO" type="{http://www.ibm.com/maximo}MXISWOCHANGE_DOCINFOType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MXISWOCHANGE_DOCLINKSType", propOrder = {
    "addinfo",
    "app",
    "changeby",
    "changedate",
    "copylinktowo",
    "createby",
    "createdate",
    "description",
    "dmsname",
    "docinfoid",
    "doclinksid",
    "doctype",
    "document",
    "documentdata",
    "docversion",
    "getlatestversion",
    "keycolumn",
    "newurlname",
    "ownerid",
    "ownertable",
    "pmscoffering",
    "printthrulink",
    "reference",
    "show",
    "upload",
    "urlname",
    "urlparam1",
    "urlparam2",
    "urlparam3",
    "urlparam4",
    "urlparam5",
    "urltype",
    "weburl",
    "docinfo"
})
public class MXISWOCHANGEDOCLINKSType {

    @XmlElement(name = "ADDINFO")
    protected MXBooleanType addinfo;
    @XmlElement(name = "APP")
    protected MXStringType app;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "COPYLINKTOWO")
    protected MXBooleanType copylinktowo;
    @XmlElement(name = "CREATEBY")
    protected MXStringType createby;
    @XmlElementRef(name = "CREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> createdate;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DMSNAME")
    protected MXStringType dmsname;
    @XmlElementRef(name = "DOCINFOID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> docinfoid;
    @XmlElementRef(name = "DOCLINKSID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> doclinksid;
    @XmlElement(name = "DOCTYPE")
    protected MXStringType doctype;
    @XmlElement(name = "DOCUMENT")
    protected MXStringType document;
    @XmlElement(name = "DOCUMENTDATA")
    protected MXBinaryType documentdata;
    @XmlElement(name = "DOCVERSION")
    protected MXStringType docversion;
    @XmlElement(name = "GETLATESTVERSION")
    protected MXBooleanType getlatestversion;
    @XmlElement(name = "KEYCOLUMN")
    protected MXStringType keycolumn;
    @XmlElement(name = "NEWURLNAME")
    protected MXStringType newurlname;
    @XmlElementRef(name = "OWNERID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> ownerid;
    @XmlElement(name = "OWNERTABLE")
    protected MXStringType ownertable;
    @XmlElement(name = "PMSCOFFERING")
    protected MXStringType pmscoffering;
    @XmlElement(name = "PRINTTHRULINK")
    protected MXBooleanType printthrulink;
    @XmlElement(name = "REFERENCE")
    protected MXStringType reference;
    @XmlElement(name = "SHOW")
    protected MXBooleanType show;
    @XmlElement(name = "UPLOAD")
    protected MXBooleanType upload;
    @XmlElement(name = "URLNAME")
    protected MXStringType urlname;
    @XmlElement(name = "URLPARAM1")
    protected MXStringType urlparam1;
    @XmlElement(name = "URLPARAM2")
    protected MXStringType urlparam2;
    @XmlElement(name = "URLPARAM3")
    protected MXStringType urlparam3;
    @XmlElement(name = "URLPARAM4")
    protected MXStringType urlparam4;
    @XmlElement(name = "URLPARAM5")
    protected MXStringType urlparam5;
    @XmlElement(name = "URLTYPE")
    protected MXStringType urltype;
    @XmlElement(name = "WEBURL")
    protected MXStringType weburl;
    @XmlElement(name = "DOCINFO")
    protected List<MXISWOCHANGEDOCINFOType> docinfo;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the addinfo property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getADDINFO() {
        return addinfo;
    }

    /**
     * Sets the value of the addinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setADDINFO(MXBooleanType value) {
        this.addinfo = value;
    }

    /**
     * Gets the value of the app property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAPP() {
        return app;
    }

    /**
     * Sets the value of the app property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAPP(MXStringType value) {
        this.app = value;
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
     * Gets the value of the copylinktowo property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCOPYLINKTOWO() {
        return copylinktowo;
    }

    /**
     * Sets the value of the copylinktowo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCOPYLINKTOWO(MXBooleanType value) {
        this.copylinktowo = value;
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
     * Gets the value of the dmsname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDMSNAME() {
        return dmsname;
    }

    /**
     * Sets the value of the dmsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDMSNAME(MXStringType value) {
        this.dmsname = value;
    }

    /**
     * Gets the value of the docinfoid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getDOCINFOID() {
        return docinfoid;
    }

    /**
     * Sets the value of the docinfoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setDOCINFOID(JAXBElement<MXLongType> value) {
        this.docinfoid = value;
    }

    /**
     * Gets the value of the doclinksid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getDOCLINKSID() {
        return doclinksid;
    }

    /**
     * Sets the value of the doclinksid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setDOCLINKSID(JAXBElement<MXLongType> value) {
        this.doclinksid = value;
    }

    /**
     * Gets the value of the doctype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDOCTYPE() {
        return doctype;
    }

    /**
     * Sets the value of the doctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDOCTYPE(MXStringType value) {
        this.doctype = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDOCUMENT() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDOCUMENT(MXStringType value) {
        this.document = value;
    }

    /**
     * Gets the value of the documentdata property.
     * 
     * @return
     *     possible object is
     *     {@link MXBinaryType }
     *     
     */
    public MXBinaryType getDOCUMENTDATA() {
        return documentdata;
    }

    /**
     * Sets the value of the documentdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBinaryType }
     *     
     */
    public void setDOCUMENTDATA(MXBinaryType value) {
        this.documentdata = value;
    }

    /**
     * Gets the value of the docversion property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDOCVERSION() {
        return docversion;
    }

    /**
     * Sets the value of the docversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDOCVERSION(MXStringType value) {
        this.docversion = value;
    }

    /**
     * Gets the value of the getlatestversion property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getGETLATESTVERSION() {
        return getlatestversion;
    }

    /**
     * Sets the value of the getlatestversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setGETLATESTVERSION(MXBooleanType value) {
        this.getlatestversion = value;
    }

    /**
     * Gets the value of the keycolumn property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getKEYCOLUMN() {
        return keycolumn;
    }

    /**
     * Sets the value of the keycolumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setKEYCOLUMN(MXStringType value) {
        this.keycolumn = value;
    }

    /**
     * Gets the value of the newurlname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getNEWURLNAME() {
        return newurlname;
    }

    /**
     * Sets the value of the newurlname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setNEWURLNAME(MXStringType value) {
        this.newurlname = value;
    }

    /**
     * Gets the value of the ownerid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getOWNERID() {
        return ownerid;
    }

    /**
     * Sets the value of the ownerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setOWNERID(JAXBElement<MXLongType> value) {
        this.ownerid = value;
    }

    /**
     * Gets the value of the ownertable property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNERTABLE() {
        return ownertable;
    }

    /**
     * Sets the value of the ownertable property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNERTABLE(MXStringType value) {
        this.ownertable = value;
    }

    /**
     * Gets the value of the pmscoffering property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMSCOFFERING() {
        return pmscoffering;
    }

    /**
     * Sets the value of the pmscoffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMSCOFFERING(MXStringType value) {
        this.pmscoffering = value;
    }

    /**
     * Gets the value of the printthrulink property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPRINTTHRULINK() {
        return printthrulink;
    }

    /**
     * Sets the value of the printthrulink property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPRINTTHRULINK(MXBooleanType value) {
        this.printthrulink = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREFERENCE() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREFERENCE(MXStringType value) {
        this.reference = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSHOW() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSHOW(MXBooleanType value) {
        this.show = value;
    }

    /**
     * Gets the value of the upload property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getUPLOAD() {
        return upload;
    }

    /**
     * Sets the value of the upload property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setUPLOAD(MXBooleanType value) {
        this.upload = value;
    }

    /**
     * Gets the value of the urlname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLNAME() {
        return urlname;
    }

    /**
     * Sets the value of the urlname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLNAME(MXStringType value) {
        this.urlname = value;
    }

    /**
     * Gets the value of the urlparam1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM1() {
        return urlparam1;
    }

    /**
     * Sets the value of the urlparam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM1(MXStringType value) {
        this.urlparam1 = value;
    }

    /**
     * Gets the value of the urlparam2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM2() {
        return urlparam2;
    }

    /**
     * Sets the value of the urlparam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM2(MXStringType value) {
        this.urlparam2 = value;
    }

    /**
     * Gets the value of the urlparam3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM3() {
        return urlparam3;
    }

    /**
     * Sets the value of the urlparam3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM3(MXStringType value) {
        this.urlparam3 = value;
    }

    /**
     * Gets the value of the urlparam4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM4() {
        return urlparam4;
    }

    /**
     * Sets the value of the urlparam4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM4(MXStringType value) {
        this.urlparam4 = value;
    }

    /**
     * Gets the value of the urlparam5 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLPARAM5() {
        return urlparam5;
    }

    /**
     * Sets the value of the urlparam5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLPARAM5(MXStringType value) {
        this.urlparam5 = value;
    }

    /**
     * Gets the value of the urltype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getURLTYPE() {
        return urltype;
    }

    /**
     * Sets the value of the urltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setURLTYPE(MXStringType value) {
        this.urltype = value;
    }

    /**
     * Gets the value of the weburl property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWEBURL() {
        return weburl;
    }

    /**
     * Sets the value of the weburl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWEBURL(MXStringType value) {
        this.weburl = value;
    }

    /**
     * Gets the value of the docinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOCINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXISWOCHANGEDOCINFOType }
     * 
     * 
     */
    public List<MXISWOCHANGEDOCINFOType> getDOCINFO() {
        if (docinfo == null) {
            docinfo = new ArrayList<MXISWOCHANGEDOCINFOType>();
        }
        return this.docinfo;
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
