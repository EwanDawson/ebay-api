package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Includes the list of bidders for the requested item as part of the general item listing data. Some bidder information is anonymous, to protect bidders from fraud. If the seller makes this API call, the actual ids of all bidders on the seller's item will be returned. If a bidder makes this API call, the bidder's actual id will be returned. Information for all competing bidders or outside watchers will be returned as anonymized userIDs. See See <a href="http://developer.ebay.com/DevZone/XML/docs/WebHelp/index.htm?context=eBay_XML_API&topic=AnonymousUserInfo">Working with Anonymous User Information</a>in the eBay Web Services Guide for more information.
 * <p/>
 * <p/>
 * <p>Java class for GetAllBiddersResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetAllBiddersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BidArray" type="{urn:ebay:apis:eBLBaseComponents}OfferArrayType" minOccurs="0"/>
 *         &lt;element name="HighBidder" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="HighestBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ListingStatus" type="{urn:ebay:apis:eBLBaseComponents}ListingStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllBiddersResponseType", propOrder = {
        "bidArray",
        "highBidder",
        "highestBid",
        "listingStatus"
})
@XmlRootElement(name = "GetAllBiddersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetAllBiddersResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidArray")
    protected OfferArrayType bidArray;
    @XmlElement(name = "HighBidder")
    protected String highBidder;
    @XmlElement(name = "HighestBid")
    protected AmountType highestBid;
    @XmlElement(name = "ListingStatus")
    protected ListingStatusCodeType listingStatus;

    /**
     * Gets the value of the bidArray property.
     *
     * @return possible object is
     *         {@link OfferArrayType }
     */
    public OfferArrayType getBidArray() {
        return bidArray;
    }

    /**
     * Sets the value of the bidArray property.
     *
     * @param value allowed object is
     *              {@link OfferArrayType }
     */
    public void setBidArray(OfferArrayType value) {
        this.bidArray = value;
    }

    /**
     * Gets the value of the highBidder property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getHighBidder() {
        return highBidder;
    }

    /**
     * Sets the value of the highBidder property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHighBidder(String value) {
        this.highBidder = value;
    }

    /**
     * Gets the value of the highestBid property.
     *
     * @return possible object is
     *         {@link AmountType }
     */
    public AmountType getHighestBid() {
        return highestBid;
    }

    /**
     * Sets the value of the highestBid property.
     *
     * @param value allowed object is
     *              {@link AmountType }
     */
    public void setHighestBid(AmountType value) {
        this.highestBid = value;
    }

    /**
     * Gets the value of the listingStatus property.
     *
     * @return possible object is
     *         {@link ListingStatusCodeType }
     */
    public ListingStatusCodeType getListingStatus() {
        return listingStatus;
    }

    /**
     * Sets the value of the listingStatus property.
     *
     * @param value allowed object is
     *              {@link ListingStatusCodeType }
     */
    public void setListingStatus(ListingStatusCodeType value) {
        this.listingStatus = value;
    }

}
