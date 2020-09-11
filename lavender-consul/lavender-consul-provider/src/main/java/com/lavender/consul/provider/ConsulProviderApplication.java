package com.lavender.consul.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *  基于consul的service provider
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/11
 * @version: v1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderApplication.class, args);
    }

}
