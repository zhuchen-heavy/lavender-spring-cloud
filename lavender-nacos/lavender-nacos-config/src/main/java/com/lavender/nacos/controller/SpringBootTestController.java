package com.lavender.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  测试spring boot + nacos 集成
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/10
 * @version: v1.0.0
 */
@RestController
@RequestMapping("config")
public class SpringBootTestController {

    //@NacosValue(value = "${useLocalCache}", autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping("/boot")
    public boolean get() {
        return useLocalCache;
    }

}
