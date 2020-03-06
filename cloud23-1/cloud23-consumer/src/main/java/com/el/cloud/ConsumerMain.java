package com.el.cloud;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<HelloService>();
        referenceConfig.setApplication(new ApplicationConfig("hello-service-consumer"));
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(HelloService.class);
        HelloService greetingService = referenceConfig.get();
        System.out.println(greetingService.hello());
    }
}
