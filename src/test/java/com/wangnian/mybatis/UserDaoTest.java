package com.wangnian.mybatis;

import com.wangnian.mybatis.dao.UserDao;
import com.wangnian.mybatis.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * Created by yanjie.miao on 2017/4/10.
 */
public class UserDaoTest  extends  TestBase{

    @Autowired
    private UserDao userDao ;
    @Test
    public void getUser(){
        User user1 = userDao.getUserById(9);
        Assert.notNull(user1);
    }
}
