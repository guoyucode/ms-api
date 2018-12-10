package com.pgy.data.ms.biz.demo.svc.mq.msg;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ginko
 * @description 消息类
 * @date 2018/12/10 16:38
 */
@Data
@AllArgsConstructor
public class MessageObj implements Serializable {

    private static final long serialVersionUID = 8849109943030950132L;

    private String username;
    private String password;

    public MessageObj(String username) {
        this.username = username;
    }

}
