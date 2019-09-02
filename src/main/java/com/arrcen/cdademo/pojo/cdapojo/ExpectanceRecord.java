package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈待产记录〉
 */
@Entity
@Table(name = "PUB06_待产记录")
public class ExpectanceRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 住院号;
    private String 产妇姓名;
    private Byte 年龄岁;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 待产日期时间;
    private Long 孕次;
    private Long 产次;
    private String 末次月经日期;
    private String 受孕形式代码;
    @Transient
    @JsonIgnore
    private String 受孕形式;
    private String 预产期;
    private String 产前检査标志;
    private String 产前检査异常情况;
    private Long 孕前体重;
    private Long 身高;
    private Long 分娩前体重;
    private String 此次妊娠特殊情况;
    private String 既往史;
    private String 手术史;
    private String 既往孕产史;
    private Byte 收缩压;
    private Byte 舒张压;
    private Long 体温;
    private Byte 脉率;
    private Byte 呼吸频率;
    private Long 宫底高度;
    private Long 腹围;
    private Byte 胎心率;
    private String 胎方位代码;
    @Transient
    @JsonIgnore
    private String 胎方位;
    private Long 估计胎儿体重;
    private String 头位难产情况的评估;
    private Long 骶耻外径;
    private Long 坐骨结节间径;
    private String 宫缩情况;
    private String 宫颈情况;
    private String 宫口情况;
    private String 胎膜情况代码;
    @Transient
    @JsonIgnore
    private String 胎膜情况;
    private String 破膜方式代码;
    @Transient
    @JsonIgnore
    private String 破膜方式;
    private String 先露位置;
    private String 羊水情况;
    private String 膀胱充盈标志;
    private String 肠胀气标志;
    private String 检查方式代码;
    @Transient
    @JsonIgnore
    private String 检查方式;
    private String 处置计划;
    private String 计划选取的分娩方式代码;
    @Transient
    @JsonIgnore
    private String 计划选取的分娩方式;
    private String 产程记录日期时间;
    private String 产程经过;
    private String 产程检査者签名;
    private String 记录人员签名;


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

    public String get产妇姓名() {
        return 产妇姓名;
    }

    public void set产妇姓名(String 产妇姓名) {
        this.产妇姓名 = 产妇姓名;
    }

    public Byte get年龄岁() {
        return 年龄岁;
    }

    public void set年龄岁(Byte 年龄岁) {
        this.年龄岁 = 年龄岁;
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

    public String get待产日期时间() {
        return 待产日期时间;
    }

    public void set待产日期时间(String 待产日期时间) {
        this.待产日期时间 = 待产日期时间;
    }

    public Long get孕次() {
        return 孕次;
    }

    public void set孕次(Long 孕次) {
        this.孕次 = 孕次;
    }

    public Long get产次() {
        return 产次;
    }

    public void set产次(Long 产次) {
        this.产次 = 产次;
    }

    public String get末次月经日期() {
        return 末次月经日期;
    }

    public void set末次月经日期(String 末次月经日期) {
        this.末次月经日期 = 末次月经日期;
    }

    public String get受孕形式代码() {
        return 受孕形式代码;
    }

    public void set受孕形式代码(String 受孕形式代码) {
        this.受孕形式代码 = 受孕形式代码;
    }

    public String get受孕形式() {
        return 受孕形式;
    }

    public void set受孕形式(String 受孕形式) {
        this.受孕形式 = 受孕形式;
    }

    public String get预产期() {
        return 预产期;
    }

    public void set预产期(String 预产期) {
        this.预产期 = 预产期;
    }

    public String get产前检査标志() {
        return 产前检査标志;
    }

    public void set产前检査标志(String 产前检査标志) {
        this.产前检査标志 = 产前检査标志;
    }

    public String get产前检査异常情况() {
        return 产前检査异常情况;
    }

    public void set产前检査异常情况(String 产前检査异常情况) {
        this.产前检査异常情况 = 产前检査异常情况;
    }

    public Long get孕前体重() {
        return 孕前体重;
    }

    public void set孕前体重(Long 孕前体重) {
        this.孕前体重 = 孕前体重;
    }

    public Long get身高() {
        return 身高;
    }

    public void set身高(Long 身高) {
        this.身高 = 身高;
    }

    public Long get分娩前体重() {
        return 分娩前体重;
    }

    public void set分娩前体重(Long 分娩前体重) {
        this.分娩前体重 = 分娩前体重;
    }

    public String get此次妊娠特殊情况() {
        return 此次妊娠特殊情况;
    }

    public void set此次妊娠特殊情况(String 此次妊娠特殊情况) {
        this.此次妊娠特殊情况 = 此次妊娠特殊情况;
    }

    public String get既往史() {
        return 既往史;
    }

    public void set既往史(String 既往史) {
        this.既往史 = 既往史;
    }

    public String get手术史() {
        return 手术史;
    }

    public void set手术史(String 手术史) {
        this.手术史 = 手术史;
    }

    public String get既往孕产史() {
        return 既往孕产史;
    }

    public void set既往孕产史(String 既往孕产史) {
        this.既往孕产史 = 既往孕产史;
    }

    public Byte get收缩压() {
        return 收缩压;
    }

    public void set收缩压(Byte 收缩压) {
        this.收缩压 = 收缩压;
    }

    public Byte get舒张压() {
        return 舒张压;
    }

    public void set舒张压(Byte 舒张压) {
        this.舒张压 = 舒张压;
    }

    public Long get体温() {
        return 体温;
    }

    public void set体温(Long 体温) {
        this.体温 = 体温;
    }

    public Byte get脉率() {
        return 脉率;
    }

    public void set脉率(Byte 脉率) {
        this.脉率 = 脉率;
    }

    public Byte get呼吸频率() {
        return 呼吸频率;
    }

    public void set呼吸频率(Byte 呼吸频率) {
        this.呼吸频率 = 呼吸频率;
    }

    public Long get宫底高度() {
        return 宫底高度;
    }

    public void set宫底高度(Long 宫底高度) {
        this.宫底高度 = 宫底高度;
    }

    public Long get腹围() {
        return 腹围;
    }

    public void set腹围(Long 腹围) {
        this.腹围 = 腹围;
    }

    public Byte get胎心率() {
        return 胎心率;
    }

    public void set胎心率(Byte 胎心率) {
        this.胎心率 = 胎心率;
    }

    public String get胎方位代码() {
        return 胎方位代码;
    }

    public void set胎方位代码(String 胎方位代码) {
        this.胎方位代码 = 胎方位代码;
    }

    public String get胎方位() {
        return 胎方位;
    }

    public void set胎方位(String 胎方位) {
        this.胎方位 = 胎方位;
    }

    public Long get估计胎儿体重() {
        return 估计胎儿体重;
    }

    public void set估计胎儿体重(Long 估计胎儿体重) {
        this.估计胎儿体重 = 估计胎儿体重;
    }

    public String get头位难产情况的评估() {
        return 头位难产情况的评估;
    }

    public void set头位难产情况的评估(String 头位难产情况的评估) {
        this.头位难产情况的评估 = 头位难产情况的评估;
    }

    public Long get骶耻外径() {
        return 骶耻外径;
    }

    public void set骶耻外径(Long 骶耻外径) {
        this.骶耻外径 = 骶耻外径;
    }

    public Long get坐骨结节间径() {
        return 坐骨结节间径;
    }

    public void set坐骨结节间径(Long 坐骨结节间径) {
        this.坐骨结节间径 = 坐骨结节间径;
    }

    public String get宫缩情况() {
        return 宫缩情况;
    }

    public void set宫缩情况(String 宫缩情况) {
        this.宫缩情况 = 宫缩情况;
    }

    public String get宫颈情况() {
        return 宫颈情况;
    }

    public void set宫颈情况(String 宫颈情况) {
        this.宫颈情况 = 宫颈情况;
    }

    public String get宫口情况() {
        return 宫口情况;
    }

    public void set宫口情况(String 宫口情况) {
        this.宫口情况 = 宫口情况;
    }

    public String get胎膜情况代码() {
        return 胎膜情况代码;
    }

    public void set胎膜情况代码(String 胎膜情况代码) {
        this.胎膜情况代码 = 胎膜情况代码;
    }

    public String get胎膜情况() {
        return 胎膜情况;
    }

    public void set胎膜情况(String 胎膜情况) {
        this.胎膜情况 = 胎膜情况;
    }

    public String get破膜方式代码() {
        return 破膜方式代码;
    }

    public void set破膜方式代码(String 破膜方式代码) {
        this.破膜方式代码 = 破膜方式代码;
    }

    public String get破膜方式() {
        return 破膜方式;
    }

    public void set破膜方式(String 破膜方式) {
        this.破膜方式 = 破膜方式;
    }

    public String get先露位置() {
        return 先露位置;
    }

    public void set先露位置(String 先露位置) {
        this.先露位置 = 先露位置;
    }

    public String get羊水情况() {
        return 羊水情况;
    }

    public void set羊水情况(String 羊水情况) {
        this.羊水情况 = 羊水情况;
    }

    public String get膀胱充盈标志() {
        return 膀胱充盈标志;
    }

    public void set膀胱充盈标志(String 膀胱充盈标志) {
        this.膀胱充盈标志 = 膀胱充盈标志;
    }

    public String get肠胀气标志() {
        return 肠胀气标志;
    }

    public void set肠胀气标志(String 肠胀气标志) {
        this.肠胀气标志 = 肠胀气标志;
    }

    public String get检查方式代码() {
        return 检查方式代码;
    }

    public void set检查方式代码(String 检查方式代码) {
        this.检查方式代码 = 检查方式代码;
    }

    public String get检查方式() {
        return 检查方式;
    }

    public void set检查方式(String 检查方式) {
        this.检查方式 = 检查方式;
    }

    public String get处置计划() {
        return 处置计划;
    }

    public void set处置计划(String 处置计划) {
        this.处置计划 = 处置计划;
    }

    public String get计划选取的分娩方式代码() {
        return 计划选取的分娩方式代码;
    }

    public void set计划选取的分娩方式代码(String 计划选取的分娩方式代码) {
        this.计划选取的分娩方式代码 = 计划选取的分娩方式代码;
    }

    public String get计划选取的分娩方式() {
        return 计划选取的分娩方式;
    }

    public void set计划选取的分娩方式(String 计划选取的分娩方式) {
        this.计划选取的分娩方式 = 计划选取的分娩方式;
    }

    public String get产程记录日期时间() {
        return 产程记录日期时间;
    }

    public void set产程记录日期时间(String 产程记录日期时间) {
        this.产程记录日期时间 = 产程记录日期时间;
    }

    public String get产程经过() {
        return 产程经过;
    }

    public void set产程经过(String 产程经过) {
        this.产程经过 = 产程经过;
    }

    public String get产程检査者签名() {
        return 产程检査者签名;
    }

    public void set产程检査者签名(String 产程检査者签名) {
        this.产程检査者签名 = 产程检査者签名;
    }

    public String get记录人员签名() {
        return 记录人员签名;
    }

    public void set记录人员签名(String 记录人员签名) {
        this.记录人员签名 = 记录人员签名;
    }
}
