package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈麻醉术前访视记录〉
 */
@Entity
@Table(name = "PUB05_麻醉术前访视记录")
public class PreanesthesiaVisitRecord implements Serializable {

    private static final long serialVersionUID = -1697585656416524890L;
    @Id
    private String 系统序号;
    private String 门急诊号;
    private String 住院号;
    private String 电子申请单编号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 手术间编号;
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
    private String 拟实施手术及操作编码;
    @Transient
    @JsonIgnore
    private String 拟实施手术及操作名称;
    private String 拟实施麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 拟实施麻醉方法名称;
    private String 术前合并疾病;
    private String 注意事项;
    private String 简要病史;
    private String 过敏史;
    private String 心电图检査结果;
    private String 胸部X线检查结果;
    private String CT检査结果;
    private String B超检查结果;
    private String MRI超检査结果;
    private String 肺功能检査结果;
    private String 血常规检査结果;
    private String 尿常规检査结果;
    private String 凝血功能检查结果;
    private String 肝功能检查结果;
    private String 血气分析检查结果;
    private String 一般状况检查结果;
    private String 精神状态正常标志;
    private String 心脏听诊结果;
    private String 肺部听诊结果;
    private String 四肢检査结果;
    private String 脊柱检查结果;
    private String 腹部检査结果;
    private String 气管检查结果;
    private String 牙齿检査结果;
    private String 术前麻醉医嘱;
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

    public String get手术间编号() {
        return 手术间编号;
    }

    public void set手术间编号(String 手术间编号) {
        this.手术间编号 = 手术间编号;
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

    public String get术前合并疾病() {
        return 术前合并疾病;
    }

    public void set术前合并疾病(String 术前合并疾病) {
        this.术前合并疾病 = 术前合并疾病;
    }

    public String get注意事项() {
        return 注意事项;
    }

    public void set注意事项(String 注意事项) {
        this.注意事项 = 注意事项;
    }

    public String get简要病史() {
        return 简要病史;
    }

    public void set简要病史(String 简要病史) {
        this.简要病史 = 简要病史;
    }

    public String get过敏史() {
        return 过敏史;
    }

    public void set过敏史(String 过敏史) {
        this.过敏史 = 过敏史;
    }

    public String get心电图检査结果() {
        return 心电图检査结果;
    }

    public void set心电图检査结果(String 心电图检査结果) {
        this.心电图检査结果 = 心电图检査结果;
    }

    public String get胸部X线检查结果() {
        return 胸部X线检查结果;
    }

    public void set胸部X线检查结果(String 胸部X线检查结果) {
        this.胸部X线检查结果 = 胸部X线检查结果;
    }

    public String getCT检査结果() {
        return CT检査结果;
    }

    public void setCT检査结果(String CT检査结果) {
        this.CT检査结果 = CT检査结果;
    }

    public String getB超检查结果() {
        return B超检查结果;
    }

    public void setB超检查结果(String b超检查结果) {
        B超检查结果 = b超检查结果;
    }

    public String getMRI超检査结果() {
        return MRI超检査结果;
    }

    public void setMRI超检査结果(String MRI超检査结果) {
        this.MRI超检査结果 = MRI超检査结果;
    }

    public String get肺功能检査结果() {
        return 肺功能检査结果;
    }

    public void set肺功能检査结果(String 肺功能检査结果) {
        this.肺功能检査结果 = 肺功能检査结果;
    }

    public String get血常规检査结果() {
        return 血常规检査结果;
    }

    public void set血常规检査结果(String 血常规检査结果) {
        this.血常规检査结果 = 血常规检査结果;
    }

    public String get尿常规检査结果() {
        return 尿常规检査结果;
    }

    public void set尿常规检査结果(String 尿常规检査结果) {
        this.尿常规检査结果 = 尿常规检査结果;
    }

    public String get凝血功能检查结果() {
        return 凝血功能检查结果;
    }

    public void set凝血功能检查结果(String 凝血功能检查结果) {
        this.凝血功能检查结果 = 凝血功能检查结果;
    }

    public String get肝功能检查结果() {
        return 肝功能检查结果;
    }

    public void set肝功能检查结果(String 肝功能检查结果) {
        this.肝功能检查结果 = 肝功能检查结果;
    }

    public String get血气分析检查结果() {
        return 血气分析检查结果;
    }

    public void set血气分析检查结果(String 血气分析检查结果) {
        this.血气分析检查结果 = 血气分析检查结果;
    }

    public String get一般状况检查结果() {
        return 一般状况检查结果;
    }

    public void set一般状况检查结果(String 一般状况检查结果) {
        this.一般状况检查结果 = 一般状况检查结果;
    }

    public String get精神状态正常标志() {
        return 精神状态正常标志;
    }

    public void set精神状态正常标志(String 精神状态正常标志) {
        this.精神状态正常标志 = 精神状态正常标志;
    }

    public String get心脏听诊结果() {
        return 心脏听诊结果;
    }

    public void set心脏听诊结果(String 心脏听诊结果) {
        this.心脏听诊结果 = 心脏听诊结果;
    }

    public String get肺部听诊结果() {
        return 肺部听诊结果;
    }

    public void set肺部听诊结果(String 肺部听诊结果) {
        this.肺部听诊结果 = 肺部听诊结果;
    }

    public String get四肢检査结果() {
        return 四肢检査结果;
    }

    public void set四肢检査结果(String 四肢检査结果) {
        this.四肢检査结果 = 四肢检査结果;
    }

    public String get脊柱检查结果() {
        return 脊柱检查结果;
    }

    public void set脊柱检查结果(String 脊柱检查结果) {
        this.脊柱检查结果 = 脊柱检查结果;
    }

    public String get腹部检査结果() {
        return 腹部检査结果;
    }

    public void set腹部检査结果(String 腹部检査结果) {
        this.腹部检査结果 = 腹部检査结果;
    }

    public String get气管检查结果() {
        return 气管检查结果;
    }

    public void set气管检查结果(String 气管检查结果) {
        this.气管检查结果 = 气管检查结果;
    }

    public String get牙齿检査结果() {
        return 牙齿检査结果;
    }

    public void set牙齿检査结果(String 牙齿检査结果) {
        this.牙齿检査结果 = 牙齿检査结果;
    }

    public String get术前麻醉医嘱() {
        return 术前麻醉医嘱;
    }

    public void set术前麻醉医嘱(String 术前麻醉医嘱) {
        this.术前麻醉医嘱 = 术前麻醉医嘱;
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
