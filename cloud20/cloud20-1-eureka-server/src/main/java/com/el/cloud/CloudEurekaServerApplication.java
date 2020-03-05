package com.el.cloud;

/**
 * @author Roman.Zhang
 * @date 2020/3/5
 * @description:
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run( CloudEurekaServerApplication.class, args );
    }
}
