package com.wangnian.mybatis.annotation;
import com.wangnian.mybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by 王念 on 2016/4/28.
 */
public interface UserDao1 {

    @Select("select * from user where id=#{id}")
    public User selectid(@Param("id") Integer id);


    @Insert("insert into user values(null,#{name})")
    public boolean insertUser(@Param("name") String name);

    @Select("select * from user u join user u1  where u.id=#{id}")
    public List<Map> select(@Param("id") Integer id);



}
