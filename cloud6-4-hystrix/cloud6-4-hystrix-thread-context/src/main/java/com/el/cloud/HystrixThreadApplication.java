package com.el.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixThreadApplication {
}