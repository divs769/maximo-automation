
package com.ibm.maximo;

import com.ibm.maximo.runtime.ZeroOneBooleanAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MXCryptoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXCryptoType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="changed" type="{http://www.ibm.com/maximo}ChangeIndicatorType" />
 *       &lt;attribute name="mxencrypted" type="{http://www.ibm.com/maximo}BooleanType" default="1" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXCryptoType", propOrder = {
    "value"
})
public class MXCryptoType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "changed")
    protected Boolean changed;
    @XmlAttribute(name = "mxencrypted")
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean mxencrypted;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
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
     * Gets the value of the mxencrypted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isMxencrypted() {
        if (mxencrypted == null) {
            return new ZeroOneBooleanAdapter().unmarshal("1");
        } else {
            return mxencrypted;
        }
    }

    /**
     * Sets the value of the mxencrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMxencrypted(Boolean value) {
        this.mxencrypted = value;
    }

}
