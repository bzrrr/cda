package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈入院记录〉
 */
@Entity
@Table(name = "PUB12_入院记录")
public class AdmissionRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 住院号;
    private String 病区名称;
    private String 科室名称;
    private String 病房号;
    private String 病床号;
    private String 患者姓名;
    private String 性别代码;
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
    private String 入院日期时间;
    private String 病史陈述者姓名;
    private String 陈述者与患者的关系代码;
    @Transient
    @JsonIgnore
    private String 陈述者与患者的关系;
    private String 陈述内容可靠标志;
    private String 主诉;
    private String 现病史;
    private String 一般健康状况标志;
    private String 疾病史;
    private String 患者传染性标志;
    private String 传染病史;
    private String 预防接种史;
    private String 手术史;
    private String 输血史;
    private String 过敏史;
    private String 个人史;
    private String 婚育史;
    private String 月经史;
    private String 家族史;
    private Long 体格检查_体温;
    private Byte 体格检查_脉率;
    private Byte 体格检查_呼吸频率;
    private Byte 体格检查_收缩压;
    private Byte 体格检查_舒张压;
    private Long 体格检查_身高;
    private Long 体格检查_体重;
    private String 体格检查_一般状况检查结果;
    private String 体格检查_皮肤和粘膜检查结果;
    private String 体格检查_浅表淋巴结检查结果;
    private String 体格检查_头部及其器官检查结果;
    private String 体格检查_颈部检查结果;
    private String 体格检查_胸部检查结果;
    private String 体格检查_腹部检查结果;
    private String 体格检查_肛门指诊检查结果描述;
    private String 体格检查_外生殖器检查结果;
    private String 体格检查_脊柱检查结果;
    private String 体格检查_四肢检查结果;
    private String 体格检查_神经系统检查结果;
    private String 专科情况;
    private String 辅助检查结果;
    private String 中医四诊观察结果;
    private String 治则治法;
    private String 初步诊断_西医诊断名称;
    private String 初步诊断_西医诊断编码;
    private String 初步诊断_中医病名名称;
    private String 初步诊断_中医病名代码;
    private String 初步诊断_中医证候名称;
    private String 初步诊断_中医证候代码;
    private String 初步诊断日期;
    private String 修正诊断_西医诊断名称;
    private String 修正诊断_西医诊断编码;
    private String 修正诊断_中医病名名称;
    private String 修正诊断_中医病名代码;
    private String 修正诊断_中医证候名称;
    private String 修正诊断_中医证候代码;
    private String 修正诊断日期;
    private String 确定诊断_西医诊断名称;
    private String 确定诊断_西医诊断编码;
    private String 确定诊断_中医病名名称;
    private String 确定诊断_中医病名代码;
    private String 确定诊断_中医证候名称;
    private String 确定诊断_中医证候代码;
    private String 确定诊断日期;
    private String 补充诊断名称;
    private String 补充诊断编码;
    private String 补充诊断日期;
    private String 入院诊断顺位;
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

    public String get病区名称() {
        return 病区名称;
    }

    public void set病区名称(String 病区名称) {
        this.病区名称 = 病区名称;
    }

    public String get科室名称() {
        return 科室名称;
    }

    public void set科室名称(String 科室名称) {
        this.科室名称 = 科室名称;
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

    public String get入院日期时间() {
        return 入院日期时间;
    }

    public void set入院日期时间(String 入院日期时间) {
        this.入院日期时间 = 入院日期时间;
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

    public String get一般健康状况标志() {
        return 一般健康状况标志;
    }

    public void set一般健康状况标志(String 一般健康状况标志) {
        this.一般健康状况标志 = 一般健康状况标志;
    }

    public String get疾病史() {
        return 疾病史;
    }

    public void set疾病史(String 疾病史) {
        this.疾病史 = 疾病史;
    }

    public String get患者传染性标志() {
        return 患者传染性标志;
    }

    public void set患者传染性标志(String 患者传染性标志) {
        this.患者传染性标志 = 患者传染性标志;
    }

    public String get传染病史() {
        return 传染病史;
    }

    public void set传染病史(String 传染病史) {
        this.传染病史 = 传染病史;
    }

    public String get预防接种史() {
        return 预防接种史;
    }

    public void set预防接种史(String 预防接种史) {
        this.预防接种史 = 预防接种史;
    }

    public String get手术史() {
        return 手术史;
    }

    public void set手术史(String 手术史) {
        this.手术史 = 手术史;
    }

    public String get输血史() {
        return 输血史;
    }

    public void set输血史(String 输血史) {
        this.输血史 = 输血史;
    }

    public String get过敏史() {
        return 过敏史;
    }

    public void set过敏史(String 过敏史) {
        this.过敏史 = 过敏史;
    }

    public String get个人史() {
        return 个人史;
    }

    public void set个人史(String 个人史) {
        this.个人史 = 个人史;
    }

    public String get婚育史() {
        return 婚育史;
    }

    public void set婚育史(String 婚育史) {
        this.婚育史 = 婚育史;
    }

    public String get月经史() {
        return 月经史;
    }

    public void set月经史(String 月经史) {
        this.月经史 = 月经史;
    }

    public String get家族史() {
        return 家族史;
    }

    public void set家族史(String 家族史) {
        this.家族史 = 家族史;
    }

    public Long get体格检查_体温() {
        return 体格检查_体温;
    }

    public void set体格检查_体温(Long 体格检查_体温) {
        this.体格检查_体温 = 体格检查_体温;
    }

    public Byte get体格检查_脉率() {
        return 体格检查_脉率;
    }

    public void set体格检查_脉率(Byte 体格检查_脉率) {
        this.体格检查_脉率 = 体格检查_脉率;
    }

    public Byte get体格检查_呼吸频率() {
        return 体格检查_呼吸频率;
    }

    public void set体格检查_呼吸频率(Byte 体格检查_呼吸频率) {
        this.体格检查_呼吸频率 = 体格检查_呼吸频率;
    }

    public Byte get体格检查_收缩压() {
        return 体格检查_收缩压;
    }

    public void set体格检查_收缩压(Byte 体格检查_收缩压) {
        this.体格检查_收缩压 = 体格检查_收缩压;
    }

    public Byte get体格检查_舒张压() {
        return 体格检查_舒张压;
    }

    public void set体格检查_舒张压(Byte 体格检查_舒张压) {
        this.体格检查_舒张压 = 体格检查_舒张压;
    }

    public Long get体格检查_身高() {
        return 体格检查_身高;
    }

    public void set体格检查_身高(Long 体格检查_身高) {
        this.体格检查_身高 = 体格检查_身高;
    }

    public Long get体格检查_体重() {
        return 体格检查_体重;
    }

    public void set体格检查_体重(Long 体格检查_体重) {
        this.体格检查_体重 = 体格检查_体重;
    }

    public String get体格检查_一般状况检查结果() {
        return 体格检查_一般状况检查结果;
    }

    public void set体格检查_一般状况检查结果(String 体格检查_一般状况检查结果) {
        this.体格检查_一般状况检查结果 = 体格检查_一般状况检查结果;
    }

    public String get体格检查_皮肤和粘膜检查结果() {
        return 体格检查_皮肤和粘膜检查结果;
    }

    public void set体格检查_皮肤和粘膜检查结果(String 体格检查_皮肤和粘膜检查结果) {
        this.体格检查_皮肤和粘膜检查结果 = 体格检查_皮肤和粘膜检查结果;
    }

    public String get体格检查_浅表淋巴结检查结果() {
        return 体格检查_浅表淋巴结检查结果;
    }

    public void set体格检查_浅表淋巴结检查结果(String 体格检查_浅表淋巴结检查结果) {
        this.体格检查_浅表淋巴结检查结果 = 体格检查_浅表淋巴结检查结果;
    }

    public String get体格检查_头部及其器官检查结果() {
        return 体格检查_头部及其器官检查结果;
    }

    public void set体格检查_头部及其器官检查结果(String 体格检查_头部及其器官检查结果) {
        this.体格检查_头部及其器官检查结果 = 体格检查_头部及其器官检查结果;
    }

    public String get体格检查_颈部检查结果() {
        return 体格检查_颈部检查结果;
    }

    public void set体格检查_颈部检查结果(String 体格检查_颈部检查结果) {
        this.体格检查_颈部检查结果 = 体格检查_颈部检查结果;
    }

    public String get体格检查_胸部检查结果() {
        return 体格检查_胸部检查结果;
    }

    public void set体格检查_胸部检查结果(String 体格检查_胸部检查结果) {
        this.体格检查_胸部检查结果 = 体格检查_胸部检查结果;
    }

    public String get体格检查_腹部检查结果() {
        return 体格检查_腹部检查结果;
    }

    public void set体格检查_腹部检查结果(String 体格检查_腹部检查结果) {
        this.体格检查_腹部检查结果 = 体格检查_腹部检查结果;
    }

    public String get体格检查_肛门指诊检查结果描述() {
        return 体格检查_肛门指诊检查结果描述;
    }

    public void set体格检查_肛门指诊检查结果描述(String 体格检查_肛门指诊检查结果描述) {
        this.体格检查_肛门指诊检查结果描述 = 体格检查_肛门指诊检查结果描述;
    }

    public String get体格检查_外生殖器检查结果() {
        return 体格检查_外生殖器检查结果;
    }

    public void set体格检查_外生殖器检查结果(String 体格检查_外生殖器检查结果) {
        this.体格检查_外生殖器检查结果 = 体格检查_外生殖器检查结果;
    }

    public String get体格检查_脊柱检查结果() {
        return 体格检查_脊柱检查结果;
    }

    public void set体格检查_脊柱检查结果(String 体格检查_脊柱检查结果) {
        this.体格检查_脊柱检查结果 = 体格检查_脊柱检查结果;
    }

    public String get体格检查_四肢检查结果() {
        return 体格检查_四肢检查结果;
    }

    public void set体格检查_四肢检查结果(String 体格检查_四肢检查结果) {
        this.体格检查_四肢检查结果 = 体格检查_四肢检查结果;
    }

    public String get体格检查_神经系统检查结果() {
        return 体格检查_神经系统检查结果;
    }

    public void set体格检查_神经系统检查结果(String 体格检查_神经系统检查结果) {
        this.体格检查_神经系统检查结果 = 体格检查_神经系统检查结果;
    }

    public String get专科情况() {
        return 专科情况;
    }

    public void set专科情况(String 专科情况) {
        this.专科情况 = 专科情况;
    }

    public String get辅助检查结果() {
        return 辅助检查结果;
    }

    public void set辅助检查结果(String 辅助检查结果) {
        this.辅助检查结果 = 辅助检查结果;
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

    public String get初步诊断_西医诊断名称() {
        return 初步诊断_西医诊断名称;
    }

    public void set初步诊断_西医诊断名称(String 初步诊断_西医诊断名称) {
        this.初步诊断_西医诊断名称 = 初步诊断_西医诊断名称;
    }

    public String get初步诊断_西医诊断编码() {
        return 初步诊断_西医诊断编码;
    }

    public void set初步诊断_西医诊断编码(String 初步诊断_西医诊断编码) {
        this.初步诊断_西医诊断编码 = 初步诊断_西医诊断编码;
    }

    public String get初步诊断_中医病名名称() {
        return 初步诊断_中医病名名称;
    }

    public void set初步诊断_中医病名名称(String 初步诊断_中医病名名称) {
        this.初步诊断_中医病名名称 = 初步诊断_中医病名名称;
    }

    public String get初步诊断_中医病名代码() {
        return 初步诊断_中医病名代码;
    }

    public void set初步诊断_中医病名代码(String 初步诊断_中医病名代码) {
        this.初步诊断_中医病名代码 = 初步诊断_中医病名代码;
    }

    public String get初步诊断_中医证候名称() {
        return 初步诊断_中医证候名称;
    }

    public void set初步诊断_中医证候名称(String 初步诊断_中医证候名称) {
        this.初步诊断_中医证候名称 = 初步诊断_中医证候名称;
    }

    public String get初步诊断_中医证候代码() {
        return 初步诊断_中医证候代码;
    }

    public void set初步诊断_中医证候代码(String 初步诊断_中医证候代码) {
        this.初步诊断_中医证候代码 = 初步诊断_中医证候代码;
    }

    public String get初步诊断日期() {
        return 初步诊断日期;
    }

    public void set初步诊断日期(String 初步诊断日期) {
        this.初步诊断日期 = 初步诊断日期;
    }

    public String get修正诊断_西医诊断名称() {
        return 修正诊断_西医诊断名称;
    }

    public void set修正诊断_西医诊断名称(String 修正诊断_西医诊断名称) {
        this.修正诊断_西医诊断名称 = 修正诊断_西医诊断名称;
    }

    public String get修正诊断_西医诊断编码() {
        return 修正诊断_西医诊断编码;
    }

    public void set修正诊断_西医诊断编码(String 修正诊断_西医诊断编码) {
        this.修正诊断_西医诊断编码 = 修正诊断_西医诊断编码;
    }

    public String get修正诊断_中医病名名称() {
        return 修正诊断_中医病名名称;
    }

    public void set修正诊断_中医病名名称(String 修正诊断_中医病名名称) {
        this.修正诊断_中医病名名称 = 修正诊断_中医病名名称;
    }

    public String get修正诊断_中医病名代码() {
        return 修正诊断_中医病名代码;
    }

    public void set修正诊断_中医病名代码(String 修正诊断_中医病名代码) {
        this.修正诊断_中医病名代码 = 修正诊断_中医病名代码;
    }

    public String get修正诊断_中医证候名称() {
        return 修正诊断_中医证候名称;
    }

    public void set修正诊断_中医证候名称(String 修正诊断_中医证候名称) {
        this.修正诊断_中医证候名称 = 修正诊断_中医证候名称;
    }

    public String get修正诊断_中医证候代码() {
        return 修正诊断_中医证候代码;
    }

    public void set修正诊断_中医证候代码(String 修正诊断_中医证候代码) {
        this.修正诊断_中医证候代码 = 修正诊断_中医证候代码;
    }

    public String get修正诊断日期() {
        return 修正诊断日期;
    }

    public void set修正诊断日期(String 修正诊断日期) {
        this.修正诊断日期 = 修正诊断日期;
    }

    public String get确定诊断_西医诊断名称() {
        return 确定诊断_西医诊断名称;
    }

    public void set确定诊断_西医诊断名称(String 确定诊断_西医诊断名称) {
        this.确定诊断_西医诊断名称 = 确定诊断_西医诊断名称;
    }

    public String get确定诊断_西医诊断编码() {
        return 确定诊断_西医诊断编码;
    }

    public void set确定诊断_西医诊断编码(String 确定诊断_西医诊断编码) {
        this.确定诊断_西医诊断编码 = 确定诊断_西医诊断编码;
    }

    public String get确定诊断_中医病名名称() {
        return 确定诊断_中医病名名称;
    }

    public void set确定诊断_中医病名名称(String 确定诊断_中医病名名称) {
        this.确定诊断_中医病名名称 = 确定诊断_中医病名名称;
    }

    public String get确定诊断_中医病名代码() {
        return 确定诊断_中医病名代码;
    }

    public void set确定诊断_中医病名代码(String 确定诊断_中医病名代码) {
        this.确定诊断_中医病名代码 = 确定诊断_中医病名代码;
    }

    public String get确定诊断_中医证候名称() {
        return 确定诊断_中医证候名称;
    }

    public void set确定诊断_中医证候名称(String 确定诊断_中医证候名称) {
        this.确定诊断_中医证候名称 = 确定诊断_中医证候名称;
    }

    public String get确定诊断_中医证候代码() {
        return 确定诊断_中医证候代码;
    }

    public void set确定诊断_中医证候代码(String 确定诊断_中医证候代码) {
        this.确定诊断_中医证候代码 = 确定诊断_中医证候代码;
    }

    public String get确定诊断日期() {
        return 确定诊断日期;
    }

    public void set确定诊断日期(String 确定诊断日期) {
        this.确定诊断日期 = 确定诊断日期;
    }

    public String get补充诊断名称() {
        return 补充诊断名称;
    }

    public void set补充诊断名称(String 补充诊断名称) {
        this.补充诊断名称 = 补充诊断名称;
    }

    public String get补充诊断编码() {
        return 补充诊断编码;
    }

    public void set补充诊断编码(String 补充诊断编码) {
        this.补充诊断编码 = 补充诊断编码;
    }

    public String get补充诊断日期() {
        return 补充诊断日期;
    }

    public void set补充诊断日期(String 补充诊断日期) {
        this.补充诊断日期 = 补充诊断日期;
    }

    public String get入院诊断顺位() {
        return 入院诊断顺位;
    }

    public void set入院诊断顺位(String 入院诊断顺位) {
        this.入院诊断顺位 = 入院诊断顺位;
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
