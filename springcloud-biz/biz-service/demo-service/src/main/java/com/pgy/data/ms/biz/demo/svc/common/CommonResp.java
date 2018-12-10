package com.pgy.data.ms.biz.demo.svc.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ginko
 * @date 2018/12/10 15:13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("统一响应实体")
public class CommonResp {

    @ApiModelProperty(name = "code", value = "返回业务接口code", example = "0000")
    private Integer code;

    @ApiModelProperty(name = "msg", value = "返回业务接口msg", example = "success")
    private String msg;

    @ApiModelProperty(name = "data", value = "返回业务接口data", example = "{}")
    private Object data;



}
