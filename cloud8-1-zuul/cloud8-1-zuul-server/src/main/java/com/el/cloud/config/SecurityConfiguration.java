package com.el.cloud.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author roman zhangfei
 * @Date 2020/2/19
 * @Version V1.0
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .requestMatcher(EndpointRequest.toAnyEndpoint())
                .authorizeRequests()
                .anyRequest()
                .permitAll();
    }
}
