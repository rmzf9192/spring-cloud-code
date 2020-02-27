package com.el.cloud.common.context;

import com.el.cloud.common.vo.User;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
 *  用户上下文
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