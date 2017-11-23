package com.fzu.dao.server.impl;

import com.fzu.dao.entity.Community;
import com.fzu.dao.dao.CommunityDao;
import com.fzu.dao.server.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * Created by weng on 2017/11/24.
 */
public class CommunityServicempl implements CommunityService {

    @Autowired
    private CommunityDao communityDao;

    public Community checkLogin(Community community) {
        Community community1 = communityDao.find(community);
        System.out.print("info: \n"+community1);
        return community1;
    }

    public Community checkRegister(Community community) {
        Community community1 = communityDao.findName(community);
        System.out.print("info: \n"+community1);
        return community1;
    }

    public void insertRegister(Community community) {
        communityDao.insertCommunity(community);
    }
}