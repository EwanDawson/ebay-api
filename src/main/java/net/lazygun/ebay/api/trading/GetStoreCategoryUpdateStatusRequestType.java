package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns the status of the processing for category-structure changes specified
 * with a call to SetStoreCategories.
 * <p/>
 * <p/>
 * <p>Java class for GetStoreCategoryUpdateStatusRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetStoreCategoryUpdateStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreCategoryUpdateStatusRequestType", propOrder = {
        "taskID"
})
@XmlRootElement(name = "GetStoreCategoryUpdateStatusRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreCategoryUpdateStatusRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TaskID")
    protected Long taskID;

    /**
     * Gets the value of the taskID property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setTaskID(Long value) {
        this.taskID = value;
    }

}
