
package com.ibm.maximo;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXGLComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXGLComponentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="glorder" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxExclusive value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXGLComponentType", propOrder = {
    "value"
})
public class MXGLComponentType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "glorder", required = true)
    protected int glorder;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
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
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the glorder property.
     * 
     */
    public int getGlorder() {
        return glorder;
    }

    /**
     * Sets the value of the glorder property.
     * 
     */
    public void setGlorder(int value) {
        this.glorder = value;
    }

}
