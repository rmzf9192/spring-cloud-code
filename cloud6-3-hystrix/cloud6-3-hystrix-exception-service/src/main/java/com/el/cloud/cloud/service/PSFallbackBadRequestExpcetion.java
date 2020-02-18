package com.el.cloud.cloud.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PSFallbackBadRequestExpcetion extends HystrixCommand<String>{
	private static Logger log = LoggerFactory.getLogger(PSFallbackBadRequestExpcetion.class);
	
    public PSFallbackBadRequestExpcetion() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupBRE"));
    }
    
	@Override
	protected String run() throws Exception {
		 throw new HystrixBadRequestException("HystrixBadRequestException error");
	}
	
    @Override
    protected String getFallback() {
    	System.out.println(getFailedExecutionException().getMessage());
        return "invoke HystrixBadRequestException fallback method:  ";
    }
	
	
}
