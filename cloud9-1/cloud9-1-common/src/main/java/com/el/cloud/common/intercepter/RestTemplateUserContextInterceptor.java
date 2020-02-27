package com.el.cloud.common.intercepter;

import com.el.cloud.common.context.UserContextHolder;
import com.el.cloud.common.vo.User;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.Map;

/**
 * @author roman zhangfei
 * @Date 2020/2/20
 * @Version V1.0
 *  RestTemplate传递用户上下文：使用RestTemplate进行服务间调用时会拦截到请求，并将用户属性放到header里
 */
public class RestTemplateUserContextInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        User user = UserContextHolder.currentUser();
        Map<String, String> headers = user.toHttpHeaders();
        for (Map.Entry<String, String> header : headers.entrySet()) {
            request.getHeaders().add(header.getKey(), header.getValue());
        }
        // 调用
        return execution.execute(request, body);
    }
}