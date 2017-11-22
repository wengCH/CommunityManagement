package com.fzu.dao.server.impl;

import com.fzu.dao.entity.User;
import com.fzu.dao.dao.UserDao;
import com.fzu.dao.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by weng on 2017/11/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User checkLogin(User user) {
        User user1 = userDao.find(user);
        System.out.print("info: \n"+user1);
        return user1;
    }

    public User checkRegister(User user) {
        User user1 = userDao.findName(user);
        System.out.print("info: \n"+user1);
        return user1;
    }

    public void insertRegister(User user) {
        userDao.insertUser(user);
    }
}
