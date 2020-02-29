package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author Roman.Zhang
 * @date 2020/2/28
 * @description:
 */
@SpringBootApplication
public class SCGatewayApplication {


    @Bean
    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("add_request_header_route", r ->
                        r.path("/test").filters(f -> f.addResponseHeader("X-Response-Foo", "Bar"))
                                .uri("http://www.baidu.com"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SCGatewayApplication.class, args);
    }
}
