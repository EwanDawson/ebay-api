package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Calendar;


/**
 * AddSecondChanceItem response for a new Second Chance Offer listing.
 * <p/>
 * <p/>
 * <p>Java class for AddSecondChanceItemResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddSecondChanceItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSecondChanceItemResponseType", propOrder = {
        "itemID",
        "startTime",
        "endTime"
})
@XmlRootElement(name = "AddSecondChanceItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSecondChanceItemResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTime;

    /**
     * Gets the value of the itemID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the startTime property.
     *
     * @return possible object is
     *         {@link String }
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStartTime(Calendar value) {
        this.startTime = value;
    }

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

}
