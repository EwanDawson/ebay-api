package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonHideFromSearchCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="ReasonHideFromSearchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DuplicateListing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReasonHideFromSearchCodeType")
@XmlEnum
public enum ReasonHideFromSearchCodeType {


    /**
     * This value indicates that the auction listing is being hidden from search on the eBay
     * site because the listing has been determined by eBay to be a duplicate listing with
     * zero bids.
     */
    @XmlEnumValue("DuplicateListing")
    DUPLICATE_LISTING("DuplicateListing");
    private final String value;

    ReasonHideFromSearchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonHideFromSearchCodeType fromValue(String v) {
        for (ReasonHideFromSearchCodeType c : ReasonHideFromSearchCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
