package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "t_product")
public class Product extends AbstractEntity {

    @Column(name = "name")
    @Size(min = 5, message = "*Your name must have at least 5 characters")
    @NotEmpty(message = "*Please provide your product name")
    private String name;

    @Column(name = "price",columnDefinition="Decimal(10,2) default '0.00'")
    private double price;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name="catagory_id")
    private Catagory catagory;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name="vendor_id")
    private Vendor vendor;

    @Column(name = "create_Date")
    private Date createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
