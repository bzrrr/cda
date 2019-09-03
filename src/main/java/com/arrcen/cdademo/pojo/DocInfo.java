package com.arrcen.cdademo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class DocInfo implements Serializable{
	private static final long serialVersionUID = -6345314366589234880L;
	private String docId;//文档流水号标识
	private String effectiveTime;//文档机器生成时间
}
