package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Adds a Selling Manager template.
 * One product can have up to 20 templates associated with it.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * <p/>
 * <p/>
 * <p>Java class for AddSellingManagerTemplateRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddSellingManagerTemplateRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="SaleTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSellingManagerTemplateRequestType", propOrder = {
        "item",
        "saleTemplateName",
        "productID"
})
@XmlRootElement(name = "AddSellingManagerTemplateRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSellingManagerTemplateRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "SaleTemplateName")
    protected String saleTemplateName;
    @XmlElement(name = "ProductID")
    protected Long productID;

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
     * Gets the value of the saleTemplateName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSaleTemplateName() {
        return saleTemplateName;
    }

    /**
     * Sets the value of the saleTemplateName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSaleTemplateName(String value) {
        this.saleTemplateName = value;
    }

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
