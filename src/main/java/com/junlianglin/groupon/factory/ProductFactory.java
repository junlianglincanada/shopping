package com.junlianglin.groupon.factory;

import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.model.ProductDetailModel;
import com.junlianglin.groupon.model.ProductEditModel;
import com.junlianglin.groupon.model.ProductListModel;
import com.junlianglin.groupon.service.CommonService;
import com.junlianglin.groupon.utils.DateFormatter;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

    public static List<ProductListModel> toList(CommonService commonService,DateFormatter dateFormatter, List<Product> productList){
        List<ProductListModel> productListModelList = null;
        if (productList!= null || productList.size()>0){
            productListModelList = new ArrayList<ProductListModel>();
            for (Product entity : productList) {
                //productListModelList.add(ProductFactory.toModel(commonService,dateFormatter,entity));
            }
        }
        return productListModelList;
    }

    public static ProductDetailModel toModel(CommonService commonService, DateFormatter dateFormatter, Product product){
        ProductDetailModel model = null;
        if (product!=null){
            model = new ProductDetailModel();
            model.setId(product.getId());
            model.setName(product.getName());
            model.setPrice(product.getPrice());
            model.setVendor(commonService.findAllVendor().get(product.getVendor().getId()).toString());
            model.setCatalog(commonService.findAllCatagory().get(product.getCatagory().getId()).toString());
        }
        return model;
    }

    public static Product toEntity(ProductEditModel model){
        Product product = null;
        if (model!=null){
            product = new Product();

        }
        return product;
    }
}
