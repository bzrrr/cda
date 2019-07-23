package com.arrcen.cdademo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class Template extends StatusCode {
	@ApiModelProperty("响应内容")
	private String content;

	@ApiModelProperty("响应内容")
	private List<String> contens;
}
