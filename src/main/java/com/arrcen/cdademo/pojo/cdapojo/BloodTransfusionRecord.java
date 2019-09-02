package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈输血记录〉
 */
@Entity
@Table(name = "PUB05_输血记录")
public class BloodTransfusionRecord implements Serializable {

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
    private String ABO血型代码;
    @Transient
    @JsonIgnore
    private String ABO血型;
    private String RH血型代码;
    @Transient
    @JsonIgnore
    private String RH血型;
    private String 输血史标识代码;
    @Transient
    @JsonIgnore
    private String 输血史标识;
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private String 输血性质代码;
    @Transient
    @JsonIgnore
    private String 输血性质;
    private String 申请ABO血型代码;
    @Transient
    @JsonIgnore
    private String 申请ABO血型;
    private String 申请RH血型代码;
    @Transient
    @JsonIgnore
    private String 申请RH血型;
    private String 输血指征;
    private String 输血过程记录;
    private String 输血品种代码;
    @Transient
    @JsonIgnore
    private String 输血品种;
    private String 血袋编码;
    private Long 输血量;
    private String 输血量计量单位;
    private String 输血反应标志;
    private String 输血反应类型代码;
    @Transient
    @JsonIgnore
    private String 输血反应类型;
    private Long 输血次数;
    private String 输血日期时间;
    private String 输血原因;
    private String 医师签名;
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

    public String get输血史标识代码() {
        return 输血史标识代码;
    }

    public void set输血史标识代码(String 输血史标识代码) {
        this.输血史标识代码 = 输血史标识代码;
    }

    public String get输血史标识() {
        return 输血史标识;
    }

    public void set输血史标识(String 输血史标识) {
        this.输血史标识 = 输血史标识;
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

    public String get输血性质代码() {
        return 输血性质代码;
    }

    public void set输血性质代码(String 输血性质代码) {
        this.输血性质代码 = 输血性质代码;
    }

    public String get输血性质() {
        return 输血性质;
    }

    public void set输血性质(String 输血性质) {
        this.输血性质 = 输血性质;
    }

    public String get申请ABO血型代码() {
        return 申请ABO血型代码;
    }

    public void set申请ABO血型代码(String 申请ABO血型代码) {
        this.申请ABO血型代码 = 申请ABO血型代码;
    }

    public String get申请ABO血型() {
        return 申请ABO血型;
    }

    public void set申请ABO血型(String 申请ABO血型) {
        this.申请ABO血型 = 申请ABO血型;
    }

    public String get申请RH血型代码() {
        return 申请RH血型代码;
    }

    public void set申请RH血型代码(String 申请RH血型代码) {
        this.申请RH血型代码 = 申请RH血型代码;
    }

    public String get申请RH血型() {
        return 申请RH血型;
    }

    public void set申请RH血型(String 申请RH血型) {
        this.申请RH血型 = 申请RH血型;
    }

    public String get输血指征() {
        return 输血指征;
    }

    public void set输血指征(String 输血指征) {
        this.输血指征 = 输血指征;
    }

    public String get输血过程记录() {
        return 输血过程记录;
    }

    public void set输血过程记录(String 输血过程记录) {
        this.输血过程记录 = 输血过程记录;
    }

    public String get输血品种代码() {
        return 输血品种代码;
    }

    public void set输血品种代码(String 输血品种代码) {
        this.输血品种代码 = 输血品种代码;
    }

    public String get输血品种() {
        return 输血品种;
    }

    public void set输血品种(String 输血品种) {
        this.输血品种 = 输血品种;
    }

    public String get血袋编码() {
        return 血袋编码;
    }

    public void set血袋编码(String 血袋编码) {
        this.血袋编码 = 血袋编码;
    }

    public Long get输血量() {
        return 输血量;
    }

    public void set输血量(Long 输血量) {
        this.输血量 = 输血量;
    }

    public String get输血量计量单位() {
        return 输血量计量单位;
    }

    public void set输血量计量单位(String 输血量计量单位) {
        this.输血量计量单位 = 输血量计量单位;
    }

    public String get输血反应标志() {
        return 输血反应标志;
    }

    public void set输血反应标志(String 输血反应标志) {
        this.输血反应标志 = 输血反应标志;
    }

    public String get输血反应类型代码() {
        return 输血反应类型代码;
    }

    public void set输血反应类型代码(String 输血反应类型代码) {
        this.输血反应类型代码 = 输血反应类型代码;
    }

    public String get输血反应类型() {
        return 输血反应类型;
    }

    public void set输血反应类型(String 输血反应类型) {
        this.输血反应类型 = 输血反应类型;
    }

    public Long get输血次数() {
        return 输血次数;
    }

    public void set输血次数(Long 输血次数) {
        this.输血次数 = 输血次数;
    }

    public String get输血日期时间() {
        return 输血日期时间;
    }

    public void set输血日期时间(String 输血日期时间) {
        this.输血日期时间 = 输血日期时间;
    }

    public String get输血原因() {
        return 输血原因;
    }

    public void set输血原因(String 输血原因) {
        this.输血原因 = 输血原因;
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
