package com.fzu.dao.dao;

import com.fzu.dao.entity.Community;
/**
 * Created by weng on 2017/11/24.
 */
public interface CommunityDao {
    Community find(Community community);
    Community findName(Community community);
    void insertCommunity(Community community);
}
