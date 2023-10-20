package com.low.example.lowexample.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
@ApiModel(value = "用户信息实体")
public class UserDto implements Serializable {


    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "消息内容")
    private String phone;


}
