
package zswi.schemas.dav.userinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{DAV}acl-principal-prop-set"/>
 *         &lt;element ref="{DAV}expand-property"/>
 *         &lt;element ref="{DAV}principal-match"/>
 *         &lt;element ref="{DAV}principal-property-search"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}calendarserver-principal-search"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aclPrincipalPropSet",
    "expandProperty",
    "principalMatch",
    "principalPropertySearch",
    "calendarserverPrincipalSearch"
})
@XmlRootElement(name = "report")
public class Report {

    @XmlElement(name = "acl-principal-prop-set")
    protected AclPrincipalPropSet aclPrincipalPropSet;
    @XmlElement(name = "expand-property")
    protected ExpandProperty expandProperty;
    @XmlElement(name = "principal-match")
    protected PrincipalMatch principalMatch;
    @XmlElement(name = "principal-property-search")
    protected PrincipalPropertySearch principalPropertySearch;
    @XmlElement(name = "calendarserver-principal-search", namespace = "http://calendarserver.org/ns/")
    protected CalendarserverPrincipalSearch calendarserverPrincipalSearch;

    /**
     * Gets the value of the aclPrincipalPropSet property.
     * 
     * @return
     *     possible object is
     *     {@link AclPrincipalPropSet }
     *     
     */
    public AclPrincipalPropSet getAclPrincipalPropSet() {
        return aclPrincipalPropSet;
    }

    /**
     * Sets the value of the aclPrincipalPropSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclPrincipalPropSet }
     *     
     */
    public void setAclPrincipalPropSet(AclPrincipalPropSet value) {
        this.aclPrincipalPropSet = value;
    }

    /**
     * Gets the value of the expandProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ExpandProperty }
     *     
     */
    public ExpandProperty getExpandProperty() {
        return expandProperty;
    }

    /**
     * Sets the value of the expandProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpandProperty }
     *     
     */
    public void setExpandProperty(ExpandProperty value) {
        this.expandProperty = value;
    }

    /**
     * Gets the value of the principalMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalMatch }
     *     
     */
    public PrincipalMatch getPrincipalMatch() {
        return principalMatch;
    }

    /**
     * Sets the value of the principalMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalMatch }
     *     
     */
    public void setPrincipalMatch(PrincipalMatch value) {
        this.principalMatch = value;
    }

    /**
     * Gets the value of the principalPropertySearch property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalPropertySearch }
     *     
     */
    public PrincipalPropertySearch getPrincipalPropertySearch() {
        return principalPropertySearch;
    }

    /**
     * Sets the value of the principalPropertySearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalPropertySearch }
     *     
     */
    public void setPrincipalPropertySearch(PrincipalPropertySearch value) {
        this.principalPropertySearch = value;
    }

    /**
     * Gets the value of the calendarserverPrincipalSearch property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarserverPrincipalSearch }
     *     
     */
    public CalendarserverPrincipalSearch getCalendarserverPrincipalSearch() {
        return calendarserverPrincipalSearch;
    }

    /**
     * Sets the value of the calendarserverPrincipalSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarserverPrincipalSearch }
     *     
     */
    public void setCalendarserverPrincipalSearch(CalendarserverPrincipalSearch value) {
        this.calendarserverPrincipalSearch = value;
    }

}
