package com.el.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@FeignClient("provider")
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}
