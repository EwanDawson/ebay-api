package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Contains the data for one type of feedback for one predefined time
 * period. Parent FeedbackPeriodArrayType object indicates the type of
 * feedback counted: positive, neutral, negative, or total. Output only,
 * in the summary feedback data returned by GetFeedback.
 * <p/>
 * <p/>
 * <p>Java class for FeedbackPeriodType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="FeedbackPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackPeriodType", propOrder = {
        "periodInDays",
        "count",
        "any"
})
public class FeedbackPeriodType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PeriodInDays")
    protected Integer periodInDays;
    @XmlElement(name = "Count")
    protected Integer count;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the periodInDays property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getPeriodInDays() {
        return periodInDays;
    }

    /**
     * Sets the value of the periodInDays property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPeriodInDays(Integer value) {
        this.periodInDays = value;
    }

    /**
     * Gets the value of the count property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setCount(Integer value) {
        this.count = value;
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
