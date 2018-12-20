package com.pgy.data.ms.biz.sms.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/message/str")
    public String sterew(@Valid @RequestBody TestVo vo) {
        return "=====" + vo.getName();

    }

    @RequestMapping(value = "/message/sendSmsWithVerifyCode", method = RequestMethod.POST)
    public TestPo sendSmsWithVerifyCode(@Valid @RequestBody TestVo vo) {
        return TestPo.builder().name(vo.getName()).build();

    }

    @PostMapping("/message/sendSmsNoVerifyCode")
    public String sendSmsNoVerifyCode(@Valid @RequestBody TestVo vo) {

        return "sendSmsNoVerifyCode" + vo.getName();

    }
}
