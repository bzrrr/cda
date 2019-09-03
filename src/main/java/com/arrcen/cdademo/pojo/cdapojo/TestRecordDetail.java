package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈检验记录明细〉
 *
 */
@Entity
@Table(name = "PUB04_检验记录明细")
public class TestRecordDetail implements Serializable {

    private static final long serialVersionUID = 8230696156775741916L;
    @Id
    private String 系统序号;
    private String 单据序号;
    private String 检验项目代码;
    @Transient
    @JsonIgnore
    private String 检验项目;
    private String 检验结果代码;
    @Transient
    @JsonIgnore
    private String 检验结果;
    private Long 检验定量结果;
    private String 检验定量结果计量单位;

//    public String get检验项目() {
//        return 检验项目;
//    }
//
//    public void set检验项目(String 检验项目) {
//        this.检验项目 = 检验项目;
//    }

    public String get检验结果() {
        return 检验结果;
    }

    public void set检验结果(String 检验结果) {
        this.检验结果 = 检验结果;
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

    public String get检验项目代码() {
        return 检验项目代码;
    }

    public void set检验项目代码(String 检验项目代码) {
        this.检验项目代码 = 检验项目代码;
    }

    public String get检验结果代码() {
        return 检验结果代码;
    }

    public void set检验结果代码(String 检验结果代码) {
        this.检验结果代码 = 检验结果代码;
    }

    public Long get检验定量结果() {
        return 检验定量结果;
    }

    public void set检验定量结果(Long 检验定量结果) {
        this.检验定量结果 = 检验定量结果;
    }

    public String get检验定量结果计量单位() {
        return 检验定量结果计量单位;
    }

    public void set检验定量结果计量单位(String 检验定量结果计量单位) {
        this.检验定量结果计量单位 = 检验定量结果计量单位;
    }
}
