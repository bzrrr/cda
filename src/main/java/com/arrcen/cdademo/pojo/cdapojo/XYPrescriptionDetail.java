package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈西药处方明细〉
 *
 */
@Entity
@Table(name = "PUB03_西药处方明细")
public class XYPrescriptionDetail implements Serializable {

    private static final long serialVersionUID = 1844934011342373763L;
    @Id
    private String 系统序号;
    private String 单据序号;
    private String 药物名称;
    private String 药物规格;
    private String 药物剂型代码;
    @Transient
    @JsonIgnore
    private String 药物剂型值;
    private Integer 药物使用次剂量;
    private String 药物使用剂量单位;
    private String 药物使用频次代码;
    @Transient
    @JsonIgnore
    private String 药物使用频次;
    private String 用药途径代码;
    @Transient
    @JsonIgnore
    private String 用药途径;
    private String 药物使用总剂量;
    private String 处方药品组号;

    public String get药物剂型值() {
        return 药物剂型值;
    }

    public void set药物剂型值(String 药物剂型值) {
        this.药物剂型值 = 药物剂型值;
    }

    public String get药物使用频次() {
        return 药物使用频次;
    }

    public void set药物使用频次(String 药物使用频次) {
        this.药物使用频次 = 药物使用频次;
    }

    public String get用药途径() {
        return 用药途径;
    }

    public void set用药途径(String 用药途径) {
        this.用药途径 = 用药途径;
    }

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

    public String get药物名称() {
        return 药物名称;
    }

    public void set药物名称(String 药物名称) {
        this.药物名称 = 药物名称;
    }

    public String get药物规格() {
        return 药物规格;
    }

    public void set药物规格(String 药物规格) {
        this.药物规格 = 药物规格;
    }

    public String get药物剂型代码() {
        return 药物剂型代码;
    }

    public void set药物剂型代码(String 药物剂型代码) {
        this.药物剂型代码 = 药物剂型代码;
    }

    public Integer get药物使用次剂量() {
        return 药物使用次剂量;
    }

    public void set药物使用次剂量(Integer 药物使用次剂量) {
        this.药物使用次剂量 = 药物使用次剂量;
    }

    public String get药物使用剂量单位() {
        return 药物使用剂量单位;
    }

    public void set药物使用剂量单位(String 药物使用剂量单位) {
        this.药物使用剂量单位 = 药物使用剂量单位;
    }

    public String get药物使用频次代码() {
        return 药物使用频次代码;
    }

    public void set药物使用频次代码(String 药物使用频次代码) {
        this.药物使用频次代码 = 药物使用频次代码;
    }

    public String get用药途径代码() {
        return 用药途径代码;
    }

    public void set用药途径代码(String 用药途径代码) {
        this.用药途径代码 = 用药途径代码;
    }

    public String get药物使用总剂量() {
        return 药物使用总剂量;
    }

    public void set药物使用总剂量(String 药物使用总剂量) {
        this.药物使用总剂量 = 药物使用总剂量;
    }

    public String get处方药品组号() {
        return 处方药品组号;
    }

    public void set处方药品组号(String 处方药品组号) {
        this.处方药品组号 = 处方药品组号;
    }
}
