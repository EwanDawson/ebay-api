package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Contains the ASQ subjects for the user specified in the request.
 * <p/>
 * <p/>
 * <p>Java class for GetMessagePreferencesResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetMessagePreferencesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ASQPreferences" type="{urn:ebay:apis:eBLBaseComponents}ASQPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessagePreferencesResponseType", propOrder = {
        "asqPreferences"
})
@XmlRootElement(name = "GetMessagePreferencesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMessagePreferencesResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ASQPreferences")
    protected ASQPreferencesType asqPreferences;

    /**
     * Gets the value of the asqPreferences property.
     *
     * @return possible object is
     *         {@link ASQPreferencesType }
     */
    public ASQPreferencesType getASQPreferences() {
        return asqPreferences;
    }

    /**
     * Sets the value of the asqPreferences property.
     *
     * @param value allowed object is
     *              {@link ASQPreferencesType }
     */
    public void setASQPreferences(ASQPreferencesType value) {
        this.asqPreferences = value;
    }

}
