package com.el.cloud.extension;

import com.nepxion.discovery.plugin.framework.listener.register.AbstractRegisterListener;
import org.springframework.cloud.client.serviceregistry.Registration;
/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
public class MyRegisterListener extends AbstractRegisterListener {
    @Override
    public void onRegister(Registration registration) {
        // System.out.println("========== Register Listener :: register()被触发, serviceId=" + registration.getServiceId());
    }

    @Override
    public void onDeregister(Registration registration) {
        // System.out.println("========== Register Listener :: deregister()被触发, serviceId=" + registration.getServiceId());
    }

    @Override
    public void onSetStatus(Registration registration, String status) {
        // System.out.println("========== Register Listener :: setStatus()被触发, serviceId=" + registration.getServiceId() + ", status=" + status);
    }

    @Override
    public void onClose() {
        // System.out.println("========== Register Listener :: close()被触发 ==========");
    }
}