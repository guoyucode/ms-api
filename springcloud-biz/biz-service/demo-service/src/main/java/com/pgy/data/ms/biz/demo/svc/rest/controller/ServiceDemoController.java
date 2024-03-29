package com.pgy.data.ms.biz.demo.svc.rest.controller;

import com.pgy.data.ms.biz.demo.svc.entity.po.DemoPo;
import com.pgy.data.ms.biz.demo.svc.entity.vo.DemoVo;
import com.pgy.data.ms.biz.demo.svc.exception.CommonException;
import com.pgy.data.ms.biz.demo.svc.mq.RabbitMqEnum;
import com.pgy.data.ms.biz.demo.svc.mq.RabbitMqSender;
import com.pgy.data.ms.biz.demo.svc.mq.msg.MessageObj;
import com.pgy.data.ms.biz.demo.svc.service.IPgyUserService;
import com.pgy.data.ms.biz.demo.svc.utils.validator.ValidatorUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author ginko
 * @since 2018-12-08
 */
@RestController
@Api(tags = "demo-service服务")
@Slf4j
public class ServiceDemoController {

    @Value("${server.port}")
    String port;

    @Resource
    private IPgyUserService userService;

    @Resource
    private RabbitMqSender rabbitMqSender;

    @GetMapping("")
    public String index() {
        return "service demo!";
    }

    @PostMapping("/user")
    public String user(@Valid @RequestBody(required = false) DemoVo demoVo) {

        return userService.selectById(demoVo.getId()).toString();
    }

    @PostMapping("/shello")
    public DemoPo sHello(@Valid @RequestBody(required = false) DemoVo demoVo) {
        log.info("demoVo:{}", demoVo);

        return DemoPo.builder()
                .code(demoVo.getCode())
                .name(demoVo.getName())
                .remark(demoVo.getRemark())
                .build();
    }

    @GetMapping("/hello")
    @ApiOperation(value = "demo示例")
    public String hello(@RequestParam(value = "name", defaultValue = "ginko") String name) {

        return "Hello " + name + " ,I'm from port:" + port;
    }

    @GetMapping("/demo/ex")
    public String exdemo() {
        throw new CommonException("1001", "发送自定义异常");
    }

    @GetMapping("/demo/valid")
    public String demoValid(@Valid DemoVo req) {
        //手动校验
        ValidatorUtil.validate(req);
        return req.getCode() + "," + req.getName();
    }

    @GetMapping("/demo/mq")
    public void send() {
        MessageObj msgObj = new MessageObj("msg1");
        msgObj.setPassword("123456");
        rabbitMqSender.sendRabbitMqFanout(RabbitMqEnum.RoutingKeyEnum.SYSTEMTIPKEY.getCode(), msgObj);
        rabbitMqSender.sendRabbitMqDirect(RabbitMqEnum.RoutingKeyEnum.EMAILKEY.getCode(), msgObj);
    }

}


