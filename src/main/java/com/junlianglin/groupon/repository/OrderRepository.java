package com.junlianglin.groupon.repository;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.support.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Repository;

@Repository("orderRepository")
public interface OrderRepository extends AbstractRepository<Order> {


    Page<Order> findAll(Specification<Order> spec, @PageableDefault(sort = { "createDate"}, value = 10)
            Pageable pageable);



}
