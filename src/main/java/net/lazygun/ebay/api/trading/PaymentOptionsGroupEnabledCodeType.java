package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentOptionsGroupEnabledCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="PaymentOptionsGroupEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="eBayPaymentProcessEnabled"/>
 *     &lt;enumeration value="NonStandardPaymentsEnabled"/>
 *     &lt;enumeration value="eBayPaymentProcessExcluded"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentOptionsGroupEnabledCodeType")
@XmlEnum
public enum PaymentOptionsGroupEnabledCodeType {


    /**
     * This value indicates that the new eBay payment process is enabled for this category.
     */
    @XmlEnumValue("eBayPaymentProcessEnabled")
    E_BAY_PAYMENT_PROCESS_ENABLED("eBayPaymentProcessEnabled"),

    /**
     * This value indicates that non-standard payments is enabled for this category.
     */
    @XmlEnumValue("NonStandardPaymentsEnabled")
    NON_STANDARD_PAYMENTS_ENABLED("NonStandardPaymentsEnabled"),

    /**
     * This value indicates that the new eBay payment process is excluded for this category.
     */
    @XmlEnumValue("eBayPaymentProcessExcluded")
    E_BAY_PAYMENT_PROCESS_EXCLUDED("eBayPaymentProcessExcluded"),

    /**
     * (out) Reserved for internal or future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentOptionsGroupEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentOptionsGroupEnabledCodeType fromValue(String v) {
        for (PaymentOptionsGroupEnabledCodeType c : PaymentOptionsGroupEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
