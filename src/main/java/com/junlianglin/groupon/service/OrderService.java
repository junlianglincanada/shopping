package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.support.AbstractService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.Date;
import java.util.List;

public interface OrderService extends AbstractService {
    Page<Order> findAllByCreateDateAsc(String createDate, int pageNumber, int pagesize) throws Exception;

    List<Order> findAll();
}
