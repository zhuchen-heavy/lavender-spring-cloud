package com.lavender.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 参考：https://www.fangzhipeng.com/springcloud/2018/12/21/sc-f-gatway3.html
 * @author: zhu.chen
 * @date: 2020/9/7
 * @version: v1.0.0
 */
@Configuration
public class CustomGatewayConfig {

    /**
     * <p>
     * 自定义过滤器的注册
     * {@link RequestTimeFilter}
     * </p>
     */
    //@Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route(
                r -> r.path("/customer/**")
                        .filters(f -> f.filter(new RequestTimeFilter())
                                .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                        .uri("http://httpbin.org:80/get")
                        .order(0)
                        .id("customer_filter_router")
        ).build();
    }

    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

}
