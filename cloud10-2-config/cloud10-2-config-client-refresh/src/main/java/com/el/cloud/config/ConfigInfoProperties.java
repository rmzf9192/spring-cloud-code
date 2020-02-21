package com.el.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author roman zhangfei
 * @Date 2020/2/21
 * @Version V1.0
 */
@Component
@RefreshScope
public class ConfigInfoProperties {

    @Value("${cn.springcloud.book.config}")
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}