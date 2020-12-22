package com.springcloud.service.impl;

import com.springcloud.service.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class OrderServiceImpl implements OrderService {

    @Override
    @ResponseBody
    public String getOrder(String orderId) {
        return "getOrder降级";
    }

}
