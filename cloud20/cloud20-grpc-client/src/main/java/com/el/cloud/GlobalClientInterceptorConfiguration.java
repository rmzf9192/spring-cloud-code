package com.el.cloud;

import net.devh.springboot.autoconfigure.grpc.client.GlobalClientInterceptorConfigurerAdapter;
import net.devh.springboot.autoconfigure.grpc.client.GlobalClientInterceptorRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author Roman.Zhang
 * @date 2020/3/5
 * @description:
 */
@Order
@Configuration
public class GlobalClientInterceptorConfiguration {

    @Bean
    public GlobalClientInterceptorConfigurerAdapter globalInterceptorConfigurerAdapter() {
        return new GlobalClientInterceptorConfigurerAdapter() {

            @Override
            public void addClientInterceptors(GlobalClientInterceptorRegistry registry) {
                registry.addClientInterceptors(new LogGrpcInterceptor());
            }
        };
    }

}
