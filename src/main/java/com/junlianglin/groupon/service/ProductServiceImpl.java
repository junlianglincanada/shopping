package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.repository.OrderRepository;
import com.junlianglin.groupon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
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

    /*@Override
    public Page<Product> findProductList(int pageNumber, int pagesize) {
        Specification<Product> specification = new Specification<Product>(){

            @Override
            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                //if(!StringUtils.isEmpty(abbName)){
                Predicate likeNickName = criteriaBuilder.like(root.get("abbName").as(String.class),"%name%");
                predicates.add(likeNickName);
                //}
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        };
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return this.productRepository.findProductList(specification, PageRequest.of(0, 5, sort));
    }*/
}
