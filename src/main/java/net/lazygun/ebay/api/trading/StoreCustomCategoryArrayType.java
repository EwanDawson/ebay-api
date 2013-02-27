package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Set of custom categories for the Store.
 * <p/>
 * <p/>
 * <p>Java class for StoreCustomCategoryArrayType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="StoreCustomCategoryArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomCategory" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomCategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreCustomCategoryArrayType", propOrder = {
        "customCategory"
})
public class StoreCustomCategoryArrayType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CustomCategory")
    protected List<StoreCustomCategoryType> customCategory;

    /**
     * @return array of
     *         {@link StoreCustomCategoryType }
     */
    public StoreCustomCategoryType[] getCustomCategory() {
        if (this.customCategory == null) {
            return new StoreCustomCategoryType[0];
        }
        return ((StoreCustomCategoryType[]) this.customCategory.toArray(new StoreCustomCategoryType[this.customCategory.size()]));
    }

    /**
     * @return one of
     *         {@link StoreCustomCategoryType }
     */
    public StoreCustomCategoryType getCustomCategory(int idx) {
        if (this.customCategory == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.customCategory.get(idx);
    }

    public int getCustomCategoryLength() {
        if (this.customCategory == null) {
            return 0;
        }
        return this.customCategory.size();
    }

    /**
     * @param values allowed objects are
     *               {@link StoreCustomCategoryType }
     */
    public void setCustomCategory(StoreCustomCategoryType[] values) {
        this._getCustomCategory().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.customCategory.add(values[i]);
        }
    }

    protected List<StoreCustomCategoryType> _getCustomCategory() {
        if (customCategory == null) {
            customCategory = new ArrayList<StoreCustomCategoryType>();
        }
        return customCategory;
    }

    /**
     * @param value allowed object is
     *              {@link StoreCustomCategoryType }
     */
    public StoreCustomCategoryType setCustomCategory(int idx, StoreCustomCategoryType value) {
        return this.customCategory.set(idx, value);
    }

}
