package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Information used to add a feedback note for a user.
 * <p/>
 * <p/>
 * <p>Java class for FeedbackInfoType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="FeedbackInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentType" type="{urn:ebay:apis:eBLBaseComponents}CommentTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TargetUser" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackInfoType", propOrder = {
        "commentText",
        "commentType",
        "targetUser",
        "any"
})
public class FeedbackInfoType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CommentText")
    protected String commentText;
    @XmlElement(name = "CommentType")
    protected CommentTypeCodeType commentType;
    @XmlElement(name = "TargetUser")
    protected String targetUser;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the commentText property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    /**
     * Gets the value of the commentType property.
     *
     * @return possible object is
     *         {@link CommentTypeCodeType }
     */
    public CommentTypeCodeType getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     *
     * @param value allowed object is
     *              {@link CommentTypeCodeType }
     */
    public void setCommentType(CommentTypeCodeType value) {
        this.commentType = value;
    }

    /**
     * Gets the value of the targetUser property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTargetUser() {
        return targetUser;
    }

    /**
     * Sets the value of the targetUser property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTargetUser(String value) {
        this.targetUser = value;
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
