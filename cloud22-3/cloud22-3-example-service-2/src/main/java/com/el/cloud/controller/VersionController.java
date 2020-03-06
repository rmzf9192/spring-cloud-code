package com.el.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping("")
    public Mono<String> getVersion(){
        return Mono.just("0.0.1");
    }
}
