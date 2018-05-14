package com.junlianglin.groupon.factory;

import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.model.ProductListModel;
import com.junlianglin.groupon.service.CommonService;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

    public static List<ProductListModel> toList(CommonService commonService, List<Product> productList){
        List<ProductListModel> productListModelList = null;
        if (productList!= null || productList.size()>0){
            productListModelList = new ArrayList<ProductListModel>();
            for (Product entity : productList) {

            }
        }
        return productListModelList;
    }
}
