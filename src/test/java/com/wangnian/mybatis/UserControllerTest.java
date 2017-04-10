package com.wangnian.mybatis;

import com.wangnian.mybatis.entity.User;
import com.wangnian.mybatis.web.UserController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

public class UserControllerTest  extends  TestBase{

    @Autowired
    UserController userController;

    @Test
    public void getUser(){
        Object response = userController.getUser(9);
        Assert.notNull(response);
    }
}
