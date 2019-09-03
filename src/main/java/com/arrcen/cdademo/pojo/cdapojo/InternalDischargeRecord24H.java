package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈24H内入出院记录〉
 */
@Entity
@Table(name = "PUB12_24H内入出院记录")
public class InternalDischargeRecord24H implements Serializable {

    private static final long serialVersionUID = 8499812497442105302L;
    @Id
    private String 系统序号;
    private String 住院号;
    private String 患者姓名;
    private String 性别代码;
    @Transient
    @JsonIgnore
    private String 性别;
    private Byte 年龄岁;
    private String 年龄月;
    private String 民族;
    @Transient
    @JsonIgnore
    private String 民族名称;
    private String 婚姻状况代码;
    @Transient
    @JsonIgnore
    private String 婚姻状况;
    private String 地址_省;
    private String 地址_市;
    private String 地址_县;
    private String 地址_乡;
    private String 地址_村;
    private String 地址_门牌号码;
    private String 职业类别代码;
    @Transient
    @JsonIgnore
    private String 职业类别;
    private String 病史陈述者姓名;
    private String 陈述者与患者的关系代码;
    @Transient
    @JsonIgnore
    private String 陈述者与患者的关系;
    private String 陈述内容可靠标志;
    private String 入院日期时间;
    private String 出院日期时间;
    private String 主诉;
    private String 现病史;
    private String 入院情况;
    private String 症状名称;
    private String 症状描述;
    private String 中医四诊观察结果;
    private String 治则治法;
    private String 入院诊断_西医诊断名称;
    private String 入院诊断_西医诊断编码;
    private String 入院诊断_中医病名名称;
    private String 入院诊断_中医病名代码;
    private String 入院诊断_中医证候名称;
    private String 入院诊断_中医证候代码;
    private String 诊疗过程描述;
    private String 出院情况;
    private String 出院诊断_西医诊断名称;
    private String 出院诊断_西医诊断编码;
    private String 出院诊断_中医病名名称;
    private String 出院诊断_中医病名代码;
    private String 出院诊断_中医证候名称;
    private String 出院诊断_中医证候代码;
    private String 出院医嘱;
    private String 出院医嘱开立人签名;
    private String 出院医嘱开立日期时间;
    private String 接诊医师签名;
    private String 住院医师签名;
    private String 主治医师签名;
    private String 主任医师签名;


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

    public String get民族() {
        return 民族;
    }

    public void set民族(String 民族) {
        this.民族 = 民族;
    }

    public String get民族名称() {
        return 民族名称;
    }

    public void set民族名称(String 民族名称) {
        this.民族名称 = 民族名称;
    }

    public String get婚姻状况代码() {
        return 婚姻状况代码;
    }

    public void set婚姻状况代码(String 婚姻状况代码) {
        this.婚姻状况代码 = 婚姻状况代码;
    }

    public String get婚姻状况() {
        return 婚姻状况;
    }

    public void set婚姻状况(String 婚姻状况) {
        this.婚姻状况 = 婚姻状况;
    }

    public String get地址_省() {
        return 地址_省;
    }

    public void set地址_省(String 地址_省) {
        this.地址_省 = 地址_省;
    }

    public String get地址_市() {
        return 地址_市;
    }

    public void set地址_市(String 地址_市) {
        this.地址_市 = 地址_市;
    }

    public String get地址_县() {
        return 地址_县;
    }

    public void set地址_县(String 地址_县) {
        this.地址_县 = 地址_县;
    }

    public String get地址_乡() {
        return 地址_乡;
    }

    public void set地址_乡(String 地址_乡) {
        this.地址_乡 = 地址_乡;
    }

    public String get地址_村() {
        return 地址_村;
    }

    public void set地址_村(String 地址_村) {
        this.地址_村 = 地址_村;
    }

    public String get地址_门牌号码() {
        return 地址_门牌号码;
    }

