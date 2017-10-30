package com.meituan.test.controller;

import com.meituan.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhaofuyu on 2017/10/30.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request,HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(service.login(username,password)){
            return "login success";
        }else{
            return "username or password error";
        }
    }
}
