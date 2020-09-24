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

### 3：注册中心
#### consul
1：[consul GitHub官网](https://github.com/hashicorp/consul)  
2：[consul 文档官网](https://www.consul.io/docs)

### 4：熔断
#### spring cloud netflix hystrix
1：[Hystrix源码解析](http://www.iocoder.cn/categories/Hystrix/?self)

### 5：监控
#### 1：spring boot actuator
1：[actuator暴露端点原理解析](http://www.iocoder.cn/Spring-Boot/battcn/v2-actuator-introduce/)  
#### 2：prometheus + grafana
1：[prometheus Github官网](https://github.com/prometheus/prometheus)  
2：[prometheus 文档官网](https://prometheus.io/)  
3：[Windows安装prometheus](https://blog.csdn.net/lht3347/article/details/84144999)   
4：[grafana Github官网](https://github.com/grafana/grafana)  
5：[grafana 文档官网](https://grafana.com/grafana/)  
6：[Windows安装grafana](https://segmentfault.com/a/1190000016234162)    
7：[spring cloud + actuator + prometheus + grafana示例](https://segmentfault.com/a/1190000021430295)  

### 6：Http客户端工具
#### 1：Spring Cloud OpenFeign
1：[spring-cloud-openfeign Github官网](https://github.com/OpenFeign/feign)  
2：[spring-cloud-openfeign 文档官网](https://docs.spring.io/spring-cloud-openfeign/docs/2.2.5.RELEASE/reference/html/)    

### 二. project module描述
#### 1：lavender-gateway
```
1：lavender-eureka
eureka的服务端，端口：8080。

2：lavender-cloud-gateway
服务网关，端口：8081。

3：lavender-service-provider
服务提供者，端口：8082。
```

#### 2：lavender-nacos
```
1：lavender-nacos-config
基于nacos的配置中心，端口：8083。
1：lavender-nacos-discovery
A：lavender-nacos-discovery-consumer
基于nacos的注册中心，端口：8089。
B：lavender-nacos-discovery-provider-1
基于nacos的注册中心，端口：8090。
C：lavender-nacos-discovery-provider-2
基于nacos的注册中心，端口：8091。

```

#### 3：lavender-consul
```
1：lavender-consul-consumer
基于consul的服务消费者，端口：8084。

2： lavender-consul-provider
基于consul的服务提供者，端口：8085。
```

#### 4：lavender-prometheus
```
监控，端口：8086。
```
#### 5：lavender-config
```
1：lavender-config-client
基于spring-cloud-config的client，端口：8087。
2：lavender-config-server
基于spring-cloud-server的server，端口：8088。
```


## 三：Spring Cloud系列博客
[oschina-1](https://my.oschina.net/13426421702?tab=newest&catalogId=6488687)
