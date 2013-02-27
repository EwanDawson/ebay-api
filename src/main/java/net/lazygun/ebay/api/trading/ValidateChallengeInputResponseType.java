package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Validate the user response to botblock challenge.
 * <p/>
 * <p/>
 * <p>Java class for ValidateChallengeInputResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ValidateChallengeInputResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ValidToken" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateChallengeInputResponseType", propOrder = {
        "validToken"
})
@XmlRootElement(name = "ValidateChallengeInputResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ValidateChallengeInputResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ValidToken")
    protected Boolean validToken;

    /**
     * Gets the value of the validToken property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isValidToken() {
        return validToken;
    }

    /**
     * Sets the value of the validToken property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setValidToken(Boolean value) {
        this.validToken = value;
    }

}
