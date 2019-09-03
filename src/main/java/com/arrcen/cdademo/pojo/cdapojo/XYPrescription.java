package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈西药处方〉
 *
 */
@Entity
@Table(name = "PUB03_西药处方")
public class XYPrescription implements Serializable {

    private static final long serialVersionUID = 6072475483170515969L;
    @Id
    private String 系统序号;
    private String 医疗机构组织机构代码;
    private String 门急诊号;
    private String 处方编号;
    private String 处方开立日期;
    private Integer 处方有效天数;
    private String 处方开立科室名称;
    private String 患者姓名;
    private String 性别代码;
    private Integer 年龄岁;
    private String 年龄月;
    private String 疾病诊断编码;
    @Transient
    @JsonIgnore
    private String 疾病诊断名称;
    private String 处方开立医师签名;
    private String 处方审核药剂师签名;
    private String 处方调配药剂师签名;
    private String 处方核对药剂师签名;
    private String 处方发药药剂师签名;
    private String 处方备注信息;
    private String 处方药品金额;

    public String get疾病诊断名称() {
        return 疾病诊断名称;
    }

    public void set疾病诊断名称(String 疾病诊断名称) {
        this.疾病诊断名称 = 疾病诊断名称;
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

    public String get处方编号() {
        return 处方编号;
    }

    public void set处方编号(String 处方编号) {
        this.处方编号 = 处方编号;
    }

    public String get处方开立日期() {
        return 处方开立日期;
    }

    public void set处方开立日期(String 处方开立日期) {
        this.处方开立日期 = 处方开立日期;
    }

    public Integer get处方有效天数() {
        return 处方有效天数;
    }

    public void set处方有效天数(Integer 处方有效天数) {
        this.处方有效天数 = 处方有效天数;
    }

    public String get处方开立科室名称() {
        return 处方开立科室名称;
    }

    public void set处方开立科室名称(String 处方开立科室名称) {
        this.处方开立科室名称 = 处方开立科室名称;
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

    public Integer get年龄岁() {
        return 年龄岁;
    }

    public void set年龄岁(Integer 年龄岁) {
        this.年龄岁 = 年龄岁;
    }

    public String get年龄月() {
        return 年龄月;
    }

    public void set年龄月(String 年龄月) {
        this.年龄月 = 年龄月;
    }

    public String get疾病诊断编码() {
        return 疾病诊断编码;
    }

    public void set疾病诊断编码(String 疾病诊断编码) {
        this.疾病诊断编码 = 疾病诊断编码;
    }

    public String get处方开立医师签名() {
        return 处方开立医师签名;
    }

    public void set处方开立医师签名(String 处方开立医师签名) {
        this.处方开立医师签名 = 处方开立医师签名;
    }

    public String get处方审核药剂师签名() {
        return 处方审核药剂师签名;
    }

    public void set处方审核药剂师签名(String 处方审核药剂师签名) {
        this.处方审核药剂师签名 = 处方审核药剂师签名;
    }

    public String get处方调配药剂师签名() {
        return 处方调配药剂师签名;
    }

    public void set处方调配药剂师签名(String 处方调配药剂师签名) {
        this.处方调配药剂师签名 = 处方调配药剂师签名;
    }

    public String get处方核对药剂师签名() {
        return 处方核对药剂师签名;
    }

    public void set处方核对药剂师签名(String 处方核对药剂师签名) {
        this.处方核对药剂师签名 = 处方核对药剂师签名;
    }

    public String get处方发药药剂师签名() {
        return 处方发药药剂师签名;
    }

    public void set处方发药药剂师签名(String 处方发药药剂师签名) {
        this.处方发药药剂师签名 = 处方发药药剂师签名;
    }

    public String get处方备注信息() {
        return 处方备注信息;
    }

    public void set处方备注信息(String 处方备注信息) {
        this.处方备注信息 = 处方备注信息;
    }

    public String get处方药品金额() {
        return 处方药品金额;
    }

    public void set处方药品金额(String 处方药品金额) {
        this.处方药品金额 = 处方药品金额;
    }
}
