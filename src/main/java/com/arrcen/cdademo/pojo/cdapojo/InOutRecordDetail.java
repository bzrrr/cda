package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈出入量记录药物明细〉
 */
@Entity
@Table(name = "PUB07_出入量记录药物明细")
public class InOutRecordDetail implements Serializable {

    @Id
    private String 系统序号;
    private String 单据序号;
    private String 药物用法;
    private String 中药使用类别代码;
    @Transient
    @JsonIgnore
    private String 中药使用类别;
    private String 药物使用频率;
    private String 药物使用剂量单位;
    private Long 药物使用次剂量;
    private String 药物使用总剂量;
    private String 用药途径代码;
    @Transient
    @JsonIgnore
    private String 用药途径;
    private String 药物名称;


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

    public String get中药使用类别() {
        return 中药使用类别;
    }

    public void set中药使用类别(String 中药使用类别) {
        this.中药使用类别 = 中药使用类别;
    }

    public String get药物使用频率() {
        return 药物使用频率;
    }

    public void set药物使用频率(String 药物使用频率) {
        this.药物使用频率 = 药物使用频率;
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

    public String get药物名称() {
        return 药物名称;
    }

    public void set药物名称(String 药物名称) {
        this.药物名称 = 药物名称;
    }
}
