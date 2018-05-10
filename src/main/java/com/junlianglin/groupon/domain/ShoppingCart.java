package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "t_shopping_cart")
public class ShoppingCart extends AbstractEntity {

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name="user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    private Product product;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
