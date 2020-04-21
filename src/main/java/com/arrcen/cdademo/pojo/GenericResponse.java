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

	private static final long serialVersionUID = -9093767692016510561L;
	@ApiModelProperty("响应状态码")
	private int status;

	@ApiModelProperty("提示信息")
	private String message;

	@ApiModelProperty("响应内容")
	private Object data;

	@Override
	public String toString() {
		if(Objects.isNull(this.data)){
			this.setData(new Object());
		}
		return JSON.toJSONString(this);
	}
}
