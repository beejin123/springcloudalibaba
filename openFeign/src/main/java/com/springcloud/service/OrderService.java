package com.springcloud.service;

import com.springcloud.service.impl.OrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "order-provider", fallback = OrderServiceImpl.class)
public interface OrderService {

    @GetMapping(value = "/order/getOrder/{orderId}")
    String getOrder(@PathVariable(value = "orderId") String orderId);

}
