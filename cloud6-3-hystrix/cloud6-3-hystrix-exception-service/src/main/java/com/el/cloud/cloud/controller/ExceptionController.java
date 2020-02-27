package com.el.cloud.cloud.controller;

import com.el.cloud.cloud.service.PSFallbackBadRequestExpcetion;
import com.el.cloud.cloud.service.PSFallbackOtherExpcetion;
import com.el.cloud.cloud.service.ProviderServiceCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman zhangfei
 * @Date 2020/2/16
 * @Version V1.0
 */
@RestController
public class ExceptionController {
    private static Logger log = LoggerFactory.getLogger(ExceptionController.class);

    @GetMapping("/getProviderServiceCommand")
    public String providerServiceCommand(){
        String result = new ProviderServiceCommand("World").execute();
        return result;
    }


    @GetMapping("/getPSFallbackBadRequestExpcetion")
    public String providerServiceFallback(){
        String result = new PSFallbackBadRequestExpcetion().execute();
        return result;
    }


    @GetMapping("/getPSFallbackOtherExpcetion")
    public String pSFallbackOtherExpcetion(){
        String result = new PSFallbackOtherExpcetion().execute();
        return result;
    }

    @GetMapping("/getFallbackMethodTest")
    @HystrixCommand
    public String getFallbackMethodTest(String id){
        throw new RuntimeException("getFallbackMethodTest failed");
    }

    public String fallback(String id, Throwable throwable) {
        log.error(throwable.getMessage());
        return "this is fallback message";
    }

}