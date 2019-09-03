package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈手术护理记录〉
 */
@Entity
@Table(name = "PUB07_手术护理记录")
public class SurgicalCareRecord implements Serializable {

    private static final long serialVersionUID = -3178262394809624228L;
    @Id
    private String 系统序号;
    private String 门急诊号;
    private String 住院号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 手术间编号;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private Long 体重;
    private String ABO血型代码;
    @Transient
    @JsonIgnore
    private String ABO血型;
    private String RH血型代码;
    @Transient
    @JsonIgnore
    private String RH血型;
    private String 术前诊断编码;
    @Transient
    @JsonIgnore
    private String 术前诊断名称;
    private String 手术及操作编码;
    @Transient
    @JsonIgnore
    private String 手术及操作名称;
    private String 手术者姓名;
    private String 手术目标部位名称;
    private String 手术结束日期时间;
    private String 手术开始日期时间;
    private String 过敏史标志;
    private String 过敏史;
    private String 皮肤检查描述;
    private String 护理等级代码;
    @Transient
    @JsonIgnore
    private String 护理等级;
    private String 护理类型代码;
    @Transient
    @JsonIgnore
    private String 护理类型;
    private String 护理观察项目名称;
    private String 护理观察结果;
    private String 护理操作项目类目名称;
    private String 护理操作名称;
    private String 护理操作结果;
    private String 入手术室日期吋间;
    private String 出手术室日期时间;
    private String 准备事项;
    private String 术中病理标志;
    private String 术中所用物品名称;
    private String 术前清点标志;
    private String 关前核对标志;
    private String 关后核对标志;
    private String 病人交接核对项目;
    private String 巡台护士签名;
    private String 器械护士签名;
    private String 交接护士签名;
    private String 转运者签名;
    private String 交接日期时间;
    private String 签名日期时间;

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

    public Long get体重() {
        return 体重;
    }

    public void set体重(Long 体重) {
        this.体重 = 体重;
    }

    public String getABO血型代码() {
        return ABO血型代码;
    }

    public void setABO血型代码(String ABO血型代码) {
        this.ABO血型代码 = ABO血型代码;
    }

    public String getABO血型() {
        return ABO血型;
    }

    public void setABO血型(String ABO血型) {
        this.ABO血型 = ABO血型;
    }

    public String getRH血型代码() {
        return RH血型代码;
    }

    public void setRH血型代码(String RH血型代码) {
        this.RH血型代码 = RH血型代码;
    }

    public String getRH血型() {
        return RH血型;
    }

    public void setRH血型(String RH血型) {
        this.RH血型 = RH血型;
    }

    public String get术前诊断编码() {
        return 术前诊断编码;
    }

    public void set术前诊断编码(String 术前诊断编码) {
        this.术前诊断编码 = 术前诊断编码;
    }

    public String get术前诊断名称() {
        return 术前诊断名称;
    }

    public void set术前诊断名称(String 术前诊断名称) {
        this.术前诊断名称 = 术前诊断名称;
    }

    public String get手术及操作编码() {
        return 手术及操作编码;
    }

    public void set手术及操作编码(String 手术及操作编码) {
        this.手术及操作编码 = 手术及操作编码;
    }

    public String get手术及操作名称() {
        return 手术及操作名称;
    }

    public void set手术及操作名称(String 手术及操作名称) {
        this.手术及操作名称 = 手术及操作名称;
    }

    public String get手术者姓名() {
        return 手术者姓名;
    }

    public void set手术者姓名(String 手术者姓名) {
        this.手术者姓名 = 手术者姓名;
    }

    public String get手术目标部位名称() {
        return 手术目标部位名称;
    }

    public void set手术目标部位名称(String 手术目标部位名称) {
        this.手术目标部位名称 = 手术目标部位名称;
    }

    public String get手术结束日期时间() {
        return 手术结束日期时间;
    }

    public void set手术结束日期时间(String 手术结束日期时间) {
        this.手术结束日期时间 = 手术结束日期时间;
    }

    public String get手术开始日期时间() {
        return 手术开始日期时间;
    }

