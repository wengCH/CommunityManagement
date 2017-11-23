package com.fzu.dao.server;

import com.fzu.dao.entity.Community;
import org.springframework.stereotype.Service;

/**
 * Created by weng on 2017/11/24.
 */
public interface CommunityService {
    Community checkLogin(Community community);
    Community checkRegister(Community community);
    void insertRegister(Community community);
}
