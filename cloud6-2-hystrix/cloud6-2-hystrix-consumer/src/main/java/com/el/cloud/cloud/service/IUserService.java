package com.el.cloud.cloud.service;

import com.el.cloud.cloud.service.impl.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@FeignClient(name = "sc-provider-service", fallback = UserServiceFallback.class)
public interface IUserService {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username);

}