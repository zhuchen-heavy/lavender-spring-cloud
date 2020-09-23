package com.lavender.nacos.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * consul界面：http://localhost:8500/
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/11
 * @version: v1.0.0
 */
@RestController
public class ProviderController {

    @RequestMapping("/provider1")
    public String provider1() {
        return "hello nacos provider1";
    }

    @RequestMapping("/provider2")
    public String provider2() {
        return "hello nacos provider2";
    }

}