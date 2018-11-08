package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //声明这是一个feign的客户端
public class ConsumerMovieFeignApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerMovieFeignApplication.class, args);
  }
}
