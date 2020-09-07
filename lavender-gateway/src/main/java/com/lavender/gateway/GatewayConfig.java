package com.lavender.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * spring-cloud-gateway以java config的方式进行配置
 * http://httpbin.org:80 ：http请求的测试网址
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/7
 * @version: v1.0.0
 */
//@Configuration
public class GatewayConfig {

    /**
     * <p>
     * test 1：参考：https://blog.csdn.net/forezp/article/details/83792388
     * </p>
     *
     * @author: zhu.chen
     * @date: 2020/9/7
     * @version: v1.0.0
     */
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        String httpUri = "http://httpbin.org:80";
        return builder.routes()
                // http://localhost:8080/get
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        // httpbin.org 这个网站能测试 HTTP 请求和响应的各种信息，比如 cookie、ip、headers 和登录验证等，且支持 GET、POST 等多种方法，对 web 开发和测试很有帮助。
                        .uri(httpUri))
                // http://localhost:8080/delay/3
                .route(p -> p.host("*.hystrix.com")
                        .filters(f -> f.hystrix(config -> config.setName("mycmd")
                                .setFallbackUri("forward:/fallback"))).uri(httpUri))
                .build();
    }

}
