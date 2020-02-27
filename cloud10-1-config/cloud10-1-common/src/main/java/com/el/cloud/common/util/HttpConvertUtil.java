package com.el.cloud.common.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
public class HttpConvertUtil {

    /**
     * convert the httpServletRequest headers to headers map
     * @param request
     * @return
     */
    public static Map<String, String> httpRequestToMap(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        Map<String, String> headers = new HashMap<>();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            headers.put(headerName, request.getHeader(headerName));
        }
        return headers;
    }
}
