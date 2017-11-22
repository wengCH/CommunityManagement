package com.fzu.controller;

import com.fzu.dao.entity.User;
import com.fzu.dao.server.UserService;
import com.fzu.entity.LoginUser;
import com.fzu.entity.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by weng on 2017/11/19.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login.do")
    @ResponseBody
    private String login(LoginUser loginUser){
        String name = loginUser.getName();
        String pwd = loginUser.getPwd();

        User user = new User();
        user.setUserName(name);
        user.setUserPassword(pwd);

        if(null != userService.checkLogin(user)){
            return "login success" + name ;
        }else {
            return "login fail" + name;
        }
    }

    @RequestMapping("register.do")
    @ResponseBody
    private String register(RegisterUser registerUser){
        String name = registerUser.getName();
        String pwd = registerUser.getPwd();

        User user = new User();
        user.setUserName(name);
        user.setUserPassword(pwd);

        if(null != userService.checkRegister(user)){
            return "register fail" + name ;
        }else {
            userService.insertRegister(user);
            return "register success" + name;
        }
    }
}