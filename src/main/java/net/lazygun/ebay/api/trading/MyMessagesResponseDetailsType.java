package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * Details relating to the response to a message.
 * <p/>
 * <p/>
 * <p>Java class for MyMessagesResponseDetailsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="MyMessagesResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResponseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="UserResponseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesResponseDetailsType", propOrder = {
        "responseEnabled",
        "responseURL",
        "userResponseDate",
        "any"
})
public class MyMessagesResponseDetailsType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ResponseEnabled")
    protected Boolean responseEnabled;
    @XmlElement(name = "ResponseURL")
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    @XmlElement(name = "UserResponseDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar userResponseDate;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the responseEnabled property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isResponseEnabled() {
        return responseEnabled;
    }

    /**
     * Sets the value of the responseEnabled property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setResponseEnabled(Boolean value) {
        this.responseEnabled = value;
    }

    /**
     * Gets the value of the responseURL property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getResponseURL() {
        return responseURL;
    }

    /**
     * Sets the value of the responseURL property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResponseURL(String value) {
        this.responseURL = value;
    }

    /**
     * Gets the value of the userResponseDate property.
     *
     * @return possible object is
     *         {@link String }
     */
    public Calendar getUserResponseDate() {
        return userResponseDate;
    }

    /**
     * Sets the value of the userResponseDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserResponseDate(Calendar value) {
        this.userResponseDate = value;
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
