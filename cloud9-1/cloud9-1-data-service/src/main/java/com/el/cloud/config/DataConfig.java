package com.el.cloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
 *  配置信息
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