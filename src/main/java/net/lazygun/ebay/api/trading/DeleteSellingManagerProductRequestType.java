package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Deletes a Selling Manager product.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * <p/>
 * <p/>
 * <p>Java class for DeleteSellingManagerProductRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DeleteSellingManagerProductRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSellingManagerProductRequestType", propOrder = {
        "productID"
})
@XmlRootElement(name = "DeleteSellingManagerProductRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class DeleteSellingManagerProductRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProductID")
    protected Long productID;

    /**
     * Gets the value of the productID property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setProductID(Long value) {
        this.productID = value;
    }

}
