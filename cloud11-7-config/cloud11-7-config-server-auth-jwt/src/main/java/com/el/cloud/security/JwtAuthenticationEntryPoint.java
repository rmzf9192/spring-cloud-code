package com.el.cloud.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * @author roman zhangfei
 * @Date 2020/2/22
 * @Version V1.0
 *  jwt 认证端点
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = 3671302053846319657L;

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {

        // 没有认证通过将添加401
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}