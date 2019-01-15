package com.example.springboottest1.service.impl;

import com.example.springboottest1.entity.User;
import com.example.springboottest1.mapper.UserMapper;
import com.example.springboottest1.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: SpirngbootTest1
 * @description: 登录验证的实现类
 * @author: DP_Li
 * @create: 2019/01/15
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserMapper usermapper;

    @Override
    public User userLogin(String username, String password) {
        User user = usermapper.userlogin(username,password);
        return user;
    }

}
