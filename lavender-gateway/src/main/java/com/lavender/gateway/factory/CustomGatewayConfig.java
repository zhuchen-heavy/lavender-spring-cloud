package com.lavender.gateway.factory;

/**
 * 参考：https://www.fangzhipeng.com/springcloud/2018/12/21/sc-f-gatway3.html
 *
 * @author: zhu.chen
 * @date: 2020/9/7
 * @version: v1.0.0
 */
//@Configuration
public class CustomGatewayConfig {

    /**
     * <p>
     * 自定义GatewayFilterFactory，这样即可将参数配置到 application.yml。
     * 否则无法配置到
     * </p>
     */
    //@Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

}
