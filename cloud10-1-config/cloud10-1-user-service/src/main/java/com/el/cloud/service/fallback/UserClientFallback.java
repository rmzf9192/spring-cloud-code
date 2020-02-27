package com.el.cloud.service.fallback;

import com.el.cloud.service.dataservice.DataService;
import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
@Component
public class UserClientFallback implements DataService {

    @Override
    public String getDefaultUser() {
        return new String("get getDefaultUser failed");
    }
    @Override
    public String getContextUserId() {
        return new String("get getContextUserId failed");
    }

}
