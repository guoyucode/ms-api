package com.pgy.data.ms.biz.demo.svc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者示例 -eureka客户端
 *
 * @author ginko
 * @date 2018-12-8 16:26:22
 */
@EnableRabbit
@SpringBootApplication
//注意这里也可使用@EnableEurekaClient
//但由于springcloud是灵活的，注册中心支持eureka、consul、zookeeper等
//若写了具体的注册中心注解，则当替换成其他注册中心时，又需要替换成对应的注解了。
//所以 直接使用@EnableDiscoveryClient 启动发现。
//这样在替换注册中心时，只需要替换相关依赖即可。
@EnableDiscoveryClient
@Slf4j
public class DemoServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoServiceApplication.class, args);
        log.info("服务提供者示例(eureka客户端)service-demo启动!");
    }
}
