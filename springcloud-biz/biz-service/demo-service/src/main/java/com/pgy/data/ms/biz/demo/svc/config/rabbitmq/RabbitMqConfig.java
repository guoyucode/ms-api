package com.pgy.data.ms.biz.demo.svc.config.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 消息中间件RabbitMQ配置
 * @author: ginko
 * @version: 2018年5月24日 下午3:49:26
 */

@Configuration
public class RabbitMqConfig {

    @Resource
    private ConnectionFactory connectionFactory;

    /**
     * 这是json格式化的一个坑，默认情况下，Jackson 2只能使用公共字段或公共getter方法 - 对所有字段私有或私有包进行序列化的实体将失败
     * 会报错...to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS...
     * 所以这里进行关闭
     *
     * @return
     */
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    /**
     * 定义转换器为json
     *
     * @return
     */
    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter(objectMapper());
    }

    /**
     * 设置转换器
     *
     * @return
     */
    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(jsonMessageConverter());
        return template;
    }

}
