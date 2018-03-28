package com.guanyu.demo2.service;

import com.guanyu.demo2.model.User;

public interface UserService {
    User findByUsername(String username);
}
