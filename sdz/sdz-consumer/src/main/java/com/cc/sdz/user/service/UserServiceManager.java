package com.cc.sdz.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cc.sdz.user.entity.User;
import com.cc.sdz.user.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceManager {

    @Reference(version = "1.0.0")
    private UserService userService;

    public UserVO getUser(UserVO userVo) {
        User user = new User();
        user.setName(userVo.getName());
        User userResult = userService.getUser(user);

        return user2UserVO(userResult, userVo);
    }

    private UserVO user2UserVO(User user, UserVO userVO) {
        if (user != null) {
            userVO.setId(user.getId().toString());
            userVO.setName(user.getName());
        }

        return userVO;
    }
}
