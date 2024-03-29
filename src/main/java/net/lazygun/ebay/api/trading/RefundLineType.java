package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * The order line item against which the refund was issued.
 * If an order ID is present, it indicates that the refund was issued against the entire order.
 * If an item ID and transaction ID are present, that indicates that the refund was issued against that particular order line item.
 * <p/>
 * <p/>
 * <p>Java class for RefundLineType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RefundLineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:ebay:apis:eBLBaseComponents>AmountType">
 *       &lt;attribute name="type" use="required" type="{urn:ebay:apis:eBLBaseComponents}RefundLineTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundLineType")
public class RefundLineType
        extends AmountType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlAttribute(required = true)
    protected RefundLineTypeCodeType type;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link RefundLineTypeCodeType }
     */
    public RefundLineTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link RefundLineTypeCodeType }
     */
    public void setType(RefundLineTypeCodeType value) {
        this.type = value;
    }

}
