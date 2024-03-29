package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns the status of an add folder operation.
 * <p/>
 * <p/>
 * <p>Java class for AddSellingManagerInventoryFolderResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddSellingManagerInventoryFolderResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSellingManagerInventoryFolderResponseType", propOrder = {
        "folderID"
})
@XmlRootElement(name = "AddSellingManagerInventoryFolderResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSellingManagerInventoryFolderResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FolderID")
    protected Long folderID;

    /**
     * Gets the value of the folderID property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

}
