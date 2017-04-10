package com.wangnian.mybatis.dao;

import com.wangnian.mybatis.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDao {
    @Resource
   private SqlSession sqlSession;

    public User getUserById(long id) {
        User user =sqlSession.selectOne("selectUserById", id);
        return user;
    }
}
