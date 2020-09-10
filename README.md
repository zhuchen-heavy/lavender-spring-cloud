# lavender-spring-cloud

## 一. spring cloud
### 1：API网关
#### spring cloud gateway
1：[spring-cloud-gateway Github官网](https://github.com/spring-cloud/spring-cloud-gateway)  
2：[spring-cloud-gateway 文档官网](https://docs.spring.io/spring-cloud-gateway/docs/2.2.5.RELEASE/reference/html/#gateway-starter)  
3：[spring-cloud-gateway 博客代码示例](https://www.fangzhipeng.com/springcloud/2018/11/06/sc-f-gateway1.html)  
4：[spring-cloud-gateway 博客源码解析](http://www.iocoder.cn/categories/Spring-Cloud-Gateway/?vip)  
5：[spring-cloud-gateway + nacos 实现动态网关](https://my.oschina.net/zlt2000/blog/3120077)

### 2：配置中心
#### spring cloud alibaba nacos
Nacos可以做配置中心和注册中心。    
1：[spring-cloud-alibaba-nacos Github官网](https://github.com/alibaba/nacos)  
2：[spring-cloud-alibaba-nacos 文档官网](https://nacos.io/zh-cn/docs/what-is-nacos.html)    

#### 2：spring cloud netflix hystrix
1：[Hystrix源码解析](http://www.iocoder.cn/categories/Hystrix/?self)

### 二. project module描述
#### lavender-eureka
eureka的服务端，端口为8080。

#### lavender-gateway
服务网关，端口为8081。

#### lavender-service-provider
服务提供者，端口为8082。

#### lavender-nacos
配置中心，端口为8083