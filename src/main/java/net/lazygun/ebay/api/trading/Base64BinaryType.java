package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Used for storing an optional reference ID to the binary attachment
 * <p/>
 * <p/>
 * <p>Java class for Base64BinaryType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Base64BinaryType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Base64BinaryType", propOrder = {
        "value"
})
public class Base64BinaryType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlValue
    protected byte[] value;
    @XmlAttribute
    protected String contentType;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     *         byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setValue(byte[] value) {
        this.value = ((byte[]) value);
    }

    /**
     * Gets the value of the contentType property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

}
