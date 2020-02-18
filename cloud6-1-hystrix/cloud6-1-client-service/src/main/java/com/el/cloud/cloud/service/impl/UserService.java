package com.el.cloud.cloud.service.impl;

import com.el.cloud.cloud.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@Component
public class UserService implements IUserService {

    @Override
    @HystrixCommand(fallbackMethod="defaultUser")
    public String getUser(String username) throws Exception {
        if(username.equals("spring")) {
            return "This is real user";
        }else {
            throw new Exception();
        }
    }

    /**
     * 出错则调用该方法返回友好错误
     * @param username
     * @return
     */
    public String defaultUser(String username) {
        return "The user does not exist in this system";
    }

}
