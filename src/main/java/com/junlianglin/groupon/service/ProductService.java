package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.support.AbstractService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;

import java.util.List;

public interface ProductService extends AbstractService {
    List<Product> findAll();

    void create(Product product);

    Page<Product> findProductList(int pageNumber, int pagesize);

}
