package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.repository.OrderRepository;
import com.junlianglin.groupon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }
}
