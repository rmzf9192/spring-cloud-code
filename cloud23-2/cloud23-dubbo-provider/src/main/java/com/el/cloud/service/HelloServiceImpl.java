package com.el.cloud.service;

import com.el.cloud.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@RestController
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello at " + System.currentTimeMillis();
    }
}
