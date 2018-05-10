package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "t_order")
public class Order extends AbstractEntity {

    @OneToMany(cascade={ CascadeType.ALL })
    @JoinColumn(name="order_id")
    private Collection<OrderItem> orderItems = new ArrayList<OrderItem>();

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name="user_id")
    private User user;


    @Column(name = "address_id")
    private int addressId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "amount",columnDefinition="Decimal(10,2) default '0.00'")
    private double amount;

    @Column(name = "status")
    private int status;

    public Collection<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Collection<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
