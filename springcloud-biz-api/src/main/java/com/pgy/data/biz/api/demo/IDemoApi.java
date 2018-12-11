package com.pgy.data.biz.api.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ginko
 * @date 2018/12/8 21:45
 */
public interface IDemoApi {
    /**
     * 定义提供者服务名
     */
    public static final String SERVICE_NAME = "demo-service-dev";

    /**
     * 定义接口
     * @param name
     * @return
     */
    @GetMapping(value="/helloApi")
    public String helloApi(@RequestParam("name") String name);
}