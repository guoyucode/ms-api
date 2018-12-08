package com.pgy.data.ms.biz.service.feign.client.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ginko
 * @description FeignClient Demo
 * @date 2018/12/8 18:59
 */
@FeignClient(name = "demo-service")
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
    public String hello(@RequestParam("name")String name);

}
