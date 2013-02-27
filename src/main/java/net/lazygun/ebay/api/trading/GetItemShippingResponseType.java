package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Contains the data returned by the call. The shipping details for the specified
 * item are returned in a ShippingDetails object.
 * <p/>
 * <p/>
 * <p>Java class for GetItemShippingResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetItemShippingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemShippingResponseType", propOrder = {
        "shippingDetails"
})
@XmlRootElement(name = "GetItemShippingResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemShippingResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippingDetails")
    protected ShippingDetailsType shippingDetails;

    /**
     * Gets the value of the shippingDetails property.
     *
     * @return possible object is
     *         {@link ShippingDetailsType }
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     *
     * @param value allowed object is
     *              {@link ShippingDetailsType }
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

}