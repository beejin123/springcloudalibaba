package com.springcloud.service;

import com.springcloud.service.impl.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "user-provider", fallback = UserServiceImpl.class)
public interface UserService {

    @GetMapping(value = "/getOrder/{userId}")
    String getOrder(@PathVariable(value = "userId") String userId);

}
