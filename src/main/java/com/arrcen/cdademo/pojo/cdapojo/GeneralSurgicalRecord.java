package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈一般手术记录〉
 */
@Entity
@Table(name = "PUB05_一般手术记录")
public class GeneralSurgicalRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 门急诊号;
    private String 住院号;
    private String 电子申请单编号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 手术间编号;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private String 术前诊断编码;
    @Transient
    @JsonIgnore
    private String 术前诊断名称;
    private String 术后诊断编码;
    @Transient
    @JsonIgnore
    private String 术后诊断名称;
    private String 手术开始日期时间;
    private String 手术结束日期时间;
    private String 手术及操作编码;
    private String 手术名称;
    private String 手术级别代码;
    @Transient
    @JsonIgnore
    private String 手术级别;
    private String 手术目标部位名称;
    private String 介入物名称;
    private String 手术体位代码;
    @Transient
    @JsonIgnore
    private String 手术体位名称;
    private String 手术过程描述;
    private String 手术史标志;
    private String 皮肤消毒描述;
    private String 手术切口描述;
    private String 引流标志;
    private Short 出血量;
    private Short 输液量;
    private Long 输血量;
    private String 术前用药;
    private String 术中用药;
    private String 引流材料名称;
    private String 引流材料数目;
    private String 放置部位;
    private String 输血反应标志;
    private String 手术者姓名;
    private String ｉ助姓名;
    private String ii助姓名;
    private String 器械护士姓名;
    private String 巡台护士姓名;
    private String 麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 麻醉方法;
    private String 麻醉医师姓名;
    private String 手术者签名;
    private String 签名日期时间;

    public String get术前诊断名称() {
        return 术前诊断名称;
    }

    public void set术前诊断名称(String 术前诊断名称) {
        this.术前诊断名称 = 术前诊断名称;
    }

    public String get术后诊断名称() {
        return 术后诊断名称;
    }

    public void set术后诊断名称(String 术后诊断名称) {
        this.术后诊断名称 = 术后诊断名称;
    }

    public String get手术级别() {
        return 手术级别;
    }

    public void set手术级别(String 手术级别) {
        this.手术级别 = 手术级别;
    }

    public String get手术体位名称() {
        return 手术体位名称;
    }

    public void set手术体位名称(String 手术体位名称) {
        this.手术体位名称 = 手术体位名称;
    }

    public String get麻醉方法() {
        return 麻醉方法;
    }

    public void set麻醉方法(String 麻醉方法) {
        this.麻醉方法 = 麻醉方法;
    }

    public String get系统序号() {
        return 系统序号;
    }

    public void set系统序号(String 系统序号) {
        this.系统序号 = 系统序号;
    }

    public String get门急诊号() {
        return 门急诊号;
    }

    public void set门急诊号(String 门急诊号) {
        this.门急诊号 = 门急诊号;
    }

    public String get住院号() {
        return 住院号;
    }

    public void set住院号(String 住院号) {
        this.住院号 = 住院号;
    }

    public String get电子申请单编号() {
        return 电子申请单编号;
    }

    public void set电子申请单编号(String 电子申请单编号) {
        this.电子申请单编号 = 电子申请单编号;
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

    public String get手术间编号() {
        return 手术间编号;
    }

    public void set手术间编号(String 手术间编号) {
        this.手术间编号 = 手术间编号;
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

    public String get术前诊断编码() {
        return 术前诊断编码;
    }

    public void set术前诊断编码(String 术前诊断编码) {
        this.术前诊断编码 = 术前诊断编码;
    }

    public String get术后诊断编码() {
        return 术后诊断编码;
    }

    public void set术后诊断编码(String 术后诊断编码) {
        this.术后诊断编码 = 术后诊断编码;
    }

    public String get手术开始日期时间() {
        return 手术开始日期时间;
    }

    public void set手术开始日期时间(String 手术开始日期时间) {
        this.手术开始日期时间 = 手术开始日期时间;
    }

    public String get手术结束日期时间() {
        return 手术结束日期时间;
    }

    public void set手术结束日期时间(String 手术结束日期时间) {
        this.手术结束日期时间 = 手术结束日期时间;
    }

    public String get手术及操作编码() {
        return 手术及操作编码;
    }

    public void set手术及操作编码(String 手术及操作编码) {
        this.手术及操作编码 = 手术及操作编码;
    }

    public String get手术名称() {
        return 手术名称;
    }

    public void set手术名称(String 手术名称) {
        this.手术名称 = 手术名称;
    }

    public String get手术级别代码() {
        return 手术级别代码;
    }

    public void set手术级别代码(String 手术级别代码) {
        this.手术级别代码 = 手术级别代码;
    }

    public String get手术目标部位名称() {
        return 手术目标部位名称;
    }

    public void set手术目标部位名称(String 手术目标部位名称) {
        this.手术目标部位名称 = 手术目标部位名称;
    }

    public String get介入物名称() {
        return 介入物名称;
    }

    public void set介入物名称(String 介入物名称) {
        this.介入物名称 = 介入物名称;
    }

    public String get手术体位代码() {
        return 手术体位代码;
    }

    public void set手术体位代码(String 手术体位代码) {
        this.手术体位代码 = 手术体位代码;
    }

    public String get手术过程描述() {
        return 手术过程描述;
    }

    public void set手术过程描述(String 手术过程描述) {
        this.手术过程描述 = 手术过程描述;
    }

    public String get手术史标志() {
        return 手术史标志;
    }

    public void set手术史标志(String 手术史标志) {
        this.手术史标志 = 手术史标志;
    }

    public String get皮肤消毒描述() {
        return 皮肤消毒描述;
    }

    public void set皮肤消毒描述(String 皮肤消毒描述) {
        this.皮肤消毒描述 = 皮肤消毒描述;
    }

    public String get手术切口描述() {
        return 手术切口描述;
    }

    public void set手术切口描述(String 手术切口描述) {
        this.手术切口描述 = 手术切口描述;
    }

    public String get引流标志() {
        return 引流标志;
    }

    public void set引流标志(String 引流标志) {
        this.引流标志 = 引流标志;
    }

    public Short get出血量() {
        return 出血量;
    }

    public void set出血量(Short 出血量) {
        this.出血量 = 出血量;
    }

    public Short get输液量() {
        return 输液量;
    }

    public void set输液量(Short 输液量) {
        this.输液量 = 输液量;
    }

    public Long get输血量() {
        return 输血量;
    }

    public void set输血量(Long 输血量) {
        this.输血量 = 输血量;
    }

    public String get术前用药() {
        return 术前用药;
    }

    public void set术前用药(String 术前用药) {
        this.术前用药 = 术前用药;
    }

    public String get术中用药() {
        return 术中用药;
    }

    public void set术中用药(String 术中用药) {
        this.术中用药 = 术中用药;
    }

    public String get引流材料名称() {
        return 引流材料名称;
    }

    public void set引流材料名称(String 引流材料名称) {
        this.引流材料名称 = 引流材料名称;
    }

    public String get引流材料数目() {
        return 引流材料数目;
    }

    public void set引流材料数目(String 引流材料数目) {
        this.引流材料数目 = 引流材料数目;
    }

    public String get放置部位() {
        return 放置部位;
    }

    public void set放置部位(String 放置部位) {
        this.放置部位 = 放置部位;
    }

    public String get输血反应标志() {
        return 输血反应标志;
    }

    public void set输血反应标志(String 输血反应标志) {
        this.输血反应标志 = 输血反应标志;
    }

    public String get手术者姓名() {
        return 手术者姓名;
    }

    public void set手术者姓名(String 手术者姓名) {
        this.手术者姓名 = 手术者姓名;
    }

    public String getＩ助姓名() {
        return ｉ助姓名;
    }

    public void setＩ助姓名(String ｉ助姓名) {
        this.ｉ助姓名 = ｉ助姓名;
    }

    public String getIi助姓名() {
        return ii助姓名;
    }

    public void setIi助姓名(String ii助姓名) {
        this.ii助姓名 = ii助姓名;
    }

    public String get器械护士姓名() {
        return 器械护士姓名;
    }

    public void set器械护士姓名(String 器械护士姓名) {
        this.器械护士姓名 = 器械护士姓名;
    }

    public String get巡台护士姓名() {
        return 巡台护士姓名;
    }

    public void set巡台护士姓名(String 巡台护士姓名) {
        this.巡台护士姓名 = 巡台护士姓名;
    }

    public String get麻醉方法代码() {
        return 麻醉方法代码;
    }

    public void set麻醉方法代码(String 麻醉方法代码) {
        this.麻醉方法代码 = 麻醉方法代码;
    }

    public String get麻醉医师姓名() {
        return 麻醉医师姓名;
    }

    public void set麻醉医师姓名(String 麻醉医师姓名) {
        this.麻醉医师姓名 = 麻醉医师姓名;
    }

    public String get手术者签名() {
        return 手术者签名;
    }

    public void set手术者签名(String 手术者签名) {
        this.手术者签名 = 手术者签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
