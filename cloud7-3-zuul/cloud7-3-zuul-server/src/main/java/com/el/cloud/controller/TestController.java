package com.el.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman zhangfei
 * @Date 2020/2/18
 * @Version V1.0
 */
@RestController
public class TestController {

    @GetMapping("/client")
    public String add(Integer a, Integer b){
        return "本地跳转：" + (a + b);
    }
}