package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "t_order_item")
public class OrderItem extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name = "duscount",columnDefinition="Decimal(10,2) default '1.00'")
    private double discount;
}
