package com.fzu.dao.dao;

import com.fzu.dao.entity.User;

/**
 * Created by weng on 2017/11/19.
 */
public interface UserDao {
    User find(User user);
    User findName(User user);
    void insertUser(User user);
}
