package com.wangnian.mybatis.mapper;

import com.wangnian.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 王念 on 2016/4/28.
 */
@Mapper
public interface UserDaoMapper {
    User selectUserById(@Param("id") Integer id);
}
