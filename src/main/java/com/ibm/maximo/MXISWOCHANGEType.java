
package com.ibm.maximo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MXISWOCHANGEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WOCHANGE" type="{http://www.ibm.com/maximo}MXISWOCHANGE_WOCHANGEType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXISWOCHANGEType", propOrder = {
    "wochange"
})
public class MXISWOCHANGEType {

    @XmlElement(name = "WOCHANGE")
    protected MXISWOCHANGEWOCHANGEType wochange;

    /**
     * Gets the value of the wochange property.
     * 
     * @return
     *     possible object is
     *     {@link MXISWOCHANGEWOCHANGEType }
     *     
     */
    public MXISWOCHANGEWOCHANGEType getWOCHANGE() {
        return wochange;
    }

    /**
     * Sets the value of the wochange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXISWOCHANGEWOCHANGEType }
     *     
     */
    public void setWOCHANGE(MXISWOCHANGEWOCHANGEType value) {
        this.wochange = value;
    }

}
