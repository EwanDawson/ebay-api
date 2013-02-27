package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Calendar;


/**
 * Acknowledgement that includes SKU, as well as the date and time the auction was
 * ended due to the call to EndFixedPriceItem.
 * <p/>
 * <p/>
 * <p>Java class for EndFixedPriceItemResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="EndFixedPriceItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndFixedPriceItemResponseType", propOrder = {
        "endTime",
        "sku"
})
@XmlRootElement(name = "EndFixedPriceItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class EndFixedPriceItemResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTime;
    @XmlElement(name = "SKU")
    protected String sku;

    /**
     * Gets the value of the endTime property.
     *
     * @return possible object is
     *         {@link String }
     */
    public Calendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEndTime(Calendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the sku property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSKU(String value) {
        this.sku = value;
    }

}
