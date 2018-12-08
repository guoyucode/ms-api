package com.pgy.data.ms.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ginko
 * @RefreshScope 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
 * @date 2018/12/9 2:13
 */
@RestController
@RefreshScope
public class DemoConfigController {

    @Value("${config}")
    String config;

    @GetMapping("/config")
    public String demo() {
        return "返回的config参数值为:" + config;
    }

}
