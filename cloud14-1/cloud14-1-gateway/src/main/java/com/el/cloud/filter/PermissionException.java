package com.el.cloud.filter;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
public class PermissionException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public PermissionException(String msg) {
        super(msg);
    }
}
