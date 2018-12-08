package com.pgy.data.ms.biz.service.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @author ginko
 * @description 服务消费者
 */
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
@SpringBootApplication
public class BizServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizServiceFeignApplication.class, args);
        log.info("BizServiceFeign 服务消费者启动... ");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
