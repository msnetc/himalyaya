package com.wangnian.mybatis.mapper;

import com.wangnian.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDaoMapper {
    User selectUserById(@Param("id") Integer id);
}
