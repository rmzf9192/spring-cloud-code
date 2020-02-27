package com.el.cloud.service;

import java.util.List;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
public interface IUserService {
    public String getDefaultUser();
    public String getContextUserId();
    public List<String> getProviderData();
}
