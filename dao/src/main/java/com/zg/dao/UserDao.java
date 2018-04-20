package com.zg.dao;

import com.zg.entity.TUser;

public interface UserDao {
    public TUser doGetUserById(int id);
}
