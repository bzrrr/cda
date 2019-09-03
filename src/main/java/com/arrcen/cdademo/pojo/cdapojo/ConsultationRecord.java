package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈会诊记录〉
 */
@Entity
@Table(name = "PUB13_会诊记录")
public class ConsultationRecord implements Serializable {

    private static final long serialVersionUID = 1726341070256342445L;
    @Id
    private String 系统序号;
    private String 电子申请单编号;
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
    private String 病历摘要;
    private String 辅助检查结果;
    private String 中医四诊观察结果;
    private String 西医诊断名称;
    private String 西医诊断编码;
    private String 中医病名名称;
    private String 中医病名代码;
    private String 中医证候名称;
    private String 中医证候代码;
    private String 治则治法;
    private String 诊疗过程名称;
    private String 诊疗过程描述;
    private String 会诊类型;
    private String 会诊原因;
    private String 会诊目的;
    private String 会诊申请医师签名;
    private String 会诊申请科室;
    private String 会诊申请医疗机构名称;
    private String 会诊意见;
    private String 会诊医师签名;
    private String 会诊科室名称;
    private String 会诊医师所在医疗机构名称;
    private String 会诊所在医疗机构名称;
    private String 会诊日期时间;


    public String get系统序号() {
        return 系统序号;
    }

    public void set系统序号(String 系统序号) {
        this.系统序号 = 系统序号;
    }

    public String get电子申请单编号() {
        return 电子申请单编号;
    }

    public void set电子申请单编号(String 电子申请单编号) {
        this.电子申请单编号 = 电子申请单编号;
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

    public String get病历摘要() {
        return 病历摘要;
    }

    public void set病历摘要(String 病历摘要) {
        this.病历摘要 = 病历摘要;
    }

    public String get辅助检查结果() {
        return 辅助检查结果;
    }

    public void set辅助检查结果(String 辅助检查结果) {
        this.辅助检查结果 = 辅助检查结果;
    }

    public String get中医四诊观察结果() {
        return 中医四诊观察结果;
    }

    public void set中医四诊观察结果(String 中医四诊观察结果) {
        this.中医四诊观察结果 = 中医四诊观察结果;
    }

    public String get西医诊断名称() {
        return 西医诊断名称;
    }

    public void set西医诊断名称(String 西医诊断名称) {
        this.西医诊断名称 = 西医诊断名称;
    }

    public String get西医诊断编码() {
        return 西医诊断编码;
    }

    public void set西医诊断编码(String 西医诊断编码) {
        this.西医诊断编码 = 西医诊断编码;
    }

    public String get中医病名名称() {
        return 中医病名名称;
    }

    public void set中医病名名称(String 中医病名名称) {
        this.中医病名名称 = 中医病名名称;
    }

    public String get中医病名代码() {
        return 中医病名代码;
    }

    public void set中医病名代码(String 中医病名代码) {
        this.中医病名代码 = 中医病名代码;
    }

    public String get中医证候名称() {
        return 中医证候名称;
    }

    public void set中医证候名称(String 中医证候名称) {
        this.中医证候名称 = 中医证候名称;
    }

    public String get中医证候代码() {
        return 中医证候代码;
    }

    public void set中医证候代码(String 中医证候代码) {
        this.中医证候代码 = 中医证候代码;
    }

    public String get治则治法() {
        return 治则治法;
    }

    public void set治则治法(String 治则治法) {
        this.治则治法 = 治则治法;
    }

    public String get诊疗过程名称() {
        return 诊疗过程名称;
    }

    public void set诊疗过程名称(String 诊疗过程名称) {
        this.诊疗过程名称 = 诊疗过程名称;
    }

    public String get诊疗过程描述() {
        return 诊疗过程描述;
    }

    public void set诊疗过程描述(String 诊疗过程描述) {
        this.诊疗过程描述 = 诊疗过程描述;
    }

    public String get会诊类型() {
        return 会诊类型;
    }

    public void set会诊类型(String 会诊类型) {
        this.会诊类型 = 会诊类型;
    }

    public String get会诊原因() {
        return 会诊原因;
    }

    public void set会诊原因(String 会诊原因) {
        this.会诊原因 = 会诊原因;
    }

    public String get会诊目的() {
        return 会诊目的;
    }

    public void set会诊目的(String 会诊目的) {
        this.会诊目的 = 会诊目的;
    }

    public String get会诊申请医师签名() {
        return 会诊申请医师签名;
    }

    public void set会诊申请医师签名(String 会诊申请医师签名) {
        this.会诊申请医师签名 = 会诊申请医师签名;
    }

    public String get会诊申请科室() {
        return 会诊申请科室;
    }

    public void set会诊申请科室(String 会诊申请科室) {
        this.会诊申请科室 = 会诊申请科室;
    }

    public String get会诊申请医疗机构名称() {
        return 会诊申请医疗机构名称;
    }

    public void set会诊申请医疗机构名称(String 会诊申请医疗机构名称) {
        this.会诊申请医疗机构名称 = 会诊申请医疗机构名称;
    }

    public String get会诊意见() {
        return 会诊意见;
    }

    public void set会诊意见(String 会诊意见) {
        this.会诊意见 = 会诊意见;
    }

    public String get会诊医师签名() {
        return 会诊医师签名;
    }

    public void set会诊医师签名(String 会诊医师签名) {
        this.会诊医师签名 = 会诊医师签名;
    }

    public String get会诊科室名称() {
        return 会诊科室名称;
    }

    public void set会诊科室名称(String 会诊科室名称) {
        this.会诊科室名称 = 会诊科室名称;
    }

    public String get会诊医师所在医疗机构名称() {
        return 会诊医师所在医疗机构名称;
    }

    public void set会诊医师所在医疗机构名称(String 会诊医师所在医疗机构名称) {
        this.会诊医师所在医疗机构名称 = 会诊医师所在医疗机构名称;
    }

    public String get会诊所在医疗机构名称() {
        return 会诊所在医疗机构名称;
    }

    public void set会诊所在医疗机构名称(String 会诊所在医疗机构名称) {
        this.会诊所在医疗机构名称 = 会诊所在医疗机构名称;
    }

    public String get会诊日期时间() {
        return 会诊日期时间;
    }

    public void set会诊日期时间(String 会诊日期时间) {
        this.会诊日期时间 = 会诊日期时间;
    }
}
