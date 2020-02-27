package com.el.cloud.common.intercepter;

import com.el.cloud.common.context.UserContextHolder;
import com.el.cloud.common.util.HttpConvertUtil;
import com.el.cloud.common.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
 *   进入controller控制器时，会拦截到请求，从header头中解析出用户对象存入上文中，方便服务里使用。
 */
public class UserContextInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(UserContextInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2) throws Exception {
        User user = new User(HttpConvertUtil.httpRequestToMap(request));
        if(StringUtils.isEmpty(user.getUserId()) && StringUtils.isEmpty(user.getUserName())) {
            log.error("the user is null, please access from gateway or check user info");
            return false;
        }
        UserContextHolder.set(user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2, ModelAndView arg3)
            throws Exception {
        // DOING NOTHING
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse respone, Object arg2, Exception arg3)
            throws Exception {
        UserContextHolder.shutdown();
    }



}
