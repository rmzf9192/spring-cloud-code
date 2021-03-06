package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch2222EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch2222EurekaServerApplication.class, args);
    }
}
