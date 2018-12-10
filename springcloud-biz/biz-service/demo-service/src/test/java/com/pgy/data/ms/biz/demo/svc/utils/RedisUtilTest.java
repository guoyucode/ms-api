package com.pgy.data.ms.biz.demo.svc.utils;

import com.pgy.data.ms.biz.demo.svc.utils.redis.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ginko
 * @description redis
 * @date 2018/11/22 13:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisUtilTest {

    @Autowired
    RedisUtil redisUtil;


    @Test
    public void redis() {

        redisUtil.setValue("Lettuce Redis", "ginko");
        Object cache = redisUtil.getValue("Lettuce Redis");

        redisUtil.delKey("Lettuce Redis");
        System.out.println(cache);
    }
}