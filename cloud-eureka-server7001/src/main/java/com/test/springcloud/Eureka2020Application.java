package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hw
 * @className Eureka2020Application
 * @Date 2021/6/11 14:59
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2020Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2020Application.class,args);
    }
}
