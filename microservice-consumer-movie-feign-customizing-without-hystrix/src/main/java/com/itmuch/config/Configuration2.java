package com.itmuch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;

/**
 * 这是feign的配置
 */
@Configuration
public class Configuration2 {
  @Bean
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
    return new BasicAuthRequestInterceptor("user", "password123");
  }

  @Bean
  @Scope("prototype")//默认支持hystrix，这里设置不支持
  public Feign.Builder feignBuilder() {
    return Feign.builder();
  }
}
