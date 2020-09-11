package com.lavender.consul.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 *  基于consul的service consumer
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/11
 * @version: v1.0.0
 */
@EnableFeignClients
@SpringBootApplication
public class ConsulConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class, args);
    }

}
