
package com.ibm.maximo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WOCHANGEMboType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WOCHANGEMboType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WOCHANGE" type="{http://www.ibm.com/maximo}WOCHANGEObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WOCHANGEMboType", propOrder = {
    "wochange"
})
public class WOCHANGEMboType {

    @XmlElement(name = "WOCHANGE")
    protected WOCHANGEObjectType wochange;

    /**
     * Gets the value of the wochange property.
     * 
     * @return
     *     possible object is
     *     {@link WOCHANGEObjectType }
     *     
     */
    public WOCHANGEObjectType getWOCHANGE() {
        return wochange;
    }

    /**
     * Sets the value of the wochange property.
     * 
     * @param value
     *     allowed object is
     *     {@link WOCHANGEObjectType }
     *     
     */
    public void setWOCHANGE(WOCHANGEObjectType value) {
        this.wochange = value;
    }

}
