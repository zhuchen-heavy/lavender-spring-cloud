package com.lavender.gateway.dynamic;

import com.lavender.gateway.helper.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.FilterDefinition;
import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 初始化RouteDefinition数据到Redis
 * TODO 后续可以通过 ApplicationEventPublisher.publishEvent(new RefreshRoutesEvent(this)) 即可通过gateway刷新 CachingRouteDefinitionLocator 中的 RouteDefinition 缓存
 * </p>
 *
 * @author: zhu.chen
 * @date: 2020/9/9
 * @version: v1.0.0
 */
@Component
public class InitRouteDefinition {

    private static final String GATEWAY_ROUTES = "gateway_routes";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 使用Redis来存储RouteDefinition
     * 等价于 ---> application.yml中的 test 14 注释掉的部分。
     * TODO 以下动态可以放置到注册中心，例如：gateway + nacos
     */
    @PostConstruct
    public void init() throws URISyntaxException {
        System.out.println("1");
        RouteDefinition routeDefinition = new RouteDefinition();
        routeDefinition.setId("gateway-dynamic");
        URI uri = new URI("lb://LAVENDER-SERVICE-PROVIDER");
        routeDefinition.setUri(uri);

        PredicateDefinition predicate = new PredicateDefinition();
        predicate.setName("Path");
        Map<String, String> predicateParams = new HashMap<>(8);
        predicateParams.put("pattern", "/demo/**");
        predicate.setArgs(predicateParams);

        //定义Filter
        FilterDefinition filter = new FilterDefinition();
        filter.setName("StripPrefix");
        Map<String, String> filterParams = new HashMap<>(8);
        //该_genkey_前缀是固定的，见org.springframework.cloud.gateway.support.NameUtils类
        filterParams.put("_genkey_0", "1");
        filter.setArgs(filterParams);

        routeDefinition.setFilters(Arrays.asList(filter));
        routeDefinition.setPredicates(Arrays.asList(predicate));
        stringRedisTemplate.opsForHash().put(GATEWAY_ROUTES, "key", JsonHelper.serialize(routeDefinition));
    }

}
