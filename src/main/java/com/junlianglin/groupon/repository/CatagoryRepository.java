package com.junlianglin.groupon.repository;

import com.junlianglin.groupon.domain.Catagory;
import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.support.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository("catagoryRepository")
public interface CatagoryRepository extends AbstractRepository<Catagory> {
}
