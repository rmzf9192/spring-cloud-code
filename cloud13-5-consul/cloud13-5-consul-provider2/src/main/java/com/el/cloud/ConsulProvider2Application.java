package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
@SpringBootApplication
@RestController
public class ConsulProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProvider2Application.class, args);
    }

    /**
     * 注意：新版Spring Cloud Consul 默认注册健康检查接口为：/actuator/health
     *
     * @return SUCCESS
     */
    @GetMapping("/actuator/health")
    public String health() {
        return "SUCCESS";
    }

    /**
     * 提供 sayHello 服务:根据对方传来的名字 XX，返回:hello XX. I am provider2
     * @return String
     */
    @GetMapping("/sayHello")
    public String sayHello(String name){
        return "hello," + name + ". I am provider2";
    }
}
