package com.lavender.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * <p>
 * 自定义过滤器
 * 打印请求耗时
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/7
 * @version: v1.0.0
 */
public class RequestTimeFilter implements GatewayFilter, Ordered {

    private static final Logger logger = LoggerFactory.getLogger(RequestTimeFilter.class);

    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 相当于 pre 过滤器
        exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
        // 相当于 post 过滤器
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    Long startTime = exchange.getAttribute(REQUEST_TIME_BEGIN);
                    if (startTime != null) {
                        logger.info(exchange.getRequest().getURI().getRawPath() + ": " + (System.currentTimeMillis() - startTime) + " ms");
                    }
                })
        );
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
