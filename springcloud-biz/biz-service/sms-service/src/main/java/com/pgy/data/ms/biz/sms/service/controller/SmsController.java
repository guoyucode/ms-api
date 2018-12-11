package com.pgy.data.ms.biz.sms.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ginko
 * @date 2018/12/11 19:45
 */
@RestController
@Slf4j
public class SmsController {

    @GetMapping("/test")
    public String test() {
        return "docker-sms-test";

    }
}
