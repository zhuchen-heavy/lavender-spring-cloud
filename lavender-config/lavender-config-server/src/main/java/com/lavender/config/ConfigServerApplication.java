package com.lavender.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p>
 *  spring cloud config server端
 *  博客地址：https://blog.csdn.net/forezp/article/details/70037291
 * </p>
 *  直接访问资源：http://localhost:8087/addredd-dev.properties
 * @author: zhu.chen
 * @date: 2020/9/11
 * @version: v1.0.0
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
