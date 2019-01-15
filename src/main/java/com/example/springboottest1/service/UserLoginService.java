package com.example.springboottest1.service;

import com.example.springboottest1.entity.User;

public interface UserLoginService {

    User userLogin(String username, String password);
}
