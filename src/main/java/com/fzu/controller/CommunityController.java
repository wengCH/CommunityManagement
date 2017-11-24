package com.fzu.controller;
import com.fzu.dao.entity.Community;
import com.fzu.dao.server.CommunityService;
import com.fzu.entity.LoginCommunity;
import com.fzu.entity.RegisterCommunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @RequestMapping("login.do")
    //@ResponseBody
    private ModelAndView login(LoginCommunity loginCommunity){
        String name = loginCommunity.getName();
        String pwd = loginCommunity.getPwd();
        String score = "登陆失败，请重新登陆";

        Community community = new Community();
        community.setCommunityName(name);
        community.setCommunityPassword(pwd);

        if(null != communityService.checkLogin(community)){
            System.out.print("登陆成功");
            ModelMap modelMap=new ModelMap();
            modelMap.put("name",name);
            modelMap.put("pwd",pwd);
            return new ModelAndView("communityIndex.jsp", modelMap);
        }else {
            System.out.print("登陆失败");
            ModelMap modelMap=new ModelMap();
            modelMap.put("score",score);
            return new ModelAndView("communityLogin.jsp", modelMap);
        }
    }

    @RequestMapping("register.do")
    //@ResponseBody
    private ModelAndView register(RegisterCommunity registerCommunity){
        String name = registerCommunity.getName();
        String cname = registerCommunity.getCname();
        String pwd = registerCommunity.getPwd();
        String introduction = registerCommunity.getIntroduction();
        String score;

        Community community = new Community();
        community.setCommunityName(name);
        community.setCommunityCname(cname);
        community.setCommunityPassword(pwd);
        community.setCommunityIntroduction(introduction);

        if(null != communityService.checkRegister(community)){
            System.out.print("注册失败");
            score = "社团号或社团名已被注册";
            ModelMap modelMap=new ModelMap();
            modelMap.put("score",score);
            return new ModelAndView("communityRegister.jsp", modelMap);
        }else {
            communityService.insertRegister(community);
            System.out.print("注册成功");
            score = "注册成功";
            ModelMap modelMap=new ModelMap();
            modelMap.put("score",score);
            return new ModelAndView("communityLogin.jsp", modelMap);
        }
    }
}
