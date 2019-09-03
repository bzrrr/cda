package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈生命体征测量记录〉
 */
@Entity
@Table(name = "PUB07_生命体征测量记录")
public class VitalSignMeasureRecord implements Serializable {

    private static final long serialVersionUID = -7517169391553778754L;
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
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private String 入院日期时间;
    private Long 实际住院天数;
    private Short 手术或分娩后天数;
    private String 记录日期时间;
    private Byte 呼吸频率;
    private String 使用呼吸机标志;
    private Byte 脉率;
    private Byte 起搏器心率;
    private Long 体温;
    private Byte 收缩压;
    private Byte 舒张压;
    private Long 体重;
    private Long 腹围;
    private String 护理观察项目名称;
    private String 护理观察结果;
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

    public String get入院日期时间() {
        return 入院日期时间;
    }

    public void set入院日期时间(String 入院日期时间) {
        this.入院日期时间 = 入院日期时间;
    }

    public Long get实际住院天数() {
        return 实际住院天数;
    }

    public void set实际住院天数(Long 实际住院天数) {
        this.实际住院天数 = 实际住院天数;
    }

    public Short get手术或分娩后天数() {
        return 手术或分娩后天数;
    }

    public void set手术或分娩后天数(Short 手术或分娩后天数) {
        this.手术或分娩后天数 = 手术或分娩后天数;
    }

    public String get记录日期时间() {
        return 记录日期时间;
    }

    public void set记录日期时间(String 记录日期时间) {
        this.记录日期时间 = 记录日期时间;
    }

    public Byte get呼吸频率() {
        return 呼吸频率;
    }

    public void set呼吸频率(Byte 呼吸频率) {
        this.呼吸频率 = 呼吸频率;
    }

    public String get使用呼吸机标志() {
        return 使用呼吸机标志;
    }

    public void set使用呼吸机标志(String 使用呼吸机标志) {
        this.使用呼吸机标志 = 使用呼吸机标志;
    }

    public Byte get脉率() {
        return 脉率;
    }

    public void set脉率(Byte 脉率) {
        this.脉率 = 脉率;
    }

    public Byte get起搏器心率() {
        return 起搏器心率;
    }

    public void set起搏器心率(Byte 起搏器心率) {
        this.起搏器心率 = 起搏器心率;
    }

    public Long get体温() {
        return 体温;
    }

    public void set体温(Long 体温) {
        this.体温 = 体温;
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

    public Long get体重() {
        return 体重;
    }

    public void set体重(Long 体重) {
        this.体重 = 体重;
    }

    public Long get腹围() {
        return 腹围;
    }

    public void set腹围(Long 腹围) {
        this.腹围 = 腹围;
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
