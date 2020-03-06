package com.el.cloud.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.el.cloud.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Component
public class DemoConsumer {

    @Reference
    private HelloService helloService;

    public String callHello(){
        return helloService.hello();
    }
}

