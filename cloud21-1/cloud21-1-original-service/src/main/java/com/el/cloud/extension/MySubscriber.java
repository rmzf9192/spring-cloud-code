package com.el.cloud.extension;

import com.google.common.eventbus.Subscribe;
import com.nepxion.discovery.plugin.framework.event.RegisterFailureEvent;
import com.nepxion.eventbus.annotation.EventBus;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@EventBus
public class MySubscriber {
    @Subscribe
    public void onRegisterFailure(RegisterFailureEvent registerFailureEvent) {
        System.out.println("========== 注册失败, eventType=" + registerFailureEvent.getEventType() + ", eventDescription=" + registerFailureEvent.getEventDescription() + ", serviceId=" + registerFailureEvent.getServiceId() + ", host=" + registerFailureEvent.getHost() + ", port=" + registerFailureEvent.getPort());
    }
}