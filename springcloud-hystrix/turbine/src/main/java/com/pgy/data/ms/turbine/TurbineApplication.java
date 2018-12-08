package com.pgy.data.ms.turbine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * hystrix-turbine
 * @author ginko
 */
@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
@Slf4j
public class TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
        log.info("spring-cloud-hystrix-turbine启动!");

    }
}
