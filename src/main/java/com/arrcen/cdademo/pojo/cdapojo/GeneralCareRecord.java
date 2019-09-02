package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈一般护理记录〉
 */
@Entity
@Table(name = "PUB07_一般护理记录")
public class GeneralCareRecord implements Serializable {

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
    private String 护理等级代码;
    @Transient
    @JsonIgnore
    private String 护理等级;
    private String 护理类型代码;
    @Transient
    @JsonIgnore
    private String 护理类型;
    private String 过敏史;
    private Long 体重;
    private Long 体温;
    private Byte 呼吸频率;
    private Byte 脉率;
    private Byte 收缩压;
    private Byte 舒张压;
    private Long 血氧饱和度;
    private String 足背动脉搏动标志;
    private String 饮食情况代码;
    @Transient
    @JsonIgnore
    private String 饮食情况;
    private String 导管护理描述;
    private String 气管护理代码;
    @Transient
    @JsonIgnore
    private String 气管护理;
    private String 体位护理;
    private String 皮肤护理;
    private String 营养护理;
    private String 饮食指导代码;
    @Transient
    @JsonIgnore
    private String 饮食指导;
    private String 心理护理代码;
    @Transient
    @JsonIgnore
    private String 心理护理名称;
    private String 安全护理代码;
    @Transient
    @JsonIgnore
    private String 安全护理名称;
    private String 简要病情;
    private String 护理观察项目名称;
    private String 护理观察结果;
    private String 护理操作名称;
    private String 护理操作项目类目名称;
    private String 护理操作结果;
    private String 发出手术安全核对表标志;
    private String 收回手术安全核对表标志;
    private String 发出手术风险评估表标志;
    private String 收回手术风险评估表标志;
    private String 隔离标志;
    private String 隔离种类代码;
    @Transient
    @JsonIgnore
    private String 隔离种类;
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

    public Byte get呼吸频率() {
        return 呼吸频率;
    }

    public void set呼吸频率(Byte 呼吸频率) {
        this.呼吸频率 = 呼吸频率;
    }

    public Byte get脉率() {
        return 脉率;
    }

    public void set脉率(Byte 脉率) {
        this.脉率 = 脉率;
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

    public Long get血氧饱和度() {
        return 血氧饱和度;
    }

    public void set血氧饱和度(Long 血氧饱和度) {
        this.血氧饱和度 = 血氧饱和度;
    }

    public String get足背动脉搏动标志() {
        return 足背动脉搏动标志;
    }

    public void set足背动脉搏动标志(String 足背动脉搏动标志) {
        this.足背动脉搏动标志 = 足背动脉搏动标志;
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

    public String get导管护理描述() {
        return 导管护理描述;
    }

    public void set导管护理描述(String 导管护理描述) {
        this.导管护理描述 = 导管护理描述;
    }

    public String get气管护理代码() {
        return 气管护理代码;
    }

    public void set气管护理代码(String 气管护理代码) {
        this.气管护理代码 = 气管护理代码;
    }

    public String get气管护理() {
        return 气管护理;
    }

    public void set气管护理(String 气管护理) {
        this.气管护理 = 气管护理;
    }

    public String get体位护理() {
        return 体位护理;
    }

    public void set体位护理(String 体位护理) {
        this.体位护理 = 体位护理;
    }

    public String get皮肤护理() {
        return 皮肤护理;
    }

    public void set皮肤护理(String 皮肤护理) {
        this.皮肤护理 = 皮肤护理;
    }

    public String get营养护理() {
        return 营养护理;
    }

    public void set营养护理(String 营养护理) {
        this.营养护理 = 营养护理;
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

    public String get心理护理代码() {
        return 心理护理代码;
    }

    public void set心理护理代码(String 心理护理代码) {
        this.心理护理代码 = 心理护理代码;
    }

    public String get心理护理名称() {
        return 心理护理名称;
    }

    public void set心理护理名称(String 心理护理名称) {
        this.心理护理名称 = 心理护理名称;
    }

    public String get安全护理代码() {
        return 安全护理代码;
    }

    public void set安全护理代码(String 安全护理代码) {
        this.安全护理代码 = 安全护理代码;
    }

    public String get安全护理名称() {
        return 安全护理名称;
    }

    public void set安全护理名称(String 安全护理名称) {
        this.安全护理名称 = 安全护理名称;
    }

    public String get简要病情() {
        return 简要病情;
    }

    public void set简要病情(String 简要病情) {
        this.简要病情 = 简要病情;
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

    public String get发出手术安全核对表标志() {
        return 发出手术安全核对表标志;
    }

    public void set发出手术安全核对表标志(String 发出手术安全核对表标志) {
        this.发出手术安全核对表标志 = 发出手术安全核对表标志;
    }

    public String get收回手术安全核对表标志() {
        return 收回手术安全核对表标志;
    }

    public void set收回手术安全核对表标志(String 收回手术安全核对表标志) {
        this.收回手术安全核对表标志 = 收回手术安全核对表标志;
    }

    public String get发出手术风险评估表标志() {
        return 发出手术风险评估表标志;
    }

    public void set发出手术风险评估表标志(String 发出手术风险评估表标志) {
        this.发出手术风险评估表标志 = 发出手术风险评估表标志;
    }

    public String get收回手术风险评估表标志() {
        return 收回手术风险评估表标志;
    }

    public void set收回手术风险评估表标志(String 收回手术风险评估表标志) {
        this.收回手术风险评估表标志 = 收回手术风险评估表标志;
    }

    public String get隔离标志() {
        return 隔离标志;
    }

    public void set隔离标志(String 隔离标志) {
        this.隔离标志 = 隔离标志;
    }

    public String get隔离种类代码() {
        return 隔离种类代码;
    }

    public void set隔离种类代码(String 隔离种类代码) {
        this.隔离种类代码 = 隔离种类代码;
    }

    public String get隔离种类() {
        return 隔离种类;
    }

    public void set隔离种类(String 隔离种类) {
        this.隔离种类 = 隔离种类;
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
