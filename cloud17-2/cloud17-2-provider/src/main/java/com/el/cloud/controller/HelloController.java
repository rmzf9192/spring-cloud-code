package com.el.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/3/4
 * @description:
 */
@RestController
public class HelloController {

    @GetMapping("/customFilter")
    public String customFilter(@RequestParam String name) {
        return "customFilter, " + name + "!";
    }
}
