package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Renames a Selling Manager inventory folder.
 * This call is subject to change without notice; the deprecation process is
 * inapplicable to this call.
 * <p/>
 * <p/>
 * <p>Java class for ReviseSellingManagerInventoryFolderRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ReviseSellingManagerInventoryFolderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerFolderDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseSellingManagerInventoryFolderRequestType", propOrder = {
        "folder"
})
@XmlRootElement(name = "ReviseSellingManagerInventoryFolderRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseSellingManagerInventoryFolderRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Folder")
    protected SellingManagerFolderDetailsType folder;

    /**
     * Gets the value of the folder property.
     *
     * @return possible object is
     *         {@link SellingManagerFolderDetailsType }
     */
    public SellingManagerFolderDetailsType getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     *
     * @param value allowed object is
     *              {@link SellingManagerFolderDetailsType }
     */
    public void setFolder(SellingManagerFolderDetailsType value) {
        this.folder = value;
    }

}
