
package com.ibm.maximo;

import com.ibm.maximo.runtime.ZeroOneBooleanAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MXBooleanQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXBooleanQueryType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ibm.com/maximo>BooleanType">
 *       &lt;attribute name="operator" type="{http://www.ibm.com/maximo}QueryOperatorType" />
 *       &lt;attribute name="operandModeOR" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXBooleanQueryType", propOrder = {
    "value"
})
public class MXBooleanQueryType {

    @XmlValue
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean value;
    @XmlAttribute(name = "operator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operator;
    @XmlAttribute(name = "operandModeOR")
    protected Boolean operandModeOR;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isValue() {
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
    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operandModeOR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperandModeOR() {
        return operandModeOR;
    }

    /**
     * Sets the value of the operandModeOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperandModeOR(Boolean value) {
        this.operandModeOR = value;
    }

}
