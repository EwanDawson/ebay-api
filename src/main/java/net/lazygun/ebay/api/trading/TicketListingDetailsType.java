package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Type defining the <b>TicketListingDetails</b> container, which is used in
 * an Add/Revise/Relist call to provide more details about event tickets.
 * <p/>
 * <p/>
 * <p>Java class for TicketListingDetailsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TicketListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketListingDetailsType", propOrder = {
        "eventTitle",
        "venue",
        "printedDate",
        "printedTime",
        "any"
})
public class TicketListingDetailsType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EventTitle")
    protected String eventTitle;
    @XmlElement(name = "Venue")
    protected String venue;
    @XmlElement(name = "PrintedDate")
    protected String printedDate;
    @XmlElement(name = "PrintedTime")
    protected String printedTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eventTitle property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEventTitle() {
        return eventTitle;
    }

    /**
     * Sets the value of the eventTitle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEventTitle(String value) {
        this.eventTitle = value;
    }

    /**
     * Gets the value of the venue property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVenue(String value) {
        this.venue = value;
    }

    /**
     * Gets the value of the printedDate property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPrintedDate() {
        return printedDate;
    }

    /**
     * Sets the value of the printedDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrintedDate(String value) {
        this.printedDate = value;
    }

    /**
     * Gets the value of the printedTime property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPrintedTime() {
        return printedTime;
    }

    /**
     * Sets the value of the printedTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrintedTime(String value) {
        this.printedTime = value;
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
