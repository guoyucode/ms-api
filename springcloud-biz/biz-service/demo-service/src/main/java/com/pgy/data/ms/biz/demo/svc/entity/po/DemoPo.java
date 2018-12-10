package com.pgy.data.ms.biz.demo.svc.entity.po;

import com.pgy.data.ms.biz.demo.svc.valid.Constant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ginko
 * @description 响应实体
 * @date 2018/12/10 13:37
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class DemoPo {

    @Constant(message = "version只能为1.0", value = "1.0")
    String version;

    @ApiModelProperty(name = "code", value = "编码", example = "ginko")
    String code;

    @ApiModelProperty(name = "name", value = "名称", example = "银古")
    String name;

    @ApiModelProperty(name = "remark", value = "备注", example = "https://github.com/wangmeixin")
    String remark;

}
