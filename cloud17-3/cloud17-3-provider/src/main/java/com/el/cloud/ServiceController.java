package com.el.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/3/4
 * @description:
 */
@RestController
public class ServiceController {

    @GetMapping(value = "/v1")
    public String v1() {
        return "v1";
    }

    @GetMapping(value = "/v2")
    public String v2() {
        return "v2";
    }
}

