package com.cc.sdz.user.service;

import com.cc.sdz.user.entity.User;

import java.util.List;

public interface UserService {

    User getUser(User user);

    List<User> getUserList(User user);

}
