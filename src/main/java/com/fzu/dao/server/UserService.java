package com.fzu.dao.server;

import com.fzu.dao.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by weng on 2017/11/19.
 */
public interface UserService {
    User checkLogin(User user);
    User checkRegister(User user);
    void insertRegister(User user);
}
