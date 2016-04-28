package com.wangnian.mybatis;

import com.wangnian.mybatis.annotation.UserDao1;
import com.wangnian.mybatis.entity.User;
import com.wangnian.mybatis.xml.UserDao2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

import static javafx.beans.binding.Bindings.select;

@SpringBootApplication
@MapperScan("com.wangnian.mybatis.annotation")
public class SpringbootmybatisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

    //注解的方式
    @Autowired
    private UserDao1 userDao1;

    //xml方式
    @Autowired
    private UserDao2 userDao2;

    @Override
    public void run(String... strings) throws Exception {
        //查询
        User user = userDao1.selectid(1);
        System.out.println(user.getName());

        User user1 = userDao2.selectUserById(1);
        System.out.println(user1.getName());


        //插入

       boolean b=  userDao1.insertUser("wangnain");
        System.out.println(b);
       //多表查询
       List<Map> list= userDao1.select(1);
        System.out.println(list.get(1));



    }
}
