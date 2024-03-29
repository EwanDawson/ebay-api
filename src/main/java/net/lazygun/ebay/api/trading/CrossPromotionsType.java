package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * eBay Store Cross Promotions are no longer supported in the Trading API, so the
 * <b>CrossPromotion</b> container will either not be returned, or, if it is
 * returned, the data in the container may not be accurate. Contains one or
 * more items cross-promoted with the display or purchase of a referring item.
 * <p/>
 * <p/>
 * <p>Java class for CrossPromotionsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CrossPromotionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="PrimaryScheme" type="{urn:ebay:apis:eBLBaseComponents}PromotionSchemeCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionMethod" type="{urn:ebay:apis:eBLBaseComponents}PromotionMethodCodeType" minOccurs="0"/>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotedItem" type="{urn:ebay:apis:eBLBaseComponents}PromotedItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossPromotionsType", propOrder = {
        "itemID",
        "primaryScheme",
        "promotionMethod",
        "sellerID",
        "shippingDiscount",
        "storeName",
        "promotedItem",
        "any"
})
public class CrossPromotionsType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "PrimaryScheme")
    protected PromotionSchemeCodeType primaryScheme;
    @XmlElement(name = "PromotionMethod")
    protected PromotionMethodCodeType promotionMethod;
    @XmlElement(name = "SellerID")
    protected String sellerID;
    @XmlElement(name = "ShippingDiscount")
    protected boolean shippingDiscount;
    @XmlElement(name = "StoreName")
    protected String storeName;
    @XmlElement(name = "PromotedItem")
    protected List<PromotedItemType> promotedItem;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the itemID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the primaryScheme property.
     *
     * @return possible object is
     *         {@link PromotionSchemeCodeType }
     */
    public PromotionSchemeCodeType getPrimaryScheme() {
        return primaryScheme;
    }

    /**
     * Sets the value of the primaryScheme property.
     *
     * @param value allowed object is
     *              {@link PromotionSchemeCodeType }
     */
    public void setPrimaryScheme(PromotionSchemeCodeType value) {
        this.primaryScheme = value;
    }

    /**
     * Gets the value of the promotionMethod property.
     *
     * @return possible object is
     *         {@link PromotionMethodCodeType }
     */
    public PromotionMethodCodeType getPromotionMethod() {
        return promotionMethod;
    }

    /**
     * Sets the value of the promotionMethod property.
     *
     * @param value allowed object is
     *              {@link PromotionMethodCodeType }
     */
    public void setPromotionMethod(PromotionMethodCodeType value) {
        this.promotionMethod = value;
    }

    /**
     * Gets the value of the sellerID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * Sets the value of the sellerID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * Gets the value of the shippingDiscount property.
     */
    public boolean isShippingDiscount() {
        return shippingDiscount;
    }

    /**
     * Sets the value of the shippingDiscount property.
     */
    public void setShippingDiscount(boolean value) {
        this.shippingDiscount = value;
    }

    /**
     * Gets the value of the storeName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * @return array of
     *         {@link PromotedItemType }
     */
    public PromotedItemType[] getPromotedItem() {
        if (this.promotedItem == null) {
            return new PromotedItemType[0];
        }
        return ((PromotedItemType[]) this.promotedItem.toArray(new PromotedItemType[this.promotedItem.size()]));
    }

    /**
     * @return one of
     *         {@link PromotedItemType }
     */
    public PromotedItemType getPromotedItem(int idx) {
        if (this.promotedItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.promotedItem.get(idx);
    }

    public int getPromotedItemLength() {
        if (this.promotedItem == null) {
            return 0;
        }
        return this.promotedItem.size();
    }

    /**
     * @param values allowed objects are
     *               {@link PromotedItemType }
     */
    public void setPromotedItem(PromotedItemType[] values) {
        this._getPromotedItem().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.promotedItem.add(values[i]);
        }
    }

    protected List<PromotedItemType> _getPromotedItem() {
        if (promotedItem == null) {
            promotedItem = new ArrayList<PromotedItemType>();
        }
        return promotedItem;
    }

    /**
     * @param value allowed object is
     *              {@link PromotedItemType }
     */
    public PromotedItemType setPromotedItem(int idx, PromotedItemType value) {
        return this.promotedItem.set(idx, value);
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
