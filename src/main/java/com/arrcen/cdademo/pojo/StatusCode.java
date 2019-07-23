package com.arrcen.cdademo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class StatusCode implements Serializable {
	@ApiModelProperty("响应状态码")
	private String status;
	@ApiModelProperty("响应状态描述")
	private String message;
}
