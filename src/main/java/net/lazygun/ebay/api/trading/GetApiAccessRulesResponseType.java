package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Responds to a call to GetApiAccessRules.
 * <p/>
 * <p/>
 * <p>Java class for GetApiAccessRulesResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetApiAccessRulesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ApiAccessRule" type="{urn:ebay:apis:eBLBaseComponents}ApiAccessRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApiAccessRulesResponseType", propOrder = {
        "apiAccessRule"
})
@XmlRootElement(name = "GetApiAccessRulesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetApiAccessRulesResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ApiAccessRule")
    protected List<ApiAccessRuleType> apiAccessRule;

    /**
     * @return array of
     *         {@link ApiAccessRuleType }
     */
    public ApiAccessRuleType[] getApiAccessRule() {
        if (this.apiAccessRule == null) {
            return new ApiAccessRuleType[0];
        }
        return ((ApiAccessRuleType[]) this.apiAccessRule.toArray(new ApiAccessRuleType[this.apiAccessRule.size()]));
    }

    /**
     * @return one of
     *         {@link ApiAccessRuleType }
     */
    public ApiAccessRuleType getApiAccessRule(int idx) {
        if (this.apiAccessRule == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.apiAccessRule.get(idx);
    }

    public int getApiAccessRuleLength() {
        if (this.apiAccessRule == null) {
            return 0;
        }
        return this.apiAccessRule.size();
    }

    /**
     * @param values allowed objects are
     *               {@link ApiAccessRuleType }
     */
    public void setApiAccessRule(ApiAccessRuleType[] values) {
        this._getApiAccessRule().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.apiAccessRule.add(values[i]);
        }
    }

    protected List<ApiAccessRuleType> _getApiAccessRule() {
        if (apiAccessRule == null) {
            apiAccessRule = new ArrayList<ApiAccessRuleType>();
        }
        return apiAccessRule;
    }

    /**
     * @param value allowed object is
     *              {@link ApiAccessRuleType }
     */
    public ApiAccessRuleType setApiAccessRule(int idx, ApiAccessRuleType value) {
        return this.apiAccessRule.set(idx, value);
    }

}
