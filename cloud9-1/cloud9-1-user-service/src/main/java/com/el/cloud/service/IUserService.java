package com.el.cloud.service;

import java.util.List;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
 */
public interface IUserService {
    public String getDefaultUser();
    public String getContextUserId();
    public List<String> getProviderData();
}