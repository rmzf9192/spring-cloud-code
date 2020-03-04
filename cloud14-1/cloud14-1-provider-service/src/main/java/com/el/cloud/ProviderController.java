package com.el.cloud;

import com.el.cloud.intercepter.UserContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lenovo
 * @date 2020/2/27
 * @description:
 */
@RestController
public class ProviderController {

    @GetMapping("/provider/test")
    public String test(HttpServletRequest request) {
        System.out.println("auth success, the user is : " + UserContextHolder.currentUser().getUserName());
        System.out.println("----------------success access provider service----------------");
        return "success access provider service!";
    }
}
