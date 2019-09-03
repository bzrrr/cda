package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈术前小结〉
 */
@Entity
@Table(name = "PUB13_术前小结")
public class PreoperativeSummary implements Serializable {

    private static final long serialVersionUID = 8740928457472705307L;
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
    private String 小结日期时间;
    private String 病历摘要;
    private String 术前诊断编码;
    @Transient
    @JsonIgnore
    private String 术前诊断名称;
    private String 诊断依据;
    private String 过敏史标志;
    private String 过敏史;
    private String 辅助检査结果;
    private String 手术适应证;
    private String 手术禁忌症;
    private String 手术指征;
    private String 会诊意见;
    private String 拟实施手术及操作编码;
    private String 拟实施手术及操作名称;
    private String 拟实施手术目标部位名称;
    private String 拟实施手术及操作日期时间;
    private String 拟实施麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 拟实施麻醉方法名称;
    private String 注意事项;
    private String 手术要点;
    private String 术前准备;
    private String 手术者签名;
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

    public String get小结日期时间() {
        return 小结日期时间;
    }

    public void set小结日期时间(String 小结日期时间) {
        this.小结日期时间 = 小结日期时间;
    }

    public String get病历摘要() {
        return 病历摘要;
    }

    public void set病历摘要(String 病历摘要) {
        this.病历摘要 = 病历摘要;
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

    public String get诊断依据() {
        return 诊断依据;
    }

    public void set诊断依据(String 诊断依据) {
        this.诊断依据 = 诊断依据;
    }

    public String get过敏史标志() {
        return 过敏史标志;
    }

    public void set过敏史标志(String 过敏史标志) {
        this.过敏史标志 = 过敏史标志;
    }

    public String get过敏史() {
        return 过敏史;
    }

    public void set过敏史(String 过敏史) {
        this.过敏史 = 过敏史;
    }

    public String get辅助检査结果() {
        return 辅助检査结果;
    }

    public void set辅助检査结果(String 辅助检査结果) {
        this.辅助检査结果 = 辅助检査结果;
    }

    public String get手术适应证() {
        return 手术适应证;
    }

    public void set手术适应证(String 手术适应证) {
        this.手术适应证 = 手术适应证;
    }

    public String get手术禁忌症() {
        return 手术禁忌症;
    }

    public void set手术禁忌症(String 手术禁忌症) {
        this.手术禁忌症 = 手术禁忌症;
    }

    public String get手术指征() {
        return 手术指征;
    }

    public void set手术指征(String 手术指征) {
        this.手术指征 = 手术指征;
    }

    public String get会诊意见() {
        return 会诊意见;
    }

    public void set会诊意见(String 会诊意见) {
        this.会诊意见 = 会诊意见;
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

    public String get拟实施手术目标部位名称() {
        return 拟实施手术目标部位名称;
    }

    public void set拟实施手术目标部位名称(String 拟实施手术目标部位名称) {
        this.拟实施手术目标部位名称 = 拟实施手术目标部位名称;
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

    public String get拟实施麻醉方法名称() {
        return 拟实施麻醉方法名称;
    }

    public void set拟实施麻醉方法名称(String 拟实施麻醉方法名称) {
        this.拟实施麻醉方法名称 = 拟实施麻醉方法名称;
    }

    public String get注意事项() {
        return 注意事项;
    }

    public void set注意事项(String 注意事项) {
        this.注意事项 = 注意事项;
    }

    public String get手术要点() {
        return 手术要点;
    }

    public void set手术要点(String 手术要点) {
        this.手术要点 = 手术要点;
    }

    public String get术前准备() {
        return 术前准备;
    }

    public void set术前准备(String 术前准备) {
        this.术前准备 = 术前准备;
    }

    public String get手术者签名() {
        return 手术者签名;
    }

    public void set手术者签名(String 手术者签名) {
        this.手术者签名 = 手术者签名;
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
