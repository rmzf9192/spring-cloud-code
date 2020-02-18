package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author roman zhangfei
 * @Date 2020/2/15
 * @Version V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Ch35EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch35EurekaClientApplication.class, args);
    }
}