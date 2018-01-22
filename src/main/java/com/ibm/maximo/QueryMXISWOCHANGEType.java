
package com.ibm.maximo;

import com.ibm.maximo.runtime.ZeroOneBooleanAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for QueryMXISWOCHANGEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryMXISWOCHANGEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ibm.com/maximo}MXISWOCHANGEQuery"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}CommonContentGroup"/>
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}QueryContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMXISWOCHANGEType", propOrder = {
    "mxiswochangeQuery"
})
public class QueryMXISWOCHANGEType {

    @XmlElement(name = "MXISWOCHANGEQuery", required = true)
    protected MXISWOCHANGEQueryType mxiswochangeQuery;
    @XmlAttribute(name = "creationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlAttribute(name = "baseLanguage")
    protected String baseLanguage;
    @XmlAttribute(name = "transLanguage")
    protected String transLanguage;
    @XmlAttribute(name = "messageID")
    protected String messageID;
    @XmlAttribute(name = "maximoVersion")
    protected String maximoVersion;
    @XmlAttribute(name = "uniqueResult")
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean uniqueResult;
    @XmlAttribute(name = "maxItems")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxItems;
    @XmlAttribute(name = "rsStart")
    protected BigInteger rsStart;

    /**
     * Gets the value of the mxiswochangeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link MXISWOCHANGEQueryType }
     *     
     */
    public MXISWOCHANGEQueryType getMXISWOCHANGEQuery() {
        return mxiswochangeQuery;
    }

    /**
     * Sets the value of the mxiswochangeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXISWOCHANGEQueryType }
     *     
     */
    public void setMXISWOCHANGEQuery(MXISWOCHANGEQueryType value) {
        this.mxiswochangeQuery = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the baseLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseLanguage() {
        return baseLanguage;
    }

    /**
     * Sets the value of the baseLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseLanguage(String value) {
        this.baseLanguage = value;
    }

    /**
     * Gets the value of the transLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransLanguage() {
        return transLanguage;
    }

    /**
     * Sets the value of the transLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransLanguage(String value) {
        this.transLanguage = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the maximoVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximoVersion() {
        return maximoVersion;
    }

    /**
     * Sets the value of the maximoVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximoVersion(String value) {
        this.maximoVersion = value;
    }

    /**
     * Gets the value of the uniqueResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isUniqueResult() {
        if (uniqueResult == null) {
            return new ZeroOneBooleanAdapter().unmarshal("0");
        } else {
            return uniqueResult;
        }
    }

    /**
     * Sets the value of the uniqueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueResult(Boolean value) {
        this.uniqueResult = value;
    }

    /**
     * Gets the value of the maxItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItems() {
        return maxItems;
    }

    /**
     * Sets the value of the maxItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItems(BigInteger value) {
        this.maxItems = value;
    }

    /**
     * Gets the value of the rsStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsStart() {
        if (rsStart == null) {
            return new BigInteger("0");
        } else {
            return rsStart;
        }
    }

    /**
     * Sets the value of the rsStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsStart(BigInteger value) {
        this.rsStart = value;
    }

}
