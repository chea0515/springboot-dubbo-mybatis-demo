package com.cc.sdz.user.entity;

import com.cc.sdz.base.Entity;

public class User extends Entity {
    private static final long serialVersionUID = -2281549347290182148L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