    public void set地址_门牌号码(String 地址_门牌号码) {
        this.地址_门牌号码 = 地址_门牌号码;
    }

    public String get职业类别代码() {
        return 职业类别代码;
    }

    public void set职业类别代码(String 职业类别代码) {
        this.职业类别代码 = 职业类别代码;
    }

    public String get职业类别() {
        return 职业类别;
    }

    public void set职业类别(String 职业类别) {
        this.职业类别 = 职业类别;
    }

    public String get病史陈述者姓名() {
        return 病史陈述者姓名;
    }

    public void set病史陈述者姓名(String 病史陈述者姓名) {
        this.病史陈述者姓名 = 病史陈述者姓名;
    }

    public String get陈述者与患者的关系代码() {
        return 陈述者与患者的关系代码;
    }

    public void set陈述者与患者的关系代码(String 陈述者与患者的关系代码) {
        this.陈述者与患者的关系代码 = 陈述者与患者的关系代码;
    }

    public String get陈述者与患者的关系() {
        return 陈述者与患者的关系;
    }

    public void set陈述者与患者的关系(String 陈述者与患者的关系) {
        this.陈述者与患者的关系 = 陈述者与患者的关系;
    }

    public String get陈述内容可靠标志() {
        return 陈述内容可靠标志;
    }

    public void set陈述内容可靠标志(String 陈述内容可靠标志) {
        this.陈述内容可靠标志 = 陈述内容可靠标志;
    }

    public String get入院日期时间() {
        return 入院日期时间;
    }

    public void set入院日期时间(String 入院日期时间) {
        this.入院日期时间 = 入院日期时间;
    }

    public String get出院日期时间() {
        return 出院日期时间;
    }

