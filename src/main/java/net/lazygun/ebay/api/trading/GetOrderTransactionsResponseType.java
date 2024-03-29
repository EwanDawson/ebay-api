package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Response to GetOrderTransactions request.
 * <p/>
 * <p/>
 * <p>Java class for GetOrderTransactionsResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetOrderTransactionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="OrderArray" type="{urn:ebay:apis:eBLBaseComponents}OrderArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderTransactionsResponseType", propOrder = {
        "orderArray"
})
@XmlRootElement(name = "GetOrderTransactionsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetOrderTransactionsResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderArray")
    protected OrderArrayType orderArray;

    /**
     * Gets the value of the orderArray property.
     *
     * @return possible object is
     *         {@link OrderArrayType }
     */
    public OrderArrayType getOrderArray() {
        return orderArray;
    }

    /**
     * Sets the value of the orderArray property.
     *
     * @param value allowed object is
     *              {@link OrderArrayType }
     */
    public void setOrderArray(OrderArrayType value) {
        this.orderArray = value;
    }

}
