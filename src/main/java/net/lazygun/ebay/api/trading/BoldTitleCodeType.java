package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoldTitleCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="BoldTitleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BoldTitleCodeType")
@XmlEnum
public enum BoldTitleCodeType {


    /**
     * The listing feature is enabled for the site.
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * The listing feature is disabled for the site.
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * Reserved for future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BoldTitleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoldTitleCodeType fromValue(String v) {
        for (BoldTitleCodeType c : BoldTitleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
