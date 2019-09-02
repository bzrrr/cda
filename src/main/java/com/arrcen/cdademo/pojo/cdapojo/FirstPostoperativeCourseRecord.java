package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈术后首次病程记录〉
 */
@Entity
@Table(name = "PUB13_术后首次病程记录")
public class FirstPostoperativeCourseRecord implements Serializable {

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
    private String 记录日期时间;
    private String 手术及操作编码;
    @Transient
    @JsonIgnore
    private String 手术及操作名称;
    private String 手术名称;
    private String 手术目标部位名称;
    private String 手术日期吋间;
    private String 麻醉方法代码;
    private String 手术过程;
    private String 术后诊断名称;
    private String 术后诊断编码;
    private String 诊断依据;
    private String 注意事项;
    private String 医师签名;
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

    public String get记录日期时间() {
        return 记录日期时间;
    }

    public void set记录日期时间(String 记录日期时间) {
        this.记录日期时间 = 记录日期时间;
    }

    public String get手术及操作编码() {
        return 手术及操作编码;
    }

    public void set手术及操作编码(String 手术及操作编码) {
        this.手术及操作编码 = 手术及操作编码;
    }

    public String get手术及操作名称() {
        return 手术及操作名称;
    }

    public void set手术及操作名称(String 手术及操作名称) {
        this.手术及操作名称 = 手术及操作名称;
    }

    public String get手术名称() {
        return 手术名称;
    }

    public void set手术名称(String 手术名称) {
        this.手术名称 = 手术名称;
    }

    public String get手术目标部位名称() {
        return 手术目标部位名称;
    }

    public void set手术目标部位名称(String 手术目标部位名称) {
        this.手术目标部位名称 = 手术目标部位名称;
    }

    public String get手术日期吋间() {
        return 手术日期吋间;
    }

    public void set手术日期吋间(String 手术日期吋间) {
        this.手术日期吋间 = 手术日期吋间;
    }

    public String get麻醉方法代码() {
        return 麻醉方法代码;
    }

    public void set麻醉方法代码(String 麻醉方法代码) {
        this.麻醉方法代码 = 麻醉方法代码;
    }

    public String get手术过程() {
        return 手术过程;
    }

    public void set手术过程(String 手术过程) {
        this.手术过程 = 手术过程;
    }

    public String get术后诊断名称() {
        return 术后诊断名称;
    }

    public void set术后诊断名称(String 术后诊断名称) {
        this.术后诊断名称 = 术后诊断名称;
    }

    public String get术后诊断编码() {
        return 术后诊断编码;
    }

    public void set术后诊断编码(String 术后诊断编码) {
        this.术后诊断编码 = 术后诊断编码;
    }

    public String get诊断依据() {
        return 诊断依据;
    }

    public void set诊断依据(String 诊断依据) {
        this.诊断依据 = 诊断依据;
    }

    public String get注意事项() {
        return 注意事项;
    }

    public void set注意事项(String 注意事项) {
        this.注意事项 = 注意事项;
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
