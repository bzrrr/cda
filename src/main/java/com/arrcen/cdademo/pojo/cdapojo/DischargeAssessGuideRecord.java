package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈出院评估与指导记录〉
 */
@Entity
@Table(name = "PUB08_出院评估与指导记录")
public class DischargeAssessGuideRecord implements Serializable {

    private static final long serialVersionUID = -5233078020479916837L;
    @Id
    private String 系统序号;
    private String 住院号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private String 出院诊断编码;
    @Transient
    @JsonIgnore
    private String 出院诊断名称;
    private String 出院日期时间;
    private String 饮食情况代码;
    @Transient
    @JsonIgnore
    private String 饮食情况;
    private String 自理能力代码;
    @Transient
    @JsonIgnore
    private String 自理能力;
    private String 出院情况;
    private String 离院方式代码;
    @Transient
    @JsonIgnore
    private String 离院方式;
    private String 用药指导;
    private String 饮食指导代码;
    @Transient
    @JsonIgnore
    private String 饮食指导;
    private String 生活方式指导;
    private String 宣教内容;
    private String 复诊指导;
    private String 护士签名;
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

    public String get出院诊断编码() {
        return 出院诊断编码;
    }

    public void set出院诊断编码(String 出院诊断编码) {
        this.出院诊断编码 = 出院诊断编码;
    }

    public String get出院诊断名称() {
        return 出院诊断名称;
    }

    public void set出院诊断名称(String 出院诊断名称) {
        this.出院诊断名称 = 出院诊断名称;
    }

    public String get出院日期时间() {
        return 出院日期时间;
    }

    public void set出院日期时间(String 出院日期时间) {
        this.出院日期时间 = 出院日期时间;
    }

    public String get饮食情况代码() {
        return 饮食情况代码;
    }

    public void set饮食情况代码(String 饮食情况代码) {
        this.饮食情况代码 = 饮食情况代码;
    }

    public String get饮食情况() {
        return 饮食情况;
    }

    public void set饮食情况(String 饮食情况) {
        this.饮食情况 = 饮食情况;
    }

    public String get自理能力代码() {
        return 自理能力代码;
    }

    public void set自理能力代码(String 自理能力代码) {
        this.自理能力代码 = 自理能力代码;
    }

    public String get自理能力() {
        return 自理能力;
    }

    public void set自理能力(String 自理能力) {
        this.自理能力 = 自理能力;
    }

    public String get出院情况() {
        return 出院情况;
    }

    public void set出院情况(String 出院情况) {
        this.出院情况 = 出院情况;
    }

    public String get离院方式代码() {
        return 离院方式代码;
    }

    public void set离院方式代码(String 离院方式代码) {
        this.离院方式代码 = 离院方式代码;
    }

    public String get离院方式() {
        return 离院方式;
    }

    public void set离院方式(String 离院方式) {
        this.离院方式 = 离院方式;
    }

    public String get用药指导() {
        return 用药指导;
    }

    public void set用药指导(String 用药指导) {
        this.用药指导 = 用药指导;
    }

    public String get饮食指导代码() {
        return 饮食指导代码;
    }

    public void set饮食指导代码(String 饮食指导代码) {
        this.饮食指导代码 = 饮食指导代码;
    }

    public String get饮食指导() {
        return 饮食指导;
    }

    public void set饮食指导(String 饮食指导) {
        this.饮食指导 = 饮食指导;
    }

    public String get生活方式指导() {
        return 生活方式指导;
    }

    public void set生活方式指导(String 生活方式指导) {
        this.生活方式指导 = 生活方式指导;
    }

    public String get宣教内容() {
        return 宣教内容;
    }

    public void set宣教内容(String 宣教内容) {
        this.宣教内容 = 宣教内容;
    }

    public String get复诊指导() {
        return 复诊指导;
    }

    public void set复诊指导(String 复诊指导) {
        this.复诊指导 = 复诊指导;
    }

    public String get护士签名() {
        return 护士签名;
    }

    public void set护士签名(String 护士签名) {
        this.护士签名 = 护士签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
