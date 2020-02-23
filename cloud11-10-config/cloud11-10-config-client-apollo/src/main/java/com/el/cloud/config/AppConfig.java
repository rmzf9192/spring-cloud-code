package com.el.cloud.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author roman zhangfei
 * @Date 2020/2/23
 * @Version V1.0
 */
@Configuration
@EnableApolloConfig(value = "application", order = 10)
public class AppConfig {
}