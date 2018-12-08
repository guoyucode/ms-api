package com.pgy.data.ms.dashboard;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hystrix监控面板
 * @author ginko
 */
@SpringBootApplication
@EnableHystrixDashboard
@Slf4j
public class DashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class, args);
        log.info("spring-cloud-hystrix-dashboard启动!");
    }
}
