package com.arrcen.cdademo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
/**
 * 医疗机构信息
 */
public class MedicalOrganization implements Serializable{
	private String systemCode;//系统序号
	private String organizationName = "";//医疗机构名称
	private String organizationCode;//医疗机构组织机构代码
	private String organizationTelecom;//医疗机构联系电话
	private String organizationPrincipalName;//医疗机构负责人法人姓名
	private String organizationPrincipalTelecom;//医疗机构负责人联系电话
	private String state = "";//地址_省
	private String 地址_市 = "";//地址_市
	private String county = "";//地址_县
	private String township = "";//地址_乡
	private String streetName = "";//地址_村
	private String houseNumber = "";//地址_门牌号码
	private String postalCode = "";//邮政编码
}
