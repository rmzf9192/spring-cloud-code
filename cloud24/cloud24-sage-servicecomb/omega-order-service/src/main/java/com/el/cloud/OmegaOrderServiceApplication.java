package com.el.cloud;

import org.apache.servicecomb.saga.omega.spring.EnableOmega;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "cn.springcloud.book.dao")
@EnableTransactionManagement
@EnableJpaAuditing
@EnableOmega
public class OmegaOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmegaOrderServiceApplication.class, args);
    }
}
