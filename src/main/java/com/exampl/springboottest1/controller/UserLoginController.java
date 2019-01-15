package com.exampl.springboottest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpirngbootTest1
 * @description: 用户登录验证
 * @author: DP_Li
 * @create: 2019/01/15
 */
@RequestMapping(value = {"/user"})
@Controller
public class UserLoginController {

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



}
