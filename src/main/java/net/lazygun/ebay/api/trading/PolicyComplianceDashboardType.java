package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Type defining the <b>PolicyCompliance</b> container returned in the
 * <b>GetSellerDashboard</b> response. The <b>PolicyCompliance</b>
 * container consist of information related to the seller's current status in terms of risk
 * of facing TnS action (i.e., warnings, cancelled listings, restrictions, suspension, and
 * violations).
 * <p/>
 * <p/>
 * <p>Java class for PolicyComplianceDashboardType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PolicyComplianceDashboardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PolicyComplianceStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}SellerDashboardAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyComplianceDashboardType", propOrder = {
        "status",
        "alert",
        "any"
})
public class PolicyComplianceDashboardType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Status")
    protected PolicyComplianceStatusCodeType status;
    @XmlElement(name = "Alert")
    protected List<SellerDashboardAlertType> alert;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     *         {@link PolicyComplianceStatusCodeType }
     */
    public PolicyComplianceStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link PolicyComplianceStatusCodeType }
     */
    public void setStatus(PolicyComplianceStatusCodeType value) {
        this.status = value;
    }

    /**
     * @return array of
     *         {@link SellerDashboardAlertType }
     */
    public SellerDashboardAlertType[] getAlert() {
        if (this.alert == null) {
            return new SellerDashboardAlertType[0];
        }
        return ((SellerDashboardAlertType[]) this.alert.toArray(new SellerDashboardAlertType[this.alert.size()]));
    }

    /**
     * @return one of
     *         {@link SellerDashboardAlertType }
     */
    public SellerDashboardAlertType getAlert(int idx) {
        if (this.alert == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.alert.get(idx);
    }

    public int getAlertLength() {
        if (this.alert == null) {
            return 0;
        }
        return this.alert.size();
    }

    /**
     * @param values allowed objects are
     *               {@link SellerDashboardAlertType }
     */
    public void setAlert(SellerDashboardAlertType[] values) {
        this._getAlert().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.alert.add(values[i]);
        }
    }

    protected List<SellerDashboardAlertType> _getAlert() {
        if (alert == null) {
            alert = new ArrayList<SellerDashboardAlertType>();
        }
        return alert;
    }

    /**
     * @param value allowed object is
     *              {@link SellerDashboardAlertType }
     */
    public SellerDashboardAlertType setAlert(int idx, SellerDashboardAlertType value) {
        return this.alert.set(idx, value);
    }

    /**
     * @return array of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[0];
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()]));
    }

    /**
     * @return one of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return 0;
        }
        return this.any.size();
    }

    /**
     * @param values allowed objects are
     *               {@link Object }
     *               {@link org.w3c.dom.Element }
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * @param value allowed object is
     *              {@link Object }
     *              {@link org.w3c.dom.Element }
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
