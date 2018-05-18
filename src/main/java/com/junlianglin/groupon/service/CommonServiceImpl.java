package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.Catagory;
import com.junlianglin.groupon.domain.Vendor;
import com.junlianglin.groupon.repository.CatagoryRepository;
import com.junlianglin.groupon.repository.OrderRepository;
import com.junlianglin.groupon.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("commonService")
@Transactional
public class CommonServiceImpl implements CommonService {

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    private CatagoryRepository catagoryRepository;

    @Override
    public List<Vendor> findAllVendor(){
        return vendorRepository.findAll();
    }

    @Override
    public List<Catagory> findAllCatagory(){
        return catagoryRepository.findAll();
    }

}
