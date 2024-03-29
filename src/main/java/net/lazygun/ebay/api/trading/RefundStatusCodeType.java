package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundStatusCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="RefundStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundStatusCodeType")
@XmlEnum
public enum RefundStatusCodeType {


    /**
     * The refund request was successful.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> The RefundStatus value is returned
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the
     * new eBay payment process.
     * </span>
     */
    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),

    /**
     * The refund request is being processed.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> The RefundStatus value is returned
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the
     * new eBay payment process.
     * </span>
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * The refund request was rejected.<br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> The RefundStatus value is returned
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the
     * new eBay payment process.
     * </span>
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * (out) Reserved for internal or future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundStatusCodeType fromValue(String v) {
        for (RefundStatusCodeType c : RefundStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
