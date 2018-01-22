
package com.ibm.maximo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="AddChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessingActionType")
@XmlEnum
public enum ProcessingActionType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("AddChange")
    ADD_CHANGE("AddChange");
    private final String value;

    ProcessingActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessingActionType fromValue(String v) {
        for (ProcessingActionType c: ProcessingActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
