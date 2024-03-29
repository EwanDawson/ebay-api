package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Defines the affiliation status for a nonprofit charity
 * organization registered with the eBay Giving Works provider.
 * <p/>
 * <p/>
 * <p>Java class for CharityIDType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CharityIDType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" use="required" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityIDType", propOrder = {
        "value"
})
public class CharityIDType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected CharityAffiliationTypeCodeType type;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link CharityAffiliationTypeCodeType }
     */
    public CharityAffiliationTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link CharityAffiliationTypeCodeType }
     */
    public void setType(CharityAffiliationTypeCodeType value) {
        this.type = value;
    }

}
