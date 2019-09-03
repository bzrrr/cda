package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈中药处方〉
 *
 */
@Entity
@Table(name = "PUB03_中药处方")
public class ZYPrescription implements Serializable {

    private static final long serialVersionUID = -3749116659265514158L;
    @Id
    private String 系统序号;
    private String 医疗机构组织机构代码;
    private String 门急诊号;
    private String 处方编号;
    private String 处方类别代码;
    @Transient
    @JsonIgnore
    private String 处方类别;
    private String 处方开立日期;
    private Long 处方有效天数;
    private String 处方开立科室名称;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private String 西医诊断编码;
    @Transient
    @JsonIgnore
    private String 西医诊断名称;
    private String 中医病名代码;
    @Transient
    @JsonIgnore
    private String 中医病名名称;
    private String 中医证候代码;
    @Transient
    @JsonIgnore
    private String 中医证候名称;
    private String 中药饮片处方;
    private Long 中药饮片剂数;
    private String 中药饮片煎煮法;
    private String 中药用药方法;
    private String 治则治法;
    private String 处方开立医师签名;
    private String 处方审核药剂师签名;
    private String 处方调配药剂师签名;
    private String 处方核对药剂师签名;
    private String 处方发药药剂师签名;
    private String 处方备注信息;
    private Long 处方药品金额;

    public String get处方类别() {
        return 处方类别;
    }

    public void set处方类别(String 处方类别) {
        this.处方类别 = 处方类别;
    }

    public String get西医诊断名称() {
        return 西医诊断名称;
    }

    public void set西医诊断名称(String 西医诊断名称) {
        this.西医诊断名称 = 西医诊断名称;
    }

    public String get中医病名名称() {
        return 中医病名名称;
    }

    public void set中医病名名称(String 中医病名名称) {
        this.中医病名名称 = 中医病名名称;
    }

    public String get中医证候名称() {
        return 中医证候名称;
    }

    public void set中医证候名称(String 中医证候名称) {
        this.中医证候名称 = 中医证候名称;
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

    public String get处方类别代码() {
        return 处方类别代码;
    }

    public void set处方类别代码(String 处方类别代码) {
        this.处方类别代码 = 处方类别代码;
    }

    public String get处方开立日期() {
        return 处方开立日期;
    }

    public void set处方开立日期(String 处方开立日期) {
        this.处方开立日期 = 处方开立日期;
    }

    public Long get处方有效天数() {
        return 处方有效天数;
    }

    public void set处方有效天数(Long 处方有效天数) {
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

    public String get西医诊断编码() {
        return 西医诊断编码;
    }

    public void set西医诊断编码(String 西医诊断编码) {
        this.西医诊断编码 = 西医诊断编码;
    }

    public String get中医病名代码() {
        return 中医病名代码;
    }

    public void set中医病名代码(String 中医病名代码) {
        this.中医病名代码 = 中医病名代码;
    }

    public String get中医证候代码() {
        return 中医证候代码;
    }

    public void set中医证候代码(String 中医证候代码) {
        this.中医证候代码 = 中医证候代码;
    }

    public String get中药饮片处方() {
        return 中药饮片处方;
    }

    public void set中药饮片处方(String 中药饮片处方) {
        this.中药饮片处方 = 中药饮片处方;
    }

    public Long get中药饮片剂数() {
        return 中药饮片剂数;
    }

    public void set中药饮片剂数(Long 中药饮片剂数) {
        this.中药饮片剂数 = 中药饮片剂数;
    }

    public String get中药饮片煎煮法() {
        return 中药饮片煎煮法;
    }

    public void set中药饮片煎煮法(String 中药饮片煎煮法) {
        this.中药饮片煎煮法 = 中药饮片煎煮法;
    }

    public String get中药用药方法() {
        return 中药用药方法;
    }

    public void set中药用药方法(String 中药用药方法) {
        this.中药用药方法 = 中药用药方法;
    }

    public String get治则治法() {
        return 治则治法;
    }

    public void set治则治法(String 治则治法) {
        this.治则治法 = 治则治法;
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

    public Long get处方药品金额() {
        return 处方药品金额;
    }

    public void set处方药品金额(Long 处方药品金额) {
        this.处方药品金额 = 处方药品金额;
    }
}
