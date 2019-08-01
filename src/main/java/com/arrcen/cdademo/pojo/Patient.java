package com.arrcen.cdademo.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 患者基本信息
 */
@Entity
@Table(name = "PUB01_患者基本信息")
public class Patient implements Serializable{

	@Id
	private String 系统序号;
	private String 城乡居民健康档案编号;
	private String 患者身份证件号码;
	private String 身份证件类别代码;
	private String 居民健康卡号;
	private String 医疗保险类别代码;
	private String 患者姓名;
	private String 出生日期;
	private String 性别代码;
	@Transient
	private String 性别;
	private String 婚姻状况代码;
	@Transient
	private String 婚姻状况;
	private String 民族;
	@Transient
	private String 民族名称;
	private String 职业类别代码;
	@Transient
	private String 职业类别;
	private String 工作单位名称;
	private String 工作单位电话号码;
	private String 地址类别代码;
	private String 地址_省;
	private String 地址_市;
	private String 地址_县;
	private String 地址_乡;
	private String 地址_村;
	private String 地址_门牌号码;
	private String 邮政编码;
	private String 患者电话号码;
	private String 联系人姓名;
	private String 联系人电话号码;
	private String 建档日期时间;
	private String 建档医疗机构组织机构;
	private String 建档者姓名;
	private String 建档者序号;

	public String get建档者序号() {
		return 建档者序号;
	}

	public void set建档者序号(String 建档者序号) {
		this.建档者序号 = 建档者序号;
	}

	public String get职业类别() {
		return 职业类别;
	}

	public void set职业类别(String 职业类别) {
		this.职业类别 = 职业类别;
	}

	public String get性别() {
		return 性别;
	}

	public void set性别(String 性别) {
		this.性别 = 性别;
	}

	public String get民族名称() {
		return 民族名称;
	}

	public void set民族名称(String 民族名称) {
		this.民族名称 = 民族名称;
	}

	public String get婚姻状况() {
		return 婚姻状况;
	}

	public void set婚姻状况(String 婚姻状况) {
		this.婚姻状况 = 婚姻状况;
	}

	public String get系统序号() {
		return 系统序号;
	}

	public void set系统序号(String 系统序号) {
		this.系统序号 = 系统序号;
	}


	public String get城乡居民健康档案编号() {
		return 城乡居民健康档案编号;
	}

	public void set城乡居民健康档案编号(String 城乡居民健康档案编号) {
		this.城乡居民健康档案编号 = 城乡居民健康档案编号;
	}


	public String get患者身份证件号码() {
		return 患者身份证件号码;
	}

	public void set患者身份证件号码(String 患者身份证件号码) {
		this.患者身份证件号码 = 患者身份证件号码;
	}


	public String get身份证件类别代码() {
		return 身份证件类别代码;
	}

	public void set身份证件类别代码(String 身份证件类别代码) {
		this.身份证件类别代码 = 身份证件类别代码;
	}


	public String get居民健康卡号() {
		return 居民健康卡号;
	}

	public void set居民健康卡号(String 居民健康卡号) {
		this.居民健康卡号 = 居民健康卡号;
	}


	public String get医疗保险类别代码() {
		return 医疗保险类别代码;
	}

	public void set医疗保险类别代码(String 医疗保险类别代码) {
		this.医疗保险类别代码 = 医疗保险类别代码;
	}


	public String get患者姓名() {
		return 患者姓名;
	}

	public void set患者姓名(String 患者姓名) {
		this.患者姓名 = 患者姓名;
	}


	public String get出生日期() {
		return 出生日期;
	}

	public void set出生日期(String 出生日期) {
		this.出生日期 = 出生日期;
	}


	public String get性别代码() {
		return 性别代码;
	}

	public void set性别代码(String 性别代码) {
		this.性别代码 = 性别代码;
	}


	public String get婚姻状况代码() {
		return 婚姻状况代码;
	}

	public void set婚姻状况代码(String 婚姻状况代码) {
		this.婚姻状况代码 = 婚姻状况代码;
	}


	public String get民族() {
		return 民族;
	}

	public void set民族(String 民族) {
		this.民族 = 民族;
	}


	public String get职业类别代码() {
		return 职业类别代码;
	}

	public void set职业类别代码(String 职业类别代码) {
		this.职业类别代码 = 职业类别代码;
	}


	public String get工作单位名称() {
		return 工作单位名称;
	}

	public void set工作单位名称(String 工作单位名称) {
		this.工作单位名称 = 工作单位名称;
	}


	public String get工作单位电话号码() {
		return 工作单位电话号码;
	}

	public void set工作单位电话号码(String 工作单位电话号码) {
		this.工作单位电话号码 = 工作单位电话号码;
	}


	public String get地址类别代码() {
		return 地址类别代码;
	}

	public void set地址类别代码(String 地址类别代码) {
		this.地址类别代码 = 地址类别代码;
	}


	public String get地址_省() {
		return 地址_省;
	}

	public void set地址_省(String 地址_省) {
		this.地址_省 = 地址_省;
	}


	public String get地址_市() {
		return 地址_市;
	}

	public void set地址_市(String 地址_市) {
		this.地址_市 = 地址_市;
	}


	public String get地址_县() {
		return 地址_县;
	}

	public void set地址_县(String 地址_县) {
		this.地址_县 = 地址_县;
	}


	public String get地址_乡() {
		return 地址_乡;
	}

	public void set地址_乡(String 地址_乡) {
		this.地址_乡 = 地址_乡;
	}


	public String get地址_村() {
		return 地址_村;
	}

	public void set地址_村(String 地址_村) {
		this.地址_村 = 地址_村;
	}


	public String get地址_门牌号码() {
		return 地址_门牌号码;
	}

	public void set地址_门牌号码(String 地址_门牌号码) {
		this.地址_门牌号码 = 地址_门牌号码;
	}


	public String get邮政编码() {
		return 邮政编码;
	}

	public void set邮政编码(String 邮政编码) {
		this.邮政编码 = 邮政编码;
	}


	public String get患者电话号码() {
		return 患者电话号码;
	}

	public void set患者电话号码(String 患者电话号码) {
		this.患者电话号码 = 患者电话号码;
	}


	public String get联系人姓名() {
		return 联系人姓名;
	}

	public void set联系人姓名(String 联系人姓名) {
		this.联系人姓名 = 联系人姓名;
	}


	public String get联系人电话号码() {
		return 联系人电话号码;
	}

	public void set联系人电话号码(String 联系人电话号码) {
		this.联系人电话号码 = 联系人电话号码;
	}


	public String get建档日期时间() {
		return 建档日期时间;
	}

	public void set建档日期时间(String 建档日期时间) {
		this.建档日期时间 = 建档日期时间;
	}


	public String get建档医疗机构组织机构() {
		return 建档医疗机构组织机构;
	}

	public void set建档医疗机构组织机构(String 建档医疗机构组织机构) {
		this.建档医疗机构组织机构 = 建档医疗机构组织机构;
	}


	public String get建档者姓名() {
		return 建档者姓名;
	}

	public void set建档者姓名(String 建档者姓名) {
		this.建档者姓名 = 建档者姓名;
	}

}
