package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;
import org.springframework.http.converter.StringHttpMessageConverter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_address")
public class Address extends AbstractEntity {
    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "street_no")
    private String streetNo;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "province")
    private String province;

    @Column(name = "country")
    private String country;

}
