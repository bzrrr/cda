package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈特殊检查治疗同意书〉
 */
@Entity
@Table(name = "PUB09_特殊检查治疗同意书")
public class SpecialExamCureConsent implements Serializable {

    @Id
    private String 系统序号;
    private String 门急诊号;
    private String 住院号;
    private String 知情同意书编号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private String 特殊检查及特殊治疗项目名称;
    private String 特殊检査及特殊治疗目的;
    private String 可能引起的并发症及风险;
    private String 替代方案;
    private String 患者或法定代理人签名;
    private String 法定代理人与患者的关系代码;
    @Transient
    @JsonIgnore
    private String 法定代理人与患者的关系;
    private String 患者或法定代理人签名日期时间;
    private String 医师签名;
    private String 医师签名日期时间;

    //缺少患者意见和医院意见


    public String get系统序号() {
        return 系统序号;
    }

    public void set系统序号(String 系统序号) {
        this.系统序号 = 系统序号;
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

    public String get知情同意书编号() {
        return 知情同意书编号;
    }

    public void set知情同意书编号(String 知情同意书编号) {
        this.知情同意书编号 = 知情同意书编号;
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

    public String get疾病诊断编码() {
        return 疾病诊断编码;
    }

    public void set疾病诊断编码(String 疾病诊断编码) {
        this.疾病诊断编码 = 疾病诊断编码;
    }

    public String get疾病诊断名称() {
        return 疾病诊断名称;
    }

    public void set疾病诊断名称(String 疾病诊断名称) {
        this.疾病诊断名称 = 疾病诊断名称;
    }

    public String get特殊检查及特殊治疗项目名称() {
        return 特殊检查及特殊治疗项目名称;
    }

    public void set特殊检查及特殊治疗项目名称(String 特殊检查及特殊治疗项目名称) {
        this.特殊检查及特殊治疗项目名称 = 特殊检查及特殊治疗项目名称;
    }

    public String get特殊检査及特殊治疗目的() {
        return 特殊检査及特殊治疗目的;
    }

    public void set特殊检査及特殊治疗目的(String 特殊检査及特殊治疗目的) {
        this.特殊检査及特殊治疗目的 = 特殊检査及特殊治疗目的;
    }

    public String get可能引起的并发症及风险() {
        return 可能引起的并发症及风险;
    }

    public void set可能引起的并发症及风险(String 可能引起的并发症及风险) {
        this.可能引起的并发症及风险 = 可能引起的并发症及风险;
    }

    public String get替代方案() {
        return 替代方案;
    }

    public void set替代方案(String 替代方案) {
        this.替代方案 = 替代方案;
    }

    public String get患者或法定代理人签名() {
        return 患者或法定代理人签名;
    }

    public void set患者或法定代理人签名(String 患者或法定代理人签名) {
        this.患者或法定代理人签名 = 患者或法定代理人签名;
    }

    public String get法定代理人与患者的关系代码() {
        return 法定代理人与患者的关系代码;
    }

    public void set法定代理人与患者的关系代码(String 法定代理人与患者的关系代码) {
        this.法定代理人与患者的关系代码 = 法定代理人与患者的关系代码;
    }

    public String get法定代理人与患者的关系() {
        return 法定代理人与患者的关系;
    }

    public void set法定代理人与患者的关系(String 法定代理人与患者的关系) {
        this.法定代理人与患者的关系 = 法定代理人与患者的关系;
    }

    public String get患者或法定代理人签名日期时间() {
        return 患者或法定代理人签名日期时间;
    }

    public void set患者或法定代理人签名日期时间(String 患者或法定代理人签名日期时间) {
        this.患者或法定代理人签名日期时间 = 患者或法定代理人签名日期时间;
    }

    public String get医师签名() {
        return 医师签名;
    }

    public void set医师签名(String 医师签名) {
        this.医师签名 = 医师签名;
    }

    public String get医师签名日期时间() {
        return 医师签名日期时间;
    }

    public void set医师签名日期时间(String 医师签名日期时间) {
        this.医师签名日期时间 = 医师签名日期时间;
    }
}
