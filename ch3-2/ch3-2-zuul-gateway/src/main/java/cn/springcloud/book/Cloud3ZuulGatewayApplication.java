package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author roman zhangfei
 * @Date 2020/2/14
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Cloud3ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(Cloud3ZuulGatewayApplication.class,args);
    }
}