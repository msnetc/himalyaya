package com.wangnian.mybatis;


import com.wangnian.mybatis.entity.User;
import com.wangnian.mybatis.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class UserServiceTest  extends  TestBase{

    @Autowired
    private UserService userService;

    @Test
    public void getUser(){
        User user1 = userService.getUserById(9);
        Assert.notNull(user1);
    }

    @Test
    public void TestConnection(){
        try{

            Integer cnt =10000;
            for(int i=0;i<cnt;i++){
                userService.getUserById(i);
            }
        }catch(Exception e)
        {
            String msg = e.getMessage();
        }
    }
}
