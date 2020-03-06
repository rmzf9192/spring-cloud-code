package com.el.cloud;

import com.el.cloud.extension.MyDiscoveryEnabledAdapter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DiscoveryApplicationZuul {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "zuul");

        new SpringApplicationBuilder(DiscoveryApplicationZuul.class).run(args);
    }

    @Bean
    public MyDiscoveryEnabledAdapter myDiscoveryEnabledAdapter() {
        return new MyDiscoveryEnabledAdapter();
    }
}
