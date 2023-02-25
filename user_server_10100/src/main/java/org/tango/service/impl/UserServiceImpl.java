package org.tango.service.impl;


import org.tango.mapper.UserMapper;
import org.tango.po.User;
import org.tango.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByIdByPass(String userId, String password) {
        return userMapper.getUserByIdByPass(userId, password);
    }

    @Override
    public Integer getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public Integer saveUser(String userId, String password, String userName, int userSex) {
        return userMapper.saveUser(userId, password, userName, userSex);
    }
}
