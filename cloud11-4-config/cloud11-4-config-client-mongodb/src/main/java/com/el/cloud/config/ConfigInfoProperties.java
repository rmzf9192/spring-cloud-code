package com.el.cloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author roman zhangfei
 * @Date 2020/2/22
 * @Version V1.0
 */
@Component
@ConfigurationProperties(prefix = "cn.springcloud.book")
public class ConfigInfoProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}