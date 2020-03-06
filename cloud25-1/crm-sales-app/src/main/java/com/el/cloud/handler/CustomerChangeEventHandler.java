package com.el.cloud.handler;

import org.xujin.halo.dto.Response;
import org.xujin.halo.dto.event.Event;
import org.xujin.halo.event.EventHandler;
import org.xujin.halo.event.EventHandlerI;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@EventHandler
public class CustomerChangeEventHandler implements EventHandlerI {


    @Override
    public Response execute(Event event) {
        System.out.println("Add your own other logic here");
        return Response.buildSuccess();
    }
}
