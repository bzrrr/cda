package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈首次病程记录〉
 */
@Entity
@Table(name = "PUB13_首次病程记录")
public class FirstCourseRecord implements Serializable {

    private static final long serialVersionUID = -8903520695176953725L;
    @Id
    private String 系统序号;
    private String 住院号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 记录日期时间;
    private String 患者姓名;
    private String 性别代码;
    @Transient
    @JsonIgnore
    private String 性别;
    private Byte 年龄岁;
    private String 年龄月;
    private String 主诉;
    private String 病例特点;
    private String 中医四诊观察结果;
    private String 诊断依据;
    private String 初步诊断_西医诊断编码;
    @Transient
    @JsonIgnore
    private String 初步诊断_西医诊断名称;
    private String 初步诊断_中医病名代码;
    @Transient
    @JsonIgnore
    private String 初步诊断_中医病名名称;
    private String 初步诊断_中医证候代码;
    @Transient
    @JsonIgnore
    private String 初步诊断_中医证候名称;
    private String 鉴别诊断_西医诊断名称;
    private String 鉴别诊断_中医病名名称;
    private String 鉴别诊断_中医证候名称;
    private String 诊疗计划;
    private String 治则治法;
    private String 住院医师签名;
    private String 上级医生签名;


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

    public String get记录日期时间() {
        return 记录日期时间;
    }

    public void set记录日期时间(String 记录日期时间) {
        this.记录日期时间 = 记录日期时间;
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

    public String get主诉() {
        return 主诉;
    }

    public void set主诉(String 主诉) {
        this.主诉 = 主诉;
    }

    public String get病例特点() {
        return 病例特点;
    }

    public void set病例特点(String 病例特点) {
        this.病例特点 = 病例特点;
    }

    public String get中医四诊观察结果() {
        return 中医四诊观察结果;
    }

    public void set中医四诊观察结果(String 中医四诊观察结果) {
        this.中医四诊观察结果 = 中医四诊观察结果;
    }

    public String get诊断依据() {
        return 诊断依据;
    }

    public void set诊断依据(String 诊断依据) {
        this.诊断依据 = 诊断依据;
    }

    public String get初步诊断_西医诊断编码() {
        return 初步诊断_西医诊断编码;
    }

    public void set初步诊断_西医诊断编码(String 初步诊断_西医诊断编码) {
        this.初步诊断_西医诊断编码 = 初步诊断_西医诊断编码;
    }

    public String get初步诊断_西医诊断名称() {
        return 初步诊断_西医诊断名称;
    }

    public void set初步诊断_西医诊断名称(String 初步诊断_西医诊断名称) {
        this.初步诊断_西医诊断名称 = 初步诊断_西医诊断名称;
    }

    public String get初步诊断_中医病名代码() {
        return 初步诊断_中医病名代码;
    }

    public void set初步诊断_中医病名代码(String 初步诊断_中医病名代码) {
        this.初步诊断_中医病名代码 = 初步诊断_中医病名代码;
    }

    public String get初步诊断_中医病名名称() {
        return 初步诊断_中医病名名称;
    }

    public void set初步诊断_中医病名名称(String 初步诊断_中医病名名称) {
        this.初步诊断_中医病名名称 = 初步诊断_中医病名名称;
    }

    public String get初步诊断_中医证候代码() {
        return 初步诊断_中医证候代码;
    }

    public void set初步诊断_中医证候代码(String 初步诊断_中医证候代码) {
        this.初步诊断_中医证候代码 = 初步诊断_中医证候代码;
    }

    public String get初步诊断_中医证候名称() {
        return 初步诊断_中医证候名称;
    }

    public void set初步诊断_中医证候名称(String 初步诊断_中医证候名称) {
        this.初步诊断_中医证候名称 = 初步诊断_中医证候名称;
    }

    public String get鉴别诊断_西医诊断名称() {
        return 鉴别诊断_西医诊断名称;
    }

    public void set鉴别诊断_西医诊断名称(String 鉴别诊断_西医诊断名称) {
        this.鉴别诊断_西医诊断名称 = 鉴别诊断_西医诊断名称;
    }

    public String get鉴别诊断_中医病名名称() {
        return 鉴别诊断_中医病名名称;
    }

    public void set鉴别诊断_中医病名名称(String 鉴别诊断_中医病名名称) {
        this.鉴别诊断_中医病名名称 = 鉴别诊断_中医病名名称;
    }

    public String get鉴别诊断_中医证候名称() {
        return 鉴别诊断_中医证候名称;
    }

    public void set鉴别诊断_中医证候名称(String 鉴别诊断_中医证候名称) {
        this.鉴别诊断_中医证候名称 = 鉴别诊断_中医证候名称;
    }

    public String get诊疗计划() {
        return 诊疗计划;
    }

    public void set诊疗计划(String 诊疗计划) {
        this.诊疗计划 = 诊疗计划;
    }

    public String get治则治法() {
        return 治则治法;
    }

    public void set治则治法(String 治则治法) {
        this.治则治法 = 治则治法;
    }

    public String get住院医师签名() {
        return 住院医师签名;
    }

    public void set住院医师签名(String 住院医师签名) {
        this.住院医师签名 = 住院医师签名;
    }

    public String get上级医生签名() {
        return 上级医生签名;
    }

    public void set上级医生签名(String 上级医生签名) {
        this.上级医生签名 = 上级医生签名;
    }
}
