package com.lavender.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注：当什么也不加时，需要手动调用post：http://localhost:8080/actuator/refresh来通知client端去重新从server端获取数据。
 * 参考：1：http://www.ityouknow.com/springcloud/2017/05/22/springcloud-config-git.html
 * 2：http://www.ityouknow.com/springcloud/2017/05/23/springcloud-config-svn-refresh.html
 * 3：http://www.ityouknow.com/springcloud/2017/05/25/springcloud-config-eureka.html
 * 4：http://www.ityouknow.com/springcloud/2017/05/26/springcloud-config-eureka-bus.html
 */
@RefreshScope
@RestController
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${name}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        return name;
    }

}
