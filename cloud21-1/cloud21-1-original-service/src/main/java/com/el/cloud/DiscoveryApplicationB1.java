package com.el.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DiscoveryApplicationB1 {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "b1");

        new SpringApplicationBuilder(DiscoveryApplicationB1.class).run(args);
    }
}