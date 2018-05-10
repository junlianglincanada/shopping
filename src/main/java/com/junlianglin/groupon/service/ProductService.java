package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.support.AbstractService;

import java.util.List;

public interface ProductService extends AbstractService {
    List<Product> findAll();
    void create(Product product);
}
