package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈住院医嘱〉
 */
@Entity
@Table(name = "PUB14_住院医嘱")
public class ResidentDoctor implements Serializable {

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
    private Long 体重;
    private String 处方药品组号;
    private String 电子申请单编号;
    private String 医嘱类别代码;
    @Transient
    @JsonIgnore
    private String 医嘱类别名称;
    private String 医嘱项目类型代码;
    @Transient
    @JsonIgnore
    private String 医嘱项目类型名称;
    private String 医嘱项目内容;
    private String 医嘱计划开始日期吋间;
    private String 医嘱计划结束日期时间;
    private String 医嘱备注信息;
    private String 医嘱开立者签名;
    private String 医嘱开立日期时间;
    private String 医嘱开立科室;
    private String 医嘱审核人签名;
    private String 医嘱审核日期时间;
    private String 核对医嘱护士签名;
    private String 医嘱核对日期时间;
    private String 医嘱执行者签名;
    private String 医嘱执行日期时间;
    private String 医嘱执行科室;
    private String 医嘱执行状态;
    private String 医嘱停止日期时间;
    private String 停止医嘱者签名;
    private String 医嘱取消日期时间;
    private String 取消医嘱者签名;


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

    public Long get体重() {
        return 体重;
    }

    public void set体重(Long 体重) {
        this.体重 = 体重;
    }

    public String get处方药品组号() {
        return 处方药品组号;
    }

    public void set处方药品组号(String 处方药品组号) {
        this.处方药品组号 = 处方药品组号;
    }

    public String get电子申请单编号() {
        return 电子申请单编号;
    }

    public void set电子申请单编号(String 电子申请单编号) {
        this.电子申请单编号 = 电子申请单编号;
    }

    public String get医嘱类别代码() {
        return 医嘱类别代码;
    }

    public void set医嘱类别代码(String 医嘱类别代码) {
        this.医嘱类别代码 = 医嘱类别代码;
    }

    public String get医嘱类别名称() {
        return 医嘱类别名称;
    }

    public void set医嘱类别名称(String 医嘱类别名称) {
        this.医嘱类别名称 = 医嘱类别名称;
    }

    public String get医嘱项目类型代码() {
        return 医嘱项目类型代码;
    }

    public void set医嘱项目类型代码(String 医嘱项目类型代码) {
        this.医嘱项目类型代码 = 医嘱项目类型代码;
    }

    public String get医嘱项目类型名称() {
        return 医嘱项目类型名称;
    }

    public void set医嘱项目类型名称(String 医嘱项目类型名称) {
        this.医嘱项目类型名称 = 医嘱项目类型名称;
    }

    public String get医嘱项目内容() {
        return 医嘱项目内容;
    }

    public void set医嘱项目内容(String 医嘱项目内容) {
        this.医嘱项目内容 = 医嘱项目内容;
    }

    public String get医嘱计划开始日期吋间() {
        return 医嘱计划开始日期吋间;
    }

    public void set医嘱计划开始日期吋间(String 医嘱计划开始日期吋间) {
        this.医嘱计划开始日期吋间 = 医嘱计划开始日期吋间;
    }

    public String get医嘱计划结束日期时间() {
        return 医嘱计划结束日期时间;
    }

    public void set医嘱计划结束日期时间(String 医嘱计划结束日期时间) {
        this.医嘱计划结束日期时间 = 医嘱计划结束日期时间;
    }

    public String get医嘱备注信息() {
        return 医嘱备注信息;
    }

    public void set医嘱备注信息(String 医嘱备注信息) {
        this.医嘱备注信息 = 医嘱备注信息;
    }

    public String get医嘱开立者签名() {
        return 医嘱开立者签名;
    }

    public void set医嘱开立者签名(String 医嘱开立者签名) {
        this.医嘱开立者签名 = 医嘱开立者签名;
    }

    public String get医嘱开立日期时间() {
        return 医嘱开立日期时间;
    }

    public void set医嘱开立日期时间(String 医嘱开立日期时间) {
        this.医嘱开立日期时间 = 医嘱开立日期时间;
    }

    public String get医嘱开立科室() {
        return 医嘱开立科室;
    }

    public void set医嘱开立科室(String 医嘱开立科室) {
        this.医嘱开立科室 = 医嘱开立科室;
    }

    public String get医嘱审核人签名() {
        return 医嘱审核人签名;
    }

    public void set医嘱审核人签名(String 医嘱审核人签名) {
        this.医嘱审核人签名 = 医嘱审核人签名;
    }

    public String get医嘱审核日期时间() {
        return 医嘱审核日期时间;
    }

    public void set医嘱审核日期时间(String 医嘱审核日期时间) {
        this.医嘱审核日期时间 = 医嘱审核日期时间;
    }

    public String get核对医嘱护士签名() {
        return 核对医嘱护士签名;
    }

    public void set核对医嘱护士签名(String 核对医嘱护士签名) {
        this.核对医嘱护士签名 = 核对医嘱护士签名;
    }

    public String get医嘱核对日期时间() {
        return 医嘱核对日期时间;
    }

    public void set医嘱核对日期时间(String 医嘱核对日期时间) {
        this.医嘱核对日期时间 = 医嘱核对日期时间;
    }

    public String get医嘱执行者签名() {
        return 医嘱执行者签名;
    }

    public void set医嘱执行者签名(String 医嘱执行者签名) {
        this.医嘱执行者签名 = 医嘱执行者签名;
    }

    public String get医嘱执行日期时间() {
        return 医嘱执行日期时间;
    }

    public void set医嘱执行日期时间(String 医嘱执行日期时间) {
        this.医嘱执行日期时间 = 医嘱执行日期时间;
    }

    public String get医嘱执行科室() {
        return 医嘱执行科室;
    }

    public void set医嘱执行科室(String 医嘱执行科室) {
        this.医嘱执行科室 = 医嘱执行科室;
    }

    public String get医嘱执行状态() {
        return 医嘱执行状态;
    }

    public void set医嘱执行状态(String 医嘱执行状态) {
        this.医嘱执行状态 = 医嘱执行状态;
    }

    public String get医嘱停止日期时间() {
        return 医嘱停止日期时间;
    }

    public void set医嘱停止日期时间(String 医嘱停止日期时间) {
        this.医嘱停止日期时间 = 医嘱停止日期时间;
    }

    public String get停止医嘱者签名() {
        return 停止医嘱者签名;
    }

    public void set停止医嘱者签名(String 停止医嘱者签名) {
        this.停止医嘱者签名 = 停止医嘱者签名;
    }

    public String get医嘱取消日期时间() {
        return 医嘱取消日期时间;
    }

    public void set医嘱取消日期时间(String 医嘱取消日期时间) {
        this.医嘱取消日期时间 = 医嘱取消日期时间;
    }

    public String get取消医嘱者签名() {
        return 取消医嘱者签名;
    }

    public void set取消医嘱者签名(String 取消医嘱者签名) {
        this.取消医嘱者签名 = 取消医嘱者签名;
    }
}
