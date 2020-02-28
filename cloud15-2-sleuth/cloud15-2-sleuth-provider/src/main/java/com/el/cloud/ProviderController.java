package com.el.cloud;

import brave.propagation.ExtraFieldPropagation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/2/28
 * @description:
 */
@RestController
public class ProviderController {

    @GetMapping("/sayHello")
    public String hello(String name){
        return  "hello, "+name+",SessionId is "+ ExtraFieldPropagation.get("SessionId");
    }
}
