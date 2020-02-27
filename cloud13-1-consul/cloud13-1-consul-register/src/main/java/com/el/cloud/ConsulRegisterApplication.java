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
@RestController
@SpringBootApplication
public class ConsulRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulRegisterApplication.class,args);
    }
    /**
     * 这里我们不使用默认的健康检测, 而是使用自己定义的接口
     * @return SUCCESS
     */
    @GetMapping("/health")
    public String health(){
        return "SUCCESS";
    }
}
