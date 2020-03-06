package com.el.cloud;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello at " + System.currentTimeMillis();
    }
}
