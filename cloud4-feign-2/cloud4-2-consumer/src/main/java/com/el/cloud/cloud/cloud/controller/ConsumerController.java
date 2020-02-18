package com.el.cloud.cloud.cloud.controller;

import com.el.cloud.cloud.cloud.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman zhangfei
 * @Date 2020/2/15
 * @Version V1.0
 */
@RestController
public class ConsumerController {

    // 注入服务提供者,远程的Http服务
    @Autowired
    private UserFeignService userFeignService;

    // 服务消费者对位提供的服务
    @GetMapping("/consumer/feign")
    public String findByIdByEurekaServer() {
        return userFeignService.helloFeign();

    }

}