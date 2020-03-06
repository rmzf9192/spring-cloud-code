package com.el.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@Configuration
public class AtomikosTccConfig {

    @Bean
    public AtomikosTccSpringAdapter atomikosTccSpringAdpater(){
        return new AtomikosTccSpringAdapter();
    }

    public static class AtomikosTccSpringAdapter {
        @PostConstruct
        public void start(){
            com.atomikos.icatch.config.Configuration.init();
        }

        @PreDestroy
        public void shutdown(){
            com.atomikos.icatch.config.Configuration.shutdown(false);
        }
    }
}
