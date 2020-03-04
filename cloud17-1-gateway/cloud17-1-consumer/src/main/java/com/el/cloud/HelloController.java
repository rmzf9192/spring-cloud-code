package com.el.cloud;

import com.el.cloud.feign.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Roman.Zhang
 * @date 2020/3/4
 * @description:
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloFeignService helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name)  {
        return helloRemote.hello(name) + "\n" + new Date().toString();
    }
}
