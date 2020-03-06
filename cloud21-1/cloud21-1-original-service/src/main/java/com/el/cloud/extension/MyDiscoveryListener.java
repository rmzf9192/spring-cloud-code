package com.el.cloud.extension;

import com.nepxion.discovery.plugin.framework.listener.discovery.AbstractDiscoveryListener;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class MyDiscoveryListener extends AbstractDiscoveryListener {
    @Override
    public void onGetInstances(String serviceId, List<ServiceInstance> instances) {
        // System.out.println("========== Discovery Listener :: getInstances()被触发, serviceId=" + serviceId + ", instances=" + instances + " ==========");
    }

    @Override
    public void onGetServices(List<String> services) {
        // System.out.println("========== Discovery Listener :: getServices()被触发, services=" + services + " ==========");
    }
}