package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Contains the item data returned by the call. The data for the specified item
 * listing is returned in an ItemType object.
 * <p/>
 * <p/>
 * <p>Java class for GetItemResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemResponseType", propOrder = {
        "item"
})
@XmlRootElement(name = "GetItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected ItemType item;

    /**
     * Gets the value of the item property.
     *
     * @return possible object is
     *         {@link ItemType }
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value allowed object is
     *              {@link ItemType }
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

}
