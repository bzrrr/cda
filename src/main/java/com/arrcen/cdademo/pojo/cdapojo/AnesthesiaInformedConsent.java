package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈麻醉知情同意书〉
 */
@Entity
@Table(name = "PUB09_麻醉知情同意书")
public class AnesthesiaInformedConsent implements Serializable {

    private static final long serialVersionUID = -4243355233643227062L;
    @Id
    private String 系统序号;
    private String 门急诊号;
    private String 住院号;
    private String 知情同意书编号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private String 术前诊断编码;
    @Transient
    @JsonIgnore
    private String 术前诊断名称;
    private String 拟实施手术及操作编码;
    @Transient
    @JsonIgnore
    private String 拟实施手术及操作名称;
    private String 拟实施手术及操作日期时间;
    private String 拟实施麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 拟实施麻醉方法;
    private String 患者基础疾病;
    private String 基础疾病对麻醉可能产生的影响;
    private String 拟行有创操作和监测方法;
    private String 可能发生的意外及并发症;
    private String 使用麻醉钺痛泵标志;
    private String 参加麻醉安全保险标志;
    private String 医疗机构意见;
    private String 患者或法定代理人意见;
    private String 患者签名;
    private String 法定代理人签名;
    private String 法定代理人与患者的关系代码;
    @Transient
    @JsonIgnore
    private String 法定代理人与患者的关系;
    private String 患者或法定代理人签名日期时间;
    private String 麻醉医师签名;
    private String 麻醉医师签名日期时间;

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

    public String get知情同意书编号() {
        return 知情同意书编号;
    }

    public void set知情同意书编号(String 知情同意书编号) {
        this.知情同意书编号 = 知情同意书编号;
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

    public String get拟实施手术及操作编码() {
        return 拟实施手术及操作编码;
    }

    public void set拟实施手术及操作编码(String 拟实施手术及操作编码) {
        this.拟实施手术及操作编码 = 拟实施手术及操作编码;
    }

    public String get拟实施手术及操作名称() {
        return 拟实施手术及操作名称;
    }

    public void set拟实施手术及操作名称(String 拟实施手术及操作名称) {
        this.拟实施手术及操作名称 = 拟实施手术及操作名称;
    }

    public String get拟实施手术及操作日期时间() {
        return 拟实施手术及操作日期时间;
    }

    public void set拟实施手术及操作日期时间(String 拟实施手术及操作日期时间) {
        this.拟实施手术及操作日期时间 = 拟实施手术及操作日期时间;
    }

    public String get拟实施麻醉方法代码() {
        return 拟实施麻醉方法代码;
    }

    public void set拟实施麻醉方法代码(String 拟实施麻醉方法代码) {
        this.拟实施麻醉方法代码 = 拟实施麻醉方法代码;
    }

    public String get拟实施麻醉方法() {
        return 拟实施麻醉方法;
    }

    public void set拟实施麻醉方法(String 拟实施麻醉方法) {
        this.拟实施麻醉方法 = 拟实施麻醉方法;
    }

    public String get患者基础疾病() {
        return 患者基础疾病;
    }

    public void set患者基础疾病(String 患者基础疾病) {
        this.患者基础疾病 = 患者基础疾病;
    }

    public String get基础疾病对麻醉可能产生的影响() {
        return 基础疾病对麻醉可能产生的影响;
    }

    public void set基础疾病对麻醉可能产生的影响(String 基础疾病对麻醉可能产生的影响) {
        this.基础疾病对麻醉可能产生的影响 = 基础疾病对麻醉可能产生的影响;
    }

    public String get拟行有创操作和监测方法() {
        return 拟行有创操作和监测方法;
    }

    public void set拟行有创操作和监测方法(String 拟行有创操作和监测方法) {
        this.拟行有创操作和监测方法 = 拟行有创操作和监测方法;
    }

    public String get可能发生的意外及并发症() {
        return 可能发生的意外及并发症;
    }

    public void set可能发生的意外及并发症(String 可能发生的意外及并发症) {
        this.可能发生的意外及并发症 = 可能发生的意外及并发症;
    }

    public String get使用麻醉钺痛泵标志() {
        return 使用麻醉钺痛泵标志;
    }

    public void set使用麻醉钺痛泵标志(String 使用麻醉钺痛泵标志) {
        this.使用麻醉钺痛泵标志 = 使用麻醉钺痛泵标志;
    }

    public String get参加麻醉安全保险标志() {
        return 参加麻醉安全保险标志;
    }

    public void set参加麻醉安全保险标志(String 参加麻醉安全保险标志) {
        this.参加麻醉安全保险标志 = 参加麻醉安全保险标志;
    }

    public String get医疗机构意见() {
        return 医疗机构意见;
    }

    public void set医疗机构意见(String 医疗机构意见) {
        this.医疗机构意见 = 医疗机构意见;
    }

    public String get患者或法定代理人意见() {
        return 患者或法定代理人意见;
    }

    public void set患者或法定代理人意见(String 患者或法定代理人意见) {
        this.患者或法定代理人意见 = 患者或法定代理人意见;
    }

    public String get患者签名() {
        return 患者签名;
    }

    public void set患者签名(String 患者签名) {
        this.患者签名 = 患者签名;
    }

    public String get法定代理人签名() {
        return 法定代理人签名;
    }

    public void set法定代理人签名(String 法定代理人签名) {
        this.法定代理人签名 = 法定代理人签名;
    }

    public String get法定代理人与患者的关系代码() {
        return 法定代理人与患者的关系代码;
    }

    public void set法定代理人与患者的关系代码(String 法定代理人与患者的关系代码) {
        this.法定代理人与患者的关系代码 = 法定代理人与患者的关系代码;
    }

    public String get法定代理人与患者的关系() {
        return 法定代理人与患者的关系;
    }

    public void set法定代理人与患者的关系(String 法定代理人与患者的关系) {
        this.法定代理人与患者的关系 = 法定代理人与患者的关系;
    }

    public String get患者或法定代理人签名日期时间() {
        return 患者或法定代理人签名日期时间;
    }

    public void set患者或法定代理人签名日期时间(String 患者或法定代理人签名日期时间) {
        this.患者或法定代理人签名日期时间 = 患者或法定代理人签名日期时间;
    }

    public String get麻醉医师签名() {
        return 麻醉医师签名;
    }

    public void set麻醉医师签名(String 麻醉医师签名) {
        this.麻醉医师签名 = 麻醉医师签名;
    }

    public String get麻醉医师签名日期时间() {
        return 麻醉医师签名日期时间;
    }

    public void set麻醉医师签名日期时间(String 麻醉医师签名日期时间) {
        this.麻醉医师签名日期时间 = 麻醉医师签名日期时间;
    }
}
