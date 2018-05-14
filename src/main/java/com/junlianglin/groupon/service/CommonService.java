package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Catagory;
import com.junlianglin.groupon.domain.Vendor;
import com.junlianglin.groupon.support.AbstractService;

import java.util.List;

public interface CommonService extends AbstractService {

    List<Vendor> findAllVendor();

    List<Catagory> findAllCatagory();
}
