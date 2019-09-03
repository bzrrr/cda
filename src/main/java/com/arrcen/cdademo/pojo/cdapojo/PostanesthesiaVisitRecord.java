package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈麻醉术后访视记录〉
 */
@Entity
@Table(name = "PUB05_麻醉术后访视记录")
public class PostanesthesiaVisitRecord implements Serializable {

    private static final long serialVersionUID = 2471050709406614662L;
    @Id
    private String 系统序号;
    private String 门急诊号;
    private String 住院号;
    private String 电子申请单编号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private Long 体重;
    private String ABO血型代码;
    @Transient
    @JsonIgnore
    private String ABO血型;
    private String RH血型代码;
    @Transient
    @JsonIgnore
    private String RH血型;
    private String 术前诊断编码;
    @Transient
    @JsonIgnore
    private String 术前诊断名称;
    private String 术后诊断编码;
    @Transient
    @JsonIgnore
    private String 术后诊断名称;
    private String 一般状况检査结果;
    private String 手术及操作编码;
    @Transient
    @JsonIgnore
    private String 手术及操作名称;
    private String 麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 麻醉方法名称;
    private String 麻醉恢复情况;
    private String 淸醒日期时间;
    private String 拔除气管插管标志;
    private String 特殊情况;
    private String 麻醉适应证;
    private String 麻醉医师签名;
    private String 签名日期时间;

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

    public String get电子申请单编号() {
        return 电子申请单编号;
    }

    public void set电子申请单编号(String 电子申请单编号) {
        this.电子申请单编号 = 电子申请单编号;
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

    public String getABO血型代码() {
        return ABO血型代码;
    }

    public void setABO血型代码(String ABO血型代码) {
        this.ABO血型代码 = ABO血型代码;
    }

    public String getABO血型() {
        return ABO血型;
    }

    public void setABO血型(String ABO血型) {
        this.ABO血型 = ABO血型;
    }

    public String getRH血型代码() {
        return RH血型代码;
    }

    public void setRH血型代码(String RH血型代码) {
        this.RH血型代码 = RH血型代码;
    }

    public String getRH血型() {
        return RH血型;
    }

    public void setRH血型(String RH血型) {
        this.RH血型 = RH血型;
    }

    public String get术前诊断编码() {
        return 术前诊断编码;
    }

    public void set术前诊断编码(String 术前诊断编码) {
        this.术前诊断编码 = 术前诊断编码;
    }

    public String get术前诊断名称() {
        return 术前诊断名称;
    }

    public void set术前诊断名称(String 术前诊断名称) {
        this.术前诊断名称 = 术前诊断名称;
    }

    public String get术后诊断编码() {
        return 术后诊断编码;
    }

    public void set术后诊断编码(String 术后诊断编码) {
        this.术后诊断编码 = 术后诊断编码;
    }

    public String get术后诊断名称() {
        return 术后诊断名称;
    }

    public void set术后诊断名称(String 术后诊断名称) {
        this.术后诊断名称 = 术后诊断名称;
    }

    public String get一般状况检査结果() {
        return 一般状况检査结果;
    }

    public void set一般状况检査结果(String 一般状况检査结果) {
        this.一般状况检査结果 = 一般状况检査结果;
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

    public String get麻醉方法代码() {
        return 麻醉方法代码;
    }

    public void set麻醉方法代码(String 麻醉方法代码) {
        this.麻醉方法代码 = 麻醉方法代码;
    }

    public String get麻醉方法名称() {
        return 麻醉方法名称;
    }

    public void set麻醉方法名称(String 麻醉方法名称) {
        this.麻醉方法名称 = 麻醉方法名称;
    }

    public String get麻醉恢复情况() {
        return 麻醉恢复情况;
    }

    public void set麻醉恢复情况(String 麻醉恢复情况) {
        this.麻醉恢复情况 = 麻醉恢复情况;
    }

    public String get淸醒日期时间() {
        return 淸醒日期时间;
    }

    public void set淸醒日期时间(String 淸醒日期时间) {
        this.淸醒日期时间 = 淸醒日期时间;
    }

    public String get拔除气管插管标志() {
        return 拔除气管插管标志;
    }

    public void set拔除气管插管标志(String 拔除气管插管标志) {
        this.拔除气管插管标志 = 拔除气管插管标志;
    }

    public String get特殊情况() {
        return 特殊情况;
    }

    public void set特殊情况(String 特殊情况) {
        this.特殊情况 = 特殊情况;
    }

    public String get麻醉适应证() {
        return 麻醉适应证;
    }

    public void set麻醉适应证(String 麻醉适应证) {
        this.麻醉适应证 = 麻醉适应证;
    }

    public String get麻醉医师签名() {
        return 麻醉医师签名;
    }

    public void set麻醉医师签名(String 麻醉医师签名) {
        this.麻醉医师签名 = 麻醉医师签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
