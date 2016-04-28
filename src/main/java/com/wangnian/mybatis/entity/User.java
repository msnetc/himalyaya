package com.wangnian.mybatis.entity;

import java.io.Serializable;

/**
 * Created by 王念 on 2016/4/28.
 */
public class User implements Serializable {
    private Integer id;
    private  String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
