package com.lavender.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *  基于nacos的配置中心
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/10
 * @version: v1.0.0
 */
// spring boot和spring cloud应用
//@NacosPropertySource(dataId = "example", autoRefreshed = true)
@SpringBootApplication
public class LavenderNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(LavenderNacosApplication.class, args);
    }

}