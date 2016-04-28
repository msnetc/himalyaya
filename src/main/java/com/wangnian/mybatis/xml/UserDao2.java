package com.wangnian.mybatis.xml;

import com.wangnian.mybatis.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 王念 on 2016/4/28.
 */
@Component
public class UserDao2 {
       @Autowired
       private SqlSession sqlSession;

      public User selectUserById(Integer id){
          return sqlSession.selectOne("selectUserById",id);// mapper
      }



}
