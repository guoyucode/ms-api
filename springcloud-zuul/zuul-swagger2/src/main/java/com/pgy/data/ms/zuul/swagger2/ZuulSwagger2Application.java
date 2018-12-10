package com.pgy.data.ms.zuul.swagger2;

import com.pgy.data.ms.zuul.swagger2.fallback.DemoServiceFallback;
import com.pgy.data.ms.zuul.swagger2.filter.AccessZuulFilter;
import com.pgy.data.ms.zuul.swagger2.filter.CustomErrorFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

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

    @Bean
    public AccessZuulFilter accessZuulFilter() {
        return new AccessZuulFilter();
    }

    @Bean
    public DemoServiceFallback eurekaClientFallback() {
        return new DemoServiceFallback();
    }

    @Bean
    @ConditionalOnProperty(name="zuul.SendErrorFilter.error.disable")
    public CustomErrorFilter customErrorFilter() {
        return new CustomErrorFilter();
    }

}
