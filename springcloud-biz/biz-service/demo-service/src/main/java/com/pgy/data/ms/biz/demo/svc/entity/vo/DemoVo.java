package com.pgy.data.ms.biz.demo.svc.entity.vo;

import com.pgy.data.ms.biz.demo.svc.valid.Constant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author ginko
 * @date 2018/12/8 17:12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class DemoVo {

    @ApiModelProperty(name = "code", value = "编码", example = "ginko")
    String code;

    @ApiModelProperty(name = "name", value = "名称", example = "银古")
    String name;

    @ApiModelProperty(name = "remark", value = "备注", example = "https://github.com/wangmeixin")
    String remark;

    @Constant(message = "version只能为1.0", value = "1.0")
    String version;

    @NotNull(message = "id不能为空")
    @ApiModelProperty(name = "id", value = "ID", example = "1")
    private Long id;
}
