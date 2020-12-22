package com.springcloud.service.impl;

import com.springcloud.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class UserServiceImpl implements UserService {

    @Override
    @ResponseBody
    public String getUser(String userId) {
        return "getUser降级";
    }

}
