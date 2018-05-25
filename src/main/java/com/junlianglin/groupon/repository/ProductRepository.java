package com.junlianglin.groupon.repository;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.support.AbstractRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends AbstractRepository<Product> {

    /*Page<Product> findProductList(Specification<Product> spec, @PageableDefault(sort = { "createDate"}, value = 10)
            Pageable pageable);*/
}
