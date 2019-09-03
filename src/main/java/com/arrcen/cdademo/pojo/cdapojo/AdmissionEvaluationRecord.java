package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈入院评估记录〉
 */
@Entity
@Table(name = "PUB08_入院评估记录")
public class AdmissionEvaluationRecord implements Serializable {

    private static final long serialVersionUID = -7512908544130150741L;
    @Id
    private String 系统序号;
    private String 住院号;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 患者姓名;
    private String 性别代码;
    private Byte 年龄岁;
    private String 年龄月;
    private String 国籍代码;
    @Transient
    @JsonIgnore
    private String 国籍;
    private String 民族;
    private String 婚姻状况代码;
    private String 职业类别代码;
    @Transient
    @JsonIgnore
    private String 职业类别;
    private String 学历代码;
    @Transient
    @JsonIgnore
    private String 学历;
    private String 患者电话号码;
    private String 工作单位电话号码;
    private String 患者电子邮件地址;
    private String 联系人姓名;
    private String 联系人电话号码;
    private String 入病房方式;
    private String 入院诊断编码;
    @Transient
    @JsonIgnore
    private String 入院诊断名称;
    private String 入院日期时间;
    private String 主要症状;
    private Long 体重;
    private Long 体温;
    private Byte 呼吸频率;
    private Byte 脉率;
    private Byte 收缩压;
    private Byte 舒张压;
    private String 入院原因;
    private String 入院途径代码;
    @Transient
    @JsonIgnore
    private String 入院途径;
    private Long APGAR评分值;
    private String 饮食情况代码;
    @Transient
    @JsonIgnore
    private String 饮食情况;
    private String 发育程度代码;
    @Transient
    @JsonIgnore
    private String 发育程度;
    private String 精神状态正常标志;
    private String 睡眠状况;
    private String 特殊情况;
    private String 心理状态代码;
    @Transient
    @JsonIgnore
    private String 心理状态;
    private String 营养状态代码;
    @Transient
    @JsonIgnore
    private String 营养状态;
    private String 自理能力代码;
    @Transient
    @JsonIgnore
    private String 自理能力;
    private String 过敏史;
    private String 一般健康状况标志;
    private String 疾病史;
    private String 患者传染性标志;
    private String 传染病史;
    private String 预防接种史;
    private String 手术史;
    private String 输血史;
    private String 家族史;
    private String 护理观察项目名称;
    private String 护理观察结果;
    private String 吸烟标志;
    private Short 停止吸烟天数;
    private String 吸烟状况代码;
    @Transient
    @JsonIgnore
    private String 吸烟状况;
    private Byte 日吸烟量;
    private String 饮酒标志;
    private String 饮酒频率代码;
    @Transient
    @JsonIgnore
    private String 饮酒频率;
    private Byte 日饮酒量;
    private String 通知医师标志;
    private String 通知医师日期时间;
    private String 评估日期时间;
    private String 责任护士签名;
    private String 接诊护士签名;
    private String 签名日期吋间;

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

    public String get国籍代码() {
        return 国籍代码;
    }

    public void set国籍代码(String 国籍代码) {
        this.国籍代码 = 国籍代码;
    }

    public String get国籍() {
        return 国籍;
    }

    public void set国籍(String 国籍) {
        this.国籍 = 国籍;
    }

    public String get民族() {
        return 民族;
    }

    public void set民族(String 民族) {
        this.民族 = 民族;
    }

    public String get婚姻状况代码() {
        return 婚姻状况代码;
    }

