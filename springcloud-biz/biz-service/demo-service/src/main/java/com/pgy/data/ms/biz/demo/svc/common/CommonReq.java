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
@ApiModel("统一请求实体")
public class CommonReq {

    @ApiModelProperty(name = "reqId", value = "reqId", example = "1")
    private String reqId;

}
