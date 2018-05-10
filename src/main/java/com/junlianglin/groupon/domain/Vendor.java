package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "t_vendor")
public class Vendor extends AbstractEntity {

    @Column(name = "name")
    @Size(min = 5, message = "*Your name must have at least 5 characters")
    @NotEmpty(message = "*Please provide your name")
    private String name;
    private String description;
    private Date createDate;

    @OneToMany(cascade={ CascadeType.ALL })
    @JoinColumn(name="vendor_id")
    private Collection<Product> products = new ArrayList<Product>();

   /* @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
