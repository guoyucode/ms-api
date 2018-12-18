package com.pgy.data.ms.biz.service.feign.fallback.demo;

import com.pgy.data.ms.biz.service.feign.client.demo.IDemoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ginko
 * @description 类模式
 * @date 2018/12/8 23:03
 */
@Component("demoClientFallback")
@Slf4j
public class DemoClientFailImpl implements IDemoClient {

    /**
     * 定义接口
     *
     * @return
     */
    @Override
    public String index() {
        log.error("DemoClient restTemplate调用[hello]服务发生熔断");
        return "DemoClient restTemplate调用[hello]服务发生熔断";
    }

    /**
     * 定义接口
     *
     * @param name
     * @return
     */
    @Override
    public String hello(String name) {
        log.error("DemoClient restTemplate调用[hello]服务发生熔断，参数name:{}", name);
        return "DemoClient restTemplate调用[hello]服务发生熔断，参数name:" + name;
    }
}
