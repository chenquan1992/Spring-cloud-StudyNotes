package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar  //sidecar的注解，功能：可以整合其他比如PHP，之类的接口
public class SidecarApplication {
  public static void main(String[] args) {
    SpringApplication.run(SidecarApplication.class, args);
  }
}
