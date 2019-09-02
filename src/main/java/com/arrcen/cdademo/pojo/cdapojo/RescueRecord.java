package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈抢救记录〉
 */
@Entity
@Table(name = "PUB13_抢救记录")
public class RescueRecord implements Serializable {

    @Id
    private String 系统序号;
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
    private String 疾病诊断名称;
    private String 疾病诊断编码;
    private String 病情变化情况;
    private String 抢救措施;
    private String 手术及操作编码;
    private String 手术及操作名称;
    private String 手术及操作目标部位名称;
    private String 介人物名称;
    private String 操作方法;
    private Byte 操作次数;
    private String 抢救开始日期时间;
    private String 抢救结束日期时间;
    private String 检查或检验项目名称;
    private String 检査或检验结果;
    private Long 检查或检验定量结果;
    private String 检查或检验结果代码;
    private String 注意事项;
    private String 参加抢救人员名单;//多个人
    private String 专业技术职务类别代码;
    @Transient
    @JsonIgnore
    private String 专业技术职务类别名称;
    private String 医师签名;
    private String 签名日期时间;


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

    public String get疾病诊断名称() {
        return 疾病诊断名称;
    }

    public void set疾病诊断名称(String 疾病诊断名称) {
        this.疾病诊断名称 = 疾病诊断名称;
    }

    public String get疾病诊断编码() {
        return 疾病诊断编码;
    }

    public void set疾病诊断编码(String 疾病诊断编码) {
        this.疾病诊断编码 = 疾病诊断编码;
    }

    public String get病情变化情况() {
        return 病情变化情况;
    }

    public void set病情变化情况(String 病情变化情况) {
        this.病情变化情况 = 病情变化情况;
    }

    public String get抢救措施() {
        return 抢救措施;
    }

    public void set抢救措施(String 抢救措施) {
        this.抢救措施 = 抢救措施;
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

    public String get手术及操作目标部位名称() {
        return 手术及操作目标部位名称;
    }

    public void set手术及操作目标部位名称(String 手术及操作目标部位名称) {
        this.手术及操作目标部位名称 = 手术及操作目标部位名称;
    }

    public String get介人物名称() {
        return 介人物名称;
    }

    public void set介人物名称(String 介人物名称) {
        this.介人物名称 = 介人物名称;
    }

    public String get操作方法() {
        return 操作方法;
    }

    public void set操作方法(String 操作方法) {
        this.操作方法 = 操作方法;
    }

    public Byte get操作次数() {
        return 操作次数;
    }

    public void set操作次数(Byte 操作次数) {
        this.操作次数 = 操作次数;
    }

    public String get抢救开始日期时间() {
        return 抢救开始日期时间;
    }

    public void set抢救开始日期时间(String 抢救开始日期时间) {
        this.抢救开始日期时间 = 抢救开始日期时间;
    }

    public String get抢救结束日期时间() {
        return 抢救结束日期时间;
    }

    public void set抢救结束日期时间(String 抢救结束日期时间) {
        this.抢救结束日期时间 = 抢救结束日期时间;
    }

    public String get检查或检验项目名称() {
        return 检查或检验项目名称;
    }

    public void set检查或检验项目名称(String 检查或检验项目名称) {
        this.检查或检验项目名称 = 检查或检验项目名称;
    }

    public String get检査或检验结果() {
        return 检査或检验结果;
    }

    public void set检査或检验结果(String 检査或检验结果) {
        this.检査或检验结果 = 检査或检验结果;
    }

    public Long get检查或检验定量结果() {
        return 检查或检验定量结果;
    }

    public void set检查或检验定量结果(Long 检查或检验定量结果) {
        this.检查或检验定量结果 = 检查或检验定量结果;
    }

    public String get检查或检验结果代码() {
        return 检查或检验结果代码;
    }

    public void set检查或检验结果代码(String 检查或检验结果代码) {
        this.检查或检验结果代码 = 检查或检验结果代码;
    }

    public String get注意事项() {
        return 注意事项;
    }

    public void set注意事项(String 注意事项) {
        this.注意事项 = 注意事项;
    }

    public String get参加抢救人员名单() {
        return 参加抢救人员名单;
    }

    public void set参加抢救人员名单(String 参加抢救人员名单) {
        this.参加抢救人员名单 = 参加抢救人员名单;
    }

    public String get专业技术职务类别代码() {
        return 专业技术职务类别代码;
    }

    public void set专业技术职务类别代码(String 专业技术职务类别代码) {
        this.专业技术职务类别代码 = 专业技术职务类别代码;
    }

    public String get专业技术职务类别名称() {
        return 专业技术职务类别名称;
    }

    public void set专业技术职务类别名称(String 专业技术职务类别名称) {
        this.专业技术职务类别名称 = 专业技术职务类别名称;
    }

    public String get医师签名() {
        return 医师签名;
    }

    public void set医师签名(String 医师签名) {
        this.医师签名 = 医师签名;
    }

    public String get签名日期时间() {
        return 签名日期时间;
    }

    public void set签名日期时间(String 签名日期时间) {
        this.签名日期时间 = 签名日期时间;
    }
}
