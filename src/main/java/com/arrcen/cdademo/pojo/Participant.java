package com.arrcen.cdademo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
/**
 * 联系人信息
 */
public class Participant implements Serializable {
	private String state = "";//地址_省
	private String 地址_市 = "";//地址_市
	private String county = "";//地址_县
	private String township = "";//地址_乡
	private String streetName = "";//地址_村
	private String houseNumber = "";//地址_门牌号码
	private String postalCode = "";//邮政编码
	private String participantTelecom;//联系人电话号码
	private String participantName;//联系人姓名

}
