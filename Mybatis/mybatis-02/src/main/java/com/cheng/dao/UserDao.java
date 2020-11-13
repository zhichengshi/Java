package com.cheng.dao;

import com.cheng.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();
    List<User> getUserListLike(String value);
    User getUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

}
