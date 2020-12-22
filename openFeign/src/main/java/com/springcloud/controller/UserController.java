package com.springcloud.controller;

import com.springcloud.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/user/getUser/{userId}")
    String getUser(@PathVariable(value = "userId") String userId) {
        return userService.getUser(userId);
    }
}
