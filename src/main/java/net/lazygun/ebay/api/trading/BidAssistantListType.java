package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Defines how a list of BidAssistant items should be returned.
 * <p/>
 * <p/>
 * <p>Java class for BidAssistantListType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="BidAssistantListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IncludeNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidAssistantListType", propOrder = {
        "bidGroupID",
        "includeNotes",
        "any"
})
public class BidAssistantListType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidGroupID")
    protected Long bidGroupID;
    @XmlElement(name = "IncludeNotes")
    protected Boolean includeNotes;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bidGroupID property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getBidGroupID() {
        return bidGroupID;
    }

    /**
     * Sets the value of the bidGroupID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setBidGroupID(Long value) {
        this.bidGroupID = value;
    }

    /**
     * Gets the value of the includeNotes property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isIncludeNotes() {
        return includeNotes;
    }

    /**
     * Sets the value of the includeNotes property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIncludeNotes(Boolean value) {
        this.includeNotes = value;
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

}
