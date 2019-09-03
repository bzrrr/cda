package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈检查记录〉
 *
 */
@Entity
@Table(name = "PUB04_检查记录")
public class InspectionRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 医疗机构组织机构代码;
    private String 门急诊号;
    private String 住院号;
    private String 患者类型代码;
    @Transient
    @JsonIgnore
    private String 患者类型;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private String 电话号码;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 电子申请单编号;
    private String 检查申请机构名称;
    private String 检査申请科室;
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private String 诊断机构名称;
    private String 诊断日期;
    private String 主诉;
    private String 症状开始日期时间;
    private String 症状停止日期时间;
    private String 症状描述;
    private String 特殊检査标志;
    private String 操作编码;
    private String 操作名称;
    private String 操作部位代码;
    private String 介入物名称;
    private String 操作方法描述;
    private Byte 操作次数;
    private String 操作日期时间;
    private String 麻醉方法代码;
    private String 麻醉观察结果;
    private String 麻醉中西医标识代码;
    private String 麻醉医师签名;
    private String 诊疗过程描述;
    private String 标本类别;
    private String 检査标本号;
    private String 标本状态;
    private String 标本固定液名称;
    private String 标本采样日期时间;
    private String 接收标本日期时间;
    private String 检査方法名称;
    private String 检查类别;
    private String 检査项目代码;
    @Transient
    @JsonIgnore
    private String 检查项目;
    private String 检查结果代码;
    @Transient
    @JsonIgnore
    private String 检查结果;
    private Long 检査定量结果;
    private String 检査定量结果计量单位;
    private String 检查技师签名;
    private String 检查医师签名;
    private String 检査日期;
    private String 检査报告单编号;
    private String 检査报告机构名称;
    private String 检査报告科室;
    private String 检査报告结果_客观所见;
    private String 检查报告结果_主观提示;
    private String 检查报告备注;
    private String 检查报告曰期;
    private String 报告医师签名;
    private String 审核医师签名;

    public String get检查项目() {
        return 检查项目;
    }

    public void set检查项目(String 检查项目) {
        this.检查项目 = 检查项目;
    }

    public String get检查结果() {
        return 检查结果;
    }

    public void set检查结果(String 检查结果) {
        this.检查结果 = 检查结果;
    }

    public String get疾病诊断名称() {
        return 疾病诊断名称;
    }

    public void set疾病诊断名称(String 疾病诊断名称) {
        this.疾病诊断名称 = 疾病诊断名称;
    }

    public String get患者类型() {
        return 患者类型;
    }

    public void set患者类型(String 患者类型) {
        this.患者类型 = 患者类型;
    }

    public String get系统序号() {
        return 系统序号;
    }

    public void set系统序号(String 系统序号) {
        this.系统序号 = 系统序号;
    }

    public String get医疗机构组织机构代码() {
        return 医疗机构组织机构代码;
    }

    public void set医疗机构组织机构代码(String 医疗机构组织机构代码) {
        this.医疗机构组织机构代码 = 医疗机构组织机构代码;
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

    public String get患者类型代码() {
        return 患者类型代码;
    }

    public void set患者类型代码(String 患者类型代码) {
        this.患者类型代码 = 患者类型代码;
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

    public String get电话号码() {
        return 电话号码;
    }

    public void set电话号码(String 电话号码) {
        this.电话号码 = 电话号码;
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

    public String get电子申请单编号() {
        return 电子申请单编号;
    }

    public void set电子申请单编号(String 电子申请单编号) {
        this.电子申请单编号 = 电子申请单编号;
    }

    public String get检查申请机构名称() {
        return 检查申请机构名称;
    }

    public void set检查申请机构名称(String 检查申请机构名称) {
        this.检查申请机构名称 = 检查申请机构名称;
    }

    public String get检査申请科室() {
        return 检査申请科室;
    }

    public void set检査申请科室(String 检査申请科室) {
        this.检査申请科室 = 检査申请科室;
    }

    public String get疾病诊断编码() {
        return 疾病诊断编码;
    }

    public void set疾病诊断编码(String 疾病诊断编码) {
        this.疾病诊断编码 = 疾病诊断编码;
    }

    public String get诊断机构名称() {
        return 诊断机构名称;
    }

    public void set诊断机构名称(String 诊断机构名称) {
        this.诊断机构名称 = 诊断机构名称;
    }

    public String get诊断日期() {
        return 诊断日期;
    }

    public void set诊断日期(String 诊断日期) {
        this.诊断日期 = 诊断日期;
    }

    public String get主诉() {
        return 主诉;
    }

    public void set主诉(String 主诉) {
        this.主诉 = 主诉;
    }

    public String get症状开始日期时间() {
        return 症状开始日期时间;
    }

    public void set症状开始日期时间(String 症状开始日期时间) {
        this.症状开始日期时间 = 症状开始日期时间;
    }

    public String get症状停止日期时间() {
        return 症状停止日期时间;
    }

    public void set症状停止日期时间(String 症状停止日期时间) {
        this.症状停止日期时间 = 症状停止日期时间;
    }

    public String get症状描述() {
        return 症状描述;
    }

    public void set症状描述(String 症状描述) {
        this.症状描述 = 症状描述;
    }

    public String get特殊检査标志() {
        return 特殊检査标志;
    }

    public void set特殊检査标志(String 特殊检査标志) {
        this.特殊检査标志 = 特殊检査标志;
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

    public String get操作部位代码() {
        return 操作部位代码;
    }

    public void set操作部位代码(String 操作部位代码) {
        this.操作部位代码 = 操作部位代码;
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

    public String get麻醉方法代码() {
        return 麻醉方法代码;
    }

    public void set麻醉方法代码(String 麻醉方法代码) {
        this.麻醉方法代码 = 麻醉方法代码;
    }

    public String get麻醉观察结果() {
        return 麻醉观察结果;
    }

    public void set麻醉观察结果(String 麻醉观察结果) {
        this.麻醉观察结果 = 麻醉观察结果;
    }

    public String get麻醉中西医标识代码() {
        return 麻醉中西医标识代码;
    }

    public void set麻醉中西医标识代码(String 麻醉中西医标识代码) {
        this.麻醉中西医标识代码 = 麻醉中西医标识代码;
    }

    public String get麻醉医师签名() {
        return 麻醉医师签名;
    }

    public void set麻醉医师签名(String 麻醉医师签名) {
        this.麻醉医师签名 = 麻醉医师签名;
    }

    public String get诊疗过程描述() {
        return 诊疗过程描述;
    }

    public void set诊疗过程描述(String 诊疗过程描述) {
        this.诊疗过程描述 = 诊疗过程描述;
    }

    public String get标本类别() {
        return 标本类别;
    }

    public void set标本类别(String 标本类别) {
        this.标本类别 = 标本类别;
    }

    public String get检査标本号() {
        return 检査标本号;
    }

    public void set检査标本号(String 检査标本号) {
        this.检査标本号 = 检査标本号;
    }

    public String get标本状态() {
        return 标本状态;
    }

    public void set标本状态(String 标本状态) {
        this.标本状态 = 标本状态;
    }

    public String get标本固定液名称() {
        return 标本固定液名称;
    }

    public void set标本固定液名称(String 标本固定液名称) {
        this.标本固定液名称 = 标本固定液名称;
    }

    public String get标本采样日期时间() {
        return 标本采样日期时间;
    }

    public void set标本采样日期时间(String 标本采样日期时间) {
        this.标本采样日期时间 = 标本采样日期时间;
    }

    public String get接收标本日期时间() {
        return 接收标本日期时间;
    }

    public void set接收标本日期时间(String 接收标本日期时间) {
        this.接收标本日期时间 = 接收标本日期时间;
    }

    public String get检査方法名称() {
        return 检査方法名称;
    }

    public void set检査方法名称(String 检査方法名称) {
        this.检査方法名称 = 检査方法名称;
    }

    public String get检查类别() {
        return 检查类别;
    }

    public void set检查类别(String 检查类别) {
        this.检查类别 = 检查类别;
    }

    public String get检査项目代码() {
        return 检査项目代码;
    }

    public void set检査项目代码(String 检査项目代码) {
        this.检査项目代码 = 检査项目代码;
    }

    public String get检查结果代码() {
        return 检查结果代码;
    }

    public void set检查结果代码(String 检查结果代码) {
        this.检查结果代码 = 检查结果代码;
    }

    public Long get检査定量结果() {
        return 检査定量结果;
    }

    public void set检査定量结果(Long 检査定量结果) {
        this.检査定量结果 = 检査定量结果;
    }

    public String get检査定量结果计量单位() {
        return 检査定量结果计量单位;
    }

    public void set检査定量结果计量单位(String 检査定量结果计量单位) {
        this.检査定量结果计量单位 = 检査定量结果计量单位;
    }

    public String get检查技师签名() {
        return 检查技师签名;
    }

    public void set检查技师签名(String 检查技师签名) {
        this.检查技师签名 = 检查技师签名;
    }

    public String get检查医师签名() {
        return 检查医师签名;
    }

    public void set检查医师签名(String 检查医师签名) {
        this.检查医师签名 = 检查医师签名;
    }

    public String get检査日期() {
        return 检査日期;
    }

    public void set检査日期(String 检査日期) {
        this.检査日期 = 检査日期;
    }

    public String get检査报告单编号() {
        return 检査报告单编号;
    }

    public void set检査报告单编号(String 检査报告单编号) {
        this.检査报告单编号 = 检査报告单编号;
    }

    public String get检査报告机构名称() {
        return 检査报告机构名称;
    }

    public void set检査报告机构名称(String 检査报告机构名称) {
        this.检査报告机构名称 = 检査报告机构名称;
    }

    public String get检査报告科室() {
        return 检査报告科室;
    }

    public void set检査报告科室(String 检査报告科室) {
        this.检査报告科室 = 检査报告科室;
    }

    public String get检査报告结果_客观所见() {
        return 检査报告结果_客观所见;
    }

    public void set检査报告结果_客观所见(String 检査报告结果_客观所见) {
        this.检査报告结果_客观所见 = 检査报告结果_客观所见;
    }

    public String get检查报告结果_主观提示() {
        return 检查报告结果_主观提示;
    }

    public void set检查报告结果_主观提示(String 检查报告结果_主观提示) {
        this.检查报告结果_主观提示 = 检查报告结果_主观提示;
    }

    public String get检查报告备注() {
        return 检查报告备注;
    }

    public void set检查报告备注(String 检查报告备注) {
        this.检查报告备注 = 检查报告备注;
    }

    public String get检查报告曰期() {
        return 检查报告曰期;
    }

    public void set检查报告曰期(String 检查报告曰期) {
        this.检查报告曰期 = 检查报告曰期;
    }

    public String get报告医师签名() {
        return 报告医师签名;
    }

    public void set报告医师签名(String 报告医师签名) {
        this.报告医师签名 = 报告医师签名;
    }

    public String get审核医师签名() {
        return 审核医师签名;
    }

    public void set审核医师签名(String 审核医师签名) {
        this.审核医师签名 = 审核医师签名;
    }
}
