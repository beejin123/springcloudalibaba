package com.springcloud.service.impl;

import com.springcloud.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getOrder(String userId) {
        return userId + "error";
    }
}
