package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Response for deleting a Selling Manager template.
 * <p/>
 * <p/>
 * <p>Java class for DeleteSellingManagerTemplateResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DeleteSellingManagerTemplateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DeletedSaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeletedSaleTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSellingManagerTemplateResponseType", propOrder = {
        "deletedSaleTemplateID",
        "deletedSaleTemplateName"
})
@XmlRootElement(name = "DeleteSellingManagerTemplateResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class DeleteSellingManagerTemplateResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DeletedSaleTemplateID")
    protected String deletedSaleTemplateID;
    @XmlElement(name = "DeletedSaleTemplateName")
    protected String deletedSaleTemplateName;

    /**
     * Gets the value of the deletedSaleTemplateID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDeletedSaleTemplateID() {
        return deletedSaleTemplateID;
    }

    /**
     * Sets the value of the deletedSaleTemplateID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeletedSaleTemplateID(String value) {
        this.deletedSaleTemplateID = value;
    }

    /**
     * Gets the value of the deletedSaleTemplateName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDeletedSaleTemplateName() {
        return deletedSaleTemplateName;
    }

    /**
     * Sets the value of the deletedSaleTemplateName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeletedSaleTemplateName(String value) {
        this.deletedSaleTemplateName = value;
    }

}
