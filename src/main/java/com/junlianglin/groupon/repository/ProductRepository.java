package com.junlianglin.groupon.repository;

import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.support.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends AbstractRepository<Product> {
}
