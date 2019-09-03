package com.arrcen.cdademo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 医疗费用记录
 */
@Entity
@Table(name = "PUB01_医疗费用记录")
public class MedicalExpenseRecord implements Serializable {

	private static final long serialVersionUID = 2940376239353309819L;
	@Id
	private String 系统序号;
	private String 居民健康卡号;
	private String 门急诊号;
	private String 住院号;
	private String 医疗付费方式代码;
	private String 门诊费用金额;
	private String 住院费用金额;
	private String 个人承担费用金额;
	private String 医疗保险类别代码;


	public String get系统序号() {
		return 系统序号;
	}

	public void set系统序号(String 系统序号) {
		this.系统序号 = 系统序号;
	}


	public String get居民健康卡号() {
		return 居民健康卡号;
	}

	public void set居民健康卡号(String 居民健康卡号) {
		this.居民健康卡号 = 居民健康卡号;
	}


	public String get门急诊号() {
		return 门急诊号;
	}

	public void set门急诊号(String 门急诊号) {
		this.门急诊号 = 门急诊号;
	}


	public String get住院号() {
		return 住院号;
	}

	public void set住院号(String 住院号) {
		this.住院号 = 住院号;
	}


	public String get医疗付费方式代码() {
		return 医疗付费方式代码;
	}

	public void set医疗付费方式代码(String 医疗付费方式代码) {
		this.医疗付费方式代码 = 医疗付费方式代码;
	}


	public String get门诊费用金额() {
		return 门诊费用金额;
	}

	public void set门诊费用金额(String 门诊费用金额) {
		this.门诊费用金额 = 门诊费用金额;
	}


	public String get住院费用金额() {
		return 住院费用金额;
	}

	public void set住院费用金额(String 住院费用金额) {
		this.住院费用金额 = 住院费用金额;
	}


	public String get个人承担费用金额() {
		return 个人承担费用金额;
	}

	public void set个人承担费用金额(String 个人承担费用金额) {
		this.个人承担费用金额 = 个人承担费用金额;
	}

	public String get医疗保险类别代码() {
		return 医疗保险类别代码;
	}

	public void set医疗保险类别代码(String 医疗保险类别代码) {
		this.医疗保险类别代码 = 医疗保险类别代码;
	}
}
