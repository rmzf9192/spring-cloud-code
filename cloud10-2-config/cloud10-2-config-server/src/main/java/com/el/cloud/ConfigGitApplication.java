package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author roman zhangfei
 * @Date 2020/2/21
 * @Version V1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGitApplication.class, args);

    }
}