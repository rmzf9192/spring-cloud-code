package com.el.cloud.common.util;

import com.el.cloud.common.vo.User;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
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