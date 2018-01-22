
package com.ibm.maximo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MXISWOCHANGESetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGESetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WOCHANGE" type="{http://www.ibm.com/maximo}MXISWOCHANGE_WOCHANGEType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXISWOCHANGESetType", propOrder = {
    "wochange"
})
public class MXISWOCHANGESetType {

    @XmlElement(name = "WOCHANGE")
    protected List<MXISWOCHANGEWOCHANGEType> wochange;

    /**
     * Gets the value of the wochange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wochange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWOCHANGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXISWOCHANGEWOCHANGEType }
     * 
     * 
     */
    public List<MXISWOCHANGEWOCHANGEType> getWOCHANGE() {
        if (wochange == null) {
            wochange = new ArrayList<MXISWOCHANGEWOCHANGEType>();
        }
        return this.wochange;
    }

}
