package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A set of salient aspects or features that describe an item in a standardized way.
 * Most commonly used in the Item Specifics section of a listing.
 * See the Developer's Guide information on
 * working with Item Specifics and Pre-filled Item Information.
 * See the Developer's Guide for information about
 * characteristics meta-data and how to determine when attributes are required.
 * <p/>
 * <p/>
 * <p>Java class for AttributeSetType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AttributeSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribute" type="{urn:ebay:apis:eBLBaseComponents}AttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="attributeSetID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="attributeSetVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeSetType", propOrder = {
        "attribute",
        "any"
})
public class AttributeSetType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Attribute")
    protected List<AttributeType> attribute;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute
    protected Integer attributeSetID;
    @XmlAttribute
    protected String attributeSetVersion;

    /**
     * @return array of
     *         {@link AttributeType }
     */
    public AttributeType[] getAttribute() {
        if (this.attribute == null) {
            return new AttributeType[0];
        }
        return ((AttributeType[]) this.attribute.toArray(new AttributeType[this.attribute.size()]));
    }

    /**
     * @return one of
     *         {@link AttributeType }
     */
    public AttributeType getAttribute(int idx) {
        if (this.attribute == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.attribute.get(idx);
    }

    public int getAttributeLength() {
        if (this.attribute == null) {
            return 0;
        }
        return this.attribute.size();
    }

    /**
     * @param values allowed objects are
     *               {@link AttributeType }
     */
    public void setAttribute(AttributeType[] values) {
        this._getAttribute().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.attribute.add(values[i]);
        }
    }

    protected List<AttributeType> _getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<AttributeType>();
        }
        return attribute;
    }

    /**
     * @param value allowed object is
     *              {@link AttributeType }
     */
    public AttributeType setAttribute(int idx, AttributeType value) {
        return this.attribute.set(idx, value);
    }

    /**
     * @return array of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[0];
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()]));
    }

    /**
     * @return one of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return 0;
        }
        return this.any.size();
    }

    /**
     * @param values allowed objects are
     *               {@link Object }
     *               {@link org.w3c.dom.Element }
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * @param value allowed object is
     *              {@link Object }
     *              {@link org.w3c.dom.Element }
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

    /**
     * Gets the value of the attributeSetID property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setAttributeSetID(Integer value) {
        this.attributeSetID = value;
    }

    /**
     * Gets the value of the attributeSetVersion property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAttributeSetVersion() {
        return attributeSetVersion;
    }

    /**
     * Sets the value of the attributeSetVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttributeSetVersion(String value) {
        this.attributeSetVersion = value;
    }

}
