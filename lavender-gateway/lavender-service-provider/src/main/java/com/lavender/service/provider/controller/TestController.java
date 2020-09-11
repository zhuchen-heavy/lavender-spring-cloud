package com.lavender.service.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试controller
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/8
 * @version: v1.0.0
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    /**
     * http://localhost:8082/hello?name=zhuchen
     */
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "zhuchen") String name) {
        return "Hello " + name + " , i am from port : " + port;
    }

    /**
     * http://localhost:8082/dynamic
     */
    @GetMapping("/dynamic")
    public String dynamic(){
        return "dynamic";
    }

}
