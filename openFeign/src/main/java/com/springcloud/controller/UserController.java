package com.springcloud.controller;

import com.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/customer/getOrder/{userId}")
    public String getOrder(@PathVariable(value = "userId") String userId) {
        return userService.getOrder(userId);
    }
}
