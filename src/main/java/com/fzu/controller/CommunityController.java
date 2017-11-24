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
        String name = loginCommunity.getName();
        String pwd = loginCommunity.getPwd();

        Community community = new Community();
        community.setCommunityName(name);
        community.setCommunityPassword(pwd);

        if(null != communityService.checkLogin(community)){
            return "login success" + name ;
        }else {
            return "login fail" + name;
        }
    }

    @RequestMapping("register.do")
    @ResponseBody
    private String register(RegisterCommunity registerCommunity){
        String name = registerCommunity.getName();
        String cname = registerCommunity.getCname();
        String pwd = registerCommunity.getPwd();
        String introduction = registerCommunity.getIntroduction();

        Community community = new Community();
        community.setCommunityName(name);
        community.setCommunityCname(cname);
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
