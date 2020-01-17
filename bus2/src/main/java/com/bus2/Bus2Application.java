package com.bus2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Bus2Application {
    public static void main(String[] args) {
        SpringApplication.run(Bus2Application.class,args);
    }
}
