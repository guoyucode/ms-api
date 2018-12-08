package com.pgy.data.ms.biz.service.feign.client.demo;

import com.pgy.data.ms.biz.service.feign.fallback.demo.DemoClientFailImpl;
import com.pgy.data.ms.biz.service.feign.fallback.demo.DemoClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ginko
 * @description Feign实例
 * fallback就是一个接口的实现类，当发送异常时，会调用此接口实现类进行服务调用。
 * 而FallbackFactory是也是一个接口实现类，需要实现feign.hystrix.FallbackFactory<T>接口，在发生熔断时，调用create方法，同时返回被调用接口的实现类，以便进行fallback处理。
 * 优先调用fallback，fallbackFactory不进行调用了.
 * @date 2018/11/21 13:15
 */
@FeignClient(name = "demo-service", fallbackFactory = DemoClientFallbackFactory.class)
public interface IDemoClient {

    /**
     * 定义接口
     *
     * @return
     */
    @GetMapping(value = "/")
    public String index();

    /**
     * 定义接口
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hello")
    public String hello(@RequestParam("name") String name);

}
