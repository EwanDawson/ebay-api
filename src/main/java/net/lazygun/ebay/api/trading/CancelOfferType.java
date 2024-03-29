package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Container for a list of offers. May contain zero, one, or multiple
 * OfferType objects, each of which represents one offer extended by
 * a user on a listing.
 * <p/>
 * <p/>
 * <p>Java class for CancelOfferType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CancelOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offer" type="{urn:ebay:apis:eBLBaseComponents}OfferType" minOccurs="0"/>
 *         &lt;element name="Explanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelOfferType", propOrder = {
        "offer",
        "explanation",
        "any"
})
public class CancelOfferType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Offer")
    protected OfferType offer;
    @XmlElement(name = "Explanation")
    protected String explanation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the offer property.
     *
     * @return possible object is
     *         {@link OfferType }
     */
    public OfferType getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     *
     * @param value allowed object is
     *              {@link OfferType }
     */
    public void setOffer(OfferType value) {
        this.offer = value;
    }

    /**
     * Gets the value of the explanation property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExplanation(String value) {
        this.explanation = value;
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
