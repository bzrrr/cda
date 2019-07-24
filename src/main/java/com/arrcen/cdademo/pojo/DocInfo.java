package com.arrcen.cdademo.pojo;

import lombok.Data;

@Data
public class DocInfo {
	private String docId;//文档流水号标识
	private String effectiveTime;//文档机器生成时间
}
