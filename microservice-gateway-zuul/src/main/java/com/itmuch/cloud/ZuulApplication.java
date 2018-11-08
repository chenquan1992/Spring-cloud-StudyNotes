package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //微服务网管，zuul的链接+/routes 就可以看到注册到zuul上的微服务id，就可以通过 zuul的链接+微服务id 请求到该服务的接口
public class ZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulApplication.class, args);
  }
}
