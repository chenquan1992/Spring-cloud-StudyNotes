package com.itmuch.config;

import com.itmuch.cloud.feign.UserFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;

/**
 * @see UserFeignClient feign的配置，使用这个就可以换另一种写法
 */
@Configuration
public class Configuration1 {
  @Bean
  public Contract feignContract() {
    return new feign.Contract.Default();
  }

  @Bean //feign 的日志级别，下面这个好像是所有的都打印，feign的日志就是他的请求，返回之类的日志，还要在application.yml中配置一下
  Logger.Level feignLoggerLevel() {
    return Logger.Level.FULL;
  }
}
