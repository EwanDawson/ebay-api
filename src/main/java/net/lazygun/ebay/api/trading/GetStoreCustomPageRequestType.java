package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves the custom page or pages for the authenticated user's Store.
 * <p/>
 * <p/>
 * <p>Java class for GetStoreCustomPageRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetStoreCustomPageRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PageID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreCustomPageRequestType", propOrder = {
        "pageID"
})
@XmlRootElement(name = "GetStoreCustomPageRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreCustomPageRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PageID")
    protected Long pageID;

    /**
     * Gets the value of the pageID property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getPageID() {
        return pageID;
    }

    /**
     * Sets the value of the pageID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPageID(Long value) {
        this.pageID = value;
    }

}
