package com.el.cloud.service.fallback;

import com.el.cloud.service.dataservice.DataService;
import org.springframework.stereotype.Component;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
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