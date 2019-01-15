package com.exampl.springboottest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpirngbootTest1
 * @description: 这是个控制类
 * @author: DP_Li
 * @create: 2019/01/15
 */
@Controller
@RequestMapping(value = {"/hello"})
public class helloController {

    @RequestMapping(value = {"/springboot"})
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = {"/loginHtml"})
    public String userLogin() {
        return "userLogin";
    }



}
