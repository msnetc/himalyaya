package com.wangnian.mybatis;

import com.wangnian.mybatis.entity.User;
import com.wangnian.mybatis.mapper.UserDaoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootmybatisApplication.class)
public class SpringbootmybatisApplicationTests {


	@Autowired
	private UserDaoMapper userDao1;

	@Test
	public void getUser(){
		User user1 = userDao1.selectUserById(9);
		Assert.notNull(user1);
		User Use2 = userDao1.selectUserById(8);
	}
	@Test
	public void contextLoads() {
	}

}
