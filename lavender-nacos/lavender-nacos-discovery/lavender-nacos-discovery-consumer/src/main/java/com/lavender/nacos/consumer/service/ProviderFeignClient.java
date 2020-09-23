package com.lavender.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  feign client：调用provider的服务
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/11
 * @version: v1.0.0
 */
@Service
@FeignClient("lavender-nacos-discovery-provider")
public interface ProviderFeignClient {

    @GetMapping("/provider1")
    @ResponseBody
    String consumer1();

    @GetMapping("/provider2")
    @ResponseBody
    String consumer2();

}
