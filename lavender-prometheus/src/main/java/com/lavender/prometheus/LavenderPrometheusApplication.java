package com.lavender.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *  windows下启动：prometheus.exe
 *  url：http://localhost:9090/：prometheus的url
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/11
 * @version: v1.0.0
 */
@SpringBootApplication
public class LavenderPrometheusApplication {

    public static void main(String[] args) {
        SpringApplication.run(LavenderPrometheusApplication.class, args);
    }

}
