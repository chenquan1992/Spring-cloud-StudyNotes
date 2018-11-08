package com.itmuch.cloud.feign;

import org.springframework.stereotype.Component;

import com.itmuch.cloud.entity.User;

/**
 * hystrix的用法，这是down机之后请求的地方
 */
@Component
public class HystrixClientFallback implements UserFeignClient {

  @Override
  public User findById(Long id) {
    User user = new User();
    user.setId(0L);
    return user;
  }
}