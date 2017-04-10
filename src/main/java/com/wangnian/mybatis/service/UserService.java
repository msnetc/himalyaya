package com.wangnian.mybatis.service;

import com.wangnian.mybatis.dao.UserDao;
import com.wangnian.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(long id) {
        User user= userDao.getUserById(id);
        return user;
    }
}
