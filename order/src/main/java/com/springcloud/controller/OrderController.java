package com.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(value = "/getOrder/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return orderId;
    }
}
