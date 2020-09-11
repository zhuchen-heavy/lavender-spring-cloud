package com.lavender.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 *  参考：https://blog.csdn.net/forezp/article/details/81040925
 *  eureka访问地址：http://localhost:8080/
 * </p>
 * @author: zhu.chen
 * @date: 2020/9/8
 * @version: v1.0.0
 */

@EnableEurekaServer
@SpringBootApplication
public class LavenderEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LavenderEurekaApplication.class, args);
    }

}
