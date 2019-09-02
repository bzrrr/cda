package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈死亡病例讨论记录〉
 */
@Entity
@Table(name = "PUB13_死亡病例讨论记录")
public class DeathCaseDiscussionRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 住院号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 患者姓名;
    private String 性别代码;
    @Transient
    @JsonIgnore
    private String 性别;
    private Byte 年龄岁;
    private String 年龄月;
    private String 讨论日期时间;
    private String 讨论地点;
    private String 主持人姓名;
    private String 参加讨论人员名单;
    private String 专业技术职务类别代码;
    @Transient
    @JsonIgnore
    private String 专业技术职务类别名称;
    private String 直接死亡原因名称;
    private String 直接死亡原因编码;
    private String 死亡诊断名称;
    private String 死亡诊断编码;
    private String 死亡讨论记录;
    private String 主持人总结意见;
    private String 主治医师签名;
    private String 主任医师签名;
    private String 签名日期时间;


    public String get系统序号() {
        return 系统序号;
    }

    public void set系统序号(String 系统序号) {
        this.系统序号 = 系统序号;
    }

    public String get住院号() {
        return 住院号;
    }

    public void set住院号(String 住院号) {
        this.住院号 = 住院号;
    }

    public String get科室名称() {
        return 科室名称;
    }

    public void set科室名称(String 科室名称) {
        this.科室名称 = 科室名称;
    }

    public String get病区名称() {
        return 病区名称;
    }

    public void set病区名称(String 病区名称) {
        this.病区名称 = 病区名称;
    }

    public String get病房号() {
        return 病房号;
    }

    public void set病房号(String 病房号) {
        this.病房号 = 病房号;
    }

    public String get病床号() {
        return 病床号;
    }

    public void set病床号(String 病床号) {
        this.病床号 = 病床号;
    }

    public String get患者姓名() {
        return 患者姓名;
    }

    public void set患者姓名(String 患者姓名) {
        this.患者姓名 = 患者姓名;
    }

    public String get性别代码() {
        return 性别代码;
    }

    public void set性别代码(String 性别代码) {
        this.性别代码 = 性别代码;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public Byte get年龄岁() {
        return 年龄岁;
    }

    public void set年龄岁(Byte 年龄岁) {
        this.年龄岁 = 年龄岁;
    }

    public String get年龄月() {
        return 年龄月;
    }

    public void set年龄月(String 年龄月) {
        this.年龄月 = 年龄月;
    }

    public String get讨论日期时间() {
        return 讨论日期时间;
    }

    public void set讨论日期时间(String 讨论日期时间) {
        this.讨论日期时间 = 讨论日期时间;
    }

    public String get讨论地点() {
        return 讨论地点;
    }

    public void set讨论地点(String 讨论地点) {
        this.讨论地点 = 讨论地点;
    }

    public String get主持人姓名() {
        return 主持人姓名;
    }

    public void set主持人姓名(String 主持人姓名) {
        this.主持人姓名 = 主持人姓名;
    }

    public String get参加讨论人员名单() {
        return 参加讨论人员名单;
    }

    public void set参加讨论人员名单(String 参加讨论人员名单) {
        this.参加讨论人员名单 = 参加讨论人员名单;
    }

    public String get专业技术职务类别代码() {
        return 专业技术职务类别代码;
    }

    public void set专业技术职务类别代码(String 专业技术职务类别代码) {
        this.专业技术职务类别代码 = 专业技术职务类别代码;
    }

    public String get专业技术职务类别名称() {
        return 专业技术职务类别名称;
    }

    public void set专业技术职务类别名称(String 专业技术职务类别名称) {
        this.专业技术职务类别名称 = 专业技术职务类别名称;
    }

    public String get直接死亡原因名称() {
        return 直接死亡原因名称;
    }

    public void set直接死亡原因名称(String 直接死亡原因名称) {
        this.直接死亡原因名称 = 直接死亡原因名称;
    }

    public String get直接死亡原因编码() {
        return 直接死亡原因编码;
    }

    public void set直接死亡原因编码(String 直接死亡原因编码) {
        this.直接死亡原因编码 = 直接死亡原因编码;
    }

    public String get死亡诊断名称() {
        return 死亡诊断名称;
    }

    public void set死亡诊断名称(String 死亡诊断名称) {
        this.死亡诊断名称 = 死亡诊断名称;
    }

    public String get死亡诊断编码() {
        return 死亡诊断编码;
    }

    public void set死亡诊断编码(String 死亡诊断编码) {
        this.死亡诊断编码 = 死亡诊断编码;
    }

    public String get死亡讨论记录() {
        return 死亡讨论记录;
    }

    public void set死亡讨论记录(String 死亡讨论记录) {
        this.死亡讨论记录 = 死亡讨论记录;
    }

    public String get主持人总结意见() {
        return 主持人总结意见;
    }

    public void set主持人总结意见(String 主持人总结意见) {
        this.主持人总结意见 = 主持人总结意见;
    }

    public String get主治医师签名() {
        return 主治医师签名;
    }

    public void set主治医师签名(String 主治医师签名) {
        this.主治医师签名 = 主治医师签名;
    }

    public String get主任医师签名() {
        return 主任医师签名;
    }

    public void set主任医师签名(String 主任医师签名) {
        this.主任医师签名 = 主任医师签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
