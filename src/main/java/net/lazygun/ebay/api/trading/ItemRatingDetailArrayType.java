package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Container for a set of detailed seller ratings about an order line item.
 * If a seller has detailed ratings, they are displayed
 * in the Feedback Profile of the seller.
 * <p/>
 * <p/>
 * <p>Java class for ItemRatingDetailArrayType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ItemRatingDetailArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemRatingDetails" type="{urn:ebay:apis:eBLBaseComponents}ItemRatingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemRatingDetailArrayType", propOrder = {
        "itemRatingDetails"
})
public class ItemRatingDetailArrayType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemRatingDetails")
    protected List<ItemRatingDetailsType> itemRatingDetails;

    /**
     * @return array of
     *         {@link ItemRatingDetailsType }
     */
    public ItemRatingDetailsType[] getItemRatingDetails() {
        if (this.itemRatingDetails == null) {
            return new ItemRatingDetailsType[0];
        }
        return ((ItemRatingDetailsType[]) this.itemRatingDetails.toArray(new ItemRatingDetailsType[this.itemRatingDetails.size()]));
    }

    /**
     * @return one of
     *         {@link ItemRatingDetailsType }
     */
    public ItemRatingDetailsType getItemRatingDetails(int idx) {
        if (this.itemRatingDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.itemRatingDetails.get(idx);
    }

    public int getItemRatingDetailsLength() {
        if (this.itemRatingDetails == null) {
            return 0;
        }
        return this.itemRatingDetails.size();
    }

    /**
     * @param values allowed objects are
     *               {@link ItemRatingDetailsType }
     */
    public void setItemRatingDetails(ItemRatingDetailsType[] values) {
        this._getItemRatingDetails().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.itemRatingDetails.add(values[i]);
        }
    }

    protected List<ItemRatingDetailsType> _getItemRatingDetails() {
        if (itemRatingDetails == null) {
            itemRatingDetails = new ArrayList<ItemRatingDetailsType>();
        }
        return itemRatingDetails;
    }

    /**
     * @param value allowed object is
     *              {@link ItemRatingDetailsType }
     */
    public ItemRatingDetailsType setItemRatingDetails(int idx, ItemRatingDetailsType value) {
        return this.itemRatingDetails.set(idx, value);
    }

}
