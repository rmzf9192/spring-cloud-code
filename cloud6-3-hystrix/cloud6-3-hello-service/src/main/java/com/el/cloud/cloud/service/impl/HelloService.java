package com.el.cloud.cloud.service.impl;

import com.el.cloud.cloud.service.IHelloService;
import com.el.cloud.cloud.service.dataservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@Component
public class HelloService implements IHelloService {

    @Autowired
    private ProviderService dataService;

    @Override
    public List<String> getProviderData() {
        return dataService.getProviderData();
    }

}