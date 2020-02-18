package com.el.cloud.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@RestController
public class ProviderController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/getDashboard")
    public List<String> getProviderData(){
        List<String> provider = new ArrayList<String>();
        provider.add("hystrix dashboard");
        return provider;
    }


    @GetMapping("/getHelloService")
    public String getHelloService(){
        return consumerService.getHelloServiceData();
    }
}