    public void set手术开始日期时间(String 手术开始日期时间) {
        this.手术开始日期时间 = 手术开始日期时间;
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

    public String get皮肤检查描述() {
        return 皮肤检查描述;
    }

    public void set皮肤检查描述(String 皮肤检查描述) {
        this.皮肤检查描述 = 皮肤检查描述;
    }

    public String get护理等级代码() {
        return 护理等级代码;
    }

    public void set护理等级代码(String 护理等级代码) {
        this.护理等级代码 = 护理等级代码;
    }

    public String get护理等级() {
        return 护理等级;
    }

    public void set护理等级(String 护理等级) {
        this.护理等级 = 护理等级;
    }

    public String get护理类型代码() {
        return 护理类型代码;
    }

    public void set护理类型代码(String 护理类型代码) {
        this.护理类型代码 = 护理类型代码;
    }

    public String get护理类型() {
        return 护理类型;
    }

    public void set护理类型(String 护理类型) {
        this.护理类型 = 护理类型;
    }

    public String get护理观察项目名称() {
        return 护理观察项目名称;
    }

    public void set护理观察项目名称(String 护理观察项目名称) {
        this.护理观察项目名称 = 护理观察项目名称;
    }

    public String get护理观察结果() {
        return 护理观察结果;
    }

    public void set护理观察结果(String 护理观察结果) {
        this.护理观察结果 = 护理观察结果;
    }

    public String get护理操作项目类目名称() {
        return 护理操作项目类目名称;
    }

    public void set护理操作项目类目名称(String 护理操作项目类目名称) {
        this.护理操作项目类目名称 = 护理操作项目类目名称;
    }

    public String get护理操作名称() {
        return 护理操作名称;
    }

    public void set护理操作名称(String 护理操作名称) {
        this.护理操作名称 = 护理操作名称;
    }

    public String get护理操作结果() {
        return 护理操作结果;
    }

    public void set护理操作结果(String 护理操作结果) {
        this.护理操作结果 = 护理操作结果;
    }

    public String get入手术室日期吋间() {
        return 入手术室日期吋间;
    }

    public void set入手术室日期吋间(String 入手术室日期吋间) {
        this.入手术室日期吋间 = 入手术室日期吋间;
    }

    public String get出手术室日期时间() {
        return 出手术室日期时间;
    }

    public void set出手术室日期时间(String 出手术室日期时间) {
        this.出手术室日期时间 = 出手术室日期时间;
    }

    public String get准备事项() {
        return 准备事项;
    }

    public void set准备事项(String 准备事项) {
        this.准备事项 = 准备事项;
    }

    public String get术中病理标志() {
        return 术中病理标志;
    }

    public void set术中病理标志(String 术中病理标志) {
        this.术中病理标志 = 术中病理标志;
    }

    public String get术中所用物品名称() {
        return 术中所用物品名称;
    }

    public void set术中所用物品名称(String 术中所用物品名称) {
        this.术中所用物品名称 = 术中所用物品名称;
    }

    public String get术前清点标志() {
        return 术前清点标志;
    }

    public void set术前清点标志(String 术前清点标志) {
        this.术前清点标志 = 术前清点标志;
    }

    public String get关前核对标志() {
        return 关前核对标志;
    }

    public void set关前核对标志(String 关前核对标志) {
        this.关前核对标志 = 关前核对标志;
    }

    public String get关后核对标志() {
        return 关后核对标志;
    }

    public void set关后核对标志(String 关后核对标志) {
        this.关后核对标志 = 关后核对标志;
    }

    public String get病人交接核对项目() {
        return 病人交接核对项目;
    }

    public void set病人交接核对项目(String 病人交接核对项目) {
        this.病人交接核对项目 = 病人交接核对项目;
    }

    public String get巡台护士签名() {
        return 巡台护士签名;
    }

    public void set巡台护士签名(String 巡台护士签名) {
        this.巡台护士签名 = 巡台护士签名;
    }

    public String get器械护士签名() {
        return 器械护士签名;
    }

    public void set器械护士签名(String 器械护士签名) {
        this.器械护士签名 = 器械护士签名;
    }

    public String get交接护士签名() {
        return 交接护士签名;
    }

    public void set交接护士签名(String 交接护士签名) {
        this.交接护士签名 = 交接护士签名;
    }

    public String get转运者签名() {
        return 转运者签名;
    }

    public void set转运者签名(String 转运者签名) {
        this.转运者签名 = 转运者签名;
    }

    public String get交接日期时间() {
        return 交接日期时间;
    }

    public void set交接日期时间(String 交接日期时间) {
        this.交接日期时间 = 交接日期时间;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
