package com.arrcen.cdademo.pojo.cdapojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 〈门急诊病历〉
 *
 */
@Entity
@Table(name = "PUB02_门急诊病历")
public class MJZRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 医疗机构组织机构代码;
    private String 门急诊号;
    private String 科室名称;
    private String 患者姓名;
    private String 性别代码;
    private String 出生日期;
    private Integer 年龄岁;
    private String 年龄月;
    private String 过敏史标志;
    private String 过敏史;
    private String 就诊日期时间;
    private String 初诊标志代码;

    private String 主诉;
    private String 现病史;
    private String 既往史;
    private String 体格检査;
    private String 中医四诊观察结果;
    private String 辅助检査项目;                 //辅助检查项目  辅助检査项目

    private String 辅助检查结果;
    private String 初步诊断_西医诊断编码;
    private String 初步诊断_西医诊断名称;
    private String 初步诊断_中医病名代码;
    private String 初步诊断_中医病名名称;
    private String 初步诊断_中医证候代码;
    private String 初步诊断_中医证候名称;
    private String 辨证依据;
    private String 治则治法;
    private String 医师签名;

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

    public String get科室名称() {
        return 科室名称;
    }

    public void set科室名称(String 科室名称) {
        this.科室名称 = 科室名称;
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

    public String get出生日期() {
        return 出生日期;
    }

    public void set出生日期(String 出生日期) {
        this.出生日期 = 出生日期;
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

    public String get就诊日期时间() {
        return 就诊日期时间;
    }

    public void set就诊日期时间(String 就诊日期时间) {
        this.就诊日期时间 = 就诊日期时间;
    }

    public String get初诊标志代码() {
        return 初诊标志代码;
    }

    public void set初诊标志代码(String 初诊标志代码) {
        this.初诊标志代码 = 初诊标志代码;
    }

    public String get主诉() {
        return 主诉;
    }

    public void set主诉(String 主诉) {
        this.主诉 = 主诉;
    }

    public String get现病史() {
        return 现病史;
    }

    public void set现病史(String 现病史) {
        this.现病史 = 现病史;
    }

    public String get既往史() {
        return 既往史;
    }

    public void set既往史(String 既往史) {
        this.既往史 = 既往史;
    }

    public String get体格检査() {
        return 体格检査;
    }

    public void set体格检査(String 体格检査) {
        this.体格检査 = 体格检査;
    }

    public String get中医四诊观察结果() {
        return 中医四诊观察结果;
    }

    public void set中医四诊观察结果(String 中医四诊观察结果) {
        this.中医四诊观察结果 = 中医四诊观察结果;
    }

    public String get辅助检査项目() {
        return 辅助检査项目;
    }

    public void set辅助检査项目(String 辅助检査项目) {
        this.辅助检査项目 = 辅助检査项目;
    }

    public String get辅助检查结果() {
        return 辅助检查结果;
    }

    public void set辅助检查结果(String 辅助检查结果) {
        this.辅助检查结果 = 辅助检查结果;
    }

    public String get初步诊断_西医诊断编码() {
        return 初步诊断_西医诊断编码;
    }

    public void set初步诊断_西医诊断编码(String 初步诊断_西医诊断编码) {
        this.初步诊断_西医诊断编码 = 初步诊断_西医诊断编码;
    }

    public String get初步诊断_西医诊断名称() {
        return 初步诊断_西医诊断名称;
    }

    public void set初步诊断_西医诊断名称(String 初步诊断_西医诊断名称) {
        this.初步诊断_西医诊断名称 = 初步诊断_西医诊断名称;
    }

    public String get初步诊断_中医病名代码() {
        return 初步诊断_中医病名代码;
    }

    public void set初步诊断_中医病名代码(String 初步诊断_中医病名代码) {
        this.初步诊断_中医病名代码 = 初步诊断_中医病名代码;
    }

    public String get初步诊断_中医病名名称() {
        return 初步诊断_中医病名名称;
    }

    public void set初步诊断_中医病名名称(String 初步诊断_中医病名名称) {
        this.初步诊断_中医病名名称 = 初步诊断_中医病名名称;
    }

    public String get初步诊断_中医证候代码() {
        return 初步诊断_中医证候代码;
    }

    public void set初步诊断_中医证候代码(String 初步诊断_中医证候代码) {
        this.初步诊断_中医证候代码 = 初步诊断_中医证候代码;
    }

    public String get初步诊断_中医证候名称() {
        return 初步诊断_中医证候名称;
    }

    public void set初步诊断_中医证候名称(String 初步诊断_中医证候名称) {
        this.初步诊断_中医证候名称 = 初步诊断_中医证候名称;
    }

    public String get辨证依据() {
        return 辨证依据;
    }

    public void set辨证依据(String 辨证依据) {
        this.辨证依据 = 辨证依据;
    }

    public String get治则治法() {
        return 治则治法;
    }

    public void set治则治法(String 治则治法) {
        this.治则治法 = 治则治法;
    }

    public String get医师签名() {
        return 医师签名;
    }

    public void set医师签名(String 医师签名) {
        this.医师签名 = 医师签名;
    }
}
