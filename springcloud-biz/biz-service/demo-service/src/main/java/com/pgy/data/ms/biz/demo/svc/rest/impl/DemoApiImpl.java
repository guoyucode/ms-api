package com.pgy.data.ms.biz.demo.svc.rest.impl;

import com.pgy.data.ms.biz.service.api.demo.IDemoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ginko
 * @description 使用接口方式进行接口编写
 */
@RestController
@Slf4j
public class DemoApiImpl implements IDemoApi {

    /**
     * 定义接口
     *
     * @param name
     * @return
     */
    @Override
    public String helloApi(String name) {

        log.info("[demo-service服务[helloApi]使用接口方式进行接口被调用，参数name值为：{}", name);

        return name + ",helloApi调用!";
    }


}
