package com.el.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Roman.Zhang
 * @date 2020/3/4
 * @description:
 */
@FeignClient(name = "sc-producer")
public interface HelloFeignService {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
