package com.el.cloud.cloud.controller;

import com.el.cloud.cloud.model.User;
import com.el.cloud.cloud.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@RestController
public class UserController implements UserService {
    @Override
    public String addUser(User user){
        return "hello,"+user.getName();
    }

    @Override
    public String updateUser(User user){
        return "hello,"+user.getName();
    }
}