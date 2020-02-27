package com.el.cloud.service.dataservice;

import com.el.cloud.service.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
 *  feign调用数据服务
 */
@FeignClient(name = "sc-data-service", fallback= UserClientFallback.class)
public interface DataService {

    @RequestMapping(value = "/getDefaultUser", method = RequestMethod.GET)
    public String getDefaultUser();

    @RequestMapping(value = "/getContextUserId", method = RequestMethod.GET)
    public String getContextUserId();

}