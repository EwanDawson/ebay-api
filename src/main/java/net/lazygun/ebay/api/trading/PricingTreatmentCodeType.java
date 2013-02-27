package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingTreatmentCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="PricingTreatmentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="MAP"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MFO"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PricingTreatmentCodeType")
@XmlEnum
public enum PricingTreatmentCodeType {


    /**
     * STP stands for Strike Through Pricing.
     */
    STP("STP"),

    /**
     * MAP stands for MinimumAdvertisedPrice
     */
    MAP("MAP"),

    /**
     * None means neither STP nor MinimumAdvertisedPrice.
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * MFO means stands for MadeForOutletComparisonPrice.
     */
    MFO("MFO"),

    /**
     * Reserved for future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PricingTreatmentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingTreatmentCodeType fromValue(String v) {
        for (PricingTreatmentCodeType c : PricingTreatmentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}