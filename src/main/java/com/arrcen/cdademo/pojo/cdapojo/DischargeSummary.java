package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈出院小结记录〉
 */
@Entity
@Table(name = "PUB15_出院小结记录")
public class DischargeSummary implements Serializable {

    private static final long serialVersionUID = 7382258888305268332L;
    @Id
    private String 系统序号;
    private String 医疗机构组织机构代码;
    private String 居民健康卡号;
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
    private String 婚姻状况代码;
    @Transient
    @JsonIgnore
    private String 婚姻状况;
    private String 职业类别代码;
    @Transient
    @JsonIgnore
    private String 职业类别名称;
    private String 患者电话号码;
    private String 地址类别代码;
    private String 地址_省;
    private String 地址_市;
    private String 地址_县;
    private String 地址_乡;
    private String 地址_村;
    private String 地址_门牌号码;
    private String 邮政编码;
    private String 联系人姓名;
    private String 联系人电话号码;
    private String 入院日期时间;
    private String 出院日期时间;
    private Long 实际住院天数;
    private String 入院情况;
    private String 阳性辅助检查结果;
    private String 中医四诊观察结果;
    private String 入院诊断_西医诊断编码;
    private String 入院诊断_中医病名代码;
    private String 入院诊断_中医证候代码;
    private String 出院诊断_西医诊断编码;
    private String 出院诊断_中医病名代码;
    private String 出院诊断_中医证候代码;
    private String 手术切口类别代码;
    private String 手术切口愈合等级代码;
    @Transient
    @JsonIgnore
    private String 手术切口愈合等级;
    private String 手术及操作编码;
    private String 手术及操作开始日期时间;
    private String 麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 麻醉方法名称;
    private String 手术过程;
    private String 治则治法;
    private String 中药煎煮方法;
    private String 中药用药方法;
    private String 诊疗过程描述;
    private String 出院情况;
    private String 出院时症状与体征;
    private String 出院医嘱;
    private String 病情转归代码;
    private String 住院医师签名;
    private String 上级医师签名;
    private String 签名日期时间;


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

    public String get居民健康卡号() {
        return 居民健康卡号;
    }

