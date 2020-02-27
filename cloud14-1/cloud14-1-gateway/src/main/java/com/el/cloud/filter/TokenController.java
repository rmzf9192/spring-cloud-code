package com.el.cloud.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
@RestController
public class TokenController {

    @GetMapping("/getToken/{name}")
    public String get(@PathVariable("name") String name)  {
        return JwtUtil.generateToken(name);
    }

}