    public void set出院日期时间(String 出院日期时间) {
        this.出院日期时间 = 出院日期时间;
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

    public String get入院情况() {
        return 入院情况;
    }

    public void set入院情况(String 入院情况) {
        this.入院情况 = 入院情况;
    }

    public String get症状名称() {
        return 症状名称;
    }

    public void set症状名称(String 症状名称) {
        this.症状名称 = 症状名称;
    }

    public String get症状描述() {
        return 症状描述;
    }

    public void set症状描述(String 症状描述) {
        this.症状描述 = 症状描述;
    }

    public String get中医四诊观察结果() {
        return 中医四诊观察结果;
    }

    public void set中医四诊观察结果(String 中医四诊观察结果) {
        this.中医四诊观察结果 = 中医四诊观察结果;
    }

    public String get治则治法() {
        return 治则治法;
    }

    public void set治则治法(String 治则治法) {
        this.治则治法 = 治则治法;
    }

    public String get入院诊断_西医诊断名称() {
        return 入院诊断_西医诊断名称;
    }

    public void set入院诊断_西医诊断名称(String 入院诊断_西医诊断名称) {
        this.入院诊断_西医诊断名称 = 入院诊断_西医诊断名称;
    }

    public String get入院诊断_西医诊断编码() {
        return 入院诊断_西医诊断编码;
    }

    public void set入院诊断_西医诊断编码(String 入院诊断_西医诊断编码) {
        this.入院诊断_西医诊断编码 = 入院诊断_西医诊断编码;
    }

    public String get入院诊断_中医病名名称() {
        return 入院诊断_中医病名名称;
    }

    public void set入院诊断_中医病名名称(String 入院诊断_中医病名名称) {
        this.入院诊断_中医病名名称 = 入院诊断_中医病名名称;
    }

    public String get入院诊断_中医病名代码() {
        return 入院诊断_中医病名代码;
    }

    public void set入院诊断_中医病名代码(String 入院诊断_中医病名代码) {
        this.入院诊断_中医病名代码 = 入院诊断_中医病名代码;
    }

    public String get入院诊断_中医证候名称() {
        return 入院诊断_中医证候名称;
    }

    public void set入院诊断_中医证候名称(String 入院诊断_中医证候名称) {
        this.入院诊断_中医证候名称 = 入院诊断_中医证候名称;
    }

    public String get入院诊断_中医证候代码() {
        return 入院诊断_中医证候代码;
    }

    public void set入院诊断_中医证候代码(String 入院诊断_中医证候代码) {
        this.入院诊断_中医证候代码 = 入院诊断_中医证候代码;
    }

    public String get诊疗过程描述() {
        return 诊疗过程描述;
    }

    public void set诊疗过程描述(String 诊疗过程描述) {
        this.诊疗过程描述 = 诊疗过程描述;
    }

    public String get出院情况() {
        return 出院情况;
    }

    public void set出院情况(String 出院情况) {
        this.出院情况 = 出院情况;
    }

    public String get出院诊断_西医诊断名称() {
        return 出院诊断_西医诊断名称;
    }

    public void set出院诊断_西医诊断名称(String 出院诊断_西医诊断名称) {
        this.出院诊断_西医诊断名称 = 出院诊断_西医诊断名称;
    }

    public String get出院诊断_西医诊断编码() {
        return 出院诊断_西医诊断编码;
    }

    public void set出院诊断_西医诊断编码(String 出院诊断_西医诊断编码) {
        this.出院诊断_西医诊断编码 = 出院诊断_西医诊断编码;
    }

    public String get出院诊断_中医病名名称() {
        return 出院诊断_中医病名名称;
    }

    public void set出院诊断_中医病名名称(String 出院诊断_中医病名名称) {
        this.出院诊断_中医病名名称 = 出院诊断_中医病名名称;
    }

    public String get出院诊断_中医病名代码() {
        return 出院诊断_中医病名代码;
    }

    public void set出院诊断_中医病名代码(String 出院诊断_中医病名代码) {
        this.出院诊断_中医病名代码 = 出院诊断_中医病名代码;
    }

    public String get出院诊断_中医证候名称() {
        return 出院诊断_中医证候名称;
    }

    public void set出院诊断_中医证候名称(String 出院诊断_中医证候名称) {
        this.出院诊断_中医证候名称 = 出院诊断_中医证候名称;
    }

    public String get出院诊断_中医证候代码() {
        return 出院诊断_中医证候代码;
    }

    public void set出院诊断_中医证候代码(String 出院诊断_中医证候代码) {
        this.出院诊断_中医证候代码 = 出院诊断_中医证候代码;
    }

    public String get出院医嘱() {
        return 出院医嘱;
    }

    public void set出院医嘱(String 出院医嘱) {
        this.出院医嘱 = 出院医嘱;
    }

    public String get出院医嘱开立人签名() {
        return 出院医嘱开立人签名;
    }

    public void set出院医嘱开立人签名(String 出院医嘱开立人签名) {
        this.出院医嘱开立人签名 = 出院医嘱开立人签名;
    }

    public String get出院医嘱开立日期时间() {
        return 出院医嘱开立日期时间;
    }

    public void set出院医嘱开立日期时间(String 出院医嘱开立日期时间) {
        this.出院医嘱开立日期时间 = 出院医嘱开立日期时间;
    }

    public String get接诊医师签名() {
        return 接诊医师签名;
    }

    public void set接诊医师签名(String 接诊医师签名) {
        this.接诊医师签名 = 接诊医师签名;
    }

    public String get住院医师签名() {
        return 住院医师签名;
    }

    public void set住院医师签名(String 住院医师签名) {
        this.住院医师签名 = 住院医师签名;
    }

    public String get主治医师签名() {
        return 主治医师签名;
    }

    public void set主治医师签名(String 主治医师签名) {
        this.主治医师签名 = 主治医师签名;
    }

    public String get主任医师签名() {
        return 主任医师签名;
    }

    public void set主任医师签名(String 主任医师签名) {
        this.主任医师签名 = 主任医师签名;
    }
}
