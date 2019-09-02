package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈日常病程记录〉
 */
@Entity
@Table(name = "PUB13_日常病程记录")
public class DailyDiseaseRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 住院号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 记录日期时间;
    private String 患者姓名;
    private String 性别代码;
    @Transient
    @JsonIgnore
    private String 性别;
    private Byte 年龄岁;
    private String 年龄月;
    private String 住院病程;
    private String 医嘱内容;
    private String 中医四诊观察结果;
    private String 辨证论治详细描述;
    private String 中药煎煮方法;
    private String 中药用药方法;
    private String 专业技术职务类别代码;
    @Transient
    @JsonIgnore
    private String 专业技术职务类别;
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

    public String get记录日期时间() {
        return 记录日期时间;
    }

    public void set记录日期时间(String 记录日期时间) {
        this.记录日期时间 = 记录日期时间;
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

    public String get住院病程() {
        return 住院病程;
    }

    public void set住院病程(String 住院病程) {
        this.住院病程 = 住院病程;
    }

    public String get医嘱内容() {
        return 医嘱内容;
    }

    public void set医嘱内容(String 医嘱内容) {
        this.医嘱内容 = 医嘱内容;
    }

    public String get中医四诊观察结果() {
        return 中医四诊观察结果;
    }

    public void set中医四诊观察结果(String 中医四诊观察结果) {
        this.中医四诊观察结果 = 中医四诊观察结果;
    }

    public String get辨证论治详细描述() {
        return 辨证论治详细描述;
    }

    public void set辨证论治详细描述(String 辨证论治详细描述) {
        this.辨证论治详细描述 = 辨证论治详细描述;
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

    public String get专业技术职务类别代码() {
        return 专业技术职务类别代码;
    }

    public void set专业技术职务类别代码(String 专业技术职务类别代码) {
        this.专业技术职务类别代码 = 专业技术职务类别代码;
    }

    public String get专业技术职务类别() {
        return 专业技术职务类别;
    }

    public void set专业技术职务类别(String 专业技术职务类别) {
        this.专业技术职务类别 = 专业技术职务类别;
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
