package com.el.cloud.cloud.service.impl;

import com.el.cloud.cloud.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@Component
public class UserServiceFallback implements IUserService {
    /**
     * 出错则调用该方法返回友好错误
     * @param username
     * @return
     */
    public String getUser(String username){
        return "The user does not exist in this system, please confirm username";
    }
}