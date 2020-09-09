package com.lavender.gateway.dynamic;

import com.lavender.gateway.helper.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 动态网关，信息存储于Redis中
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/9
 * @version: v1.0.0
 */
@Component
public class RedisRouteDefinitionRepository implements RouteDefinitionRepository {

    private static final String GATEWAY_ROUTES = "gateway_routes";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {
        System.out.println("2");
        List<RouteDefinition> routeDefinitions = new ArrayList<>();
        stringRedisTemplate.opsForHash().values(GATEWAY_ROUTES).stream()
                .forEach(routeDefinition -> routeDefinitions.add(JsonHelper.deserialize(routeDefinition.toString(), RouteDefinition.class)));
        return Flux.fromIterable(routeDefinitions);
    }

    @Override
    public Mono<Void> save(Mono<RouteDefinition> route) {
        return null;
    }

    @Override
    public Mono<Void> delete(Mono<String> routeId) {
        return null;
    }
}
