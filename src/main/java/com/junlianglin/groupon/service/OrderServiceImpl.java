package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Page<Order> getAllOrders(String abbName){
        Specification<Order> specification = new Specification<Order>(){

            @Override
            public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                //if(!StringUtils.isEmpty(abbName)){
                Predicate likeNickName = criteriaBuilder.like(root.get("abbName").as(String.class),"%name%");
                predicates.add(likeNickName);
                //}
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        };
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return this.orderRepository.findAll(specification,PageRequest.of(0, 5, sort));
    }

    @Override
    public Page<Order> findAllByCreateDateAsc(String createDate, int pageNumber, int pagesize) throws Exception {

        String queryStartDate = createDate;
        if (StringUtils.isEmpty(createDate)){
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            queryStartDate = format.format(new Date());
        }
        else{
            queryStartDate = createDate;

        }


        final Date startDateLimit = new SimpleDateFormat("dd/MM/yyyy").parse(queryStartDate);;

        Specification<Order> specification = new Specification<Order>(){
            @Override
            public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if (startDateLimit != null){
                    ParameterExpression<Date> param = criteriaBuilder.parameter(Date.class);
                    predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.<Date> get("createDate"), startDateLimit));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        };
        Sort sort = new Sort(Sort.Direction.DESC, "createDate");
        return this.orderRepository.findAll(specification,PageRequest.of(pageNumber-1, pagesize, sort));
    }

    @Override
    public List<Order> findAll() {
        return this.orderRepository.findAll();
    }
}
