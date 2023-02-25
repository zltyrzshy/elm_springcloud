package org.tango.service;


import org.tango.po.User;

public interface UserService {
    User getUserByIdByPass(String userId, String password);

    Integer getUserById(String userId);

    Integer saveUser(String userId, String password, String userName, int userSex);
}
