package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈麻醉记录〉
 */
@Entity
@Table(name = "PUB05_麻醉记录")
public class AnesthesiaRecord implements Serializable {

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
    private String ABO血型名称;
    private String RH血型代码;
    @Transient
    @JsonIgnore
    private String RH血型名称;
    private String 术前诊断编码;
    @Transient
    @JsonIgnore
    private String 术前诊断名称;
    private String 术后诊断编码;
    @Transient
    @JsonIgnore
    private String 术后诊断名称;
    private String 手术及操作编码;
    @Transient
    @JsonIgnore
    private String 手术及操作名称;
    private String 手术体位代码;
    @Transient
    @JsonIgnore
    private String 手术体位;
    private String 麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 麻醉方法;
    private String 气管插管分类;
    private String 麻醉药物名称;
    private String 麻醉体位;
    private String 呼吸类型代码;
    @Transient
    @JsonIgnore
    private String 呼吸类型;
    private String 麻醉描述;
    private String 常规监测项目名称;
    private String 常规监测项目结果;
    private String 特殊监测项目名称;
    private String 特殊监测项目结果;
    private String 麻醉合并症标志代码;
    @Transient
    @JsonIgnore
    private String 麻醉合并症标志;
    private String 诊疗过程描述;
    private String 穿刺过程;
    private Byte 收缩压;
    private Byte 舒张压;
    private Long 体温;
    private Byte 心率;
    private Byte 脉率;
    private Byte 呼吸频率;
    private String ASA分级标准代码;
    @Transient
    @JsonIgnore
    private String ASA分级标准;
    private String 麻醉效果;
    private String 麻醉前用药;
    private String 手术开始日期时间;
    private String 麻醉开始日期时间;
    private String 手术结束日期时间;
    private String 出手术室日期时间;
    private String 手术者姓名;
    private String 药物名称;
    private String 药物用法;
    private String 药物使用频次代码;
    @Transient
    @JsonIgnore
    private String 药物使用频次;
    private String 药物使用剂量单位;
    private Long 药物使用次剂量;
    private String 药物使用总剂量;
    private String 用药途径代码;
    @Transient
    @JsonIgnore
    private String 用药途径;
    private String 输血日期时间;
    private String 输血品种代码;
    @Transient
    @JsonIgnore
    private String 输血品种;
    private Long 输血量;
    private String 输血量计量单位;
    private String 输血反应标志;
    private String 术中输液项目;
    private Short 出血量;
    private String 患者去向代码;
    @Transient
    @JsonIgnore
    private String 患者去向;
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

    public String getABO血型名称() {
        return ABO血型名称;
    }

    public void setABO血型名称(String ABO血型名称) {
        this.ABO血型名称 = ABO血型名称;
    }

    public String getRH血型代码() {
        return RH血型代码;
    }

    public void setRH血型代码(String RH血型代码) {
        this.RH血型代码 = RH血型代码;
    }

    public String getRH血型名称() {
        return RH血型名称;
    }

