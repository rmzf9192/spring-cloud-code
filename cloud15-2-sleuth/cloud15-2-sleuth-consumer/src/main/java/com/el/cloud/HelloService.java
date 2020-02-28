package com.el.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Roman.Zhang
 * @date 2020/2/28
 * @description:
 */
@FeignClient(name = "sleuth-provider",url = "localhost:8082")
public interface HelloService {
    @RequestMapping("/sayHello")
    String sayHello(@RequestParam("name") String name);
}
