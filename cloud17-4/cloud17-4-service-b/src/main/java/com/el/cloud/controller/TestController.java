package com.el.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/3/4
 * @description:
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String prefixpath(){
        return "https to Http";
    }

}
