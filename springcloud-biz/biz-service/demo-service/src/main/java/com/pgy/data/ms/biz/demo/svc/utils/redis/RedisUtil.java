package com.pgy.data.ms.biz.demo.svc.utils.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


/**
 * @author ginko
 */
@Service("redisUtil")
public class RedisUtil {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void setValue(String key, Object value) {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        vo.set(key, value);
    }

    public void setValue(String key, Object value, long timeout) {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        vo.set(key, value, timeout, TimeUnit.MILLISECONDS);
    }

    public Object getValue(String key) {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

    public boolean delKey(String key) {
        return redisTemplate.delete(key);

    }


}