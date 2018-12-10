package com.pgy.data.ms.zuul.swagger2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul网关
 * @author ginko
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Slf4j
public class ZuulSwagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulSwagger2Application.class, args);
        log.info("spring-cloud-zuul启动!");
    }
}
