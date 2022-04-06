package com.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author binSin
 * @date 2022/3/30
 */
@EnableDubbo
@SpringBootApplication
public class Provider1Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider1Application.class,args);
    }
}
