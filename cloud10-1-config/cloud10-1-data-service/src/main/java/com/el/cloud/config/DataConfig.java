package com.el.cloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
@Component
@ConfigurationProperties(prefix = "cn.springcloud.book")
public class DataConfig {

    private String defaultUser;

    public String getDefaultUser() {
        return defaultUser;
    }

    public void setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser;
    }

}

