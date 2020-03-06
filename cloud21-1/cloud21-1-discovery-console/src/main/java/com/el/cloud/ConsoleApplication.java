package com.el.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Roman.Zhang
 * @date 2020/3/5
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsoleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsoleApplication.class).run(args);
    }
}
