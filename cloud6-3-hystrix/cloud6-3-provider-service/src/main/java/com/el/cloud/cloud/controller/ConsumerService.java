package com.el.cloud.cloud.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@FeignClient(name = "sc-hello-service")
public interface ConsumerService {

    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData();
}