package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
@EnableHystrixDashboard
@EnableCircuitBreaker
public class Ch2223TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch2223TurbineApplication.class, args);
    }
}