    public void set婚姻状况代码(String 婚姻状况代码) {
        this.婚姻状况代码 = 婚姻状况代码;
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

    public String get学历代码() {
        return 学历代码;
    }

    public void set学历代码(String 学历代码) {
        this.学历代码 = 学历代码;
    }

    public String get学历() {
        return 学历;
    }

    public void set学历(String 学历) {
        this.学历 = 学历;
    }

    public String get患者电话号码() {
        return 患者电话号码;
    }

    public void set患者电话号码(String 患者电话号码) {
        this.患者电话号码 = 患者电话号码;
    }

    public String get工作单位电话号码() {
        return 工作单位电话号码;
    }

    public void set工作单位电话号码(String 工作单位电话号码) {
        this.工作单位电话号码 = 工作单位电话号码;
    }

    public String get患者电子邮件地址() {
        return 患者电子邮件地址;
    }

    public void set患者电子邮件地址(String 患者电子邮件地址) {
        this.患者电子邮件地址 = 患者电子邮件地址;
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

    public String get入病房方式() {
        return 入病房方式;
    }

    public void set入病房方式(String 入病房方式) {
        this.入病房方式 = 入病房方式;
    }

    public String get入院诊断编码() {
        return 入院诊断编码;
    }

    public void set入院诊断编码(String 入院诊断编码) {
        this.入院诊断编码 = 入院诊断编码;
    }

    public String get入院诊断名称() {
        return 入院诊断名称;
    }

    public void set入院诊断名称(String 入院诊断名称) {
        this.入院诊断名称 = 入院诊断名称;
    }

    public String get入院日期时间() {
        return 入院日期时间;
    }

    public void set入院日期时间(String 入院日期时间) {
        this.入院日期时间 = 入院日期时间;
    }

    public String get主要症状() {
        return 主要症状;
    }

    public void set主要症状(String 主要症状) {
        this.主要症状 = 主要症状;
    }

    public Long get体重() {
        return 体重;
    }

    public void set体重(Long 体重) {
        this.体重 = 体重;
    }

    public Long get体温() {
        return 体温;
    }

    public void set体温(Long 体温) {
        this.体温 = 体温;
    }

    public Byte get呼吸频率() {
        return 呼吸频率;
    }

    public void set呼吸频率(Byte 呼吸频率) {
        this.呼吸频率 = 呼吸频率;
    }

    public Byte get脉率() {
        return 脉率;
    }

    public void set脉率(Byte 脉率) {
        this.脉率 = 脉率;
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

    public String get入院原因() {
        return 入院原因;
    }

    public void set入院原因(String 入院原因) {
        this.入院原因 = 入院原因;
    }

    public String get入院途径代码() {
        return 入院途径代码;
    }

    public void set入院途径代码(String 入院途径代码) {
        this.入院途径代码 = 入院途径代码;
    }

    public String get入院途径() {
        return 入院途径;
    }

    public void set入院途径(String 入院途径) {
        this.入院途径 = 入院途径;
    }

    public Long getAPGAR评分值() {
        return APGAR评分值;
    }

    public void setAPGAR评分值(Long APGAR评分值) {
        this.APGAR评分值 = APGAR评分值;
    }

    public String get饮食情况代码() {
        return 饮食情况代码;
    }

    public void set饮食情况代码(String 饮食情况代码) {
        this.饮食情况代码 = 饮食情况代码;
    }

    public String get饮食情况() {
        return 饮食情况;
    }

    public void set饮食情况(String 饮食情况) {
        this.饮食情况 = 饮食情况;
    }

    public String get发育程度代码() {
        return 发育程度代码;
    }

    public void set发育程度代码(String 发育程度代码) {
        this.发育程度代码 = 发育程度代码;
    }

    public String get发育程度() {
        return 发育程度;
    }

    public void set发育程度(String 发育程度) {
        this.发育程度 = 发育程度;
    }

    public String get精神状态正常标志() {
        return 精神状态正常标志;
    }

    public void set精神状态正常标志(String 精神状态正常标志) {
        this.精神状态正常标志 = 精神状态正常标志;
    }

    public String get睡眠状况() {
        return 睡眠状况;
    }

    public void set睡眠状况(String 睡眠状况) {
        this.睡眠状况 = 睡眠状况;
    }

    public String get特殊情况() {
        return 特殊情况;
    }

    public void set特殊情况(String 特殊情况) {
        this.特殊情况 = 特殊情况;
    }

    public String get心理状态代码() {
        return 心理状态代码;
    }

    public void set心理状态代码(String 心理状态代码) {
        this.心理状态代码 = 心理状态代码;
    }

    public String get心理状态() {
        return 心理状态;
    }

    public void set心理状态(String 心理状态) {
        this.心理状态 = 心理状态;
    }

    public String get营养状态代码() {
        return 营养状态代码;
    }

    public void set营养状态代码(String 营养状态代码) {
        this.营养状态代码 = 营养状态代码;
    }

    public String get营养状态() {
        return 营养状态;
    }

    public void set营养状态(String 营养状态) {
        this.营养状态 = 营养状态;
    }

    public String get自理能力代码() {
        return 自理能力代码;
    }

    public void set自理能力代码(String 自理能力代码) {
        this.自理能力代码 = 自理能力代码;
    }

    public String get自理能力() {
        return 自理能力;
    }

    public void set自理能力(String 自理能力) {
        this.自理能力 = 自理能力;
    }

    public String get过敏史() {
        return 过敏史;
    }

    public void set过敏史(String 过敏史) {
        this.过敏史 = 过敏史;
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

    public String get家族史() {
        return 家族史;
    }

    public void set家族史(String 家族史) {
        this.家族史 = 家族史;
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

    public String get吸烟标志() {
        return 吸烟标志;
    }

    public void set吸烟标志(String 吸烟标志) {
        this.吸烟标志 = 吸烟标志;
    }

    public Short get停止吸烟天数() {
        return 停止吸烟天数;
    }

    public void set停止吸烟天数(Short 停止吸烟天数) {
        this.停止吸烟天数 = 停止吸烟天数;
    }

    public String get吸烟状况代码() {
        return 吸烟状况代码;
    }

    public void set吸烟状况代码(String 吸烟状况代码) {
        this.吸烟状况代码 = 吸烟状况代码;
    }

    public String get吸烟状况() {
        return 吸烟状况;
    }

    public void set吸烟状况(String 吸烟状况) {
        this.吸烟状况 = 吸烟状况;
    }

    public Byte get日吸烟量() {
        return 日吸烟量;
    }

    public void set日吸烟量(Byte 日吸烟量) {
        this.日吸烟量 = 日吸烟量;
    }

    public String get饮酒标志() {
        return 饮酒标志;
    }

    public void set饮酒标志(String 饮酒标志) {
        this.饮酒标志 = 饮酒标志;
    }

    public String get饮酒频率代码() {
        return 饮酒频率代码;
    }

    public void set饮酒频率代码(String 饮酒频率代码) {
        this.饮酒频率代码 = 饮酒频率代码;
    }

    public String get饮酒频率() {
        return 饮酒频率;
    }

    public void set饮酒频率(String 饮酒频率) {
        this.饮酒频率 = 饮酒频率;
    }

    public Byte get日饮酒量() {
        return 日饮酒量;
    }

    public void set日饮酒量(Byte 日饮酒量) {
        this.日饮酒量 = 日饮酒量;
    }

    public String get通知医师标志() {
        return 通知医师标志;
    }

    public void set通知医师标志(String 通知医师标志) {
        this.通知医师标志 = 通知医师标志;
    }

    public String get通知医师日期时间() {
        return 通知医师日期时间;
    }

    public void set通知医师日期时间(String 通知医师日期时间) {
        this.通知医师日期时间 = 通知医师日期时间;
    }

    public String get评估日期时间() {
        return 评估日期时间;
    }

    public void set评估日期时间(String 评估日期时间) {
        this.评估日期时间 = 评估日期时间;
    }

    public String get责任护士签名() {
        return 责任护士签名;
    }

    public void set责任护士签名(String 责任护士签名) {
        this.责任护士签名 = 责任护士签名;
    }

    public String get接诊护士签名() {
        return 接诊护士签名;
    }

    public void set接诊护士签名(String 接诊护士签名) {
        this.接诊护士签名 = 接诊护士签名;
    }

    public String get签名日期吋间() {
        return 签名日期吋间;
    }

    public void set签名日期吋间(String 签名日期吋间) {
        this.签名日期吋间 = 签名日期吋间;
    }
}
