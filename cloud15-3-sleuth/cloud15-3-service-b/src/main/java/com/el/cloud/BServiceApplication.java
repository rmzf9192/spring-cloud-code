package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Roman.Zhang
 * @date 2020/2/28
 * @description:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class BServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(BServiceApplication.class, args);
    }
}
