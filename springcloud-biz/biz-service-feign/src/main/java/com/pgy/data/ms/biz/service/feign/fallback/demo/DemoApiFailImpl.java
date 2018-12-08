package com.pgy.data.ms.biz.service.feign.fallback.demo;

import com.pgy.data.ms.biz.service.feign.api.demo.DemoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ginko
 * @description 服务发生熔断
 * @date 2018/11/21 14:48
 */
@Slf4j
@Component
public class DemoApiFailImpl implements DemoApi {

    /**
     * 定义接口
     *
     * @param name
     * @return
     */
    @Override
    public String helloApi(String name) {

        log.error("DemoApi restTemplate调用[helloApi]服务发生熔断，参数name:{}", name);
        return "DemoApi restTemplate调用[helloApi]服务发生熔断，参数name:" + name;
    }
}
