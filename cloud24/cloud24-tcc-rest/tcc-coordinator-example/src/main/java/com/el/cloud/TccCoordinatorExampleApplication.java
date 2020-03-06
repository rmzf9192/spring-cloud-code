package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Roman.Zhang
 * @date 2020/3/6
 * @description:
 */
@SpringBootApplication
public class TccCoordinatorExampleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(TccCoordinatorExampleApplication.class, args);
        SpringApplication app = new SpringApplication(TccCoordinatorExampleApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
}
