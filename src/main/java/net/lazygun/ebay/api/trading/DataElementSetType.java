package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Container for a set of data elements (see below) that are applicable for a set
 * of products that were returned within the same response. The data elements contain
 * supplemental information that can help end users understand product search results.
 * Usage of this information is optional and may require developers to inspect
 * the information to determine how it can be applied in an application.
 * Output only.
 * <p/>
 * <p/>
 * <p>Java class for DataElementSetType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DataElementSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataElement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataElementID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="attributeSetID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementSetType", propOrder = {
        "dataElement",
        "dataElementID",
        "any"
})
public class DataElementSetType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DataElement")
    protected String dataElement;
    @XmlElement(name = "DataElementID")
    protected Integer dataElementID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute
    protected Integer attributeSetID;

    /**
     * Gets the value of the dataElement property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDataElement() {
        return dataElement;
    }

    /**
     * Sets the value of the dataElement property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDataElement(String value) {
        this.dataElement = value;
    }

    /**
     * Gets the value of the dataElementID property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getDataElementID() {
        return dataElementID;
    }

    /**
     * Sets the value of the dataElementID property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDataElementID(Integer value) {
        this.dataElementID = value;
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

}
