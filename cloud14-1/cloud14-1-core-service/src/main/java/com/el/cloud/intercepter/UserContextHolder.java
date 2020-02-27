package com.el.cloud.intercepter;

import com.el.cloud.vo.User;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description: 上下文持有对象
 */
public class UserContextHolder {
    public static ThreadLocal<User> context = new ThreadLocal<User>();
    public static User currentUser() {
        return context.get();
    }
    public static void set(User user) {
        context.set(user);
    }
    public static void shutdown() {
        context.remove();
    }
}
