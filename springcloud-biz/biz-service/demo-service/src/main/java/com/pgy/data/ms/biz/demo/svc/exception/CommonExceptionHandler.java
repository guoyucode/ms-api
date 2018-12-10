package com.pgy.data.ms.biz.demo.svc.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ginko
 * @description 全局的统一异常处理类
 * @date 2018/12/10 14:45
 */
@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    /**
     * 拦截Exception类的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(Exception e) {
        Map<String, Object> result = new HashMap<>(2);
        result.put("respCode", "9999");
        result.put("respMsg", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result;
    }

    /**
     * 拦截 CommonException 的异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(CommonException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(CommonException ex) {
        log.info("CommonException：{}({})", ex.getMsg(), ex.getCode());
        Map<String, Object> result = new HashMap<>(2);
        result.put("respCode", ex.getCode());
        result.put("respMsg", ex.getMsg());
        return result;
    }
}