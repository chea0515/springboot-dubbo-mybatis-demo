package com.cc.sdz.user.dao;

import com.cc.sdz.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {

    User getOne(User user);

}
