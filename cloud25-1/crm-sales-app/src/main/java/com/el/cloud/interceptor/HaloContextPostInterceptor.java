package com.el.cloud.interceptor;

import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PostInterceptor;
import org.xujin.halo.context.HaloContext;
import org.xujin.halo.context.PvgContext;
import org.xujin.halo.dto.Command;
import org.xujin.halo.dto.Response;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@PostInterceptor
public class HaloContextPostInterceptor implements CommandInterceptorI{

    @Override
    public void postIntercept(Command command, Response response) {
        if(HaloContext.exist()){
            HaloContext.remove();
        }
        if(PvgContext.exist()){
            PvgContext.remove();
        }
    }

}
