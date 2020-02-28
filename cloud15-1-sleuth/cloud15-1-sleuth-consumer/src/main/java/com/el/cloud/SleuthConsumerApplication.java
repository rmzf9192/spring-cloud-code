package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lenovo
 * @date 2020/2/28
 * @description:
 */
@SpringBootApplication
@EnableFeignClients
public class SleuthConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthConsumerApplication.class,args);
    }
}
