package com.itmuch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class Configuration2 {
  @Bean
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {//这个是直接使用url请求，可以输入eureka密码的
    return new BasicAuthRequestInterceptor("user", "password123");
  }
}
