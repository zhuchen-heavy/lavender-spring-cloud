package com.lavender.nacos.consumer.controller;

import com.lavender.nacos.consumer.service.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     * http://localhost:8089/services
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("lavender-nacos-discovery-provider");
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     * http://localhost:8089/discover
     */
    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancer.choose("lavender-nacos-discovery-provider").getUri().toString();
    }

    /**
     * http://localhost:8089/call
     * @return
     */
    @RequestMapping("/call")
    public String call() {
        ServiceInstance serviceInstance = loadBalancer.choose("lavender-nacos-discovery-provider");
        System.out.println("服务地址：" + serviceInstance.getUri());
        System.out.println("服务名称：" + serviceInstance.getServiceId());

        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/provider1", String.class);
        System.out.println(callServiceResult);
        return callServiceResult;
    }

    /**
     * http://localhost:8089/hello
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        String result1 = providerFeignClient.consumer1();
        String result2 = providerFeignClient.consumer2();
        return result1 + " : " + result2;
    }

}
