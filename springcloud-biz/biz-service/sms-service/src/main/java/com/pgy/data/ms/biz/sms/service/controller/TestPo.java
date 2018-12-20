package com.pgy.data.ms.biz.sms.service.controller;

import lombok.Builder;
import lombok.Data;

/**
 * @author ginko
 */
@Data
@Builder
public class TestPo {

    /**
     * 唯一标示
     */
    private Long id;
    /**
     * 编码
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 状态 1启用 0 停用
     */
    private String status;

    /**
     * token
     */
    private String token;


}
