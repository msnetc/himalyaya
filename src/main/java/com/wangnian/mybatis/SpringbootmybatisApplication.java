package com.wangnian.mybatis;

import com.wangnian.mybatis.entity.User;
import com.wangnian.mybatis.mapper.UserDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootmybatisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

    @Autowired
    private UserDaoMapper userDao1;

    @Override
    public void run(String... strings) throws Exception {
        User user1 = userDao1.selectUserById(1);
        System.out.println(user1.getUserName());

    }
}
