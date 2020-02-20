package com.el.cloud.common.context;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
 */
public class HystrixThreadLocal {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
}