    public void setRH血型名称(String RH血型名称) {
        this.RH血型名称 = RH血型名称;
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

    public String get手术体位代码() {
        return 手术体位代码;
    }

    public void set手术体位代码(String 手术体位代码) {
        this.手术体位代码 = 手术体位代码;
    }

    public String get手术体位() {
        return 手术体位;
    }

    public void set手术体位(String 手术体位) {
        this.手术体位 = 手术体位;
    }

    public String get麻醉方法代码() {
        return 麻醉方法代码;
    }

    public void set麻醉方法代码(String 麻醉方法代码) {
        this.麻醉方法代码 = 麻醉方法代码;
    }

    public String get麻醉方法() {
        return 麻醉方法;
    }

    public void set麻醉方法(String 麻醉方法) {
        this.麻醉方法 = 麻醉方法;
    }

    public String get气管插管分类() {
        return 气管插管分类;
    }

    public void set气管插管分类(String 气管插管分类) {
        this.气管插管分类 = 气管插管分类;
    }

    public String get麻醉药物名称() {
        return 麻醉药物名称;
    }

    public void set麻醉药物名称(String 麻醉药物名称) {
        this.麻醉药物名称 = 麻醉药物名称;
    }

    public String get麻醉体位() {
        return 麻醉体位;
    }

    public void set麻醉体位(String 麻醉体位) {
        this.麻醉体位 = 麻醉体位;
    }

    public String get呼吸类型代码() {
        return 呼吸类型代码;
    }

    public void set呼吸类型代码(String 呼吸类型代码) {
        this.呼吸类型代码 = 呼吸类型代码;
    }

    public String get呼吸类型() {
        return 呼吸类型;
    }

    public void set呼吸类型(String 呼吸类型) {
        this.呼吸类型 = 呼吸类型;
    }

    public String get麻醉描述() {
        return 麻醉描述;
    }

    public void set麻醉描述(String 麻醉描述) {
        this.麻醉描述 = 麻醉描述;
    }

    public String get常规监测项目名称() {
        return 常规监测项目名称;
    }

    public void set常规监测项目名称(String 常规监测项目名称) {
        this.常规监测项目名称 = 常规监测项目名称;
    }

    public String get常规监测项目结果() {
        return 常规监测项目结果;
    }

    public void set常规监测项目结果(String 常规监测项目结果) {
        this.常规监测项目结果 = 常规监测项目结果;
    }

    public String get特殊监测项目名称() {
        return 特殊监测项目名称;
    }

    public void set特殊监测项目名称(String 特殊监测项目名称) {
        this.特殊监测项目名称 = 特殊监测项目名称;
    }

    public String get特殊监测项目结果() {
        return 特殊监测项目结果;
    }

    public void set特殊监测项目结果(String 特殊监测项目结果) {
        this.特殊监测项目结果 = 特殊监测项目结果;
    }

    public String get麻醉合并症标志代码() {
        return 麻醉合并症标志代码;
    }

    public void set麻醉合并症标志代码(String 麻醉合并症标志代码) {
        this.麻醉合并症标志代码 = 麻醉合并症标志代码;
    }

    public String get麻醉合并症标志() {
        return 麻醉合并症标志;
    }

    public void set麻醉合并症标志(String 麻醉合并症标志) {
        this.麻醉合并症标志 = 麻醉合并症标志;
    }

    public String get诊疗过程描述() {
        return 诊疗过程描述;
    }

    public void set诊疗过程描述(String 诊疗过程描述) {
        this.诊疗过程描述 = 诊疗过程描述;
    }

    public String get穿刺过程() {
        return 穿刺过程;
    }

    public void set穿刺过程(String 穿刺过程) {
        this.穿刺过程 = 穿刺过程;
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

    public Long get体温() {
        return 体温;
    }

    public void set体温(Long 体温) {
        this.体温 = 体温;
    }

    public Byte get心率() {
        return 心率;
    }

    public void set心率(Byte 心率) {
        this.心率 = 心率;
    }

    public Byte get脉率() {
        return 脉率;
    }

    public void set脉率(Byte 脉率) {
        this.脉率 = 脉率;
    }

    public Byte get呼吸频率() {
        return 呼吸频率;
    }

    public void set呼吸频率(Byte 呼吸频率) {
        this.呼吸频率 = 呼吸频率;
    }

    public String getASA分级标准代码() {
        return ASA分级标准代码;
    }

    public void setASA分级标准代码(String ASA分级标准代码) {
        this.ASA分级标准代码 = ASA分级标准代码;
    }

    public String getASA分级标准() {
        return ASA分级标准;
    }

    public void setASA分级标准(String ASA分级标准) {
        this.ASA分级标准 = ASA分级标准;
    }

    public String get麻醉效果() {
        return 麻醉效果;
    }

    public void set麻醉效果(String 麻醉效果) {
        this.麻醉效果 = 麻醉效果;
    }

    public String get麻醉前用药() {
        return 麻醉前用药;
    }

    public void set麻醉前用药(String 麻醉前用药) {
        this.麻醉前用药 = 麻醉前用药;
    }

    public String get手术开始日期时间() {
        return 手术开始日期时间;
    }

    public void set手术开始日期时间(String 手术开始日期时间) {
        this.手术开始日期时间 = 手术开始日期时间;
    }

    public String get麻醉开始日期时间() {
        return 麻醉开始日期时间;
    }

    public void set麻醉开始日期时间(String 麻醉开始日期时间) {
        this.麻醉开始日期时间 = 麻醉开始日期时间;
    }

    public String get手术结束日期时间() {
        return 手术结束日期时间;
    }

    public void set手术结束日期时间(String 手术结束日期时间) {
        this.手术结束日期时间 = 手术结束日期时间;
    }

    public String get出手术室日期时间() {
        return 出手术室日期时间;
    }

    public void set出手术室日期时间(String 出手术室日期时间) {
        this.出手术室日期时间 = 出手术室日期时间;
    }

    public String get手术者姓名() {
        return 手术者姓名;
    }

    public void set手术者姓名(String 手术者姓名) {
        this.手术者姓名 = 手术者姓名;
    }

    public String get药物名称() {
        return 药物名称;
    }

    public void set药物名称(String 药物名称) {
        this.药物名称 = 药物名称;
    }

    public String get药物用法() {
        return 药物用法;
    }

    public void set药物用法(String 药物用法) {
        this.药物用法 = 药物用法;
    }

    public String get药物使用频次代码() {
        return 药物使用频次代码;
    }

    public void set药物使用频次代码(String 药物使用频次代码) {
        this.药物使用频次代码 = 药物使用频次代码;
    }

    public String get药物使用频次() {
        return 药物使用频次;
    }

    public void set药物使用频次(String 药物使用频次) {
        this.药物使用频次 = 药物使用频次;
    }

    public String get药物使用剂量单位() {
        return 药物使用剂量单位;
    }

    public void set药物使用剂量单位(String 药物使用剂量单位) {
        this.药物使用剂量单位 = 药物使用剂量单位;
    }

    public Long get药物使用次剂量() {
        return 药物使用次剂量;
    }

    public void set药物使用次剂量(Long 药物使用次剂量) {
        this.药物使用次剂量 = 药物使用次剂量;
    }

    public String get药物使用总剂量() {
        return 药物使用总剂量;
    }

    public void set药物使用总剂量(String 药物使用总剂量) {
        this.药物使用总剂量 = 药物使用总剂量;
    }

    public String get用药途径代码() {
        return 用药途径代码;
    }

    public void set用药途径代码(String 用药途径代码) {
        this.用药途径代码 = 用药途径代码;
    }

    public String get用药途径() {
        return 用药途径;
    }

    public void set用药途径(String 用药途径) {
        this.用药途径 = 用药途径;
    }

    public String get输血日期时间() {
        return 输血日期时间;
    }

    public void set输血日期时间(String 输血日期时间) {
        this.输血日期时间 = 输血日期时间;
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

    public String get术中输液项目() {
        return 术中输液项目;
    }

    public void set术中输液项目(String 术中输液项目) {
        this.术中输液项目 = 术中输液项目;
    }

    public Short get出血量() {
        return 出血量;
    }

    public void set出血量(Short 出血量) {
        this.出血量 = 出血量;
    }

    public String get患者去向代码() {
        return 患者去向代码;
    }

    public void set患者去向代码(String 患者去向代码) {
        this.患者去向代码 = 患者去向代码;
    }

    public String get患者去向() {
        return 患者去向;
    }

    public void set患者去向(String 患者去向) {
        this.患者去向 = 患者去向;
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
