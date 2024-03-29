package com.pgy.data.ms.biz.service.feign.controller;

import com.pgy.data.ms.biz.service.feign.api.demo.DemoApi;
import com.pgy.data.ms.biz.service.feign.client.demo.IDemoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ginko
 * @date 2018/12/8 19:03
 */
@RestController
@Slf4j
public class FeignDemoController {

    @Value("${server.port}")
    String port;

    @Resource
    private IDemoClient demoClient;

    @Resource
    private DemoApi demoApi;

    @GetMapping("/demo")
    public String index() {
        log.info("使用feign调用服务");
        return demoClient.index();
    }

    @GetMapping("/hello")
    public String hello(String name) {
        log.info("使用feign调用服务，参数name:{}", name);

        return demoClient.hello(name);
    }

    @GetMapping("/helloApi")
    public String helloApi(String name) {
        log.info("使用feign继承方式调用服务，参数name:{}", name + port);

        return demoApi.helloApi(name);
    }

}
