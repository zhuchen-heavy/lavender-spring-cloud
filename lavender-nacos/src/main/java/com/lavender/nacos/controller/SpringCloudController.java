package com.lavender.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  测试spring cloud + nacos 集成
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/10
 * @version: v1.0.0
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class SpringCloudController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping("/cloud")
    public boolean get(){
        return useLocalCache;
    }


}