    public void set居民健康卡号(String 居民健康卡号) {
        this.居民健康卡号 = 居民健康卡号;
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

    public String get职业类别代码() {
        return 职业类别代码;
    }

    public void set职业类别代码(String 职业类别代码) {
        this.职业类别代码 = 职业类别代码;
    }

    public String get职业类别名称() {
        return 职业类别名称;
    }

    public void set职业类别名称(String 职业类别名称) {
        this.职业类别名称 = 职业类别名称;
    }

    public String get患者电话号码() {
        return 患者电话号码;
    }

    public void set患者电话号码(String 患者电话号码) {
        this.患者电话号码 = 患者电话号码;
    }

    public String get地址类别代码() {
        return 地址类别代码;
    }

    public void set地址类别代码(String 地址类别代码) {
        this.地址类别代码 = 地址类别代码;
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

    public String get邮政编码() {
        return 邮政编码;
    }

    public void set邮政编码(String 邮政编码) {
        this.邮政编码 = 邮政编码;
    }

    public String get联系人姓名() {
        return 联系人姓名;
    }

    public void set联系人姓名(String 联系人姓名) {
        this.联系人姓名 = 联系人姓名;
    }

    public String get联系人电话号码() {
        return 联系人电话号码;
    }

    public void set联系人电话号码(String 联系人电话号码) {
        this.联系人电话号码 = 联系人电话号码;
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

    public Long get实际住院天数() {
        return 实际住院天数;
    }

    public void set实际住院天数(Long 实际住院天数) {
        this.实际住院天数 = 实际住院天数;
    }

    public String get入院情况() {
        return 入院情况;
    }

    public void set入院情况(String 入院情况) {
        this.入院情况 = 入院情况;
    }

    public String get阳性辅助检查结果() {
        return 阳性辅助检查结果;
    }

    public void set阳性辅助检查结果(String 阳性辅助检查结果) {
        this.阳性辅助检查结果 = 阳性辅助检查结果;
    }

    public String get中医四诊观察结果() {
        return 中医四诊观察结果;
    }

    public void set中医四诊观察结果(String 中医四诊观察结果) {
        this.中医四诊观察结果 = 中医四诊观察结果;
    }

    public String get入院诊断_西医诊断编码() {
        return 入院诊断_西医诊断编码;
    }

    public void set入院诊断_西医诊断编码(String 入院诊断_西医诊断编码) {
        this.入院诊断_西医诊断编码 = 入院诊断_西医诊断编码;
    }

    public String get入院诊断_中医病名代码() {
        return 入院诊断_中医病名代码;
    }

    public void set入院诊断_中医病名代码(String 入院诊断_中医病名代码) {
        this.入院诊断_中医病名代码 = 入院诊断_中医病名代码;
    }

    public String get入院诊断_中医证候代码() {
        return 入院诊断_中医证候代码;
    }

    public void set入院诊断_中医证候代码(String 入院诊断_中医证候代码) {
        this.入院诊断_中医证候代码 = 入院诊断_中医证候代码;
    }

    public String get出院诊断_西医诊断编码() {
        return 出院诊断_西医诊断编码;
    }

    public void set出院诊断_西医诊断编码(String 出院诊断_西医诊断编码) {
        this.出院诊断_西医诊断编码 = 出院诊断_西医诊断编码;
    }

    public String get出院诊断_中医病名代码() {
        return 出院诊断_中医病名代码;
    }

    public void set出院诊断_中医病名代码(String 出院诊断_中医病名代码) {
        this.出院诊断_中医病名代码 = 出院诊断_中医病名代码;
    }

    public String get出院诊断_中医证候代码() {
        return 出院诊断_中医证候代码;
    }

    public void set出院诊断_中医证候代码(String 出院诊断_中医证候代码) {
        this.出院诊断_中医证候代码 = 出院诊断_中医证候代码;
    }

    public String get手术切口类别代码() {
        return 手术切口类别代码;
    }

    public void set手术切口类别代码(String 手术切口类别代码) {
        this.手术切口类别代码 = 手术切口类别代码;
    }

    public String get手术切口愈合等级代码() {
        return 手术切口愈合等级代码;
    }

    public void set手术切口愈合等级代码(String 手术切口愈合等级代码) {
        this.手术切口愈合等级代码 = 手术切口愈合等级代码;
    }

    public String get手术切口愈合等级() {
        return 手术切口愈合等级;
    }

    public void set手术切口愈合等级(String 手术切口愈合等级) {
        this.手术切口愈合等级 = 手术切口愈合等级;
    }

    public String get手术及操作编码() {
        return 手术及操作编码;
    }

    public void set手术及操作编码(String 手术及操作编码) {
        this.手术及操作编码 = 手术及操作编码;
    }

    public String get手术及操作开始日期时间() {
        return 手术及操作开始日期时间;
    }

    public void set手术及操作开始日期时间(String 手术及操作开始日期时间) {
        this.手术及操作开始日期时间 = 手术及操作开始日期时间;
    }

    public String get麻醉方法代码() {
        return 麻醉方法代码;
    }

    public void set麻醉方法代码(String 麻醉方法代码) {
        this.麻醉方法代码 = 麻醉方法代码;
    }

    public String get麻醉方法名称() {
        return 麻醉方法名称;
    }

    public void set麻醉方法名称(String 麻醉方法名称) {
        this.麻醉方法名称 = 麻醉方法名称;
    }

    public String get手术过程() {
        return 手术过程;
    }

    public void set手术过程(String 手术过程) {
        this.手术过程 = 手术过程;
    }

    public String get治则治法() {
        return 治则治法;
    }

    public void set治则治法(String 治则治法) {
        this.治则治法 = 治则治法;
    }

    public String get中药煎煮方法() {
        return 中药煎煮方法;
    }

    public void set中药煎煮方法(String 中药煎煮方法) {
        this.中药煎煮方法 = 中药煎煮方法;
    }

    public String get中药用药方法() {
        return 中药用药方法;
    }

    public void set中药用药方法(String 中药用药方法) {
        this.中药用药方法 = 中药用药方法;
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

    public String get出院时症状与体征() {
        return 出院时症状与体征;
    }

    public void set出院时症状与体征(String 出院时症状与体征) {
        this.出院时症状与体征 = 出院时症状与体征;
    }

    public String get出院医嘱() {
        return 出院医嘱;
    }

    public void set出院医嘱(String 出院医嘱) {
        this.出院医嘱 = 出院医嘱;
    }

    public String get病情转归代码() {
        return 病情转归代码;
    }

    public void set病情转归代码(String 病情转归代码) {
        this.病情转归代码 = 病情转归代码;
    }

    public String get住院医师签名() {
        return 住院医师签名;
    }

    public void set住院医师签名(String 住院医师签名) {
        this.住院医师签名 = 住院医师签名;
    }

    public String get上级医师签名() {
        return 上级医师签名;
    }

    public void set上级医师签名(String 上级医师签名) {
        this.上级医师签名 = 上级医师签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
