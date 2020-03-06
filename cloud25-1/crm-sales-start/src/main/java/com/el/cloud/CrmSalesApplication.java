package com.el.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@MapperScan("com.el.cloud.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CrmSalesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmSalesApplication.class, args);
    }
}
