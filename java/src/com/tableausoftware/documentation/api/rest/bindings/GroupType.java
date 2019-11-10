//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.10 at 12:13:11 AM CET 
//


package com.tableausoftware.documentation.api.rest.bindings;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain" type="{http://tableau.com/api}domainDirectiveType" minOccurs="0"/>
 *         &lt;element name="import" type="{http://tableau.com/api}importDirectiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://tableau.com/api}resourceIdType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="minimumSiteRole" type="{http://tableau.com/api}siteRoleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupType", propOrder = {
    "domain",
    "_import"
})
public class GroupType {

    protected DomainDirectiveType domain;
    @XmlElement(name = "import")
    protected ImportDirectiveType _import;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "userCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger userCount;
    @XmlAttribute(name = "minimumSiteRole")
    protected SiteRoleType minimumSiteRole;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link DomainDirectiveType }
     *     
     */
    public DomainDirectiveType getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainDirectiveType }
     *     
     */
    public void setDomain(DomainDirectiveType value) {
        this.domain = value;
    }

    /**
     * Gets the value of the import property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDirectiveType }
     *     
     */
    public ImportDirectiveType getImport() {
        return _import;
    }

    /**
     * Sets the value of the import property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDirectiveType }
     *     
     */
    public void setImport(ImportDirectiveType value) {
        this._import = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the userCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserCount() {
        return userCount;
    }

    /**
     * Sets the value of the userCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserCount(BigInteger value) {
        this.userCount = value;
    }

    /**
     * Gets the value of the minimumSiteRole property.
     * 
     * @return
     *     possible object is
     *     {@link SiteRoleType }
     *     
     */
    public SiteRoleType getMinimumSiteRole() {
        return minimumSiteRole;
    }

    /**
     * Sets the value of the minimumSiteRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRoleType }
     *     
     */
    public void setMinimumSiteRole(SiteRoleType value) {
        this.minimumSiteRole = value;
    }

}
