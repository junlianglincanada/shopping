package com.junlianglin.groupon.support;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class AbstractEntity implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
