package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈病危、病重护理记录〉
 */
@Entity
@Table(name = "PUB07_危重护理记录")
public class CriticalCareRecord implements Serializable {

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
    private String 护理等级代码;
    @Transient
    @JsonIgnore
    private String 护理等级;
    private String 护理类型代码;
    @Transient
    @JsonIgnore
    private String 护理类型;
    private String 过敏史;
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private Long 体重;
    private Long 体温;
    private Byte 心率;
    private Byte 呼吸频率;
    private Byte 收缩压;
    private Byte 舒张压;
    private Long 血糖检测值;
    private String 饮食情况代码;
    @Transient
    @JsonIgnore
    private String 饮食情况;
    private String 护理观察项目名称;
    private String 护理观察结果;
    private String 护理操作名称;
    private String 护理操作项目类目名称;
    private String 护理操作结果;
    private String 呼吸机监护项目;
    private String 护士签名;
    private String 签名日期吋间;

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

    public String get过敏史() {
        return 过敏史;
    }

    public void set过敏史(String 过敏史) {
        this.过敏史 = 过敏史;
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

    public Long get体重() {
        return 体重;
    }

    public void set体重(Long 体重) {
        this.体重 = 体重;
    }

    public Long get体温() {
        return 体温;
    }

    public void set体温(Long 体温) {
        this.体温 = 体温;
    }

    public Byte get心率() {
        return 心率;
    }

    public void set心率(Byte 心率) {
        this.心率 = 心率;
    }

    public Byte get呼吸频率() {
        return 呼吸频率;
    }

    public void set呼吸频率(Byte 呼吸频率) {
        this.呼吸频率 = 呼吸频率;
    }

    public Byte get收缩压() {
        return 收缩压;
    }

    public void set收缩压(Byte 收缩压) {
        this.收缩压 = 收缩压;
    }

    public Byte get舒张压() {
        return 舒张压;
    }

    public void set舒张压(Byte 舒张压) {
        this.舒张压 = 舒张压;
    }

    public Long get血糖检测值() {
        return 血糖检测值;
    }

    public void set血糖检测值(Long 血糖检测值) {
        this.血糖检测值 = 血糖检测值;
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

    public String get护理观察项目名称() {
        return 护理观察项目名称;
    }

    public void set护理观察项目名称(String 护理观察项目名称) {
        this.护理观察项目名称 = 护理观察项目名称;
    }

    public String get护理观察结果() {
        return 护理观察结果;
    }

    public void set护理观察结果(String 护理观察结果) {
        this.护理观察结果 = 护理观察结果;
    }

    public String get护理操作名称() {
        return 护理操作名称;
    }

    public void set护理操作名称(String 护理操作名称) {
        this.护理操作名称 = 护理操作名称;
    }

    public String get护理操作项目类目名称() {
        return 护理操作项目类目名称;
    }

    public void set护理操作项目类目名称(String 护理操作项目类目名称) {
        this.护理操作项目类目名称 = 护理操作项目类目名称;
    }

    public String get护理操作结果() {
        return 护理操作结果;
    }

    public void set护理操作结果(String 护理操作结果) {
        this.护理操作结果 = 护理操作结果;
    }

    public String get呼吸机监护项目() {
        return 呼吸机监护项目;
    }

    public void set呼吸机监护项目(String 呼吸机监护项目) {
        this.呼吸机监护项目 = 呼吸机监护项目;
    }

    public String get护士签名() {
        return 护士签名;
    }

    public void set护士签名(String 护士签名) {
        this.护士签名 = 护士签名;
    }

    public String get签名日期吋间() {
        return 签名日期吋间;
    }

    public void set签名日期吋间(String 签名日期吋间) {
        this.签名日期吋间 = 签名日期吋间;
    }
}
