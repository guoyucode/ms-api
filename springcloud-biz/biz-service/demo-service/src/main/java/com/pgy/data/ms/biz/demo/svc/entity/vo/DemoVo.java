package com.pgy.data.ms.biz.demo.svc.entity.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author ginko
 * @date 2018/12/8 17:12
 */
@Data
public class DemoVo {

    @NotNull(message = "id不能为空")
    private Long id;
}
