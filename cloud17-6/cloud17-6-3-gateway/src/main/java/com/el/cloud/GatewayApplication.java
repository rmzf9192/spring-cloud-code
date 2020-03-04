package com.el.cloud;

import com.el.cloud.filter.GatewayRateLimitFilterByCpu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author Roman.Zhang
 * @date 2020/3/4
 * @description:
 */
@SpringBootApplication
public class GatewayApplication {

    @Autowired
    private GatewayRateLimitFilterByCpu gatewayRateLimitFilterByCpu;

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/test/rateLimit")
                        .filters(f -> f.filter(gatewayRateLimitFilterByCpu))
                        .uri("http://localhost:8000/hello/rateLimit")
                        .id("rateLimit_route")
                ).build();
    }
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}

