package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈高值耗材使用记录〉
 */
@Entity
@Table(name = "PUB07_高值耗材使用记录")
public class HighValueThingUseRecord implements Serializable {

    private static final long serialVersionUID = -1627157670455651015L;
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
    private String 记录日期时间;
    private String 植入性耗材标志;
    private String 材料名称;
    private String 产品编码;
    private String 产品生产厂家;
    private String 产品供应商;
    private String 耗材单位;
    private Short 数量;
    private String 使用途径;
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

    public String get记录日期时间() {
        return 记录日期时间;
    }

    public void set记录日期时间(String 记录日期时间) {
        this.记录日期时间 = 记录日期时间;
    }

    public String get植入性耗材标志() {
        return 植入性耗材标志;
    }

    public void set植入性耗材标志(String 植入性耗材标志) {
        this.植入性耗材标志 = 植入性耗材标志;
    }

    public String get材料名称() {
        return 材料名称;
    }

    public void set材料名称(String 材料名称) {
        this.材料名称 = 材料名称;
    }

    public String get产品编码() {
        return 产品编码;
    }

    public void set产品编码(String 产品编码) {
        this.产品编码 = 产品编码;
    }

    public String get产品生产厂家() {
        return 产品生产厂家;
    }

    public void set产品生产厂家(String 产品生产厂家) {
        this.产品生产厂家 = 产品生产厂家;
    }

    public String get产品供应商() {
        return 产品供应商;
    }

    public void set产品供应商(String 产品供应商) {
        this.产品供应商 = 产品供应商;
    }

    public String get耗材单位() {
        return 耗材单位;
    }

    public void set耗材单位(String 耗材单位) {
        this.耗材单位 = 耗材单位;
    }

    public Short get数量() {
        return 数量;
    }

    public void set数量(Short 数量) {
        this.数量 = 数量;
    }

    public String get使用途径() {
        return 使用途径;
    }

    public void set使用途径(String 使用途径) {
        this.使用途径 = 使用途径;
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
