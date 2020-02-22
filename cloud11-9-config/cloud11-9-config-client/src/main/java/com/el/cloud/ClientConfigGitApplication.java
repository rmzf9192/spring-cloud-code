package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author roman zhangfei
 * @Date 2020/2/22
 * @Version V1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientConfigGitApplication.class, args);
    }
}