package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author roman zhangfei
 * @Date 2020/2/18
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class,args);
    }
}