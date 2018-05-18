package com.junlianglin.groupon.model;

import com.junlianglin.groupon.support.AbstractModel;

import java.util.ArrayList;
import java.util.List;

public class ProductListModel extends AbstractModel {
    private List<ProductDetailModel> productDetailModelList;
    public ProductListModel(){
        productDetailModelList = new ArrayList<ProductDetailModel>();
    }

    public List<ProductDetailModel> getProductDetailModelList() {
        return productDetailModelList;
    }

    public void setProductDetailModelList(List<ProductDetailModel> productDetailModelList) {
        this.productDetailModelList = productDetailModelList;
    }
}
