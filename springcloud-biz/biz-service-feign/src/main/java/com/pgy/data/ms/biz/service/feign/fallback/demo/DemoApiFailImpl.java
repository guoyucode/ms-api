package com.pgy.data.ms.biz.service.feign.fallback.demo;

import com.pgy.data.ms.biz.service.api.demo.IDemoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ginko
 * @description 服务发生熔断
 * @date 2018/11/21 14:48
 */
@Component("demoApiFallback")
@Slf4j
public class DemoApiFailImpl implements IDemoApi {

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
