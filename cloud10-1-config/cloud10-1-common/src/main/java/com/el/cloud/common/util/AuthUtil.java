package com.el.cloud.common.util;

import com.el.cloud.common.vo.User;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
public class AuthUtil {
    public static boolean authUser(User user, HttpServletResponse respone) throws Exception{
        if(StringUtils.isEmpty(user.getUserId())) {
            return false;
        }else {
            return true;
        }
    }
}
