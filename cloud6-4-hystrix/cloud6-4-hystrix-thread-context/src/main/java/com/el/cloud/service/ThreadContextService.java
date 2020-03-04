package com.el.cloud.service;

import com.el.cloud.config.HystrixThreadLocal;
import com.el.cloud.ThreadContextController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */

@Component
public class ThreadContextService implements IThreadContextService{
    private static final Logger log = LoggerFactory.getLogger(ThreadContextController.class);

    @HystrixCommand
    public String getUser(Integer id) {
        log.info("ThreadContextService, Current thread : " + Thread.currentThread().getId());
        log.info("ThreadContextService, ThreadContext object : " + HystrixThreadLocal.threadLocal.get());
        log.info("ThreadContextService, RequestContextHolder : " + RequestContextHolder.currentRequestAttributes().getAttribute("userId", RequestAttributes.SCOPE_REQUEST).toString());
        return "Success";
    }



}