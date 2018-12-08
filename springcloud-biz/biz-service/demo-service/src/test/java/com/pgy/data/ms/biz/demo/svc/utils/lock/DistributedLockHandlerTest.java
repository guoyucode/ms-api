package com.pgy.data.ms.biz.demo.svc.utils.lock;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author ginko
 * @date 2018/12/4 15:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DistributedLockHandlerTest {

    @Resource
    private DistributedLockHandler distributedLockHandler;

    @Test
    public void tryLock() {
        CustomLock lock = new CustomLock("lock", "ginko");
        if (distributedLockHandler.tryLock(lock)) {

            distributedLockHandler.releaseLock(lock);
        }
    }
}