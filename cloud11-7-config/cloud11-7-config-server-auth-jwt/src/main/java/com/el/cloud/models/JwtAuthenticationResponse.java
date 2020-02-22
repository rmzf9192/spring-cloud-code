package com.el.cloud.models;

import java.io.Serializable;

/**
 * @author roman zhangfei
 * @Date 2020/2/22
 * @Version V1.0
 */
public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}