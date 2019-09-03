package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈治疗记录〉
 */
@Entity
@Table(name = "PUB05_治疗记录")
public class TreatmentRecord implements Serializable {

    private static final long serialVersionUID = 1577764897782722710L;
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
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private String 处理及指导意见;
    private String 有创诊疗操作标志;
    private String 操作编码;
    private String 操作名称;
    private String 操作目标部位名称;
    private String 介入物名称;
    private String 操作方法描述;
    private Byte 操作次数;
    private String 操作日期时间;
    private String 药物名称;
    private String 药物用法;
    private String 中药使用类别代码;
    @Transient
    @JsonIgnore
    private String 中药使用类别;
    private String 药物使用频次代码;
    @Transient
    @JsonIgnore
    private String 药物使用频次;
    private String 药物剂型代码;
    @Transient
    @JsonIgnore
    private String 药物剂型;
    private String 药物使用剂量单位;
    private Long 药物使用次剂量;
    private String 药物使用总剂量;
    private String 用药途径代码;
    @Transient
    @JsonIgnore
    private String 用药途径;
    private String 过敏史标志;
    private String 过敏史;
    private String 医嘱使用备注;
    private String 今后治疗方案;
    private String 随访方式代码;
    @Transient
    @JsonIgnore
    private String 随访方式;
    private String 随访日期;
    private String 随访周期建议代码;
    @Transient
    @JsonIgnore
    private String 随访周期建议;
    private String 医嘱执行者签名;
    private String 签名日期时间;

    public String get疾病诊断名称() {
        return 疾病诊断名称;
    }

    public void set疾病诊断名称(String 疾病诊断名称) {
        this.疾病诊断名称 = 疾病诊断名称;
    }

    public String get中药使用类别() {
        return 中药使用类别;
    }

    public void set中药使用类别(String 中药使用类别) {
        this.中药使用类别 = 中药使用类别;
    }

    public String get药物使用频次() {
        return 药物使用频次;
    }

    public void set药物使用频次(String 药物使用频次) {
        this.药物使用频次 = 药物使用频次;
    }

    public String get药物剂型() {
        return 药物剂型;
    }

    public void set药物剂型(String 药物剂型) {
        this.药物剂型 = 药物剂型;
    }

    public String get用药途径() {
        return 用药途径;
    }

    public void set用药途径(String 用药途径) {
        this.用药途径 = 用药途径;
    }

    public String get随访方式() {
        return 随访方式;
    }

    public void set随访方式(String 随访方式) {
        this.随访方式 = 随访方式;
    }

    public String get随访周期建议() {
        return 随访周期建议;
    }

    public void set随访周期建议(String 随访周期建议) {
        this.随访周期建议 = 随访周期建议;
    }

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

    public String get疾病诊断编码() {
        return 疾病诊断编码;
    }

    public void set疾病诊断编码(String 疾病诊断编码) {
        this.疾病诊断编码 = 疾病诊断编码;
    }

    public String get处理及指导意见() {
        return 处理及指导意见;
    }

    public void set处理及指导意见(String 处理及指导意见) {
        this.处理及指导意见 = 处理及指导意见;
    }

    public String get有创诊疗操作标志() {
        return 有创诊疗操作标志;
    }

    public void set有创诊疗操作标志(String 有创诊疗操作标志) {
        this.有创诊疗操作标志 = 有创诊疗操作标志;
    }

    public String get操作编码() {
        return 操作编码;
    }

    public void set操作编码(String 操作编码) {
        this.操作编码 = 操作编码;
    }

    public String get操作名称() {
        return 操作名称;
    }

    public void set操作名称(String 操作名称) {
        this.操作名称 = 操作名称;
    }

    public String get操作目标部位名称() {
        return 操作目标部位名称;
    }

    public void set操作目标部位名称(String 操作目标部位名称) {
        this.操作目标部位名称 = 操作目标部位名称;
    }

    public String get介入物名称() {
        return 介入物名称;
    }

    public void set介入物名称(String 介入物名称) {
        this.介入物名称 = 介入物名称;
    }

    public String get操作方法描述() {
        return 操作方法描述;
    }

    public void set操作方法描述(String 操作方法描述) {
        this.操作方法描述 = 操作方法描述;
    }

    public Byte get操作次数() {
        return 操作次数;
    }

    public void set操作次数(Byte 操作次数) {
        this.操作次数 = 操作次数;
    }

    public String get操作日期时间() {
        return 操作日期时间;
    }

    public void set操作日期时间(String 操作日期时间) {
        this.操作日期时间 = 操作日期时间;
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

    public String get中药使用类别代码() {
        return 中药使用类别代码;
    }

    public void set中药使用类别代码(String 中药使用类别代码) {
        this.中药使用类别代码 = 中药使用类别代码;
    }

    public String get药物使用频次代码() {
        return 药物使用频次代码;
    }

    public void set药物使用频次代码(String 药物使用频次代码) {
        this.药物使用频次代码 = 药物使用频次代码;
    }

    public String get药物剂型代码() {
        return 药物剂型代码;
    }

    public void set药物剂型代码(String 药物剂型代码) {
        this.药物剂型代码 = 药物剂型代码;
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

    public String get医嘱使用备注() {
        return 医嘱使用备注;
    }

    public void set医嘱使用备注(String 医嘱使用备注) {
        this.医嘱使用备注 = 医嘱使用备注;
    }

    public String get今后治疗方案() {
        return 今后治疗方案;
    }

    public void set今后治疗方案(String 今后治疗方案) {
        this.今后治疗方案 = 今后治疗方案;
    }

    public String get随访方式代码() {
        return 随访方式代码;
    }

    public void set随访方式代码(String 随访方式代码) {
        this.随访方式代码 = 随访方式代码;
    }

    public String get随访日期() {
        return 随访日期;
    }

    public void set随访日期(String 随访日期) {
        this.随访日期 = 随访日期;
    }

    public String get随访周期建议代码() {
        return 随访周期建议代码;
    }

    public void set随访周期建议代码(String 随访周期建议代码) {
        this.随访周期建议代码 = 随访周期建议代码;
    }

    public String get医嘱执行者签名() {
        return 医嘱执行者签名;
    }

    public void set医嘱执行者签名(String 医嘱执行者签名) {
        this.医嘱执行者签名 = 医嘱执行者签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
