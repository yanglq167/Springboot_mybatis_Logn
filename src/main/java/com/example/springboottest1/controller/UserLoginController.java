package com.example.springboottest1.controller;

import com.example.springboottest1.entity.User;
import com.example.springboottest1.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: SpirngbootTest1
 * @description: 用户登录验证
 * @author: DP_Li
 * @create: 2019/01/15
 */
@RequestMapping(value = {"/user"})
@Controller
public class UserLoginController {

    @Autowired
    private  UserLoginService userLoginService;

    /**
     * @Description: 跳转到注册页面
     * @Param:
     * @return:
     * @Author: DP_Li
     * @date: 2019/1/15
     */
    @RequestMapping(value = {"/registerpage"})
    public String regist() {

        return "register";

    }


    @RequestMapping(value = {"/login"})
    public String login(String username, String password, HttpServletRequest request) {

            User bean  = new User(username,password);

            User user = (User) userLoginService.userLogin(bean);

            if(null!=user) {

                request.getSession().setAttribute("session_user",user);

                return "hello";
            }
        return "error";

    }



}
