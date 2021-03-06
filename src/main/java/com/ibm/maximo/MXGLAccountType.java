
package com.ibm.maximo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MXGLAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXGLAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLCOMP" type="{http://www.ibm.com/maximo}MXGLComponentType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="changed" type="{http://www.ibm.com/maximo}ChangeIndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXGLAccountType", propOrder = {
    "value",
    "glcomp"
})
public class MXGLAccountType {

    @XmlElement(name = "VALUE")
    protected String value;
    @XmlElement(name = "GLCOMP")
    protected List<MXGLComponentType> glcomp;
    @XmlAttribute(name = "changed")
    protected Boolean changed;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the glcomp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glcomp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGLCOMP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXGLComponentType }
     * 
     * 
     */
    public List<MXGLComponentType> getGLCOMP() {
        if (glcomp == null) {
            glcomp = new ArrayList<MXGLComponentType>();
        }
        return this.glcomp;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChanged(Boolean value) {
        this.changed = value;
    }

}
