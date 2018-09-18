package com.cc.sdz.user.controller;

import com.cc.sdz.user.service.UserServiceManager;
import com.cc.sdz.user.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping({"/api/user"})
public class UserController {

    @Autowired
    private UserServiceManager userService;

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public UserVO detail(@RequestBody UserVO userVO) {
        log.info("/api/user/detail : {}", userVO);
        return userService.getUser(userVO);
    }
}
