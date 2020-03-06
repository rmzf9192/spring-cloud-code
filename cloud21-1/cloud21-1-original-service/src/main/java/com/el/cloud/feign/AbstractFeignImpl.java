package com.el.cloud.feign;

import com.nepxion.discovery.plugin.framework.adapter.PluginAdapter;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class AbstractFeignImpl {
    @Autowired
    private PluginAdapter pluginAdapter;

    public String doInvoke(String value) {
        String serviceId = pluginAdapter.getServiceId();
        String version = pluginAdapter.getVersion();
        // String host = pluginAdapter.getHost();
        // int port = pluginAdapter.getPort();

        return value + " -> " + serviceId + "[" + version + "]";
    }
}