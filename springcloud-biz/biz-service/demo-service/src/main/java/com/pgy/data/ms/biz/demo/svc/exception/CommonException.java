package com.pgy.data.ms.biz.demo.svc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ginko
 * @description 自定义异常类
 * @date 2018/12/10 14:49
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommonException extends RuntimeException {

    private static final long serialVersionUID = -3030344392591938285L;

    String code;
    String msg;

    public CommonException(String code, String msg) {
        super(code + msg);
        this.code = code;
        this.msg = msg;
    }

}