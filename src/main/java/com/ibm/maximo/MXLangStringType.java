
package com.ibm.maximo;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MXLangStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXLangStringType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="changed" type="{http://www.ibm.com/maximo}ChangeIndicatorType" />
 *       &lt;attribute name="languageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="1" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXLangStringType", propOrder = {
    "value"
})
public class MXLangStringType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "changed")
    protected Boolean changed;
    @XmlAttribute(name = "languageEnabled")
    protected Boolean languageEnabled;

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

    /**
     * Gets the value of the languageEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLanguageEnabled() {
        if (languageEnabled == null) {
            return true;
        } else {
            return languageEnabled;
        }
    }

    /**
     * Sets the value of the languageEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguageEnabled(Boolean value) {
        this.languageEnabled = value;
    }

}
