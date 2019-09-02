package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈阶段小结〉
 */
@Entity
@Table(name = "PUB13_阶段小结")
public class StageSummary implements Serializable {

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
    private String 入院日期时间;
    private String 小结日期时间;
    private String 主诉;
    private String 入院情况;
    private String 中医四诊观察结果;
    private String 入院诊断_西医诊断编码;
    @Transient
    @JsonIgnore
    private String 入院诊断_西医诊断名称;
    private String 入院诊断_中医病名代码;
    @Transient
    @JsonIgnore
    private String 入院诊断_中医病名名称;
    private String 入院诊断_中医证候代码;
    @Transient
    @JsonIgnore
    private String 入院诊断_中医证候名称;
    private String 治则治法;
    private String 中药煎煮方法;
    private String 中药用药方法;
    private String 医嘱内容;
    private String 诊疗过程描述;
    private String 目前情况;
    private String 目前诊断_西医诊断编码;
    @Transient
    @JsonIgnore
    private String 目前诊断_西医诊断名称;
    private String 目前诊断_中医病名代码;
    @Transient
    @JsonIgnore
    private String 目前诊断_中医病名名称;
    private String 目前诊断_中医证候代码;
    @Transient
    @JsonIgnore
    private String 目前诊断_中医证候名称;
    private String 今后治疗方案;
    private String 医师签名;
    private String 签名日期时间;

    public String get入院诊断_西医诊断名称() {
        return 入院诊断_西医诊断名称;
    }

    public void set入院诊断_西医诊断名称(String 入院诊断_西医诊断名称) {
        this.入院诊断_西医诊断名称 = 入院诊断_西医诊断名称;
    }

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

    public String get入院日期时间() {
        return 入院日期时间;
    }

    public void set入院日期时间(String 入院日期时间) {
        this.入院日期时间 = 入院日期时间;
    }

    public String get小结日期时间() {
        return 小结日期时间;
    }

    public void set小结日期时间(String 小结日期时间) {
        this.小结日期时间 = 小结日期时间;
    }

    public String get主诉() {
        return 主诉;
    }

    public void set主诉(String 主诉) {
        this.主诉 = 主诉;
    }

    public String get入院情况() {
        return 入院情况;
    }

    public void set入院情况(String 入院情况) {
        this.入院情况 = 入院情况;
    }

    public String get中医四诊观察结果() {
        return 中医四诊观察结果;
    }

    public void set中医四诊观察结果(String 中医四诊观察结果) {
        this.中医四诊观察结果 = 中医四诊观察结果;
    }

    public String get入院诊断_西医诊断编码() {
        return 入院诊断_西医诊断编码;
    }

    public void set入院诊断_西医诊断编码(String 入院诊断_西医诊断编码) {
        this.入院诊断_西医诊断编码 = 入院诊断_西医诊断编码;
    }

    public String get入院诊断_中医病名代码() {
        return 入院诊断_中医病名代码;
    }

    public void set入院诊断_中医病名代码(String 入院诊断_中医病名代码) {
        this.入院诊断_中医病名代码 = 入院诊断_中医病名代码;
    }

    public String get入院诊断_中医病名名称() {
        return 入院诊断_中医病名名称;
    }

    public void set入院诊断_中医病名名称(String 入院诊断_中医病名名称) {
        this.入院诊断_中医病名名称 = 入院诊断_中医病名名称;
    }

    public String get入院诊断_中医证候代码() {
        return 入院诊断_中医证候代码;
    }

    public void set入院诊断_中医证候代码(String 入院诊断_中医证候代码) {
        this.入院诊断_中医证候代码 = 入院诊断_中医证候代码;
    }

    public String get入院诊断_中医证候名称() {
        return 入院诊断_中医证候名称;
    }

    public void set入院诊断_中医证候名称(String 入院诊断_中医证候名称) {
        this.入院诊断_中医证候名称 = 入院诊断_中医证候名称;
    }

    public String get治则治法() {
        return 治则治法;
    }

    public void set治则治法(String 治则治法) {
        this.治则治法 = 治则治法;
    }

    public String get中药煎煮方法() {
        return 中药煎煮方法;
    }

    public void set中药煎煮方法(String 中药煎煮方法) {
        this.中药煎煮方法 = 中药煎煮方法;
    }

    public String get中药用药方法() {
        return 中药用药方法;
    }

    public void set中药用药方法(String 中药用药方法) {
        this.中药用药方法 = 中药用药方法;
    }

    public String get医嘱内容() {
        return 医嘱内容;
    }

    public void set医嘱内容(String 医嘱内容) {
        this.医嘱内容 = 医嘱内容;
    }

    public String get诊疗过程描述() {
        return 诊疗过程描述;
    }

    public void set诊疗过程描述(String 诊疗过程描述) {
        this.诊疗过程描述 = 诊疗过程描述;
    }

    public String get目前情况() {
        return 目前情况;
    }

    public void set目前情况(String 目前情况) {
        this.目前情况 = 目前情况;
    }

    public String get目前诊断_西医诊断编码() {
        return 目前诊断_西医诊断编码;
    }

    public void set目前诊断_西医诊断编码(String 目前诊断_西医诊断编码) {
        this.目前诊断_西医诊断编码 = 目前诊断_西医诊断编码;
    }

    public String get目前诊断_西医诊断名称() {
        return 目前诊断_西医诊断名称;
    }

    public void set目前诊断_西医诊断名称(String 目前诊断_西医诊断名称) {
        this.目前诊断_西医诊断名称 = 目前诊断_西医诊断名称;
    }

    public String get目前诊断_中医病名代码() {
        return 目前诊断_中医病名代码;
    }

    public void set目前诊断_中医病名代码(String 目前诊断_中医病名代码) {
        this.目前诊断_中医病名代码 = 目前诊断_中医病名代码;
    }

    public String get目前诊断_中医病名名称() {
        return 目前诊断_中医病名名称;
    }

    public void set目前诊断_中医病名名称(String 目前诊断_中医病名名称) {
        this.目前诊断_中医病名名称 = 目前诊断_中医病名名称;
    }

    public String get目前诊断_中医证候代码() {
        return 目前诊断_中医证候代码;
    }

    public void set目前诊断_中医证候代码(String 目前诊断_中医证候代码) {
        this.目前诊断_中医证候代码 = 目前诊断_中医证候代码;
    }

    public String get目前诊断_中医证候名称() {
        return 目前诊断_中医证候名称;
    }

    public void set目前诊断_中医证候名称(String 目前诊断_中医证候名称) {
        this.目前诊断_中医证候名称 = 目前诊断_中医证候名称;
    }

    public String get今后治疗方案() {
        return 今后治疗方案;
    }

    public void set今后治疗方案(String 今后治疗方案) {
        this.今后治疗方案 = 今后治疗方案;
    }

    public String get医师签名() {
        return 医师签名;
    }

    public void set医师签名(String 医师签名) {
        this.医师签名 = 医师签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
