package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Information about zero or more buying guides and the site's buying guide hub.
 * Buying guides contain content about particular product areas, categories, or subjects
 * to help buyers decide which type of item to purchase based on their particular interests.
 * Multiple buying guides can be returned. See the eBay Web Services Guide for additional information.
 * <p/>
 * <p/>
 * <p>Java class for BuyingGuideDetailsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="BuyingGuideDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyingGuide" type="{urn:ebay:apis:eBLBaseComponents}BuyingGuideType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyingGuideHub" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyingGuideDetailsType", propOrder = {
        "buyingGuide",
        "buyingGuideHub",
        "any"
})
public class BuyingGuideDetailsType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BuyingGuide")
    protected List<BuyingGuideType> buyingGuide;
    @XmlElement(name = "BuyingGuideHub")
    @XmlSchemaType(name = "anyURI")
    protected String buyingGuideHub;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * @return array of
     *         {@link BuyingGuideType }
     */
    public BuyingGuideType[] getBuyingGuide() {
        if (this.buyingGuide == null) {
            return new BuyingGuideType[0];
        }
        return ((BuyingGuideType[]) this.buyingGuide.toArray(new BuyingGuideType[this.buyingGuide.size()]));
    }

    /**
     * @return one of
     *         {@link BuyingGuideType }
     */
    public BuyingGuideType getBuyingGuide(int idx) {
        if (this.buyingGuide == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.buyingGuide.get(idx);
    }

    public int getBuyingGuideLength() {
        if (this.buyingGuide == null) {
            return 0;
        }
        return this.buyingGuide.size();
    }

    /**
     * @param values allowed objects are
     *               {@link BuyingGuideType }
     */
    public void setBuyingGuide(BuyingGuideType[] values) {
        this._getBuyingGuide().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.buyingGuide.add(values[i]);
        }
    }

    protected List<BuyingGuideType> _getBuyingGuide() {
        if (buyingGuide == null) {
            buyingGuide = new ArrayList<BuyingGuideType>();
        }
        return buyingGuide;
    }

    /**
     * @param value allowed object is
     *              {@link BuyingGuideType }
     */
    public BuyingGuideType setBuyingGuide(int idx, BuyingGuideType value) {
        return this.buyingGuide.set(idx, value);
    }

    /**
     * Gets the value of the buyingGuideHub property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getBuyingGuideHub() {
        return buyingGuideHub;
    }

    /**
     * Sets the value of the buyingGuideHub property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBuyingGuideHub(String value) {
        this.buyingGuideHub = value;
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
