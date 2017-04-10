package com.wangnian.mybatis;


import com.wangnian.mybatis.dao.UserDao;
import com.wangnian.mybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootmybatisApplication.class)
public class TestUserDao {

    @Autowired
    private UserDao userDao ;

    @Test
    public void getUser(){
        User user1 = userDao.getUserById(9);
        Assert.notNull(user1);
    }
}
