package com.fzu.controller;

import com.fzu.dao.entity.User;
import com.fzu.dao.server.UserService;
import com.fzu.entity.LoginUser;
import com.fzu.entity.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by weng on 2017/11/19.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login.do")
    private ModelAndView login(LoginUser loginUser){
        String name = loginUser.getName();
        String pwd = loginUser.getPwd();
        String score = "登陆失败，请重新登陆";

        User user = new User();
        user.setUserName(name);
        user.setUserPassword(pwd);

        if(null != userService.checkLogin(user)){
            System.out.print("登陆成功");
            ModelMap modelMap=new ModelMap();
            modelMap.put("name",name);
            modelMap.put("pwd",pwd);
            return new ModelAndView("userIndex.jsp", modelMap);
       }else {
            System.out.print("登陆失败");
            ModelMap modelMap=new ModelMap();
            modelMap.put("score",score);
            return new ModelAndView("userLogin.jsp", modelMap);
        }
    }

    @RequestMapping("register.do")
    private ModelAndView register(RegisterUser registerUser){
        String name = registerUser.getName();
        String pwd = registerUser.getPwd();
        String relname = registerUser.getRelname();
        String sex = registerUser.getSex();
        String major = registerUser.getMajor();
        String phone = registerUser.getPhone();
        String email = registerUser.getEmail();
        String score;

        User user = new User();
        user.setUserName(name);
        user.setUserPassword(pwd);
        user.setUserRelname(relname);
        user.setUserSex(sex);
        user.setUserMajor(major);
        user.setUserPhone(phone);
        user.setUserEmail(email);

        if(null != userService.checkRegister(user)){
            System.out.print("注册失败");
            score = "用户已被注册";
            ModelMap modelMap=new ModelMap();
            modelMap.put("score",score);
            return new ModelAndView("userRegister.jsp", modelMap);
        }else {
            userService.insertRegister(user);
            System.out.print("注册成功");
            score = "注册成功";
            ModelMap modelMap=new ModelMap();
            modelMap.put("score",score);
            return new ModelAndView("userLogin.jsp", modelMap);
        }
    }
}