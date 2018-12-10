package com.pgy.data.ms.biz.demo.svc.config.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ginko
 * @description @Primary 多个bean时 此类优先使用,是否开启swagger，正式环境一般是需要关闭的，可根据springboot的多环境配置进行设置
 * @date 2018/11/22 10:00
 */
@EnableSwagger2
@Configuration
@Primary
public class SwaggerConfig {

    @Value(value = "${swagger.enabled}")
    Boolean swaggerEnabled;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                // 是否开启
                .enable(swaggerEnabled).select()
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("com.pgy.data.ms.biz.demo.svc"))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    /**
     * 设置api信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("路由网关(Zuul)：利用swagger2聚合API文档")
                .description("ginko | 银古")
                // 作者信息
                .contact(new Contact("ginko", "https://github.com/wangmeixin", "mushishiginko@qq.com"))
                .version("1.0.0")
                .termsOfServiceUrl("https://github.com/wangmeixin")
                .build();
    }
}