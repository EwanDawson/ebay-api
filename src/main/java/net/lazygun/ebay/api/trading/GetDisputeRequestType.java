package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves the details of a specific eBay dispute corresponding to the supplied dispute ID.
 * <p/>
 * <p/>
 * <p>Java class for GetDisputeRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetDisputeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisputeRequestType", propOrder = {
        "disputeID"
})
@XmlRootElement(name = "GetDisputeRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetDisputeRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeID")
    protected String disputeID;

    /**
     * Gets the value of the disputeID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDisputeID() {
        return disputeID;
    }

    /**
     * Sets the value of the disputeID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisputeID(String value) {
        this.disputeID = value;
    }

}
