package com.el.cloud.cloud.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
public interface IHelloService {
    public String hello(Integer id);
    public String getUserToCommandKey(@CacheKey Integer id);
    public String updateUser(@CacheKey Integer id);
}