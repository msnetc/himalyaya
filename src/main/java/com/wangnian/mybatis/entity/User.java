package com.wangnian.mybatis.entity;

import java.io.Serializable;

/**
 * Created by 王念 on 2016/4/28.
 */
public class User implements Serializable {
    private Integer id;
    private  String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
