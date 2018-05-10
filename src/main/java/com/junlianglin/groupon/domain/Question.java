package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

public class Question extends AbstractEntity {
    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name="user_id")
    private User user;

    @Column(name = "questions")
    @Size(min = 10, message = "*Your name must have at least 10 characters")
    @NotEmpty(message = "*Please provide your questions")
    private String questions;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name = "create_date",updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @org.hibernate.annotations.CreationTimestamp
    private Date createDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
