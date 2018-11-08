package com.itmuch.cloud;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreZuulFilter extends ZuulFilter {
  private static final Logger LOGGER = LoggerFactory.getLogger(PreZuulFilter.class);

  @Override //这个是说你确定要用这个过滤器？false就是不使用这个过滤器
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() { //过滤器的具体逻辑
    HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
    String host = request.getRemoteHost();
    PreZuulFilter.LOGGER.info("请求的host:{}", host);
    return null;
  }

  @Override //过滤器的类型，这个有多种，自己去了解
  public String filterType() {
    return "pre";
  }

  @Override //执行顺序
  public int filterOrder() {
    return 1;
  }

}
