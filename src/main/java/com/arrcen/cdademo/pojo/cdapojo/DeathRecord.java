package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈死亡记录〉
 */
@Entity
@Table(name = "PUB13_死亡记录")
public class DeathRecord implements Serializable {

    private static final long serialVersionUID = 2614223115153925859L;
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
    private String 入院诊断编码;
    private String 入院情况;
    private String 诊疗过程描述;
    private String 死亡日期时间;
    private String 直接死亡原因名称;
    private String 直接死亡原因编码;
    private String 死亡诊断名称;
    private String 死亡诊断编码;
    private String 家属是否同意尸体解剖标志;
    private String 住院医师签名;
    private String 主治医师签名;
    private String 主任医师签名;
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

    public String get入院日期时间() {
        return 入院日期时间;
    }

    public void set入院日期时间(String 入院日期时间) {
        this.入院日期时间 = 入院日期时间;
    }

    public String get入院诊断编码() {
        return 入院诊断编码;
    }

    public void set入院诊断编码(String 入院诊断编码) {
        this.入院诊断编码 = 入院诊断编码;
    }

    public String get入院情况() {
        return 入院情况;
    }

    public void set入院情况(String 入院情况) {
        this.入院情况 = 入院情况;
    }

    public String get诊疗过程描述() {
        return 诊疗过程描述;
    }

    public void set诊疗过程描述(String 诊疗过程描述) {
        this.诊疗过程描述 = 诊疗过程描述;
    }

    public String get死亡日期时间() {
        return 死亡日期时间;
    }

    public void set死亡日期时间(String 死亡日期时间) {
        this.死亡日期时间 = 死亡日期时间;
    }

    public String get直接死亡原因名称() {
        return 直接死亡原因名称;
    }

    public void set直接死亡原因名称(String 直接死亡原因名称) {
        this.直接死亡原因名称 = 直接死亡原因名称;
    }

    public String get直接死亡原因编码() {
        return 直接死亡原因编码;
    }

    public void set直接死亡原因编码(String 直接死亡原因编码) {
        this.直接死亡原因编码 = 直接死亡原因编码;
    }

    public String get死亡诊断名称() {
        return 死亡诊断名称;
    }

    public void set死亡诊断名称(String 死亡诊断名称) {
        this.死亡诊断名称 = 死亡诊断名称;
    }

    public String get死亡诊断编码() {
        return 死亡诊断编码;
    }

    public void set死亡诊断编码(String 死亡诊断编码) {
        this.死亡诊断编码 = 死亡诊断编码;
    }

    public String get家属是否同意尸体解剖标志() {
        return 家属是否同意尸体解剖标志;
    }

    public void set家属是否同意尸体解剖标志(String 家属是否同意尸体解剖标志) {
        this.家属是否同意尸体解剖标志 = 家属是否同意尸体解剖标志;
    }

    public String get住院医师签名() {
        return 住院医师签名;
    }

    public void set住院医师签名(String 住院医师签名) {
        this.住院医师签名 = 住院医师签名;
    }

    public String get主治医师签名() {
        return 主治医师签名;
    }

    public void set主治医师签名(String 主治医师签名) {
        this.主治医师签名 = 主治医师签名;
    }

    public String get主任医师签名() {
        return 主任医师签名;
    }

    public void set主任医师签名(String 主任医师签名) {
        this.主任医师签名 = 主任医师签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
