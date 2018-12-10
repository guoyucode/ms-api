package com.pgy.data.ms.zuul.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * zuul 内部提供对外服务示例
 *
 * @author ginko
 */
@RestController
@RequestMapping("/demo")
@Api(tags = "zuul内部rest api")
public class DemoZuulController {

    @GetMapping("/zuulhello")
    @ApiOperation(value = "demo示例", notes = "demo示例")
    @ApiImplicitParam(name = "name", value = "名称", example = "oKong")
    public String zHello(String name) {
        return "hi," + name + ",this is zuul api! ";
    }
}
