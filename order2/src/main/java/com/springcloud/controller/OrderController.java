package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/order/getOrder/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return "orderId:" + orderId + ", port:" + port;
    }

}
