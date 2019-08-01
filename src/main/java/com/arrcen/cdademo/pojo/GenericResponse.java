package com.arrcen.cdademo.pojo;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class GenericResponse implements Serializable{

	@ApiModelProperty("响应状态码")
	private int code;

	@ApiModelProperty("提示信息")
	private String message;

	@ApiModelProperty("响应内容")
	private Object content;

	@Override
	public String toString() {
		if(Objects.isNull(this.content)){
			this.setContent(new Object());
		}
		return JSON.toJSONString(this);
	}
}
