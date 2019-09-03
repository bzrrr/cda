package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈出入量记录〉
 */
@Entity
@Table(name = "PUB07_出入量记录")
public class InOutRecord implements Serializable {

    private static final long serialVersionUID = -1867370142195987602L;
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
    private Long 体重;
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private String 护理等级代码;
    @Transient
    @JsonIgnore
    private String 护理等级;
    private String 护理类型代码;
    @Transient
    @JsonIgnore
    private String 护理类型;
    private String 护理观察结果;
    private String 护理操作项目类目名称;
    private String 护理操作名称;
    private String 护理操作结果;
    private String 记录日期时间;
    private String 呕吐标志;
    private String 排尿困难标志;
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

    public Long get体重() {
        return 体重;
    }

    public void set体重(Long 体重) {
        this.体重 = 体重;
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

    public String get护理等级代码() {
        return 护理等级代码;
    }

    public void set护理等级代码(String 护理等级代码) {
        this.护理等级代码 = 护理等级代码;
    }

    public String get护理等级() {
        return 护理等级;
    }

    public void set护理等级(String 护理等级) {
        this.护理等级 = 护理等级;
    }

    public String get护理类型代码() {
        return 护理类型代码;
    }

    public void set护理类型代码(String 护理类型代码) {
        this.护理类型代码 = 护理类型代码;
    }

    public String get护理类型() {
        return 护理类型;
    }

    public void set护理类型(String 护理类型) {
        this.护理类型 = 护理类型;
    }

    public String get护理观察结果() {
        return 护理观察结果;
    }

    public void set护理观察结果(String 护理观察结果) {
        this.护理观察结果 = 护理观察结果;
    }

    public String get护理操作项目类目名称() {
        return 护理操作项目类目名称;
    }

    public void set护理操作项目类目名称(String 护理操作项目类目名称) {
        this.护理操作项目类目名称 = 护理操作项目类目名称;
    }

    public String get护理操作名称() {
        return 护理操作名称;
    }

    public void set护理操作名称(String 护理操作名称) {
        this.护理操作名称 = 护理操作名称;
    }

    public String get护理操作结果() {
        return 护理操作结果;
    }

    public void set护理操作结果(String 护理操作结果) {
        this.护理操作结果 = 护理操作结果;
    }

    public String get记录日期时间() {
        return 记录日期时间;
    }

    public void set记录日期时间(String 记录日期时间) {
        this.记录日期时间 = 记录日期时间;
    }

    public String get呕吐标志() {
        return 呕吐标志;
    }

    public void set呕吐标志(String 呕吐标志) {
        this.呕吐标志 = 呕吐标志;
    }

    public String get排尿困难标志() {
        return 排尿困难标志;
    }

    public void set排尿困难标志(String 排尿困难标志) {
        this.排尿困难标志 = 排尿困难标志;
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
