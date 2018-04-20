package com.zg.dao.Impl;

import com.zg.dao.UserDao;
import com.zg.entity.TUser;
import com.zg.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser doGetUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
