//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.10 at 12:13:11 AM CET 
//


package com.tableausoftware.documentation.api.rest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="datasourceValueStore" type="{http://tableau.com/api}dataSourceValueStoreType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueSourceType", propOrder = {
    "datasourceValueStore"
})
public class ValueSourceType {

    protected DataSourceValueStoreType datasourceValueStore;

    /**
     * Gets the value of the datasourceValueStore property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceValueStoreType }
     *     
     */
    public DataSourceValueStoreType getDatasourceValueStore() {
        return datasourceValueStore;
    }

    /**
     * Sets the value of the datasourceValueStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceValueStoreType }
     *     
     */
    public void setDatasourceValueStore(DataSourceValueStoreType value) {
        this.datasourceValueStore = value;
    }

}
