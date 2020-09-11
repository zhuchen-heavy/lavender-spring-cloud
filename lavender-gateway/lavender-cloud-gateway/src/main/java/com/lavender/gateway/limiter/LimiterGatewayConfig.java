package com.lavender.gateway.limiter;

import org.springframework.context.annotation.Bean;

/**
 * <p>
 *  限流配置类
 * 参考：https://www.fangzhipeng.com/springcloud/2018/12/22/sc-f-gatway4.html
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/8
 * @version: v1.0.0
 */
//@Configuration
public class LimiterGatewayConfig {

    // -----------------限流-------------------------

    /**
     * bean name：hostAddrKeyResolver
     * 需要跟application.yml中的 '#{@hostAddrKeyResolver}' hostAddrKeyResolver 一致
     */
    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        return new HostAddrKeyResolver();
    }

//    @Bean
//    public UriKeyResolver uriKeyResolver() {
//        return new UriKeyResolver();
//    }
//
//    @Bean
//    public KeyResolver userKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
//    }

}
