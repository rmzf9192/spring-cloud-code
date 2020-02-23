package com.el.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman zhangfei
 * @Date 2020/2/23
 * @Version V1.0
 */
@RestController
@RequestMapping("configConsumer")
@RefreshScope
public class ConfigClientController {

    @Value("${config_info}")
    private String config;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return config;
    }
}