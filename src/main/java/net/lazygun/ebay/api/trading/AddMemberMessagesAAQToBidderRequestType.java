package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Enables a seller to send up to 10 messages to bidders, or to users who have
 * made offers via Best Offer, regarding an active item listing.
 * <p/>
 * <p/>
 * <p>Java class for AddMemberMessagesAAQToBidderRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddMemberMessagesAAQToBidderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AddMemberMessagesAAQToBidderRequestContainer" type="{urn:ebay:apis:eBLBaseComponents}AddMemberMessagesAAQToBidderRequestContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessagesAAQToBidderRequestType", propOrder = {
        "addMemberMessagesAAQToBidderRequestContainer"
})
@XmlRootElement(name = "AddMemberMessagesAAQToBidderRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddMemberMessagesAAQToBidderRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AddMemberMessagesAAQToBidderRequestContainer")
    protected List<AddMemberMessagesAAQToBidderRequestContainerType> addMemberMessagesAAQToBidderRequestContainer;

    /**
     * @return array of
     *         {@link AddMemberMessagesAAQToBidderRequestContainerType }
     */
    public AddMemberMessagesAAQToBidderRequestContainerType[] getAddMemberMessagesAAQToBidderRequestContainer() {
        if (this.addMemberMessagesAAQToBidderRequestContainer == null) {
            return new AddMemberMessagesAAQToBidderRequestContainerType[0];
        }
        return ((AddMemberMessagesAAQToBidderRequestContainerType[]) this.addMemberMessagesAAQToBidderRequestContainer.toArray(new AddMemberMessagesAAQToBidderRequestContainerType[this.addMemberMessagesAAQToBidderRequestContainer.size()]));
    }

    /**
     * @return one of
     *         {@link AddMemberMessagesAAQToBidderRequestContainerType }
     */
    public AddMemberMessagesAAQToBidderRequestContainerType getAddMemberMessagesAAQToBidderRequestContainer(int idx) {
        if (this.addMemberMessagesAAQToBidderRequestContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.addMemberMessagesAAQToBidderRequestContainer.get(idx);
    }

    public int getAddMemberMessagesAAQToBidderRequestContainerLength() {
        if (this.addMemberMessagesAAQToBidderRequestContainer == null) {
            return 0;
        }
        return this.addMemberMessagesAAQToBidderRequestContainer.size();
    }

    /**
     * @param values allowed objects are
     *               {@link AddMemberMessagesAAQToBidderRequestContainerType }
     */
    public void setAddMemberMessagesAAQToBidderRequestContainer(AddMemberMessagesAAQToBidderRequestContainerType[] values) {
        this._getAddMemberMessagesAAQToBidderRequestContainer().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.addMemberMessagesAAQToBidderRequestContainer.add(values[i]);
        }
    }

    protected List<AddMemberMessagesAAQToBidderRequestContainerType> _getAddMemberMessagesAAQToBidderRequestContainer() {
        if (addMemberMessagesAAQToBidderRequestContainer == null) {
            addMemberMessagesAAQToBidderRequestContainer = new ArrayList<AddMemberMessagesAAQToBidderRequestContainerType>();
        }
        return addMemberMessagesAAQToBidderRequestContainer;
    }

    /**
     * @param value allowed object is
     *              {@link AddMemberMessagesAAQToBidderRequestContainerType }
     */
    public AddMemberMessagesAAQToBidderRequestContainerType setAddMemberMessagesAAQToBidderRequestContainer(int idx, AddMemberMessagesAAQToBidderRequestContainerType value) {
        return this.addMemberMessagesAAQToBidderRequestContainer.set(idx, value);
    }

}
