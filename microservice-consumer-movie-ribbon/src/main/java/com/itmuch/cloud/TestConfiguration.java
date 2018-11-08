package com.itmuch.cloud;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {
  //  @Autowired
  //  IClientConfig config;

  @Bean
  public IRule ribbonRule() {
    return new RandomRule();
  }
}
/*

@RibbonClient(name = "microservice-provider-user", configuration = TestConfiguration.class)
@RibbonClient 声明客户端负载均衡配置的均衡方式，RandomRule()：代表的是随机请求，默认的是轮询，即是一人一次
name ：代表的是说明那个微服务的均衡方式
configuration ：配置使用哪种方式

*/
