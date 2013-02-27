package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Checks the arguments that you plan to use for a RelistItem call, looking for errors
 * and listing fees, without actually relisting the item.
 * <p/>
 * <p/>
 * <p>Java class for VerifyRelistItemRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="VerifyRelistItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="DeletedField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyRelistItemRequestType", propOrder = {
        "item",
        "deletedField"
})
@XmlRootElement(name = "VerifyRelistItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class VerifyRelistItemRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "DeletedField")
    protected List<String> deletedField;

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

    /**
     * @return array of
     *         {@link String }
     */
    public String[] getDeletedField() {
        if (this.deletedField == null) {
            return new String[0];
        }
        return ((String[]) this.deletedField.toArray(new String[this.deletedField.size()]));
    }

    /**
     * @return one of
     *         {@link String }
     */
    public String getDeletedField(int idx) {
        if (this.deletedField == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.deletedField.get(idx);
    }

    public int getDeletedFieldLength() {
        if (this.deletedField == null) {
            return 0;
        }
        return this.deletedField.size();
    }

    /**
     * @param values allowed objects are
     *               {@link String }
     */
    public void setDeletedField(String[] values) {
        this._getDeletedField().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.deletedField.add(values[i]);
        }
    }

    protected List<String> _getDeletedField() {
        if (deletedField == null) {
            deletedField = new ArrayList<String>();
        }
        return deletedField;
    }

    /**
     * @param value allowed object is
     *              {@link String }
     */
    public String setDeletedField(int idx, String value) {
        return this.deletedField.set(idx, value);
    }

}
