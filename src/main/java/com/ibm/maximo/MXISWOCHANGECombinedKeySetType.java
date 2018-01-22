
package com.ibm.maximo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MXISWOCHANGECombinedKeySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXISWOCHANGECombinedKeySetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WOCHANGE" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringType"/>
 *                   &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringType"/>
 *                   &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXISWOCHANGECombinedKeySetType", propOrder = {
    "wochange"
})
public class MXISWOCHANGECombinedKeySetType {

    @XmlElement(name = "WOCHANGE")
    protected List<MXISWOCHANGECombinedKeySetType.WOCHANGE> wochange;

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
     * {@link MXISWOCHANGECombinedKeySetType.WOCHANGE }
     * 
     * 
     */
    public List<MXISWOCHANGECombinedKeySetType.WOCHANGE> getWOCHANGE() {
        if (wochange == null) {
            wochange = new ArrayList<MXISWOCHANGECombinedKeySetType.WOCHANGE>();
        }
        return this.wochange;
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
     *         &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringType"/>
     *         &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringType"/>
     *         &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongType"/>
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
        "siteid",
        "wonum",
        "workorderid"
    })
    public static class WOCHANGE {

        @XmlElement(name = "SITEID", required = true)
        protected MXStringType siteid;
        @XmlElement(name = "WONUM", required = true)
        protected MXStringType wonum;
        @XmlElement(name = "WORKORDERID", required = true, nillable = true)
        protected MXLongType workorderid;

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
         * Gets the value of the workorderid property.
         * 
         * @return
         *     possible object is
         *     {@link MXLongType }
         *     
         */
        public MXLongType getWORKORDERID() {
            return workorderid;
        }

        /**
         * Sets the value of the workorderid property.
         * 
         * @param value
         *     allowed object is
         *     {@link MXLongType }
         *     
         */
        public void setWORKORDERID(MXLongType value) {
            this.workorderid = value;
        }

    }

}
