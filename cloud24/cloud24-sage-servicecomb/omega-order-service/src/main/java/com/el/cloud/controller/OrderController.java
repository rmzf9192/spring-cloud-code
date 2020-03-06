package com.el.cloud.controller;

import com.el.cloud.domain.UserOrder;
import com.el.cloud.service.OrderService;
import org.apache.servicecomb.saga.omega.context.OmegaContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    OmegaContext omegaContext;

    @PostMapping
    public UserOrder order(@RequestBody UserOrder userOrder){
        userOrder.setTxId(omegaContext.globalTxId());
        return orderService.order(userOrder);
    }
}
