package com.zg.impl;

import com.zg.UserService;
import com.zg.dao.UserDao;
import com.zg.entity.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public TUser doGetUserById(int id) {
        return userDao.doGetUserById(id);
    }
}
