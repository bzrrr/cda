package com.arrcen.cdademo.pojo.cdapojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 〈门急诊病历医嘱明细〉
 *
 */
@Entity
@Table(name = "PUB02_门急诊病历医嘱明细")
public class MJZRecordDetail implements Serializable {

    private static final long serialVersionUID = 7937169630747246794L;
    @Id
    private String 系统序号;
    private String 单据序号;
    private String 医嘱项目类型代码;
    private String 医嘱项目内容;
    private String 医嘱备注信息;
    private String 医嘱开立科室;
    private String 医嘱开立者签名;
    private String 医嘱开立日期时间;
    private String 医嘱审核者签名;
    private String 医嘱审核日期时间;
    private String 医嘱执行科室;
    private String 医嘱执行者签名;
    private String 医嘱执行日期时间;
    private String 医嘱执行状态;
    private String 取消医嘱者签名;
    private String 医嘱取消日期时间;
    private String 电子申请单编号;

    public String get系统序号() {
        return 系统序号;
    }

    public void set系统序号(String 系统序号) {
        this.系统序号 = 系统序号;
    }

    public String get单据序号() {
        return 单据序号;
    }

    public void set单据序号(String 单据序号) {
        this.单据序号 = 单据序号;
    }

    public String get医嘱项目类型代码() {
        return 医嘱项目类型代码;
    }

    public void set医嘱项目类型代码(String 医嘱项目类型代码) {
        this.医嘱项目类型代码 = 医嘱项目类型代码;
    }

    public String get医嘱项目内容() {
        return 医嘱项目内容;
    }

    public void set医嘱项目内容(String 医嘱项目内容) {
        this.医嘱项目内容 = 医嘱项目内容;
    }

    public String get医嘱备注信息() {
        return 医嘱备注信息;
    }

    public void set医嘱备注信息(String 医嘱备注信息) {
        this.医嘱备注信息 = 医嘱备注信息;
    }

    public String get医嘱开立科室() {
        return 医嘱开立科室;
    }

    public void set医嘱开立科室(String 医嘱开立科室) {
        this.医嘱开立科室 = 医嘱开立科室;
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

    public String get医嘱审核者签名() {
        return 医嘱审核者签名;
    }

    public void set医嘱审核者签名(String 医嘱审核者签名) {
        this.医嘱审核者签名 = 医嘱审核者签名;
    }

    public String get医嘱审核日期时间() {
        return 医嘱审核日期时间;
    }

    public void set医嘱审核日期时间(String 医嘱审核日期时间) {
        this.医嘱审核日期时间 = 医嘱审核日期时间;
    }

    public String get医嘱执行科室() {
        return 医嘱执行科室;
    }

    public void set医嘱执行科室(String 医嘱执行科室) {
        this.医嘱执行科室 = 医嘱执行科室;
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

    public String get医嘱执行状态() {
        return 医嘱执行状态;
    }

    public void set医嘱执行状态(String 医嘱执行状态) {
        this.医嘱执行状态 = 医嘱执行状态;
    }

    public String get取消医嘱者签名() {
        return 取消医嘱者签名;
    }

    public void set取消医嘱者签名(String 取消医嘱者签名) {
        this.取消医嘱者签名 = 取消医嘱者签名;
    }

    public String get医嘱取消日期时间() {
        return 医嘱取消日期时间;
    }

    public void set医嘱取消日期时间(String 医嘱取消日期时间) {
        this.医嘱取消日期时间 = 医嘱取消日期时间;
    }

    public String get电子申请单编号() {
        return 电子申请单编号;
    }

    public void set电子申请单编号(String 电子申请单编号) {
        this.电子申请单编号 = 电子申请单编号;
    }
}
