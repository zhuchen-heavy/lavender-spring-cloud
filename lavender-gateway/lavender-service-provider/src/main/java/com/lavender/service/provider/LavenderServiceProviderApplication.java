package com.lavender.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LavenderServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LavenderServiceProviderApplication.class, args);
    }

}
