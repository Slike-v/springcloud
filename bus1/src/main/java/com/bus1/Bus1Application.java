package com.bus1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Bus1Application {
    public static void main(String[] args) {
        SpringApplication.run(Bus1Application.class,args);
    }
}
