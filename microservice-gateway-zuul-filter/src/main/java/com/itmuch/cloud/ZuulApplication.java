package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulApplication.class, args);
  }

  @Bean //配置使用zuul过滤器
  public PreZuulFilter preZuulFilter() {
    return new PreZuulFilter();
  }
}

/**
 * http://192.168.3.78:8040/routes 可以看到  {"/microservice-provider-user/**":"microservice-provider-user"} 这就是微服务的请求路径了
 * http://192.168.3.78:8040/microservice-provider-user/simple/1    就可以请求到microservice-provider-user这个微服务的接口了
 */
