package com.guanyu.demo2.mapper;

import com.guanyu.demo2.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByUsername(@Param("username") String username);
}
