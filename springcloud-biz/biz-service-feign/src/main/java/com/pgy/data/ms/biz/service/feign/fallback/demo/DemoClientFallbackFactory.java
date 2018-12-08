package com.pgy.data.ms.biz.service.feign.fallback.demo;

import com.pgy.data.ms.biz.service.feign.client.demo.IDemoClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ginko
 * @date 2018/11/21 14:49
 */
@Component
@Slf4j
public class DemoClientFallbackFactory implements FallbackFactory<IDemoClient> {

    @Resource(name = "demoClientFallback")
    private IDemoClient demoClient;

    @Override
    public IDemoClient create(Throwable cause) {
        log.error("feign调用发生异常，demoClient 触发熔断", cause);
        return demoClient;
    }

}