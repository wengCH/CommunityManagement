package com.fzu.controller;
import com.fzu.dao.entity.Community;
import com.fzu.dao.server.CommunityService;
import com.fzu.entity.LoginCommunity;
import com.fzu.entity.RegisterCommunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @RequestMapping("login.do")
    @ResponseBody
    private String login(LoginCommunity loginCommunity){
        String id = loginCommunity.getId();
        String pwd = loginCommunity.getPwd();

        Community community = new Community();
        community.setCommunityId(id);
        community.setCommunityPassword(pwd);

        if(null != communityService.checkLogin(community)){
            return "login success" + id ;
        }else {
            return "login fail" + id;
        }
    }

    @RequestMapping("register.do")
    @ResponseBody
    private String register(RegisterCommunity registerCommunity){
        String id = registerCommunity.getId();
        String name = registerCommunity.getName();
        String pwd = registerCommunity.getPwd();
        String introduction = registerCommunity.getIntroduction();

        Community community = new Community();
        community.setCommunityId(id);
        community.setCommunityName(name);
        community.setCommunityPassword(pwd);
        community.setCommunityIntroduction(introduction);

        if(null != communityService.checkRegister(community)){
            return "register fail" + name ;
        }else {
            communityService.insertRegister(community);
            return "register success" + name;
        }
    }
}
