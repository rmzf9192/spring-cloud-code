package com.el.cloud;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class ProviderMain {

    public static void main(String[] args) throws IOException {
        ServiceConfig<HelloService> serviceConfig = new ServiceConfig<HelloService>();
        serviceConfig.setApplication(new ApplicationConfig("hello-service-provider"));
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost:2181");
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(new HelloServiceImpl());
        serviceConfig.export();
        System.in.read();
    }
}
