package com.pgy.data.ms.biz.demo.svc.utils.lock;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ginko
 * @description 全局锁，包括锁的名称
 * @date 2018/12/4 15:31
 */
@Data
@AllArgsConstructor
public class CustomLock {

    private String name;
    private String value;

}
