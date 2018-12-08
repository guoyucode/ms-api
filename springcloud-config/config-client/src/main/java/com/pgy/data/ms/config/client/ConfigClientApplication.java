package com.pgy.data.ms.config.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * SpringCloud Config client
 * @author ginko
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
        log.info("spring-cloud-config-client启动!");

    }
}
