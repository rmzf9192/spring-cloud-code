package com.el.cloud.controller;

import com.el.cloud.service.SkyFeignSerivece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman.Zhang
 * @date 2020/2/28
 * @description:
 */
@RestController
@RequestMapping("skyController")
public class SkyController {

    @Autowired
    private SkyFeignSerivece skyFeignSerivece;

    @RequestMapping(value = "/getInfo")
    public String getInfo(){

        return skyFeignSerivece.getSendInfo("service-a");
    }
}
