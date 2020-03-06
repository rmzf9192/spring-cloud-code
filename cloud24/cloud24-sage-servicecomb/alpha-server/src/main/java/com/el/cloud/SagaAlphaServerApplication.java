package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.apache.servicecomb.saga")
public class SagaAlphaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SagaAlphaServerApplication.class, args);
    }
}
