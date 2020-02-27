package com.el.cloud.intercepter;

import com.el.cloud.vo.User;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description: RestTemplate拦截器：
 *   拦截请求后传递上下文信息和服务名到header中
 */
public class RestTemplateUserContextInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        User user = UserContextHolder.currentUser();
        request.getHeaders().add("x-user-id",user.getUserId());
        request.getHeaders().add("x-user-name",user.getUserName());
        request.getHeaders().add("x-user-serviceName",request.getURI().getHost());
        return execution.execute(request, body);
    }
}
