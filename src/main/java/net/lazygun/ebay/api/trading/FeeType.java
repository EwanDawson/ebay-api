package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Identifies the name and cost of a listing feature that a member pays to eBay (or an eBay
 * company). These listing feature names, fees, and possible discounts are intended only as
 * an aid to help estimate the fees for a listing. Use GetAccount for an accurate final fee
 * breakdown. Returned in AddItemResponseType and related response types.
 * <p/>
 * <p/>
 * <p>Java class for FeeType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="FeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PromotionalDiscount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
        "name",
        "fee",
        "promotionalDiscount",
        "any"
})
public class FeeType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Fee")
    protected AmountType fee;
    @XmlElement(name = "PromotionalDiscount")
    protected AmountType promotionalDiscount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fee property.
     *
     * @return possible object is
     *         {@link AmountType }
     */
    public AmountType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     *
     * @param value allowed object is
     *              {@link AmountType }
     */
    public void setFee(AmountType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the promotionalDiscount property.
     *
     * @return possible object is
     *         {@link AmountType }
     */
    public AmountType getPromotionalDiscount() {
        return promotionalDiscount;
    }

    /**
     * Sets the value of the promotionalDiscount property.
     *
     * @param value allowed object is
     *              {@link AmountType }
     */
    public void setPromotionalDiscount(AmountType value) {
        this.promotionalDiscount = value;
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
