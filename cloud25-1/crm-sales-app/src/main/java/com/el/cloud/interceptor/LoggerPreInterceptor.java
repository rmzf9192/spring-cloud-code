package com.el.cloud.interceptor;

import org.springframework.core.annotation.Order;
import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PreInterceptor;
import org.xujin.halo.dto.Command;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@PreInterceptor
@Order(1)
public class LoggerPreInterceptor implements CommandInterceptorI{
    
    Logger logger = LoggerFactory.getLogger(LoggerPreInterceptor.class);
    private ThreadLocal<Long> startTimeLocal=new ThreadLocal<>();
    
    @Override
    public void preIntercept(Command command) {

        logger.debug("Begin to process %s", command);
        startTimeLocal.set(System.currentTimeMillis());
    }

    public Long getStartTime() {
        return startTimeLocal.get();
    }

}
