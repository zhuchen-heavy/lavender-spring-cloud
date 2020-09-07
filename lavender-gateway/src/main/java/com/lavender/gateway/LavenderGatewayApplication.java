package com.lavender.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: chen.zhu
 * @date: 2020/9/7
 * @function: 网关常见功能：路由转发、权限校验、限流控制
 */
@SpringBootApplication
public class LavenderGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LavenderGatewayApplication.class, args);
    }

}
