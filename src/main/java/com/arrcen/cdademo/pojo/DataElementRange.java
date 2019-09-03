package com.arrcen.cdademo.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 卫生数据元值域
 */
@Entity
@Table(name = "PUB_卫生数据元值域")
public class DataElementRange implements Serializable {

	private static final long serialVersionUID = 4445168493220492270L;
	@Id
	private String 系统序号;
	private String OID;
	private String 值域代码;
	private String 值域名称;
	private String 值;
	private String 值含义;
	private String 类别;
	private String 子类别;
	private String 版本;
	private String 备注;

	public String get子类别() {
		return 子类别;
	}

	public void set子类别(String 子类别) {
		this.子类别 = 子类别;
	}

	public String get系统序号() {
		return 系统序号;
	}

	public void set系统序号(String 系统序号) {
		this.系统序号 = 系统序号;
	}

	public String getOID() {
		return OID;
	}

	public void setOID(String OID) {
		this.OID = OID;
	}

	public String get值域代码() {
		return 值域代码;
	}

	public void set值域代码(String 值域代码) {
		this.值域代码 = 值域代码;
	}


	public String get值域名称() {
		return 值域名称;
	}

	public void set值域名称(String 值域名称) {
		this.值域名称 = 值域名称;
	}


	public String get值() {
		return 值;
	}

	public void set值(String 值) {
		this.值 = 值;
	}


	public String get值含义() {
		return 值含义;
	}

	public void set值含义(String 值含义) {
		this.值含义 = 值含义;
	}


	public String get类别() {
		return 类别;
	}

	public void set类别(String 类别) {
		this.类别 = 类别;
	}


	public String get版本() {
		return 版本;
	}

	public void set版本(String 版本) {
		this.版本 = 版本;
	}


	public String get备注() {
		return 备注;
	}

	public void set备注(String 备注) {
		this.备注 = 备注;
	}

}
