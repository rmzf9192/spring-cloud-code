package com.el.cloud.extension;

import com.nepxion.discovery.plugin.framework.listener.loadbalance.AbstractLoadBalanceListener;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class MyLoadBalanceListener extends AbstractLoadBalanceListener {
    @Override
    public void onGetServers(String serviceId, List<? extends Server> servers) {
        // System.out.println("========== LoadBalance Listener :: getServers()被触发, serviceId=" + serviceId + ", servers=" + servers + " ==========");
    }
}