package com.springcloud.controller;

import com.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/getOrder/{orderId}")
    String getOrder(@PathVariable(value = "orderId") String orderId) {
        return orderService.getOrder(orderId);
    }
}

