package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Contains the data retrieved by the call. User data is returned in a User object.
 * <p/>
 * <p/>
 * <p>Java class for GetUserResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetUserResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserResponseType", propOrder = {
        "user"
})
@XmlRootElement(name = "GetUserResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetUserResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "User")
    protected UserType user;

    /**
     * Gets the value of the user property.
     *
     * @return possible object is
     *         {@link UserType }
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value allowed object is
     *              {@link UserType }
     */
    public void setUser(UserType value) {
        this.user = value;
    }

}
