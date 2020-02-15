package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author roman zhangfei
 * @Date 2020/2/15
 * @Version V1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch33ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch33ZuulGatewayApplication.class,args);
    }
}