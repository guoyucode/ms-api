package com.pgy.data.ms.biz.sms.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author ginko
 * @date 2018/12/11 19:45
 */
@RestController
@Slf4j
public class SmsController {

    @GetMapping("/message")
    public String test() {
        return "docker-sms-test";

    }

    @PostMapping("/message/sendSmsWithVerifyCode")
    public String sendSmsWithVerifyCode(@Valid @RequestBody TestVo vo) {
        return "sendSmsWithVerifyCode" + vo.getName();

    }

    @PostMapping("/message/sendSmsNoVerifyCode")
    public String sendSmsNoVerifyCode(@Valid @RequestBody TestVo vo) {

        return "sendSmsNoVerifyCode" + vo.getName();

    }
}
