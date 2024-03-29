package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A list of unique identifiers for orders.
 * <p/>
 * <p/>
 * <p>Java class for OrderIDArrayType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="OrderIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderIDArrayType", propOrder = {
        "orderID"
})
public class OrderIDArrayType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderID")
    protected List<String> orderID;

    /**
     * @return array of
     *         {@link String }
     */
    public String[] getOrderID() {
        if (this.orderID == null) {
            return new String[0];
        }
        return ((String[]) this.orderID.toArray(new String[this.orderID.size()]));
    }

    /**
     * @return one of
     *         {@link String }
     */
    public String getOrderID(int idx) {
        if (this.orderID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.orderID.get(idx);
    }

    public int getOrderIDLength() {
        if (this.orderID == null) {
            return 0;
        }
        return this.orderID.size();
    }

    /**
     * @param values allowed objects are
     *               {@link String }
     */
    public void setOrderID(String[] values) {
        this._getOrderID().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.orderID.add(values[i]);
        }
    }

    protected List<String> _getOrderID() {
        if (orderID == null) {
            orderID = new ArrayList<String>();
        }
        return orderID;
    }

    /**
     * @param value allowed object is
     *              {@link String }
     */
    public String setOrderID(int idx, String value) {
        return this.orderID.set(idx, value);
    }

}
