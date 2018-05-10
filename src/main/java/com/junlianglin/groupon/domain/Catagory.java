package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "t_catagory")
public class Catagory extends AbstractEntity {

    @Column(name = "name")
    @Size(min = 5, message = "*Your name must have at least 5 characters")
    @NotEmpty(message = "*Please provide your catagory name")
    private String name;



    @Column(name = "parent_id")
    private int parentId;

}
