package com.springcloud.controller;

import com.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/user/getUser/{userId}")
    public String getUser(@PathVariable String userId) {
        return "userId:" + userId + ", port:" + port + "<br/>" + orderService.getOrder(userId);
    }

}