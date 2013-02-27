package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * This type provides information about the domestic leg of a Global Shipping Program shipment.
 * <br/><br/>
 * <span class="tablenote">
 * <strong>Note:</strong> The <strong>LogisticsProviderShipmentToBuyer</strong> field is reserved for the exclusive use of the international shipping provider.
 * </span>
 * <p/>
 * <p/>
 * <p>Java class for MultiLegShippingDetailsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="MultiLegShippingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerShipmentToLogisticsProvider" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShipmentType" minOccurs="0"/>
 *         &lt;element name="LogisticsProviderShipmentToBuyer" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShipmentType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLegShippingDetailsType", propOrder = {
        "sellerShipmentToLogisticsProvider",
        "logisticsProviderShipmentToBuyer",
        "any"
})
public class MultiLegShippingDetailsType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellerShipmentToLogisticsProvider")
    protected MultiLegShipmentType sellerShipmentToLogisticsProvider;
    @XmlElement(name = "LogisticsProviderShipmentToBuyer")
    protected MultiLegShipmentType logisticsProviderShipmentToBuyer;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sellerShipmentToLogisticsProvider property.
     *
     * @return possible object is
     *         {@link MultiLegShipmentType }
     */
    public MultiLegShipmentType getSellerShipmentToLogisticsProvider() {
        return sellerShipmentToLogisticsProvider;
    }

    /**
     * Sets the value of the sellerShipmentToLogisticsProvider property.
     *
     * @param value allowed object is
     *              {@link MultiLegShipmentType }
     */
    public void setSellerShipmentToLogisticsProvider(MultiLegShipmentType value) {
        this.sellerShipmentToLogisticsProvider = value;
    }

    /**
     * Gets the value of the logisticsProviderShipmentToBuyer property.
     *
     * @return possible object is
     *         {@link MultiLegShipmentType }
     */
    public MultiLegShipmentType getLogisticsProviderShipmentToBuyer() {
        return logisticsProviderShipmentToBuyer;
    }

    /**
     * Sets the value of the logisticsProviderShipmentToBuyer property.
     *
     * @param value allowed object is
     *              {@link MultiLegShipmentType }
     */
    public void setLogisticsProviderShipmentToBuyer(MultiLegShipmentType value) {
        this.logisticsProviderShipmentToBuyer = value;
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
