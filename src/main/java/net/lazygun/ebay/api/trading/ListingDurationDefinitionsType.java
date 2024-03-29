package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A container node for sets of durations, each set describing the durations allowed for
 * one listing type.
 * <p/>
 * <p/>
 * <p>Java class for ListingDurationDefinitionsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ListingDurationDefinitionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingDuration" type="{urn:ebay:apis:eBLBaseComponents}ListingDurationDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingDurationDefinitionsType", propOrder = {
        "listingDuration"
})
public class ListingDurationDefinitionsType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ListingDuration")
    protected List<ListingDurationDefinitionType> listingDuration;
    @XmlAttribute(name = "Version")
    protected Integer version;

    /**
     * @return array of
     *         {@link ListingDurationDefinitionType }
     */
    public ListingDurationDefinitionType[] getListingDuration() {
        if (this.listingDuration == null) {
            return new ListingDurationDefinitionType[0];
        }
        return ((ListingDurationDefinitionType[]) this.listingDuration.toArray(new ListingDurationDefinitionType[this.listingDuration.size()]));
    }

    /**
     * @return one of
     *         {@link ListingDurationDefinitionType }
     */
    public ListingDurationDefinitionType getListingDuration(int idx) {
        if (this.listingDuration == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listingDuration.get(idx);
    }

    public int getListingDurationLength() {
        if (this.listingDuration == null) {
            return 0;
        }
        return this.listingDuration.size();
    }

    /**
     * @param values allowed objects are
     *               {@link ListingDurationDefinitionType }
     */
    public void setListingDuration(ListingDurationDefinitionType[] values) {
        this._getListingDuration().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.listingDuration.add(values[i]);
        }
    }

    protected List<ListingDurationDefinitionType> _getListingDuration() {
        if (listingDuration == null) {
            listingDuration = new ArrayList<ListingDurationDefinitionType>();
        }
        return listingDuration;
    }

    /**
     * @param value allowed object is
     *              {@link ListingDurationDefinitionType }
     */
    public ListingDurationDefinitionType setListingDuration(int idx, ListingDurationDefinitionType value) {
        return this.listingDuration.set(idx, value);
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
