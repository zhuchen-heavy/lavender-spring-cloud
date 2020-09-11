package com.lavender.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <p>
 * 测试controller
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/7
 * @version: v1.0.0
 */
@RestController
public class TestController {

    @GetMapping("fallback")
    public Mono<String> fallback(){
        return Mono.just("fallback");
    }

}
