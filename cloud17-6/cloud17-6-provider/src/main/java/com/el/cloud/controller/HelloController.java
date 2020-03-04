package com.el.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/3/4
 * @description:
 */
@RequestMapping("/hello")
@RestController
public class HelloController {


    @GetMapping("/rateLimit")
    public String hello() {
        return "Hello, spring cloud Gateway";
    }

}
