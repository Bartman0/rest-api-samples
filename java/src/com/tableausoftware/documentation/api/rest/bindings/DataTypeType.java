//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.10 at 12:13:11 AM CET 
//


package com.tableausoftware.documentation.api.rest.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA_TYPE_UNSPECIFIED"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="BOOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataTypeType")
@XmlEnum
public enum DataTypeType {

    DATA_TYPE_UNSPECIFIED,
    DATE,
    DATETIME,
    STRING,
    INT,
    FLOAT,
    BOOL;

    public String value() {
        return name();
    }

    public static DataTypeType fromValue(String v) {
        return valueOf(v);
    }

}