//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.14 at 02:36:58 PM EEST 
//


package com.osf.romanvintonyak.WSDummy.AssessmentCatalog;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotApplicableLiteral.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotApplicableLiteral">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="notApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotApplicableLiteral")
@XmlEnum
public enum NotApplicableLiteral {

    @XmlEnumValue("notApplicable")
    NOT_APPLICABLE("notApplicable");
    private final String value;

    NotApplicableLiteral(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotApplicableLiteral fromValue(String v) {
        for (NotApplicableLiteral c: NotApplicableLiteral.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}