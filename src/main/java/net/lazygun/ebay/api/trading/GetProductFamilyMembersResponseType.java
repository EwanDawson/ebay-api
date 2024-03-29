package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * GetProductFamilyMembers performs a product search and returns results comprising
 * all the children in the product family identified by a product ID that was
 * specified in the request. Use this call when more matches are found than the
 * max amount specified per family in a call to GetProductSearchResults.
 * This call supports batch requests. This means you can retrieve products in
 * multiple families by using a single request.
 * The results are compatible with the results from GetProductSearchResults,
 * so similar application logic can be used to handle both requests and responses.
 * <p/>
 * <p/>
 * <p>Java class for GetProductFamilyMembersResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetProductFamilyMembersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DataElementSets" type="{urn:ebay:apis:eBLBaseComponents}DataElementSetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductSearchResult" type="{urn:ebay:apis:eBLBaseComponents}ProductSearchResultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductFamilyMembersResponseType", propOrder = {
        "dataElementSets",
        "productSearchResult"
})
@XmlRootElement(name = "GetProductFamilyMembersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductFamilyMembersResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DataElementSets")
    protected List<DataElementSetType> dataElementSets;
    @XmlElement(name = "ProductSearchResult")
    protected List<ProductSearchResultType> productSearchResult;

    /**
     * @return array of
     *         {@link DataElementSetType }
     */
    public DataElementSetType[] getDataElementSets() {
        if (this.dataElementSets == null) {
            return new DataElementSetType[0];
        }
        return ((DataElementSetType[]) this.dataElementSets.toArray(new DataElementSetType[this.dataElementSets.size()]));
    }

    /**
     * @return one of
     *         {@link DataElementSetType }
     */
    public DataElementSetType getDataElementSets(int idx) {
        if (this.dataElementSets == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.dataElementSets.get(idx);
    }

    public int getDataElementSetsLength() {
        if (this.dataElementSets == null) {
            return 0;
        }
        return this.dataElementSets.size();
    }

    /**
     * @param values allowed objects are
     *               {@link DataElementSetType }
     */
    public void setDataElementSets(DataElementSetType[] values) {
        this._getDataElementSets().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.dataElementSets.add(values[i]);
        }
    }

    protected List<DataElementSetType> _getDataElementSets() {
        if (dataElementSets == null) {
            dataElementSets = new ArrayList<DataElementSetType>();
        }
        return dataElementSets;
    }

    /**
     * @param value allowed object is
     *              {@link DataElementSetType }
     */
    public DataElementSetType setDataElementSets(int idx, DataElementSetType value) {
        return this.dataElementSets.set(idx, value);
    }

    /**
     * @return array of
     *         {@link ProductSearchResultType }
     */
    public ProductSearchResultType[] getProductSearchResult() {
        if (this.productSearchResult == null) {
            return new ProductSearchResultType[0];
        }
        return ((ProductSearchResultType[]) this.productSearchResult.toArray(new ProductSearchResultType[this.productSearchResult.size()]));
    }

    /**
     * @return one of
     *         {@link ProductSearchResultType }
     */
    public ProductSearchResultType getProductSearchResult(int idx) {
        if (this.productSearchResult == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productSearchResult.get(idx);
    }

    public int getProductSearchResultLength() {
        if (this.productSearchResult == null) {
            return 0;
        }
        return this.productSearchResult.size();
    }

    /**
     * @param values allowed objects are
     *               {@link ProductSearchResultType }
     */
    public void setProductSearchResult(ProductSearchResultType[] values) {
        this._getProductSearchResult().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.productSearchResult.add(values[i]);
        }
    }

    protected List<ProductSearchResultType> _getProductSearchResult() {
        if (productSearchResult == null) {
            productSearchResult = new ArrayList<ProductSearchResultType>();
        }
        return productSearchResult;
    }

    /**
     * @param value allowed object is
     *              {@link ProductSearchResultType }
     */
    public ProductSearchResultType setProductSearchResult(int idx, ProductSearchResultType value) {
        return this.productSearchResult.set(idx, value);
    }

}
