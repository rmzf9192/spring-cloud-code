package com.el.cloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixCollapsingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixCollapsingApplication.class, args);
    }

}