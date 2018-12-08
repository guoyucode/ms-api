package com.pgy.data.ms.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ginko
 * @date 2018/12/9 2:13
 */
@RestController
public class DemoConfigController {

    @Value("${config}")
    String config;

    @GetMapping("/config")
    public String demo() {
        return "返回的config参数值为:" + config;
    }

}
