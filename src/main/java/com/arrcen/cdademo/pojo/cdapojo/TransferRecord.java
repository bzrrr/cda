package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈转科记录〉
 */
@Entity
@Table(name = "PUB13_转科记录")
public class TransferRecord implements Serializable {

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
    private String 转科目的;
    private String 转入诊疗计划;
    private String 中药出院医嘱内容;
    private String 中药煎煮方法;
    private String 中药用药方法;
    private String 注意事项;
    private String 转科记录类型;
    @Transient
    @JsonIgnore
    private String 转科记录类型名称;
    private String 转出日期时间;
    private String 转出科室;
    private String 转出医师签名;
    private String 转入日期时间;
    private String 转入科室;
    private String 转入医师签名;


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

    public String get入院诊断_西医诊断名称() {
        return 入院诊断_西医诊断名称;
    }

    public void set入院诊断_西医诊断名称(String 入院诊断_西医诊断名称) {
        this.入院诊断_西医诊断名称 = 入院诊断_西医诊断名称;
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

    public String get转科目的() {
        return 转科目的;
    }

    public void set转科目的(String 转科目的) {
        this.转科目的 = 转科目的;
    }

    public String get转入诊疗计划() {
        return 转入诊疗计划;
    }

    public void set转入诊疗计划(String 转入诊疗计划) {
        this.转入诊疗计划 = 转入诊疗计划;
    }

    public String get中药出院医嘱内容() {
        return 中药出院医嘱内容;
    }

    public void set中药出院医嘱内容(String 中药出院医嘱内容) {
        this.中药出院医嘱内容 = 中药出院医嘱内容;
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

    public String get注意事项() {
        return 注意事项;
    }

    public void set注意事项(String 注意事项) {
        this.注意事项 = 注意事项;
    }

    public String get转科记录类型() {
        return 转科记录类型;
    }

    public void set转科记录类型(String 转科记录类型) {
        this.转科记录类型 = 转科记录类型;
    }

    public String get转科记录类型名称() {
        return 转科记录类型名称;
    }

    public void set转科记录类型名称(String 转科记录类型名称) {
        this.转科记录类型名称 = 转科记录类型名称;
    }

    public String get转出日期时间() {
        return 转出日期时间;
    }

    public void set转出日期时间(String 转出日期时间) {
        this.转出日期时间 = 转出日期时间;
    }

    public String get转出科室() {
        return 转出科室;
    }

    public void set转出科室(String 转出科室) {
        this.转出科室 = 转出科室;
    }

    public String get转出医师签名() {
        return 转出医师签名;
    }

    public void set转出医师签名(String 转出医师签名) {
        this.转出医师签名 = 转出医师签名;
    }

    public String get转入日期时间() {
        return 转入日期时间;
    }

    public void set转入日期时间(String 转入日期时间) {
        this.转入日期时间 = 转入日期时间;
    }

    public String get转入科室() {
        return 转入科室;
    }

    public void set转入科室(String 转入科室) {
        this.转入科室 = 转入科室;
    }

    public String get转入医师签名() {
        return 转入医师签名;
    }

    public void set转入医师签名(String 转入医师签名) {
        this.转入医师签名 = 转入医师签名;
    }
}
