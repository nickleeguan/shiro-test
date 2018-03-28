package com.guanyu.demo2.service;

import com.guanyu.demo2.mapper.UserMapper;
import com.guanyu.demo2.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.Action;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
