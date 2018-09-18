package com.cc.sdz.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cc.sdz.user.dao.UserDAO;
import com.cc.sdz.user.entity.User;
import com.cc.sdz.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUser(User user) {
        return userDAO.getOne(user);
    }

    @Override
    public List<User> getUserList(User user) {
        return null;
    }
}
